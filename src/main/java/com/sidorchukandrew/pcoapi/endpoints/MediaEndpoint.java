package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.*;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public class MediaEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer mediaId;

    public MediaEndpoint(Config config, Integer mediaId) {
        super(config, "https://api.planningcenteronline.com/services/v2/media/" + mediaId);
        this.mediaId = mediaId;
    }

    public AssociatedAttachmentEndpoint attachment(Integer attachmentId) {
        return new AssociatedAttachmentEndpoint(config, ENDPOINT_URL, attachmentId);
    }

    public AssociatedAttachmentsEndpoint attachments() {
        return new AssociatedAttachmentsEndpoint(config, ENDPOINT_URL);
    }

    public AssociatedMediaSchedulesEndpoint mediaSchedules() {
        return new AssociatedMediaSchedulesEndpoint(config, ENDPOINT_URL);
    }

    public AssociatedMediaScheduleEndpoint mediaSchedule(Integer mediaScheduleId) {
        return new AssociatedMediaScheduleEndpoint(config, ENDPOINT_URL, mediaScheduleId);
    }

    public AssociatedTagsEndpoint tags() {
        return new AssociatedTagsEndpoint(config, ENDPOINT_URL);
    }

    public AssociatedTagEndpoint tag(Integer tagId) {
        return new AssociatedTagEndpoint(config, ENDPOINT_URL, tagId);
    }

    @Override
    public Media get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Media media = objectMapper.readValue(response, Media.class);

        return media;
    }

    public Media get(MediaRequestOptions requestOptions) throws IOException {
        String response = http.get(ENDPOINT_URL, requestOptions);
        Media media = objectMapper.readValue(response, Media.class);

        return media;
    }

    public Media update(UpdateMediaRequest updateRequest) throws IOException {
        String json = objectMapper.writeValueAsString(updateRequest.toResource());
        String response = http.patch(ENDPOINT_URL, json);

        Media updatedMedia = objectMapper.readValue(response, Media.class);
        return updatedMedia;
    }

    public void delete() throws IOException {
        http.delete(ENDPOINT_URL);
    }

    public void archive() throws IOException {
        String response = http.post(ENDPOINT_URL + "/archive", "{}");
    }

    public void archive(LocalDateTime archiveDate) throws IOException {
        MediaArchiveData data = new MediaArchiveData.Builder()
                .type("MediaArchive")
                .time(archiveDate)
                .build();

        MediaArchive mediaArchive = new MediaArchive(data);

        String json = objectMapper.writeValueAsString(mediaArchive);
        http.post(ENDPOINT_URL + "/archive", json);
    }

    public void unarchive() throws IOException {
        String response = http.post(ENDPOINT_URL + "/unarchive", "{}");
    }

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
}
