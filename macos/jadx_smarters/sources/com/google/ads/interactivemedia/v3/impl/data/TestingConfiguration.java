package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.atf;
import com.google.ads.interactivemedia.v3.internal.avo;
import com.google.ads.interactivemedia.v3.internal.avs;

/* JADX INFO: loaded from: classes3.dex */
@atf(a = ar.class, b = {"extraParams", "isTv", "ignoreStrictModeFalsePositives"})
public abstract class TestingConfiguration {
    public static final String PARAMETER_KEY = "tcnfp";

    public interface Builder {
        TestingConfiguration build();

        Builder disableExperiments(boolean z9);

        Builder disableOnScreenDetection(boolean z9);

        Builder disableSkipFadeTransition(boolean z9);

        Builder enableMonitorAppLifecycle(boolean z9);

        Builder extraParams(avs<String, Object> avsVar);

        Builder forceExperimentIds(avo<Integer> avoVar);

        Builder forceTvMode(boolean z9);

        Builder ignoreStrictModeFalsePositives(boolean z9);

        Builder useTestStreamManager(boolean z9);

        Builder useVideoElementMock(boolean z9);

        Builder videoElementMockDuration(float f9);
    }

    public static Builder builder() {
        ap apVar = new ap();
        apVar.disableExperiments(true);
        apVar.disableOnScreenDetection(false);
        apVar.disableSkipFadeTransition(true);
        apVar.useVideoElementMock(false);
        apVar.videoElementMockDuration(30.0f);
        apVar.useTestStreamManager(false);
        apVar.ignoreStrictModeFalsePositives(false);
        apVar.forceTvMode(false);
        apVar.forceExperimentIds(null);
        apVar.enableMonitorAppLifecycle(true);
        return apVar;
    }

    public Builder copy() {
        ap apVar = new ap();
        apVar.disableExperiments(disableExperiments());
        apVar.disableOnScreenDetection(disableOnScreenDetection());
        apVar.disableSkipFadeTransition(disableSkipFadeTransition());
        apVar.useVideoElementMock(useVideoElementMock());
        apVar.videoElementMockDuration(videoElementMockDuration());
        apVar.useTestStreamManager(useTestStreamManager());
        apVar.forceExperimentIds(forceExperimentIds());
        apVar.enableMonitorAppLifecycle(enableMonitorAppLifecycle());
        apVar.forceTvMode(forceTvMode());
        apVar.ignoreStrictModeFalsePositives(ignoreStrictModeFalsePositives());
        apVar.extraParams(extraParams());
        return apVar;
    }

    public abstract boolean disableExperiments();

    public abstract boolean disableOnScreenDetection();

    public abstract boolean disableSkipFadeTransition();

    public abstract boolean enableMonitorAppLifecycle();

    public abstract avs<String, Object> extraParams();

    public abstract avo<Integer> forceExperimentIds();

    public abstract boolean forceTvMode();

    public abstract boolean ignoreStrictModeFalsePositives();

    public abstract boolean useTestStreamManager();

    public abstract boolean useVideoElementMock();

    public abstract float videoElementMockDuration();
}
