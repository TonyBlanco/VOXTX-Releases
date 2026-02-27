package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class Language extends Feature<LanguageType> {

    public static final class Builder extends Feature.Builder<Builder, Language, LanguageType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Language build() {
            return new Language(this);
        }
    }

    private Language(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.LANGUAGE.getAlias();
    }
}
