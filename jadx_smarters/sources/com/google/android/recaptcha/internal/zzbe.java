package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.l;
import l8.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbe extends zzbd implements zzbi {

    @NotNull
    private final p zza;

    @NotNull
    private final String zzb;

    public zzbe(@NotNull p pVar, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = pVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzbd
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        Collection collectionF;
        if (!l.a(method.getName(), this.zzb)) {
            return false;
        }
        zzmk zzmkVarZzf = zzmn.zzf();
        if (objArr != null) {
            collectionF = new ArrayList(objArr.length);
            for (Object obj2 : objArr) {
                zzml zzmlVarZzf = zzmm.zzf();
                zzmlVarZzf.zzv(obj2.toString());
                collectionF.add((zzmm) zzmlVarZzf.zzj());
            }
        } else {
            collectionF = k.f();
        }
        zzmkVarZzf.zzd(collectionF);
        zzmn zzmnVar = (zzmn) zzmkVarZzf.zzj();
        p pVar = this.zza;
        byte[] bArrZzd = zzmnVar.zzd();
        pVar.invoke(objArr, zzeb.zzh().zzi(bArrZzd, 0, bArrZzd.length));
        return true;
    }
}
