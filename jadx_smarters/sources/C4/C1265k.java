package c4;

import b4.C1227s;
import java.io.IOException;
import java.io.InterruptedIOException;

/* JADX INFO: renamed from: c4.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1265k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1257c f18250a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1255a f18251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1227s f18252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f18253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final a f18255f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18256g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18257h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f18258i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f18259j;

    /* JADX INFO: renamed from: c4.k$a */
    public interface a {
        void a(long j9, long j10, long j11);
    }

    public C1265k(C1257c c1257c, C1227s c1227s, byte[] bArr, a aVar) {
        this.f18250a = c1257c;
        this.f18251b = c1257c.t();
        this.f18252c = c1227s;
        this.f18254e = bArr == null ? new byte[131072] : bArr;
        this.f18255f = aVar;
        this.f18253d = c1257c.u().a(c1227s);
        this.f18256g = c1227s.f17604g;
    }

    public void a() throws IOException {
        long j9;
        g();
        InterfaceC1255a interfaceC1255a = this.f18251b;
        String str = this.f18253d;
        C1227s c1227s = this.f18252c;
        this.f18258i = interfaceC1255a.c(str, c1227s.f17604g, c1227s.f17605h);
        C1227s c1227s2 = this.f18252c;
        long j10 = c1227s2.f17605h;
        if (j10 != -1) {
            this.f18257h = c1227s2.f17604g + j10;
        } else {
            long jA = AbstractC1268n.a(this.f18251b.b(this.f18253d));
            if (jA == -1) {
                jA = -1;
            }
            this.f18257h = jA;
        }
        a aVar = this.f18255f;
        if (aVar != null) {
            aVar.a(c(), this.f18258i, 0L);
        }
        while (true) {
            long j11 = this.f18257h;
            if (j11 != -1 && this.f18256g >= j11) {
                return;
            }
            g();
            long j12 = this.f18257h;
            long jE = this.f18251b.e(this.f18253d, this.f18256g, j12 == -1 ? Long.MAX_VALUE : j12 - this.f18256g);
            if (jE > 0) {
                j9 = this.f18256g;
            } else {
                long j13 = -jE;
                if (j13 == Long.MAX_VALUE) {
                    j13 = -1;
                }
                j9 = this.f18256g;
                jE = f(j9, j13);
            }
            this.f18256g = j9 + jE;
        }
    }

    public void b() {
        this.f18259j = true;
    }

    public final long c() {
        long j9 = this.f18257h;
        if (j9 == -1) {
            return -1L;
        }
        return j9 - this.f18252c.f17604g;
    }

    public final void d(long j9) {
        this.f18258i += j9;
        a aVar = this.f18255f;
        if (aVar != null) {
            aVar.a(c(), this.f18258i, j9);
        }
    }

    public final void e(long j9) {
        if (this.f18257h == j9) {
            return;
        }
        this.f18257h = j9;
        a aVar = this.f18255f;
        if (aVar != null) {
            aVar.a(c(), this.f18258i, 0L);
        }
    }

    public final long f(long j9, long j10) throws IOException {
        long jA;
        boolean z9 = true;
        boolean z10 = j9 + j10 == this.f18257h || j10 == -1;
        if (j10 != -1) {
            try {
                jA = this.f18250a.a(this.f18252c.a().h(j9).g(j10).a());
            } catch (IOException unused) {
                b4.r.a(this.f18250a);
                jA = -1;
                z9 = false;
            }
        } else {
            jA = -1;
            z9 = false;
        }
        if (!z9) {
            g();
            try {
                jA = this.f18250a.a(this.f18252c.a().h(j9).g(-1L).a());
            } catch (IOException e9) {
                b4.r.a(this.f18250a);
                throw e9;
            }
        }
        if (z10 && jA != -1) {
            try {
                e(jA + j9);
            } catch (IOException e10) {
                b4.r.a(this.f18250a);
                throw e10;
            }
        }
        int i9 = 0;
        int i10 = 0;
        while (i9 != -1) {
            g();
            C1257c c1257c = this.f18250a;
            byte[] bArr = this.f18254e;
            i9 = c1257c.read(bArr, 0, bArr.length);
            if (i9 != -1) {
                d(i9);
                i10 += i9;
            }
        }
        if (z10) {
            e(j9 + ((long) i10));
        }
        this.f18250a.close();
        return i10;
    }

    public final void g() throws InterruptedIOException {
        if (this.f18259j) {
            throw new InterruptedIOException();
        }
    }
}
