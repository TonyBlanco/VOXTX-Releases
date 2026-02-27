package com.google.android.recaptcha.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcn implements zzby {

    @NotNull
    public static final zzcn zza = new zzcn();

    private zzcn() {
    }

    @Override // com.google.android.recaptcha.internal.zzby
    public final void zza(int i9, @NotNull zzbl zzblVar, @NotNull Object... objArr) throws zzt {
        if (objArr.length != 2) {
            throw new zzt(4, 3, null);
        }
        Object obj = objArr[0];
        if (true != (obj instanceof int[])) {
            obj = null;
        }
        int[] iArr = (int[]) obj;
        if (iArr == null) {
            throw new zzt(4, 5, null);
        }
        Object obj2 = objArr[1];
        if (true != (obj2 instanceof String)) {
            obj2 = null;
        }
        String str = (String) obj2;
        if (str == null) {
            throw new zzt(4, 5, null);
        }
        zzbm zzbmVarZzc = zzblVar.zzc();
        StringBuilder sb = new StringBuilder();
        try {
            for (int i10 : iArr) {
                sb.append(str.charAt(i10));
            }
            zzbmVarZzc.zzf(i9, sb.toString());
        } catch (Exception e9) {
            throw new zzt(4, 22, e9);
        }
    }
}
