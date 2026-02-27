package O2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;

/* JADX INFO: renamed from: O2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0865b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f5950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5951c;

    /* JADX INFO: renamed from: O2.b$a */
    public final class a extends BroadcastReceiver implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0073b f5952a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f5953c;

        public a(Handler handler, InterfaceC0073b interfaceC0073b) {
            this.f5953c = handler;
            this.f5952a = interfaceC0073b;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if ("android.media.AUDIO_BECOMING_NOISY".equals(intent.getAction())) {
                this.f5953c.post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C0865b.this.f5951c) {
                this.f5952a.t();
            }
        }
    }

    /* JADX INFO: renamed from: O2.b$b, reason: collision with other inner class name */
    public interface InterfaceC0073b {
        void t();
    }

    public C0865b(Context context, Handler handler, InterfaceC0073b interfaceC0073b) {
        this.f5949a = context.getApplicationContext();
        this.f5950b = new a(handler, interfaceC0073b);
    }

    public void b(boolean z9) {
        boolean z10;
        if (z9 && !this.f5951c) {
            this.f5949a.registerReceiver(this.f5950b, new IntentFilter("android.media.AUDIO_BECOMING_NOISY"));
            z10 = true;
        } else {
            if (z9 || !this.f5951c) {
                return;
            }
            this.f5949a.unregisterReceiver(this.f5950b);
            z10 = false;
        }
        this.f5951c = z10;
    }
}
