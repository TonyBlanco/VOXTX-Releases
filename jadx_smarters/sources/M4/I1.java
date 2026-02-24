package M4;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes3.dex */
public final class I1 extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S4 f4270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f4271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f4272c;

    public I1(S4 s42) {
        com.google.android.gms.common.internal.r.m(s42);
        this.f4270a = s42;
    }

    public final void b() {
        this.f4270a.g();
        this.f4270a.f().h();
        if (this.f4271b) {
            return;
        }
        this.f4270a.c().registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        this.f4272c = this.f4270a.X().m();
        this.f4270a.d().v().b("Registering connectivity change receiver. Network connected", Boolean.valueOf(this.f4272c));
        this.f4271b = true;
    }

    public final void c() {
        this.f4270a.g();
        this.f4270a.f().h();
        this.f4270a.f().h();
        if (this.f4271b) {
            this.f4270a.d().v().a("Unregistering connectivity change receiver");
            this.f4271b = false;
            this.f4272c = false;
            try {
                this.f4270a.c().unregisterReceiver(this);
            } catch (IllegalArgumentException e9) {
                this.f4270a.d().r().b("Failed to unregister the network broadcast receiver", e9);
            }
        }
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f4270a.g();
        String action = intent.getAction();
        this.f4270a.d().v().b("NetworkBroadcastReceiver received action", action);
        if (!"android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
            this.f4270a.d().w().b("NetworkBroadcastReceiver received unknown action", action);
            return;
        }
        boolean zM = this.f4270a.X().m();
        if (this.f4272c != zM) {
            this.f4272c = zM;
            this.f4270a.f().z(new H1(this, zM));
        }
    }
}
