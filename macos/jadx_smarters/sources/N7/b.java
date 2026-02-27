package n7;

import android.content.Context;
import android.util.Log;
import b7.AbstractC1232b;
import com.nst.iptvsmarterstvbox.model.callback.BillingAddOrderCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingCheckGPACallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingGetDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingIsPurchasedCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingLoginClientCallback;
import com.nst.iptvsmarterstvbox.model.callback.BillingUpdateDevicesCallback;
import com.nst.iptvsmarterstvbox.model.callback.RegisterClientCallback;
import com.nst.iptvsmarterstvbox.model.webrequest.RetrofitPost;
import m7.w;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f45548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z7.d f45549b;

    public class a implements Callback {
        public a() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() == null || !response.isSuccessful()) {
                b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
            } else {
                b.this.f45549b.B0((RegisterClientCallback) response.body());
            }
        }
    }

    /* JADX INFO: renamed from: n7.b$b, reason: collision with other inner class name */
    public class C0396b implements Callback {
        public C0396b() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() == null || !response.isSuccessful()) {
                b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
            } else {
                b.this.f45549b.L0((BillingLoginClientCallback) response.body());
            }
        }
    }

    public class c implements Callback {
        public c() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() == null || !response.isSuccessful()) {
                b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
            } else {
                b.this.f45549b.J((BillingIsPurchasedCallback) response.body());
            }
        }
    }

    public class d implements Callback {
        public d() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() == null || !response.isSuccessful()) {
                b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
            } else {
                b.this.f45549b.q0((BillingAddOrderCallback) response.body());
            }
        }
    }

    public class e implements Callback {
        public e() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() == null || !response.isSuccessful()) {
                b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
            } else {
                b.this.f45549b.m0((BillingCheckGPACallback) response.body());
            }
        }
    }

    public class f implements Callback {
        public f() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() == null || !response.isSuccessful()) {
                b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
            } else {
                b.this.f45549b.g((BillingGetDevicesCallback) response.body());
            }
        }
    }

    public class g implements Callback {
        public g() {
        }

        @Override // retrofit2.Callback
        public void onFailure(Call call, Throwable th) {
            Log.e("honey", "onFailure: ");
            b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
        }

        @Override // retrofit2.Callback
        public void onResponse(Call call, Response response) {
            if (response.body() == null || !response.isSuccessful()) {
                b.this.f45549b.d(b.this.f45548a.getResources().getString(a7.j.f13244e7));
            } else {
                b.this.f45549b.N0((BillingUpdateDevicesCallback) response.body());
            }
        }
    }

    public b(Context context, z7.d dVar) {
        this.f45548a = context;
        this.f45549b = dVar;
    }

    public void c(String str, String str2, String str3, String str4, String str5, int i9, String str6, String str7) {
        this.f45549b.a();
        Retrofit retrofitC0 = w.C0(this.f45548a);
        if (retrofitC0 != null) {
            ((RetrofitPost) retrofitC0.create(RetrofitPost.class)).addOrder("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", AbstractC1232b.f17695b, str4, str2, "addorder", str3, i9, str6, str7, "").enqueue(new d());
        }
    }

    public void d(String str, String str2) {
        Retrofit retrofitC0 = w.C0(this.f45548a);
        if (retrofitC0 != null) {
            ((RetrofitPost) retrofitC0.create(RetrofitPost.class)).checkGPA("Vu6HilnbLo63", str2, str, "T6Vk3rLFQBeu3n6s", AbstractC1232b.f17695b, "checkgpa").enqueue(new e());
        }
    }

    public void e(String str, String str2, String str3, String str4, String str5, int i9, String str6, String str7) {
        this.f45549b.a();
        Retrofit retrofitC0 = w.C0(this.f45548a);
        if (retrofitC0 != null) {
            ((RetrofitPost) retrofitC0.create(RetrofitPost.class)).isPurchasedCheck("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", AbstractC1232b.f17695b, str4, str2, "checkorder", str3, i9, str6, str7).enqueue(new c());
        }
    }

    public void f(String str, String str2, String str3, int i9) {
        this.f45549b.a();
        Retrofit retrofitC0 = w.C0(this.f45548a);
        if (retrofitC0 != null) {
            ((RetrofitPost) retrofitC0.create(RetrofitPost.class)).getDevices("Vu6HilnbLo63", str, str3, "T6Vk3rLFQBeu3n6s", AbstractC1232b.f17695b, str2, i9, "alldevices").enqueue(new f());
        }
    }

    public void g(String str, String str2, String str3, String str4, String str5) {
        this.f45549b.a();
        Retrofit retrofitC0 = w.C0(this.f45548a);
        if (retrofitC0 != null) {
            ((RetrofitPost) retrofitC0.create(RetrofitPost.class)).loginClient("Vu6HilnbLo63", str, str5, "T6Vk3rLFQBeu3n6s", AbstractC1232b.f17695b, str4, str2, "login", str3).enqueue(new C0396b());
        }
    }

    public void h(String str, String str2, String str3, String str4, String str5) {
        this.f45549b.a();
        Retrofit retrofitC0 = w.C0(this.f45548a);
        if (retrofitC0 != null) {
            ((RetrofitPost) retrofitC0.create(RetrofitPost.class)).registerClient(str, str5, "Vu6HilnbLo63", AbstractC1232b.f17695b, str2, "T6Vk3rLFQBeu3n6s", "register", str3, str4).enqueue(new a());
        }
    }

    public void i(String str, String str2, int i9, String str3, String str4, String str5) {
        this.f45549b.a();
        Retrofit retrofitC0 = w.C0(this.f45548a);
        if (retrofitC0 != null) {
            ((RetrofitPost) retrofitC0.create(RetrofitPost.class)).updateDevice("Vu6HilnbLo63", str, str2, "T6Vk3rLFQBeu3n6s", AbstractC1232b.f17695b, i9, "updatedevice", str3, str4, str5).enqueue(new g());
        }
    }
}
