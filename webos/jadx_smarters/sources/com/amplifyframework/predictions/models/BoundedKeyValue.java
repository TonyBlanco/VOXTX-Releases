package com.amplifyframework.predictions.models;

import O.d;
import com.amplifyframework.predictions.models.ImageFeature;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class BoundedKeyValue extends ImageFeature<d> {

    public static final class Builder extends ImageFeature.Builder<Builder, BoundedKeyValue, d> {
        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public BoundedKeyValue build() {
            Objects.requireNonNull(getValue());
            Objects.requireNonNull(getValue().f5400a);
            Objects.requireNonNull(getValue().f5401b);
            return new BoundedKeyValue(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Builder keyValuePair(String str, String str2) {
            Objects.requireNonNull(str);
            Objects.requireNonNull(str2);
            return (Builder) value(d.a(str, str2));
        }
    }

    private BoundedKeyValue(Builder builder) {
        super(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getKey() {
        return (String) getValue().f5400a;
    }

    public String getKeyValue() {
        return (String) getValue().f5401b;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.BOUNDED_KEY_VALUE.getAlias();
    }
}
