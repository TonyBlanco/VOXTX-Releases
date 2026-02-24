package E;

import D.AbstractC0523f;
import android.content.Context;
import android.os.Process;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static int a(Context context, String str, int i9, int i10, String str2) {
        if (context.checkPermission(str, i9, i10) == -1) {
            return -1;
        }
        String strC = AbstractC0523f.c(str);
        if (strC == null) {
            return 0;
        }
        if (str2 == null) {
            String[] packagesForUid = context.getPackageManager().getPackagesForUid(i10);
            if (packagesForUid == null || packagesForUid.length <= 0) {
                return -1;
            }
            str2 = packagesForUid[0];
        }
        return ((Process.myUid() != i10 || !O.c.a(context.getPackageName(), str2)) ? AbstractC0523f.b(context, strC, str2) : AbstractC0523f.a(context, i10, strC, str2)) == 0 ? 0 : -2;
    }

    public static int b(Context context, String str) {
        return a(context, str, Process.myPid(), Process.myUid(), context.getPackageName());
    }
}
