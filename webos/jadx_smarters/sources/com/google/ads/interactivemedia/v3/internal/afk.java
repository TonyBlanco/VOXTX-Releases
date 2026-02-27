package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class afk extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final afk f19446a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19447d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19449f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19453j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19454k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f19456m;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f19460q;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19448e = "";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f19450g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f19451h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f19452i = "";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f19455l = "";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f19457n = "";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f19458o = "";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private bqt f19459p = bqn.aF();

    static {
        afk afkVar = new afk();
        f19446a = afkVar;
        bqn.aL(afk.class, afkVar);
    }

    private afk() {
    }

    public static /* synthetic */ void b(afk afkVar, long j9) {
        afkVar.f19447d |= 2;
        afkVar.f19449f = j9;
    }

    public static /* synthetic */ void c(afk afkVar, String str) {
        str.getClass();
        afkVar.f19447d |= 4;
        afkVar.f19450g = str;
    }

    public static /* synthetic */ void d(afk afkVar, String str) {
        str.getClass();
        afkVar.f19447d |= 8;
        afkVar.f19451h = str;
    }

    public static /* synthetic */ void e(afk afkVar, String str) {
        afkVar.f19447d |= 16;
        afkVar.f19452i = str;
    }

    public static /* synthetic */ void f(afk afkVar, String str) {
        afkVar.f19447d |= 1024;
        afkVar.f19458o = str;
    }

    public static /* synthetic */ void g(afk afkVar, String str) {
        str.getClass();
        afkVar.f19447d |= 1;
        afkVar.f19448e = str;
    }

    public static /* synthetic */ void h(afk afkVar, int i9) {
        afkVar.f19460q = afj.b(i9);
        afkVar.f19447d |= 2048;
    }

    public static afl j() {
        return (afl) f19446a.ay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19446a, "\u0001\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\rဌ\u000b", new Object[]{"d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", afh.class, "q", afj.a()});
        }
        if (i10 == 3) {
            return new afk();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new afl(bArr, (int[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19446a;
    }
}
