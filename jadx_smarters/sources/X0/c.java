package X0;

import Q0.k;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import c1.InterfaceC1247a;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f10372h = k.f("BrdcstRcvrCnstrntTrckr");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final BroadcastReceiver f10373g;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent != null) {
                c.this.h(context, intent);
            }
        }
    }

    public c(Context context, InterfaceC1247a interfaceC1247a) {
        super(context, interfaceC1247a);
        this.f10373g = new a();
    }

    @Override // X0.d
    public void e() {
        k.c().a(f10372h, String.format("%s: registering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f10377b.registerReceiver(this.f10373g, g());
    }

    @Override // X0.d
    public void f() {
        k.c().a(f10372h, String.format("%s: unregistering receiver", getClass().getSimpleName()), new Throwable[0]);
        this.f10377b.unregisterReceiver(this.f10373g);
    }

    public abstract IntentFilter g();

    public abstract void h(Context context, Intent intent);
}
