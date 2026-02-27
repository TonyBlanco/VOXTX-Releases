package com.google.android.material.datepicker;

import android.os.Build;
import android.text.format.DateUtils;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static String a(long j9) {
        return b(j9, Locale.getDefault());
    }

    public static String b(long j9, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? v.b(locale).format(new Date(j9)) : v.f(locale).format(new Date(j9));
    }

    public static String c(long j9) {
        return DateUtils.formatDateTime(null, j9, 8228);
    }

    public static String d(long j9) {
        return e(j9, Locale.getDefault());
    }

    public static String e(long j9, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? v.m(locale).format(new Date(j9)) : v.f(locale).format(new Date(j9));
    }
}
