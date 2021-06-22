package com.sidorchukandrew.pcoapi.apis;

import com.sidorchukandrew.pcoapi.endpoints.*;
import com.sidorchukandrew.pcoapi.models.Config;

public class ServicesApi {
    private Config config;
    private SongsEndpoint songsEndpoint;

    public ServicesApi(Config config) {
        this.config = config;
    }

    public SongsEndpoint songs() {
        return new SongsEndpoint(config);
    }

    public SongEndpoint song(int songId) {
        return new SongEndpoint(config, songId);
    }
}
