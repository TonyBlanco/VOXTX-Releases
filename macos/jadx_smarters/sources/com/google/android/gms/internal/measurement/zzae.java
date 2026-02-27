package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes3.dex */
public final class zzae implements Iterable, zzap, zzal {
    final SortedMap zza;
    final Map zzb;

    public zzae() {
        this.zza = new TreeMap();
        this.zzb = new TreeMap();
    }

    public zzae(List list) {
        this();
        if (list != null) {
            for (int i9 = 0; i9 < list.size(); i9++) {
                zzq(i9, (zzap) list.get(i9));
            }
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzae)) {
            return false;
        }
        zzae zzaeVar = (zzae) obj;
        if (zzc() != zzaeVar.zzc()) {
            return false;
        }
        if (this.zza.isEmpty()) {
            return zzaeVar.zza.isEmpty();
        }
        for (int iIntValue = ((Integer) this.zza.firstKey()).intValue(); iIntValue <= ((Integer) this.zza.lastKey()).intValue(); iIntValue++) {
            if (!zze(iIntValue).equals(zzaeVar.zze(iIntValue))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return this.zza.hashCode() * 31;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new zzad(this);
    }

    public final String toString() {
        return zzj(",");
    }

    public final int zzb() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzbU(String str, zzg zzgVar, List list) {
        return ("concat".equals(str) || "every".equals(str) || "filter".equals(str) || "forEach".equals(str) || "indexOf".equals(str) || "join".equals(str) || "lastIndexOf".equals(str) || "map".equals(str) || "pop".equals(str) || "push".equals(str) || "reduce".equals(str) || "reduceRight".equals(str) || "reverse".equals(str) || "shift".equals(str) || "slice".equals(str) || "some".equals(str) || "sort".equals(str) || "splice".equals(str) || "toString".equals(str) || "unshift".equals(str)) ? zzbb.zza(str, this, zzgVar, list) : zzaj.zza(this, new zzat(str), zzgVar, list);
    }

    public final int zzc() {
        if (this.zza.isEmpty()) {
            return 0;
        }
        return ((Integer) this.zza.lastKey()).intValue() + 1;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final zzap zzd() {
        SortedMap sortedMap;
        Integer num;
        zzap zzapVarZzd;
        zzae zzaeVar = new zzae();
        for (Map.Entry entry : this.zza.entrySet()) {
            if (entry.getValue() instanceof zzal) {
                sortedMap = zzaeVar.zza;
                num = (Integer) entry.getKey();
                zzapVarZzd = (zzap) entry.getValue();
            } else {
                sortedMap = zzaeVar.zza;
                num = (Integer) entry.getKey();
                zzapVarZzd = ((zzap) entry.getValue()).zzd();
            }
            sortedMap.put(num, zzapVarZzd);
        }
        return zzaeVar;
    }

    public final zzap zze(int i9) {
        zzap zzapVar;
        if (i9 < zzc()) {
            return (!zzs(i9) || (zzapVar = (zzap) this.zza.get(Integer.valueOf(i9))) == null) ? zzap.zzf : zzapVar;
        }
        throw new IndexOutOfBoundsException("Attempting to get element outside of current array");
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final zzap zzf(String str) {
        zzap zzapVar;
        return Name.LENGTH.equals(str) ? new zzah(Double.valueOf(zzc())) : (!zzt(str) || (zzapVar = (zzap) this.zzb.get(str)) == null) ? zzap.zzf : zzapVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Boolean zzg() {
        return Boolean.TRUE;
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Double zzh() {
        return this.zza.size() == 1 ? zze(0).zzh() : this.zza.size() <= 0 ? Double.valueOf(0.0d) : Double.valueOf(Double.NaN);
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final String zzi() {
        return zzj(",");
    }

    public final String zzj(String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        if (!this.zza.isEmpty()) {
            int i9 = 0;
            while (true) {
                str2 = str == null ? "" : str;
                if (i9 >= zzc()) {
                    break;
                }
                zzap zzapVarZze = zze(i9);
                sb.append(str2);
                if (!(zzapVarZze instanceof zzau) && !(zzapVarZze instanceof zzan)) {
                    sb.append(zzapVarZze.zzi());
                }
                i9++;
            }
            sb.delete(0, str2.length());
        }
        return sb.toString();
    }

    public final Iterator zzk() {
        return this.zza.keySet().iterator();
    }

    @Override // com.google.android.gms.internal.measurement.zzap
    public final Iterator zzl() {
        return new zzac(this, this.zza.keySet().iterator(), this.zzb.keySet().iterator());
    }

    public final List zzm() {
        ArrayList arrayList = new ArrayList(zzc());
        for (int i9 = 0; i9 < zzc(); i9++) {
            arrayList.add(zze(i9));
        }
        return arrayList;
    }

    public final void zzn() {
        this.zza.clear();
    }

    public final void zzo(int i9, zzap zzapVar) {
        if (i9 < 0) {
            throw new IllegalArgumentException("Invalid value index: " + i9);
        }
        if (i9 >= zzc()) {
            zzq(i9, zzapVar);
            return;
        }
        for (int iIntValue = ((Integer) this.zza.lastKey()).intValue(); iIntValue >= i9; iIntValue--) {
            SortedMap sortedMap = this.zza;
            Integer numValueOf = Integer.valueOf(iIntValue);
            zzap zzapVar2 = (zzap) sortedMap.get(numValueOf);
            if (zzapVar2 != null) {
                zzq(iIntValue + 1, zzapVar2);
                this.zza.remove(numValueOf);
            }
        }
        zzq(i9, zzapVar);
    }

    public final void zzp(int i9) {
        int iIntValue = ((Integer) this.zza.lastKey()).intValue();
        if (i9 > iIntValue || i9 < 0) {
            return;
        }
        this.zza.remove(Integer.valueOf(i9));
        if (i9 == iIntValue) {
            SortedMap sortedMap = this.zza;
            int i10 = i9 - 1;
            Integer numValueOf = Integer.valueOf(i10);
            if (sortedMap.containsKey(numValueOf) || i10 < 0) {
                return;
            }
            this.zza.put(numValueOf, zzap.zzf);
            return;
        }
        while (true) {
            i9++;
            if (i9 > ((Integer) this.zza.lastKey()).intValue()) {
                return;
            }
            SortedMap sortedMap2 = this.zza;
            Integer numValueOf2 = Integer.valueOf(i9);
            zzap zzapVar = (zzap) sortedMap2.get(numValueOf2);
            if (zzapVar != null) {
                this.zza.put(Integer.valueOf(i9 - 1), zzapVar);
                this.zza.remove(numValueOf2);
            }
        }
    }

    @RequiresNonNull({"elements"})
    public final void zzq(int i9, zzap zzapVar) {
        if (i9 > 32468) {
            throw new IllegalStateException("Array too large");
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Out of bounds index: " + i9);
        }
        if (zzapVar == null) {
            this.zza.remove(Integer.valueOf(i9));
        } else {
            this.zza.put(Integer.valueOf(i9), zzapVar);
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final void zzr(String str, zzap zzapVar) {
        if (zzapVar == null) {
            this.zzb.remove(str);
        } else {
            this.zzb.put(str, zzapVar);
        }
    }

    public final boolean zzs(int i9) {
        if (i9 >= 0 && i9 <= ((Integer) this.zza.lastKey()).intValue()) {
            return this.zza.containsKey(Integer.valueOf(i9));
        }
        throw new IndexOutOfBoundsException("Out of bounds index: " + i9);
    }

    @Override // com.google.android.gms.internal.measurement.zzal
    public final boolean zzt(String str) {
        return Name.LENGTH.equals(str) || this.zzb.containsKey(str);
    }
}
