package O2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.os.Handler;
import d4.AbstractC1681B;
import d4.AbstractC1684a;

/* JADX INFO: loaded from: classes3.dex */
public final class L1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f5686a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f5687b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5688c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AudioManager f5689d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f5690e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f5691f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f5692g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f5693h;

    public interface b {
        void B(int i9, boolean z9);

        void o(int i9);
    }

    public final class c extends BroadcastReceiver {
        public c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Handler handler = L1.this.f5687b;
            final L1 l12 = L1.this;
            handler.post(new Runnable() { // from class: O2.M1
                @Override // java.lang.Runnable
                public final void run() {
                    L1.b(l12);
                }
            });
        }
    }

    public L1(Context context, Handler handler, b bVar) {
        Context applicationContext = context.getApplicationContext();
        this.f5686a = applicationContext;
        this.f5687b = handler;
        this.f5688c = bVar;
        AudioManager audioManager = (AudioManager) AbstractC1684a.i((AudioManager) applicationContext.getSystemService("audio"));
        this.f5689d = audioManager;
        this.f5691f = 3;
        this.f5692g = f(audioManager, 3);
        this.f5693h = e(audioManager, this.f5691f);
        c cVar = new c();
        try {
            applicationContext.registerReceiver(cVar, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.f5690e = cVar;
        } catch (RuntimeException e9) {
            AbstractC1681B.k("StreamVolumeManager", "Error registering stream volume receiver", e9);
        }
    }

    public static /* synthetic */ void b(L1 l12) {
        l12.i();
    }

    public static boolean e(AudioManager audioManager, int i9) {
        return d4.k0.f39777a >= 23 ? audioManager.isStreamMute(i9) : f(audioManager, i9) == 0;
    }

    public static int f(AudioManager audioManager, int i9) {
        try {
            return audioManager.getStreamVolume(i9);
        } catch (RuntimeException e9) {
            AbstractC1681B.k("StreamVolumeManager", "Could not retrieve stream volume for stream type " + i9, e9);
            return audioManager.getStreamMaxVolume(i9);
        }
    }

    public int c() {
        return this.f5689d.getStreamMaxVolume(this.f5691f);
    }

    public int d() {
        if (d4.k0.f39777a >= 28) {
            return this.f5689d.getStreamMinVolume(this.f5691f);
        }
        return 0;
    }

    public void g() {
        c cVar = this.f5690e;
        if (cVar != null) {
            try {
                this.f5686a.unregisterReceiver(cVar);
            } catch (RuntimeException e9) {
                AbstractC1681B.k("StreamVolumeManager", "Error unregistering stream volume receiver", e9);
            }
            this.f5690e = null;
        }
    }

    public void h(int i9) {
        if (this.f5691f == i9) {
            return;
        }
        this.f5691f = i9;
        i();
        this.f5688c.o(i9);
    }

    public final void i() {
        int iF = f(this.f5689d, this.f5691f);
        boolean zE = e(this.f5689d, this.f5691f);
        if (this.f5692g == iF && this.f5693h == zE) {
            return;
        }
        this.f5692g = iF;
        this.f5693h = zE;
        this.f5688c.B(iF, zE);
    }
}
