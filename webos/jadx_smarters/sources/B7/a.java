package B7;

import O2.C0915s;
import O2.G1;
import X2.b;
import a4.C1095i;
import android.content.Context;
import b4.InterfaceC1224o;
import b4.w;
import b4.x;
import c4.C1257c;
import c4.InterfaceC1255a;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.concurrent.Executors;
import org.chromium.net.CronetEngine;
import p7.p1;
import z3.C3048s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC1224o.a f738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC1224o.a f739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static T2.b f740c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C3048s f741d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static C1095i f742e;

    public static C1257c.C0215c a(InterfaceC1224o.a aVar, InterfaceC1255a interfaceC1255a) {
        return new C1257c.C0215c().i(interfaceC1255a).l(aVar).j(null).k(2);
    }

    public static G1 b(Context context, boolean z9) {
        return new C0915s(context.getApplicationContext()).j(i() ? z9 ? 2 : 1 : 0);
    }

    public static synchronized void c(Context context) {
        if (f741d == null) {
            C3048s c3048s = new C3048s(context, e(context), p1.a(context), h(context), Executors.newFixedThreadPool(6));
            f741d = c3048s;
            c3048s.y(1);
        }
    }

    public static synchronized InterfaceC1224o.a d(Context context) {
        try {
            if (f738a == null) {
                Context applicationContext = context.getApplicationContext();
                f738a = a(new w.a(applicationContext, h(applicationContext)), p1.a(applicationContext));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f738a;
    }

    public static synchronized T2.b e(Context context) {
        try {
            if (f740c == null) {
                f740c = new T2.c(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f740c;
    }

    public static synchronized C3048s f(Context context) {
        c(context);
        return f741d;
    }

    public static synchronized C1095i g(Context context) {
        try {
            if (f742e == null) {
                f742e = new C1095i(context, "downChannel");
            }
        } catch (Throwable th) {
            throw th;
        }
        return f742e;
    }

    public static synchronized InterfaceC1224o.a h(Context context) {
        try {
            if (f739b == null) {
                CronetEngine cronetEngineB = X2.c.b(context.getApplicationContext(), "IPTVSmartersPlayer", true);
                if (cronetEngineB != null) {
                    f739b = new b.C0140b(cronetEngineB, Executors.newSingleThreadExecutor());
                }
                if (f739b == null) {
                    CookieManager cookieManager = new CookieManager();
                    cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
                    CookieHandler.setDefault(cookieManager);
                    f739b = new x.b();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f739b;
    }

    public static boolean i() {
        return true;
    }
}
