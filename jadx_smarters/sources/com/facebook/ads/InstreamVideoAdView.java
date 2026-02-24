package com.facebook.ads;

import android.content.Context;
import android.os.Bundle;
import android.widget.RelativeLayout;
import androidx.annotation.Keep;
import com.TryRoom;
import com.facebook.ads.Ad;
import com.facebook.ads.internal.api.InstreamVideoAdViewApi;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
@Keep
@Deprecated
public class InstreamVideoAdView extends RelativeLayout implements Ad {
    private final InstreamVideoAdViewApi mInstreamVideoAdViewApi;

    @Keep
    @Deprecated
    public interface InstreamVideoLoadAdConfig extends Ad.LoadAdConfig {
    }

    @Keep
    @Deprecated
    public interface InstreamVideoLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Deprecated
        InstreamVideoLoadAdConfig build();

        @Deprecated
        InstreamVideoLoadConfigBuilder withAdListener(InstreamVideoAdListener instreamVideoAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Deprecated
        InstreamVideoLoadConfigBuilder withBid(String str);
    }

    @Deprecated
    public InstreamVideoAdView(Context context, Bundle bundle) {
        super(context);
        this.mInstreamVideoAdViewApi = DynamicLoaderFactory.makeLoader(context).createInstreamVideoAdViewApi(this, context, bundle);
    }

    @Deprecated
    public InstreamVideoAdView(Context context, String str, AdSize adSize) {
        super(context);
        this.mInstreamVideoAdViewApi = DynamicLoaderFactory.makeLoader(context).createInstreamVideoAdViewApi(this, context, str, adSize);
    }

    @Deprecated
    public InstreamVideoLoadConfigBuilder buildLoadAdConfig() {
        return this.mInstreamVideoAdViewApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void destroy() {
        this.mInstreamVideoAdViewApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public String getPlacementId() {
        return this.mInstreamVideoAdViewApi.getPlacementId();
    }

    @Deprecated
    public Bundle getSaveInstanceState() {
        return this.mInstreamVideoAdViewApi.getSaveInstanceState();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public boolean isAdInvalidated() {
        InstreamVideoAdViewApi instreamVideoAdViewApi = this.mInstreamVideoAdViewApi;
        return false;
    }

    @Deprecated
    public boolean isAdLoaded() {
        InstreamVideoAdViewApi instreamVideoAdViewApi = this.mInstreamVideoAdViewApi;
        return false;
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void loadAd() {
        InstreamVideoAdViewApi instreamVideoAdViewApi = this.mInstreamVideoAdViewApi;
        TryRoom.DianePie();
    }

    @Deprecated
    public void loadAd(InstreamVideoLoadAdConfig instreamVideoLoadAdConfig) {
        InstreamVideoAdViewApi instreamVideoAdViewApi = this.mInstreamVideoAdViewApi;
        TryRoom.DianePie();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void loadAdFromBid(String str) {
        InstreamVideoAdViewApi instreamVideoAdViewApi = this.mInstreamVideoAdViewApi;
        TryRoom.DianePie();
    }

    @Deprecated
    public void setAdListener(InstreamVideoAdListener instreamVideoAdListener) {
        this.mInstreamVideoAdViewApi.setAdListener(instreamVideoAdListener);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mInstreamVideoAdViewApi.setExtraHints(extraHints);
    }

    @Deprecated
    public boolean show() {
        InstreamVideoAdViewApi instreamVideoAdViewApi = this.mInstreamVideoAdViewApi;
        return TryRoom.DianePieNull();
    }
}
