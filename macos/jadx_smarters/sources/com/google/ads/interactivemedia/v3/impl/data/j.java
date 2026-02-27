package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class j extends b {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final ay nativeViewBounds;
    private final boolean nativeViewHidden;
    private final ay nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private j(String str, String str2, String str3, long j9, double d9, boolean z9, ay ayVar, ay ayVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j9;
        this.nativeVolume = d9;
        this.nativeViewHidden = z9;
        this.nativeViewBounds = ayVar;
        this.nativeViewVisibleBounds = ayVar2;
    }

    public /* synthetic */ j(String str, String str2, String str3, long j9, double d9, boolean z9, ay ayVar, ay ayVar2, i iVar) {
        this(str, str2, str3, j9, d9, z9, ayVar, ayVar2);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof b) {
            b bVar = (b) obj;
            if (this.queryId.equals(bVar.queryId()) && this.eventId.equals(bVar.eventId()) && this.appState.equals(bVar.appState()) && this.nativeTime == bVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(bVar.nativeVolume()) && !this.nativeViewHidden && this.nativeViewBounds.equals(bVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(bVar.nativeViewVisibleBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String eventId() {
        return this.eventId;
    }

    public int hashCode() {
        int iHashCode = this.queryId.hashCode();
        int iHashCode2 = this.eventId.hashCode();
        int iHashCode3 = this.appState.hashCode();
        long j9 = this.nativeTime;
        return ((((((((((((((iHashCode ^ 1000003) * 1000003) ^ iHashCode2) * 1000003) ^ iHashCode3) * 1000003) ^ ((int) ((j9 >>> 32) ^ j9))) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume)))) * 1000003) ^ (true != this.nativeViewHidden ? 1237 : 1231)) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public long nativeTime() {
        return this.nativeTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public ay nativeViewBounds() {
        return this.nativeViewBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public ay nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public double nativeVolume() {
        return this.nativeVolume;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.b
    public String queryId() {
        return this.queryId;
    }

    public String toString() {
        return "ActivityMonitorData{queryId=" + this.queryId + ", eventId=" + this.eventId + ", appState=" + this.appState + ", nativeTime=" + this.nativeTime + ", nativeVolume=" + this.nativeVolume + ", nativeViewHidden=" + this.nativeViewHidden + ", nativeViewBounds=" + String.valueOf(this.nativeViewBounds) + ", nativeViewVisibleBounds=" + String.valueOf(this.nativeViewVisibleBounds) + "}";
    }
}
