package D3;

import B3.C0512u;
import O2.C0936z0;
import android.net.Uri;
import b4.C1227s;
import b4.G;
import b4.InterfaceC1224o;
import b4.P;
import d4.AbstractC1684a;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f implements G.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f1376a = C0512u.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1227s f1377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f1378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0936z0 f1379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f1381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f1382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f1383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final P f1384j;

    public f(InterfaceC1224o interfaceC1224o, C1227s c1227s, int i9, C0936z0 c0936z0, int i10, Object obj, long j9, long j10) {
        this.f1384j = new P(interfaceC1224o);
        this.f1377c = (C1227s) AbstractC1684a.e(c1227s);
        this.f1378d = i9;
        this.f1379e = c0936z0;
        this.f1380f = i10;
        this.f1381g = obj;
        this.f1382h = j9;
        this.f1383i = j10;
    }

    public final long b() {
        return this.f1384j.j();
    }

    public final long d() {
        return this.f1383i - this.f1382h;
    }

    public final Map e() {
        return this.f1384j.u();
    }

    public final Uri f() {
        return this.f1384j.t();
    }
}
