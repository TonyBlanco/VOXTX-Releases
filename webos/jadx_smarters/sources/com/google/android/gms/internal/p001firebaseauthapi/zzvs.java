package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public enum zzvs implements zzaje {
    UNKNOWN_PREFIX(0),
    TINK(1),
    LEGACY(2),
    RAW(3),
    CRUNCHY(4),
    UNRECOGNIZED(-1);

    private static final zzajh<zzvs> zzg = new zzajh<zzvs>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzvu
    };
    private final int zzi;

    zzvs(int i9) {
        this.zzi = i9;
    }

    public static zzvs zza(int i9) {
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

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzvs.class.getName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        if (this != UNRECOGNIZED) {
            sb.append(" number=");
            sb.append(zza());
        }
        sb.append(" name=");
        sb.append(name());
        sb.append('>');
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzaje
    public final int zza() {
        if (this != UNRECOGNIZED) {
            return this.zzi;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
