package n7;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.VodInfoCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import z7.n;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n f45660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45661b;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            l.this.f45660a.b();
            l.this.f45660a.d(th.getMessage());
            l.this.f45660a.E0(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            l.this.f45660a.b();
            if (response.isSuccessful()) {
                l.this.f45660a.K((VodInfoCallback) response.body());
            } else if (response.body() == null) {
                l.this.f45660a.d("Invalid Request");
            }
        }
    }

    public l(n nVar, Context context) {
        this.f45660a = nVar;
        this.f45661b = context;
    }

    public void b(String str, String str2, int i9) {
        this.f45660a.a();
        Retrofit retrofitB0 = w.B0(this.f45661b);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).vodInfo("application/x-www-form-urlencoded", str, str2, "get_vod_info", i9).enqueue(new a());
        }
    }
}
