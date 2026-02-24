package com.google.ads.interactivemedia.v3.impl.data;

import com.google.ads.interactivemedia.v3.internal.avo;
import com.google.ads.interactivemedia.v3.internal.avs;

/* JADX INFO: loaded from: classes3.dex */
final class ar extends TestingConfiguration {
    private final boolean disableExperiments;
    private final boolean disableOnScreenDetection;
    private final boolean disableSkipFadeTransition;
    private final boolean enableMonitorAppLifecycle;
    private final avs<String, Object> extraParams;
    private final avo<Integer> forceExperimentIds;
    private final boolean forceTvMode;
    private final boolean ignoreStrictModeFalsePositives;
    private final boolean useTestStreamManager;
    private final boolean useVideoElementMock;
    private final float videoElementMockDuration;

    private ar(boolean z9, boolean z10, boolean z11, avo<Integer> avoVar, boolean z12, float f9, boolean z13, boolean z14, boolean z15, boolean z16, avs<String, Object> avsVar) {
        this.disableExperiments = z9;
        this.disableOnScreenDetection = z10;
        this.disableSkipFadeTransition = z11;
        this.forceExperimentIds = avoVar;
        this.useVideoElementMock = z12;
        this.videoElementMockDuration = f9;
        this.useTestStreamManager = z13;
        this.enableMonitorAppLifecycle = z14;
        this.forceTvMode = z15;
        this.ignoreStrictModeFalsePositives = z16;
        this.extraParams = avsVar;
    }

    public /* synthetic */ ar(boolean z9, boolean z10, boolean z11, avo avoVar, boolean z12, float f9, boolean z13, boolean z14, boolean z15, boolean z16, avs avsVar, aq aqVar) {
        this(z9, z10, z11, avoVar, z12, f9, z13, z14, z15, z16, avsVar);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableExperiments() {
        return this.disableExperiments;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableOnScreenDetection() {
        return this.disableOnScreenDetection;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean disableSkipFadeTransition() {
        return this.disableSkipFadeTransition;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean enableMonitorAppLifecycle() {
        return this.enableMonitorAppLifecycle;
    }

    public boolean equals(Object obj) {
        avo<Integer> avoVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof TestingConfiguration) {
            TestingConfiguration testingConfiguration = (TestingConfiguration) obj;
            if (this.disableExperiments == testingConfiguration.disableExperiments() && this.disableOnScreenDetection == testingConfiguration.disableOnScreenDetection() && this.disableSkipFadeTransition == testingConfiguration.disableSkipFadeTransition() && ((avoVar = this.forceExperimentIds) != null ? avoVar.equals(testingConfiguration.forceExperimentIds()) : testingConfiguration.forceExperimentIds() == null) && this.useVideoElementMock == testingConfiguration.useVideoElementMock() && Float.floatToIntBits(this.videoElementMockDuration) == Float.floatToIntBits(testingConfiguration.videoElementMockDuration()) && this.useTestStreamManager == testingConfiguration.useTestStreamManager() && this.enableMonitorAppLifecycle == testingConfiguration.enableMonitorAppLifecycle() && this.forceTvMode == testingConfiguration.forceTvMode() && this.ignoreStrictModeFalsePositives == testingConfiguration.ignoreStrictModeFalsePositives()) {
                avs<String, Object> avsVar = this.extraParams;
                avs<String, Object> avsVarExtraParams = testingConfiguration.extraParams();
                if (avsVar != null ? avsVar.equals(avsVarExtraParams) : avsVarExtraParams == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public avs<String, Object> extraParams() {
        return this.extraParams;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public avo<Integer> forceExperimentIds() {
        return this.forceExperimentIds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean forceTvMode() {
        return this.forceTvMode;
    }

    public int hashCode() {
        int i9 = ((((((true != this.disableExperiments ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true != this.disableOnScreenDetection ? 1237 : 1231)) * 1000003) ^ (true != this.disableSkipFadeTransition ? 1237 : 1231)) * 1000003;
        avo<Integer> avoVar = this.forceExperimentIds;
        int iHashCode = (((((((((((((i9 ^ (avoVar == null ? 0 : avoVar.hashCode())) * 1000003) ^ (true != this.useVideoElementMock ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.videoElementMockDuration)) * 1000003) ^ (true != this.useTestStreamManager ? 1237 : 1231)) * 1000003) ^ (true != this.enableMonitorAppLifecycle ? 1237 : 1231)) * 1000003) ^ (true != this.forceTvMode ? 1237 : 1231)) * 1000003) ^ (true != this.ignoreStrictModeFalsePositives ? 1237 : 1231)) * 1000003;
        avs<String, Object> avsVar = this.extraParams;
        return iHashCode ^ (avsVar != null ? avsVar.hashCode() : 0);
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean ignoreStrictModeFalsePositives() {
        return this.ignoreStrictModeFalsePositives;
    }

    public String toString() {
        return "TestingConfiguration{disableExperiments=" + this.disableExperiments + ", disableOnScreenDetection=" + this.disableOnScreenDetection + ", disableSkipFadeTransition=" + this.disableSkipFadeTransition + ", forceExperimentIds=" + String.valueOf(this.forceExperimentIds) + ", useVideoElementMock=" + this.useVideoElementMock + ", videoElementMockDuration=" + this.videoElementMockDuration + ", useTestStreamManager=" + this.useTestStreamManager + ", enableMonitorAppLifecycle=" + this.enableMonitorAppLifecycle + ", forceTvMode=" + this.forceTvMode + ", ignoreStrictModeFalsePositives=" + this.ignoreStrictModeFalsePositives + ", extraParams=" + String.valueOf(this.extraParams) + "}";
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useTestStreamManager() {
        return this.useTestStreamManager;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public boolean useVideoElementMock() {
        return this.useVideoElementMock;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.TestingConfiguration
    public float videoElementMockDuration() {
        return this.videoElementMockDuration;
    }
}
