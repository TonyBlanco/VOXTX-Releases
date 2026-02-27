package O5;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f6531a;

    public static String b(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    public synchronized String a(Context context) {
        try {
            if (this.f6531a == null) {
                this.f6531a = b(context);
            }
        } finally {
        }
        return "".equals(this.f6531a) ? null : this.f6531a;
    }
}
