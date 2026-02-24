package h4;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.RemoteException;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.gms.common.internal.r;
import com.google.android.gms.internal.ads_identifier.zze;
import com.google.android.gms.internal.ads_identifier.zzf;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import w4.C2921i;
import w4.C2922j;
import w4.ServiceConnectionC2913a;

/* JADX INFO: renamed from: h4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1858a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ServiceConnectionC2913a f41648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public zzf f41649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f41651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C1860c f41652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Context f41653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f41654g;

    /* JADX INFO: renamed from: h4.a$a, reason: collision with other inner class name */
    public static final class C0341a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f41655a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f41656b;

        public C0341a(String str, boolean z9) {
            this.f41655a = str;
            this.f41656b = z9;
        }

        public String a() {
            return this.f41655a;
        }

        public boolean b() {
            return this.f41656b;
        }

        public String toString() {
            String str = this.f41655a;
            boolean z9 = this.f41656b;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z9);
            return sb.toString();
        }
    }

    public C1858a(Context context) {
        this(context, 30000L, false, false);
    }

    public C1858a(Context context, long j9, boolean z9, boolean z10) {
        Context applicationContext;
        this.f41651d = new Object();
        r.m(context);
        if (z9 && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.f41653f = context;
        this.f41650c = false;
        this.f41654g = j9;
    }

    public static C0341a a(Context context) {
        C1858a c1858a = new C1858a(context, -1L, true, false);
        try {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            c1858a.f(false);
            C0341a c0341aH = c1858a.h(-1);
            c1858a.g(c0341aH, true, 0.0f, SystemClock.elapsedRealtime() - jElapsedRealtime, "", null);
            return c0341aH;
        } finally {
        }
    }

    public static void c(boolean z9) {
    }

    public C0341a b() {
        return h(-1);
    }

    public void d() {
        f(true);
    }

    public final void e() {
        r.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f41653f == null || this.f41648a == null) {
                    return;
                }
                try {
                    if (this.f41650c) {
                        B4.b.b().c(this.f41653f, this.f41648a);
                    }
                } catch (Throwable th) {
                    Log.i("AdvertisingIdClient", "AdvertisingIdClient unbindService failed.", th);
                }
                this.f41650c = false;
                this.f41649b = null;
                this.f41648a = null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void f(boolean z9) {
        r.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (this.f41650c) {
                    e();
                }
                Context context = this.f41653f;
                try {
                    context.getPackageManager().getPackageInfo("com.android.vending", 0);
                    int iJ = C2921i.h().j(context, 12451000);
                    if (iJ != 0 && iJ != 2) {
                        throw new IOException("Google Play services not available");
                    }
                    ServiceConnectionC2913a serviceConnectionC2913a = new ServiceConnectionC2913a();
                    Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
                    intent.setPackage("com.google.android.gms");
                    try {
                        if (!B4.b.b().a(context, intent, serviceConnectionC2913a, 1)) {
                            throw new IOException("Connection failure");
                        }
                        this.f41648a = serviceConnectionC2913a;
                        try {
                            this.f41649b = zze.zza(serviceConnectionC2913a.a(10000L, TimeUnit.MILLISECONDS));
                            this.f41650c = true;
                            if (z9) {
                                i();
                            }
                        } catch (InterruptedException unused) {
                            throw new IOException("Interrupted exception");
                        } catch (Throwable th) {
                            throw new IOException(th);
                        }
                    } finally {
                        IOException iOException = new IOException(th);
                    }
                } catch (PackageManager.NameNotFoundException unused2) {
                    throw new C2922j(9);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void finalize() throws Throwable {
        e();
        super.finalize();
    }

    public final boolean g(C0341a c0341a, boolean z9, float f9, long j9, String str, Throwable th) {
        if (Math.random() > 0.0d) {
            return false;
        }
        HashMap map = new HashMap();
        map.put("app_context", "1");
        if (c0341a != null) {
            map.put("limit_ad_tracking", true != c0341a.b() ? "0" : "1");
            String strA = c0341a.a();
            if (strA != null) {
                map.put("ad_id_size", Integer.toString(strA.length()));
            }
        }
        if (th != null) {
            map.put("error", th.getClass().getName());
        }
        map.put("tag", "AdvertisingIdClient");
        map.put("time_spent", Long.toString(j9));
        new C1859b(this, map).start();
        return true;
    }

    public final C0341a h(int i9) {
        C0341a c0341a;
        r.l("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            try {
                if (!this.f41650c) {
                    synchronized (this.f41651d) {
                        C1860c c1860c = this.f41652e;
                        if (c1860c == null || !c1860c.f41661e) {
                            throw new IOException("AdvertisingIdClient is not connected.");
                        }
                    }
                    try {
                        f(false);
                        if (!this.f41650c) {
                            throw new IOException("AdvertisingIdClient cannot reconnect.");
                        }
                    } catch (Exception e9) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.", e9);
                    }
                }
                r.m(this.f41648a);
                r.m(this.f41649b);
                try {
                    c0341a = new C0341a(this.f41649b.zzc(), this.f41649b.zze(true));
                } catch (RemoteException e10) {
                    Log.i("AdvertisingIdClient", "GMS remote exception ", e10);
                    throw new IOException("Remote exception");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        i();
        return c0341a;
    }

    public final void i() {
        synchronized (this.f41651d) {
            C1860c c1860c = this.f41652e;
            if (c1860c != null) {
                c1860c.f41660d.countDown();
                try {
                    this.f41652e.join();
                } catch (InterruptedException unused) {
                }
            }
            long j9 = this.f41654g;
            if (j9 > 0) {
                this.f41652e = new C1860c(this, j9);
            }
        }
    }
}
