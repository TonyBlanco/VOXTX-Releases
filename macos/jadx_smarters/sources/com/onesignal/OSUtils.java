package com.onesignal;

import J4.InterfaceC0651j;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import androidx.annotation.Keep;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import com.google.firebase.messaging.FirebaseMessaging;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.api.HuaweiApiAvailability;
import com.huawei.hms.location.LocationCallback;
import com.onesignal.F1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collections;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import org.apache.http.HttpHost;
import org.apache.http.HttpStatus;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
class OSUtils {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f38432a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f38433b = {HttpStatus.SC_UNAUTHORIZED, HttpStatus.SC_PAYMENT_REQUIRED, 403, 404, HttpStatus.SC_GONE};

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38434a;

        static {
            int[] iArr = new int[b.values().length];
            f38434a = iArr;
            try {
                iArr[b.DATA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38434a[b.HTTPS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38434a[b.HTTP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        DATA("data"),
        HTTPS(ClientConstants.DOMAIN_SCHEME),
        HTTP(HttpHost.DEFAULT_SCHEME_NAME);

        private final String text;

        b(String str) {
            this.text = str;
        }

        public static b fromString(String str) {
            for (b bVar : values()) {
                if (bVar.text.equalsIgnoreCase(str)) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public static boolean B() {
        return new OSUtils().e() == 1;
    }

    public static boolean C() {
        return new OSUtils().e() == 2;
    }

    public static boolean D() {
        return P("com.google.android.gms");
    }

    public static boolean E() {
        try {
            return HuaweiApiAvailability.getInstance().isHuaweiMobileServicesAvailable(F1.f38270b) == 0;
        } catch (RuntimeException e9) {
            if (AbstractC1554i.a(e9.getCause())) {
                return false;
            }
            throw e9;
        }
    }

    public static boolean F() {
        return P("com.huawei.hwid");
    }

    public static boolean G() {
        return new OSUtils().e() == 13;
    }

    public static boolean H() {
        return Thread.currentThread().equals(Looper.getMainLooper().getThread());
    }

    public static boolean I(String str) {
        return !TextUtils.isEmpty(str);
    }

    public static boolean J(String str) {
        return (str == null || str.matches("^[0-9]")) ? false : true;
    }

    public static Set K() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    public static Set L(JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i9 = 0; i9 < jSONArray.length(); i9++) {
            hashSet.add(jSONArray.getString(i9));
        }
        return hashSet;
    }

    public static void M(Uri uri) {
        F1.f38270b.startActivity(O(uri));
    }

    public static void N(String str) {
        M(Uri.parse(str.trim()));
    }

    public static Intent O(Uri uri) {
        Intent intentMakeMainSelectorActivity;
        b bVarFromString = uri.getScheme() != null ? b.fromString(uri.getScheme()) : null;
        if (bVarFromString == null) {
            bVarFromString = b.HTTP;
            if (!uri.toString().contains("://")) {
                uri = Uri.parse("http://" + uri.toString());
            }
        }
        if (a.f38434a[bVarFromString.ordinal()] != 1) {
            intentMakeMainSelectorActivity = new Intent("android.intent.action.VIEW", uri);
        } else {
            intentMakeMainSelectorActivity = Intent.makeMainSelectorActivity("android.intent.action.MAIN", "android.intent.category.APP_BROWSER");
            intentMakeMainSelectorActivity.setData(uri);
        }
        intentMakeMainSelectorActivity.addFlags(268435456);
        return intentMakeMainSelectorActivity;
    }

    public static boolean P(String str) {
        PackageInfo packageInfoA;
        A a9 = X1.f38626a.a(F1.f38270b, str, 128);
        if (a9.b() && (packageInfoA = a9.a()) != null) {
            return packageInfoA.applicationInfo.enabled;
        }
        return false;
    }

    public static long[] Q(JSONObject jSONObject) {
        try {
            Object objOpt = jSONObject.opt("vib_pt");
            JSONArray jSONArray = objOpt instanceof String ? new JSONArray((String) objOpt) : (JSONArray) objOpt;
            long[] jArr = new long[jSONArray.length()];
            for (int i9 = 0; i9 < jSONArray.length(); i9++) {
                jArr[i9] = jSONArray.optLong(i9);
            }
            return jArr;
        } catch (JSONException unused) {
            return null;
        }
    }

    public static void R(Runnable runnable, int i9) {
        new Handler(Looper.getMainLooper()).postDelayed(runnable, i9);
    }

    public static void S(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            runnable.run();
        } else {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    public static boolean T(String str) {
        if (str != null) {
            return false;
        }
        F1.a(F1.v.INFO, "OneSignal was not initialized, ensure to always initialize OneSignal from the onCreate of your Application class.");
        return true;
    }

    public static boolean U(int i9) {
        for (int i10 : f38433b) {
            if (i9 == i10) {
                return false;
            }
        }
        return true;
    }

    public static void V(int i9) {
        try {
            Thread.sleep(i9);
        } catch (InterruptedException e9) {
            e9.printStackTrace();
        }
    }

    public static void W(Thread thread) {
        boolean z9 = false;
        while (!z9) {
            try {
                thread.start();
                z9 = true;
            } catch (OutOfMemoryError unused) {
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException unused2) {
                }
            }
        }
    }

    public static boolean a(Context context) {
        try {
            return D.L.d(F1.f38270b).a();
        } catch (Throwable unused) {
            return true;
        }
    }

    public static String f(Context context, String str) {
        Bundle bundleH = h(context);
        if (bundleH != null) {
            return bundleH.getString(str);
        }
        return null;
    }

    public static boolean g(Context context, String str) {
        Bundle bundleH = h(context);
        if (bundleH != null) {
            return bundleH.getBoolean(str);
        }
        return false;
    }

    public static Bundle h(Context context) {
        ApplicationInfo applicationInfoA = AbstractC1557j.f38736a.a(context);
        if (applicationInfoA == null) {
            return null;
        }
        return applicationInfoA.metaData;
    }

    public static int j(int i9, int i10) {
        return new Random().nextInt((i10 + 1) - i9) + i9;
    }

    public static String k(Context context, String str, String str2) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier(str, "string", context.getPackageName());
        return identifier != 0 ? resources.getString(identifier) : str2;
    }

    public static String l(Throwable th) {
        return m(th).getMessage();
    }

    public static Throwable m(Throwable th) {
        while (th.getCause() != null && th.getCause() != th) {
            th = th.getCause();
        }
        return th;
    }

    public static Uri n(Context context, String str) {
        int identifier;
        Resources resources = context.getResources();
        String packageName = context.getPackageName();
        if ((!J(str) || (identifier = resources.getIdentifier(str, "raw", packageName)) == 0) && (identifier = resources.getIdentifier("onesignal_default_sound", "raw", packageName)) == 0) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("android.resource://");
        sb.append(packageName);
        sb.append("/");
        sb.append(identifier);
        return Uri.parse(sb.toString());
    }

    public static int o(Context context) {
        ApplicationInfo applicationInfoA = AbstractC1557j.f38736a.a(context);
        if (applicationInfoA == null) {
            return 15;
        }
        return applicationInfoA.targetSdkVersion;
    }

    @Keep
    private static boolean opaqueHasClass(Class<?> cls) {
        return true;
    }

    public static boolean p() {
        return t() && w();
    }

    public static boolean q(Activity activity, int i9) {
        try {
            return (activity.getPackageManager().getActivityInfo(activity.getComponentName(), 0).configChanges & i9) != 0;
        } catch (PackageManager.NameNotFoundException e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public static boolean r() {
        try {
            return opaqueHasClass(FirebaseMessaging.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean s() {
        try {
            return opaqueHasClass(InterfaceC0651j.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean t() {
        try {
            return opaqueHasClass(AGConnectServicesConfig.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean u() {
        try {
            return opaqueHasClass(HuaweiApiAvailability.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean v() {
        try {
            return opaqueHasClass(LocationCallback.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean w() {
        try {
            return opaqueHasClass(HmsInstanceId.class);
        } catch (NoClassDefFoundError unused) {
            return false;
        }
    }

    public static boolean x() {
        return true;
    }

    public static boolean y() {
        return true;
    }

    public static boolean z() {
        return true;
    }

    public int A(Context context, String str) {
        Integer numC;
        int iE = e();
        try {
            UUID.fromString(str);
            if ("b2f7f966-d8cc-11e4-bed1-df8f05be55ba".equals(str) || "5eb5a37e-b458-11e3-ac11-000c2940e62c".equals(str)) {
                F1.a(F1.v.ERROR, "OneSignal Example AppID detected, please update to your app's id found on OneSignal.com");
            }
            int iIntValue = 1;
            if (iE == 1 && (numC = c()) != null) {
                iIntValue = numC.intValue();
            }
            Integer numB = b(context);
            return numB != null ? numB.intValue() : iIntValue;
        } catch (Throwable th) {
            F1.b(F1.v.FATAL, "OneSignal AppId format is invalid.\nExample: 'b2f7f966-d8cc-11e4-bed1-df8f05be55ba'\n", th);
            return -999;
        }
    }

    public final boolean X() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public final boolean Y() {
        if (r()) {
            return D();
        }
        return false;
    }

    public final boolean Z() {
        if (u() && p()) {
            return E();
        }
        return false;
    }

    public final Integer b(Context context) {
        boolean z9 = z();
        boolean zY = y();
        if (!z9 && !zY) {
            F1.a(F1.v.FATAL, "Could not find the Android Support Library. Please make sure it has been correctly added to your project.");
            return -3;
        }
        if (!z9 || !zY) {
            F1.a(F1.v.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
            return -5;
        }
        if (Build.VERSION.SDK_INT < 26 || o(context) < 26 || x()) {
            return null;
        }
        F1.a(F1.v.FATAL, "The included Android Support Library is to old or incomplete. Please update to the 26.0.0 revision or newer.");
        return -5;
    }

    public Integer c() {
        if (r()) {
            return null;
        }
        F1.a(F1.v.FATAL, "The Firebase FCM library is missing! Please make sure to include it in your project.");
        return -4;
    }

    public String d() {
        try {
            String networkOperatorName = ((TelephonyManager) F1.f38270b.getSystemService("phone")).getNetworkOperatorName();
            if ("".equals(networkOperatorName)) {
                return null;
            }
            return networkOperatorName;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public int e() {
        if (X()) {
            return 2;
        }
        boolean Z8 = Z();
        boolean zY = Y();
        if (zY && Z8) {
            Context context = F1.f38270b;
            return (context == null || !g(context, "com.onesignal.preferHMS")) ? 1 : 13;
        }
        if (zY) {
            return 1;
        }
        if (Z8) {
            return 13;
        }
        return (!D() && F()) ? 13 : 1;
    }

    public Integer i() {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) F1.f38270b.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return null;
        }
        int type = activeNetworkInfo.getType();
        return (type == 1 || type == 9) ? 0 : 1;
    }
}
