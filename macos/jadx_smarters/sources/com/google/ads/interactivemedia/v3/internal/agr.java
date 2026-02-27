package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class agr {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WebView f19696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List f19697b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19698c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f19699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f19700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ags f19701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final bdy f19702g;

    private agr(bdy bdyVar, WebView webView, String str, String str2, ags agsVar, byte[] bArr, byte[] bArr2) {
        this.f19702g = bdyVar;
        this.f19696a = webView;
        this.f19701f = agsVar;
        this.f19700e = str;
        this.f19699d = str2;
    }

    public static agr g(bdy bdyVar, WebView webView, String str, String str2) {
        if (str2.length() <= 256) {
            return new agr(bdyVar, webView, str, str2, ags.JAVASCRIPT, null, null);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    public final WebView a() {
        return this.f19696a;
    }

    public final ags b() {
        return this.f19701f;
    }

    public final String c() {
        return this.f19700e;
    }

    public final String d() {
        return this.f19699d;
    }

    public final List e() {
        return Collections.unmodifiableList(this.f19697b);
    }

    public final Map f() {
        return Collections.unmodifiableMap(this.f19698c);
    }

    public final bdy h() {
        return this.f19702g;
    }
}
