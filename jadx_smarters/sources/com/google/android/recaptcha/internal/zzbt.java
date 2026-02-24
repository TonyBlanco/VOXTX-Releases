package com.google.android.recaptcha.internal;

import java.util.Collection;
import l8.h;
import l8.s;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbt implements zzby {

    @NotNull
    public static final zzbt zza = new zzbt();

    private zzbt() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        String strA;
        String str;
        if (objArr.length != 1) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof Object)) {
            obj = null;
        }
        if (obj == null) {
            throw new zzt(4, 5, null);
        }
        if (obj instanceof int[]) {
            strA = h.H((int[]) obj, ",", "[", "]", 0, null, null, 56, null);
        } else {
            if (obj instanceof byte[]) {
                str = new String((byte[]) obj, E8.c.f1714b);
            } else if (obj instanceof long[]) {
                strA = h.I((long[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof short[]) {
                strA = h.K((short[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof float[]) {
                strA = h.G((float[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof double[]) {
                strA = h.F((double[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else if (obj instanceof char[]) {
                str = new String((char[]) obj);
            } else if (obj instanceof Object[]) {
                strA = h.J((Object[]) obj, ",", "[", "]", 0, null, null, 56, null);
            } else {
                if (!(obj instanceof Collection)) {
                    throw new zzt(4, 5, null);
                }
                strA = s.A((Iterable) obj, ",", "[", "]", 0, null, null, 56, null);
            }
            strA = str;
        }
        zzblVar.zzc().zzf(i9, strA);
    }
}
