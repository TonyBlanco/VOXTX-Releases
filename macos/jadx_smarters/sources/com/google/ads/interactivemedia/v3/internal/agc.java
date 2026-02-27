package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import okio.Segment;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
public final class agc extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final agc f19595a;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private long f19596A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    private long f19597B;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private long f19601F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private long f19602G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private long f19603H;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    private long f19605J;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    private agd f19608M;
    private afz aC;
    private long aI;
    private afv aL;
    private afw aM;
    private long aN;
    private boolean aQ;
    private long aS;
    private agj aT;
    private aga ae;
    private agb ag;
    private int ar;
    private int as;
    private int at;
    private agk au;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19622d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19623e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f19624f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19627i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19628j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19629k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f19632n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f19633o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private long f19634p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f19635q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private long f19636r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private long f19638t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f19639u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f19640v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f19641w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private long f19642x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private long f19643y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private long f19644z;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19625g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f19626h = "";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f19637s = "";

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    private String f19598C = "";

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    private String f19599D = "D";

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    private String f19600E = "";

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    private String f19604I = "";

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    private long f19606K = -1;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    private long f19607L = -1;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    private long f19609N = -1;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private long f19610O = -1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    private long f19611P = -1;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    private long f19612Q = -1;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    private long f19613R = -1;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    private long f19614S = -1;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    private String f19615T = "D";

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    private String f19616U = "D";

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    private long f19617V = -1;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    private int f19618W = 1000;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    private int f19619X = 1000;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    private long f19620Y = -1;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    private long f19621Z = -1;
    private long aa = -1;
    private long ab = -1;
    private long ac = -1;
    private int ad = 1000;
    private bqt af = bqn.aF();
    private long ah = -1;
    private long ai = -1;
    private long aj = -1;
    private long ak = -1;
    private long al = -1;
    private long am = -1;
    private long an = -1;
    private long ao = -1;
    private String ap = "D";
    private long aq = -1;
    private long av = -1;
    private int aw = 1000;
    private int ax = 1000;
    private String ay = "D";
    private bqt az = bqn.aF();
    private int aA = 1000;
    private bqt aB = bqn.aF();
    private String aD = "";
    private long aE = -1;
    private long aF = -1;
    private long aG = -1;
    private long aH = -1;
    private long aJ = -1;
    private String aK = "";
    private String aO = "";
    private int aP = 2;
    private String aR = "";
    private long aU = -1;
    private String aV = "";

    static {
        agc agcVar = new agc();
        f19595a = agcVar;
        bqn.aL(agc.class, agcVar);
    }

    private agc() {
    }

    public static /* synthetic */ void A(agc agcVar, String str) {
        str.getClass();
        agcVar.f19622d |= 268435456;
        agcVar.f19604I = str;
    }

    public static /* synthetic */ void B(agc agcVar, long j9) {
        agcVar.f19622d |= 536870912;
        agcVar.f19605J = j9;
    }

    public static /* synthetic */ void C(agc agcVar, long j9) {
        agcVar.f19622d |= 1073741824;
        agcVar.f19606K = j9;
    }

    public static /* synthetic */ void D(agc agcVar, long j9) {
        agcVar.f19622d |= Integer.MIN_VALUE;
        agcVar.f19607L = j9;
    }

    public static /* synthetic */ void E(agc agcVar, long j9) {
        agcVar.f19623e |= 2;
        agcVar.f19609N = j9;
    }

    public static /* synthetic */ void F(agc agcVar, long j9) {
        agcVar.f19623e |= 4;
        agcVar.f19610O = j9;
    }

    public static /* synthetic */ void G(agc agcVar, long j9) {
        agcVar.f19623e |= 8;
        agcVar.f19611P = j9;
    }

    public static /* synthetic */ void H(agc agcVar, long j9) {
        agcVar.f19623e |= 16;
        agcVar.f19612Q = j9;
    }

    public static /* synthetic */ void I(agc agcVar, long j9) {
        agcVar.f19623e |= 32;
        agcVar.f19613R = j9;
    }

    public static /* synthetic */ void J(agc agcVar, long j9) {
        agcVar.f19623e |= 64;
        agcVar.f19614S = j9;
    }

    public static /* synthetic */ void K(agc agcVar, String str) {
        str.getClass();
        agcVar.f19623e |= 128;
        agcVar.f19615T = str;
    }

    public static /* synthetic */ void L(agc agcVar, String str) {
        str.getClass();
        agcVar.f19623e |= JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        agcVar.f19616U = str;
    }

    public static /* synthetic */ void M(agc agcVar, long j9) {
        agcVar.f19623e |= 4096;
        agcVar.f19620Y = j9;
    }

    public static /* synthetic */ void N(agc agcVar, long j9) {
        agcVar.f19623e |= Segment.SIZE;
        agcVar.f19621Z = j9;
    }

    public static /* synthetic */ void O(agc agcVar, long j9) {
        agcVar.f19623e |= Http2.INITIAL_MAX_FRAME_SIZE;
        agcVar.aa = j9;
    }

    public static /* synthetic */ void P(agc agcVar, aga agaVar) {
        agaVar.getClass();
        agcVar.ae = agaVar;
        agcVar.f19623e |= 262144;
    }

    public static /* synthetic */ void Q(agc agcVar, aga agaVar) {
        agaVar.getClass();
        agcVar.aS();
        agcVar.af.add(agaVar);
    }

    public static /* synthetic */ void S(agc agcVar, agb agbVar) {
        agbVar.getClass();
        agcVar.ag = agbVar;
        agcVar.f19623e |= 524288;
    }

    public static /* synthetic */ void T(agc agcVar, long j9) {
        agcVar.f19623e |= 2097152;
        agcVar.ai = j9;
    }

    public static /* synthetic */ void U(agc agcVar, long j9) {
        agcVar.f19623e |= 4194304;
        agcVar.aj = j9;
    }

    public static /* synthetic */ void V(agc agcVar, long j9) {
        agcVar.f19623e |= 8388608;
        agcVar.ak = j9;
    }

    public static /* synthetic */ void W(agc agcVar, long j9) {
        agcVar.f19623e |= 67108864;
        agcVar.an = j9;
    }

    public static /* synthetic */ void X(agc agcVar, long j9) {
        agcVar.f19623e |= 134217728;
        agcVar.ao = j9;
    }

    public static /* synthetic */ void Y(agc agcVar, String str) {
        str.getClass();
        agcVar.f19623e |= 268435456;
        agcVar.ap = str;
    }

    public static /* synthetic */ void Z(agc agcVar, agk agkVar) {
        agkVar.getClass();
        agcVar.au = agkVar;
        agcVar.f19624f |= 2;
    }

    private final void aS() {
        bqt bqtVar = this.af;
        if (bqtVar.c()) {
            return;
        }
        this.af = bqn.aG(bqtVar);
    }

    public static /* synthetic */ void aa(agc agcVar, long j9) {
        agcVar.f19624f |= IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED;
        agcVar.aE = j9;
    }

    public static /* synthetic */ void ab(agc agcVar, long j9) {
        agcVar.f19624f |= 1024;
        agcVar.aF = j9;
    }

    public static /* synthetic */ void ac(agc agcVar, long j9) {
        agcVar.f19624f |= 2048;
        agcVar.aG = j9;
    }

    public static /* synthetic */ void ad(agc agcVar, long j9) {
        agcVar.f19624f |= 4096;
        agcVar.aH = j9;
    }

    public static /* synthetic */ void ae(agc agcVar, String str) {
        str.getClass();
        agcVar.f19624f |= 32768;
        agcVar.aK = str;
    }

    public static /* synthetic */ void af(agc agcVar, String str) {
        str.getClass();
        agcVar.f19624f |= 524288;
        agcVar.aO = str;
    }

    public static /* synthetic */ void ag(agc agcVar, boolean z9) {
        agcVar.f19624f |= 2097152;
        agcVar.aQ = z9;
    }

    public static /* synthetic */ void ah(agc agcVar, long j9) {
        agcVar.f19624f |= 8388608;
        agcVar.aS = j9;
    }

    public static /* synthetic */ void am(agc agcVar, int i9) {
        agcVar.f19618W = agh.b(i9);
        agcVar.f19623e |= 1024;
    }

    public static /* synthetic */ void an(agc agcVar, int i9) {
        agcVar.f19619X = agh.b(i9);
        agcVar.f19623e |= 2048;
    }

    public static /* synthetic */ void ao(agc agcVar, int i9) {
        agcVar.ad = agh.b(i9);
        agcVar.f19623e |= 131072;
    }

    public static /* synthetic */ void ap(agc agcVar, int i9) {
        agcVar.aw = agh.b(i9);
        agcVar.f19624f |= 8;
    }

    public static /* synthetic */ void aq(agc agcVar, int i9) {
        agcVar.ax = agh.b(i9);
        agcVar.f19624f |= 16;
    }

    public static /* synthetic */ void ar(agc agcVar, int i9) {
        agcVar.aP = aft.b(i9);
        agcVar.f19624f |= Constants.MB;
    }

    public static agl as() {
        return (agl) f19595a.ay();
    }

    public static agc b() {
        return f19595a;
    }

    public static agc c(byte[] bArr, bqb bqbVar) throws bqw {
        return (agc) bqn.aD(f19595a, bArr, bqbVar);
    }

    public static /* synthetic */ void g(agc agcVar, String str) {
        str.getClass();
        agcVar.f19622d |= 1;
        agcVar.f19625g = str;
    }

    public static /* synthetic */ void h(agc agcVar, String str) {
        str.getClass();
        agcVar.f19622d |= 2;
        agcVar.f19626h = str;
    }

    public static /* synthetic */ void j(agc agcVar, long j9) {
        agcVar.f19622d |= 4;
        agcVar.f19627i = j9;
    }

    public static /* synthetic */ void k(agc agcVar, long j9) {
        agcVar.f19622d |= 16;
        agcVar.f19629k = j9;
    }

    public static /* synthetic */ void l(agc agcVar, long j9) {
        agcVar.f19622d |= 32;
        agcVar.f19630l = j9;
    }

    public static /* synthetic */ void m(agc agcVar, long j9) {
        agcVar.f19622d |= 1024;
        agcVar.f19635q = j9;
    }

    public static /* synthetic */ void n(agc agcVar, long j9) {
        agcVar.f19622d |= 2048;
        agcVar.f19636r = j9;
    }

    public static /* synthetic */ void o(agc agcVar, long j9) {
        agcVar.f19622d |= Segment.SIZE;
        agcVar.f19638t = j9;
    }

    public static /* synthetic */ void p(agc agcVar, long j9) {
        agcVar.f19622d |= Http2.INITIAL_MAX_FRAME_SIZE;
        agcVar.f19639u = j9;
    }

    public static /* synthetic */ void q(agc agcVar, long j9) {
        agcVar.f19622d |= 32768;
        agcVar.f19640v = j9;
    }

    public static /* synthetic */ void r(agc agcVar, long j9) {
        agcVar.f19622d |= 65536;
        agcVar.f19641w = j9;
    }

    public static /* synthetic */ void s(agc agcVar, long j9) {
        agcVar.f19622d |= 524288;
        agcVar.f19644z = j9;
    }

    public static /* synthetic */ void t(agc agcVar, long j9) {
        agcVar.f19622d |= Constants.MB;
        agcVar.f19596A = j9;
    }

    public static /* synthetic */ void u(agc agcVar, long j9) {
        agcVar.f19622d |= 2097152;
        agcVar.f19597B = j9;
    }

    public static /* synthetic */ void v(agc agcVar, String str) {
        str.getClass();
        agcVar.f19622d |= 4194304;
        agcVar.f19598C = str;
    }

    public static /* synthetic */ void w(agc agcVar, String str) {
        str.getClass();
        agcVar.f19622d |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
        agcVar.f19600E = str;
    }

    public static /* synthetic */ void x(agc agcVar, long j9) {
        agcVar.f19622d |= 33554432;
        agcVar.f19601F = j9;
    }

    public static /* synthetic */ void y(agc agcVar, long j9) {
        agcVar.f19622d |= 67108864;
        agcVar.f19602G = j9;
    }

    public static /* synthetic */ void z(agc agcVar, long j9) {
        agcVar.f19622d |= 134217728;
        agcVar.f19603H = j9;
    }

    public final boolean ai() {
        return this.aQ;
    }

    public final boolean aj() {
        return (this.f19622d & 4194304) != 0;
    }

    public final boolean ak() {
        return (this.f19624f & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
    }

    public final int al() {
        int iC = aft.c(this.aP);
        return iC == 0 ? aft.f19502c : iC;
    }

    public final agj d() {
        agj agjVar = this.aT;
        return agjVar == null ? agj.c() : agjVar;
    }

    public final String e() {
        return this.aO;
    }

    public final String f() {
        return this.f19598C;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19595a, "\u0001^\u0000\u0003\u0001Į^\u0000\u0003\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဈ\f\u000eဂ\r\u000fဂ\u000e\u0010ဂ\u000f\u0011ဂ\u0010\u0012ဂ\u0011\u0013ဂ\u0012\u0014ဂ\u0013\u0015ဂR\u0016ဂ\u0014\u0017ဂ\u0015\u0018ဈS\u0019ဂW\u001aဌT\u001bဈ\u0016\u001cဇU\u001dဈ\u0018\u001eဈV\u001fဂ\u0019 ဂ\u001a!ဂ\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဂ\u001f&ဉ 'ဂ!(ဂ\")ဂ#*ဂ$+\u001b,ဂ%-ဂ&.ဈ'/ဈ(0ဌ*1ဌ+2ဉ23ဂ,4ဂ-5ဂ.6ဂ/7ဂ08ဌ19ဉ3:ဂ4;ဂ5<ဂ6=ဂ7>ဂ:?ဂ;@ဂ=Aဌ>Bဌ?Cဈ<Dဌ@EဉAFဂBGဂ8Hဂ9IဌCJဂ)Kဈ\u0017LဌDMဈEN\u001bOဌFP\u001bQဉGRဈHSဂITဂJUဂKVဂLWဂMXဂNYဈOZဉP[ဉQÉဉXĭဂYĮဈZ", new Object[]{"d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z", "aN", "A", "B", "aO", "aS", "aP", aft.a(), "C", "aQ", "E", "aR", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "af", aga.class, "R", "S", "T", "U", "W", agh.a(), "X", agh.a(), "ae", "Y", "Z", "aa", "ab", "ac", "ad", agh.a(), "ag", "ah", "ai", "aj", "ak", "an", "ao", "aq", "ar", agg.a(), "as", agi.a(), "ap", "at", afq.a(), "au", "av", "al", "am", "aw", agh.a(), "V", "D", "ax", agh.a(), "ay", "az", afy.class, "aA", agh.a(), "aB", afr.class, "aC", "aD", "aE", "aF", "aG", "aH", "aI", "aJ", "aK", "aL", "aM", "aT", "aU", "aV"});
        }
        if (i10 == 3) {
            return new agc();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (byte[][]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f19595a;
    }
}
