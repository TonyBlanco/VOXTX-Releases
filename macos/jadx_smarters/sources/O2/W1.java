package O2;

import android.content.Context;
import android.os.PowerManager;
import d4.AbstractC1681B;

/* JADX INFO: loaded from: classes3.dex */
public final class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PowerManager f5923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public PowerManager.WakeLock f5924b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5925c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5926d;

    public W1(Context context) {
        this.f5923a = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    public void a(boolean z9) {
        if (z9 && this.f5924b == null) {
            PowerManager powerManager = this.f5923a;
            if (powerManager == null) {
                AbstractC1681B.j("WakeLockManager", "PowerManager is null, therefore not creating the WakeLock.");
                return;
            } else {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "ExoPlayer:WakeLockManager");
                this.f5924b = wakeLockNewWakeLock;
                wakeLockNewWakeLock.setReferenceCounted(false);
            }
        }
        this.f5925c = z9;
        c();
    }

    public void b(boolean z9) {
        this.f5926d = z9;
        c();
    }

    public final void c() {
        PowerManager.WakeLock wakeLock = this.f5924b;
        if (wakeLock == null) {
            return;
        }
        if (this.f5925c && this.f5926d) {
            wakeLock.acquire();
        } else {
            wakeLock.release();
        }
    }
}
