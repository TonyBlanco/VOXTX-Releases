package L;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static boolean a(String str, String str2) {
        if ("REL".equals(str2)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        return str2.toUpperCase(locale).compareTo(str.toUpperCase(locale)) >= 0;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 30;
    }

    public static boolean c() {
        int i9 = Build.VERSION.SDK_INT;
        return i9 >= 31 || (i9 >= 30 && a("S", Build.VERSION.CODENAME));
    }

    public static boolean d() {
        int i9 = Build.VERSION.SDK_INT;
        return i9 >= 33 || (i9 >= 32 && a("Tiramisu", Build.VERSION.CODENAME));
    }
}
