package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public enum zzum implements zzaje {
    KDF_UNKNOWN(0),
    HKDF_SHA256(1),
    HKDF_SHA384(2),
    HKDF_SHA512(3),
    UNRECOGNIZED(-1);

    private static final zzajh<zzum> zzf = new zzajh<zzum>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzul
    };
    private final int zzh;

    zzum(int i9) {
        this.zzh = i9;
    }

    public static zzum zza(int i9) {
        if (i9 == 0) {
            return KDF_UNKNOWN;
        }
        if (i9 == 1) {
            return HKDF_SHA256;
        }
        if (i9 == 2) {
            return HKDF_SHA384;
        }
        if (i9 != 3) {
            return null;
        }
        return HKDF_SHA512;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzum.class.getName());
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
            return this.zzh;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
