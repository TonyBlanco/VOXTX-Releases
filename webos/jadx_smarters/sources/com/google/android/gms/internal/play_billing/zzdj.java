package com.google.android.gms.internal.play_billing;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdj extends zzba implements RandomAccess, zzdk {

    @Deprecated
    public static final zzdk zza;
    private static final zzdj zzb;
    private final List zzc;

    static {
        zzdj zzdjVar = new zzdj(false);
        zzb = zzdjVar;
        zza = zzdjVar;
    }

    public zzdj() {
        this(10);
    }

    public zzdj(int i9) {
        ArrayList arrayList = new ArrayList(i9);
        super(true);
        this.zzc = arrayList;
    }

    private zzdj(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzdj(boolean z9) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zzi(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzbq ? ((zzbq) obj).zzm(zzda.zzb) : zzda.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        zza();
        this.zzc.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        zza();
        if (collection instanceof zzdk) {
            collection = ((zzdk) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        Object objRemove = this.zzc.remove(i9);
        ((AbstractList) this).modCount++;
        return zzi(objRemove);
    }

    @Override // com.google.android.gms.internal.play_billing.zzba, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        zza();
        return zzi(this.zzc.set(i9, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.play_billing.zzcz
    public final /* bridge */ /* synthetic */ zzcz zzd(int i9) {
        if (i9 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i9);
        arrayList.addAll(this.zzc);
        return new zzdj(arrayList);
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final zzdk zze() {
        return zzc() ? new zzfk(this) : this;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final Object zzf(int i9) {
        return this.zzc.get(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzg, reason: merged with bridge method [inline-methods] */
    public final String get(int i9) {
        Object obj = this.zzc.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzbq) {
            zzbq zzbqVar = (zzbq) obj;
            String strZzm = zzbqVar.zzm(zzda.zzb);
            if (zzbqVar.zzi()) {
                this.zzc.set(i9, strZzm);
            }
            return strZzm;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzda.zzd(bArr);
        if (zzfu.zzd(bArr)) {
            this.zzc.set(i9, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzdk
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }
}
