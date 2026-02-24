package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzajx extends zzajs {
    private zzajx() {
        super();
    }

    private static <E> zzajj<E> zzc(Object obj, long j9) {
        return (zzajj) zzamk.zze(obj, j9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajs
    public final <L> List<L> zza(Object obj, long j9) {
        zzajj zzajjVarZzc = zzc(obj, j9);
        if (zzajjVarZzc.zzc()) {
            return zzajjVarZzc;
        }
        int size = zzajjVarZzc.size();
        zzajj zzajjVarZza = zzajjVarZzc.zza(size == 0 ? 10 : size << 1);
        zzamk.zza(obj, j9, zzajjVarZza);
        return zzajjVarZza;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r6v1, types: [com.google.android.gms.internal.firebase-auth-api.zzajj, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v3 */
    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajs
    public final <E> void zza(Object obj, Object obj2, long j9) {
        zzajj zzajjVarZzc = zzc(obj, j9);
        ?? Zzc = zzc(obj2, j9);
        int size = zzajjVarZzc.size();
        int size2 = Zzc.size();
        ?? r02 = zzajjVarZzc;
        r02 = zzajjVarZzc;
        if (size > 0 && size2 > 0) {
            boolean zZzc = zzajjVarZzc.zzc();
            ?? Zza = zzajjVarZzc;
            if (!zZzc) {
                Zza = zzajjVarZzc.zza(size2 + size);
            }
            Zza.addAll(Zzc);
            r02 = Zza;
        }
        if (size > 0) {
            Zzc = r02;
        }
        zzamk.zza(obj, j9, (Object) Zzc);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajs
    public final void zzb(Object obj, long j9) {
        zzc(obj, j9).zzb();
    }
}
