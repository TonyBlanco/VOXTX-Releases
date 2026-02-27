package com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter;

import android.content.Context;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import com.nst.iptvsmarterstvbox.sbpfunction.adsdatacallback.AdsDataResponse;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.AdsInterface;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class AddSpeedPresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AdsInterface f28836b;

    public AddSpeedPresenter(Context context, AdsInterface adsInterface) {
        this.f28835a = context;
        this.f28836b = adsInterface;
    }

    public void b(String str, String str2, String str3, String str4, String str5, String str6) {
        Retrofit retrofitQ = w.Q(this.f28835a);
        if (retrofitQ != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", str3);
            jsonObject.addProperty("d", str4);
            jsonObject.addProperty("sc", str5);
            jsonObject.addProperty("action", str6);
            ((RetrofitPost) retrofitQ.create(RetrofitPost.class)).getAdsDataFromPanelApi(jsonObject).enqueue(new Callback<AdsDataResponse>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.AddSpeedPresenter.1
                @Override // retrofit2.Callback
                public void onFailure(Call<AdsDataResponse> call, Throwable th) {
                    if (AddSpeedPresenter.this.f28836b != null) {
                        AddSpeedPresenter.this.f28836b.b("Something went Wrong !");
                    }
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<AdsDataResponse> call, Response<AdsDataResponse> response) {
                    if (!response.isSuccessful() || AddSpeedPresenter.this.f28836b == null) {
                        return;
                    }
                    AddSpeedPresenter.this.f28836b.a(response.body());
                }
            });
        }
    }
}
