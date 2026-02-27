package X0;

import Q0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import c1.InterfaceC1247a;

/* JADX INFO: loaded from: classes.dex */
public class g extends d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f10383j = k.f("NetworkStateTracker");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConnectivityManager f10384g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f10385h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public a f10386i;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || intent.getAction() == null || !intent.getAction().equals("android.net.conn.CONNECTIVITY_CHANGE")) {
                return;
            }
            k.c().a(g.f10383j, "Network broadcast received", new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }
    }

    public class b extends ConnectivityManager.NetworkCallback {
        public b() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            k.c().a(g.f10383j, String.format("Network capabilities changed: %s", networkCapabilities), new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            k.c().a(g.f10383j, "Network connection lost", new Throwable[0]);
            g gVar = g.this;
            gVar.d(gVar.g());
        }
    }

    public g(Context context, InterfaceC1247a interfaceC1247a) {
        super(context, interfaceC1247a);
        this.f10384g = (ConnectivityManager) this.f10377b.getSystemService("connectivity");
        if (j()) {
            this.f10385h = new b();
        } else {
            this.f10386i = new a();
        }
    }

    public static boolean j() {
        return Build.VERSION.SDK_INT >= 24;
    }

    @Override // X0.d
    public void e() {
        if (!j()) {
            k.c().a(f10383j, "Registering broadcast receiver", new Throwable[0]);
            this.f10377b.registerReceiver(this.f10386i, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
            return;
        }
        try {
            k.c().a(f10383j, "Registering network callback", new Throwable[0]);
            this.f10384g.registerDefaultNetworkCallback(this.f10385h);
        } catch (IllegalArgumentException | SecurityException e9) {
            k.c().b(f10383j, "Received exception while registering network callback", e9);
        }
    }

    @Override // X0.d
    public void f() {
        if (!j()) {
            k.c().a(f10383j, "Unregistering broadcast receiver", new Throwable[0]);
            this.f10377b.unregisterReceiver(this.f10386i);
            return;
        }
        try {
            k.c().a(f10383j, "Unregistering network callback", new Throwable[0]);
            this.f10384g.unregisterNetworkCallback(this.f10385h);
        } catch (IllegalArgumentException | SecurityException e9) {
            k.c().b(f10383j, "Received exception while unregistering network callback", e9);
        }
    }

    public V0.b g() {
        NetworkInfo activeNetworkInfo = this.f10384g.getActiveNetworkInfo();
        boolean z9 = false;
        boolean z10 = activeNetworkInfo != null && activeNetworkInfo.isConnected();
        boolean zI = i();
        boolean zA = K.a.a(this.f10384g);
        if (activeNetworkInfo != null && !activeNetworkInfo.isRoaming()) {
            z9 = true;
        }
        return new V0.b(z10, zI, zA, z9);
    }

    @Override // X0.d
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public V0.b b() {
        return g();
    }

    public boolean i() {
        if (Build.VERSION.SDK_INT < 23) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = this.f10384g.getNetworkCapabilities(this.f10384g.getActiveNetwork());
            if (networkCapabilities != null) {
                if (networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (SecurityException e9) {
            k.c().b(f10383j, "Unable to validate active network", e9);
            return false;
        }
    }
}
