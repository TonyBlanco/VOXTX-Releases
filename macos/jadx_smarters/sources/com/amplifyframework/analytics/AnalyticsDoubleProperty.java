package com.amplifyframework.analytics;

import O.c;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class AnalyticsDoubleProperty implements AnalyticsPropertyBehavior<Double> {
    private final Double value;

    private AnalyticsDoubleProperty(Double d9) {
        this.value = d9;
    }

    public static AnalyticsDoubleProperty from(Double d9) {
        Objects.requireNonNull(d9);
        return new AnalyticsDoubleProperty(d9);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AnalyticsDoubleProperty.class != obj.getClass()) {
            return false;
        }
        return c.a(getValue(), ((AnalyticsDoubleProperty) obj).getValue());
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.amplifyframework.analytics.AnalyticsPropertyBehavior
    public Double getValue() {
        return this.value;
    }

    public int hashCode() {
        return getValue().hashCode();
    }

    public String toString() {
        return "AnalyticsDoubleProperty{value=" + this.value + '}';
    }
}
