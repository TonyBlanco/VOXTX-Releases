package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bpx extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bpx f22006a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22007d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f22010g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f22011h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f22012i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f22015l = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bqt f22008e = bsb.e();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f22009f = "";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private bpb f22013j = bpb.f21870b;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f22014k = "";

    static {
        bpx bpxVar = new bpx();
        f22006a = bpxVar;
        bqn.aL(bpx.class, bpxVar);
    }

    private bpx() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.f22015l);
        }
        if (i10 == 2) {
            return bqn.aI(f22006a, "\u0001\u0007\u0000\u0001\u0002\b\u0007\u0000\u0001\u0001\u0002Л\u0003ဈ\u0000\u0004ဃ\u0001\u0005ဂ\u0002\u0006က\u0003\u0007ည\u0004\bဈ\u0005", new Object[]{"d", "e", bpw.class, "f", "g", "h", "i", "j", "k"});
        }
        if (i10 == 3) {
            return new bpx();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bpv(bArr);
        }
        if (i10 == 5) {
            return f22006a;
        }
        this.f22015l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
