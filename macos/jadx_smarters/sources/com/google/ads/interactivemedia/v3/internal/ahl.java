package com.google.ads.interactivemedia.v3.internal;

import android.os.Handler;
import android.webkit.WebView;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ahl extends ahi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private WebView f19773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Long f19774b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f19775c;

    public ahl(Map map) {
        this.f19775c = map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahi
    public final void c() {
        super.c();
        new Handler().postDelayed(new ahk(this), Math.max(4000 - (this.f19774b == null ? 4000L : TimeUnit.MILLISECONDS.convert(System.nanoTime() - this.f19774b.longValue(), TimeUnit.NANOSECONDS)), 2000L));
        this.f19773a = null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahi
    public final void f(agt agtVar, agr agrVar) {
        JSONObject jSONObject = new JSONObject();
        Map mapF = agrVar.f();
        for (String str : mapF.keySet()) {
            ahn.h(jSONObject, str, (afe) mapF.get(str));
        }
        g(agtVar, agrVar, jSONObject);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ahi
    public final void j() {
        WebView webView = new WebView(ahb.b().a());
        this.f19773a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        i(this.f19773a);
        ahd.a().h(this.f19773a, null);
        Iterator it = this.f19775c.keySet().iterator();
        if (!it.hasNext()) {
            this.f19774b = Long.valueOf(System.nanoTime());
        } else {
            throw null;
        }
    }
}
