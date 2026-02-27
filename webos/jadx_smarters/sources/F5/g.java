package f5;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static boolean a() {
        return Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu");
    }
}
