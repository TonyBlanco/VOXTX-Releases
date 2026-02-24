package com.google.ads.interactivemedia.v3.internal;

import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes3.dex */
public final class abr implements zh {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f18800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f18801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f18802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte[] f18803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final UUID f18804e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Map f18805f;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private abq f18806A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private boolean f18807B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private int f18808C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private long f18809D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private boolean f18810E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f18811F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f18812G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f18813H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private ce f18814I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private ce f18815J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private boolean f18816K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private boolean f18817L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private int f18818M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f18819N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f18820O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private int f18821P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private int f18822Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private int[] f18823R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private int f18824S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private int f18825T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private int f18826U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private int f18827V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private boolean f18828W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private long f18829X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private int f18830Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private int f18831Z;
    private int aa;
    private boolean ab;
    private boolean ac;
    private boolean ad;
    private int ae;
    private byte af;
    private boolean ag;
    private zk ah;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final abn f18832g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final abt f18833h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final SparseArray f18834i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean f18835j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final cj f18836k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final cj f18837l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final cj f18838m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final cj f18839n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final cj f18840o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final cj f18841p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final cj f18842q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final cj f18843r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final cj f18844s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final cj f18845t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private ByteBuffer f18846u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f18847v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f18848w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f18849x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f18850y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f18851z;

    static {
        abo aboVar = new zn() { // from class: com.google.ads.interactivemedia.v3.internal.abo
            @Override // com.google.ads.interactivemedia.v3.internal.zn
            public final zh[] a() {
                throw null;
            }
        };
        f18800a = new byte[]{49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
        f18801b = cq.ad("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
        f18802c = new byte[]{68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
        f18803d = new byte[]{87, 69, 66, 86, 84, 84, 10, 10, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 46, 48, 48, 48, 10};
        f18804e = new UUID(72057594037932032L, -9223371306706625679L);
        HashMap map = new HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", 180);
        map.put("htc_video_rotA-270", 270);
        f18805f = Collections.unmodifiableMap(map);
    }

    public abr() {
        this(0);
    }

    public abr(int i9) {
        abl ablVar = new abl();
        this.f18848w = -1L;
        this.f18849x = -9223372036854775807L;
        this.f18850y = -9223372036854775807L;
        this.f18851z = -9223372036854775807L;
        this.f18811F = -1L;
        this.f18812G = -1L;
        this.f18813H = -9223372036854775807L;
        this.f18832g = ablVar;
        ablVar.a(new abp(this));
        this.f18835j = 1 == (i9 ^ 1);
        this.f18833h = new abt();
        this.f18834i = new SparseArray();
        this.f18838m = new cj(4);
        this.f18839n = new cj(ByteBuffer.allocate(4).putInt(-1).array());
        this.f18840o = new cj(4);
        this.f18836k = new cj(zw.f25312a);
        this.f18837l = new cj(4);
        this.f18841p = new cj();
        this.f18842q = new cj();
        this.f18843r = new cj(8);
        this.f18844s = new cj();
        this.f18845t = new cj();
        this.f18823R = new int[1];
    }

    private static int[] A(int[] iArr, int i9) {
        if (iArr == null) {
            return new int[i9];
        }
        int length = iArr.length;
        return length >= i9 ? iArr : new int[Math.max(length + length, i9)];
    }

    private final int o() {
        int i9 = this.f18831Z;
        x();
        return i9;
    }

    private final int p(zi ziVar, abq abqVar, int i9, boolean z9) throws IOException {
        int i10;
        if ("S_TEXT/UTF8".equals(abqVar.f18775b)) {
            y(ziVar, f18800a, i9);
        } else if ("S_TEXT/ASS".equals(abqVar.f18775b)) {
            y(ziVar, f18802c, i9);
        } else {
            if (!"S_TEXT/WEBVTT".equals(abqVar.f18775b)) {
                aae aaeVar = abqVar.f18770V;
                if (!this.ab) {
                    if (abqVar.f18780g) {
                        this.f18826U &= -1073741825;
                        if (!this.ac) {
                            ziVar.g(this.f18838m.H(), 0, 1);
                            this.f18830Y++;
                            if ((this.f18838m.H()[0] & 128) == 128) {
                                throw as.a("Extension bit is set in signal byte", null);
                            }
                            this.af = this.f18838m.H()[0];
                            this.ac = true;
                        }
                        byte b9 = this.af;
                        if ((b9 & 1) == 1) {
                            int i11 = b9 & 2;
                            this.f18826U |= 1073741824;
                            if (!this.ag) {
                                ziVar.g(this.f18843r.H(), 0, 8);
                                this.f18830Y += 8;
                                this.ag = true;
                                this.f18838m.H()[0] = (byte) ((i11 != 2 ? 0 : 128) | 8);
                                this.f18838m.F(0);
                                aaeVar.i(this.f18838m, 1);
                                this.f18831Z++;
                                this.f18843r.F(0);
                                aaeVar.i(this.f18843r, 8);
                                this.f18831Z += 8;
                            }
                            if (i11 == 2) {
                                if (!this.ad) {
                                    ziVar.g(this.f18838m.H(), 0, 1);
                                    this.f18830Y++;
                                    this.f18838m.F(0);
                                    this.ae = this.f18838m.i();
                                    this.ad = true;
                                }
                                int i12 = this.ae * 4;
                                this.f18838m.B(i12);
                                ziVar.g(this.f18838m.H(), 0, i12);
                                this.f18830Y += i12;
                                int i13 = (this.ae >> 1) + 1;
                                int i14 = (i13 * 6) + 2;
                                ByteBuffer byteBuffer = this.f18846u;
                                if (byteBuffer == null || byteBuffer.capacity() < i14) {
                                    this.f18846u = ByteBuffer.allocate(i14);
                                }
                                this.f18846u.position(0);
                                this.f18846u.putShort((short) i13);
                                int i15 = 0;
                                int i16 = 0;
                                while (true) {
                                    i10 = this.ae;
                                    if (i15 >= i10) {
                                        break;
                                    }
                                    int iL = this.f18838m.l();
                                    if (i15 % 2 == 0) {
                                        this.f18846u.putShort((short) (iL - i16));
                                    } else {
                                        this.f18846u.putInt(iL - i16);
                                    }
                                    i15++;
                                    i16 = iL;
                                }
                                int i17 = (i9 - this.f18830Y) - i16;
                                if ((i10 & 1) == 1) {
                                    this.f18846u.putInt(i17);
                                } else {
                                    this.f18846u.putShort((short) i17);
                                    this.f18846u.putInt(0);
                                }
                                this.f18844s.D(this.f18846u.array(), i14);
                                aaeVar.i(this.f18844s, i14);
                                this.f18831Z += i14;
                            }
                        }
                    } else {
                        byte[] bArr = abqVar.f18781h;
                        if (bArr != null) {
                            this.f18841p.D(bArr, bArr.length);
                        }
                    }
                    if (!"A_OPUS".equals(abqVar.f18775b) ? abqVar.f18779f > 0 : z9) {
                        this.f18826U |= 268435456;
                        this.f18845t.B(0);
                        int iD = (this.f18841p.d() + i9) - this.f18830Y;
                        this.f18838m.B(4);
                        this.f18838m.H()[0] = (byte) ((iD >> 24) & 255);
                        this.f18838m.H()[1] = (byte) ((iD >> 16) & 255);
                        this.f18838m.H()[2] = (byte) ((iD >> 8) & 255);
                        this.f18838m.H()[3] = (byte) (iD & 255);
                        aaeVar.i(this.f18838m, 4);
                        this.f18831Z += 4;
                    }
                    this.ab = true;
                }
                int iD2 = i9 + this.f18841p.d();
                if (!"V_MPEG4/ISO/AVC".equals(abqVar.f18775b) && !"V_MPEGH/ISO/HEVC".equals(abqVar.f18775b)) {
                    if (abqVar.f18767S != null) {
                        af.w(this.f18841p.d() == 0);
                        abqVar.f18767S.d(ziVar);
                    }
                    while (true) {
                        int i18 = this.f18830Y;
                        if (i18 >= iD2) {
                            break;
                        }
                        int iQ = q(ziVar, aaeVar, iD2 - i18);
                        this.f18830Y += iQ;
                        this.f18831Z += iQ;
                    }
                } else {
                    byte[] bArrH = this.f18837l.H();
                    bArrH[0] = 0;
                    bArrH[1] = 0;
                    bArrH[2] = 0;
                    int i19 = abqVar.f18771W;
                    int i20 = 4 - i19;
                    while (this.f18830Y < iD2) {
                        int i21 = this.aa;
                        if (i21 == 0) {
                            int iMin = Math.min(i19, this.f18841p.a());
                            ziVar.g(bArrH, i20 + iMin, i19 - iMin);
                            if (iMin > 0) {
                                this.f18841p.A(bArrH, i20, iMin);
                            }
                            this.f18830Y += i19;
                            this.f18837l.F(0);
                            this.aa = this.f18837l.l();
                            this.f18836k.F(0);
                            aaeVar.e(this.f18836k, 4);
                            this.f18831Z += 4;
                        } else {
                            int iQ2 = q(ziVar, aaeVar, i21);
                            this.f18830Y += iQ2;
                            this.f18831Z += iQ2;
                            this.aa -= iQ2;
                        }
                    }
                }
                if ("A_VORBIS".equals(abqVar.f18775b)) {
                    this.f18839n.F(0);
                    aaeVar.e(this.f18839n, 4);
                    this.f18831Z += 4;
                }
                return o();
            }
            y(ziVar, f18803d, i9);
        }
        return o();
    }

    private final int q(zi ziVar, aae aaeVar, int i9) throws IOException {
        int iA = this.f18841p.a();
        if (iA <= 0) {
            return aaeVar.a(ziVar, i9, false);
        }
        int iMin = Math.min(i9, iA);
        aaeVar.e(this.f18841p, iMin);
        return iMin;
    }

    private final long r(long j9) throws as {
        long j10 = this.f18849x;
        if (j10 != -9223372036854775807L) {
            return cq.w(j9, j10, 1000L);
        }
        throw as.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    private final void s(int i9) throws as {
        if (this.f18814I == null || this.f18815J == null) {
            throw as.a("Element " + i9 + " must be in a Cues", null);
        }
    }

    private final void t(int i9) throws as {
        if (this.f18806A != null) {
            return;
        }
        throw as.a("Element " + i9 + " must be in a TrackEntry", null);
    }

    private final void u() {
        af.t(this.ah);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00de A[EDGE_INSN: B:63:0x00de->B:52:0x00de BREAK  A[LOOP:0: B:46:0x00c3->B:51:0x00db], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void v(com.google.ads.interactivemedia.v3.internal.abq r18, long r19, int r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.abr.v(com.google.ads.interactivemedia.v3.internal.abq, long, int, int, int):void");
    }

    private final void w(zi ziVar, int i9) throws IOException {
        if (this.f18838m.d() >= i9) {
            return;
        }
        if (this.f18838m.b() < i9) {
            cj cjVar = this.f18838m;
            int iB = cjVar.b();
            cjVar.y(Math.max(iB + iB, i9));
        }
        ziVar.g(this.f18838m.H(), this.f18838m.d(), i9 - this.f18838m.d());
        this.f18838m.E(i9);
    }

    private final void x() {
        this.f18830Y = 0;
        this.f18831Z = 0;
        this.aa = 0;
        this.ab = false;
        this.ac = false;
        this.ad = false;
        this.ae = 0;
        this.af = (byte) 0;
        this.ag = false;
        this.f18841p.B(0);
    }

    private final void y(zi ziVar, byte[] bArr, int i9) throws IOException {
        int length = bArr.length;
        int i10 = length + i9;
        if (this.f18842q.b() < i10) {
            this.f18842q.C(Arrays.copyOf(bArr, i10 + i9));
        } else {
            System.arraycopy(bArr, 0, this.f18842q.H(), 0, length);
        }
        ziVar.g(this.f18842q.H(), length, i9);
        this.f18842q.F(0);
        this.f18842q.E(i10);
    }

    private static byte[] z(long j9, String str, long j10) {
        af.u(j9 != -9223372036854775807L);
        int i9 = (int) (j9 / 3600000000L);
        long j11 = j9 - (((long) i9) * 3600000000L);
        int i10 = (int) (j11 / 60000000);
        long j12 = j11 - (((long) i10) * 60000000);
        int i11 = (int) (j12 / 1000000);
        return cq.ad(String.format(Locale.US, str, Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf((int) ((j12 - (((long) i11) * 1000000)) / j10))));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final boolean C(zi ziVar) throws IOException {
        return new abs().a(ziVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final int a(zi ziVar, zy zyVar) throws IOException {
        this.f18817L = false;
        while (!this.f18817L) {
            if (!this.f18832g.c(ziVar)) {
                for (int i9 = 0; i9 < this.f18834i.size(); i9++) {
                    abq abqVar = (abq) this.f18834i.valueAt(i9);
                    abq.d(abqVar);
                    aaf aafVar = abqVar.f18767S;
                    if (aafVar != null) {
                        aafVar.a(abqVar.f18770V, abqVar.f18782i);
                    }
                }
                return -1;
            }
            long jD = ziVar.d();
            if (this.f18810E) {
                this.f18812G = jD;
                zyVar.f25320a = this.f18811F;
                this.f18810E = false;
                return 1;
            }
            if (this.f18807B) {
                long j9 = this.f18812G;
                if (j9 != -1) {
                    zyVar.f25320a = j9;
                    this.f18812G = -1L;
                    return 1;
                }
            }
        }
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void b(zk zkVar) {
        this.ah = zkVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void c() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zh
    public final void d(long j9, long j10) {
        this.f18813H = -9223372036854775807L;
        this.f18818M = 0;
        this.f18832g.b();
        this.f18833h.e();
        x();
        for (int i9 = 0; i9 < this.f18834i.size(); i9++) {
            aaf aafVar = ((abq) this.f18834i.valueAt(i9)).f18767S;
            if (aafVar != null) {
                aafVar.b();
            }
        }
    }

    public final abq f(int i9) throws as {
        t(i9);
        return this.f18806A;
    }

    public final void i(int i9, int i10, zi ziVar) throws IOException {
        long j9;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = i9;
        Throwable th = null;
        int i17 = 1;
        int i18 = 0;
        if (i16 != 161 && i16 != 163) {
            if (i16 == 165) {
                if (this.f18818M != 2) {
                    return;
                }
                abq abqVar = (abq) this.f18834i.get(this.f18824S);
                if (this.f18827V != 4 || !"V_VP9".equals(abqVar.f18775b)) {
                    ziVar.i(i10);
                    return;
                } else {
                    this.f18845t.B(i10);
                    ziVar.g(this.f18845t.H(), 0, i10);
                    return;
                }
            }
            if (i16 == 16877) {
                abq abqVarF = f(i9);
                if (abqVarF.f18772X != 1685485123 && abqVarF.f18772X != 1685480259) {
                    ziVar.i(i10);
                    return;
                }
                byte[] bArr = new byte[i10];
                abqVarF.f18761M = bArr;
                ziVar.g(bArr, 0, i10);
                return;
            }
            if (i16 == 16981) {
                t(i9);
                byte[] bArr2 = new byte[i10];
                this.f18806A.f18781h = bArr2;
                ziVar.g(bArr2, 0, i10);
                return;
            }
            if (i16 == 18402) {
                byte[] bArr3 = new byte[i10];
                ziVar.g(bArr3, 0, i10);
                f(i9).f18782i = new aad(1, bArr3, 0, 0);
                return;
            }
            if (i16 == 21419) {
                Arrays.fill(this.f18840o.H(), (byte) 0);
                ziVar.g(this.f18840o.H(), 4 - i10, i10);
                this.f18840o.F(0);
                this.f18808C = (int) this.f18840o.p();
                return;
            }
            if (i16 == 25506) {
                t(i9);
                byte[] bArr4 = new byte[i10];
                this.f18806A.f18783j = bArr4;
                ziVar.g(bArr4, 0, i10);
                return;
            }
            if (i16 != 30322) {
                throw as.a("Unexpected id: " + i16, null);
            }
            t(i9);
            byte[] bArr5 = new byte[i10];
            this.f18806A.f18794u = bArr5;
            ziVar.g(bArr5, 0, i10);
            return;
        }
        if (this.f18818M == 0) {
            this.f18824S = (int) this.f18833h.d(ziVar, false, true, 8);
            this.f18825T = this.f18833h.a();
            this.f18820O = -9223372036854775807L;
            this.f18818M = 1;
            this.f18838m.B(0);
        }
        abq abqVar2 = (abq) this.f18834i.get(this.f18824S);
        if (abqVar2 == null) {
            ziVar.i(i10 - this.f18825T);
            this.f18818M = 0;
            return;
        }
        abq.d(abqVar2);
        if (this.f18818M == 1) {
            w(ziVar, 3);
            int i19 = (this.f18838m.H()[2] & 6) >> 1;
            byte b9 = 255;
            if (i19 == 0) {
                this.f18822Q = 1;
                int[] iArrA = A(this.f18823R, 1);
                this.f18823R = iArrA;
                iArrA[0] = (i10 - this.f18825T) - 3;
            } else {
                w(ziVar, 4);
                int i20 = (this.f18838m.H()[3] & 255) + 1;
                this.f18822Q = i20;
                int[] iArrA2 = A(this.f18823R, i20);
                this.f18823R = iArrA2;
                if (i19 == 2) {
                    int i21 = this.f18825T;
                    int i22 = this.f18822Q;
                    Arrays.fill(iArrA2, 0, i22, ((i10 - i21) - 4) / i22);
                } else {
                    if (i19 != 1) {
                        if (i19 != 3) {
                            throw as.a("Unexpected lacing value: 2", null);
                        }
                        int i23 = 0;
                        int i24 = 4;
                        int i25 = 0;
                        while (true) {
                            int i26 = this.f18822Q - 1;
                            if (i23 >= i26) {
                                this.f18823R[i26] = ((i10 - this.f18825T) - i24) - i25;
                                break;
                            }
                            this.f18823R[i23] = i18;
                            int i27 = i24 + 1;
                            w(ziVar, i27);
                            if (this.f18838m.H()[i24] == 0) {
                                throw as.a("No valid varint length mask found", th);
                            }
                            int i28 = 0;
                            while (true) {
                                if (i28 >= 8) {
                                    j9 = 0;
                                    i11 = i27;
                                    break;
                                }
                                int i29 = i17 << (7 - i28);
                                if ((this.f18838m.H()[i24] & i29) != 0) {
                                    int i30 = i27 + i28;
                                    w(ziVar, i30);
                                    int i31 = i24 + 1;
                                    j9 = this.f18838m.H()[i24] & b9 & (~i29);
                                    while (i31 < i30) {
                                        j9 = (j9 << 8) | ((long) (this.f18838m.H()[i31] & b9));
                                        i31++;
                                        i30 = i30;
                                        b9 = 255;
                                    }
                                    i11 = i30;
                                    if (i23 > 0) {
                                        j9 -= (1 << ((i28 * 7) + 6)) - 1;
                                    }
                                } else {
                                    i28++;
                                    i17 = 1;
                                    b9 = 255;
                                }
                            }
                            if (j9 < -2147483648L || j9 > 2147483647L) {
                                break;
                            }
                            int i32 = (int) j9;
                            int[] iArr = this.f18823R;
                            if (i23 != 0) {
                                i32 += iArr[i23 - 1];
                            }
                            iArr[i23] = i32;
                            i25 += i32;
                            i23++;
                            i24 = i11;
                            th = null;
                            i17 = 1;
                            i18 = 0;
                            b9 = 255;
                        }
                        throw as.a("EBML lacing sample size out of range.", null);
                    }
                    int i33 = 0;
                    int i34 = 0;
                    int i35 = 4;
                    while (true) {
                        i12 = this.f18822Q - 1;
                        if (i33 >= i12) {
                            break;
                        }
                        this.f18823R[i33] = 0;
                        while (true) {
                            i13 = i35 + 1;
                            w(ziVar, i13);
                            int i36 = this.f18838m.H()[i35] & 255;
                            int[] iArr2 = this.f18823R;
                            i14 = iArr2[i33] + i36;
                            iArr2[i33] = i14;
                            if (i36 != 255) {
                                break;
                            } else {
                                i35 = i13;
                            }
                        }
                        i34 += i14;
                        i33++;
                        i35 = i13;
                    }
                    this.f18823R[i12] = ((i10 - this.f18825T) - i35) - i34;
                }
            }
            this.f18819N = this.f18813H + r((this.f18838m.H()[0] << 8) | (this.f18838m.H()[1] & 255));
            if (abqVar2.f18777d == 2) {
                i15 = 1;
                this.f18826U = i15;
                this.f18818M = 2;
                this.f18821P = 0;
            } else {
                if (i16 == 163) {
                    if ((this.f18838m.H()[2] & 128) == 128) {
                        i16 = 163;
                        i15 = 1;
                        this.f18826U = i15;
                        this.f18818M = 2;
                        this.f18821P = 0;
                    } else {
                        i16 = 163;
                    }
                }
                i15 = 0;
                this.f18826U = i15;
                this.f18818M = 2;
                this.f18821P = 0;
            }
        }
        if (i16 == 163) {
            while (true) {
                int i37 = this.f18821P;
                if (i37 >= this.f18822Q) {
                    this.f18818M = 0;
                    return;
                }
                v(abqVar2, ((long) ((this.f18821P * abqVar2.f18778e) / 1000)) + this.f18819N, this.f18826U, p(ziVar, abqVar2, this.f18823R[i37], false), 0);
                this.f18821P++;
            }
        } else {
            while (true) {
                int i38 = this.f18821P;
                if (i38 >= this.f18822Q) {
                    return;
                }
                int[] iArr3 = this.f18823R;
                iArr3[i38] = p(ziVar, abqVar2, iArr3[i38], true);
                this.f18821P++;
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:186:0x030a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(int r21) throws com.google.ads.interactivemedia.v3.internal.as {
        /*
            Method dump skipped, instruction units count: 1136
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.abr.j(int):void");
    }

    public final void k(int i9, double d9) throws as {
        if (i9 == 181) {
            f(i9).f18764P = (int) d9;
            return;
        }
        if (i9 == 17545) {
            this.f18850y = (long) d9;
            return;
        }
        switch (i9) {
            case 21969:
                f(i9).f18751C = (float) d9;
                break;
            case 21970:
                f(i9).f18752D = (float) d9;
                break;
            case 21971:
                f(i9).f18753E = (float) d9;
                break;
            case 21972:
                f(i9).f18754F = (float) d9;
                break;
            case 21973:
                f(i9).f18755G = (float) d9;
                break;
            case 21974:
                f(i9).f18756H = (float) d9;
                break;
            case 21975:
                f(i9).f18757I = (float) d9;
                break;
            case 21976:
                f(i9).f18758J = (float) d9;
                break;
            case 21977:
                f(i9).f18759K = (float) d9;
                break;
            case 21978:
                f(i9).f18760L = (float) d9;
                break;
            default:
                switch (i9) {
                    case 30323:
                        f(i9).f18791r = (float) d9;
                        break;
                    case 30324:
                        f(i9).f18792s = (float) d9;
                        break;
                    case 30325:
                        f(i9).f18793t = (float) d9;
                        break;
                }
                break;
        }
    }

    public final void l(int i9, long j9) throws as {
        if (i9 == 20529) {
            if (j9 == 0) {
                return;
            }
            throw as.a("ContentEncodingOrder " + j9 + " not supported", null);
        }
        if (i9 == 20530) {
            if (j9 == 1) {
                return;
            }
            throw as.a("ContentEncodingScope " + j9 + " not supported", null);
        }
        switch (i9) {
            case 131:
                f(i9).f18777d = (int) j9;
                return;
            case 136:
                f(i9).f18769U = j9 == 1;
                return;
            case 155:
                this.f18820O = r(j9);
                return;
            case 159:
                f(i9).f18762N = (int) j9;
                return;
            case 176:
                f(i9).f18785l = (int) j9;
                return;
            case 179:
                s(i9);
                this.f18814I.c(r(j9));
                return;
            case 186:
                f(i9).f18786m = (int) j9;
                return;
            case 215:
                f(i9).f18776c = (int) j9;
                return;
            case 231:
                this.f18813H = r(j9);
                return;
            case 238:
                this.f18827V = (int) j9;
                return;
            case 241:
                if (this.f18816K) {
                    return;
                }
                s(i9);
                this.f18815J.c(j9);
                this.f18816K = true;
                return;
            case 251:
                this.f18828W = true;
                return;
            case 16871:
                f(i9).f18772X = (int) j9;
                return;
            case 16980:
                if (j9 == 3) {
                    return;
                }
                throw as.a("ContentCompAlgo " + j9 + " not supported", null);
            case 17029:
                if (j9 < 1 || j9 > 2) {
                    throw as.a("DocTypeReadVersion " + j9 + " not supported", null);
                }
                return;
            case 17143:
                if (j9 == 1) {
                    return;
                }
                throw as.a("EBMLReadVersion " + j9 + " not supported", null);
            case 18401:
                if (j9 == 5) {
                    return;
                }
                throw as.a("ContentEncAlgo " + j9 + " not supported", null);
            case 18408:
                if (j9 == 1) {
                    return;
                }
                throw as.a("AESSettingsCipherMode " + j9 + " not supported", null);
            case 21420:
                this.f18809D = j9 + this.f18848w;
                return;
            case 21432:
                t(i9);
                int i10 = (int) j9;
                if (i10 == 0) {
                    this.f18806A.f18795v = 0;
                    return;
                }
                if (i10 == 1) {
                    this.f18806A.f18795v = 2;
                    return;
                } else if (i10 == 3) {
                    this.f18806A.f18795v = 1;
                    return;
                } else {
                    if (i10 != 15) {
                        return;
                    }
                    this.f18806A.f18795v = 3;
                    return;
                }
            case 21680:
                f(i9).f18787n = (int) j9;
                return;
            case 21682:
                f(i9).f18789p = (int) j9;
                return;
            case 21690:
                f(i9).f18788o = (int) j9;
                return;
            case 21930:
                f(i9).f18768T = j9 == 1;
                return;
            case 21998:
                f(i9).f18779f = (int) j9;
                return;
            case 22186:
                f(i9).f18765Q = j9;
                return;
            case 22203:
                f(i9).f18766R = j9;
                return;
            case 25188:
                f(i9).f18763O = (int) j9;
                return;
            case 30114:
                this.f18829X = j9;
                return;
            case 30321:
                t(i9);
                int i11 = (int) j9;
                if (i11 == 0) {
                    this.f18806A.f18790q = 0;
                    return;
                }
                if (i11 == 1) {
                    this.f18806A.f18790q = 1;
                    return;
                } else if (i11 == 2) {
                    this.f18806A.f18790q = 2;
                    return;
                } else {
                    if (i11 != 3) {
                        return;
                    }
                    this.f18806A.f18790q = 3;
                    return;
                }
            case 2352003:
                f(i9).f18778e = (int) j9;
                return;
            case 2807729:
                this.f18849x = j9;
                return;
            default:
                switch (i9) {
                    case 21945:
                        t(i9);
                        int i12 = (int) j9;
                        if (i12 == 1) {
                            this.f18806A.f18799z = 2;
                            return;
                        } else {
                            if (i12 != 2) {
                                return;
                            }
                            this.f18806A.f18799z = 1;
                            return;
                        }
                    case 21946:
                        t(i9);
                        int iB = C1307j.b((int) j9);
                        if (iB != -1) {
                            this.f18806A.f18798y = iB;
                            return;
                        }
                        return;
                    case 21947:
                        t(i9);
                        abq abqVar = this.f18806A;
                        abqVar.f18796w = true;
                        int iA = C1307j.a((int) j9);
                        if (iA != -1) {
                            abqVar.f18797x = iA;
                            return;
                        }
                        return;
                    case 21948:
                        f(i9).f18749A = (int) j9;
                        return;
                    case 21949:
                        f(i9).f18750B = (int) j9;
                        return;
                    default:
                        return;
                }
        }
    }

    public final void m(int i9, long j9, long j10) throws as {
        u();
        if (i9 == 160) {
            this.f18828W = false;
            this.f18829X = 0L;
            return;
        }
        if (i9 == 174) {
            this.f18806A = new abq();
            return;
        }
        if (i9 == 187) {
            this.f18816K = false;
            return;
        }
        if (i9 == 19899) {
            this.f18808C = -1;
            this.f18809D = -1L;
            return;
        }
        if (i9 == 20533) {
            f(i9).f18780g = true;
            return;
        }
        if (i9 == 21968) {
            f(i9).f18796w = true;
            return;
        }
        if (i9 == 408125543) {
            long j11 = this.f18848w;
            if (j11 != -1 && j11 != j9) {
                throw as.a("Multiple Segment elements not supported", null);
            }
            this.f18848w = j9;
            this.f18847v = j10;
            return;
        }
        if (i9 == 475249515) {
            this.f18814I = new ce();
            this.f18815J = new ce();
        } else if (i9 == 524531317 && !this.f18807B) {
            if (this.f18835j && this.f18811F != -1) {
                this.f18810E = true;
            } else {
                this.ah.x(new aaa(this.f18851z));
                this.f18807B = true;
            }
        }
    }
}
