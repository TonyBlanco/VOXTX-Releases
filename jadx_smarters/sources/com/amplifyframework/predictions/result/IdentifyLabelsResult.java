package com.amplifyframework.predictions.result;

import com.amplifyframework.predictions.models.Label;
import com.amplifyframework.util.Immutable;
import j$.util.Objects;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class IdentifyLabelsResult implements IdentifyResult {
    private final List<Label> labels;
    private final boolean unsafeContent;

    public static final class Builder {
        private List<Label> labels;
        private boolean unsafeContent;

        private Builder() {
            this.labels = Collections.emptyList();
        }

        public IdentifyLabelsResult build() {
            return new IdentifyLabelsResult(this);
        }

        public List<Label> getLabels() {
            List<Label> list = this.labels;
            Objects.requireNonNull(list);
            return list;
        }

        public boolean getUnsafeContent() {
            return this.unsafeContent;
        }

        public Builder labels(List<Label> list) {
            Objects.requireNonNull(list);
            this.labels = list;
            return this;
        }

        public Builder unsafeContent(boolean z9) {
            this.unsafeContent = z9;
            return this;
        }
    }

    private IdentifyLabelsResult(Builder builder) {
        this.labels = builder.getLabels();
        this.unsafeContent = builder.getUnsafeContent();
    }

    public static Builder builder() {
        return new Builder();
    }

    public List<Label> getLabels() {
        return Immutable.of(this.labels);
    }

    public boolean isUnsafeContent() {
        return this.unsafeContent;
    }
}
