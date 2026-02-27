package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.api.CompanionAdSlot;

/* JADX INFO: loaded from: classes3.dex */
final class aje extends WebViewClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ajf f19931a;

    public aje(ajf ajfVar) {
        this.f19931a = ajfVar;
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        this.f19931a.f19933b.a(str);
        for (CompanionAdSlot.ClickListener clickListener : this.f19931a.f19934c) {
        }
        return true;
    }
}
