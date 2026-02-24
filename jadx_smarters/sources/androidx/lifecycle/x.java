package androidx.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.z;

/* JADX INFO: loaded from: classes.dex */
public class x implements InterfaceC1186p {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final x f15950j = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Handler f15955f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15951a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15952c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15953d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15954e = true;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f15956g = new q(this);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Runnable f15957h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public z.a f15958i = new b();

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            x.this.f();
            x.this.g();
        }
    }

    public class b implements z.a {
        public b() {
        }

        @Override // androidx.lifecycle.z.a
        public void a() {
        }

        @Override // androidx.lifecycle.z.a
        public void onResume() {
            x.this.b();
        }

        @Override // androidx.lifecycle.z.a
        public void onStart() {
            x.this.c();
        }
    }

    public class c extends AbstractC1175e {

        public class a extends AbstractC1175e {
            public a() {
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostResumed(Activity activity) {
                x.this.b();
            }

            @Override // android.app.Application.ActivityLifecycleCallbacks
            public void onActivityPostStarted(Activity activity) {
                x.this.c();
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.AbstractC1175e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
            if (Build.VERSION.SDK_INT < 29) {
                z.f(activity).h(x.this.f15958i);
            }
        }

        @Override // androidx.lifecycle.AbstractC1175e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
            x.this.a();
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(Activity activity, Bundle bundle) {
            activity.registerActivityLifecycleCallbacks(new a());
        }

        @Override // androidx.lifecycle.AbstractC1175e, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
            x.this.d();
        }
    }

    public static InterfaceC1186p h() {
        return f15950j;
    }

    public static void i(Context context) {
        f15950j.e(context);
    }

    public void a() {
        int i9 = this.f15952c - 1;
        this.f15952c = i9;
        if (i9 == 0) {
            this.f15955f.postDelayed(this.f15957h, 700L);
        }
    }

    public void b() {
        int i9 = this.f15952c + 1;
        this.f15952c = i9;
        if (i9 == 1) {
            if (!this.f15953d) {
                this.f15955f.removeCallbacks(this.f15957h);
            } else {
                this.f15956g.h(AbstractC1180j.b.ON_RESUME);
                this.f15953d = false;
            }
        }
    }

    public void c() {
        int i9 = this.f15951a + 1;
        this.f15951a = i9;
        if (i9 == 1 && this.f15954e) {
            this.f15956g.h(AbstractC1180j.b.ON_START);
            this.f15954e = false;
        }
    }

    public void d() {
        this.f15951a--;
        g();
    }

    public void e(Context context) {
        this.f15955f = new Handler();
        this.f15956g.h(AbstractC1180j.b.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new c());
    }

    public void f() {
        if (this.f15952c == 0) {
            this.f15953d = true;
            this.f15956g.h(AbstractC1180j.b.ON_PAUSE);
        }
    }

    public void g() {
        if (this.f15951a == 0 && this.f15953d) {
            this.f15956g.h(AbstractC1180j.b.ON_STOP);
            this.f15954e = true;
        }
    }

    @Override // androidx.lifecycle.InterfaceC1186p
    public AbstractC1180j getLifecycle() {
        return this.f15956g;
    }
}
