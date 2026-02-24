package com.amplifyframework.predictions.models;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes.dex */
public final class Selection {
    private final RectF box;
    private final Polygon polygon;
    private final boolean selected;

    public static final class Builder {
        private RectF box;
        private Polygon polygon;
        private boolean selected;

        public Builder box(RectF rectF) {
            this.box = rectF;
            return this;
        }

        public Selection build() {
            return new Selection(this.box, this.polygon, this.selected);
        }

        public RectF getBox() {
            return this.box;
        }

        public Polygon getPolygon() {
            return this.polygon;
        }

        public boolean isSelected() {
            return this.selected;
        }

        public Builder polygon(Polygon polygon) {
            this.polygon = polygon;
            return this;
        }

        public Builder selected(boolean z9) {
            this.selected = z9;
            return this;
        }
    }

    private Selection(RectF rectF, Polygon polygon, boolean z9) {
        this.box = rectF;
        this.polygon = polygon;
        this.selected = z9;
    }

    public static Builder builder() {
        return new Builder();
    }

    public RectF getBox() {
        return this.box;
    }

    public Polygon getPolygon() {
        return this.polygon;
    }

    public boolean isSelected() {
        return this.selected;
    }
}
