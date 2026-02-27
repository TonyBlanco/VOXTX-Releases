package m3;

import O2.C0936z0;
import Q2.d0;
import d4.AbstractC1684a;
import d4.M;
import java.util.Arrays;
import java.util.List;
import m3.i;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final byte[] f44360o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final byte[] f44361p = {79, 112, 117, 115, 84, 97, 103, 115};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f44362n;

    public static boolean n(M m9, byte[] bArr) {
        if (m9.a() < bArr.length) {
            return false;
        }
        int iF = m9.f();
        byte[] bArr2 = new byte[bArr.length];
        m9.l(bArr2, 0, bArr.length);
        m9.U(iF);
        return Arrays.equals(bArr2, bArr);
    }

    public static boolean o(M m9) {
        return n(m9, f44360o);
    }

    @Override // m3.i
    public long f(M m9) {
        return c(d0.e(m9.e()));
    }

    @Override // m3.i
    public boolean i(M m9, long j9, i.b bVar) {
        C0936z0.b bVarZ;
        if (n(m9, f44360o)) {
            byte[] bArrCopyOf = Arrays.copyOf(m9.e(), m9.g());
            int iC = d0.c(bArrCopyOf);
            List listA = d0.a(bArrCopyOf);
            if (bVar.f44376a != null) {
                return true;
            }
            bVarZ = new C0936z0.b().g0("audio/opus").J(iC).h0(48000).V(listA);
        } else {
            byte[] bArr = f44361p;
            if (!n(m9, bArr)) {
                AbstractC1684a.i(bVar.f44376a);
                return false;
            }
            AbstractC1684a.i(bVar.f44376a);
            if (this.f44362n) {
                return true;
            }
            this.f44362n = true;
            m9.V(bArr.length);
            C2540a c2540aC = com.google.android.exoplayer2.extractor.h.c(AbstractC2743y.s(com.google.android.exoplayer2.extractor.h.i(m9, false, false).f25427b));
            if (c2540aC == null) {
                return true;
            }
            bVarZ = bVar.f44376a.b().Z(c2540aC.c(bVar.f44376a.f6465k));
        }
        bVar.f44376a = bVarZ.G();
        return true;
    }

    @Override // m3.i
    public void l(boolean z9) {
        super.l(z9);
        if (z9) {
            this.f44362n = false;
        }
    }
}
