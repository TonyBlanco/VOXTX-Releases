package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bpq extends bql implements brt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bpq f21934d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21935e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21936f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21937g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f21938h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21939i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f21940j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f21941k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f21942l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f21944n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f21946p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private byte f21948r = 2;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private bqt f21943m = bsb.e();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f21945o = true;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private bqt f21947q = bsb.e();

    static {
        bpq bpqVar = new bpq();
        f21934d = bpqVar;
        bqn.aL(bpq.class, bpqVar);
    }

    private bpq() {
    }

    public static bpq e() {
        return f21934d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.f21948r);
        }
        if (i10 == 2) {
            return bqn.aI(f21934d, "\u0001\f\u0000\u0001\u0001ϧ\f\u0000\u0002\u0001\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဇ\u0005\u0005ဇ\u0003\u0006ဌ\u0002\nဇ\u0006\u000b\u001b\fဇ\u0007\rဇ\b\u000eဇ\t\u000fဇ\u0004ϧЛ", new Object[]{"e", "f", bpm.a(), "g", "k", "i", "h", bpo.a(), "l", "m", bpp.class, "n", "o", "p", "j", "q", bpx.class});
        }
        if (i10 == 3) {
            return new bpq();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bpr(bArr, bArr);
        }
        if (i10 == 5) {
            return f21934d;
        }
        this.f21948r = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
