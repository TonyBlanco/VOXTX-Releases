package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.TextFeature;

/* JADX INFO: loaded from: classes.dex */
public final class Syntax extends TextFeature<SpeechType> {

    public static final class Builder extends TextFeature.Builder<Builder, Syntax, SpeechType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Syntax build() {
            return new Syntax(this);
        }
    }

    private Syntax(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.SYNTAX.getAlias();
    }
}
