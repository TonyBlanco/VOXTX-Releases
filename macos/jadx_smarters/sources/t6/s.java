package t6;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import c6.InterfaceC1275a;
import java.util.Map;
import u6.InterfaceC2857b;
import v6.C2892f;

/* JADX INFO: loaded from: classes3.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s f50846a = new s();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC1275a f50847b;

    static {
        InterfaceC1275a interfaceC1275aH = new e6.d().i(c.f50778a).j(true).h();
        kotlin.jvm.internal.l.d(interfaceC1275aH, "JsonDataEncoderBuilder()…lues(true)\n      .build()");
        f50847b = interfaceC1275aH;
    }

    public final C2796b a(A5.f firebaseApp) throws PackageManager.NameNotFoundException {
        kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
        Context contextL = firebaseApp.l();
        kotlin.jvm.internal.l.d(contextL, "firebaseApp.applicationContext");
        String packageName = contextL.getPackageName();
        PackageInfo packageInfo = contextL.getPackageManager().getPackageInfo(packageName, 0);
        String strValueOf = Build.VERSION.SDK_INT >= 28 ? String.valueOf(packageInfo.getLongVersionCode()) : String.valueOf(packageInfo.versionCode);
        String strC = firebaseApp.p().c();
        kotlin.jvm.internal.l.d(strC, "firebaseApp.options.applicationId");
        String MODEL = Build.MODEL;
        kotlin.jvm.internal.l.d(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        kotlin.jvm.internal.l.d(RELEASE, "RELEASE");
        n nVar = n.LOG_ENVIRONMENT_PROD;
        kotlin.jvm.internal.l.d(packageName, "packageName");
        String str = packageInfo.versionName;
        if (str == null) {
            str = strValueOf;
        }
        String MANUFACTURER = Build.MANUFACTURER;
        kotlin.jvm.internal.l.d(MANUFACTURER, "MANUFACTURER");
        return new C2796b(strC, MODEL, "1.0.2", RELEASE, nVar, new C2795a(packageName, str, strValueOf, MANUFACTURER));
    }

    public final InterfaceC1275a b() {
        return f50847b;
    }

    public final r c(A5.f firebaseApp, q sessionDetails, C2892f sessionsSettings, Map subscribers) {
        kotlin.jvm.internal.l.e(firebaseApp, "firebaseApp");
        kotlin.jvm.internal.l.e(sessionDetails, "sessionDetails");
        kotlin.jvm.internal.l.e(sessionsSettings, "sessionsSettings");
        kotlin.jvm.internal.l.e(subscribers, "subscribers");
        return new r(j.SESSION_START, new u(sessionDetails.b(), sessionDetails.a(), sessionDetails.c(), sessionDetails.d(), new f(d((InterfaceC2857b) subscribers.get(InterfaceC2857b.a.PERFORMANCE)), d((InterfaceC2857b) subscribers.get(InterfaceC2857b.a.CRASHLYTICS)), sessionsSettings.b()), null, 32, null), a(firebaseApp));
    }

    public final d d(InterfaceC2857b interfaceC2857b) {
        return interfaceC2857b == null ? d.COLLECTION_SDK_NOT_INSTALLED : interfaceC2857b.b() ? d.COLLECTION_ENABLED : d.COLLECTION_DISABLED;
    }
}
