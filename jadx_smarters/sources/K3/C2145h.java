package k3;

import Q2.b0;
import com.google.android.exoplayer2.extractor.g;
import d3.u;
import d4.AbstractC1681B;
import d4.M;
import d4.k0;

/* JADX INFO: renamed from: k3.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2145h implements InterfaceC2144g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f43565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f43566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f43567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f43568d;

    public C2145h(long[] jArr, long[] jArr2, long j9, long j10) {
        this.f43565a = jArr;
        this.f43566b = jArr2;
        this.f43567c = j9;
        this.f43568d = j10;
    }

    public static C2145h a(long j9, long j10, b0.a aVar, M m9) {
        int iH;
        m9.V(10);
        int iQ = m9.q();
        if (iQ <= 0) {
            return null;
        }
        int i9 = aVar.f7771d;
        long jC1 = k0.c1(iQ, ((long) (i9 >= 32000 ? 1152 : 576)) * 1000000, i9);
        int iN = m9.N();
        int iN2 = m9.N();
        int iN3 = m9.N();
        m9.V(2);
        long j11 = j10 + ((long) aVar.f7770c);
        long[] jArr = new long[iN];
        long[] jArr2 = new long[iN];
        int i10 = 0;
        long j12 = j10;
        while (i10 < iN) {
            int i11 = iN2;
            long j13 = j11;
            jArr[i10] = (((long) i10) * jC1) / ((long) iN);
            jArr2[i10] = Math.max(j12, j13);
            if (iN3 == 1) {
                iH = m9.H();
            } else if (iN3 == 2) {
                iH = m9.N();
            } else if (iN3 == 3) {
                iH = m9.K();
            } else {
                if (iN3 != 4) {
                    return null;
                }
                iH = m9.L();
            }
            j12 += ((long) iH) * ((long) i11);
            i10++;
            jArr = jArr;
            iN2 = i11;
            j11 = j13;
        }
        long[] jArr3 = jArr;
        if (j9 != -1 && j9 != j12) {
            AbstractC1681B.j("VbriSeeker", "VBRI data size mismatch: " + j9 + ", " + j12);
        }
        return new C2145h(jArr3, jArr2, jC1, j12);
    }

    @Override // k3.InterfaceC2144g
    public long c(long j9) {
        return this.f43565a[k0.i(this.f43566b, j9, true, true)];
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public g.a e(long j9) {
        int i9 = k0.i(this.f43565a, j9, true, true);
        u uVar = new u(this.f43565a[i9], this.f43566b[i9]);
        if (uVar.f39610a >= j9 || i9 == this.f43565a.length - 1) {
            return new g.a(uVar);
        }
        int i10 = i9 + 1;
        return new g.a(uVar, new u(this.f43565a[i10], this.f43566b[i10]));
    }

    @Override // k3.InterfaceC2144g
    public long f() {
        return this.f43568d;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public boolean g() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.g
    public long i() {
        return this.f43567c;
    }
}
