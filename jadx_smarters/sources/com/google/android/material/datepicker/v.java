package com.google.android.material.datepicker;

import android.icu.text.DateFormat;
import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicReference f27371a = new AtomicReference();

    public static long a(long j9) {
        Calendar calendarK = k();
        calendarK.setTimeInMillis(j9);
        return d(calendarK).getTimeInMillis();
    }

    public static DateFormat b(Locale locale) {
        return c("MMMEd", locale);
    }

    public static DateFormat c(String str, Locale locale) {
        DateFormat instanceForSkeleton = DateFormat.getInstanceForSkeleton(str, locale);
        instanceForSkeleton.setTimeZone(j());
        return instanceForSkeleton;
    }

    public static Calendar d(Calendar calendar) {
        Calendar calendarL = l(calendar);
        Calendar calendarK = k();
        calendarK.set(calendarL.get(1), calendarL.get(2), calendarL.get(5));
        return calendarK;
    }

    public static java.text.DateFormat e(int i9, Locale locale) {
        java.text.DateFormat dateInstance = java.text.DateFormat.getDateInstance(i9, locale);
        dateInstance.setTimeZone(h());
        return dateInstance;
    }

    public static java.text.DateFormat f(Locale locale) {
        return e(0, locale);
    }

    public static r g() {
        r rVar = (r) f27371a.get();
        return rVar == null ? r.c() : rVar;
    }

    public static TimeZone h() {
        return DesugarTimeZone.getTimeZone("UTC");
    }

    public static Calendar i() {
        Calendar calendarA = g().a();
        calendarA.set(11, 0);
        calendarA.set(12, 0);
        calendarA.set(13, 0);
        calendarA.set(14, 0);
        calendarA.setTimeZone(h());
        return calendarA;
    }

    public static android.icu.util.TimeZone j() {
        return android.icu.util.TimeZone.getTimeZone("UTC");
    }

    public static Calendar k() {
        return l(null);
    }

    public static Calendar l(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(h());
        if (calendar == null) {
            calendar2.clear();
        } else {
            calendar2.setTimeInMillis(calendar.getTimeInMillis());
        }
        return calendar2;
    }

    public static DateFormat m(Locale locale) {
        return c("yMMMEd", locale);
    }
}
