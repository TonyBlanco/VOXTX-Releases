package P3;

import O2.C0897l1;
import O2.C0936z0;
import d3.InterfaceC1672i;
import d3.InterfaceC1673j;
import d3.InterfaceC1674k;
import d3.t;
import d3.w;
import d4.AbstractC1684a;
import d4.M;
import d4.k0;
import java.io.InterruptedIOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class m implements InterfaceC1672i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f7243a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0936z0 f7246d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC1674k f7249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public w f7250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f7251i;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f7244b = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M f7245c = new M();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f7247e = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f7248f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f7252j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7253k = -9223372036854775807L;

    public m(j jVar, C0936z0 c0936z0) {
        this.f7243a = jVar;
        this.f7246d = c0936z0.b().g0("text/x-exoplayer-cues").K(c0936z0.f6467m).G();
    }

    @Override // d3.InterfaceC1672i
    public void a(long j9, long j10) {
        int i9 = this.f7252j;
        AbstractC1684a.g((i9 == 0 || i9 == 5) ? false : true);
        this.f7253k = j10;
        if (this.f7252j == 2) {
            this.f7252j = 1;
        }
        if (this.f7252j == 4) {
            this.f7252j = 3;
        }
    }

    @Override // d3.InterfaceC1672i
    public void b(InterfaceC1674k interfaceC1674k) {
        AbstractC1684a.g(this.f7252j == 0);
        this.f7249g = interfaceC1674k;
        this.f7250h = interfaceC1674k.e(0, 3);
        this.f7249g.q();
        this.f7249g.n(new com.google.android.exoplayer2.extractor.f(new long[]{0}, new long[]{0}, -9223372036854775807L));
        this.f7250h.d(this.f7246d);
        this.f7252j = 1;
    }

    public final void c() throws C0897l1, InterruptedIOException {
        n nVar;
        o oVar;
        try {
            Object objD = this.f7243a.d();
            while (true) {
                nVar = (n) objD;
                if (nVar != null) {
                    break;
                }
                Thread.sleep(5L);
                objD = this.f7243a.d();
            }
            nVar.e(this.f7251i);
            nVar.f9699d.put(this.f7245c.e(), 0, this.f7251i);
            nVar.f9699d.limit(this.f7251i);
            this.f7243a.c(nVar);
            Object objB = this.f7243a.b();
            while (true) {
                oVar = (o) objB;
                if (oVar != null) {
                    break;
                }
                Thread.sleep(5L);
                objB = this.f7243a.b();
            }
            for (int i9 = 0; i9 < oVar.h(); i9++) {
                byte[] bArrA = this.f7244b.a(oVar.b(oVar.c(i9)));
                this.f7247e.add(Long.valueOf(oVar.c(i9)));
                this.f7248f.add(new M(bArrA));
            }
            oVar.release();
        } catch (k e9) {
            throw C0897l1.a("SubtitleDecoder failed.", e9);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    @Override // d3.InterfaceC1672i
    public int d(InterfaceC1673j interfaceC1673j, t tVar) throws C0897l1, InterruptedIOException {
        int i9 = this.f7252j;
        AbstractC1684a.g((i9 == 0 || i9 == 5) ? false : true);
        if (this.f7252j == 1) {
            this.f7245c.Q(interfaceC1673j.getLength() != -1 ? w5.f.d(interfaceC1673j.getLength()) : 1024);
            this.f7251i = 0;
            this.f7252j = 2;
        }
        if (this.f7252j == 2 && e(interfaceC1673j)) {
            c();
            g();
            this.f7252j = 4;
        }
        if (this.f7252j == 3 && f(interfaceC1673j)) {
            g();
            this.f7252j = 4;
        }
        return this.f7252j == 4 ? -1 : 0;
    }

    public final boolean e(InterfaceC1673j interfaceC1673j) {
        int iB = this.f7245c.b();
        int i9 = this.f7251i;
        if (iB == i9) {
            this.f7245c.c(i9 + 1024);
        }
        int i10 = interfaceC1673j.read(this.f7245c.e(), this.f7251i, this.f7245c.b() - this.f7251i);
        if (i10 != -1) {
            this.f7251i += i10;
        }
        long length = interfaceC1673j.getLength();
        return (length != -1 && ((long) this.f7251i) == length) || i10 == -1;
    }

    public final boolean f(InterfaceC1673j interfaceC1673j) {
        return interfaceC1673j.b((interfaceC1673j.getLength() > (-1L) ? 1 : (interfaceC1673j.getLength() == (-1L) ? 0 : -1)) != 0 ? w5.f.d(interfaceC1673j.getLength()) : 1024) == -1;
    }

    public final void g() {
        AbstractC1684a.i(this.f7250h);
        AbstractC1684a.g(this.f7247e.size() == this.f7248f.size());
        long j9 = this.f7253k;
        for (int iG = j9 == -9223372036854775807L ? 0 : k0.g(this.f7247e, Long.valueOf(j9), true, true); iG < this.f7248f.size(); iG++) {
            M m9 = (M) this.f7248f.get(iG);
            m9.U(0);
            int length = m9.e().length;
            this.f7250h.b(m9, length);
            this.f7250h.f(((Long) this.f7247e.get(iG)).longValue(), 1, length, 0, null);
        }
    }

    @Override // d3.InterfaceC1672i
    public boolean h(InterfaceC1673j interfaceC1673j) {
        return true;
    }

    @Override // d3.InterfaceC1672i
    public void release() {
        if (this.f7252j == 5) {
            return;
        }
        this.f7243a.release();
        this.f7252j = 5;
    }
}
