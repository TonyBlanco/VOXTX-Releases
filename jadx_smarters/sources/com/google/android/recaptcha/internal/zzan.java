package com.google.android.recaptcha.internal;

import G8.L;
import android.content.ContentValues;
import k8.k;
import k8.q;
import l8.s;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzan extends l implements p {
    final /* synthetic */ zzkx zza;
    final /* synthetic */ zzao zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzan(zzkx zzkxVar, zzao zzaoVar, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zza = zzkxVar;
        this.zzb = zzaoVar;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzan(this.zza, this.zzb, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzan) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        AbstractC2512c.d();
        k.b(obj);
        zzkx zzkxVar = this.zza;
        zzao zzaoVar = this.zzb;
        synchronized (zzaj.class) {
            try {
                byte[] bArrZzd = zzkxVar.zzd();
                zzae zzaeVar = new zzae(zzeb.zzg().zzi(bArrZzd, 0, bArrZzd.length), System.currentTimeMillis(), 0);
                zzad zzadVar = zzaoVar.zze;
                ContentValues contentValues = new ContentValues();
                contentValues.put("ss", zzaeVar.zzc());
                contentValues.put("ts", Long.valueOf(zzaeVar.zzb()));
                zzadVar.getWritableDatabase().insert("ce", null, contentValues);
                int iZzb = zzaoVar.zze.zzb() - 500;
                if (iZzb > 0) {
                    zzaoVar.zze.zza(s.H(zzaoVar.zze.zzd(), iZzb));
                }
                if (zzaoVar.zze.zzb() >= 20) {
                    zzaoVar.zzg();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q.f43674a;
    }
}
