package n7;

import android.content.Context;
import android.util.Log;
import com.google.gson.JsonObject;
import com.nst.iptvsmarterstvbox.model.callback.ActivationCallBack;
import com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import z7.InterfaceC3059a;

/* JADX INFO: renamed from: n7.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2298a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC3059a f45546b;

    /* JADX INFO: renamed from: n7.a$a, reason: collision with other inner class name */
    public class C0395a implements Callback {
        public C0395a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            C2298a c2298a = C2298a.this;
            c2298a.f45546b.S(c2298a.f45545a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (!response.isSuccessful() || response.body() == null) {
                C2298a c2298a = C2298a.this;
                c2298a.f45546b.S(c2298a.f45545a.getResources().getString(a7.j.f13244e7));
                return;
            }
            if (((ActivationCallBack) response.body()).getResult() != null && ((ActivationCallBack) response.body()).getResult().equalsIgnoreCase("success")) {
                if (((ActivationCallBack) response.body()).getLogindetails() != null) {
                    SharepreferenceDBHandler.setUserPassword(((ActivationCallBack) response.body()).getLogindetails().getPassword(), C2298a.this.f45545a);
                    SharepreferenceDBHandler.setUserName(((ActivationCallBack) response.body()).getLogindetails().getUsername(), C2298a.this.f45545a);
                    C2298a.this.f45546b.r0((ActivationCallBack) response.body(), "validateLogin");
                    Log.e("ActivationPresenter", "Respone is successfull");
                } else if (((ActivationCallBack) response.body()).getMessage() != null) {
                    w.P0(C2298a.this.f45545a, ((ActivationCallBack) response.body()).getMessage());
                }
            }
            if (((ActivationCallBack) response.body()).getResult().equalsIgnoreCase("error")) {
                C2298a.this.f45546b.S(((ActivationCallBack) response.body()).getMessage());
                Log.e("ActivationPresenter", "Response is not sucessfull");
            }
        }
    }

    public C2298a(InterfaceC3059a interfaceC3059a, Context context) {
        this.f45545a = context;
        this.f45546b = interfaceC3059a;
    }

    public void a(String str) {
        Retrofit retrofitZ = w.z(this.f45545a);
        if (retrofitZ != null) {
            RetrofitPost retrofitPost = (RetrofitPost) retrofitZ.create(RetrofitPost.class);
            JsonObject jsonObject = new JsonObject();
            jsonObject.addProperty("api_username", "EJzcbx8B4J2mBEa");
            jsonObject.addProperty("api_password", "CutwKMP2fF3er29");
            jsonObject.addProperty("activation_code", str);
            jsonObject.addProperty("mac_address", w.I(this.f45545a));
            retrofitPost.validateAct(jsonObject).enqueue(new C0395a());
        }
    }
}
