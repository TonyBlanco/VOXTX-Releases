package com.amplifyframework.predictions.models;

import android.graphics.RectF;
import com.amplifyframework.predictions.models.ImageFeature;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class Label extends ImageFeature<String> {
    public static final String FEATURE_TYPE = "Label";
    private final List<RectF> boxes;
    private final List<String> parentLabels;

    public static final class Builder extends ImageFeature.Builder<Builder, Label, String> {
        private List<RectF> boxes;
        private List<String> parentLabels;

        private Builder() {
            this.parentLabels = new ArrayList();
            this.boxes = new ArrayList();
        }

        public Builder boxes(List<RectF> list) {
            Objects.requireNonNull(list);
            this.boxes = list;
            return this;
        }

        @Override // com.amplifyframework.predictions.models.Feature.Builder
        public Label build() {
            return new Label(this);
        }

        public List<RectF> getBoxes() {
            List<RectF> listOf = Immutable.of(this.boxes);
            Objects.requireNonNull(listOf);
            return listOf;
        }

        public List<String> getParentLabels() {
            List<String> listOf = Immutable.of(this.parentLabels);
            Objects.requireNonNull(listOf);
            return listOf;
        }

        public Builder name(String str) {
            return (Builder) super.value(str);
        }

        public Builder parentLabels(List<String> list) {
            Objects.requireNonNull(list);
            this.parentLabels = list;
            return this;
        }
    }

    private Label(Builder builder) {
        super(builder);
        this.parentLabels = builder.getParentLabels();
        this.boxes = builder.getBoxes();
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<RectF> getBoxes() {
        return this.boxes;
    }

    public String getName() {
        return getValue();
    }

    public List<String> getParentLabels() {
        return this.parentLabels;
    }

    @Override // com.amplifyframework.predictions.models.Feature
    public String getTypeAlias() {
        return FEATURE_TYPE;
    }
}
