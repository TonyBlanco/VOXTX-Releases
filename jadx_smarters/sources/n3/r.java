package n3;

import O2.C0936z0;
import d3.InterfaceC1674k;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.M;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class r implements m {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public d3.w f45193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45194c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f45197f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f45192a = new M(10);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f45195d = -9223372036854775807L;

    @Override // n3.m
    public void b(M m9) {
        AbstractC1684a.i(this.f45193b);
        if (this.f45194c) {
            int iA = m9.a();
            int i9 = this.f45197f;
            if (i9 < 10) {
                int iMin = Math.min(iA, 10 - i9);
                System.arraycopy(m9.e(), m9.f(), this.f45192a.e(), this.f45197f, iMin);
                if (this.f45197f + iMin == 10) {
                    this.f45192a.U(0);
                    if (73 != this.f45192a.H() || 68 != this.f45192a.H() || 51 != this.f45192a.H()) {
                        AbstractC1681B.j("Id3Reader", "Discarding invalid ID3 tag");
                        this.f45194c = false;
                        return;
                    } else {
                        this.f45192a.V(3);
                        this.f45196e = this.f45192a.G() + 10;
                    }
                }
            }
            int iMin2 = Math.min(iA, this.f45196e - this.f45197f);
            this.f45193b.b(m9, iMin2);
            this.f45197f += iMin2;
        }
    }

    @Override // n3.m
    public void c() {
        this.f45194c = false;
        this.f45195d = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
        int i9;
        AbstractC1684a.i(this.f45193b);
        if (this.f45194c && (i9 = this.f45196e) != 0 && this.f45197f == i9) {
            long j9 = this.f45195d;
            if (j9 != -9223372036854775807L) {
                this.f45193b.f(j9, 1, i9, 0, null);
            }
            this.f45194c = false;
        }
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.f45194c = true;
        if (j9 != -9223372036854775807L) {
            this.f45195d = j9;
        }
        this.f45196e = 0;
        this.f45197f = 0;
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        dVar.a();
        d3.w wVarE = interfaceC1674k.e(dVar.c(), 5);
        this.f45193b = wVarE;
        wVarE.d(new C0936z0.b().U(dVar.b()).g0("application/id3").G());
    }
}
