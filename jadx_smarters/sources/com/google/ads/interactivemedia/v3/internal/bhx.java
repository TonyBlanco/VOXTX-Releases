package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhx extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhx f21431a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f21432d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21433e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21434f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f21435g;

    static {
        bhx bhxVar = new bhx();
        f21431a = bhxVar;
        bqn.aL(bhx.class, bhxVar);
    }

    private bhx() {
    }

    public static /* synthetic */ void b(bhx bhxVar, String str) {
        str.getClass();
        bhxVar.f21432d = str;
    }

    public static bif f() {
        return (bif) f21431a.ay();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21431a, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"d", "e", "f", "g"});
        }
        if (i10 == 3) {
            return new bhx();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f21431a;
    }
}
