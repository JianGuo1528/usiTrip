package com.usitrip.utils;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;
import java.util.Objects;

public class GoogleData {
    private static final String API_KEY = "AIzaSyDanv-o8l3PzvEyHzx09U6Yxnlu7DyF2gM";

    private static OkHttpClient client = new OkHttpClient();

    public String getAddressInfo(String url) throws IOException {
        Request request = new Request.Builder().url(url + "&key=" + API_KEY).build();
        Response response = client.newCall(request).execute();
        return Objects.requireNonNull(response.body()).string();
    }
}
