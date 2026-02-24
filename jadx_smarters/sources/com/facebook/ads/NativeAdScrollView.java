package com.facebook.ads;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Keep;
import com.facebook.ads.NativeAdView;
import com.facebook.ads.internal.api.NativeAdScrollViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class NativeAdScrollView extends LinearLayout {
    public static final int DEFAULT_INSET = 20;
    public static final int DEFAULT_MAX_ADS = 10;
    private final NativeAdScrollViewApi mNativeAdScrollViewApi;

    @Keep
    public interface AdViewProvider {
        View createView(NativeAd nativeAd, int i9);

        void destroyView(NativeAd nativeAd, View view);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i9) {
        this(context, nativeAdsManager, null, i9, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i9, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, i9, null, nativeAdViewAttributes, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, int i9, NativeAdViewAttributes nativeAdViewAttributes, int i10) {
        this(context, nativeAdsManager, null, i9, null, nativeAdViewAttributes, i10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, 10);
    }

    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i9) {
        this(context, nativeAdsManager, adViewProvider, 0, null, null, i9);
    }

    private NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, AdViewProvider adViewProvider, int i9, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i10) {
        super(context);
        this.mNativeAdScrollViewApi = DynamicLoaderFactory.makeLoader(context).createNativeAdScrollViewApi(this, context, nativeAdsManager, adViewProvider, i9, type, nativeAdViewAttributes, i10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type) {
        this(context, nativeAdsManager, null, 0, type, null, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, 10);
    }

    @Deprecated
    public NativeAdScrollView(Context context, NativeAdsManager nativeAdsManager, NativeAdView.Type type, NativeAdViewAttributes nativeAdViewAttributes, int i9) {
        this(context, nativeAdsManager, null, 0, type, nativeAdViewAttributes, i9);
    }

    public void setInset(int i9) {
        this.mNativeAdScrollViewApi.setInset(i9);
    }
}
