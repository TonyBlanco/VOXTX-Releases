package q6;

import D.AbstractC0529l;
import android.R;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.http.client.config.CookieSpecs;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: q6.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2584b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicInteger f47022a = new AtomicInteger((int) SystemClock.elapsedRealtime());

    /* JADX INFO: renamed from: q6.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC0529l.e f47023a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f47024b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f47025c = 0;

        public a(AbstractC0529l.e eVar, String str, int i9) {
            this.f47023a = eVar;
            this.f47024b = str;
        }
    }

    public static PendingIntent a(Context context, J j9, String str, PackageManager packageManager) {
        Intent intentF = f(str, j9, packageManager);
        if (intentF == null) {
            return null;
        }
        intentF.addFlags(67108864);
        intentF.putExtras(j9.y());
        if (q(j9)) {
            intentF.putExtra("gcm.n.analytics_data", j9.x());
        }
        return PendingIntent.getActivity(context, g(), intentF, l(1073741824));
    }

    public static PendingIntent b(Context context, J j9) {
        if (q(j9)) {
            return c(context, new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(j9.x()));
        }
        return null;
    }

    public static PendingIntent c(Context context, Intent intent) {
        return PendingIntent.getBroadcast(context, g(), new Intent("com.google.firebase.MESSAGING_EVENT").setComponent(new ComponentName(context, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", intent), l(1073741824));
    }

    public static a d(Context context, String str, J j9, String str2, Resources resources, PackageManager packageManager, Bundle bundle) {
        AbstractC0529l.e eVar = new AbstractC0529l.e(context, str2);
        String strN = j9.n(resources, str, "gcm.n.title");
        if (!TextUtils.isEmpty(strN)) {
            eVar.n(strN);
        }
        String strN2 = j9.n(resources, str, "gcm.n.body");
        if (!TextUtils.isEmpty(strN2)) {
            eVar.m(strN2);
            eVar.F(new AbstractC0529l.c().h(strN2));
        }
        eVar.D(m(packageManager, resources, str, j9.p("gcm.n.icon"), bundle));
        Uri uriN = n(str, j9, resources);
        if (uriN != null) {
            eVar.E(uriN);
        }
        eVar.l(a(context, j9, str, packageManager));
        PendingIntent pendingIntentB = b(context, j9);
        if (pendingIntentB != null) {
            eVar.p(pendingIntentB);
        }
        Integer numH = h(context, j9.p("gcm.n.color"), bundle);
        if (numH != null) {
            eVar.j(numH.intValue());
        }
        eVar.h(!j9.a("gcm.n.sticky"));
        eVar.w(j9.a("gcm.n.local_only"));
        String strP = j9.p("gcm.n.ticker");
        if (strP != null) {
            eVar.G(strP);
        }
        Integer numM = j9.m();
        if (numM != null) {
            eVar.A(numM.intValue());
        }
        Integer numR = j9.r();
        if (numR != null) {
            eVar.I(numR.intValue());
        }
        Integer numL = j9.l();
        if (numL != null) {
            eVar.x(numL.intValue());
        }
        Long lJ = j9.j("gcm.n.event_time");
        if (lJ != null) {
            eVar.C(true);
            eVar.J(lJ.longValue());
        }
        long[] jArrQ = j9.q();
        if (jArrQ != null) {
            eVar.H(jArrQ);
        }
        int[] iArrE = j9.e();
        if (iArrE != null) {
            eVar.v(iArrE[0], iArrE[1], iArrE[2]);
        }
        eVar.o(i(j9));
        return new a(eVar, o(j9), 0);
    }

    public static a e(Context context, J j9) {
        Bundle bundleJ = j(context.getPackageManager(), context.getPackageName());
        return d(context, context.getPackageName(), j9, k(context, j9.k(), bundleJ), context.getResources(), context.getPackageManager(), bundleJ);
    }

    public static Intent f(String str, J j9, PackageManager packageManager) {
        String strP = j9.p("gcm.n.click_action");
        if (!TextUtils.isEmpty(strP)) {
            Intent intent = new Intent(strP);
            intent.setPackage(str);
            intent.setFlags(268435456);
            return intent;
        }
        Uri uriF = j9.f();
        if (uriF != null) {
            Intent intent2 = new Intent("android.intent.action.VIEW");
            intent2.setPackage(str);
            intent2.setData(uriF);
            return intent2;
        }
        Intent launchIntentForPackage = packageManager.getLaunchIntentForPackage(str);
        if (launchIntentForPackage == null) {
            Log.w("FirebaseMessaging", "No activity found to launch app");
        }
        return launchIntentForPackage;
    }

    public static int g() {
        return f47022a.incrementAndGet();
    }

    public static Integer h(Context context, String str, Bundle bundle) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Integer.valueOf(Color.parseColor(str));
            } catch (IllegalArgumentException unused) {
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 56);
                sb.append("Color is invalid: ");
                sb.append(str);
                sb.append(". Notification will use default color.");
                Log.w("FirebaseMessaging", sb.toString());
            }
        }
        int i9 = bundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
        if (i9 == 0) {
            return null;
        }
        try {
            return Integer.valueOf(E.b.getColor(context, i9));
        } catch (Resources.NotFoundException unused2) {
            Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public static int i(J j9) {
        boolean zA = j9.a("gcm.n.default_sound");
        ?? r02 = zA;
        if (j9.a("gcm.n.default_vibrate_timings")) {
            r02 = (zA ? 1 : 0) | 2;
        }
        return j9.a("gcm.n.default_light_settings") ? r02 | 4 : r02;
    }

    public static Bundle j(PackageManager packageManager, String str) {
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(str, 128);
            if (applicationInfo != null) {
                Bundle bundle = applicationInfo.metaData;
                if (bundle != null) {
                    return bundle;
                }
            }
        } catch (PackageManager.NameNotFoundException e9) {
            Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e9.toString()));
        }
        return Bundle.EMPTY;
    }

    public static String k(Context context, String str, Bundle bundle) {
        String str2;
        String string;
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        try {
            if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).targetSdkVersion >= 26) {
                NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
                if (!TextUtils.isEmpty(str)) {
                    if (notificationManager.getNotificationChannel(str) != null) {
                        return str;
                    }
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + IjkMediaMeta.FF_PROFILE_H264_HIGH_422);
                    sb.append("Notification Channel requested (");
                    sb.append(str);
                    sb.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
                    Log.w("FirebaseMessaging", sb.toString());
                }
                String string2 = bundle.getString("com.google.firebase.messaging.default_notification_channel_id");
                if (TextUtils.isEmpty(string2)) {
                    str2 = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
                } else {
                    if (notificationManager.getNotificationChannel(string2) != null) {
                        return string2;
                    }
                    str2 = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
                }
                Log.w("FirebaseMessaging", str2);
                if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
                    int identifier = context.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", context.getPackageName());
                    if (identifier == 0) {
                        Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
                        string = "Misc";
                    } else {
                        string = context.getString(identifier);
                    }
                    notificationManager.createNotificationChannel(com.amplifyframework.storage.s3.service.b.a("fcm_fallback_notification_channel", string, 3));
                }
                return "fcm_fallback_notification_channel";
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return null;
    }

    public static int l(int i9) {
        return Build.VERSION.SDK_INT >= 23 ? 1140850688 : 1073741824;
    }

    public static int m(PackageManager packageManager, Resources resources, String str, String str2, Bundle bundle) {
        if (!TextUtils.isEmpty(str2)) {
            int identifier = resources.getIdentifier(str2, "drawable", str);
            if (identifier != 0 && p(resources, identifier)) {
                return identifier;
            }
            int identifier2 = resources.getIdentifier(str2, "mipmap", str);
            if (identifier2 != 0 && p(resources, identifier2)) {
                return identifier2;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 61);
            sb.append("Icon resource ");
            sb.append(str2);
            sb.append(" not found. Notification will use default icon.");
            Log.w("FirebaseMessaging", sb.toString());
        }
        int i9 = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
        if (i9 == 0 || !p(resources, i9)) {
            try {
                i9 = packageManager.getApplicationInfo(str, 0).icon;
            } catch (PackageManager.NameNotFoundException e9) {
                Log.w("FirebaseMessaging", "Couldn't get own application info: ".concat(e9.toString()));
            }
        }
        return (i9 == 0 || !p(resources, i9)) ? R.drawable.sym_def_app_icon : i9;
    }

    public static Uri n(String str, J j9, Resources resources) {
        String strO = j9.o();
        if (TextUtils.isEmpty(strO)) {
            return null;
        }
        if (CookieSpecs.DEFAULT.equals(strO) || resources.getIdentifier(strO, "raw", str) == 0) {
            return RingtoneManager.getDefaultUri(2);
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 24 + String.valueOf(strO).length());
        sb.append("android.resource://");
        sb.append(str);
        sb.append("/raw/");
        sb.append(strO);
        return Uri.parse(sb.toString());
    }

    public static String o(J j9) {
        String strP = j9.p("gcm.n.tag");
        if (!TextUtils.isEmpty(strP)) {
            return strP;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        StringBuilder sb = new StringBuilder(37);
        sb.append("FCM-Notification:");
        sb.append(jUptimeMillis);
        return sb.toString();
    }

    public static boolean p(Resources resources, int i9) {
        if (Build.VERSION.SDK_INT != 26) {
            return true;
        }
        try {
            if (!AbstractC2583a.a(resources.getDrawable(i9, null))) {
                return true;
            }
            StringBuilder sb = new StringBuilder(77);
            sb.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
            sb.append(i9);
            Log.e("FirebaseMessaging", sb.toString());
            return false;
        } catch (Resources.NotFoundException unused) {
            StringBuilder sb2 = new StringBuilder(66);
            sb2.append("Couldn't find resource ");
            sb2.append(i9);
            sb2.append(", treating it as an invalid icon");
            Log.e("FirebaseMessaging", sb2.toString());
            return false;
        }
    }

    public static boolean q(J j9) {
        return j9.a("google.c.a.e");
    }
}
