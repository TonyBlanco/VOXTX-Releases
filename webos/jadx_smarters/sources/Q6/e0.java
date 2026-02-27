package q6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.PowerManager;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class e0 implements Runnable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Object f47050g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static Boolean f47051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static Boolean f47052i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f47053a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final I f47054c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PowerManager.WakeLock f47055d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d0 f47056e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f47057f;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e0 f47058a;

        public a(e0 e0Var) {
            this.f47058a = e0Var;
        }

        public void a() {
            if (e0.j()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            e0.this.f47053a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public synchronized void onReceive(Context context, Intent intent) {
            try {
                e0 e0Var = this.f47058a;
                if (e0Var == null) {
                    return;
                }
                if (e0Var.i()) {
                    if (e0.j()) {
                        Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                    }
                    this.f47058a.f47056e.l(this.f47058a, 0L);
                    context.unregisterReceiver(this);
                    this.f47058a = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public e0(d0 d0Var, Context context, I i9, long j9) {
        this.f47056e = d0Var;
        this.f47053a = context;
        this.f47057f = j9;
        this.f47054c = i9;
        this.f47055d = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static String e(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 142);
        sb.append("Missing Permission: ");
        sb.append(str);
        sb.append(". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        return sb.toString();
    }

    public static boolean f(Context context) {
        boolean zBooleanValue;
        synchronized (f47050g) {
            try {
                Boolean bool = f47052i;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                f47052i = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean g(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z9 = context.checkCallingOrSelfPermission(str) == 0;
        if (z9 || !Log.isLoggable("FirebaseMessaging", 3)) {
            return z9;
        }
        Log.d("FirebaseMessaging", e(str));
        return false;
    }

    public static boolean h(Context context) {
        boolean zBooleanValue;
        synchronized (f47050g) {
            try {
                Boolean bool = f47051h;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? g(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                f47051h = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean j() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public final synchronized boolean i() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f47053a.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isConnected()) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (h(this.f47053a)) {
            this.f47055d.acquire(AbstractC2585c.f47030a);
        }
        try {
            try {
                this.f47056e.n(true);
                if (!this.f47054c.g()) {
                    this.f47056e.n(false);
                    if (h(this.f47053a)) {
                        try {
                            this.f47055d.release();
                            return;
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (f(this.f47053a) && !i()) {
                    new a(this).a();
                    if (h(this.f47053a)) {
                        try {
                            this.f47055d.release();
                            return;
                        } catch (RuntimeException unused2) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                            return;
                        }
                    }
                    return;
                }
                if (this.f47056e.r()) {
                    this.f47056e.n(false);
                } else {
                    this.f47056e.s(this.f47057f);
                }
                if (h(this.f47053a)) {
                    try {
                        this.f47055d.release();
                    } catch (RuntimeException unused3) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
            } catch (Throwable th) {
                if (h(this.f47053a)) {
                    try {
                        this.f47055d.release();
                    } catch (RuntimeException unused4) {
                        Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                    }
                }
                throw th;
            }
        } catch (IOException e9) {
            String strValueOf = String.valueOf(e9.getMessage());
            Log.e("FirebaseMessaging", strValueOf.length() != 0 ? "Failed to sync topics. Won't retry sync. ".concat(strValueOf) : new String("Failed to sync topics. Won't retry sync. "));
            this.f47056e.n(false);
            if (h(this.f47053a)) {
                try {
                    this.f47055d.release();
                } catch (RuntimeException unused5) {
                    Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                }
            }
        }
    }
}
