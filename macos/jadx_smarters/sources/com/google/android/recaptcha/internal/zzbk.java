package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbk {

    @NotNull
    public static final zzbk zza = new zzbk();

    private zzbk() {
    }

    @NotNull
    public static final Class zza(@Nullable Object obj) throws zzt {
        if (obj instanceof Class) {
            return (Class) obj;
        }
        if (obj instanceof Integer) {
            int iIntValue = ((Number) obj).intValue();
            Class cls = iIntValue == 1 ? Integer.TYPE : iIntValue == 2 ? Short.TYPE : iIntValue == 3 ? Byte.TYPE : iIntValue == 4 ? Long.TYPE : iIntValue == 5 ? Character.TYPE : iIntValue == 6 ? Float.TYPE : iIntValue == 7 ? Double.TYPE : iIntValue == 8 ? Boolean.TYPE : iIntValue == 9 ? zzcr.class : null;
            if (cls != null) {
                return cls;
            }
            throw new zzt(4, 6, null);
        }
        if (!(obj instanceof String)) {
            throw new zzt(6, 8, null);
        }
        String str = (String) obj;
        if (!zzbj.zzc(str)) {
            throw new zzt(6, 47, null);
        }
        try {
            return Class.forName(str);
        } catch (Exception e9) {
            throw new zzt(6, 8, e9);
        }
    }
}
