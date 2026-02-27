package h2;

import U1.l;
import d2.C1653c;
import d2.C1662l;
import d2.o;
import java.io.IOException;
import java.io.InputStream;
import q2.C2532a;

/* JADX INFO: renamed from: h2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1851c implements S1.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f41599g = new b();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f41600h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.e f41601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S1.e f41602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final V1.b f41603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f41604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a f41605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f41606f;

    /* JADX INFO: renamed from: h2.c$a */
    public static class a {
        public InputStream a(InputStream inputStream, byte[] bArr) {
            return new o(inputStream, bArr);
        }
    }

    /* JADX INFO: renamed from: h2.c$b */
    public static class b {
        public C1662l.a a(InputStream inputStream) {
            return new C1662l(inputStream).d();
        }
    }

    public C1851c(S1.e eVar, S1.e eVar2, V1.b bVar) {
        this(eVar, eVar2, bVar, f41599g, f41600h);
    }

    public C1851c(S1.e eVar, S1.e eVar2, V1.b bVar, b bVar2, a aVar) {
        this.f41601a = eVar;
        this.f41602b = eVar2;
        this.f41603c = bVar;
        this.f41604d = bVar2;
        this.f41605e = aVar;
    }

    @Override // S1.e
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public l a(Z1.g gVar, int i9, int i10) {
        C2532a c2532aA = C2532a.a();
        byte[] bArrB = c2532aA.b();
        try {
            C1849a c1849aC = c(gVar, i9, i10, bArrB);
            if (c1849aC != null) {
                return new C1850b(c1849aC);
            }
            return null;
        } finally {
            c2532aA.c(bArrB);
        }
    }

    public final C1849a c(Z1.g gVar, int i9, int i10, byte[] bArr) {
        return gVar.b() != null ? f(gVar, i9, i10, bArr) : d(gVar, i9, i10);
    }

    public final C1849a d(Z1.g gVar, int i9, int i10) {
        l lVarA = this.f41601a.a(gVar, i9, i10);
        if (lVarA != null) {
            return new C1849a(lVarA, null);
        }
        return null;
    }

    public final C1849a e(InputStream inputStream, int i9, int i10) {
        l lVarA = this.f41602b.a(inputStream, i9, i10);
        if (lVarA == null) {
            return null;
        }
        g2.b bVar = (g2.b) lVarA.get();
        return bVar.f() > 1 ? new C1849a(null, lVarA) : new C1849a(new C1653c(bVar.e(), this.f41603c), null);
    }

    public final C1849a f(Z1.g gVar, int i9, int i10, byte[] bArr) throws IOException {
        InputStream inputStreamA = this.f41605e.a(gVar.b(), bArr);
        inputStreamA.mark(2048);
        C1662l.a aVarA = this.f41604d.a(inputStreamA);
        inputStreamA.reset();
        C1849a c1849aE = aVarA == C1662l.a.GIF ? e(inputStreamA, i9, i10) : null;
        return c1849aE == null ? d(new Z1.g(inputStreamA, gVar.a()), i9, i10) : c1849aE;
    }

    @Override // S1.e
    public String getId() {
        if (this.f41606f == null) {
            this.f41606f = this.f41602b.getId() + this.f41601a.getId();
        }
        return this.f41606f;
    }
}
