package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class ajf extends WebChromeClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f19932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ aly f19933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ List f19934c;

    public ajf(Context context, aly alyVar, List list) {
        this.f19932a = context;
        this.f19933b = alyVar;
        this.f19934c = list;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z9, boolean z10, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(this.f19932a);
        webViewTransport.setWebView(webView2);
        webView2.setWebViewClient(new aje(this));
        message.sendToTarget();
        return true;
    }
}
