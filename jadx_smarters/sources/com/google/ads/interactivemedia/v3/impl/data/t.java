package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class t extends bb {
    private final double end;
    private final boolean played;
    private final double start;

    public t(double d9, double d10, boolean z9) {
        this.start = d9;
        this.end = d10;
        this.played = z9;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bb
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bb) {
            bb bbVar = (bb) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(bbVar.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(bbVar.end()) && this.played == bbVar.played()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (true != this.played ? 1237 : 1231) ^ ((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bb
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.bb
    public double start() {
        return this.start;
    }

    public String toString() {
        return "CuePointData{start=" + this.start + ", end=" + this.end + ", played=" + this.played + "}";
    }
}
