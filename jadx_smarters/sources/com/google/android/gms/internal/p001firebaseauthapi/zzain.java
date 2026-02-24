package com.google.android.gms.internal.p001firebaseauthapi;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zzain implements zzana {
    private final zzaik zza;

    private zzain(zzaik zzaikVar) {
        zzaik zzaikVar2 = (zzaik) zzajf.zza(zzaikVar, "output");
        this.zza = zzaikVar2;
        zzaikVar2.zze = this;
    }

    public static zzain zza(zzaik zzaikVar) {
        zzain zzainVar = zzaikVar.zze;
        return zzainVar != null ? zzainVar : new zzain(zzaikVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final int zza() {
        return zzand.zza;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    @Deprecated
    public final void zza(int i9) throws IOException {
        this.zza.zzk(i9, 4);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, double d9) throws IOException {
        this.zza.zzb(i9, d9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, float f9) throws IOException {
        this.zza.zzb(i9, f9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, int i10) throws IOException {
        this.zza.zzi(i9, i10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, long j9) throws IOException {
        this.zza.zzf(i9, j9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, zzahp zzahpVar) throws IOException {
        this.zza.zzc(i9, zzahpVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final <K, V> void zza(int i9, zzake<K, V> zzakeVar, Map<K, V> map) throws IOException {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.zza.zzk(i9, 2);
            this.zza.zzn(zzakf.zza(zzakeVar, entry.getKey(), entry.getValue()));
            zzakf.zza(this.zza, zzakeVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, Object obj) throws IOException {
        if (obj instanceof zzahp) {
            this.zza.zzd(i9, (zzahp) obj);
        } else {
            this.zza.zzb(i9, (zzakn) obj);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, Object obj, zzalf zzalfVar) throws IOException {
        zzaik zzaikVar = this.zza;
        zzaikVar.zzk(i9, 3);
        zzalfVar.zza((zzakn) obj, zzaikVar.zze);
        zzaikVar.zzk(i9, 4);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, String str) throws IOException {
        this.zza.zzb(i9, str);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, List<zzahp> list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zzc(i9, list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, List<?> list, zzalf zzalfVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zza(i9, list.get(i10), zzalfVar);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, List<Boolean> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzb(i9, list.get(i10).booleanValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZza = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZza += zzaik.zza(list.get(i11).booleanValue());
        }
        this.zza.zzn(iZza);
        while (i10 < list.size()) {
            this.zza.zzb(list.get(i10).booleanValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zza(int i9, boolean z9) throws IOException {
        this.zza.zzb(i9, z9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    @Deprecated
    public final void zzb(int i9) throws IOException {
        this.zza.zzk(i9, 3);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzb(int i9, int i10) throws IOException {
        this.zza.zzh(i9, i10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzb(int i9, long j9) throws IOException {
        this.zza.zzh(i9, j9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzb(int i9, Object obj, zzalf zzalfVar) throws IOException {
        this.zza.zzc(i9, (zzakn) obj, zzalfVar);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzb(int i9, List<String> list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzajt)) {
            while (i10 < list.size()) {
                this.zza.zzb(i9, list.get(i10));
                i10++;
            }
            return;
        }
        zzajt zzajtVar = (zzajt) list;
        while (i10 < list.size()) {
            Object objZzb = zzajtVar.zzb(i10);
            if (objZzb instanceof String) {
                this.zza.zzb(i9, (String) objZzb);
            } else {
                this.zza.zzc(i9, (zzahp) objZzb);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzb(int i9, List<?> list, zzalf zzalfVar) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            zzb(i9, list.get(i10), zzalfVar);
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzb(int i9, List<Double> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzb(i9, list.get(i10).doubleValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZza = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZza += zzaik.zza(list.get(i11).doubleValue());
        }
        this.zza.zzn(iZza);
        while (i10 < list.size()) {
            this.zza.zzb(list.get(i10).doubleValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzc(int i9, int i10) throws IOException {
        this.zza.zzi(i9, i10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzc(int i9, long j9) throws IOException {
        this.zza.zzf(i9, j9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzc(int i9, List<Integer> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzi(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzc = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzc += zzaik.zzc(list.get(i11).intValue());
        }
        this.zza.zzn(iZzc);
        while (i10 < list.size()) {
            this.zza.zzl(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzd(int i9, int i10) throws IOException {
        this.zza.zzh(i9, i10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzd(int i9, long j9) throws IOException {
        this.zza.zzg(i9, j9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzd(int i9, List<Integer> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzh(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzd = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzd += zzaik.zzd(list.get(i11).intValue());
        }
        this.zza.zzn(iZzd);
        while (i10 < list.size()) {
            this.zza.zzk(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zze(int i9, int i10) throws IOException {
        this.zza.zzj(i9, i10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zze(int i9, long j9) throws IOException {
        this.zza.zzh(i9, j9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zze(int i9, List<Long> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzf(i9, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzc = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzc += zzaik.zzc(list.get(i11).longValue());
        }
        this.zza.zzn(iZzc);
        while (i10 < list.size()) {
            this.zza.zzh(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzf(int i9, int i10) throws IOException {
        this.zza.zzl(i9, i10);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzf(int i9, List<Float> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzb(i9, list.get(i10).floatValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZza = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZza += zzaik.zza(list.get(i11).floatValue());
        }
        this.zza.zzn(iZza);
        while (i10 < list.size()) {
            this.zza.zzb(list.get(i10).floatValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzg(int i9, List<Integer> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzi(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZze = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZze += zzaik.zze(list.get(i11).intValue());
        }
        this.zza.zzn(iZze);
        while (i10 < list.size()) {
            this.zza.zzl(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzh(int i9, List<Long> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzh(i9, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzd = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzd += zzaik.zzd(list.get(i11).longValue());
        }
        this.zza.zzn(iZzd);
        while (i10 < list.size()) {
            this.zza.zzj(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzi(int i9, List<Integer> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzh(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzg = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzg += zzaik.zzg(list.get(i11).intValue());
        }
        this.zza.zzn(iZzg);
        while (i10 < list.size()) {
            this.zza.zzk(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzj(int i9, List<Long> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzf(i9, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZze = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZze += zzaik.zze(list.get(i11).longValue());
        }
        this.zza.zzn(iZze);
        while (i10 < list.size()) {
            this.zza.zzh(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzk(int i9, List<Integer> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzj(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzh = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzh += zzaik.zzh(list.get(i11).intValue());
        }
        this.zza.zzn(iZzh);
        while (i10 < list.size()) {
            this.zza.zzm(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzl(int i9, List<Long> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzg(i9, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzf = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzf += zzaik.zzf(list.get(i11).longValue());
        }
        this.zza.zzn(iZzf);
        while (i10 < list.size()) {
            this.zza.zzi(list.get(i10).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzm(int i9, List<Integer> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzl(i9, list.get(i10).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzj = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzj += zzaik.zzj(list.get(i11).intValue());
        }
        this.zza.zzn(iZzj);
        while (i10 < list.size()) {
            this.zza.zzn(list.get(i10).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzana
    public final void zzn(int i9, List<Long> list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzh(i9, list.get(i10).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzk(i9, 2);
        int iZzg = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzg += zzaik.zzg(list.get(i11).longValue());
        }
        this.zza.zzn(iZzg);
        while (i10 < list.size()) {
            this.zza.zzj(list.get(i10).longValue());
            i10++;
        }
    }
}
