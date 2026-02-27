package n7;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAdCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetAllChannelsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVODByCatCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerLiveFavIdsCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerProfilesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerSetLiveFavCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerTokenCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import q7.C2635t;
import q7.Z;
import q7.m0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z7.g f45572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45573b;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.q((StalkerGetVODByCatCallback) response.body());
            } else {
                e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0.x f45575a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45576b;

        public b(m0.x xVar, int i9) {
            this.f45575a = xVar;
            this.f45576b = i9;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.o0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.V0((StalkerSetLiveFavCallback) response.body(), this.f45575a, this.f45576b);
            } else {
                e.this.f45572a.o0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class c implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ m0.x f45578a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45579b;

        public c(m0.x xVar, int i9) {
            this.f45578a = xVar;
            this.f45579b = i9;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.y0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.I(this.f45578a, this.f45579b);
            } else {
                e.this.f45572a.y0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.q((StalkerGetVODByCatCallback) response.body());
            } else {
                e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    /* JADX INFO: renamed from: n7.e$e, reason: collision with other inner class name */
    public class C0397e implements Callback {
        public C0397e() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.q((StalkerGetVODByCatCallback) response.body());
            } else {
                e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class f implements Callback {
        public f() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.q((StalkerGetVODByCatCallback) response.body());
            } else {
                e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class g implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z.E f45584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45585b;

        public g(Z.E e9, int i9) {
            this.f45584a = e9;
            this.f45585b = i9;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.o0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.G((StalkerSetLiveFavCallback) response.body(), this.f45584a, this.f45585b);
            } else {
                e.this.f45572a.o0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class h implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Z.E f45587a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45588b;

        public h(Z.E e9, int i9) {
            this.f45587a = e9;
            this.f45588b = i9;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.y0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.O(this.f45587a, this.f45588b);
            } else {
                e.this.f45572a.y0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class i implements Callback {
        public i() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.q((StalkerGetVODByCatCallback) response.body());
            } else {
                e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class j implements Callback {
        public j() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.q((StalkerGetVODByCatCallback) response.body());
            } else {
                e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class k implements Callback {
        public k() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.G0((StalkerTokenCallback) response.body());
            } else {
                e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class l implements Callback {
        public l() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.q((StalkerGetVODByCatCallback) response.body());
            } else {
                e.this.f45572a.e0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class m implements Callback {
        public m() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.V((StalkerProfilesCallback) response.body());
            } else {
                e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class n implements Callback {
        public n() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.f0((StalkerGetGenresCallback) response.body());
            } else {
                e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class o implements Callback {
        public o() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.i((StalkerGetAllChannelsCallback) response.body());
            } else {
                e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class p implements Callback {
        public p() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.j((StalkerGetVodCategoriesCallback) response.body());
            } else {
                e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class q implements Callback {
        public q() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.F((StalkerGetSeriesCategoriesCallback) response.body());
            } else {
                e.this.f45572a.c(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class r implements Callback {
        public r() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.H(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.U((StalkerLiveFavIdsCallback) response.body());
            } else {
                e.this.f45572a.H(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class s implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2635t.o f45600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45601b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f45602c;

        public s(C2635t.o oVar, String str, String str2) {
            this.f45600a = oVar;
            this.f45601b = str;
            this.f45602c = str2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.P0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.d0((StalkerSetLiveFavCallback) response.body(), this.f45600a, this.f45601b, this.f45602c);
            } else {
                e.this.f45572a.P0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class t implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f45604a;

        public t(int i9) {
            this.f45604a = i9;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            e.this.f45572a.v0(e.this.f45573b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                e.this.f45572a.M((StalkerGetAdCallback) response.body(), this.f45604a);
            } else {
                e.this.f45572a.v0(e.this.f45573b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public e(z7.g gVar, Context context) {
        this.f45572a = gVar;
        this.f45573b = context;
    }

    public void c(String str, String str2, C2635t.o oVar, String str3, String str4, String str5) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.P0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).addLiveFavStalker("mac=" + str, "Bearer " + str2, "itv", "set_fav", str3).enqueue(new s(oVar, str4, str5));
    }

    public void d(String str, String str2, Z.E e9, String str3, int i9) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.o0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).addVODFavStalker("mac=" + str, "Bearer " + str2, "series", "set_fav", str3).enqueue(new g(e9, i9));
    }

    public void e(String str, String str2, m0.x xVar, String str3, int i9) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.o0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).addVODFavStalker("mac=" + str, "Bearer " + str2, "vod", "set_fav", str3).enqueue(new b(xVar, i9));
    }

    public void f(String str, String str2, int i9) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.v0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getAdStalker("mac=" + str, "Bearer " + str2, "stb", "get_ad").enqueue(new t(i9));
    }

    public void g(String str, String str2) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getAllChannelsStalker("mac=" + str, "Bearer " + str2, "itv", "get_all_channels").enqueue(new o());
    }

    public void h(String str, String str2) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getGenresStalker("mac=" + str, "Bearer " + str2, "itv", "get_genres").enqueue(new n());
    }

    public void i(String str, String str2) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.H(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getLiveFavIdsStalker("mac=" + str, "Bearer " + str2, "itv", "get_fav_ids").enqueue(new r());
    }

    public void j(String str, String str2, String str3, String str4, String str5) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getSeasonsStalker("mac=" + str, "Bearer " + str2, "series", str3, str4, "get_ordered_list", str5).enqueue(new l());
    }

    public void k(String str, String str2, String str3, String str4) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getVODByCatIDStalker("mac=" + str, "Bearer " + str2, "series", str3, str4, "get_ordered_list").enqueue(new f());
    }

    public void l(String str, String str2) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getSeriesCategoriesStalker("mac=" + str, "Bearer " + str2, "series", "get_categories").enqueue(new q());
    }

    public void m(String str, String str2, String str3) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getVODFavStalker("mac=" + str, "Bearer " + str2, "series", "get_ordered_list", "1", str3).enqueue(new i());
    }

    public void n(String str, String str2, String str3, String str4) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getVODByCatIDStalker("mac=" + str, "Bearer " + str2, "vod", str3, str4, "get_ordered_list").enqueue(new a());
    }

    public void o(String str, String str2, String str3) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getVODFavStalker("mac=" + str, "Bearer " + str2, "vod", "get_ordered_list", "1", str3).enqueue(new d());
    }

    public void p(String str, String str2) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).getVodCategoriesStalker("mac=" + str, "Bearer " + str2, "vod", "get_categories").enqueue(new p());
    }

    public void q(String str, String str2) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).validateLoginProfilesStalker("mac=" + str, "Bearer " + str2, "stb", "get_profile").enqueue(new m());
    }

    public void r(String str, String str2, Z.E e9, String str3, int i9) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.y0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).removeVODFavStalker("mac=" + str, "Bearer " + str2, "series", "del_fav", str3).enqueue(new h(e9, i9));
    }

    public void s(String str, String str2, m0.x xVar, String str3, int i9) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.y0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).removeVODFavStalker("mac=" + str, "Bearer " + str2, "vod", "del_fav", str3).enqueue(new c(xVar, i9));
    }

    public void t(String str, String str2, String str3, String str4, String str5, String str6) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).searchVODStalker("mac=" + str, "Bearer " + str2, "series", "get_ordered_list", str3, str4, str5, str6).enqueue(new j());
    }

    public void u(String str, String str2, String str3, String str4, String str5, String str6) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).searchVODStalker("mac=" + str, "Bearer " + str2, "vod", "get_ordered_list", str3, str4, str5, str6).enqueue(new C0397e());
    }

    public void v(String str) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45573b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45573b) == null) {
                return;
            }
            this.f45572a.e(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).validateLoginAccessTokenStalker("mac=" + str, "stb", "handshake").enqueue(new k());
    }
}
