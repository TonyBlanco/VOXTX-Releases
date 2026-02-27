package com.google.android.gms.internal.cast;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzsw extends zzra implements RandomAccess, zzsx {

    @Deprecated
    public static final zzsx zza;
    private static final zzsw zzb;
    private final List zzc;

    static {
        zzsw zzswVar = new zzsw(false);
        zzb = zzswVar;
        zza = zzswVar;
    }

    public zzsw() {
        this(10);
    }

    public zzsw(int i9) {
        ArrayList arrayList = new ArrayList(i9);
        super(true);
        this.zzc = arrayList;
    }

    private zzsw(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzsw(boolean z9) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zzi(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzrm ? ((zzrm) obj).zzl(zzsq.zzb) : zzsq.zzd((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        zza();
        this.zzc.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        zza();
        if (collection instanceof zzsx) {
            collection = ((zzsx) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        Object objRemove = this.zzc.remove(i9);
        ((AbstractList) this).modCount++;
        return zzi(objRemove);
    }

    @Override // com.google.android.gms.internal.cast.zzra, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        zza();
        return zzi(this.zzc.set(i9, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final zzsx zzd() {
        return zzc() ? new zzuw(this) : this;
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final Object zze(int i9) {
        return this.zzc.get(i9);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final String get(int i9) {
        Object obj = this.zzc.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzrm) {
            zzrm zzrmVar = (zzrm) obj;
            String strZzl = zzrmVar.zzl(zzsq.zzb);
            if (zzrmVar.zzi()) {
                this.zzc.set(i9, strZzl);
            }
            return strZzl;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzsq.zzd(bArr);
        if (zzvf.zzd(bArr)) {
            this.zzc.set(i9, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.gms.internal.cast.zzsp
    public final /* bridge */ /* synthetic */ zzsp zzg(int i9) {
        if (i9 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i9);
        arrayList.addAll(this.zzc);
        return new zzsw(arrayList);
    }

    @Override // com.google.android.gms.internal.cast.zzsx
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }
}
