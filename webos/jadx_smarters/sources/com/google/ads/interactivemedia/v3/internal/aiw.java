package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class aiw implements AdsRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f19888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f19889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f19890c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ContentProgressProvider f19891d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ait f19892e = ait.UNKNOWN;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private aiv f19893f = aiv.UNKNOWN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private aiu f19894g = aiu.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Float f19895h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f19896i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f19897j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f19898k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Float f19899l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Float f19900m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private SecureSignals f19901n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private transient Object f19902o;

    public final ait a() {
        return this.f19892e;
    }

    public final aiu b() {
        return this.f19894g;
    }

    public final aiv c() {
        return this.f19893f;
    }

    public final Float d() {
        return this.f19895h;
    }

    public final Float e() {
        return this.f19900m;
    }

    public final Float f() {
        return this.f19899l;
    }

    public final String g() {
        return this.f19897j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdTagUrl() {
        return this.f19888a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getAdsResponse() {
        return this.f19890c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final ContentProgressProvider getContentProgressProvider() {
        return this.f19891d;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final String getExtraParameter(String str) {
        Map map = this.f19889b;
        if (map == null) {
            return null;
        }
        return (String) map.get(str);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Map<String, String> getExtraParameters() {
        return this.f19889b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final SecureSignals getSecureSignals() {
        return this.f19901n;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final Object getUserRequestContext() {
        return this.f19902o;
    }

    public final String h() {
        return this.f19898k;
    }

    public final List i() {
        return this.f19896i;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdTagUrl(String str) {
        this.f19888a = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillAutoPlay(boolean z9) {
        this.f19892e = z9 ? ait.AUTO : ait.CLICK;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdWillPlayMuted(boolean z9) {
        this.f19893f = z9 ? aiv.MUTED : aiv.UNMUTED;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setAdsResponse(String str) {
        this.f19890c = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentDuration(float f9) {
        this.f19895h = Float.valueOf(f9);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentKeywords(List<String> list) {
        this.f19896i = list;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentProgressProvider(ContentProgressProvider contentProgressProvider) {
        this.f19891d = contentProgressProvider;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentTitle(String str) {
        this.f19897j = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContentUrl(String str) {
        this.f19898k = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setContinuousPlayback(boolean z9) {
        this.f19894g = z9 ? aiu.ON : aiu.OFF;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setExtraParameter(String str, String str2) {
        if (this.f19889b == null) {
            this.f19889b = new HashMap();
        }
        this.f19889b.put(str, str2);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setLiveStreamPrefetchSeconds(float f9) {
        this.f19900m = Float.valueOf(f9);
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setSecureSignals(SecureSignals secureSignals) {
        this.f19901n = secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setUserRequestContext(Object obj) {
        this.f19902o = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsRequest
    public final void setVastLoadTimeout(float f9) {
        this.f19899l = Float.valueOf(f9);
    }
}
