package M4;

import android.content.Context;
import android.content.res.Resources;
import w4.AbstractC2927o;

/* JADX INFO: renamed from: M4.d2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0728d2 {
    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC2927o.f51674a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public static final String b(String str, Resources resources, String str2) {
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        try {
            return resources.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
