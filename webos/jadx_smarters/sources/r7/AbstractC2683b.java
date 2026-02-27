package r7;

import O2.C0915s;
import O2.G1;
import X2.b;
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

/* JADX INFO: renamed from: r7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2683b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static InterfaceC1224o.a f49782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static InterfaceC1224o.a f49783b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static T2.b f49784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static C3048s f49785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static com.nst.iptvsmarterstvbox.view.demo.a f49786e;

    public static C1257c.C0215c a(InterfaceC1224o.a aVar, InterfaceC1255a interfaceC1255a) {
        return new C1257c.C0215c().i(interfaceC1255a).l(aVar).j(null).k(2);
    }

    public static G1 b(Context context, boolean z9) {
        return new C0915s(context.getApplicationContext()).j(h() ? z9 ? 2 : 1 : 0);
    }

    public static synchronized void c(Context context) {
        if (f49785d == null) {
            f49785d = new C3048s(context, e(context), p1.a(context), g(context), Executors.newFixedThreadPool(6));
            f49786e = new com.nst.iptvsmarterstvbox.view.demo.a(context, g(context), f49785d);
        }
    }

    public static synchronized InterfaceC1224o.a d(Context context) {
        try {
            if (f49782a == null) {
                Context applicationContext = context.getApplicationContext();
                f49782a = a(new w.a(applicationContext, g(applicationContext)), p1.a(applicationContext));
            }
        } catch (Throwable th) {
            throw th;
        }
        return f49782a;
    }

    public static synchronized T2.b e(Context context) {
        try {
            if (f49784c == null) {
                f49784c = new T2.d(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f49784c;
    }

    public static synchronized com.nst.iptvsmarterstvbox.view.demo.a f(Context context) {
        c(context);
        return f49786e;
    }

    public static synchronized InterfaceC1224o.a g(Context context) {
        try {
            if (f49783b == null) {
                CronetEngine cronetEngineA = X2.c.a(context.getApplicationContext());
                if (cronetEngineA != null) {
                    f49783b = new b.C0140b(cronetEngineA, Executors.newSingleThreadExecutor());
                }
                if (f49783b == null) {
                    CookieManager cookieManager = new CookieManager();
                    cookieManager.setCookiePolicy(CookiePolicy.ACCEPT_ORIGINAL_SERVER);
                    CookieHandler.setDefault(cookieManager);
                    f49783b = new x.b();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return f49783b;
    }

    public static boolean h() {
        return true;
    }
}
