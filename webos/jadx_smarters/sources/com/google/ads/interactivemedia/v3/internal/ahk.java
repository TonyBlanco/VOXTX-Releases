package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* JADX INFO: loaded from: classes3.dex */
final class ahk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ ahl f19771a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WebView f19772b;

    public ahk(ahl ahlVar) {
        this.f19771a = ahlVar;
        this.f19772b = ahlVar.f19773a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f19772b.destroy();
    }
}
