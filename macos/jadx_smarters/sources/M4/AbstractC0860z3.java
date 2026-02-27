package M4;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;

/* JADX INFO: renamed from: M4.z3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0860z3 {
    public static String a(String str, String[] strArr, String[] strArr2) {
        com.google.android.gms.common.internal.r.m(strArr);
        com.google.android.gms.common.internal.r.m(strArr2);
        int iMin = Math.min(strArr.length, strArr2.length);
        for (int i9 = 0; i9 < iMin; i9++) {
            String str2 = strArr[i9];
            if ((str == null && str2 == null) || (str != null && str.equals(str2))) {
                return strArr2[i9];
            }
        }
        return null;
    }

    public static String b(Context context, String str, String str2) {
        com.google.android.gms.common.internal.r.m(context);
        Resources resources = context.getResources();
        if (TextUtils.isEmpty(str2)) {
            str2 = AbstractC0728d2.a(context);
        }
        return AbstractC0728d2.b("google_app_id", resources, str2);
    }
}
