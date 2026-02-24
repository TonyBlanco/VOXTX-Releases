package com.google.android.recaptcha.internal;

import G8.AbstractC0579k;
import G8.L;
import android.webkit.WebView;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class zzbc {

    @NotNull
    private final WebView zza;

    @NotNull
    private final L zzb;

    public zzbc(@NotNull WebView webView, @NotNull L l9) {
        this.zza = webView;
        this.zzb = l9;
    }

    public final void zzb(@NotNull String str, @NotNull String... strArr) {
        AbstractC0579k.d(this.zzb, null, null, new zzbb(strArr, this, str, null), 3, null);
    }
}
