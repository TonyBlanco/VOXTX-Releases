package d4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final class I {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static I f39693e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f39694a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f39695b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f39696c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f39697d = 0;

    public static final class b {

        public static final class a extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final I f39698a;

            public a(I i9) {
                this.f39698a = i9;
            }

            @Override // android.telephony.TelephonyCallback.DisplayInfoListener
            public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
                int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
                this.f39698a.k(overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5 ? 10 : 5);
            }
        }

        public static void a(Context context, I i9) {
            try {
                TelephonyManager telephonyManager = (TelephonyManager) AbstractC1684a.e((TelephonyManager) context.getSystemService("phone"));
                a aVar = new a(i9);
                telephonyManager.registerTelephonyCallback(context.getMainExecutor(), aVar);
                telephonyManager.unregisterTelephonyCallback(aVar);
            } catch (RuntimeException unused) {
                i9.k(5);
            }
        }
    }

    public interface c {
        void a(int i9);
    }

    public final class d extends BroadcastReceiver {
        public d() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iG = I.g(context);
            if (k0.f39777a < 31 || iG != 5) {
                I.this.k(iG);
            } else {
                b.a(context, I.this);
            }
        }
    }

    public I(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new d(), intentFilter);
    }

    public static synchronized I d(Context context) {
        try {
            if (f39693e == null) {
                f39693e = new I(context);
            }
        } catch (Throwable th) {
            throw th;
        }
        return f39693e;
    }

    public static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
            case LangUtils.HASH_SEED /* 17 */:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return k0.f39777a >= 29 ? 9 : 0;
        }
    }

    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i9 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i9 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i9;
    }

    public int f() {
        int i9;
        synchronized (this.f39696c) {
            i9 = this.f39697d;
        }
        return i9;
    }

    public final /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    public void i(final c cVar) {
        j();
        this.f39695b.add(new WeakReference(cVar));
        this.f39694a.post(new Runnable() { // from class: d4.H
            @Override // java.lang.Runnable
            public final void run() {
                this.f39691a.h(cVar);
            }
        });
    }

    public final void j() {
        for (WeakReference weakReference : this.f39695b) {
            if (weakReference.get() == null) {
                this.f39695b.remove(weakReference);
            }
        }
    }

    public final void k(int i9) {
        synchronized (this.f39696c) {
            try {
                if (this.f39697d == i9) {
                    return;
                }
                this.f39697d = i9;
                for (WeakReference weakReference : this.f39695b) {
                    c cVar = (c) weakReference.get();
                    if (cVar != null) {
                        cVar.a(i9);
                    } else {
                        this.f39695b.remove(weakReference);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
