package A3;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import d4.AbstractC1684a;
import d4.k0;

/* JADX INFO: loaded from: classes3.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f98a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f99b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A3.c f100c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f101d = k0.z();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f102e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f103f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public C0002d f104g;

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            d.this.e();
        }
    }

    public interface c {
        void a(d dVar, int i9);
    }

    /* JADX INFO: renamed from: A3.d$d, reason: collision with other inner class name */
    public final class C0002d extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f107b;

        public C0002d() {
        }

        public final /* synthetic */ void c() {
            if (d.this.f104g != null) {
                d.this.e();
            }
        }

        public final /* synthetic */ void d() {
            if (d.this.f104g != null) {
                d.this.g();
            }
        }

        public final void e() {
            d.this.f101d.post(new Runnable() { // from class: A3.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109a.c();
                }
            });
        }

        public final void f() {
            d.this.f101d.post(new Runnable() { // from class: A3.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110a.d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z9) {
            if (z9) {
                return;
            }
            f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f106a && this.f107b == zHasCapability) {
                if (zHasCapability) {
                    f();
                }
            } else {
                this.f106a = true;
                this.f107b = zHasCapability;
                e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            e();
        }
    }

    public d(Context context, c cVar, A3.c cVar2) {
        this.f98a = context.getApplicationContext();
        this.f99b = cVar;
        this.f100c = cVar2;
    }

    public final void e() {
        int iD = this.f100c.d(this.f98a);
        if (this.f103f != iD) {
            this.f103f = iD;
            this.f99b.a(this, iD);
        }
    }

    public A3.c f() {
        return this.f100c;
    }

    public final void g() {
        if ((this.f103f & 3) == 0) {
            return;
        }
        e();
    }

    public final void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) AbstractC1684a.e((ConnectivityManager) this.f98a.getSystemService("connectivity"));
        C0002d c0002d = new C0002d();
        this.f104g = c0002d;
        connectivityManager.registerDefaultNetworkCallback(c0002d);
    }

    public int i() {
        String str;
        this.f103f = this.f100c.d(this.f98a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f100c.r()) {
            if (k0.f39777a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f100c.f()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f100c.k()) {
            if (k0.f39777a >= 23) {
                str = "android.os.action.DEVICE_IDLE_MODE_CHANGED";
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                str = "android.intent.action.SCREEN_OFF";
            }
            intentFilter.addAction(str);
        }
        if (this.f100c.v()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        b bVar = new b();
        this.f102e = bVar;
        this.f98a.registerReceiver(bVar, intentFilter, null, this.f101d);
        return this.f103f;
    }

    public void j() {
        this.f98a.unregisterReceiver((BroadcastReceiver) AbstractC1684a.e(this.f102e));
        this.f102e = null;
        if (k0.f39777a < 24 || this.f104g == null) {
            return;
        }
        k();
    }

    public final void k() {
        ((ConnectivityManager) AbstractC1684a.e((ConnectivityManager) this.f98a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) AbstractC1684a.e(this.f104g));
        this.f104g = null;
    }
}
