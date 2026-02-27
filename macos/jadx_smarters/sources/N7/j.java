package n7;

import android.content.Context;
import com.google.gson.JsonElement;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import z7.m;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public m f45647b;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            j.this.f45647b.b();
            j.this.f45647b.d(th.getMessage());
            j.this.f45647b.a0(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null) {
                j.this.f45647b.R((JsonElement) response.body());
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            j.this.f45647b.b();
            j.this.f45647b.d(th.getMessage());
            j.this.f45647b.a0(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null) {
                j.this.f45647b.I0((JsonElement) response.body());
            }
        }
    }

    public j(Context context, m mVar) {
        this.f45646a = context;
        this.f45647b = mVar;
    }

    public void b(String str, String str2, String str3) {
        Retrofit retrofitB0 = w.B0(this.f45646a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).seasonsEpisode("application/x-www-form-urlencoded", str, str2, "get_series_info", str3).enqueue(new b());
        }
    }

    public void c(String str, String str2) {
        Retrofit retrofitB0 = w.B0(this.f45646a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).seasonsEpisodeOneStream("application/x-www-form-urlencoded", str, str2).enqueue(new a());
        }
    }
}
