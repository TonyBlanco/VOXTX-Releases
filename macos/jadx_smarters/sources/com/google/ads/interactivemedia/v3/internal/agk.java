package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class agk extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final agk f19684a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19685d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f19686e = "";

    static {
        agk agkVar = new agk();
        f19684a = agkVar;
        bqn.aL(agk.class, agkVar);
    }

    private agk() {
    }

    public static /* synthetic */ void b(agk agkVar, String str) {
        str.getClass();
        agkVar.f19685d |= 1;
        agkVar.f19686e = str;
    }

    public static agl c() {
        return (agl) f19684a.ay();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19684a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"d", "e"});
        }
        if (i10 == 3) {
            return new agk();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f19684a;
    }
}
