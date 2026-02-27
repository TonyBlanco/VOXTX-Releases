package com.google.android.recaptcha.internal;

import G8.InterfaceC0602w;
import G8.L;
import G8.X0;
import android.content.Context;
import android.os.Build;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k8.m;
import l8.AbstractC2205B;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzda {

    @NotNull
    public static final zzct zza = new zzct(null);
    public InterfaceC0602w zzb;

    @NotNull
    private final WebView zzc;

    @NotNull
    private final String zzd;

    @NotNull
    private final Context zze;

    @NotNull
    private final zzr zzf;

    @NotNull
    private final String zzg;

    @NotNull
    private final String zzh;

    @NotNull
    private final zzaj zzi;

    @NotNull
    private final Map zzj;

    @NotNull
    private final Map zzk;

    @NotNull
    private final Map zzl;

    @NotNull
    private final zzas zzm;

    @NotNull
    private final zzdk zzn;

    @NotNull
    private final kotlinx.coroutines.sync.b zzo;

    @NotNull
    private final zzcu zzp;

    public zzda(@NotNull WebView webView, @NotNull String str, @NotNull Context context, @NotNull zzr zzrVar, @NotNull String str2, @NotNull String str3, @NotNull zzaj zzajVar, @NotNull L l9) {
        this.zzc = webView;
        this.zzd = str;
        this.zze = context;
        this.zzf = zzrVar;
        this.zzg = str2;
        this.zzh = str3;
        this.zzi = zzajVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.zzk = linkedHashMap;
        this.zzl = linkedHashMap;
        this.zzm = new zzba(new zzbc(webView, l9), zzp.zzc(), context);
        this.zzn = zzdk.zzc();
        this.zzo = kotlinx.coroutines.sync.d.b(false, 1, null);
        zzcu zzcuVar = new zzcu(this);
        this.zzp = zzcuVar;
        this.zzj = zzq();
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(zzcuVar, "RN");
        webView.setWebViewClient(new zzcs(this));
    }

    private final zzh zzo(Exception exc) {
        return exc instanceof X0 ? new zzh(zzf.zzc, zzd.zzj) : exc instanceof zzh ? (zzh) exc : new zzh(zzf.zzc, zzd.zzu);
    }

    private final void zzp(List list, zzh zzhVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzkw zzkwVar = (zzkw) it.next();
            zzai zzaiVar = zzai.zza;
            String str = this.zzg;
            String str2 = this.zzh;
            zzai.zzd(new zzaf(zzkwVar, str, str2, str2, null), String.valueOf(zzhVar.zzb().zza()), zzhVar.zza().zza(), this.zze, this.zzf, null);
        }
    }

    private static final Map zzq() {
        Map mapF = AbstractC2205B.f(m.a(-4, zzd.zzA), m.a(-12, zzd.zzB), m.a(-6, zzd.zzw), m.a(-11, zzd.zzy), m.a(-13, zzd.zzC), m.a(-14, zzd.zzD), m.a(-2, zzd.zzx), m.a(-7, zzd.zzE), m.a(-5, zzd.zzF), m.a(-9, zzd.zzG), m.a(-8, zzd.zzQ), m.a(-15, zzd.zzz), m.a(-1, zzd.zzH), m.a(-3, zzd.zzJ), m.a(-10, zzd.zzK));
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 26) {
            mapF.put(-16, zzd.zzI);
        }
        if (i9 >= 27) {
            mapF.put(1, zzd.zzM);
            mapF.put(2, zzd.zzN);
            mapF.put(0, zzd.zzO);
            mapF.put(3, zzd.zzP);
        }
        if (i9 >= 29) {
            mapF.put(4, zzd.zzL);
        }
        return mapF;
    }

    @NotNull
    public final WebView zzb() {
        return this.zzc;
    }

    @NotNull
    public final zzas zzd() {
        return this.zzm;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzf(@org.jetbrains.annotations.NotNull com.google.android.recaptcha.RecaptchaAction r12, @org.jetbrains.annotations.NotNull o8.InterfaceC2372d r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzf(com.google.android.recaptcha.RecaptchaAction, o8.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object zzg(@org.jetbrains.annotations.NotNull o8.InterfaceC2372d r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzda.zzg(o8.d):java.lang.Object");
    }

    @NotNull
    public final InterfaceC0602w zzm() {
        InterfaceC0602w interfaceC0602w = this.zzb;
        if (interfaceC0602w != null) {
            return interfaceC0602w;
        }
        return null;
    }
}
