package q6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayDeque;
import java.util.Queue;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes3.dex */
public class W {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static W f47001e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f47002a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Boolean f47003b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Boolean f47004c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Queue f47005d = new ArrayDeque();

    public static synchronized W b() {
        try {
            if (f47001e == null) {
                f47001e = new W();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f47001e;
    }

    public final int a(Context context, Intent intent) {
        ComponentName componentNameStartService;
        String strF = f(context, intent);
        if (strF != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", strF.length() != 0 ? "Restricting intent to a specific service: ".concat(strF) : new String("Restricting intent to a specific service: "));
            }
            intent.setClassName(context.getPackageName(), strF);
        }
        try {
            if (e(context)) {
                componentNameStartService = f0.e(context, intent);
            } else {
                componentNameStartService = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentNameStartService != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e9) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: ".concat(e9.toString()));
            return HttpStatus.SC_PAYMENT_REQUIRED;
        } catch (SecurityException e10) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e10);
            return HttpStatus.SC_UNAUTHORIZED;
        }
    }

    public Intent c() {
        return (Intent) this.f47005d.poll();
    }

    public boolean d(Context context) {
        if (this.f47004c == null) {
            this.f47004c = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0);
        }
        if (!this.f47003b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f47004c.booleanValue();
    }

    public boolean e(Context context) {
        if (this.f47003b == null) {
            this.f47003b = Boolean.valueOf(context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0);
        }
        if (!this.f47003b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f47003b.booleanValue();
    }

    public final synchronized String f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String strConcat;
        try {
            String str2 = this.f47002a;
            if (str2 != null) {
                return str2;
            }
            ResolveInfo resolveInfoResolveService = context.getPackageManager().resolveService(intent, 0);
            if (resolveInfoResolveService != null && (serviceInfo = resolveInfoResolveService.serviceInfo) != null) {
                if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                    if (str.startsWith(InstructionFileId.DOT)) {
                        String strValueOf = String.valueOf(context.getPackageName());
                        String strValueOf2 = String.valueOf(serviceInfo.name);
                        strConcat = strValueOf2.length() != 0 ? strValueOf.concat(strValueOf2) : new String(strValueOf);
                    } else {
                        strConcat = serviceInfo.name;
                    }
                    this.f47002a = strConcat;
                    return this.f47002a;
                }
                String str3 = serviceInfo.packageName;
                String str4 = serviceInfo.name;
                StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 94 + String.valueOf(str4).length());
                sb.append("Error resolving target intent service, skipping classname enforcement. Resolved service was: ");
                sb.append(str3);
                sb.append("/");
                sb.append(str4);
                Log.e("FirebaseMessaging", sb.toString());
                return null;
            }
            Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
            return null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public int g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f47005d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return a(context, intent2);
    }
}
