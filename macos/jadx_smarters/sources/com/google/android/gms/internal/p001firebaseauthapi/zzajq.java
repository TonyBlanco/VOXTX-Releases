package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
public final class zzajq extends zzahj<String> implements zzajt, RandomAccess {
    private static final zzajq zza;

    @Deprecated
    private static final zzajt zzb;
    private final List<Object> zzc;

    static {
        zzajq zzajqVar = new zzajq(false);
        zza = zzajqVar;
        zzb = zzajqVar;
    }

    public zzajq() {
        this(10);
    }

    public zzajq(int i9) {
        this((ArrayList<Object>) new ArrayList(i9));
    }

    private zzajq(ArrayList<Object> arrayList) {
        this.zzc = arrayList;
    }

    private zzajq(boolean z9) {
        super(false);
        this.zzc = Collections.emptyList();
    }

    private static String zza(Object obj) {
        return obj instanceof String ? (String) obj : obj instanceof zzahp ? ((zzahp) obj).zzd() : zzajf.zzb((byte[]) obj);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i9, Object obj) {
        zza();
        this.zzc.add(i9, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final boolean addAll(int i9, Collection<? extends String> collection) {
        zza();
        if (collection instanceof zzajt) {
            collection = ((zzajt) collection).zze();
        }
        boolean zAddAll = this.zzc.addAll(i9, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        zza();
        this.zzc.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        Object obj = this.zzc.get(i9);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzahp) {
            zzahp zzahpVar = (zzahp) obj;
            String strZzd = zzahpVar.zzd();
            if (zzahpVar.zzf()) {
                this.zzc.set(i9, strZzd);
            }
            return strZzd;
        }
        byte[] bArr = (byte[]) obj;
        String strZzb = zzajf.zzb(bArr);
        if (zzajf.zzc(bArr)) {
            this.zzc.set(i9, strZzb);
        }
        return strZzb;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i9) {
        zza();
        Object objRemove = this.zzc.remove(i9);
        ((AbstractList) this).modCount++;
        return zza(objRemove);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i9, Object obj) {
        zza();
        return zza(this.zzc.set(i9, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc.size();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajj
    public final /* synthetic */ zzajj zza(int i9) {
        if (i9 < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i9);
        arrayList.addAll(this.zzc);
        return new zzajq((ArrayList<Object>) arrayList);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final void zza(zzahp zzahpVar) {
        zza();
        this.zzc.add(zzahpVar);
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final Object zzb(int i9) {
        return this.zzc.get(i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzahj, com.google.android.gms.internal.p001firebaseauthapi.zzajj
    public final /* bridge */ /* synthetic */ boolean zzc() {
        return super.zzc();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final zzajt zzd() {
        return zzc() ? new zzamf(this) : this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final List<?> zze() {
        return Collections.unmodifiableList(this.zzc);
    }
}
