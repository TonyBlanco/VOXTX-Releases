package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class brj implements brq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final brj f22158b = new brj(1, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f22159a;

    public brj(int i9) {
        this.f22159a = i9;
    }

    private brj(int i9, byte[] bArr) {
        this.f22159a = i9;
    }

    public static brj c() {
        return f22158b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brq
    public final brp a(Class cls) {
        if (this.f22159a == 0) {
            throw new IllegalStateException("This should never be called.");
        }
        if (!bqn.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (brp) bqn.az(cls.asSubclass(bqn.class)).aP(3);
        } catch (Exception e9) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e9);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.brq
    public final boolean b(Class cls) {
        if (this.f22159a != 0) {
            return bqn.class.isAssignableFrom(cls);
        }
        return false;
    }
}
