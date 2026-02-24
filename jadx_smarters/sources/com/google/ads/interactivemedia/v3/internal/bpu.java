package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bpu extends bql implements brt {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final bpu f21992d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21993e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f21994f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f21995g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f21996h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f21997i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private byte f22000l = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f21998j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private bqt f21999k = bsb.e();

    static {
        bpu bpuVar = new bpu();
        f21992d = bpuVar;
        bqn.aL(bpu.class, bpuVar);
    }

    private bpu() {
    }

    public static bpu e() {
        return f21992d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.f22000l);
        }
        if (i10 == 2) {
            return bqn.aI(f21992d, "\u0001\u0006\u0000\u0001\u0001ϧ\u0006\u0000\u0001\u0001\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0007ဇ\u0003\nဈ\u0004ϧЛ", new Object[]{"e", "f", "g", "h", "i", "j", "k", bpx.class});
        }
        if (i10 == 3) {
            return new bpu();
        }
        byte[] bArr = null;
        Object[] objArr = 0;
        if (i10 == 4) {
            return new bpr(bArr, (char[]) (objArr == true ? 1 : 0));
        }
        if (i10 == 5) {
            return f21992d;
        }
        this.f22000l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
