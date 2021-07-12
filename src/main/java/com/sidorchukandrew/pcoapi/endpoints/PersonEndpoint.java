package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class PersonEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer personId;

    public PersonEndpoint(Config config, Integer personId) {
        super(config, "https://api.planningcenteronline.com/services/v2/people/" + personId);
    }


    // ASSOCIATIONS
    public AssociatedAvailableSignupsEndpoint availableSignups() {
        return new AssociatedAvailableSignupsEndpoint(config, ENDPOINT_URL);
    }

    public AssociatedAvailableSignupEndpoint availableSignup(Integer availableSignupId) {
        return new AssociatedAvailableSignupEndpoint(config, ENDPOINT_URL, availableSignupId);
    }


    @Override
    public Person get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Person person = objectMapper.readValue(response, Person.class);

        return person;
    }

    public Person update(UpdatePersonRequest updateRequest) throws IOException {
        String json = objectMapper.writeValueAsString(updateRequest.toResource());
        String response = http.patch(ENDPOINT_URL, json);


        Person updatedPerson = objectMapper.readValue(response, Person.class);
        return updatedPerson;
    }

    // ACTIONS
    public void assignTags(List<Integer> tagIds) throws IOException {
        List<RelationshipData> tagsData = tagIds.stream().map(tagId ->
                new RelationshipData.Builder()
                        .id(tagId)
                        .type("Tag")
                        .build()
        ).collect(Collectors.toList());

        RelationshipList tags = new RelationshipList(tagsData);
        TagAssignmentRelationships tagAssignmentRelationships = new TagAssignmentRelationships(tags);

        TagAssignmentData tagAssignmentData = new TagAssignmentData.Builder()
                .relationships(tagAssignmentRelationships)
                .build();

        TagAssignment tagAssignment = new TagAssignment(tagAssignmentData);

        String json = objectMapper.writeValueAsString(tagAssignment);
        http.post(ENDPOINT_URL + "/assign_tags", json);
    }

    public void collapseServiceTypes(List<Integer> serviceTypeIds) throws IOException {
        List<RelationshipData> relationshipDataList = serviceTypeIds.stream().map(serviceTypeId -> {
            RelationshipData data = new RelationshipData.Builder()
                    .id(serviceTypeId)
                    .type("ServiceType")
                    .build();

            return data;
        }).collect(Collectors.toList());

        RelationshipList relationshipList = new RelationshipList(relationshipDataList);
        CollapseServiceTypesRelationships relationships = new CollapseServiceTypesRelationships(relationshipList);

        CollapseServiceTypesData data = new CollapseServiceTypesData.Builder()
                .relationships(relationships)
                .type("CollapseServiceTypes")
                .build();

        CollapseServiceTypes collapseServiceTypes = new CollapseServiceTypes(data);

        String json = objectMapper.writeValueAsString(collapseServiceTypes);
        http.post(ENDPOINT_URL + "/collapse_service_type", json);
    }

    public void expandServiceTypes(List<Integer> serviceTypeIds) throws IOException {
        List<RelationshipData> relationshipDataList = serviceTypeIds.stream().map(serviceTypeId -> {
            RelationshipData data = new RelationshipData.Builder()
                    .id(serviceTypeId)
                    .type("ServiceType")
                    .build();

            return data;
        }).collect(Collectors.toList());

        RelationshipList relationshipList = new RelationshipList(relationshipDataList);
        CollapseServiceTypesRelationships relationships = new CollapseServiceTypesRelationships(relationshipList);

        CollapseServiceTypesData data = new CollapseServiceTypesData.Builder()
                .relationships(relationships)
                .type("ExpandServiceTypes")
                .build();

        CollapseServiceTypes collapseServiceTypes = new CollapseServiceTypes(data);

        String json = objectMapper.writeValueAsString(collapseServiceTypes);
        http.post(ENDPOINT_URL + "/expand_service_type", json);
    }
}
