package b4;

import B3.C0512u;
import android.net.Uri;
import b4.C1227s;
import b4.G;
import d4.AbstractC1684a;
import d4.k0;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class I implements G.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f17518a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1227s f17519c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f17520d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P f17521e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f17522f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Object f17523g;

    public interface a {
        Object a(Uri uri, InputStream inputStream);
    }

    public I(InterfaceC1224o interfaceC1224o, Uri uri, int i9, a aVar) {
        this(interfaceC1224o, new C1227s.b().i(uri).b(1).a(), i9, aVar);
    }

    public I(InterfaceC1224o interfaceC1224o, C1227s c1227s, int i9, a aVar) {
        this.f17521e = new P(interfaceC1224o);
        this.f17519c = c1227s;
        this.f17520d = i9;
        this.f17522f = aVar;
        this.f17518a = C0512u.a();
    }

    public static Object g(InterfaceC1224o interfaceC1224o, a aVar, C1227s c1227s, int i9) {
        I i10 = new I(interfaceC1224o, c1227s, i9, aVar);
        i10.a();
        return AbstractC1684a.e(i10.e());
    }

    @Override // b4.G.e
    public final void a() {
        this.f17521e.v();
        C1226q c1226q = new C1226q(this.f17521e, this.f17519c);
        try {
            c1226q.c();
            this.f17523g = this.f17522f.a((Uri) AbstractC1684a.e(this.f17521e.getUri()), c1226q);
        } finally {
            k0.o(c1226q);
        }
    }

    public long b() {
        return this.f17521e.j();
    }

    @Override // b4.G.e
    public final void c() {
    }

    public Map d() {
        return this.f17521e.u();
    }

    public final Object e() {
        return this.f17523g;
    }

    public Uri f() {
        return this.f17521e.t();
    }
}
