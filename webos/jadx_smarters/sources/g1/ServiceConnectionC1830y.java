package g1;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.internal.play_billing.zzab;
import com.google.android.gms.internal.play_billing.zzb;
import com.google.android.gms.internal.play_billing.zzhl;
import com.google.android.gms.internal.play_billing.zzr;
import java.util.concurrent.Callable;
import org.apache.http.HttpStatus;

/* JADX INFO: renamed from: g1.y, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ServiceConnectionC1830y implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41254a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f41255c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1811e f41256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C1810d f41257e;

    public /* synthetic */ ServiceConnectionC1830y(C1810d c1810d, InterfaceC1811e interfaceC1811e, AbstractC1829x abstractC1829x) {
        this.f41257e = c1810d;
        this.f41256d = interfaceC1811e;
    }

    public final /* synthetic */ Object a() {
        Bundle bundle;
        int i9;
        String strSubstring;
        int iZzy;
        synchronized (this.f41254a) {
            try {
                if (!this.f41255c) {
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                    }
                    int i10 = 3;
                    try {
                        String packageName = this.f41257e.f41181e.getPackageName();
                        int i11 = 22;
                        iZzy = 3;
                        while (true) {
                            if (i11 < 3) {
                                i11 = 0;
                                break;
                            }
                            if (bundle == null) {
                                try {
                                    iZzy = this.f41257e.f41183g.zzy(i11, packageName, "subs");
                                } catch (Exception e9) {
                                    e = e9;
                                    i10 = iZzy;
                                    zzb.zzl("BillingClient", "Exception while checking if billing is supported; try to reconnect", e);
                                    i9 = e instanceof DeadObjectException ? 101 : e instanceof RemoteException ? 100 : e instanceof SecurityException ? HttpStatus.SC_PROCESSING : 42;
                                    if (i9 == 42) {
                                        strSubstring = e.getClass().getSimpleName() + ": " + zzab.zzb(e.getMessage());
                                        if (strSubstring.length() > 70) {
                                            strSubstring = strSubstring.substring(0, 70);
                                        }
                                    } else {
                                        strSubstring = null;
                                    }
                                    this.f41257e.f41177a = 0;
                                    this.f41257e.f41183g = null;
                                    iZzy = i10;
                                }
                            } else {
                                iZzy = this.f41257e.f41183g.zzc(i11, packageName, "subs", bundle);
                            }
                            if (iZzy == 0) {
                                zzb.zzj("BillingClient", "highestLevelSupportedForSubs: " + i11);
                                break;
                            }
                            i11--;
                        }
                        boolean z9 = true;
                        this.f41257e.f41186j = i11 >= 5;
                        this.f41257e.f41185i = i11 >= 3;
                        if (i11 < 3) {
                            zzb.zzj("BillingClient", "In-app billing API does not support subscription on this device.");
                            i9 = 9;
                        } else {
                            i9 = 1;
                        }
                        int i12 = 22;
                        while (true) {
                            if (i12 < 3) {
                                break;
                            }
                            iZzy = bundle == null ? this.f41257e.f41183g.zzy(i12, packageName, "inapp") : this.f41257e.f41183g.zzc(i12, packageName, "inapp", bundle);
                            if (iZzy == 0) {
                                this.f41257e.f41187k = i12;
                                zzb.zzj("BillingClient", "mHighestLevelSupportedForInApp: " + this.f41257e.f41187k);
                                break;
                            }
                            i12--;
                        }
                        C1810d c1810d = this.f41257e;
                        c1810d.f41201y = c1810d.f41187k >= 22;
                        C1810d c1810d2 = this.f41257e;
                        c1810d2.f41200x = c1810d2.f41187k >= 21;
                        C1810d c1810d3 = this.f41257e;
                        c1810d3.f41199w = c1810d3.f41187k >= 20;
                        C1810d c1810d4 = this.f41257e;
                        c1810d4.f41198v = c1810d4.f41187k >= 19;
                        C1810d c1810d5 = this.f41257e;
                        c1810d5.f41197u = c1810d5.f41187k >= 18;
                        C1810d c1810d6 = this.f41257e;
                        c1810d6.f41196t = c1810d6.f41187k >= 17;
                        C1810d c1810d7 = this.f41257e;
                        c1810d7.f41195s = c1810d7.f41187k >= 16;
                        C1810d c1810d8 = this.f41257e;
                        c1810d8.f41194r = c1810d8.f41187k >= 15;
                        C1810d c1810d9 = this.f41257e;
                        c1810d9.f41193q = c1810d9.f41187k >= 14;
                        C1810d c1810d10 = this.f41257e;
                        c1810d10.f41192p = c1810d10.f41187k >= 12;
                        C1810d c1810d11 = this.f41257e;
                        c1810d11.f41191o = c1810d11.f41187k >= 10;
                        C1810d c1810d12 = this.f41257e;
                        c1810d12.f41190n = c1810d12.f41187k >= 9;
                        C1810d c1810d13 = this.f41257e;
                        c1810d13.f41189m = c1810d13.f41187k >= 8;
                        C1810d c1810d14 = this.f41257e;
                        if (c1810d14.f41187k < 6) {
                            z9 = false;
                        }
                        c1810d14.f41188l = z9;
                        if (this.f41257e.f41187k < 3) {
                            zzb.zzk("BillingClient", "In-app billing API version 3 is not supported on this device.");
                            i9 = 36;
                        }
                        if (iZzy == 0) {
                            this.f41257e.f41177a = 2;
                            if (this.f41257e.f41180d != null) {
                                this.f41257e.f41180d.g(this.f41257e.f41200x);
                            }
                        } else {
                            this.f41257e.f41177a = 0;
                            this.f41257e.f41183g = null;
                        }
                        strSubstring = null;
                    } catch (Exception e10) {
                        e = e10;
                    }
                    if (iZzy == 0) {
                        this.f41257e.P(AbstractC1806E.c(6));
                        d(com.android.billingclient.api.b.f18463l);
                    } else {
                        C1810d c1810d15 = this.f41257e;
                        com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18452a;
                        c1810d15.O(AbstractC1806E.b(i9, 6, aVar, strSubstring));
                        d(aVar);
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public final /* synthetic */ void b() {
        this.f41257e.f41177a = 0;
        this.f41257e.f41183g = null;
        com.android.billingclient.api.a aVar = com.android.billingclient.api.b.f18465n;
        this.f41257e.O(AbstractC1806E.a(24, 6, aVar));
        d(aVar);
    }

    public final void c() {
        synchronized (this.f41254a) {
            this.f41256d = null;
            this.f41255c = true;
        }
    }

    public final void d(com.android.billingclient.api.a aVar) {
        synchronized (this.f41254a) {
            try {
                InterfaceC1811e interfaceC1811e = this.f41256d;
                if (interfaceC1811e != null) {
                    interfaceC1811e.a(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        zzb.zzj("BillingClient", "Billing service connected.");
        this.f41257e.f41183g = zzr.zzu(iBinder);
        Callable callable = new Callable() { // from class: g1.u
            @Override // java.util.concurrent.Callable
            public final Object call() {
                this.f41252a.a();
                return null;
            }
        };
        Runnable runnable = new Runnable() { // from class: g1.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f41253a.b();
            }
        };
        C1810d c1810d = this.f41257e;
        if (c1810d.N(callable, 30000L, runnable, c1810d.J()) == null) {
            C1810d c1810d2 = this.f41257e;
            com.android.billingclient.api.a aVarL = c1810d2.L();
            c1810d2.O(AbstractC1806E.a(25, 6, aVarL));
            d(aVarL);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzb.zzk("BillingClient", "Billing service disconnected.");
        this.f41257e.f41182f.c(zzhl.zzz());
        this.f41257e.f41183g = null;
        this.f41257e.f41177a = 0;
        synchronized (this.f41254a) {
            try {
                InterfaceC1811e interfaceC1811e = this.f41256d;
                if (interfaceC1811e != null) {
                    interfaceC1811e.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
