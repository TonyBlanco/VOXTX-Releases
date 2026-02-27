package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class h implements a {
    private String appState;
    private String eventId;
    private long nativeTime;
    private ay nativeViewBounds;
    private boolean nativeViewHidden;
    private ay nativeViewVisibleBounds;
    private double nativeVolume;
    private String queryId;
    private byte set$0;

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a appState(String str) {
        if (str == null) {
            throw new NullPointerException("Null appState");
        }
        this.appState = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public b build() {
        String str;
        String str2;
        String str3;
        ay ayVar;
        ay ayVar2;
        if (this.set$0 == 7 && (str = this.queryId) != null && (str2 = this.eventId) != null && (str3 = this.appState) != null && (ayVar = this.nativeViewBounds) != null && (ayVar2 = this.nativeViewVisibleBounds) != null) {
            return new j(str, str2, str3, this.nativeTime, this.nativeVolume, this.nativeViewHidden, ayVar, ayVar2, null);
        }
        StringBuilder sb = new StringBuilder();
        if (this.queryId == null) {
            sb.append(" queryId");
        }
        if (this.eventId == null) {
            sb.append(" eventId");
        }
        if (this.appState == null) {
            sb.append(" appState");
        }
        if ((this.set$0 & 1) == 0) {
            sb.append(" nativeTime");
        }
        if ((this.set$0 & 2) == 0) {
            sb.append(" nativeVolume");
        }
        if ((this.set$0 & 4) == 0) {
            sb.append(" nativeViewHidden");
        }
        if (this.nativeViewBounds == null) {
            sb.append(" nativeViewBounds");
        }
        if (this.nativeViewVisibleBounds == null) {
            sb.append(" nativeViewVisibleBounds");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a eventId(String str) {
        if (str == null) {
            throw new NullPointerException("Null eventId");
        }
        this.eventId = str;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeTime(long j9) {
        this.nativeTime = j9;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewBounds(ay ayVar) {
        if (ayVar == null) {
            throw new NullPointerException("Null nativeViewBounds");
        }
        this.nativeViewBounds = ayVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewHidden(boolean z9) {
        this.nativeViewHidden = z9;
        this.set$0 = (byte) (this.set$0 | 4);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeViewVisibleBounds(ay ayVar) {
        if (ayVar == null) {
            throw new NullPointerException("Null nativeViewVisibleBounds");
        }
        this.nativeViewVisibleBounds = ayVar;
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a nativeVolume(double d9) {
        this.nativeVolume = d9;
        this.set$0 = (byte) (this.set$0 | 2);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.a
    public a queryId(String str) {
        if (str == null) {
            throw new NullPointerException("Null queryId");
        }
        this.queryId = str;
        return this;
    }
}
