package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public enum zzty implements zzaje {
    UNKNOWN_CURVE(0),
    NIST_P256(2),
    NIST_P384(3),
    NIST_P521(4),
    CURVE25519(5),
    UNRECOGNIZED(-1);

    private static final zzajh<zzty> zzg = new zzajh<zzty>() { // from class: com.google.android.gms.internal.firebase-auth-api.zztx
    };
    private final int zzi;

    zzty(int i9) {
        this.zzi = i9;
    }

    public static zzty zza(int i9) {
        if (i9 == 0) {
            return UNKNOWN_CURVE;
        }
        if (i9 == 2) {
            return NIST_P256;
        }
        if (i9 == 3) {
            return NIST_P384;
        }
        if (i9 == 4) {
            return NIST_P521;
        }
        if (i9 != 5) {
            return null;
        }
        return CURVE25519;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzty.class.getName());
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
