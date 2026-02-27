package com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter;

import android.content.Context;
import android.util.Log;
import b7.AbstractC1232b;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.SbpCombinedResponse.SbpCombinedResponse;
import com.nst.iptvsmarterstvbox.model.callback.storage.GetStorageAccessCallback;
import com.nst.iptvsmarterstvbox.model.callback.storage.UpdateStorageAccessCallback;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.MobileCodeActiveCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeGenerateCallBack;
import com.nst.iptvsmarterstvbox.model.callback.tvcode.TVCodeVerifyCallBack;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AddDeviceFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.AdsLastUpdateResponseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.getAnnouncementsFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationcallBack.readAnnouncementFirebaseCallback;
import com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationinterface.FirebaseInterface;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class FirebasePresenter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f28838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public FirebaseInterface f28839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public OnAnnouncementReceived f28840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OnFirebaseTokenListener f28841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public OnTvCodeProcessListener f28842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public OnCombinedListener f28843f;

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter$10, reason: invalid class name */
    class AnonymousClass10 implements Callback<GetStorageAccessCallback> {
        @Override // retrofit2.Callback
        public void onFailure(Call<GetStorageAccessCallback> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<GetStorageAccessCallback> call, Response<GetStorageAccessCallback> response) {
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter$5, reason: invalid class name */
    class AnonymousClass5 implements Callback<AdsLastUpdateResponseCallback> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FirebasePresenter f28850a;

        @Override // retrofit2.Callback
        public void onFailure(Call<AdsLastUpdateResponseCallback> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<AdsLastUpdateResponseCallback> call, Response<AdsLastUpdateResponseCallback> response) {
            if (response.isSuccessful()) {
                this.f28850a.f28839b.h(response.body());
            }
        }
    }

    /* JADX INFO: renamed from: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter$9, reason: invalid class name */
    class AnonymousClass9 implements Callback<UpdateStorageAccessCallback> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f28854a;

        @Override // retrofit2.Callback
        public void onFailure(Call<UpdateStorageAccessCallback> call, Throwable th) {
        }

        @Override // retrofit2.Callback
        public void onResponse(Call<UpdateStorageAccessCallback> call, Response<UpdateStorageAccessCallback> response) {
            if (response == null || !response.isSuccessful()) {
                return;
            }
            SharepreferenceDBHandler.setStorageAccessToServer(this.f28854a, true);
        }
    }

    public interface OnAnnouncementReceived {
        void a(getAnnouncementsFirebaseCallback getannouncementsfirebasecallback);

        void b();
    }

    public interface OnCombinedListener {
        void a();

        void b(Response response);
    }

    public interface OnFirebaseTokenListener {
        void a(AddDeviceFirebaseCallback addDeviceFirebaseCallback);
    }

    public interface OnTvCodeProcessListener {
        void O0(TVCodeVerifyCallBack tVCodeVerifyCallBack);

        void S0(MobileCodeActiveCallBack mobileCodeActiveCallBack);

        void W0();

        void n0();

        void t0();

        void x(TVCodeGenerateCallBack tVCodeGenerateCallBack);
    }

    public FirebasePresenter(Context context, FirebaseInterface firebaseInterface) {
        this.f28838a = context;
        this.f28839b = firebaseInterface;
    }

    public FirebasePresenter(Context context, OnAnnouncementReceived onAnnouncementReceived) {
        this.f28838a = context;
        this.f28840c = onAnnouncementReceived;
    }

    public FirebasePresenter(Context context, OnCombinedListener onCombinedListener) {
        this.f28843f = onCombinedListener;
        this.f28838a = context;
    }

    public FirebasePresenter(Context context, OnFirebaseTokenListener onFirebaseTokenListener) {
        this.f28841d = onFirebaseTokenListener;
        this.f28838a = context;
    }

    public FirebasePresenter(Context context, OnTvCodeProcessListener onTvCodeProcessListener) {
        this.f28842e = onTvCodeProcessListener;
        this.f28838a = context;
    }

    public void g(String str, String str2, String str3, String str4, final String str5, String str6, boolean z9) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str3);
            jsonObject.addProperty("sc", str4);
            jsonObject.addProperty("action", z9 ? "add-device" : "remove-device");
            jsonObject.addProperty("deviceid", str5);
            jsonObject.addProperty("deviceusername", str6);
            retrofitPost.addDeviceFirebase(jsonObject).enqueue(new Callback<AddDeviceFirebaseCallback>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.1
                @Override // retrofit2.Callback
                public void onFailure(Call<AddDeviceFirebaseCallback> call, Throwable th) {
                    if (th == null || th.getMessage() == null) {
                        return;
                    }
                    Log.e("jaskirat", "onFailure token not added" + th.getMessage());
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<AddDeviceFirebaseCallback> call, Response<AddDeviceFirebaseCallback> response) {
                    Log.e("honey", "onSuccess token added: ");
                    if (response.body() == null || !response.isSuccessful()) {
                        return;
                    }
                    SharepreferenceDBHandler.setFirebaseToken(str5, FirebasePresenter.this.f28838a);
                    if (FirebasePresenter.this.f28841d != null) {
                        FirebasePresenter.this.f28841d.a(response.body());
                    }
                }
            });
        }
    }

    public void h(String str, String str2, String str3, String str4, String str5, String str6) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str3);
            jsonObject.addProperty("sc", str4);
            jsonObject.addProperty("action", "read-announcement");
            jsonObject.addProperty("deviceid", str5);
            jsonObject.addProperty("announcement_id", str6);
            retrofitPost.readAnnouncementFirebase(jsonObject).enqueue(new Callback<readAnnouncementFirebaseCallback>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.3
                @Override // retrofit2.Callback
                public void onFailure(Call<readAnnouncementFirebaseCallback> call, Throwable th) {
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<readAnnouncementFirebaseCallback> call, Response<readAnnouncementFirebaseCallback> response) {
                    if (response.body() == null || !response.isSuccessful()) {
                        return;
                    }
                    FirebasePresenter.this.f28839b.k0(response.body());
                }
            });
        }
    }

    public void i(String str, String str2, String str3, String str4, String str5) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str3);
            jsonObject.addProperty("sc", str4);
            jsonObject.addProperty("action", "get-announcements");
            jsonObject.addProperty("deviceid", str5);
            retrofitPost.getAnnouncementsFirebase(jsonObject).enqueue(new Callback<getAnnouncementsFirebaseCallback>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.2
                @Override // retrofit2.Callback
                public void onFailure(Call<getAnnouncementsFirebaseCallback> call, Throwable th) {
                    Log.e("TAG", "onFailure");
                    if (FirebasePresenter.this.f28840c != null) {
                        FirebasePresenter.this.f28840c.b();
                    }
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<getAnnouncementsFirebaseCallback> call, Response<getAnnouncementsFirebaseCallback> response) {
                    if (response.body() == null || !response.isSuccessful()) {
                        return;
                    }
                    if (FirebasePresenter.this.f28839b != null) {
                        FirebasePresenter.this.f28839b.Q0(response.body());
                    }
                    if (FirebasePresenter.this.f28840c != null) {
                        FirebasePresenter.this.f28840c.a(response.body());
                    }
                }
            });
        }
    }

    public void j(String str, String str2, String str3, String str4) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str3);
            jsonObject.addProperty("sc", str4);
            jsonObject.addProperty("action", "get-ovpnzip");
            retrofitPost.getFirebaseVPNUrl(jsonObject).enqueue(new Callback<JsonElement>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.4
                @Override // retrofit2.Callback
                public void onFailure(Call<JsonElement> call, Throwable th) {
                    w.X();
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<JsonElement> call, Response<JsonElement> response) {
                    if (response.body() != null && response.isSuccessful()) {
                        FirebasePresenter.this.f28839b.z(response.body());
                    }
                    w.X();
                }
            });
        }
    }

    public void k(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, int i9, String str12, String str13) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str3);
            jsonObject.addProperty("sc", str4);
            jsonObject.addProperty("action", "activatecodemobile");
            jsonObject.addProperty("code", str5);
            jsonObject.addProperty(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, w.d0(str6));
            jsonObject.addProperty(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, w.d0(str7));
            jsonObject.addProperty("anyname", w.d0(str8));
            jsonObject.addProperty("dns", w.d0(str9));
            jsonObject.addProperty("type", str10);
            jsonObject.addProperty("m3ulink", w.d0(str11));
            jsonObject.addProperty("billingId", w.d0(String.valueOf(i9)));
            jsonObject.addProperty("billingUser", w.d0(str12));
            jsonObject.addProperty("billingPass", w.d0(str13));
            retrofitPost.mobileCodeActivate(jsonObject).enqueue(new Callback<MobileCodeActiveCallBack>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.7
                @Override // retrofit2.Callback
                public void onFailure(Call<MobileCodeActiveCallBack> call, Throwable th) {
                    if (FirebasePresenter.this.f28842e != null) {
                        FirebasePresenter.this.f28842e.n0();
                    }
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<MobileCodeActiveCallBack> call, Response<MobileCodeActiveCallBack> response) {
                    if (response.body() == null || !response.isSuccessful()) {
                        if (FirebasePresenter.this.f28842e != null) {
                            FirebasePresenter.this.f28842e.n0();
                        }
                    } else if (FirebasePresenter.this.f28842e != null) {
                        FirebasePresenter.this.f28842e.S0(response.body());
                    }
                }
            });
        }
    }

    public void l(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", str3);
            jsonObject.addProperty("d", str4);
            jsonObject.addProperty("sc", str5);
            jsonObject.addProperty("action", "get-publisheddata");
            jsonObject.addProperty("deviceid", str7);
            ((RetrofitPost) retrofitF0.create(RetrofitPost.class)).SbpCombinedRequest(jsonObject).enqueue(new Callback<SbpCombinedResponse>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.11
                @Override // retrofit2.Callback
                public void onFailure(Call<SbpCombinedResponse> call, Throwable th) {
                    if (th != null && th.getMessage() != null) {
                        Log.e("jaskirat", "panelLastPublishApi failed 1" + th.getMessage());
                        Log.e("jaskirat", "panelLastPublishApi failed 2 " + th.getLocalizedMessage());
                        Log.e("jaskirat", "panelLastPublishApi failed 3 " + th.toString());
                    }
                    if (FirebasePresenter.this.f28843f != null) {
                        FirebasePresenter.this.f28843f.a();
                    }
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<SbpCombinedResponse> call, Response<SbpCombinedResponse> response) {
                    Log.e("jaskirat", "panelLastPublishApi success");
                    if (!response.isSuccessful() || FirebasePresenter.this.f28843f == null) {
                        return;
                    }
                    FirebasePresenter.this.f28843f.b(response);
                }
            });
        }
    }

    public void m(String str, String str2, String str3, String str4, String str5, String str6) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", AbstractC1232b.f17695b);
            jsonObject.addProperty("d", str3);
            jsonObject.addProperty("sc", str4);
            jsonObject.addProperty("action", "registercodetv");
            jsonObject.addProperty("device_id", str5);
            jsonObject.addProperty("code", str6);
            retrofitPost.tvCodeGenerate(jsonObject).enqueue(new Callback<TVCodeGenerateCallBack>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.6
                @Override // retrofit2.Callback
                public void onFailure(Call<TVCodeGenerateCallBack> call, Throwable th) {
                    if (FirebasePresenter.this.f28842e != null) {
                        FirebasePresenter.this.f28842e.t0();
                    }
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<TVCodeGenerateCallBack> call, Response<TVCodeGenerateCallBack> response) {
                    if (response.body() == null || !response.isSuccessful()) {
                        if (FirebasePresenter.this.f28842e != null) {
                            FirebasePresenter.this.f28842e.t0();
                        }
                    } else if (FirebasePresenter.this.f28842e != null) {
                        FirebasePresenter.this.f28842e.x(response.body());
                    }
                }
            });
        }
    }

    public void n(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        Retrofit retrofitF0 = w.F0(this.f28838a);
        if (retrofitF0 != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitF0.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("a", str);
            jsonObject.addProperty("s", str2);
            jsonObject.addProperty("r", str7);
            jsonObject.addProperty("d", str3);
            jsonObject.addProperty("sc", str4);
            jsonObject.addProperty("action", "verifycodetv");
            jsonObject.addProperty("code", str6);
            jsonObject.addProperty("device_id", str5);
            retrofitPost.tvCodeVerify(jsonObject).enqueue(new Callback<TVCodeVerifyCallBack>() { // from class: com.nst.iptvsmarterstvbox.sbpfunction.pushnotificationpresenter.FirebasePresenter.8
                @Override // retrofit2.Callback
                public void onFailure(Call<TVCodeVerifyCallBack> call, Throwable th) {
                    AbstractC2237a.f44528o1 = true;
                    if (FirebasePresenter.this.f28842e != null) {
                        FirebasePresenter.this.f28842e.W0();
                    }
                }

                @Override // retrofit2.Callback
                public void onResponse(Call<TVCodeVerifyCallBack> call, Response<TVCodeVerifyCallBack> response) {
                    AbstractC2237a.f44528o1 = true;
                    if (response.body() == null || !response.isSuccessful()) {
                        if (FirebasePresenter.this.f28842e != null) {
                            FirebasePresenter.this.f28842e.W0();
                        }
                    } else if (FirebasePresenter.this.f28842e != null) {
                        FirebasePresenter.this.f28842e.O0(response.body());
                    }
                }
            });
        }
    }
}
