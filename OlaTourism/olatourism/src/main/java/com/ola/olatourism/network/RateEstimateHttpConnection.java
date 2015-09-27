package com.ola.olatourism.network;

import com.google.android.gms.maps.model.LatLng;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by PrakashNandi on 27/09/15.
 */
public class RateEstimateHttpConnection {

    public static final MediaType JSON
            = MediaType.parse("application/json; charset=utf-8");

    public static String getRateEstimate(LatLng pickUpLatLng, LatLng dropLatLng, String category, String url, String json) {


        OkHttpClient client = new OkHttpClient();

            RequestBody body = RequestBody.create(JSON, json);
            Request request = new Request.Builder()
                    .url(url)
                    .post(body)
                    .build();
            Response response = null;
            try {
                response = client.newCall(request).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return response.body().toString();


    }
}
