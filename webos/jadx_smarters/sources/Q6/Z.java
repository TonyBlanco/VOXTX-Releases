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
import com.google.firebase.messaging.FirebaseMessaging;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class Z implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f47013a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final PowerManager.WakeLock f47014c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final FirebaseMessaging f47015d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ExecutorService f47016e = new ThreadPoolExecutor(0, 1, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), new D4.b("firebase-iid-executor"));

    public static class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Z f47017a;

        public a(Z z9) {
            this.f47017a = z9;
        }

        public void a() {
            if (Z.c()) {
                Log.d("FirebaseMessaging", "Connectivity change received registered");
            }
            this.f47017a.b().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Z z9 = this.f47017a;
            if (z9 != null && z9.d()) {
                if (Z.c()) {
                    Log.d("FirebaseMessaging", "Connectivity changed. Starting background sync.");
                }
                this.f47017a.f47015d.d(this.f47017a, 0L);
                this.f47017a.b().unregisterReceiver(this);
                this.f47017a = null;
            }
        }
    }

    public Z(FirebaseMessaging firebaseMessaging, long j9) {
        this.f47015d = firebaseMessaging;
        this.f47013a = j9;
        PowerManager.WakeLock wakeLockNewWakeLock = ((PowerManager) b().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.f47014c = wakeLockNewWakeLock;
        wakeLockNewWakeLock.setReferenceCounted(false);
    }

    public static boolean c() {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            return true;
        }
        return Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3);
    }

    public Context b() {
        return this.f47015d.e();
    }

    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) b().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public boolean e() throws IOException {
        String string;
        try {
            if (this.f47015d.c() == null) {
                Log.e("FirebaseMessaging", "Token retrieval failed: null");
                return false;
            }
            if (!Log.isLoggable("FirebaseMessaging", 3)) {
                return true;
            }
            Log.d("FirebaseMessaging", "Token successfully retrieved");
            return true;
        } catch (IOException e9) {
            if (D.f(e9.getMessage())) {
                String message = e9.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 52);
                sb.append("Token retrieval failed: ");
                sb.append(message);
                sb.append(". Will retry token retrieval");
                string = sb.toString();
            } else {
                if (e9.getMessage() != null) {
                    throw e9;
                }
                string = "Token retrieval failed without exception message. Will retry token retrieval";
            }
            Log.w("FirebaseMessaging", string);
            return false;
        } catch (SecurityException unused) {
            string = "Token retrieval failed with SecurityException. Will retry token retrieval";
            Log.w("FirebaseMessaging", string);
            return false;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        if (W.b().e(b())) {
            this.f47014c.acquire();
        }
        try {
            try {
                this.f47015d.v(true);
                if (!this.f47015d.n()) {
                    this.f47015d.v(false);
                    if (!W.b().e(b())) {
                        return;
                    }
                } else if (!W.b().d(b()) || d()) {
                    if (e()) {
                        this.f47015d.v(false);
                    } else {
                        this.f47015d.z(this.f47013a);
                    }
                    if (!W.b().e(b())) {
                        return;
                    }
                } else {
                    new a(this).a();
                    if (!W.b().e(b())) {
                        return;
                    }
                }
            } catch (IOException e9) {
                String message = e9.getMessage();
                StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 93);
                sb.append("Topic sync or token retrieval failed on hard failure exceptions: ");
                sb.append(message);
                sb.append(". Won't retry the operation.");
                Log.e("FirebaseMessaging", sb.toString());
                this.f47015d.v(false);
                if (!W.b().e(b())) {
                    return;
                }
            }
            this.f47014c.release();
        } catch (Throwable th) {
            if (W.b().e(b())) {
                this.f47014c.release();
            }
            throw th;
        }
    }
}
