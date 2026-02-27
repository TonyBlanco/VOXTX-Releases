package androidx.work.impl.background.systemalarm;

import Q0.k;
import R0.j;
import a1.g;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import androidx.work.impl.background.systemalarm.ConstraintProxy;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintProxyUpdateReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f17325a = k.f("ConstrntProxyUpdtRecvr");

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f17326a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Context f17327c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ BroadcastReceiver.PendingResult f17328d;

        public a(Intent intent, Context context, BroadcastReceiver.PendingResult pendingResult) {
            this.f17326a = intent;
            this.f17327c = context;
            this.f17328d = pendingResult;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                boolean booleanExtra = this.f17326a.getBooleanExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra2 = this.f17326a.getBooleanExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", false);
                boolean booleanExtra3 = this.f17326a.getBooleanExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", false);
                boolean booleanExtra4 = this.f17326a.getBooleanExtra("KEY_NETWORK_STATE_PROXY_ENABLED", false);
                k.c().a(ConstraintProxyUpdateReceiver.f17325a, String.format("Updating proxies: BatteryNotLowProxy enabled (%s), BatteryChargingProxy enabled (%s), StorageNotLowProxy (%s), NetworkStateProxy enabled (%s)", Boolean.valueOf(booleanExtra), Boolean.valueOf(booleanExtra2), Boolean.valueOf(booleanExtra3), Boolean.valueOf(booleanExtra4)), new Throwable[0]);
                g.a(this.f17327c, ConstraintProxy.BatteryNotLowProxy.class, booleanExtra);
                g.a(this.f17327c, ConstraintProxy.BatteryChargingProxy.class, booleanExtra2);
                g.a(this.f17327c, ConstraintProxy.StorageNotLowProxy.class, booleanExtra3);
                g.a(this.f17327c, ConstraintProxy.NetworkStateProxy.class, booleanExtra4);
            } finally {
                this.f17328d.finish();
            }
        }
    }

    public static Intent a(Context context, boolean z9, boolean z10, boolean z11, boolean z12) {
        Intent intent = new Intent("androidx.work.impl.background.systemalarm.UpdateProxies");
        intent.setComponent(new ComponentName(context, (Class<?>) ConstraintProxyUpdateReceiver.class));
        intent.putExtra("KEY_BATTERY_NOT_LOW_PROXY_ENABLED", z9).putExtra("KEY_BATTERY_CHARGING_PROXY_ENABLED", z10).putExtra("KEY_STORAGE_NOT_LOW_PROXY_ENABLED", z11).putExtra("KEY_NETWORK_STATE_PROXY_ENABLED", z12);
        return intent;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent != null ? intent.getAction() : null;
        if ("androidx.work.impl.background.systemalarm.UpdateProxies".equals(action)) {
            j.m(context).r().b(new a(intent, context, goAsync()));
        } else {
            k.c().a(f17325a, String.format("Ignoring unknown action %s", action), new Throwable[0]);
        }
    }
}
