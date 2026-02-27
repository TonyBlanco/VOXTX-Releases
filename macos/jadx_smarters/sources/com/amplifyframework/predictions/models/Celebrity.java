package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.Feature;

/* JADX INFO: loaded from: classes.dex */
public final class Celebrity extends Feature<String> {

    public static final class Builder extends Feature.Builder<Builder, Celebrity, String> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Celebrity build() {
            return new Celebrity(this);
        }

        public Builder name(String str) {
            return (Builder) super.value(str);
        }
    }

    private Celebrity(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getName() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.CELEBRITY.getAlias();
    }
}
