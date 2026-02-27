package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class ad extends bq {
    private final int connectionTimeoutMs;
    private final String content;
    private final String id;
    private final int readTimeoutMs;
    private final bp requestType;
    private final String url;
    private final String userAgent;

    public ad(bp bpVar, String str, String str2, String str3, String str4, int i9, int i10) {
        if (bpVar == null) {
            throw new NullPointerException("Null requestType");
        }
        this.requestType = bpVar;
        if (str == null) {
            throw new NullPointerException("Null id");
        }
        this.id = str;
        if (str2 == null) {
            throw new NullPointerException("Null url");
        }
        this.url = str2;
        this.content = str3;
        if (str4 == null) {
            throw new NullPointerException("Null userAgent");
        }
        this.userAgent = str4;
        this.connectionTimeoutMs = i9;
        this.readTimeoutMs = i10;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bq
    public int connectionTimeoutMs() {
        return this.connectionTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bq
    public String content() {
        return this.content;
    }

    public boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bq) {
            bq bqVar = (bq) obj;
            if (this.requestType.equals(bqVar.requestType()) && this.id.equals(bqVar.id()) && this.url.equals(bqVar.url()) && ((str = this.content) != null ? str.equals(bqVar.content()) : bqVar.content() == null) && this.userAgent.equals(bqVar.userAgent()) && this.connectionTimeoutMs == bqVar.connectionTimeoutMs() && this.readTimeoutMs == bqVar.readTimeoutMs()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (((((this.requestType.hashCode() ^ 1000003) * 1000003) ^ this.id.hashCode()) * 1000003) ^ this.url.hashCode()) * 1000003;
        String str = this.content;
        return ((((((iHashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.userAgent.hashCode()) * 1000003) ^ this.connectionTimeoutMs) * 1000003) ^ this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bq
    public String id() {
        return this.id;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bq
    public int readTimeoutMs() {
        return this.readTimeoutMs;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bq
    public bp requestType() {
        return this.requestType;
    }

    public String toString() {
        return "NetworkRequestData{requestType=" + String.valueOf(this.requestType) + ", id=" + this.id + ", url=" + this.url + ", content=" + this.content + ", userAgent=" + this.userAgent + ", connectionTimeoutMs=" + this.connectionTimeoutMs + ", readTimeoutMs=" + this.readTimeoutMs + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bq
    public String url() {
        return this.url;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bq
    public String userAgent() {
        return this.userAgent;
    }
}
