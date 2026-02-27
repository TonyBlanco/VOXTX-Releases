package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhy extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhy f21436a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bqt f21438e = bqn.aF();

    static {
        bhy bhyVar = new bhy();
        f21436a = bhyVar;
        bqn.aL(bhy.class, bhyVar);
    }

    private bhy() {
    }

    public static /* synthetic */ void c(bhy bhyVar, bhx bhxVar) {
        bhxVar.getClass();
        bhyVar.e();
        bhyVar.f21438e.add(bhxVar);
    }

    public static bif d() {
        return (bif) f21436a.ay();
    }

    private final void e() {
        bqt bqtVar = this.f21438e;
        if (bqtVar.c()) {
            return;
        }
        this.f21438e = bqn.aG(bqtVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21436a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"d", "e", bhx.class});
        }
        if (i10 == 3) {
            return new bhy();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (byte[]) (null == true ? 1 : 0), (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21436a;
    }
}
