package org.achartengine.chart;

import android.graphics.RectF;

/* JADX INFO: loaded from: classes4.dex */
public class ClickableArea {
    private RectF rect;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private double f46145x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private double f46146y;

    public ClickableArea(RectF rectF, double d9, double d10) {
        this.rect = rectF;
        this.f46145x = d9;
        this.f46146y = d10;
    }

    public RectF getRect() {
        return this.rect;
    }

    public double getX() {
        return this.f46145x;
    }

    public double getY() {
        return this.f46146y;
    }
}
