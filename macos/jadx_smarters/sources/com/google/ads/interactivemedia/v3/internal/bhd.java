package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bhd extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bhd f21332a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f21335f = bpb.f21870b;

    static {
        bhd bhdVar = new bhd();
        f21332a = bhdVar;
        bqn.aL(bhd.class, bhdVar);
    }

    private bhd() {
    }

    public static bhd b() {
        return f21332a;
    }

    public static bif j() {
        return (bif) f21332a.ay();
    }

    public final bpb c() {
        return this.f21335f;
    }

    public final int e() {
        int iB = bhe.b(this.f21333d);
        return iB == 0 ? bhe.f21341f : iB;
    }

    public final int f() {
        int iB = bhf.b(this.f21334e);
        return iB == 0 ? bhf.f21349g : iB;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f21332a, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bhd();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new bif(bArr, (int[]) bArr, bArr);
        }
        if (i10 != 5) {
            return null;
        }
        return f21332a;
    }
}
