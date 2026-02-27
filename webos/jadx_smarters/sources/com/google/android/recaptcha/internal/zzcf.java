package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.Arrays;
import l8.h;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcf implements zzby {

    @NotNull
    public static final zzcf zza = new zzcf();

    private zzcf() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        int length = objArr.length;
        if (length == 0) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Method)) {
            obj = null;
        }
        Method method = (Method) obj;
        if (method == null) {
            throw new zzt(4, 5, null);
        }
        Object[] array = h.T(objArr).subList(1, length).toArray(new Object[0]);
        try {
            zzblVar.zzc().zzf(i9, method.invoke(null, Arrays.copyOf(array, array.length)));
        } catch (Exception e9) {
            throw new zzt(6, 15, e9);
        }
    }
}
