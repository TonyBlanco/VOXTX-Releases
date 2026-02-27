package n7;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import java.util.List;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z7.i f45607b;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            f.this.f45607b.A("Failed");
            f.this.f45607b.b();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null && response.isSuccessful()) {
                f.this.f45607b.n((List) response.body());
            } else if (response.body() == null) {
                f.this.f45607b.A("Failed");
                f.this.f45607b.b();
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            f.this.f45607b.l("Failed");
            f.this.f45607b.b();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null && response.isSuccessful()) {
                f.this.f45607b.l0((List) response.body());
            } else if (response.body() == null) {
                f.this.f45607b.l("Failed");
                f.this.f45607b.b();
            }
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            f.this.f45607b.Y("Failed");
            f.this.f45607b.b();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null && response.isSuccessful()) {
                f.this.f45607b.J0((List) response.body());
            } else if (response.body() == null) {
                f.this.f45607b.Y("Failed");
                f.this.f45607b.b();
            }
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            f.this.f45607b.p0("Failed");
            f.this.f45607b.b();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null && response.isSuccessful()) {
                f.this.f45607b.L((List) response.body());
            } else if (response.body() == null) {
                f.this.f45607b.p0("Failed");
                f.this.f45607b.b();
            }
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            f.this.f45607b.i0("Failed");
            f.this.f45607b.b();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null && response.isSuccessful()) {
                f.this.f45607b.T((List) response.body());
            } else if (response.body() == null) {
                f.this.f45607b.i0("Failed");
                f.this.f45607b.b();
            }
        }
    }

    /* JADX INFO: renamed from: n7.f$f, reason: collision with other inner class name */
    public class C0398f implements Callback {
        public C0398f() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            f.this.f45607b.A0("Failed");
            f.this.f45607b.b();
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() != null && response.isSuccessful()) {
                f.this.f45607b.B((List) response.body());
            } else if (response.body() == null) {
                f.this.f45607b.A0("Failed");
                f.this.f45607b.b();
            }
        }
    }

    public f(Context context, z7.i iVar) {
        this.f45606a = context;
        this.f45607b = iVar;
    }

    public void b(String str, String str2) {
        Retrofit retrofitB0 = w.B0(this.f45606a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).liveStreamCategories("application/x-www-form-urlencoded", str, str2, "get_live_categories").enqueue(new a());
        }
    }

    public void c(String str, String str2) {
        Retrofit retrofitB0 = w.B0(this.f45606a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).liveStreams("application/x-www-form-urlencoded", str, str2, "get_live_streams").enqueue(new d());
        }
    }

    public void d(String str, String str2) {
        Retrofit retrofitB0 = w.B0(this.f45606a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).allSeriesStreams("application/x-www-form-urlencoded", str, str2, "get_series").enqueue(new C0398f());
        }
    }

    public void e(String str, String str2) {
        Retrofit retrofitB0 = w.B0(this.f45606a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).seriesCategories("application/x-www-form-urlencoded", str, str2, "get_series_categories").enqueue(new c());
        }
    }

    public void f(String str, String str2) {
        Retrofit retrofitB0 = w.B0(this.f45606a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).vodCategories("application/x-www-form-urlencoded", str, str2, "get_vod_categories").enqueue(new b());
        }
    }

    public void g(String str, String str2) {
        Retrofit retrofitB0 = w.B0(this.f45606a);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).allVODStreams("application/x-www-form-urlencoded", str, str2, "get_vod_streams").enqueue(new e());
        }
    }
}
