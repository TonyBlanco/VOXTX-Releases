package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
final class au extends ce {
    private byte set$0;
    private float volume;

    @Override // com.google.ads.interactivemedia.v3.impl.data.ce
    public cf build() {
        if (this.set$0 == 1) {
            return new aw(this.volume, null);
        }
        throw new IllegalStateException("Missing required properties: volume");
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.ce
    public ce volume(float f9) {
        this.volume = f9;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }
}
