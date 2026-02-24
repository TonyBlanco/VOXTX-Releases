package com.google.ads.interactivemedia.v3.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import java.util.HashSet;
import org.json.JSONObject;
import p.C2383d;

/* JADX INFO: loaded from: classes3.dex */
public final class aly {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f20170a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f20171b;

    public aly(Context context, AdsRenderingSettings adsRenderingSettings) {
        this.f20170a = context;
        this.f20171b = adsRenderingSettings;
    }

    public aly(ahw ahwVar) {
        this.f20170a = ahwVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.google.ads.interactivemedia.v3.api.AdsRenderingSettings, java.lang.Object] */
    public final void a(String str) {
        if (this.f20171b.getEnableCustomTabs()) {
            new C2383d.a().a().a((Context) this.f20170a, Uri.parse(str));
            return;
        }
        Object obj = this.f20170a;
        if (str == null || str.length() <= 0) {
            return;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        if (!(obj instanceof Activity)) {
            intent.setFlags(268435456);
        }
        ((Context) obj).startActivity(intent);
    }

    public final void b(AdsRenderingSettings adsRenderingSettings) {
        this.f20171b = adsRenderingSettings;
    }

    public final JSONObject c() {
        return (JSONObject) this.f20171b;
    }

    public final void d() {
        ((ahw) this.f20170a).a(new ahx(this, null));
    }

    public final void e(JSONObject jSONObject, HashSet hashSet, long j9) {
        ((ahw) this.f20170a).a(new ahy(this, hashSet, jSONObject, j9, null));
    }

    public final void f(JSONObject jSONObject, HashSet hashSet, long j9) {
        ((ahw) this.f20170a).a(new ahz(this, hashSet, jSONObject, j9, null));
    }

    public final void g(JSONObject jSONObject) {
        this.f20171b = jSONObject;
    }
}
