package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class agb extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final agb f19585a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f19587e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f19588f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f19589g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f19590h = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f19591i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f19592j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f19593k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f19594l = -1;

    static {
        agb agbVar = new agb();
        f19585a = agbVar;
        bqn.aL(agb.class, agbVar);
    }

    private agb() {
    }

    public static /* synthetic */ void b(agb agbVar, long j9) {
        agbVar.f19586d |= 1;
        agbVar.f19587e = j9;
    }

    public static /* synthetic */ void c(agb agbVar, long j9) {
        agbVar.f19586d |= 4;
        agbVar.f19589g = j9;
    }

    public static /* synthetic */ void d(agb agbVar, long j9) {
        agbVar.f19586d |= 8;
        agbVar.f19590h = j9;
    }

    public static /* synthetic */ void e(agb agbVar, long j9) {
        agbVar.f19586d |= 16;
        agbVar.f19591i = j9;
    }

    public static /* synthetic */ void f(agb agbVar, long j9) {
        agbVar.f19586d |= 32;
        agbVar.f19592j = j9;
    }

    public static agl g() {
        return (agl) f19585a.ay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19585a, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဂ\u0007", new Object[]{"d", "e", "f", "g", "h", "i", "j", "k", "l"});
        }
        if (i10 == 3) {
            return new agb();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (short[]) bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19585a;
    }
}
