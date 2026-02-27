package com.nst.iptvsmarterstvbox.view.activity;

import a7.f;
import a7.g;
import a7.j;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* JADX INFO: loaded from: classes4.dex */
public class PrivacyPolicyActivity extends androidx.appcompat.app.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31482d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public WebView f31483e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressDialog f31484f;

    public class b extends WebViewClient {
        public b() {
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            PrivacyPolicyActivity.this.f31484f.dismiss();
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            PrivacyPolicyActivity.this.f31484f.show();
            return shouldOverrideUrlLoading(webView, webResourceRequest.getUrl().toString());
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (this.f31483e.canGoBack()) {
            this.f31483e.goBack();
        } else {
            super.onBackPressed();
        }
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12865r0);
        getIntent();
        this.f31482d = getIntent().getStringExtra("url");
        this.f31483e = (WebView) findViewById(f.Tm);
        ProgressDialog progressDialog = new ProgressDialog(this);
        this.f31484f = progressDialog;
        progressDialog.setMessage(getResources().getString(j.f13412v5));
        this.f31484f.show();
        this.f31484f.setCancelable(false);
        this.f31483e.getSettings().setJavaScriptEnabled(true);
        this.f31483e.getSettings().setLoadWithOverviewMode(true);
        this.f31483e.getSettings().setUseWideViewPort(true);
        this.f31483e.setWebViewClient(new b());
        this.f31483e.loadUrl(this.f31482d);
    }
}
