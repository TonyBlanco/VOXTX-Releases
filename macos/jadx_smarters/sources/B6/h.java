package B6;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f694a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f698e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f699f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f696c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f695b = new b();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Handler f697d = new Handler();

    public final class b extends BroadcastReceiver {
        public b() {
        }

        public final /* synthetic */ void b(boolean z9) {
            h.this.f(z9);
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.intent.action.BATTERY_CHANGED".equals(intent.getAction())) {
                final boolean z9 = intent.getIntExtra("plugged", -1) <= 0;
                h.this.f697d.post(new Runnable() { // from class: B6.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f701a.b(z9);
                    }
                });
            }
        }
    }

    public h(Context context, Runnable runnable) {
        this.f694a = context;
        this.f698e = runnable;
    }

    public void c() {
        e();
        if (this.f699f) {
            this.f697d.postDelayed(this.f698e, 300000L);
        }
    }

    public void d() {
        e();
        i();
    }

    public final void e() {
        this.f697d.removeCallbacksAndMessages(null);
    }

    public final void f(boolean z9) {
        this.f699f = z9;
        if (this.f696c) {
            c();
        }
    }

    public final void g() {
        if (this.f696c) {
            return;
        }
        this.f694a.registerReceiver(this.f695b, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        this.f696c = true;
    }

    public void h() {
        g();
        c();
    }

    public final void i() {
        if (this.f696c) {
            this.f694a.unregisterReceiver(this.f695b);
            this.f696c = false;
        }
    }
}
