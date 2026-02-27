package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzkj implements zzoc {
    private final zzki zza;

    private zzkj(zzki zzkiVar) {
        byte[] bArr = zzlj.zzd;
        this.zza = zzkiVar;
        zzkiVar.zza = this;
    }

    public static zzkj zza(zzki zzkiVar) {
        zzkj zzkjVar = zzkiVar.zza;
        return zzkjVar != null ? zzkjVar : new zzkj(zzkiVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzA(int i9, int i10) throws IOException {
        this.zza.zzp(i9, (i10 >> 31) ^ (i10 + i10));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzB(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                zzki zzkiVar = this.zza;
                int iIntValue = ((Integer) list.get(i10)).intValue();
                zzkiVar.zzp(i9, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int iZzx = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            int iIntValue2 = ((Integer) list.get(i11)).intValue();
            iZzx += zzki.zzx((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.zza.zzq(iZzx);
        while (i10 < list.size()) {
            zzki zzkiVar2 = this.zza;
            int iIntValue3 = ((Integer) list.get(i10)).intValue();
            zzkiVar2.zzq((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzC(int i9, long j9) throws IOException {
        this.zza.zzr(i9, (j9 >> 63) ^ (j9 + j9));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzD(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                zzki zzkiVar = this.zza;
                long jLongValue = ((Long) list.get(i10)).longValue();
                zzkiVar.zzr(i9, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int iZzy = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            long jLongValue2 = ((Long) list.get(i11)).longValue();
            iZzy += zzki.zzy((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.zza.zzq(iZzy);
        while (i10 < list.size()) {
            zzki zzkiVar2 = this.zza;
            long jLongValue3 = ((Long) list.get(i10)).longValue();
            zzkiVar2.zzs((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzE(int i9) throws IOException {
        this.zza.zzo(i9, 3);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzF(int i9, String str) throws IOException {
        this.zza.zzm(i9, str);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzG(int i9, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof zzlq)) {
            while (i10 < list.size()) {
                this.zza.zzm(i9, (String) list.get(i10));
                i10++;
            }
            return;
        }
        zzlq zzlqVar = (zzlq) list;
        while (i10 < list.size()) {
            Object objZzf = zzlqVar.zzf(i10);
            if (objZzf instanceof String) {
                this.zza.zzm(i9, (String) objZzf);
            } else {
                this.zza.zze(i9, (zzka) objZzf);
            }
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzH(int i9, int i10) throws IOException {
        this.zza.zzp(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzI(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzp(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int iZzx = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzx += zzki.zzx(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzx);
        while (i10 < list.size()) {
            this.zza.zzq(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzJ(int i9, long j9) throws IOException {
        this.zza.zzr(i9, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzK(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzr(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int iZzy = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzy += zzki.zzy(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(iZzy);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzb(int i9, boolean z9) throws IOException {
        this.zza.zzd(i9, z9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzc(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzd(i9, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).booleanValue();
            i11++;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzb(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzd(int i9, zzka zzkaVar) throws IOException {
        this.zza.zze(i9, zzkaVar);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zze(int i9, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.zza.zze(i9, (zzka) list.get(i10));
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzf(int i9, double d9) throws IOException {
        this.zza.zzh(i9, Double.doubleToRawLongBits(d9));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzg(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzh(i9, Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).doubleValue();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    @Deprecated
    public final void zzh(int i9) throws IOException {
        this.zza.zzo(i9, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzi(int i9, int i10) throws IOException {
        this.zza.zzj(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzj(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzj(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int iZzu = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzu += zzki.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzk(int i9, int i10) throws IOException {
        this.zza.zzf(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzl(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzf(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).intValue();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzm(int i9, long j9) throws IOException {
        this.zza.zzh(i9, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzn(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzh(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).longValue();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzo(int i9, float f9) throws IOException {
        this.zza.zzf(i9, Float.floatToRawIntBits(f9));
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzp(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzf(i9, Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).floatValue();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzq(int i9, Object obj, zzmt zzmtVar) throws IOException {
        zzki zzkiVar = this.zza;
        zzkiVar.zzo(i9, 3);
        zzmtVar.zzi((zzmi) obj, zzkiVar.zza);
        zzkiVar.zzo(i9, 4);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzr(int i9, int i10) throws IOException {
        this.zza.zzj(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzs(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzj(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int iZzu = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzu += zzki.zzu(((Integer) list.get(i11)).intValue());
        }
        this.zza.zzq(iZzu);
        while (i10 < list.size()) {
            this.zza.zzk(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzt(int i9, long j9) throws IOException {
        this.zza.zzr(i9, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzu(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzr(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int iZzy = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iZzy += zzki.zzy(((Long) list.get(i11)).longValue());
        }
        this.zza.zzq(iZzy);
        while (i10 < list.size()) {
            this.zza.zzs(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzv(int i9, Object obj, zzmt zzmtVar) throws IOException {
        zzmi zzmiVar = (zzmi) obj;
        zzkf zzkfVar = (zzkf) this.zza;
        zzkfVar.zzq((i9 << 3) | 2);
        zzkfVar.zzq(((zzjk) zzmiVar).zzbu(zzmtVar));
        zzmtVar.zzi(zzmiVar, zzkfVar.zza);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzw(int i9, int i10) throws IOException {
        this.zza.zzf(i9, i10);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzx(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzf(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).intValue();
            i11 += 4;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzg(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzy(int i9, long j9) throws IOException {
        this.zza.zzh(i9, j9);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final void zzz(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.zza.zzh(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.zza.zzo(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).longValue();
            i11 += 8;
        }
        this.zza.zzq(i11);
        while (i10 < list.size()) {
            this.zza.zzi(((Long) list.get(i10)).longValue());
            i10++;
        }
    }
}
