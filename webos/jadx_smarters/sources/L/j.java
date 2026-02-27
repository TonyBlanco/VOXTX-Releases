package L;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class j implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Locale[] f3861c = new Locale[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Locale f3862d = new Locale("en", "XA");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Locale f3863e = new Locale("ar", "XB");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Locale f3864f = i.b("en-Latn");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Locale[] f3865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3866b;

    public j(Locale... localeArr) {
        String string;
        if (localeArr.length == 0) {
            this.f3865a = f3861c;
            string = "";
        } else {
            ArrayList arrayList = new ArrayList();
            HashSet hashSet = new HashSet();
            StringBuilder sb = new StringBuilder();
            for (int i9 = 0; i9 < localeArr.length; i9++) {
                Locale locale = localeArr[i9];
                if (locale == null) {
                    throw new NullPointerException("list[" + i9 + "] is null");
                }
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    c(sb, locale2);
                    if (i9 < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            }
            this.f3865a = (Locale[]) arrayList.toArray(new Locale[0]);
            string = sb.toString();
        }
        this.f3866b = string;
    }

    public static void c(StringBuilder sb, Locale locale) {
        sb.append(locale.getLanguage());
        String country = locale.getCountry();
        if (country == null || country.isEmpty()) {
            return;
        }
        sb.append('-');
        sb.append(locale.getCountry());
    }

    @Override // L.k
    public String a() {
        return this.f3866b;
    }

    @Override // L.k
    public Object b() {
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        Locale[] localeArr = ((j) obj).f3865a;
        if (this.f3865a.length != localeArr.length) {
            return false;
        }
        int i9 = 0;
        while (true) {
            Locale[] localeArr2 = this.f3865a;
            if (i9 >= localeArr2.length) {
                return true;
            }
            if (!localeArr2[i9].equals(localeArr[i9])) {
                return false;
            }
            i9++;
        }
    }

    @Override // L.k
    public Locale get(int i9) {
        if (i9 >= 0) {
            Locale[] localeArr = this.f3865a;
            if (i9 < localeArr.length) {
                return localeArr[i9];
            }
        }
        return null;
    }

    public int hashCode() {
        int iHashCode = 1;
        for (Locale locale : this.f3865a) {
            iHashCode = (iHashCode * 31) + locale.hashCode();
        }
        return iHashCode;
    }

    @Override // L.k
    public boolean isEmpty() {
        return this.f3865a.length == 0;
    }

    @Override // L.k
    public int size() {
        return this.f3865a.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        int i9 = 0;
        while (true) {
            Locale[] localeArr = this.f3865a;
            if (i9 >= localeArr.length) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(localeArr[i9]);
            if (i9 < this.f3865a.length - 1) {
                sb.append(',');
            }
            i9++;
        }
    }
}
