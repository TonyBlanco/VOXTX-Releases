package com.amplifyframework.predictions.models;

import j$.util.Objects;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public abstract class Feature<T> implements Comparable<Feature<T>> {
    private final float confidence;
    private final String id;
    private final T value;

    public static abstract class Builder<B extends Builder<B, R, T>, R extends Feature<T>, T> {
        private float confidence;
        private String id = UUID.randomUUID().toString();
        private T value;

        public abstract R build();

        public final B confidence(float f9) {
            this.confidence = f9;
            return this;
        }

        public final float getConfidence() {
            return this.confidence;
        }

        public final String getId() {
            String str = this.id;
            Objects.requireNonNull(str);
            return str;
        }

        public final T getValue() {
            T t9 = this.value;
            Objects.requireNonNull(t9);
            return t9;
        }

        public final B id(String str) {
            Objects.requireNonNull(str);
            this.id = str;
            return this;
        }

        public final B value(T t9) {
            Objects.requireNonNull(t9);
            this.value = t9;
            return this;
        }
    }

    public Feature(Builder<?, ? extends Feature<T>, T> builder) {
        this.id = builder.getId();
        this.value = builder.getValue();
        this.confidence = builder.getConfidence();
    }

    @Override // java.lang.Comparable
    public int compareTo(Feature<T> feature) {
        if (feature == null) {
            return -1;
        }
        int iCompareToIgnoreCase = getTypeAlias().compareToIgnoreCase(feature.getTypeAlias());
        return iCompareToIgnoreCase != 0 ? iCompareToIgnoreCase : (int) Math.signum(getConfidence() - feature.getConfidence());
    }

    public final float getConfidence() {
        return this.confidence;
    }

    public final String getId() {
        return this.id;
    }

    public abstract String getTypeAlias();

    public final T getValue() {
        return this.value;
    }
}
