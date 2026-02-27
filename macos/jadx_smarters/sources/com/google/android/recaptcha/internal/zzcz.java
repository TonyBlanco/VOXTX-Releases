package com.google.android.recaptcha.internal;

import G8.AbstractC0579k;
import G8.InterfaceC0602w;
import G8.L;
import android.os.Build;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import k8.j;
import k8.k;
import k8.q;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p8.AbstractC2512c;
import q8.AbstractC2643b;
import q8.l;
import w8.p;

/* JADX INFO: loaded from: classes3.dex */
final class zzcz extends l implements p {
    int zza;
    final /* synthetic */ zzda zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzcz(zzda zzdaVar, InterfaceC2372d interfaceC2372d) {
        super(2, interfaceC2372d);
        this.zzb = zzdaVar;
    }

    @Override // q8.AbstractC2642a
    @NotNull
    public final InterfaceC2372d create(@Nullable Object obj, @NotNull InterfaceC2372d interfaceC2372d) {
        return new zzcz(this.zzb, interfaceC2372d);
    }

    @Override // w8.p
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzcz) create((L) obj, (InterfaceC2372d) obj2)).invokeSuspend(q.f43674a);
    }

    @Override // q8.AbstractC2642a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) throws Throwable {
        Object objD = AbstractC2512c.d();
        int i9 = this.zza;
        k.b(obj);
        if (i9 == 0) {
            zzu zzuVar = zzu.zza;
            String strZza = zzu.zza(this.zzb.zze);
            String str = this.zzb.zzd;
            String packageName = this.zzb.zze.getPackageName();
            String str2 = this.zzb.zzh;
            int i10 = Build.VERSION.SDK_INT;
            byte[] bytes = ("k=" + URLEncoder.encode(str, "UTF-8") + "&pk=" + URLEncoder.encode(packageName, "UTF-8") + "&mst=" + URLEncoder.encode(strZza, "UTF-8") + "&msv=" + URLEncoder.encode("18.1.2", "UTF-8") + "&msi=" + URLEncoder.encode(str2, "UTF-8") + "&mov=" + i10).getBytes(Charset.forName("UTF-8"));
            zzai zzaiVar = zzai.zza;
            zzai.zzc(new zzaf(zzkw.INIT_NATIVE, this.zzb.zzg, this.zzb.zzh, this.zzb.zzh, null), this.zzb.zze, this.zzb.zzf);
            zzai.zzb(new zzaf(zzkw.INIT_NETWORK, this.zzb.zzg, this.zzb.zzh, this.zzb.zzh, null), this.zzb.zzd, new zzs());
            AbstractC0579k.d(zzp.zza(), null, null, new zzcy(this.zzb, strZza, null), 3, null);
            this.zzb.zzn.zzd();
            this.zzb.zzn.zze();
            zzda zzdaVar = this.zzb;
            zzdaVar.zzb().postUrl(zzdaVar.zzf.zza(), bytes);
            AbstractC2643b.b(this.zzb.zzm().hashCode());
            InterfaceC0602w interfaceC0602wZzm = this.zzb.zzm();
            this.zza = 1;
            if (interfaceC0602wZzm.q(this) == objD) {
                return objD;
            }
        }
        return j.a(j.b(q.f43674a));
    }
}
