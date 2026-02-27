package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
final class ahc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f19757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f19758b;

    public ahc(WebView webView, String str) {
        this.f19757a = webView;
        this.f19758b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19757a.loadUrl(this.f19758b);
    }
}
