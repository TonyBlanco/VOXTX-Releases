package com.google.ads.interactivemedia.v3.impl.data;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ce {
    public abstract cf build();

    public abstract ce volume(float f9);

    public ce volumePercentage(int i9) {
        return volume(i9 / 100.0f);
    }
}
