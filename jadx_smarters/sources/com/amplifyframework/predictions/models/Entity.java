package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.TextFeature;

/* JADX INFO: loaded from: classes.dex */
public final class Entity extends TextFeature<EntityType> {

    public static final class Builder extends TextFeature.Builder<Builder, Entity, EntityType> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Entity build() {
            return new Entity(this);
        }
    }

    private Entity(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.ENTITY.getAlias();
    }
}
