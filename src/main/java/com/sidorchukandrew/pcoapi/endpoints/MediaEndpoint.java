package com.sidorchukandrew.pcoapi.endpoints;

import com.sidorchukandrew.pcoapi.models.Config;
import com.sidorchukandrew.pcoapi.models.Media;
import com.sidorchukandrew.pcoapi.models.UpdateMediaRequest;

import java.io.IOException;
import java.time.LocalDateTime;

public class MediaEndpoint extends Endpoint implements ResourceEndpoint {

    private Integer mediaId;
    public MediaEndpoint(Config config, Integer mediaId) {
        super(config, "https://api.planningcenteronline.com/services/v2/media/" + mediaId);
        this.mediaId = mediaId;
    }

    @Override
    public Media get() throws IOException {
        String response = http.get(ENDPOINT_URL);
        Media media = objectMapper.readValue(response, Media.class);

        return media;
    }

    public Media update(UpdateMediaRequest updateRequest) throws IOException {
        String json = objectMapper.writeValueAsString(updateRequest.toResource());
        String response = http.update(ENDPOINT_URL, json);

        Media updatedMedia = objectMapper.readValue(response, Media.class);
        return updatedMedia;
    }

    public void delete() throws IOException {
        http.delete(ENDPOINT_URL);
    }

    public void archive() throws IOException {
        String response = http.post(ENDPOINT_URL + "/archive", "");
        System.out.println(response);
    }

    public void archive(LocalDateTime archiveDate) {

    }
}
