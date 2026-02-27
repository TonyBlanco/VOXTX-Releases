package n7;

import android.content.Context;
import android.view.View;
import com.nst.iptvsmarterstvbox.model.callback.StalkerCreatePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerDeletePlayerLinkCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerShortEPGCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z7.j f45614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Call f45616c;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f45617a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f45618b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f45619c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f45620d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f45621e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f45622f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f45623g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ String f45624h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ String f45625i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ int f45626j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final /* synthetic */ String f45627k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f45628l;

        public a(View view, int i9, int i10, String str, String str2, String str3, String str4, String str5, String str6, int i11, String str7, String str8) {
            this.f45617a = view;
            this.f45618b = i9;
            this.f45619c = i10;
            this.f45620d = str;
            this.f45621e = str2;
            this.f45622f = str3;
            this.f45623g = str4;
            this.f45624h = str5;
            this.f45625i = str6;
            this.f45626j = i11;
            this.f45627k = str7;
            this.f45628l = str8;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            g.this.f45614a.M0(g.this.f45615b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                g.this.f45614a.u((StalkerCreatePlayerLinkCallback) response.body(), this.f45617a, this.f45618b, this.f45619c, this.f45620d, this.f45621e, this.f45622f, this.f45623g, this.f45624h, this.f45625i, this.f45626j, this.f45627k, this.f45628l);
            } else {
                g.this.f45614a.M0(g.this.f45615b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class b implements Callback {
        public b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            g.this.f45614a.D0(g.this.f45615b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                g.this.f45614a.T0((StalkerDeletePlayerLinkCallback) response.body());
            } else {
                g.this.f45614a.D0(g.this.f45615b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            g.this.f45614a.P(g.this.f45615b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.isSuccessful()) {
                g.this.f45614a.X((StalkerShortEPGCallback) response.body());
            } else {
                g.this.f45614a.P(g.this.f45615b.getResources().getString(a7.j.f13006G2));
            }
        }
    }

    public g(z7.j jVar, Context context) {
        this.f45614a = jVar;
        this.f45615b = context;
    }

    public void c(String str, String str2, String str3, String str4, View view, String str5, int i9, int i10, String str6, String str7, String str8, String str9, String str10, String str11, int i11, String str12, String str13) {
        Retrofit retrofitG0 = w.G0(this.f45615b);
        if (retrofitG0 != null) {
            ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).createPlayerLinkStalker("mac=" + str, "Bearer " + str2, str5, str3, "create_link", str4).enqueue(new a(view, i9, i10, str6, str7, str8, str9, str10, str11, i11, str12, str13));
        } else if (retrofitG0 == null) {
            Context context = this.f45615b;
            if (context != null) {
                this.f45614a.M0(context.getResources().getString(a7.j.f13355p8));
            }
        }
    }

    public void d(String str, String str2, String str3) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45615b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45615b) == null) {
                return;
            }
            this.f45614a.D0(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        ((RetrofitPost) retrofitG0.create(RetrofitPost.class)).deletePlayerLink("mac=" + str, "Bearer " + str2, "vod", str3, "del_link").enqueue(new b());
    }

    public void e(String str, String str2, String str3) {
        Context context;
        Retrofit retrofitG0 = w.G0(this.f45615b);
        if (retrofitG0 == null) {
            if (retrofitG0 != null || (context = this.f45615b) == null) {
                return;
            }
            this.f45614a.P(context.getResources().getString(a7.j.f13355p8));
            return;
        }
        RetrofitPost retrofitPost = (RetrofitPost) retrofitG0.create(RetrofitPost.class);
        Call call = this.f45616c;
        if (call != null) {
            call.cancel();
        }
        Call<StalkerShortEPGCallback> shortEPGStalker = retrofitPost.getShortEPGStalker("mac=" + str, "Bearer " + str2, "itv", str3, "get_short_epg");
        this.f45616c = shortEPGStalker;
        shortEPGStalker.enqueue(new c());
    }
}
