package O2;

import android.content.Context;
import android.net.wifi.WifiManager;
import d4.AbstractC1681B;

/* JADX INFO: loaded from: classes3.dex */
public final class X1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WifiManager f5930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public WifiManager.WifiLock f5931b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5933d;

    public X1(Context context) {
        this.f5930a = (WifiManager) context.getApplicationContext().getSystemService("wifi");
    }

    public void a(boolean z9) {
        if (z9 && this.f5931b == null) {
            WifiManager wifiManager = this.f5930a;
            if (wifiManager == null) {
                AbstractC1681B.j("WifiLockManager", "WifiManager is null, therefore not creating the WifiLock.");
                return;
            } else {
                WifiManager.WifiLock wifiLockCreateWifiLock = wifiManager.createWifiLock(3, "ExoPlayer:WifiLockManager");
                this.f5931b = wifiLockCreateWifiLock;
                wifiLockCreateWifiLock.setReferenceCounted(false);
            }
        }
        this.f5932c = z9;
        c();
    }

    public void b(boolean z9) {
        this.f5933d = z9;
        c();
    }

    public final void c() {
        WifiManager.WifiLock wifiLock = this.f5931b;
        if (wifiLock == null) {
            return;
        }
        if (this.f5932c && this.f5933d) {
            wifiLock.acquire();
        } else {
            wifiLock.release();
        }
    }
}
