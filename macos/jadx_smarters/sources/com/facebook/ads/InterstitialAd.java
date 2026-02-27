package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.TryRoom;
import com.facebook.ads.Ad;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.internal.api.InterstitialAdApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;
import java.util.EnumSet;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class InterstitialAd implements FullScreenAd {
    private final InterstitialAdApi mInterstitialAdApi;

    @Keep
    public interface InterstitialAdLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialLoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialAdLoadConfigBuilder withAdListener(InterstitialAdListener interstitialAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        InterstitialAdLoadConfigBuilder withBid(String str);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialAdLoadConfigBuilder withCacheFlags(EnumSet<CacheFlag> enumSet);

        InterstitialAdLoadConfigBuilder withRewardData(RewardData rewardData);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialAdLoadConfigBuilder withRewardedAdListener(RewardedAdListener rewardedAdListener);
    }

    @Keep
    public interface InterstitialAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        InterstitialShowAdConfig build();
    }

    @Keep
    public interface InterstitialLoadAdConfig extends Ad.LoadAdConfig {
    }

    @Keep
    public interface InterstitialShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    @Benchmark
    public InterstitialAd(Context context, String str) {
        this.mInterstitialAdApi = DynamicLoaderFactory.makeLoader(context).createInterstitialAd(context, str, this);
    }

    @Override // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public InterstitialAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mInterstitialAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public InterstitialAdShowConfigBuilder buildShowAdConfig() {
        return this.mInterstitialAdApi.buildShowAdConfig();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mInterstitialAdApi.destroy();
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mInterstitialAdApi.getPlacementId();
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        return false;
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        return false;
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        TryRoom.DianePie();
    }

    public void loadAd(InterstitialLoadAdConfig interstitialLoadAdConfig) {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        TryRoom.DianePie();
    }

    @Benchmark
    @Deprecated
    public void loadAd(EnumSet<CacheFlag> enumSet) {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        TryRoom.DianePie();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void loadAdFromBid(String str) {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        TryRoom.DianePie();
    }

    @Benchmark
    @Deprecated
    public void loadAdFromBid(EnumSet<CacheFlag> enumSet, String str) {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        TryRoom.DianePie();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public void setAdListener(InterstitialAdListener interstitialAdListener) {
        this.mInterstitialAdApi.setAdListener(interstitialAdListener);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mInterstitialAdApi.setExtraHints(extraHints);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public void setRewardedAdListener(RewardedAdListener rewardedAdListener) {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
    }

    @Override // com.facebook.ads.FullScreenAd
    @Benchmark
    public boolean show() {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        return TryRoom.DianePieNull();
    }

    @Benchmark
    public boolean show(InterstitialShowAdConfig interstitialShowAdConfig) {
        InterstitialAdApi interstitialAdApi = this.mInterstitialAdApi;
        return TryRoom.DianePieNull();
    }
}
