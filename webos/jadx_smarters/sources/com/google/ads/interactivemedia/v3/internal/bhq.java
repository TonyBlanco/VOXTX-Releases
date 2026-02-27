package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum bhq implements bqp {
    UNKNOWN_KEYMATERIAL(0),
    SYMMETRIC(1),
    ASYMMETRIC_PRIVATE(2),
    ASYMMETRIC_PUBLIC(3),
    REMOTE(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21402h;

    bhq(int i9) {
        this.f21402h = i9;
    }

    public static bhq a(int i9) {
        if (i9 == 0) {
            return UNKNOWN_KEYMATERIAL;
        }
        if (i9 == 1) {
            return SYMMETRIC;
        }
        if (i9 == 2) {
            return ASYMMETRIC_PRIVATE;
        }
        if (i9 == 3) {
            return ASYMMETRIC_PUBLIC;
        }
        if (i9 != 4) {
            return null;
        }
        return REMOTE;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqp
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f21402h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
