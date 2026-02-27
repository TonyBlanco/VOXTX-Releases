package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import l8.l;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcb implements zzby {

    @NotNull
    public static final zzcb zza = new zzcb();

    private zzcb() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        int length = objArr.length;
        if (length == 0) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Class)) {
            obj = null;
        }
        Class cls = (Class) obj;
        if (cls == null) {
            throw new zzt(4, 5, null);
        }
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj2 = objArr[i10];
            int i12 = i11 + 1;
            if (i11 > 0) {
                arrayList.add(obj2);
            }
            i10++;
            i11 = i12;
        }
        ArrayList arrayList2 = new ArrayList(l.o(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(zzbk.zza(it.next()));
        }
        Class[] clsArr = (Class[]) arrayList2.toArray(new Class[0]);
        try {
            zzblVar.zzc().zzf(i9, cls.getConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length)));
        } catch (Exception e9) {
            throw new zzt(6, 9, e9);
        }
    }
}
