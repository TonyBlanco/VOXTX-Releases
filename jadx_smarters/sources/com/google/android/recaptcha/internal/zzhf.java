package com.google.android.recaptcha.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzhf extends zzek implements RandomAccess, zzhg {

    @Deprecated
    public static final zzhg zza;
    private static final zzhf zzb;
    private final List zzc;

    static {
        zzhf zzhfVar = new zzhf(false);
        zzb = zzhfVar;
        zza = zzhfVar;
    }

    public zzhf() {
        this(10);
    }

    public zzhf(int i9) {
        ArrayList arrayList = new ArrayList(i9);
        super(true);
        this.zzc = arrayList;
    }

    private zzhf(ArrayList arrayList) {
        super(true);
        this.zzc = arrayList;
    }

    private zzhf(boolean z9) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zzj(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzez ? ((zzez) obj).zzn(zzgw.zzb) : zzgw.zzd((byte[]) obj);
    }

    @Override // com.google.android.recaptcha.internal.zzek, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i9, Object obj) {
        zza();
        this.zzc.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzek, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection collection) {
        zza();
        if (collection instanceof zzhg) {
            collection = ((zzhg) collection).zzh();
        }
        boolean zAddAll = this.zzc.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.recaptcha.internal.zzek, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.recaptcha.internal.zzek, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.recaptcha.internal.zzek, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i9) {
        zza();
        Object objRemove = this.zzc.remove(i9);
        ((AbstractList) this).modCount++;
        return zzj(objRemove);
    }

    @Override // com.google.android.recaptcha.internal.zzek, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i9, Object obj) {
        zza();
        return zzj(this.zzc.set(i9, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.recaptcha.internal.zzgv
    public final /* bridge */ /* synthetic */ zzgv zzd(int i9) {
        if (i9 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i9);
        arrayList.addAll(this.zzc);
        return new zzhf(arrayList);
    }

    @Override // com.google.android.recaptcha.internal.zzhg
    public final zzhg zze() {
        return zzc() ? new zzjk(this) : this;
    }

    @Override // com.google.android.recaptcha.internal.zzhg
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
        if (obj instanceof zzez) {
            zzez zzezVar = (zzez) obj;
            String strZzn = zzezVar.zzn(zzgw.zzb);
            if (zzezVar.zzj()) {
                this.zzc.set(i9, strZzn);
            }
            return strZzn;
        }
        byte[] bArr = (byte[]) obj;
        String strZzd = zzgw.zzd(bArr);
        if (zzju.zze(bArr)) {
            this.zzc.set(i9, strZzd);
        }
        return strZzd;
    }

    @Override // com.google.android.recaptcha.internal.zzhg
    public final List zzh() {
        return Collections.unmodifiableList(this.zzc);
    }

    @Override // com.google.android.recaptcha.internal.zzhg
    public final void zzi(zzez zzezVar) {
        zza();
        this.zzc.add(zzezVar);
        ((AbstractList) this).modCount++;
    }
}
