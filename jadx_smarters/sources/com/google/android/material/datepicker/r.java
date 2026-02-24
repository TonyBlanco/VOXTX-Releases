package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public class r {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final r f27368c = new r(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f27369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TimeZone f27370b;

    public r(Long l9, TimeZone timeZone) {
        this.f27369a = l9;
        this.f27370b = timeZone;
    }

    public static r c() {
        return f27368c;
    }

    public Calendar a() {
        return b(this.f27370b);
    }

    public Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l9 = this.f27369a;
        if (l9 != null) {
            calendar.setTimeInMillis(l9.longValue());
        }
        return calendar;
    }
}
