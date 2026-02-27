package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class kn extends rk implements gp {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f23510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ji f23511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final jp f23512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f23513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f23514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private C1333s f23515g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f23516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f23518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f23519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private hg f23520l;

    public kn(Context context, re reVar, rm rmVar, Handler handler, jj jjVar, jp jpVar) {
        super(1, reVar, rmVar, 44100.0f);
        this.f23510b = context.getApplicationContext();
        this.f23512d = jpVar;
        this.f23511c = new ji(handler, jjVar);
        jpVar.n(new km(this));
    }

    private static List aA(rm rmVar, C1333s c1333s, boolean z9, jp jpVar) throws rr {
        rh rhVarC;
        String str = c1333s.f24467l;
        if (str == null) {
            return avo.o();
        }
        if (jpVar.w(c1333s) && (rhVarC = rw.c()) != null) {
            return avo.p(rhVarC);
        }
        List listA = rmVar.a(str, z9, false);
        String strD = rw.d(c1333s);
        if (strD == null) {
            return avo.m(listA);
        }
        List listA2 = rmVar.a(strD, z9, false);
        avk avkVarJ = avo.j();
        avkVarJ.h(listA);
        avkVarJ.h(listA2);
        return avkVarJ.f();
    }

    private final void aB() {
        long jB = this.f23512d.b(N());
        if (jB != Long.MIN_VALUE) {
            if (!this.f23518j) {
                jB = Math.max(this.f23516h, jB);
            }
            this.f23516h = jB;
            this.f23518j = false;
        }
    }

    private final int az(rh rhVar, C1333s c1333s) {
        int i9;
        if (!"OMX.google.raw.decoder".equals(rhVar.f24365a) || (i9 = cq.f22640a) >= 24 || (i9 == 23 && cq.ab(this.f23510b))) {
            return c1333s.f24468m;
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh, com.google.ads.interactivemedia.v3.internal.hi
    public final String L() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.hh
    public final boolean N() {
        return super.N() && this.f23512d.v();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.hh
    public final boolean O() {
        return this.f23512d.u() || super.O();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final int Q(rm rmVar, C1333s c1333s) throws rr {
        boolean z9;
        if (!ar.m(c1333s.f24467l)) {
            return fz.b(0);
        }
        int i9 = cq.f22640a >= 21 ? 32 : 0;
        int i10 = c1333s.f24454E;
        boolean zAx = rk.ax(c1333s);
        int i11 = 8;
        if (zAx && this.f23512d.w(c1333s) && (i10 == 0 || rw.c() != null)) {
            return fz.c(4, 8, i9);
        }
        if ((!"audio/raw".equals(c1333s.f24467l) || this.f23512d.w(c1333s)) && this.f23512d.w(cq.E(2, c1333s.f24480y, c1333s.f24481z))) {
            List listAA = aA(rmVar, c1333s, false, this.f23512d);
            if (listAA.isEmpty()) {
                return fz.b(1);
            }
            if (!zAx) {
                return fz.b(2);
            }
            rh rhVar = (rh) listAA.get(0);
            boolean zC = rhVar.c(c1333s);
            if (zC) {
                z9 = true;
            } else {
                for (int i12 = 1; i12 < listAA.size(); i12++) {
                    rh rhVar2 = (rh) listAA.get(i12);
                    if (rhVar2.c(c1333s)) {
                        rhVar = rhVar2;
                        z9 = false;
                        zC = true;
                        break;
                    }
                }
                z9 = true;
            }
            int i13 = true != zC ? 3 : 4;
            if (zC && rhVar.d(c1333s)) {
                i11 = 16;
            }
            return fz.d(i13, i11, i9, true != rhVar.f24371g ? 0 : 64, true == z9 ? 128 : 0);
        }
        return fz.b(1);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final eq R(rh rhVar, C1333s c1333s, C1333s c1333s2) {
        int i9;
        int i10;
        eq eqVarB = rhVar.b(c1333s, c1333s2);
        int i11 = eqVarB.f22826e;
        if (az(rhVar, c1333s2) > this.f23513e) {
            i11 |= 64;
        }
        String str = rhVar.f24365a;
        if (i11 != 0) {
            i10 = i11;
            i9 = 0;
        } else {
            i9 = eqVarB.f22825d;
            i10 = 0;
        }
        return new eq(str, c1333s, c1333s2, i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final eq S(go goVar) throws ev {
        eq eqVarS = super.S(goVar);
        this.f23511c.g(goVar.f23064b, eqVarS);
        return eqVarS;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00aa  */
    @Override // com.google.ads.interactivemedia.v3.internal.rk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.ads.interactivemedia.v3.internal.rd V(com.google.ads.interactivemedia.v3.internal.rh r9, com.google.ads.interactivemedia.v3.internal.C1333s r10, android.media.MediaCrypto r11, float r12) {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.kn.V(com.google.ads.interactivemedia.v3.internal.rh, com.google.ads.interactivemedia.v3.internal.s, android.media.MediaCrypto, float):com.google.ads.interactivemedia.v3.internal.rd");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final List W(rm rmVar, C1333s c1333s, boolean z9) throws rr {
        return rw.f(aA(rmVar, c1333s, z9, this.f23512d), c1333s);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void X(Exception exc) {
        cd.c("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.f23511c.a(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void Y(String str) {
        this.f23511c.d(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void Z(C1333s c1333s, MediaFormat mediaFormat) throws ev {
        int i9;
        C1333s c1333s2 = this.f23515g;
        int[] iArr = null;
        if (c1333s2 != null) {
            c1333s = c1333s2;
        } else if (ak() != null) {
            int iK = "audio/raw".equals(c1333s.f24467l) ? c1333s.f24450A : (cq.f22640a < 24 || !mediaFormat.containsKey("pcm-encoding")) ? mediaFormat.containsKey("v-bits-per-sample") ? cq.k(mediaFormat.getInteger("v-bits-per-sample")) : 2 : mediaFormat.getInteger("pcm-encoding");
            r rVar = new r();
            rVar.ae("audio/raw");
            rVar.Y(iK);
            rVar.N(c1333s.f24451B);
            rVar.O(c1333s.f24452C);
            rVar.H(mediaFormat.getInteger("channel-count"));
            rVar.af(mediaFormat.getInteger("sample-rate"));
            C1333s c1333sV = rVar.v();
            if (this.f23514f && c1333sV.f24480y == 6 && (i9 = c1333s.f24480y) < 6) {
                iArr = new int[i9];
                for (int i10 = 0; i10 < c1333s.f24480y; i10++) {
                    iArr[i10] = i10;
                }
            }
            c1333s = c1333sV;
        }
        try {
            this.f23512d.x(c1333s, iArr);
        } catch (jk e9) {
            throw bi(e9, e9.f23360a, 5001);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final long a() {
        if (bg() == 2) {
            aB();
        }
        return this.f23516h;
    }

    public final void aa() {
        this.f23518j = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ab() {
        this.f23512d.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ac(ef efVar) {
        if (!this.f23517i || efVar.f()) {
            return;
        }
        if (Math.abs(efVar.f22776d - this.f23516h) > 500000) {
            this.f23516h = efVar.f22776d;
        }
        this.f23517i = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ad() throws ev {
        try {
            this.f23512d.i();
        } catch (jo e9) {
            throw h(e9, e9.f23366c, e9.f23365b, 5002);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final boolean ae(long j9, long j10, rf rfVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j11, boolean z9, boolean z10, C1333s c1333s) throws ev {
        af.s(byteBuffer);
        if (this.f23515g != null && (i10 & 2) != 0) {
            af.s(rfVar);
            rfVar.k(i9, false);
            return true;
        }
        if (z9) {
            if (rfVar != null) {
                rfVar.k(i9, false);
            }
            ((rk) this).f24404a.f22815f += i11;
            this.f23512d.f();
            return true;
        }
        try {
            if (!this.f23512d.t(byteBuffer, j11, i11)) {
                return false;
            }
            if (rfVar != null) {
                rfVar.k(i9, false);
            }
            ((rk) this).f24404a.f22814e += i11;
            return true;
        } catch (jl e9) {
            throw h(e9, e9.f23363c, e9.f23362b, 5001);
        } catch (jo e10) {
            throw h(e10, c1333s, e10.f23365b, 5002);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final boolean af(C1333s c1333s) {
        return this.f23512d.w(c1333s);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final float ag(float f9, C1333s[] c1333sArr) {
        int iMax = -1;
        for (C1333s c1333s : c1333sArr) {
            int i9 = c1333s.f24481z;
            if (i9 != -1) {
                iMax = Math.max(iMax, i9);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ah(String str, long j9, long j10) {
        this.f23511c.c(str, j9, j10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final au c() {
        return this.f23512d.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.gp
    public final void g(au auVar) {
        this.f23512d.o(auVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eo, com.google.ads.interactivemedia.v3.internal.hh
    public final gp j() {
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eo, com.google.ads.interactivemedia.v3.internal.hd
    public final void q(int i9, Object obj) throws ev {
        if (i9 == 2) {
            this.f23512d.s(((Float) obj).floatValue());
            return;
        }
        if (i9 == 3) {
            this.f23512d.k((C1295f) obj);
            return;
        }
        if (i9 == 6) {
            this.f23512d.m((C1298g) obj);
            return;
        }
        switch (i9) {
            case 9:
                this.f23512d.r(((Boolean) obj).booleanValue());
                break;
            case 10:
                this.f23512d.l(((Integer) obj).intValue());
                break;
            case 11:
                this.f23520l = (hg) obj;
                break;
            case 12:
                if (cq.f22640a >= 23) {
                    kl.a(this.f23512d, obj);
                }
                break;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    public final void t() {
        this.f23519k = true;
        try {
            this.f23512d.e();
            try {
                super.t();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.t();
                throw th;
            } finally {
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    public final void u(boolean z9, boolean z10) throws ev {
        super.u(z9, z10);
        this.f23511c.f(((rk) this).f24404a);
        l();
        this.f23512d.d();
        this.f23512d.p(m());
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    public final void v(long j9, boolean z9) throws ev {
        super.v(j9, z9);
        this.f23512d.e();
        this.f23516h = j9;
        this.f23517i = true;
        this.f23518j = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    public final void w() {
        try {
            super.w();
            if (this.f23519k) {
                this.f23519k = false;
                this.f23512d.j();
            }
        } catch (Throwable th) {
            if (this.f23519k) {
                this.f23519k = false;
                this.f23512d.j();
            }
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eo
    public final void x() {
        this.f23512d.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eo
    public final void y() {
        aB();
        this.f23512d.g();
    }
}
