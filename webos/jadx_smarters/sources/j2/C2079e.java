package j2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j2.InterfaceC2077c;

/* JADX INFO: renamed from: j2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2079e implements InterfaceC2077c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2077c.a f42886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f42888d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BroadcastReceiver f42889e = new a();

    /* JADX INFO: renamed from: j2.e$a */
    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            boolean z9 = C2079e.this.f42887c;
            C2079e c2079e = C2079e.this;
            c2079e.f42887c = c2079e.l(context);
            if (z9 != C2079e.this.f42887c) {
                C2079e.this.f42886b.onConnectivityChanged(C2079e.this.f42887c);
            }
        }
    }

    public C2079e(Context context, InterfaceC2077c.a aVar) {
        this.f42885a = context.getApplicationContext();
        this.f42886b = aVar;
    }

    public final boolean l(Context context) {
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    public final void m() {
        if (this.f42888d) {
            return;
        }
        this.f42887c = l(this.f42885a);
        this.f42885a.registerReceiver(this.f42889e, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f42888d = true;
    }

    public final void n() {
        if (this.f42888d) {
            this.f42885a.unregisterReceiver(this.f42889e);
            this.f42888d = false;
        }
    }

    @Override // j2.InterfaceC2082h
    public void onDestroy() {
    }

    @Override // j2.InterfaceC2082h
    public void onStart() {
        m();
    }

    @Override // j2.InterfaceC2082h
    public void onStop() {
        n();
    }
}
