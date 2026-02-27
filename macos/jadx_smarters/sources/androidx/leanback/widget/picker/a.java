package androidx.leanback.widget.picker;

import android.content.res.Resources;
import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f15755a = true;

    /* JADX INFO: renamed from: androidx.leanback.widget.picker.a$a, reason: collision with other inner class name */
    public static class C0177a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Locale f15756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f15757b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String[] f15758c;

        public C0177a(Locale locale, Resources resources) {
            this.f15756a = locale;
            this.f15757b = DateFormatSymbols.getInstance(locale).getShortMonths();
            Calendar calendar = Calendar.getInstance(locale);
            this.f15758c = a.a(calendar.getMinimum(5), calendar.getMaximum(5), "%02d");
        }
    }

    public static String[] a(int i9, int i10, String str) {
        String[] strArr = new String[(i10 - i9) + 1];
        for (int i11 = i9; i11 <= i10; i11++) {
            int i12 = i11 - i9;
            if (str != null) {
                strArr[i12] = String.format(str, Integer.valueOf(i11));
            } else {
                strArr[i12] = String.valueOf(i11);
            }
        }
        return strArr;
    }

    public static Calendar b(Calendar calendar, Locale locale) {
        if (calendar == null) {
            return Calendar.getInstance(locale);
        }
        long timeInMillis = calendar.getTimeInMillis();
        Calendar calendar2 = Calendar.getInstance(locale);
        calendar2.setTimeInMillis(timeInMillis);
        return calendar2;
    }

    public static C0177a c(Locale locale, Resources resources) {
        return new C0177a(locale, resources);
    }
}
