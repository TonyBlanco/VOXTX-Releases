package n7;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.SearchTMDBTVShowsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBCastsCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTVShowsInfoCallback;
import com.nst.iptvsmarterstvbox.model.callback.TMDBTrailerCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z7.l f45640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45641b;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            i.this.f45640a.b();
            i.this.f45640a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            i.this.f45640a.b();
            if (response.isSuccessful()) {
                i.this.f45640a.u0((SearchTMDBTVShowsCallback) response.body());
            } else if (response.body() == null) {
                i.this.f45640a.d("Invalid Request");
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            i.this.f45640a.b();
            i.this.f45640a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            i.this.f45640a.b();
            if (response.isSuccessful()) {
                i.this.f45640a.C0((TMDBTVShowsInfoCallback) response.body());
            } else if (response.body() == null) {
                i.this.f45640a.d("Invalid Request");
            }
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            i.this.f45640a.b();
            i.this.f45640a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            i.this.f45640a.b();
            if (response.isSuccessful()) {
                i.this.f45640a.H0((TMDBTrailerCallback) response.body());
            } else if (response.body() == null) {
                i.this.f45640a.d("Invalid Request");
            }
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            i.this.f45640a.b();
            i.this.f45640a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            i.this.f45640a.b();
            if (response.isSuccessful()) {
                i.this.f45640a.Q((TMDBCastsCallback) response.body());
            } else if (response.body() == null) {
                i.this.f45640a.d("Invalid Request");
            }
        }
    }

    public i(z7.l lVar, Context context) {
        this.f45640a = lVar;
        this.f45641b = context;
    }

    public void b(int i9) {
        this.f45640a.a();
        Retrofit retrofitH0 = w.H0(this.f45641b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getTVShowCasts(i9, "f584f73e8848d9ace559deee1e5a849f").enqueue(new d());
        }
    }

    public void c(int i9) {
        this.f45640a.a();
        Retrofit retrofitH0 = w.H0(this.f45641b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getTVShowsGenreAndDirector(i9, "f584f73e8848d9ace559deee1e5a849f").enqueue(new b());
        }
    }

    public void d(String str) {
        this.f45640a.a();
        Retrofit retrofitH0 = w.H0(this.f45641b);
        if (retrofitH0 != null) {
            try {
                ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getTVShowsInfo("f584f73e8848d9ace559deee1e5a849f", str).enqueue(new a());
            } catch (Exception unused) {
            }
        }
    }

    public void e(int i9) {
        this.f45640a.a();
        Retrofit retrofitH0 = w.H0(this.f45641b);
        if (retrofitH0 != null) {
            ((RetrofitPost) retrofitH0.create(RetrofitPost.class)).getTrailerTVShows(i9, "f584f73e8848d9ace559deee1e5a849f").enqueue(new c());
        }
    }
}
