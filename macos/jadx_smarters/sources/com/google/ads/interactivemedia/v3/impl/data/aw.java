package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class aw extends cf {
    private final float volume;

    private aw(float f9) {
        this.volume = f9;
    }

    public /* synthetic */ aw(float f9, av avVar) {
        this(f9);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof cf) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((cf) obj).volume());
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        return "VolumeUpdateData{volume=" + this.volume + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.cf
    public float volume() {
        return this.volume;
    }
}
