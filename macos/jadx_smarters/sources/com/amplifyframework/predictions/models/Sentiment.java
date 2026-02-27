package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class Sentiment extends Feature<SentimentType> {

    public static final class Builder extends Feature.Builder<Builder, Sentiment, SentimentType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Sentiment build() {
            return new Sentiment(this);
        }
    }

    private Sentiment(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.SENTIMENT.getAlias();
    }
}
