package n3;

import O2.C0936z0;
import d3.InterfaceC1674k;
import d4.M;
import java.util.Collections;
import java.util.List;
import n3.I;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f45062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d3.w[] f45063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f45064c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f45065d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f45066e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f45067f = -9223372036854775807L;

    public l(List list) {
        this.f45062a = list;
        this.f45063b = new d3.w[list.size()];
    }

    public final boolean a(M m9, int i9) {
        if (m9.a() == 0) {
            return false;
        }
        if (m9.H() != i9) {
            this.f45064c = false;
        }
        this.f45065d--;
        return this.f45064c;
    }

    @Override // n3.m
    public void b(M m9) {
        if (this.f45064c) {
            if (this.f45065d != 2 || a(m9, 32)) {
                if (this.f45065d != 1 || a(m9, 0)) {
                    int iF = m9.f();
                    int iA = m9.a();
                    for (d3.w wVar : this.f45063b) {
                        m9.U(iF);
                        wVar.b(m9, iA);
                    }
                    this.f45066e += iA;
                }
            }
        }
    }

    @Override // n3.m
    public void c() {
        this.f45064c = false;
        this.f45067f = -9223372036854775807L;
    }

    @Override // n3.m
    public void d() {
        if (this.f45064c) {
            if (this.f45067f != -9223372036854775807L) {
                for (d3.w wVar : this.f45063b) {
                    wVar.f(this.f45067f, 1, this.f45066e, 0, null);
                }
            }
            this.f45064c = false;
        }
    }

    @Override // n3.m
    public void e(long j9, int i9) {
        if ((i9 & 4) == 0) {
            return;
        }
        this.f45064c = true;
        if (j9 != -9223372036854775807L) {
            this.f45067f = j9;
        }
        this.f45066e = 0;
        this.f45065d = 2;
    }

    @Override // n3.m
    public void f(InterfaceC1674k interfaceC1674k, I.d dVar) {
        for (int i9 = 0; i9 < this.f45063b.length; i9++) {
            I.a aVar = (I.a) this.f45062a.get(i9);
            dVar.a();
            d3.w wVarE = interfaceC1674k.e(dVar.c(), 3);
            wVarE.d(new C0936z0.b().U(dVar.b()).g0("application/dvbsubs").V(Collections.singletonList(aVar.f44969c)).X(aVar.f44967a).G());
            this.f45063b[i9] = wVarE;
        }
    }
}
