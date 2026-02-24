package com.facebook.ads.internal.dynamicloading;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import com.facebook.ads.internal.api.BuildConfigApi;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class DexLoadErrorReporter {
    public static final double SAMPLING = 0.1d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f18568a = new AtomicBoolean();

    public static class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f18569a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f18570c;

        public a(Context context, String str) {
            this.f18569a = context;
            this.f18570c = str;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(14:0|2|61|3|(7:79|4|5|77|6|67|7)|(5:73|8|(1:10)(1:85)|22|45)|13|81|14|71|18|22|45|(1:(0))) */
        /* JADX WARN: Can't wrap try/catch for region: R(20:0|2|61|3|79|4|5|77|6|67|7|(5:73|8|(1:10)(1:85)|22|45)|13|81|14|71|18|22|45|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0142, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0143, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x014b, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x014c, code lost:
        
            android.util.Log.e(com.facebook.ads.AudienceNetworkAds.TAG, "Can't close connection.", r0);
         */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0178 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:83:0x016d A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instruction units count: 419
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.internal.dynamicloading.DexLoadErrorReporter.a.run():void");
        }
    }

    public static void b(Context context, JSONObject jSONObject, String str) throws JSONException, PackageManager.NameNotFoundException {
        String packageName = context.getPackageName();
        jSONObject.put("APPBUILD", context.getPackageManager().getPackageInfo(packageName, 0).versionCode);
        jSONObject.put("APPNAME", context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(packageName, 0)));
        jSONObject.put("APPVERS", context.getPackageManager().getPackageInfo(packageName, 0).versionName);
        jSONObject.put("OSVERS", Build.VERSION.RELEASE);
        jSONObject.put("SDK", "android");
        jSONObject.put("SESSION_ID", str);
        jSONObject.put("MODEL", Build.MODEL);
        jSONObject.put("BUNDLE", packageName);
        jSONObject.put("SDK_VERSION", BuildConfigApi.getVersionName(context));
        jSONObject.put("OS", "Android");
    }

    @SuppressLint({"CatchGeneralException"})
    public static void reportDexLoadingIssue(Context context, String str, double d9) {
        AtomicBoolean atomicBoolean = f18568a;
        if (atomicBoolean.get() || Math.random() >= d9) {
            return;
        }
        atomicBoolean.set(true);
        new a(context, str).start();
    }
}
