package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcm implements zzby {

    @NotNull
    public static final zzcm zza = new zzcm();

    private zzcm() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        Object array;
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        if (true != (obj2 instanceof Integer)) {
            obj2 = null;
        }
        Integer num = (Integer) obj2;
        if (num == null) {
            throw new zzt(4, 5, null);
        }
        int iIntValue = num.intValue();
        if (obj instanceof Integer) {
            array = Integer.valueOf(((Number) obj).intValue() - iIntValue);
        } else {
            if (!(obj instanceof int[])) {
                throw new zzt(4, 5, null);
            }
            int[] iArr = (int[]) obj;
            ArrayList arrayList = new ArrayList(iArr.length);
            for (int i10 : iArr) {
                arrayList.add(Integer.valueOf(i10 - iIntValue));
            }
            array = arrayList.toArray(new Integer[0]);
        }
        zzblVar.zzc().zzf(i9, array);
    }
}
