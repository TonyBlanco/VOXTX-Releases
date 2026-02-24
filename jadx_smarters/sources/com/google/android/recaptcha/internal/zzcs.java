package com.google.android.recaptcha.internal;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.http.protocol.HTTP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class zzcs extends WebViewClient {
    final /* synthetic */ zzda zza;

    public zzcs(zzda zzdaVar) {
        this.zza = zzdaVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onLoadResource(@NotNull WebView webView, @NotNull String str) {
        System.currentTimeMillis();
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(@NotNull WebView webView, @NotNull String str) {
        zzai zzaiVar = zzai.zza;
        zzai.zzc(new zzaf(zzkw.INIT_NETWORK, this.zza.zzg, this.zza.zzh, this.zza.zzh, null), this.zza.zze, this.zza.zzf);
        long jZza = this.zza.zzn.zza(TimeUnit.MICROSECONDS);
        zzj zzjVar = zzj.zza;
        zzj.zza(zzl.zzl.zza(), jZza);
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(@NotNull WebView webView, int i9, @NotNull String str, @NotNull String str2) {
        super.onReceivedError(webView, i9, str, str2);
        zzf zzfVar = zzf.zze;
        zzd zzdVar = (zzd) this.zza.zzj.get(Integer.valueOf(i9));
        if (zzdVar == null) {
            zzdVar = zzd.zzb;
        }
        zzh zzhVar = new zzh(zzfVar, zzdVar);
        this.zza.zzm().hashCode();
        zzhVar.getMessage();
        this.zza.zzm().n(zzhVar);
    }

    @Override // android.webkit.WebViewClient
    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@NotNull WebView webView, @NotNull String str) {
        zzdb zzdbVar = zzdb.zza;
        if (zzdb.zza(Uri.parse(str))) {
            return super.shouldInterceptRequest(webView, str);
        }
        Uri uri = Uri.parse(str);
        zzh zzhVar = new zzh(zzf.zzc, zzd.zzu);
        this.zza.zzm().hashCode();
        uri.toString();
        this.zza.zzm().n(zzhVar);
        return new WebResourceResponse(HTTP.PLAIN_TEXT_TYPE, "UTF-8", new ByteArrayInputStream(new byte[0]));
    }
}
