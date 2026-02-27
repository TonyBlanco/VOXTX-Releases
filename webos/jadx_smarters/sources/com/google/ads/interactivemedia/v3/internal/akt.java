package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignals;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class akt implements StreamRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f20048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f20049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f20050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f20051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f20052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f20053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f20054g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f20055h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f20056i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f20057j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f20058k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f20059l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f20060m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f20061n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private String f20062o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f20063p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private StreamRequest.StreamFormat f20064q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Boolean f20065r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private SecureSignals f20066s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private transient Object f20067t;

    public final void a(String str) {
        this.f20049b = str;
    }

    public final void b(String str) {
        this.f20048a = str;
    }

    public final void c(String str) {
        this.f20050c = str;
    }

    public final void d(String str) {
        this.f20054g = str;
    }

    public final void e(String str) {
        this.f20055h = str;
    }

    public final void f(String str) {
        this.f20053f = str;
    }

    public final void g(String str) {
        this.f20058k = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Map<String, String> getAdTagParameters() {
        return this.f20059l;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getApiKey() {
        return this.f20049b;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAssetKey() {
        return this.f20048a;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getAuthToken() {
        return this.f20062o;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentSourceId() {
        return this.f20050c;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getContentUrl() {
        return this.f20061n;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getCustomAssetKey() {
        return this.f20054g;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final boolean getEnableNonce() {
        return this.f20051d;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final StreamRequest.StreamFormat getFormat() {
        return this.f20064q;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getLiveStreamEventId() {
        return this.f20055h;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getManifestSuffix() {
        return this.f20060m;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getNetworkCode() {
        return this.f20053f;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getOAuthToken() {
        return this.f20058k;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getProjectNumber() {
        return this.f20057j;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getRegion() {
        return this.f20056i;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final SecureSignals getSecureSignals() {
        return this.f20066s;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getStreamActivityMonitorId() {
        return this.f20063p;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Boolean getUseQAStreamBaseUrl() {
        return this.f20065r;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final Object getUserRequestContext() {
        return this.f20067t;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final String getVideoId() {
        return this.f20052e;
    }

    public final void h(String str) {
        this.f20057j = str;
    }

    public final void i(String str) {
        this.f20056i = str;
    }

    public final void j(String str) {
        this.f20052e = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAdTagParameters(Map<String, String> map) {
        this.f20059l = map;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setAuthToken(String str) {
        this.f20062o = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setContentUrl(String str) {
        this.f20061n = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setEnableNonce(boolean z9) {
        this.f20051d = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setFormat(StreamRequest.StreamFormat streamFormat) {
        this.f20064q = streamFormat;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setManifestSuffix(String str) {
        this.f20060m = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setSecureSignals(SecureSignals secureSignals) {
        this.f20066s = secureSignals;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setStreamActivityMonitorId(String str) {
        this.f20063p = str;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setUseQAStreamBaseUrl(Boolean bool) {
        this.f20065r = bool;
    }

    @Override // com.google.ads.interactivemedia.v3.api.StreamRequest
    public final void setUserRequestContext(Object obj) {
        this.f20067t = obj;
    }
}
