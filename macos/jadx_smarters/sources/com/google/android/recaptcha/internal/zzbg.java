package com.google.android.recaptcha.internal;

import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.internal.l;
import l8.AbstractC2212g;
import l8.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbg extends zzbd {

    @NotNull
    private final zzbf zza;

    @NotNull
    private final String zzb;

    public zzbg(@NotNull zzbf zzbfVar, @NotNull String str, @Nullable Object obj) {
        super(obj);
        this.zza = zzbfVar;
        this.zzb = str;
    }

    @Override // com.google.android.recaptcha.internal.zzbd
    public final boolean zza(@NotNull Object obj, @NotNull Method method, @Nullable Object[] objArr) {
        List listF;
        if (!l.a(method.getName(), this.zzb)) {
            return false;
        }
        zzbf zzbfVar = this.zza;
        if (objArr == null || (listF = AbstractC2212g.b(objArr)) == null) {
            listF = k.f();
        }
        zzbfVar.zzb(listF);
        return true;
    }
}
