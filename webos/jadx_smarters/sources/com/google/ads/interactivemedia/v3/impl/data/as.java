package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class as extends bz {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    public as(long j9, long j10, String str) {
        this.currentTime = j9;
        this.duration = j10;
        if (str == null) {
            throw new NullPointerException("Null timeUnit");
        }
        this.timeUnit = str;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bz
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bz
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bz) {
            bz bzVar = (bz) obj;
            if (this.currentTime == bzVar.currentTime() && this.duration == bzVar.duration() && this.timeUnit.equals(bzVar.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j9 = this.currentTime;
        long j10 = this.duration;
        return this.timeUnit.hashCode() ^ ((((((int) (j9 ^ (j9 >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bz
    public String timeUnit() {
        return this.timeUnit;
    }

    public String toString() {
        return "TimeUpdateData{currentTime=" + this.currentTime + ", duration=" + this.duration + ", timeUnit=" + this.timeUnit + "}";
    }
}
