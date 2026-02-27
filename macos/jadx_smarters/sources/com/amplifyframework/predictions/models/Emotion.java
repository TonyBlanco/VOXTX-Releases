package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class Emotion extends Feature<EmotionType> {

    public static final class Builder extends Feature.Builder<Builder, Emotion, EmotionType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Emotion build() {
            return new Emotion(this);
        }
    }

    private Emotion(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.EMOTION.getAlias();
    }
}
