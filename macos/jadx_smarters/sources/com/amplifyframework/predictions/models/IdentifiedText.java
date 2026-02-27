package com.amplifyframework.predictions.models;

import com.amplifyframework.predictions.models.ImageFeature;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class IdentifiedText extends ImageFeature<String> {
    private final int page;

    public static final class Builder extends ImageFeature.Builder<Builder, IdentifiedText, String> {
        private int page;

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public IdentifiedText build() {
            return new IdentifiedText(this);
        }

        public int getPage() {
            return this.page;
        }

        public Builder page(int i9) {
            this.page = i9;
            return this;
        }

        public Builder text(String str) {
            Objects.requireNonNull(str);
            return (Builder) super.value(str);
        }
    }

    private IdentifiedText(Builder builder) {
        super(builder);
        this.page = builder.getPage();
    }

    public static Builder builder() {
        return new Builder();
    }

    public int getPage() {
        return this.page;
    }

    public String getText() {
        return getValue();
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FeatureType.IDENTIFIED_TEXT.getAlias();
    }
}
