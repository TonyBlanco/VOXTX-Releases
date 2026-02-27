package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class at extends cd {
    private final Integer downloadBandwidthKbps;

    public at(Integer num) {
        if (num == null) {
            throw new NullPointerException("Null downloadBandwidthKbps");
        }
        this.downloadBandwidthKbps = num;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.cd
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cd) {
            return this.downloadBandwidthKbps.equals(((cd) obj).downloadBandwidthKbps());
        }
        return false;
    }

    public int hashCode() {
        return this.downloadBandwidthKbps.hashCode() ^ 1000003;
    }

    public String toString() {
        return "VideoEnvironmentData{downloadBandwidthKbps=" + this.downloadBandwidthKbps + "}";
    }
}
