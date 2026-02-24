package com.google.android.gms.internal.p001firebaseauthapi;

import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzau<E> extends zzak<E> implements Set<E>, j$.util.Set {
    private transient zzap<E> zza;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return zzbd.zza(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return zzbd.zza(this);
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.android.gms.internal.p001firebaseauthapi.zzak
    public zzap<E> zzc() {
        zzap<E> zzapVar = this.zza;
        if (zzapVar != null) {
            return zzapVar;
        }
        zzap<E> zzapVarZzg = zzg();
        this.zza = zzapVarZzg;
        return zzapVarZzg;
    }

    public zzap<E> zzg() {
        return zzap.zza(toArray());
    }
}
