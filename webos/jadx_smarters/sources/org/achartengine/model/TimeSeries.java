package org.achartengine.model;

import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
public class TimeSeries extends XYSeries {
    public TimeSeries(String str) {
        super(str);
    }

    public synchronized void add(Date date, double d9) {
        super.add(date.getTime(), d9);
    }

    @Override // org.achartengine.model.XYSeries
    public double getPadding(double d9) {
        return 1.0d;
    }
}
