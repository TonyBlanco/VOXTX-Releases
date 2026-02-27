package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public final class zzamf extends AbstractList<String> implements zzajt, RandomAccess {
    private final zzajt zza;

    public zzamf(zzajt zzajtVar) {
        this.zza = zzajtVar;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i9) {
        return (String) this.zza.get(i9);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new zzamh(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i9) {
        return new zzami(this, i9);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final void zza(zzahp zzahpVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final Object zzb(int i9) {
        return this.zza.zzb(i9);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final zzajt zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzajt
    public final List<?> zze() {
        return this.zza.zze();
    }
}
