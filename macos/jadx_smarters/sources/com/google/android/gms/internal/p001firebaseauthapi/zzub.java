package com.google.android.gms.internal.p001firebaseauthapi;

/* JADX INFO: loaded from: classes3.dex */
public enum zzub implements zzaje {
    UNKNOWN_HASH(0),
    SHA1(1),
    SHA384(2),
    SHA256(3),
    SHA512(4),
    SHA224(5),
    UNRECOGNIZED(-1);

    private static final zzajh<zzub> zzh = new zzajh<zzub>() { // from class: com.google.android.gms.internal.firebase-auth-api.zzud
    };
    private final int zzj;

    zzub(int i9) {
        this.zzj = i9;
    }

    public static zzub zza(int i9) {
        if (i9 == 0) {
            return UNKNOWN_HASH;
        }
        if (i9 == 1) {
            return SHA1;
        }
        if (i9 == 2) {
            return SHA384;
        }
        if (i9 == 3) {
            return SHA256;
        }
        if (i9 == 4) {
            return SHA512;
        }
        if (i9 != 5) {
            return null;
        }
        return SHA224;
    }

    @Override // java.lang.Enum
    public final String toString() {
        StringBuilder sb = new StringBuilder("<");
        sb.append(zzub.class.getName());
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
            return this.zzj;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
