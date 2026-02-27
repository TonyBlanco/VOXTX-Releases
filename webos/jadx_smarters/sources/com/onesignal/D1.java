package com.onesignal;

import android.content.Context;
import android.webkit.WebView;

/* JADX INFO: loaded from: classes4.dex */
public class D1 extends WebView {
    public D1(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.View
    public void computeScroll() {
    }

    @Override // android.view.View
    public boolean overScrollBy(int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z9) {
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int i9, int i10) {
    }
}
