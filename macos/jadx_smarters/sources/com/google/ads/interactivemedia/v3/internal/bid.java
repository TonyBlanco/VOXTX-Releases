package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public enum bid implements bqp {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);


    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f21484h;

    bid(int i9) {
        this.f21484h = i9;
    }

    public static bid a(int i9) {
        if (i9 == 0) {
            return UNKNOWN_PREFIX;
        }
        if (i9 == 1) {
            return TINK;
        }
        if (i9 == 2) {
            return LEGACY;
        }
        if (i9 == 3) {
            return RAW;
        }
        if (i9 != 4) {
            return null;
        }
        return CRUNCHY;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bqp
    public final int getNumber() {
        if (this != UNRECOGNIZED) {
            return this.f21484h;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(getNumber());
    }
}
