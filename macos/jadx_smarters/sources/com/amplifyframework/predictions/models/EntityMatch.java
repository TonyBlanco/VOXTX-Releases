package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.ImageFeature;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class EntityMatch extends ImageFeature<String> {

    public static final class Builder extends ImageFeature.Builder<Builder, EntityMatch, String> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public EntityMatch build() {
            return new EntityMatch(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder externalImageId(String str) {
            Objects.requireNonNull(str);
            return (Builder) value(str);
        }
    }

    private EntityMatch(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getExternalImageId() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.ENTITY_MATCH.getAlias();
    }
}
