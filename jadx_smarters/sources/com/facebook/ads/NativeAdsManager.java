package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.TryRoom;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.api.NativeAdsManagerApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import com.facebook.ads.internal.util.common.Preconditions;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NativeAdsManager {
    private final NativeAdsManagerApi mNativeAdsManagerApi;

    @Keep
    public interface Listener {
        void onAdError(AdError adError);

        void onAdsLoaded();
    }

    public NativeAdsManager(Context context, String str, int i9) {
        Preconditions.checkNotNull(context, "Context can not be null");
        Preconditions.checkIsTrue(i9 > -1, "Number of requested ads should be not be negative");
        this.mNativeAdsManagerApi = DynamicLoaderFactory.makeLoader(context).createNativeAdsManagerApi(context, str, i9);
    }

    public void disableAutoRefresh() {
        this.mNativeAdsManagerApi.disableAutoRefresh();
    }

    public int getUniqueNativeAdCount() {
        return this.mNativeAdsManagerApi.getUniqueNativeAdCount();
    }

    public boolean isLoaded() {
        NativeAdsManagerApi nativeAdsManagerApi = this.mNativeAdsManagerApi;
        return false;
    }

    public void loadAds() {
        NativeAdsManagerApi nativeAdsManagerApi = this.mNativeAdsManagerApi;
        TryRoom.DianePie();
    }

    public void loadAds(NativeAdBase.MediaCacheFlag mediaCacheFlag) {
        NativeAdsManagerApi nativeAdsManagerApi = this.mNativeAdsManagerApi;
        TryRoom.DianePie();
    }

    public NativeAd nextNativeAd() {
        return this.mNativeAdsManagerApi.nextNativeAd();
    }

    public void setExtraHints(String str) {
        this.mNativeAdsManagerApi.setExtraHints(str);
    }

    public void setListener(Listener listener) {
        this.mNativeAdsManagerApi.setListener(listener);
    }
}
