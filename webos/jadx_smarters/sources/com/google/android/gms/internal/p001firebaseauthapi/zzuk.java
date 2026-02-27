package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public enum zzuk implements zzaje {
    AEAD_UNKNOWN(0),
    AES_128_GCM(1),
    AES_256_GCM(2),
    CHACHA20_POLY1305(3),
    UNRECOGNIZED(-1);

    private static final zzajh<zzuk> zzf = new zzajh<zzuk>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzuj
    };
    private final int zzh;

    zzuk(int i9) {
        this.zzh = i9;
    }

    public static zzuk zza(int i9) {
        if (i9 == 0) {
            return AEAD_UNKNOWN;
        }
        if (i9 == 1) {
            return AES_128_GCM;
        }
        if (i9 == 2) {
            return AES_256_GCM;
        }
        if (i9 != 3) {
            return null;
        }
        return CHACHA20_POLY1305;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzuk.class.getName());
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
