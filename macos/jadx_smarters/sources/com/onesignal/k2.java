package com.onesignal;

import android.content.Context;
import android.os.Bundle;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class k2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f38756c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static AtomicLong f38757d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static AtomicLong f38758e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Q0 f38759f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f38760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38761b;

    public k2(Context context) {
        this.f38761b = context;
    }

    public static boolean a() {
        try {
            f38756c = FirebaseAnalytics.class;
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Method d(Class cls) {
        try {
            return cls.getMethod("getInstance", Context.class);
        } catch (NoSuchMethodException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public static Method e(Class cls) {
        try {
            return cls.getMethod("logEvent", String.class, Bundle.class);
        } catch (NoSuchMethodException e9) {
            e9.printStackTrace();
            return null;
        }
    }

    public final String b(Q0 q02) {
        if (q02.j().isEmpty() || q02.i().isEmpty()) {
            return q02.k() != null ? q02.k().substring(0, Math.min(10, q02.k().length())) : "";
        }
        return q02.j() + " - " + q02.i();
    }

    public final Object c(Context context) {
        if (this.f38760a == null) {
            try {
                this.f38760a = d(f38756c).invoke(null, context);
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        return this.f38760a;
    }

    public void f() {
        if (f38757d == null || f38759f == null) {
            return;
        }
        long jA = F1.v0().a();
        if (jA - f38757d.get() > 120000) {
            return;
        }
        AtomicLong atomicLong = f38758e;
        if (atomicLong == null || jA - atomicLong.get() >= 30000) {
            try {
                Object objC = c(this.f38761b);
                Method methodE = e(f38756c);
                Bundle bundle = new Bundle();
                bundle.putString("source", "OneSignal");
                bundle.putString("medium", TransferService.INTENT_KEY_NOTIFICATION);
                bundle.putString("notification_id", f38759f.g());
                bundle.putString("campaign", b(f38759f));
                methodE.invoke(objC, "os_notification_influence_open", bundle);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void g(Z0 z02) {
        if (f38758e == null) {
            f38758e = new AtomicLong();
        }
        f38758e.set(F1.v0().a());
        try {
            Object objC = c(this.f38761b);
            Method methodE = e(f38756c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", TransferService.INTENT_KEY_NOTIFICATION);
            bundle.putString("notification_id", z02.d().g());
            bundle.putString("campaign", b(z02.d()));
            methodE.invoke(objC, "os_notification_opened", bundle);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void h(Z0 z02) {
        try {
            Object objC = c(this.f38761b);
            Method methodE = e(f38756c);
            Bundle bundle = new Bundle();
            bundle.putString("source", "OneSignal");
            bundle.putString("medium", TransferService.INTENT_KEY_NOTIFICATION);
            bundle.putString("notification_id", z02.d().g());
            bundle.putString("campaign", b(z02.d()));
            methodE.invoke(objC, "os_notification_received", bundle);
            if (f38757d == null) {
                f38757d = new AtomicLong();
            }
            f38757d.set(F1.v0().a());
            f38759f = z02.d();
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
