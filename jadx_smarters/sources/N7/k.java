package n7;

import android.content.Context;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsEpgCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public z7.e f45650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f45651b;

    public class a implements Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f45652a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f45653b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f45654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f45655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f45656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f45657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f45658g;

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.f45652a = str;
            this.f45653b = str2;
            this.f45654c = str3;
            this.f45655d = str4;
            this.f45656e = str5;
            this.f45657f = str6;
            this.f45658g = str7;
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            k.this.f45650a.b();
            k.this.f45650a.d(th.getMessage());
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            k.this.f45650a.b();
            if (response.isSuccessful()) {
                k.this.f45650a.N((LiveStreamsEpgCallback) response.body(), this.f45652a, this.f45653b, this.f45654c, this.f45655d, this.f45656e, this.f45657f, this.f45658g);
            } else if (response.body() == null) {
                k.this.f45650a.d("Invalid Request");
            }
        }
    }

    public k(z7.e eVar, Context context) {
        this.f45650a = eVar;
        this.f45651b = context;
    }

    public void b(String str, String str2, int i9, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f45650a.a();
        Retrofit retrofitB0 = w.B0(this.f45651b);
        if (retrofitB0 != null) {
            ((RetrofitPost) retrofitB0.create(RetrofitPost.class)).getTVArchive("application/x-www-form-urlencoded", str, str2, "get_simple_data_table", i9).enqueue(new a(str3, str4, str5, str6, str7, str8, str9));
        }
    }
}
