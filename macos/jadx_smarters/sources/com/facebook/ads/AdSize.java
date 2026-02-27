package com.facebook.ads;

import androidx.annotation.Keep;
import com.facebook.ads.internal.api.AdSizeApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AdSize implements Serializable {
    private final int UNDEFINED;
    private AdSizeApi mAdSizeApi;
    private final int mInitHeight;
    private final int mInitSizeType;
    private final int mInitWidth;

    @Deprecated
    public static final AdSize BANNER_320_50 = new AdSize(4);
    public static final AdSize INTERSTITIAL = new AdSize(100);
    public static final AdSize BANNER_HEIGHT_50 = new AdSize(5);
    public static final AdSize BANNER_HEIGHT_90 = new AdSize(6);
    public static final AdSize RECTANGLE_HEIGHT_250 = new AdSize(7);

    private AdSize(int i9) {
        this.UNDEFINED = -1;
        this.mInitSizeType = i9;
        this.mInitWidth = -1;
        this.mInitHeight = -1;
    }

    public AdSize(int i9, int i10) {
        this.UNDEFINED = -1;
        this.mInitSizeType = -1;
        this.mInitWidth = i9;
        this.mInitHeight = i10;
    }

    public static AdSize fromWidthAndHeight(int i9, int i10) {
        AdSize adSize = INTERSTITIAL;
        if (adSize.getHeight() == i10 && adSize.getWidth() == i9) {
            return adSize;
        }
        AdSize adSize2 = BANNER_320_50;
        if (adSize2.getHeight() == i10 && adSize2.getWidth() == i9) {
            return adSize2;
        }
        AdSize adSize3 = BANNER_HEIGHT_50;
        if (adSize3.getHeight() == i10 && adSize3.getWidth() == i9) {
            return adSize3;
        }
        AdSize adSize4 = BANNER_HEIGHT_90;
        if (adSize4.getHeight() == i10 && adSize4.getWidth() == i9) {
            return adSize4;
        }
        AdSize adSize5 = RECTANGLE_HEIGHT_250;
        if (adSize5.getHeight() == i10 && adSize5.getWidth() == i9) {
            return adSize5;
        }
        return null;
    }

    private AdSizeApi getAdSizeApi(int i9) {
        if (this.mAdSizeApi == null) {
            this.mAdSizeApi = DynamicLoaderFactory.makeLoaderUnsafe().createAdSizeApi(i9);
        }
        return this.mAdSizeApi;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdSize adSize = (AdSize) obj;
        return getWidth() == adSize.getWidth() && getHeight() == adSize.getHeight();
    }

    public int getHeight() {
        int i9 = this.mInitSizeType;
        return i9 != -1 ? getAdSizeApi(i9).getHeight() : this.mInitHeight;
    }

    public int getWidth() {
        int i9 = this.mInitSizeType;
        return i9 != -1 ? getAdSizeApi(i9).getWidth() : this.mInitWidth;
    }

    public int hashCode() {
        return (getWidth() * 31) + getHeight();
    }
}
