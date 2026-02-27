package O5;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import java.util.List;

/* JADX INFO: renamed from: O5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C0937a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f6549a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f6550b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f6551c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f6552d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6553e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f6554f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f6555g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final L5.e f6556h;

    public C0937a(String str, String str2, List list, String str3, String str4, String str5, String str6, L5.e eVar) {
        this.f6549a = str;
        this.f6550b = str2;
        this.f6551c = list;
        this.f6552d = str3;
        this.f6553e = str4;
        this.f6554f = str5;
        this.f6555g = str6;
        this.f6556h = eVar;
    }

    public static C0937a a(Context context, y yVar, String str, String str2, List list, L5.e eVar) throws PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        String strG = yVar.g();
        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(packageName, 0);
        String strB = b(packageInfo);
        String str3 = packageInfo.versionName;
        if (str3 == null) {
            str3 = "0.0";
        }
        return new C0937a(str, str2, list, strG, packageName, strB, str3, eVar);
    }

    public static String b(PackageInfo packageInfo) {
        return Build.VERSION.SDK_INT >= 28 ? Long.toString(packageInfo.getLongVersionCode()) : Integer.toString(packageInfo.versionCode);
    }
}
