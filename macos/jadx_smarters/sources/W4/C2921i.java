package w4;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.common.zzd;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: w4.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2921i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f51661a = AbstractC2925m.f51666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2921i f51662b = new C2921i();

    public static C2921i h() {
        return f51662b;
    }

    public void a(Context context) {
        AbstractC2925m.a(context);
    }

    public int b(Context context) {
        return AbstractC2925m.c(context);
    }

    public Intent c(int i9) {
        return d(null, i9, null);
    }

    public Intent d(Context context, int i9, String str) {
        if (i9 != 1 && i9 != 2) {
            if (i9 != 3) {
                return null;
            }
            Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
            Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(uriFromParts);
            return intent;
        }
        if (context != null && C4.i.d(context)) {
            Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
            intent2.setPackage("com.google.android.wearable.app");
            return intent2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("gcore_");
        sb.append(f51661a);
        sb.append("-");
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
        }
        sb.append("-");
        if (context != null) {
            sb.append(context.getPackageName());
        }
        sb.append("-");
        if (context != null) {
            try {
                sb.append(E4.e.a(context).e(context.getPackageName(), 0).versionCode);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        String string = sb.toString();
        Intent intent3 = new Intent("android.intent.action.VIEW");
        Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter(Name.MARK, "com.google.android.gms");
        if (!TextUtils.isEmpty(string)) {
            builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
        }
        intent3.setData(builderAppendQueryParameter.build());
        intent3.setPackage("com.android.vending");
        intent3.addFlags(524288);
        return intent3;
    }

    public PendingIntent e(Context context, int i9, int i10) {
        return f(context, i9, i10, null);
    }

    public PendingIntent f(Context context, int i9, int i10, String str) {
        Intent intentD = d(context, i9, str);
        if (intentD == null) {
            return null;
        }
        return PendingIntent.getActivity(context, i10, intentD, zzd.zza | 134217728);
    }

    public String g(int i9) {
        return AbstractC2925m.d(i9);
    }

    public int i(Context context) {
        return j(context, f51661a);
    }

    public int j(Context context, int i9) {
        int iH = AbstractC2925m.h(context, i9);
        if (AbstractC2925m.i(context, iH)) {
            return 18;
        }
        return iH;
    }

    public boolean k(Context context, int i9) {
        return AbstractC2925m.i(context, i9);
    }

    public boolean l(Context context, String str) {
        return AbstractC2925m.m(context, str);
    }

    public boolean m(int i9) {
        return AbstractC2925m.k(i9);
    }

    public void n(Context context, int i9) throws C2923k, C2922j {
        AbstractC2925m.b(context, i9);
    }
}
