package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class bpw extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bpw f22001a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22002d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f22004f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private byte f22005g = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f22003e = "";

    static {
        bpw bpwVar = new bpw();
        f22001a = bpwVar;
        bqn.aL(bpw.class, bpwVar);
    }

    private bpw() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return Byte.valueOf(this.f22005g);
        }
        if (i10 == 2) {
            return bqn.aI(f22001a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"d", "e", "f"});
        }
        if (i10 == 3) {
            return new bpw();
        }
        byte[] bArr = null;
        Object[] objArr = 0;
        if (i10 == 4) {
            return new bpv(bArr, (char[]) (objArr == true ? 1 : 0));
        }
        if (i10 == 5) {
            return f22001a;
        }
        this.f22005g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
