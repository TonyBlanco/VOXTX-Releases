package m3;

import O2.C0897l1;
import O2.C0936z0;
import com.google.android.exoplayer2.extractor.h;
import d4.AbstractC1684a;
import d4.M;
import java.util.ArrayList;
import java.util.Arrays;
import m3.i;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class j extends i {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public a f44378n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f44379o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f44380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public h.c f44381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public h.a f44382r;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h.c f44383a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final h.a f44384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final byte[] f44385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final h.b[] f44386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f44387e;

        public a(h.c cVar, h.a aVar, byte[] bArr, h.b[] bVarArr, int i9) {
            this.f44383a = cVar;
            this.f44384b = aVar;
            this.f44385c = bArr;
            this.f44386d = bVarArr;
            this.f44387e = i9;
        }
    }

    public static void n(M m9, long j9) {
        if (m9.b() < m9.g() + 4) {
            m9.R(Arrays.copyOf(m9.e(), m9.g() + 4));
        } else {
            m9.T(m9.g() + 4);
        }
        byte[] bArrE = m9.e();
        bArrE[m9.g() - 4] = (byte) (j9 & 255);
        bArrE[m9.g() - 3] = (byte) ((j9 >>> 8) & 255);
        bArrE[m9.g() - 2] = (byte) ((j9 >>> 16) & 255);
        bArrE[m9.g() - 1] = (byte) ((j9 >>> 24) & 255);
    }

    public static int o(byte b9, a aVar) {
        return !aVar.f44386d[p(b9, aVar.f44387e, 1)].f25429a ? aVar.f44383a.f25439g : aVar.f44383a.f25440h;
    }

    public static int p(byte b9, int i9, int i10) {
        return (b9 >> i10) & (255 >>> (8 - i9));
    }

    public static boolean r(M m9) {
        try {
            return com.google.android.exoplayer2.extractor.h.m(1, m9, true);
        } catch (C0897l1 unused) {
            return false;
        }
    }

    @Override // m3.i
    public void e(long j9) {
        super.e(j9);
        this.f44380p = j9 != 0;
        h.c cVar = this.f44381q;
        this.f44379o = cVar != null ? cVar.f25439g : 0;
    }

    @Override // m3.i
    public long f(M m9) {
        if ((m9.e()[0] & 1) == 1) {
            return -1L;
        }
        int iO = o(m9.e()[0], (a) AbstractC1684a.i(this.f44378n));
        long j9 = this.f44380p ? (this.f44379o + iO) / 4 : 0;
        n(m9, j9);
        this.f44380p = true;
        this.f44379o = iO;
        return j9;
    }

    @Override // m3.i
    public boolean i(M m9, long j9, i.b bVar) throws C0897l1 {
        if (this.f44378n != null) {
            AbstractC1684a.e(bVar.f44376a);
            return false;
        }
        a aVarQ = q(m9);
        this.f44378n = aVarQ;
        if (aVarQ == null) {
            return true;
        }
        h.c cVar = aVarQ.f44383a;
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar.f25442j);
        arrayList.add(aVarQ.f44385c);
        bVar.f44376a = new C0936z0.b().g0("audio/vorbis").I(cVar.f25437e).b0(cVar.f25436d).J(cVar.f25434b).h0(cVar.f25435c).V(arrayList).Z(com.google.android.exoplayer2.extractor.h.c(AbstractC2743y.s(aVarQ.f44384b.f25427b))).G();
        return true;
    }

    @Override // m3.i
    public void l(boolean z9) {
        super.l(z9);
        if (z9) {
            this.f44378n = null;
            this.f44381q = null;
            this.f44382r = null;
        }
        this.f44379o = 0;
        this.f44380p = false;
    }

    public a q(M m9) throws C0897l1 {
        h.c cVar = this.f44381q;
        if (cVar == null) {
            this.f44381q = com.google.android.exoplayer2.extractor.h.j(m9);
            return null;
        }
        h.a aVar = this.f44382r;
        if (aVar == null) {
            this.f44382r = com.google.android.exoplayer2.extractor.h.h(m9);
            return null;
        }
        byte[] bArr = new byte[m9.g()];
        System.arraycopy(m9.e(), 0, bArr, 0, m9.g());
        return new a(cVar, aVar, bArr, com.google.android.exoplayer2.extractor.h.k(m9, cVar.f25434b), com.google.android.exoplayer2.extractor.h.a(r4.length - 1));
    }
}
