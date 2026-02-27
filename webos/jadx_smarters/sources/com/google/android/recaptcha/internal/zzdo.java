package com.google.android.recaptcha.internal;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public final class zzdo extends zzds implements Serializable {
    final int zza;
    private final Queue zzb;

    private zzdo(int i9) {
        if (i9 < 0) {
            throw new IllegalArgumentException(zzdl.zza("maxSize (%s) must >= 0", Integer.valueOf(i9)));
        }
        this.zzb = new ArrayDeque(i9);
        this.zza = i9;
    }

    public static zzdo zza(int i9) {
        return new zzdo(i9);
    }

    @Override // com.google.android.recaptcha.internal.zzdq, java.util.Collection, java.util.Queue
    public final boolean add(Object obj) {
        obj.getClass();
        if (this.zza == 0) {
            return true;
        }
        if (size() == this.zza) {
            this.zzb.remove();
        }
        this.zzb.add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzdq, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it;
        int size = collection.size();
        if (size >= this.zza) {
            clear();
            int i9 = size - this.zza;
            zzdi.zzb(i9 >= 0, "number to skip cannot be negative");
            it = new zzdu(collection, i9).iterator();
        } else {
            it = collection.iterator();
        }
        return zzdv.zza(this, it);
    }

    @Override // com.google.android.recaptcha.internal.zzds, java.util.Queue
    public final boolean offer(Object obj) {
        add(obj);
        return true;
    }

    @Override // com.google.android.recaptcha.internal.zzdq, com.google.android.recaptcha.internal.zzdr
    public final /* synthetic */ Object zzb() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzds, com.google.android.recaptcha.internal.zzdq
    public final /* synthetic */ Collection zzc() {
        return this.zzb;
    }

    @Override // com.google.android.recaptcha.internal.zzds
    public final Queue zzd() {
        return this.zzb;
    }
}
