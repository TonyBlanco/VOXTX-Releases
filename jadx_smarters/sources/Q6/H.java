package q6;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.concurrent.ExecutionException;
import r6.C2680a;
import r6.C2681b;
import z2.AbstractC3015c;
import z2.C3014b;
import z2.InterfaceC3017e;
import z2.InterfaceC3018f;
import z2.InterfaceC3019g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H {
    public static boolean A(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return B(intent.getExtras());
    }

    public static boolean B(Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    public static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            A5.f.m();
            Context contextL = A5.f.m().l();
            SharedPreferences sharedPreferences = contextL.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = contextL.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(contextL.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static C2680a b(C2680a.b bVar, Intent intent) {
        if (intent == null) {
            return null;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            extras = Bundle.EMPTY;
        }
        C2680a.C0435a c0435aP = C2680a.p();
        c0435aP.m(p(extras));
        c0435aP.e(bVar);
        c0435aP.f(f(extras));
        c0435aP.i(m());
        c0435aP.k(C2680a.d.ANDROID);
        c0435aP.h(k(extras));
        String strH = h(extras);
        if (strH != null) {
            c0435aP.g(strH);
        }
        String strO = o(extras);
        if (strO != null) {
            c0435aP.l(strO);
        }
        String strC = c(extras);
        if (strC != null) {
            c0435aP.c(strC);
        }
        String strI = i(extras);
        if (strI != null) {
            c0435aP.b(strI);
        }
        String strE = e(extras);
        if (strE != null) {
            c0435aP.d(strE);
        }
        long jN = n(extras);
        if (jN > 0) {
            c0435aP.j(jN);
        }
        return c0435aP.a();
    }

    public static String c(Bundle bundle) {
        return bundle.getString("collapse_key");
    }

    public static String d(Bundle bundle) {
        return bundle.getString("google.c.a.c_id");
    }

    public static String e(Bundle bundle) {
        return bundle.getString("google.c.a.c_l");
    }

    public static String f(Bundle bundle) {
        String string = bundle.getString("google.to");
        if (!TextUtils.isEmpty(string)) {
            return string;
        }
        try {
            return (String) Tasks.await(k6.g.q(A5.f.m()).getId());
        } catch (InterruptedException | ExecutionException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static String g(Bundle bundle) {
        return bundle.getString("google.c.a.m_c");
    }

    public static String h(Bundle bundle) {
        String string = bundle.getString("google.message_id");
        return string == null ? bundle.getString("message_id") : string;
    }

    public static String i(Bundle bundle) {
        return bundle.getString("google.c.a.m_l");
    }

    public static String j(Bundle bundle) {
        return bundle.getString("google.c.a.ts");
    }

    public static C2680a.c k(Bundle bundle) {
        return (bundle == null || !J.t(bundle)) ? C2680a.c.DATA_MESSAGE : C2680a.c.DISPLAY_NOTIFICATION;
    }

    public static String l(Bundle bundle) {
        return true != J.t(bundle) ? "data" : "display";
    }

    public static String m() {
        return A5.f.m().l().getPackageName();
    }

    public static long n(Bundle bundle) {
        if (bundle.containsKey("google.c.sender.id")) {
            try {
                return Long.parseLong(bundle.getString("google.c.sender.id"));
            } catch (NumberFormatException e9) {
                Log.w("FirebaseMessaging", "error parsing project number", e9);
            }
        }
        A5.f fVarM = A5.f.m();
        String strD = fVarM.p().d();
        if (strD != null) {
            try {
                return Long.parseLong(strD);
            } catch (NumberFormatException e10) {
                Log.w("FirebaseMessaging", "error parsing sender ID", e10);
            }
        }
        String strC = fVarM.p().c();
        try {
            if (!strC.startsWith("1:")) {
                return Long.parseLong(strC);
            }
            String[] strArrSplit = strC.split(":");
            if (strArrSplit.length < 2) {
                return 0L;
            }
            String str = strArrSplit[1];
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str);
        } catch (NumberFormatException e11) {
            Log.w("FirebaseMessaging", "error parsing app ID", e11);
            return 0L;
        }
    }

    public static String o(Bundle bundle) {
        String string = bundle.getString("from");
        if (string == null || !string.startsWith("/topics/")) {
            return null;
        }
        return string;
    }

    public static int p(Bundle bundle) {
        Object obj = bundle.get("google.ttl");
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        if (!(obj instanceof String)) {
            return 0;
        }
        try {
            return Integer.parseInt((String) obj);
        } catch (NumberFormatException unused) {
            Log.w("FirebaseMessaging", "Invalid TTL: ".concat(String.valueOf(obj)));
            return 0;
        }
    }

    public static String q(Bundle bundle) {
        if (bundle.containsKey("google.c.a.udt")) {
            return bundle.getString("google.c.a.udt");
        }
        return null;
    }

    public static boolean r(Intent intent) {
        return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(intent.getAction());
    }

    public static void s(Intent intent) {
        x("_nd", intent.getExtras());
    }

    public static void t(Intent intent) {
        x("_nf", intent.getExtras());
    }

    public static void u(Bundle bundle) {
        y(bundle);
        x("_no", bundle);
    }

    public static void v(Intent intent) {
        if (A(intent)) {
            x("_nr", intent.getExtras());
        }
        if (z(intent)) {
            w(C2680a.b.MESSAGE_DELIVERED, intent, FirebaseMessaging.k());
        }
    }

    public static void w(C2680a.b bVar, Intent intent, InterfaceC3019g interfaceC3019g) {
        if (interfaceC3019g == null) {
            Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
            return;
        }
        C2680a c2680aB = b(bVar, intent);
        if (c2680aB == null) {
            return;
        }
        try {
            InterfaceC3018f interfaceC3018fA = interfaceC3019g.a("FCM_CLIENT_EVENT_LOGGING", C2681b.class, C3014b.b("proto"), new InterfaceC3017e() { // from class: q6.G
                @Override // z2.InterfaceC3017e
                public final Object apply(Object obj) {
                    return ((C2681b) obj).c();
                }
            });
            C2681b.a aVarB = C2681b.b();
            aVarB.b(c2680aB);
            interfaceC3018fA.a(AbstractC3015c.g(aVarB.a()));
        } catch (RuntimeException e9) {
            Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e9);
        }
    }

    public static void x(String str, Bundle bundle) {
        try {
            A5.f.m();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String strD = d(bundle);
            if (strD != null) {
                bundle2.putString("_nmid", strD);
            }
            String strE = e(bundle);
            if (strE != null) {
                bundle2.putString("_nmn", strE);
            }
            String strI = i(bundle);
            if (!TextUtils.isEmpty(strI)) {
                bundle2.putString("label", strI);
            }
            String strG = g(bundle);
            if (!TextUtils.isEmpty(strG)) {
                bundle2.putString("message_channel", strG);
            }
            String strO = o(bundle);
            if (strO != null) {
                bundle2.putString("_nt", strO);
            }
            String strJ = j(bundle);
            if (strJ != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(strJ));
                } catch (NumberFormatException e9) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e9);
                }
            }
            String strQ = q(bundle);
            if (strQ != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(strQ));
                } catch (NumberFormatException e10) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e10);
                }
            }
            String strL = l(bundle);
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", strL);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String string = bundle2.toString();
                StringBuilder sb = new StringBuilder(str.length() + 37 + string.length());
                sb.append("Logging to scion event=");
                sb.append(str);
                sb.append(" scionPayload=");
                sb.append(string);
                Log.d("FirebaseMessaging", sb.toString());
            }
            C5.a aVar = (C5.a) A5.f.m().j(C5.a.class);
            if (aVar != null) {
                aVar.a("fcm", str, bundle2);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static void y(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        if (!"1".equals(bundle.getString("google.c.a.tc"))) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property");
                return;
            }
            return;
        }
        C5.a aVar = (C5.a) A5.f.m().j(C5.a.class);
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event");
        }
        if (aVar == null) {
            Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
            return;
        }
        String string = bundle.getString("google.c.a.c_id");
        aVar.b("fcm", "_ln", string);
        Bundle bundle2 = new Bundle();
        bundle2.putString("source", "Firebase");
        bundle2.putString("medium", TransferService.INTENT_KEY_NOTIFICATION);
        bundle2.putString("campaign", string);
        aVar.a("fcm", "_cmp", bundle2);
    }

    public static boolean z(Intent intent) {
        if (intent == null || r(intent)) {
            return false;
        }
        return a();
    }
}
