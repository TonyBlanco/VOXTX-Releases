package d4;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes3.dex */
public class W implements InterfaceC1688e {
    @Override // d4.InterfaceC1688e
    public long a() {
        return SystemClock.uptimeMillis();
    }

    @Override // d4.InterfaceC1688e
    public long b() {
        return SystemClock.elapsedRealtime();
    }

    @Override // d4.InterfaceC1688e
    public InterfaceC1705w c(Looper looper, Handler.Callback callback) {
        return new X(new Handler(looper, callback));
    }

    @Override // d4.InterfaceC1688e
    public void d() {
    }
}
