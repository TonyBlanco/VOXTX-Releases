package n7;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBMoviesCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBGenreCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBPersonInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z7.k f45632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45633b;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            h.this.f45632a.b();
            h.this.f45632a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            h.this.f45632a.b();
            if (response.isSuccessful()) {
                h.this.f45632a.C((SearchTMDBMoviesCallback) response.body());
            } else if (response.body() == null) {
                h.this.f45632a.d("Invalid Request");
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            h.this.f45632a.b();
            h.this.f45632a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            h.this.f45632a.b();
            if (response.isSuccessful()) {
                h.this.f45632a.s((TMDBCastsCallback) response.body());
            } else if (response.body() == null) {
                h.this.f45632a.d("Invalid Request");
            }
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            h.this.f45632a.b();
            h.this.f45632a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            h.this.f45632a.b();
            if (response.isSuccessful()) {
                h.this.f45632a.U0((TMDBCastsCallback) response.body());
            } else if (response.body() == null) {
                h.this.f45632a.d("Invalid Request");
            }
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            h.this.f45632a.b();
            h.this.f45632a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            h.this.f45632a.b();
            if (response.isSuccessful()) {
                h.this.f45632a.g0((TMDBGenreCallback) response.body());
            } else if (response.body() == null) {
                h.this.f45632a.d("Invalid Request");
            }
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            h.this.f45632a.b();
            h.this.f45632a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            h.this.f45632a.b();
            if (response.isSuccessful()) {
                h.this.f45632a.X0((TMDBTrailerCallback) response.body());
            } else if (response.body() == null) {
                h.this.f45632a.d("Invalid Request");
            }
        }
    }

    public class f implements Callback {
        public f() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            h.this.f45632a.b();
            h.this.f45632a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            h.this.f45632a.b();
            if (response.isSuccessful()) {
                h.this.f45632a.t((TMDBPersonInfoCallback) response.body());
            } else if (response.body() == null) {
                h.this.f45632a.d("Invalid Request");
            }
        }
    }

    public h(z7.k kVar, Context context) {
        this.f45632a = kVar;
        this.f45633b = context;
    }

    public void b(int i9) {
        this.f45632a.a();
        Retrofit retrofitH0 = w.H0(this.f45633b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getCasts(i9, "f584f73e8848d9ace559deee1e5a849f").enqueue(new b());
        }
    }

    public void c(int i9) {
        this.f45632a.a();
        Retrofit retrofitH0 = w.H0(this.f45633b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getCasts(i9, "f584f73e8848d9ace559deee1e5a849f").enqueue(new c());
        }
    }

    public void d(int i9) {
        this.f45632a.a();
        Retrofit retrofitH0 = w.H0(this.f45633b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getGenre(i9, "f584f73e8848d9ace559deee1e5a849f").enqueue(new d());
        }
    }

    public void e(String str) {
        this.f45632a.a();
        Retrofit retrofitH0 = w.H0(this.f45633b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getMoviesInfo("f584f73e8848d9ace559deee1e5a849f", str).enqueue(new a());
        }
    }

    public void f(String str) {
        this.f45632a.a();
        Retrofit retrofitH0 = w.H0(this.f45633b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getPersonInfo(str, "f584f73e8848d9ace559deee1e5a849f", "images").enqueue(new f());
        }
    }

    public void g(int i9) {
        this.f45632a.a();
        Retrofit retrofitH0 = w.H0(this.f45633b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getTrailer(i9, "f584f73e8848d9ace559deee1e5a849f").enqueue(new e());
        }
    }
}
