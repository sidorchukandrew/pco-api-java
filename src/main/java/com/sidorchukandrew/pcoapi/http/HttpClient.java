package com.sidorchukandrew.pcoapi.http;

import com.sidorchukandrew.pcoapi.models.RequestOptions;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.IOException;
import java.util.Map;

public class HttpClient {
    private final OkHttpClient client;
    public HttpClient(String applicationId, String secret) {
        client = new OkHttpClient.Builder()
                .authenticator(new Authenticator() {
                    @Nullable
                    @Override
                    public Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException {
                        String credential = Credentials.basic(applicationId, secret);
                        return response.request().newBuilder().header("Authorization", credential).build();
                    }
                })
                .build();
    }

    public HttpClient(String accessToken) {
        client = new OkHttpClient.Builder()
                .authenticator(new Authenticator() {
                    @Nullable
                    @Override
                    public Request authenticate(@Nullable Route route, @NotNull Response response) throws IOException {
                        return response.request().newBuilder().header("Authorization", "Bearer " + accessToken).build();
                    }
                })
                .build();
    }

    public String get(String url) throws IOException {
        Request request = new Request.Builder()
                .get()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String get(String url, RequestOptions requestOptions) throws IOException {
        Map<String, String> optionsMap = requestOptions.getOptions();
        HttpUrl.Builder httpUrlBuilder = HttpUrl.parse(url).newBuilder();
        for(Map.Entry<String, String> option : optionsMap.entrySet()) {
            httpUrlBuilder.addQueryParameter(option.getKey(), option.getValue());
        }

        HttpUrl httpUrl = httpUrlBuilder.build();

        Request request = new Request.Builder()
                .url(httpUrl)
                .get()
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String post(String url, String json) throws IOException {
        Request request = new Request.Builder()
                .post(RequestBody.create(json, MediaType.parse("application/json")))
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String delete(String url) throws IOException {
        Request request = new Request.Builder()
                .delete()
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }

    public String patch(String url, String json) throws IOException {
        Request request = new Request.Builder()
                .patch(RequestBody.create(json, MediaType.parse("application/json")))
                .url(url)
                .build();

        try (Response response = client.newCall(request).execute()) {
            return response.body().string();
        }
    }
}
