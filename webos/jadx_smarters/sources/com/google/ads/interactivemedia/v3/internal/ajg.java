package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.Base64;
import android.webkit.WebView;
import com.amazonaws.services.s3.util.Mimetypes;
import com.google.ads.interactivemedia.v3.impl.data.CompanionData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"ViewConstructor"})
public final class ajg extends WebView {
    @SuppressLint({"SetJavaScriptEnabled"})
    public ajg(Context context, CompanionData companionData, List list, aly alyVar) {
        super(context);
        getSettings().setJavaScriptEnabled(true);
        getSettings().setSupportMultipleWindows(true);
        setWebChromeClient(new ajf(context, alyVar, list));
        if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.az.Html) {
            loadData(Base64.encodeToString(companionData.src().getBytes(), 1), Mimetypes.MIMETYPE_HTML, "base64");
            return;
        }
        if (companionData.type() == com.google.ads.interactivemedia.v3.impl.data.az.IFrame) {
            loadUrl(companionData.src());
            return;
        }
        throw new IllegalArgumentException("Companion type " + String.valueOf(companionData.type()) + " is not valid for a CompanionWebView");
    }
}
