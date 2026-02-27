package n7;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import com.nst.iptvsmarterstvbox.model.callback.LoginCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import java.io.IOException;
import java.util.ArrayList;
import m7.AbstractC2237a;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z7.f f45561a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45562b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public SharedPreferences.Editor f45563c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public SharedPreferences f45564d;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45566b;

        public a(String str, String str2) {
            this.f45565a = str;
            this.f45566b = str2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            d.this.f45561a.c(d.this.f45562b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            String string;
            z7.f fVar;
            Resources resources;
            int i9;
            if (response.isSuccessful()) {
                d.this.f45561a.m((LoginCallback) response.body(), "validateLogin");
                return;
            }
            if (response.code() == 404) {
                fVar = d.this.f45561a;
                resources = d.this.f45562b.getResources();
                i9 = a7.j.f13006G2;
            } else {
                if (response.code() == 301 || response.code() == 302) {
                    String strHeader = response.raw().header("Location");
                    string = "ERROR Code 301 || 302: Network error occured! Please try again";
                    if (strHeader != null) {
                        String[] strArrSplit = strHeader.split("/player_api.php");
                        d dVar = d.this;
                        dVar.f45564d = dVar.f45562b.getSharedPreferences("loginPrefsserverurl", 0);
                        d dVar2 = d.this;
                        dVar2.f45563c = dVar2.f45564d.edit();
                        d.this.f45563c.putString(AbstractC2237a.f44454L, strArrSplit[0]);
                        d.this.f45563c.apply();
                        try {
                            d.this.g(this.f45565a, this.f45566b);
                            return;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    fVar = d.this.f45561a;
                    fVar.c(string);
                }
                if (response.body() != null) {
                    return;
                }
                fVar = d.this.f45561a;
                resources = d.this.f45562b.getResources();
                i9 = a7.j.f12966C2;
            }
            string = resources.getString(i9);
            fVar.c(string);
        }
    }

    public class b implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ArrayList f45568a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45569b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f45570c;

        public b(ArrayList arrayList, String str, String str2) {
            this.f45568a = arrayList;
            this.f45569b = str;
            this.f45570c = str2;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            d.this.f45561a.w0(this.f45568a, d.this.f45562b.getResources().getString(a7.j.f13182Y3));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            z7.f fVar;
            ArrayList arrayList;
            Resources resources;
            int i9;
            if (response.isSuccessful()) {
                d.this.f45561a.y((LoginCallback) response.body(), "validateLogin", this.f45568a);
                return;
            }
            if (response.code() == 404) {
                fVar = d.this.f45561a;
                arrayList = this.f45568a;
                resources = d.this.f45562b.getResources();
                i9 = a7.j.f13006G2;
            } else {
                if (response.code() == 301 || response.code() == 302) {
                    String strHeader = response.raw().header("Location");
                    if (strHeader != null) {
                        String[] strArrSplit = strHeader.split("/player_api.php");
                        d dVar = d.this;
                        dVar.f45564d = dVar.f45562b.getSharedPreferences("loginPrefsserverurl", 0);
                        d dVar2 = d.this;
                        dVar2.f45563c = dVar2.f45564d.edit();
                        d.this.f45563c.putString(AbstractC2237a.f44454L, strArrSplit[0]);
                        d.this.f45563c.apply();
                        try {
                            d.this.h(this.f45569b, this.f45570c, this.f45568a);
                            return;
                        } catch (IOException e9) {
                            e9.printStackTrace();
                        }
                    }
                    d.this.f45561a.w0(this.f45568a, "ERROR Code 301 || 302: Network error occured! Please try again");
                    return;
                }
                if (response.body() != null) {
                    return;
                }
                fVar = d.this.f45561a;
                arrayList = this.f45568a;
                resources = d.this.f45562b.getResources();
                i9 = a7.j.f12966C2;
            }
            fVar.w0(arrayList, resources.getString(i9));
        }
    }

    public d(z7.f fVar, Context context) {
        this.f45561a = fVar;
        this.f45562b = context;
    }

    public void g(String str, String str2) {
        Context context;
        Retrofit retrofitB0 = w.B0(this.f45562b);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).validateLogin("application/x-www-form-urlencoded", str, str2).enqueue(new a(str, str2));
        } else {
            if (retrofitB0 != null || (context = this.f45562b) == null) {
                return;
            }
            this.f45561a.e(context.getResources().getString(a7.j.f13355p8));
        }
    }

    public void h(String str, String str2, ArrayList arrayList) {
        Context context;
        Retrofit retrofitB0 = w.B0(this.f45562b);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).validateLogin("application/x-www-form-urlencoded", str, str2).enqueue(new b(arrayList, str, str2));
        } else {
            if (retrofitB0 != null || (context = this.f45562b) == null) {
                return;
            }
            this.f45561a.h0(arrayList, context.getResources().getString(a7.j.f13355p8));
        }
    }
}
