package com.google.android.recaptcha.internal;

import G8.InterfaceC0585n;
import android.webkit.JavascriptInterface;
import java.util.concurrent.TimeUnit;
import k8.j;
import k8.k;
import k8.q;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcu {
    final /* synthetic */ zzda zza;

    @Nullable
    private Long zzb;

    @NotNull
    private final zzdk zzc = zzdk.zzb();

    public zzcu(zzda zzdaVar) {
        this.zza = zzdaVar;
    }

    private final void zzb() {
        if (this.zzb == null) {
            this.zzc.zzf();
            this.zzb = Long.valueOf(this.zzc.zza(TimeUnit.MILLISECONDS));
        }
    }

    @Nullable
    public final Long zza() {
        return this.zzb;
    }

    @JavascriptInterface
    public final void zzoed(@NotNull String str) throws zzgy {
        Object objA;
        zzb();
        zzlz zzlzVarZzg = zzlz.zzg(zzeb.zzh().zzj(str));
        zzlzVarZzg.zzi().name();
        zzlzVarZzg.zzk();
        InterfaceC0585n interfaceC0585n = (InterfaceC0585n) this.zza.zzk.remove(zzlzVarZzg.zzj());
        String strZzk = zzlzVarZzg.zzk();
        if (strZzk == null || strZzk.length() == 0) {
            zzlzVarZzg.zzi().name();
            zzg zzgVar = zzh.zza;
            zzh zzhVarZza = zzg.zza(zzlzVarZzg.zzi());
            zzlzVarZzg.zzj();
            if (interfaceC0585n == null) {
                return;
            }
            j.a aVar = j.f43666c;
            objA = k.a(zzhVarZza);
        } else if (interfaceC0585n == null) {
            return;
        } else {
            objA = zzlzVarZzg.zzk();
        }
        interfaceC0585n.resumeWith(j.b(objA));
    }

    @JavascriptInterface
    public final void zzoid(@NotNull String str) throws zzgy {
        zzb();
        zzmd zzmdVarZzg = zzmd.zzg(zzeb.zzh().zzj(str));
        zzmdVarZzg.zzi().name();
        if (zzmdVarZzg.zzi() == zzmf.JS_CODE_SUCCESS) {
            this.zza.zzm().hashCode();
            if (this.zza.zzm().p(q.f43674a)) {
                return;
            }
            this.zza.zzm().hashCode();
            return;
        }
        zzmdVarZzg.zzi().name();
        zzg zzgVar = zzh.zza;
        zzh zzhVarZza = zzg.zza(zzmdVarZzg.zzi());
        this.zza.zzm().hashCode();
        this.zza.zzm().n(zzhVarZza);
    }

    @JavascriptInterface
    public final void zzrp(@NotNull String str) {
        zzb();
        this.zza.zzd().zza(str);
    }
}
