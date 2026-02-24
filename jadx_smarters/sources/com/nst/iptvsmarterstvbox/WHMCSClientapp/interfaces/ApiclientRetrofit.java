package com.nst.iptvsmarterstvbox.WHMCSClientapp.interfaces;

import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* JADX INFO: loaded from: classes.dex */
public class ApiclientRetrofit {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Retrofit f28530a;

    public static Retrofit a() {
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        OkHttpClient okHttpClientBuild = builder.connectTimeout(120L, timeUnit).writeTimeout(120L, timeUnit).readTimeout(120L, timeUnit).followRedirects(false).build();
        Retrofit retrofit = f28530a;
        if (retrofit != null) {
            return retrofit;
        }
        Retrofit retrofitBuild = new Retrofit.Builder().baseUrl("https://cms.alldrama.tv/").addConverterFactory(GsonConverterFactory.create()).client(okHttpClientBuild).build();
        f28530a = retrofitBuild;
        return retrofitBuild;
    }
}
