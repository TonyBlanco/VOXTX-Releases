package X0;

import android.content.Context;
import c1.InterfaceC1247a;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static i f10390e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public a f10391a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f10392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g f10393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public h f10394d;

    public i(Context context, InterfaceC1247a interfaceC1247a) {
        Context applicationContext = context.getApplicationContext();
        this.f10391a = new a(applicationContext, interfaceC1247a);
        this.f10392b = new b(applicationContext, interfaceC1247a);
        this.f10393c = new g(applicationContext, interfaceC1247a);
        this.f10394d = new h(applicationContext, interfaceC1247a);
    }

    public static synchronized i c(Context context, InterfaceC1247a interfaceC1247a) {
        try {
            if (f10390e == null) {
                f10390e = new i(context, interfaceC1247a);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f10390e;
    }

    public a a() {
        return this.f10391a;
    }

    public b b() {
        return this.f10392b;
    }

    public g d() {
        return this.f10393c;
    }

    public h e() {
        return this.f10394d;
    }
}
