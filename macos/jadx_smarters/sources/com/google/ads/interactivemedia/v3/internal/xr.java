package com.google.ads.interactivemedia.v3.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.media.MediaCodecInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Pair;
import android.view.Display;
import android.view.Surface;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import java.nio.ByteBuffer;
import java.util.List;
import org.apache.commons.logging.LogFactory;
import org.apache.http.util.LangUtils;
import org.joda.time.DateTimeConstants;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

/* JADX INFO: loaded from: classes3.dex */
public final class xr extends rk {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f25082c = {1920, 1600, DateTimeConstants.MINUTES_PER_DAY, 1280, 960, 854, 640, 540, 480};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f25083d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f25084e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f25085A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private int f25086B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f25087C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private int f25088D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private int f25089E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private float f25090F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private bl f25091G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private int f25092H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private xu f25093I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private yp f25094J;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    xq f25095b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Context f25096f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final yb f25097g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final yh f25098h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final boolean f25099i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f25100j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f25101k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Surface f25102l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private xt f25103m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f25104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f25105o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f25106p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f25107q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f25108r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f25109s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f25110t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f25111u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f25112v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f25113w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f25114x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f25115y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f25116z;

    public xr(Context context, re reVar, rm rmVar, Handler handler, yi yiVar) {
        super(2, reVar, rmVar, 30.0f);
        Context applicationContext = context.getApplicationContext();
        this.f25096f = applicationContext;
        this.f25097g = new yb(applicationContext);
        this.f25098h = new yh(handler, yiVar);
        this.f25099i = "NVIDIA".equals(cq.f22642c);
        this.f25110t = -9223372036854775807L;
        this.f25087C = -1;
        this.f25088D = -1;
        this.f25090F = -1.0f;
        this.f25105o = 1;
        this.f25092H = 0;
        aI();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int T(com.google.ads.interactivemedia.v3.internal.rh r9, com.google.ads.interactivemedia.v3.internal.C1333s r10) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.xr.T(com.google.ads.interactivemedia.v3.internal.rh, com.google.ads.interactivemedia.v3.internal.s):int");
    }

    public static int U(rh rhVar, C1333s c1333s) {
        if (c1333s.f24468m == -1) {
            return T(rhVar, c1333s);
        }
        int size = c1333s.f24469n.size();
        int length = 0;
        for (int i9 = 0; i9 < size; i9++) {
            length += ((byte[]) c1333s.f24469n.get(i9)).length;
        }
        return c1333s.f24468m + length;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0080 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:507:0x078c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean aB(java.lang.String r17) {
        /*
            Method dump skipped, instruction units count: 2926
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.xr.aB(java.lang.String):boolean");
    }

    private static int aF(int i9, int i10) {
        return (i9 * 3) / (i10 + i10);
    }

    private static List aG(Context context, rm rmVar, C1333s c1333s, boolean z9, boolean z10) throws rr {
        String str = c1333s.f24467l;
        if (str == null) {
            return avo.o();
        }
        List listA = rmVar.a(str, z9, z10);
        String strD = rw.d(c1333s);
        if (strD == null) {
            return avo.m(listA);
        }
        List listA2 = rmVar.a(strD, z9, z10);
        if (cq.f22640a >= 26 && "video/dolby-vision".equals(c1333s.f24467l) && !listA2.isEmpty()) {
            DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
            Display display = displayManager != null ? displayManager.getDisplay(0) : null;
            if (display != null && display.isHdr()) {
                for (int i9 : display.getHdrCapabilities().getSupportedHdrTypes()) {
                    if (i9 != 1) {
                    }
                }
            }
            return avo.m(listA2);
        }
        avk avkVarJ = avo.j();
        avkVarJ.h(listA);
        avkVarJ.h(listA2);
        return avkVarJ.f();
    }

    private final void aH() {
        this.f25106p = false;
        int i9 = cq.f22640a;
    }

    private final void aI() {
        this.f25091G = null;
    }

    private final void aJ() {
        if (this.f25112v > 0) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f25098h.d(this.f25112v, jElapsedRealtime - this.f25111u);
            this.f25112v = 0;
            this.f25111u = jElapsedRealtime;
        }
    }

    private final void aK() {
        int i9 = this.f25087C;
        if (i9 == -1 && this.f25088D == -1) {
            return;
        }
        bl blVar = this.f25091G;
        if (blVar != null && blVar.f21637b == i9 && blVar.f21638c == this.f25088D && blVar.f21639d == this.f25089E && blVar.f21640e == this.f25090F) {
            return;
        }
        bl blVar2 = new bl(i9, this.f25088D, this.f25089E, this.f25090F);
        this.f25091G = blVar2;
        this.f25098h.t(blVar2);
    }

    private final void aL() {
        bl blVar = this.f25091G;
        if (blVar != null) {
            this.f25098h.t(blVar);
        }
    }

    private final void aM() {
        Surface surface = this.f25102l;
        xt xtVar = this.f25103m;
        if (surface == xtVar) {
            this.f25102l = null;
        }
        xtVar.release();
        this.f25103m = null;
    }

    private final void aN() {
        this.f25110t = SystemClock.elapsedRealtime() + 5000;
    }

    private static boolean aO(long j9) {
        return j9 < -30000;
    }

    private final boolean aP(rh rhVar) {
        if (cq.f22640a < 23 || aB(rhVar.f24365a)) {
            return false;
        }
        return !rhVar.f24370f || xt.b(this.f25096f);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo, com.google.ads.interactivemedia.v3.internal.hh
    public final void D(float f9, float f10) throws ev {
        super.D(f9, f10);
        this.f25097g.e(f9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hh, com.google.ads.interactivemedia.v3.internal.hi
    public final String L() {
        return "MediaCodecVideoRenderer";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.hh
    public final boolean O() {
        xt xtVar;
        if (super.O() && (this.f25106p || (((xtVar = this.f25103m) != null && this.f25102l == xtVar) || ak() == null))) {
            this.f25110t = -9223372036854775807L;
            return true;
        }
        if (this.f25110t == -9223372036854775807L) {
            return false;
        }
        if (SystemClock.elapsedRealtime() < this.f25110t) {
            return true;
        }
        this.f25110t = -9223372036854775807L;
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final int Q(rm rmVar, C1333s c1333s) throws rr {
        boolean z9;
        int i9 = 0;
        if (!ar.q(c1333s.f24467l)) {
            return fz.b(0);
        }
        boolean z10 = c1333s.f24470o != null;
        List listAG = aG(this.f25096f, rmVar, c1333s, z10, false);
        if (z10 && listAG.isEmpty()) {
            listAG = aG(this.f25096f, rmVar, c1333s, false, false);
        }
        if (listAG.isEmpty()) {
            return fz.b(1);
        }
        if (!rk.ax(c1333s)) {
            return fz.b(2);
        }
        rh rhVar = (rh) listAG.get(0);
        boolean zC = rhVar.c(c1333s);
        if (zC) {
            z9 = true;
        } else {
            for (int i10 = 1; i10 < listAG.size(); i10++) {
                rh rhVar2 = (rh) listAG.get(i10);
                if (rhVar2.c(c1333s)) {
                    rhVar = rhVar2;
                    z9 = false;
                    zC = true;
                    break;
                }
            }
            z9 = true;
        }
        int i11 = true != zC ? 3 : 4;
        int i12 = true != rhVar.d(c1333s) ? 8 : 16;
        int i13 = true != rhVar.f24371g ? 0 : 64;
        int i14 = true != z9 ? 0 : 128;
        if (zC) {
            List listAG2 = aG(this.f25096f, rmVar, c1333s, z10, true);
            if (!listAG2.isEmpty()) {
                rh rhVar3 = (rh) rw.f(listAG2, c1333s).get(0);
                if (rhVar3.c(c1333s) && rhVar3.d(c1333s)) {
                    i9 = 32;
                }
            }
        }
        return fz.d(i11, i12, i9, i13, i14);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final eq R(rh rhVar, C1333s c1333s, C1333s c1333s2) {
        int i9;
        int i10;
        eq eqVarB = rhVar.b(c1333s, c1333s2);
        int i11 = eqVarB.f22826e;
        int i12 = c1333s2.f24472q;
        yp ypVar = this.f25094J;
        if (i12 > ypVar.f25191a || c1333s2.f24473r > ypVar.f25192b) {
            i11 |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        }
        if (U(rhVar, c1333s2) > this.f25094J.f25193c) {
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
        this.f25098h.f(goVar.f23064b, eqVarS);
        return eqVarS;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    @TargetApi(LangUtils.HASH_SEED)
    public final rd V(rh rhVar, C1333s c1333s, MediaCrypto mediaCrypto, float f9) {
        yp ypVar;
        Point point;
        Pair pairB;
        int iT;
        C1333s c1333s2 = c1333s;
        xt xtVar = this.f25103m;
        if (xtVar != null && xtVar.f25124a != rhVar.f24370f) {
            aM();
        }
        String str = rhVar.f24367c;
        C1333s[] c1333sArrJ = J();
        int iMax = c1333s2.f24472q;
        int iMax2 = c1333s2.f24473r;
        int iU = U(rhVar, c1333s);
        int length = c1333sArrJ.length;
        if (length == 1) {
            if (iU != -1 && (iT = T(rhVar, c1333s)) != -1) {
                iU = Math.min((int) (iU * 1.5f), iT);
            }
            ypVar = new yp(iMax, iMax2, iU, null);
        } else {
            boolean z9 = false;
            for (int i9 = 0; i9 < length; i9++) {
                C1333s c1333sV = c1333sArrJ[i9];
                if (c1333s2.f24479x != null && c1333sV.f24479x == null) {
                    r rVarB = c1333sV.b();
                    rVarB.J(c1333s2.f24479x);
                    c1333sV = rVarB.v();
                }
                if (rhVar.b(c1333s2, c1333sV).f22825d != 0) {
                    int i10 = c1333sV.f24472q;
                    z9 |= i10 == -1 || c1333sV.f24473r == -1;
                    iMax = Math.max(iMax, i10);
                    iMax2 = Math.max(iMax2, c1333sV.f24473r);
                    iU = Math.max(iU, U(rhVar, c1333sV));
                }
            }
            if (z9) {
                cd.e("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
                int i11 = c1333s2.f24473r;
                int i12 = c1333s2.f24472q;
                boolean z10 = i11 > i12;
                int i13 = z10 ? i11 : i12;
                if (true == z10) {
                    i11 = i12;
                }
                float f10 = i11 / i13;
                int[] iArr = f25082c;
                int i14 = 0;
                while (i14 < 9) {
                    int i15 = iArr[i14];
                    int[] iArr2 = iArr;
                    int i16 = (int) (i15 * f10);
                    if (i15 <= i13 || i16 <= i11) {
                        break;
                    }
                    int i17 = i11;
                    float f11 = f10;
                    if (cq.f22640a >= 21) {
                        int i18 = true != z10 ? i15 : i16;
                        if (true != z10) {
                            i15 = i16;
                        }
                        Point pointA = rhVar.a(i18, i15);
                        if (rhVar.e(pointA.x, pointA.y, c1333s2.f24474s)) {
                            point = pointA;
                            break;
                        }
                        i14++;
                        c1333s2 = c1333s;
                        iArr = iArr2;
                        i11 = i17;
                        f10 = f11;
                    } else {
                        try {
                            int iC = cq.c(i15, 16) * 16;
                            int iC2 = cq.c(i16, 16) * 16;
                            if (iC * iC2 <= rw.a()) {
                                int i19 = true != z10 ? iC : iC2;
                                if (true != z10) {
                                    iC = iC2;
                                }
                                point = new Point(i19, iC);
                            } else {
                                i14++;
                                c1333s2 = c1333s;
                                iArr = iArr2;
                                i11 = i17;
                                f10 = f11;
                            }
                        } catch (rr unused) {
                            point = null;
                        }
                    }
                }
                point = null;
                if (point != null) {
                    iMax = Math.max(iMax, point.x);
                    iMax2 = Math.max(iMax2, point.y);
                    r rVarB2 = c1333s.b();
                    rVarB2.aj(iMax);
                    rVarB2.Q(iMax2);
                    iU = Math.max(iU, T(rhVar, rVarB2.v()));
                    cd.e("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
                }
            }
            ypVar = new yp(iMax, iMax2, iU, null);
        }
        this.f25094J = ypVar;
        boolean z11 = this.f25099i;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, str);
        mediaFormat.setInteger("width", c1333s.f24472q);
        mediaFormat.setInteger("height", c1333s.f24473r);
        af.r(mediaFormat, c1333s.f24469n);
        float f12 = c1333s.f24474s;
        if (f12 != -1.0f) {
            mediaFormat.setFloat("frame-rate", f12);
        }
        af.q(mediaFormat, "rotation-degrees", c1333s.f24475t);
        C1307j c1307j = c1333s.f24479x;
        if (c1307j != null) {
            af.q(mediaFormat, "color-transfer", c1307j.f23335c);
            af.q(mediaFormat, "color-standard", c1307j.f23333a);
            af.q(mediaFormat, "color-range", c1307j.f23334b);
            byte[] bArr = c1307j.f23336d;
            if (bArr != null) {
                mediaFormat.setByteBuffer("hdr-static-info", ByteBuffer.wrap(bArr));
            }
        }
        if ("video/dolby-vision".equals(c1333s.f24467l) && (pairB = rw.b(c1333s)) != null) {
            af.q(mediaFormat, "profile", ((Integer) pairB.first).intValue());
        }
        mediaFormat.setInteger("max-width", ypVar.f25191a);
        mediaFormat.setInteger("max-height", ypVar.f25192b);
        af.q(mediaFormat, "max-input-size", ypVar.f25193c);
        if (cq.f22640a >= 23) {
            mediaFormat.setInteger(LogFactory.PRIORITY_KEY, 0);
            if (f9 != -1.0f) {
                mediaFormat.setFloat("operating-rate", f9);
            }
        }
        if (z11) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (this.f25102l == null) {
            if (!aP(rhVar)) {
                throw new IllegalStateException();
            }
            if (this.f25103m == null) {
                this.f25103m = xt.a(this.f25096f, rhVar.f24370f);
            }
            this.f25102l = this.f25103m;
        }
        return rd.b(rhVar, mediaFormat, c1333s, this.f25102l, mediaCrypto);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final List W(rm rmVar, C1333s c1333s, boolean z9) throws rr {
        return rw.f(aG(this.f25096f, rmVar, c1333s, z9, false), c1333s);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void X(Exception exc) {
        cd.c("MediaCodecVideoRenderer", "Video codec error", exc);
        this.f25098h.s(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void Y(String str) {
        this.f25098h.b(str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void Z(C1333s c1333s, MediaFormat mediaFormat) {
        rf rfVarAk = ak();
        if (rfVarAk != null) {
            rfVarAk.n(this.f25105o);
        }
        af.s(mediaFormat);
        boolean z9 = false;
        if (mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top")) {
            z9 = true;
        }
        this.f25087C = z9 ? (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1 : mediaFormat.getInteger("width");
        int integer = z9 ? (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1 : mediaFormat.getInteger("height");
        this.f25088D = integer;
        float f9 = c1333s.f24476u;
        this.f25090F = f9;
        if (cq.f22640a >= 21) {
            int i9 = c1333s.f24475t;
            if (i9 == 90 || i9 == 270) {
                int i10 = this.f25087C;
                this.f25087C = integer;
                this.f25088D = i10;
                this.f25090F = 1.0f / f9;
            }
        } else {
            this.f25089E = c1333s.f24475t;
        }
        this.f25097g.c(c1333s.f24474s);
    }

    public final void aA(long j9) {
        ep epVar = ((rk) this).f24404a;
        epVar.f22820k += j9;
        epVar.f22821l++;
        this.f25085A += j9;
        this.f25086B++;
    }

    public final void aC(rf rfVar, int i9) {
        aK();
        af.o("releaseOutputBuffer");
        rfVar.k(i9, true);
        af.p();
        this.f25116z = SystemClock.elapsedRealtime() * 1000;
        ((rk) this).f24404a.f22814e++;
        this.f25113w = 0;
        aa();
    }

    public final void aD(rf rfVar, int i9, long j9) {
        aK();
        af.o("releaseOutputBuffer");
        rfVar.j(i9, j9);
        af.p();
        this.f25116z = SystemClock.elapsedRealtime() * 1000;
        ((rk) this).f24404a.f22814e++;
        this.f25113w = 0;
        aa();
    }

    public final void aE(rf rfVar, int i9) {
        af.o("skipVideoBuffer");
        rfVar.k(i9, false);
        af.p();
        ((rk) this).f24404a.f22815f++;
    }

    public final void aa() {
        this.f25108r = true;
        if (this.f25106p) {
            return;
        }
        this.f25106p = true;
        this.f25098h.q(this.f25102l);
        this.f25104n = true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ab() {
        aH();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ac(ef efVar) throws ev {
        this.f25114x++;
        int i9 = cq.f22640a;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final boolean ae(long j9, long j10, rf rfVar, ByteBuffer byteBuffer, int i9, int i10, int i11, long j11, boolean z9, boolean z10, C1333s c1333s) throws ev {
        boolean z11;
        boolean z12;
        int iD;
        af.s(rfVar);
        if (this.f25109s == -9223372036854775807L) {
            this.f25109s = j9;
        }
        if (j11 != this.f25115y) {
            this.f25097g.d(j11);
            this.f25115y = j11;
        }
        long jAj = aj();
        if (z9 && !z10) {
            aE(rfVar, i9);
            return true;
        }
        double dAi = ai();
        boolean z13 = bg() == 2;
        long jElapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        long j12 = (long) ((j11 - j9) / dAi);
        if (z13) {
            j12 -= jElapsedRealtime - j10;
        }
        if (this.f25102l == this.f25103m) {
            if (!aO(j12)) {
                return false;
            }
            aE(rfVar, i9);
            aA(j12);
            return true;
        }
        long j13 = jElapsedRealtime - this.f25116z;
        if (this.f25108r ? this.f25106p : !(z13 || this.f25107q)) {
            z11 = z13;
            z12 = false;
        } else {
            z11 = z13;
            z12 = true;
        }
        if (this.f25110t == -9223372036854775807L && j9 >= jAj && (z12 || (z11 && aO(j12) && j13 > 100000))) {
            long jNanoTime = System.nanoTime();
            if (cq.f22640a >= 21) {
                aD(rfVar, i9, jNanoTime);
            } else {
                aC(rfVar, i9);
            }
            aA(j12);
            return true;
        }
        if (!z11 || j9 == this.f25109s) {
            return false;
        }
        long jNanoTime2 = System.nanoTime();
        long jA = this.f25097g.a((j12 * 1000) + jNanoTime2);
        long j14 = (jA - jNanoTime2) / 1000;
        long j15 = this.f25110t;
        if (j14 < -500000 && !z10 && (iD = d(j9)) != 0) {
            if (j15 != -9223372036854775807L) {
                ep epVar = ((rk) this).f24404a;
                epVar.f22813d += iD;
                epVar.f22815f += this.f25114x;
            } else {
                ((rk) this).f24404a.f22819j++;
                az(iD, this.f25114x);
            }
            ay();
            return false;
        }
        if (aO(j14) && !z10) {
            if (j15 != -9223372036854775807L) {
                aE(rfVar, i9);
            } else {
                af.o("dropVideoBuffer");
                rfVar.k(i9, false);
                af.p();
                az(0, 1);
            }
            aA(j14);
            return true;
        }
        if (cq.f22640a >= 21) {
            if (j14 < 50000) {
                aD(rfVar, i9, jA);
                aA(j14);
                return true;
            }
        } else if (j14 < 30000) {
            if (j14 > 11000) {
                try {
                    Thread.sleep(((-10000) + j14) / 1000);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return false;
                }
            }
            aC(rfVar, i9);
            aA(j14);
            return true;
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final float ag(float f9, C1333s[] c1333sArr) {
        float fMax = -1.0f;
        for (C1333s c1333s : c1333sArr) {
            float f10 = c1333s.f24474s;
            if (f10 != -1.0f) {
                fMax = Math.max(fMax, f10);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ah(String str, long j9, long j10) {
        this.f25098h.a(str, j9, j10);
        this.f25100j = aB(str);
        rh rhVarAm = am();
        af.s(rhVarAm);
        boolean z9 = false;
        if (cq.f22640a >= 29 && "video/x-vnd.on2.vp9".equals(rhVarAm.f24366b)) {
            MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArrF = rhVarAm.f();
            int length = codecProfileLevelArrF.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    break;
                }
                if (codecProfileLevelArrF[i9].profile == 16384) {
                    z9 = true;
                    break;
                }
                i9++;
            }
        }
        this.f25101k = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final rg al(Throwable th, rh rhVar) {
        return new xp(th, rhVar, this.f25102l);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    @TargetApi(29)
    public final void an(ef efVar) throws ev {
        if (this.f25101k) {
            ByteBuffer byteBuffer = efVar.f22777e;
            af.s(byteBuffer);
            if (byteBuffer.remaining() >= 7) {
                byte b9 = byteBuffer.get();
                short s9 = byteBuffer.getShort();
                short s10 = byteBuffer.getShort();
                byte b10 = byteBuffer.get();
                byte b11 = byteBuffer.get();
                byteBuffer.position(0);
                if (b9 == -75 && s9 == 60 && s10 == 1 && b10 == 4) {
                    if (b11 == 0 || b11 == 1) {
                        byte[] bArr = new byte[byteBuffer.remaining()];
                        byteBuffer.get(bArr);
                        byteBuffer.position(0);
                        rf rfVarAk = ak();
                        Bundle bundle = new Bundle();
                        bundle.putByteArray("hdr10-plus-info", bArr);
                        rfVarAk.m(bundle);
                    }
                }
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ap(long j9) {
        super.ap(j9);
        this.f25114x--;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final void ar() {
        super.ar();
        this.f25114x = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final boolean av() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk
    public final boolean aw(rh rhVar) {
        return this.f25102l != null || aP(rhVar);
    }

    public final void az(int i9, int i10) {
        ep epVar = ((rk) this).f24404a;
        epVar.f22817h += i9;
        int i11 = i9 + i10;
        epVar.f22816g += i11;
        this.f25112v += i11;
        int i12 = this.f25113w + i11;
        this.f25113w = i12;
        epVar.f22818i = Math.max(i12, epVar.f22818i);
        if (this.f25112v >= 50) {
            aJ();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.ads.interactivemedia.v3.internal.rf] */
    /* JADX WARN: Type inference failed for: r4v6, types: [com.google.ads.interactivemedia.v3.internal.yb] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.google.ads.interactivemedia.v3.internal.xt] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // com.google.ads.interactivemedia.v3.internal.eo, com.google.ads.interactivemedia.v3.internal.hd
    public final void q(int i9, Object obj) throws ev {
        if (i9 != 1) {
            if (i9 == 7) {
                this.f25093I = (xu) obj;
                return;
            }
            if (i9 == 10) {
                int iIntValue = ((Integer) obj).intValue();
                if (this.f25092H != iIntValue) {
                    this.f25092H = iIntValue;
                    return;
                }
                return;
            }
            if (i9 != 4) {
                if (i9 != 5) {
                    return;
                }
                this.f25097g.j(((Integer) obj).intValue());
                return;
            } else {
                int iIntValue2 = ((Integer) obj).intValue();
                this.f25105o = iIntValue2;
                rf rfVarAk = ak();
                if (rfVarAk != null) {
                    rfVarAk.n(iIntValue2);
                    return;
                }
                return;
            }
        }
        ?? A9 = obj instanceof Surface ? (Surface) obj : 0;
        if (A9 == 0) {
            xt xtVar = this.f25103m;
            if (xtVar != null) {
                A9 = xtVar;
            } else {
                rh rhVarAm = am();
                if (rhVarAm != null && aP(rhVarAm)) {
                    A9 = xt.a(this.f25096f, rhVarAm.f24370f);
                    this.f25103m = A9;
                }
            }
        }
        if (this.f25102l == A9) {
            if (A9 == 0 || A9 == this.f25103m) {
                return;
            }
            aL();
            if (this.f25104n) {
                this.f25098h.q(this.f25102l);
                return;
            }
            return;
        }
        this.f25102l = A9;
        this.f25097g.i(A9);
        this.f25104n = false;
        int iBg = bg();
        ?? Ak = ak();
        if (Ak != 0) {
            if (cq.f22640a < 23 || A9 == 0 || this.f25100j) {
                aq();
                ao();
            } else {
                Ak.l(A9);
            }
        }
        if (A9 == 0 || A9 == this.f25103m) {
            aI();
            aH();
            return;
        }
        aL();
        aH();
        if (iBg == 2) {
            aN();
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    public final void t() {
        aI();
        aH();
        this.f25104n = false;
        this.f25095b = null;
        try {
            super.t();
        } finally {
            this.f25098h.c(((rk) this).f24404a);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    public final void u(boolean z9, boolean z10) throws ev {
        super.u(z9, z10);
        l();
        af.w(true);
        this.f25098h.e(((rk) this).f24404a);
        this.f25107q = z10;
        this.f25108r = false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    public final void v(long j9, boolean z9) throws ev {
        super.v(j9, z9);
        aH();
        this.f25097g.f();
        this.f25115y = -9223372036854775807L;
        this.f25109s = -9223372036854775807L;
        this.f25113w = 0;
        if (z9) {
            aN();
        } else {
            this.f25110t = -9223372036854775807L;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.rk, com.google.ads.interactivemedia.v3.internal.eo
    @TargetApi(LangUtils.HASH_SEED)
    public final void w() {
        try {
            super.w();
            if (this.f25103m != null) {
                aM();
            }
        } catch (Throwable th) {
            if (this.f25103m != null) {
                aM();
            }
            throw th;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eo
    public final void x() {
        this.f25112v = 0;
        this.f25111u = SystemClock.elapsedRealtime();
        this.f25116z = SystemClock.elapsedRealtime() * 1000;
        this.f25085A = 0L;
        this.f25086B = 0;
        this.f25097g.g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.eo
    public final void y() {
        this.f25110t = -9223372036854775807L;
        aJ();
        int i9 = this.f25086B;
        if (i9 != 0) {
            this.f25098h.r(this.f25085A, i9);
            this.f25085A = 0L;
            this.f25086B = 0;
        }
        this.f25097g.h();
    }
}
