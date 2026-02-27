package com.facebook.ads;

import android.content.Context;
import androidx.annotation.Keep;
import com.TryRoom;
import com.facebook.ads.Ad;
import com.facebook.ads.FullScreenAd;
import com.facebook.ads.internal.api.RewardedVideoAdApi;
import com.facebook.ads.internal.bench.Benchmark;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderFactory;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class RewardedVideoAd implements FullScreenAd {
    public static final int UNSET_VIDEO_DURATION = -1;
    private final RewardedVideoAdApi mRewardedVideoAdApi;

    @Keep
    public interface RewardedVideoAdLoadConfigBuilder extends Ad.LoadConfigBuilder {
        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoLoadAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdExperience(AdExperienceType adExperienceType);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withAdListener(RewardedVideoAdListener rewardedVideoAdListener);

        @Override // com.facebook.ads.Ad.LoadConfigBuilder
        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withBid(String str);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withFailOnCacheFailureEnabled(boolean z9);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        @Deprecated
        RewardedVideoAdLoadConfigBuilder withRVChainEnabled(boolean z9);

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdLoadConfigBuilder withRewardData(RewardData rewardData);
    }

    @Keep
    public interface RewardedVideoAdShowConfigBuilder extends FullScreenAd.ShowConfigBuilder {
        @Override // com.facebook.ads.FullScreenAd.ShowConfigBuilder
        RewardedVideoShowAdConfig build();

        @Benchmark(failAtMillis = 5, warnAtMillis = 1)
        RewardedVideoAdShowConfigBuilder withAppOrientation(int i9);
    }

    @Keep
    public interface RewardedVideoLoadAdConfig extends Ad.LoadAdConfig {
    }

    @Keep
    public interface RewardedVideoShowAdConfig extends FullScreenAd.ShowAdConfig {
    }

    @Benchmark
    public RewardedVideoAd(Context context, String str) {
        this.mRewardedVideoAdApi = DynamicLoaderFactory.makeLoader(context).createRewardedVideoAd(context, str, this);
    }

    @Override // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedVideoAdLoadConfigBuilder buildLoadAdConfig() {
        return this.mRewardedVideoAdApi.buildLoadAdConfig();
    }

    @Override // com.facebook.ads.FullScreenAd
    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public RewardedVideoAdShowConfigBuilder buildShowAdConfig() {
        return this.mRewardedVideoAdApi.buildShowAdConfig();
    }

    @Override // com.facebook.ads.Ad
    public void destroy() {
        this.mRewardedVideoAdApi.destroy();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public void enableRVChain(boolean z9) {
    }

    @Override // com.facebook.ads.Ad
    public String getPlacementId() {
        return this.mRewardedVideoAdApi.getPlacementId();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public int getVideoDuration() {
        return this.mRewardedVideoAdApi.getVideoDuration();
    }

    @Override // com.facebook.ads.Ad
    public boolean isAdInvalidated() {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        return false;
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    public boolean isAdLoaded() {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        return false;
    }

    @Override // com.facebook.ads.Ad
    public void loadAd() {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        TryRoom.DianePie();
    }

    @Benchmark
    public void loadAd(RewardedVideoLoadAdConfig rewardedVideoLoadAdConfig) {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        TryRoom.DianePie();
    }

    @Benchmark
    @Deprecated
    public void loadAd(boolean z9) {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        TryRoom.DianePie();
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void loadAdFromBid(String str) {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        TryRoom.DianePie();
    }

    @Benchmark
    @Deprecated
    public void loadAdFromBid(String str, boolean z9) {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        TryRoom.DianePie();
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public void setAdListener(RewardedVideoAdListener rewardedVideoAdListener) {
        this.mRewardedVideoAdApi.setAdListener(rewardedVideoAdListener);
    }

    @Override // com.facebook.ads.Ad
    @Deprecated
    public void setExtraHints(ExtraHints extraHints) {
        this.mRewardedVideoAdApi.setExtraHints(extraHints);
    }

    @Benchmark(failAtMillis = 5, warnAtMillis = 1)
    @Deprecated
    public void setRewardData(RewardData rewardData) {
        this.mRewardedVideoAdApi.setRewardData(rewardData);
    }

    @Override // com.facebook.ads.FullScreenAd
    public boolean show() {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        return TryRoom.DianePieNull();
    }

    @Benchmark
    @Deprecated
    public boolean show(int i9) {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        return TryRoom.DianePieNull();
    }

    @Benchmark
    public boolean show(RewardedVideoShowAdConfig rewardedVideoShowAdConfig) {
        RewardedVideoAdApi rewardedVideoAdApi = this.mRewardedVideoAdApi;
        return TryRoom.DianePieNull();
    }
}
