package L;

import android.os.Build;
import android.os.LocaleList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f3859b = a(new Locale[0]);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f3860a;

    public static class a {
        public static Locale a(String str) {
            return Locale.forLanguageTag(str);
        }
    }

    public static class b {
        public static LocaleList a(Locale... localeArr) {
            return new LocaleList(localeArr);
        }

        public static LocaleList b() {
            return LocaleList.getAdjustedDefault();
        }

        public static LocaleList c() {
            return LocaleList.getDefault();
        }
    }

    public i(k kVar) {
        this.f3860a = kVar;
    }

    public static i a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? i(b.a(localeArr)) : new i(new j(localeArr));
    }

    public static Locale b(String str) {
        if (str.contains("-")) {
            String[] strArrSplit = str.split("-", -1);
            if (strArrSplit.length > 2) {
                return new Locale(strArrSplit[0], strArrSplit[1], strArrSplit[2]);
            }
            if (strArrSplit.length > 1) {
                return new Locale(strArrSplit[0], strArrSplit[1]);
            }
            if (strArrSplit.length == 1) {
                return new Locale(strArrSplit[0]);
            }
        } else {
            if (!str.contains("_")) {
                return new Locale(str);
            }
            String[] strArrSplit2 = str.split("_", -1);
            if (strArrSplit2.length > 2) {
                return new Locale(strArrSplit2[0], strArrSplit2[1], strArrSplit2[2]);
            }
            if (strArrSplit2.length > 1) {
                return new Locale(strArrSplit2[0], strArrSplit2[1]);
            }
            if (strArrSplit2.length == 1) {
                return new Locale(strArrSplit2[0]);
            }
        }
        throw new IllegalArgumentException("Can not parse language tag: [" + str + "]");
    }

    public static i c(String str) {
        if (str == null || str.isEmpty()) {
            return e();
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i9 = 0; i9 < length; i9++) {
            localeArr[i9] = a.a(strArrSplit[i9]);
        }
        return a(localeArr);
    }

    public static i e() {
        return f3859b;
    }

    public static i i(LocaleList localeList) {
        return new i(new r(localeList));
    }

    public Locale d(int i9) {
        return this.f3860a.get(i9);
    }

    public boolean equals(Object obj) {
        return (obj instanceof i) && this.f3860a.equals(((i) obj).f3860a);
    }

    public boolean f() {
        return this.f3860a.isEmpty();
    }

    public int g() {
        return this.f3860a.size();
    }

    public String h() {
        return this.f3860a.a();
    }

    public int hashCode() {
        return this.f3860a.hashCode();
    }

    public String toString() {
        return this.f3860a.toString();
    }
}
