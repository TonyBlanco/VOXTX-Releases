package com.google.android.recaptcha.internal;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class zzdu extends zzdp {
    final /* synthetic */ Iterable zza;
    final /* synthetic */ int zzb;

    public zzdu(Iterable iterable, int i9) {
        this.zza = iterable;
        this.zzb = i9;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.zza;
        if (iterable instanceof List) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), this.zzb), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        int i9 = this.zzb;
        it.getClass();
        zzdi.zzb(i9 >= 0, "numberToAdvance must be nonnegative");
        for (int i10 = 0; i10 < i9 && it.hasNext(); i10++) {
            it.next();
        }
        return new zzdt(this, it);
    }
}
