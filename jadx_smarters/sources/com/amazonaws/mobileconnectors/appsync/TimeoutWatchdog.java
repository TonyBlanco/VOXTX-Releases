package com.amazonaws.mobileconnectors.appsync;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import okhttp3.WebSocket;

/* JADX INFO: loaded from: classes.dex */
final class TimeoutWatchdog {
    private static final int NORMAL_CLOSURE_STATUS = 1000;
    private static final String TAG = "TimeoutWatchdog";
    private final Handler handler = new Handler(Looper.getMainLooper());
    private long connectionTimeoutMs = -1;
    private Runnable cleanupRunnable = null;

    public synchronized void reset() {
        Runnable runnable = this.cleanupRunnable;
        if (runnable != null) {
            this.handler.removeCallbacks(runnable);
            this.handler.postDelayed(this.cleanupRunnable, this.connectionTimeoutMs);
        }
    }

    public synchronized void start(final WebSocket webSocket, long j9) {
        if (webSocket == null) {
            throw new NullPointerException("Passed null webSocket to watchdog.");
        }
        if (j9 <= 0) {
            throw new IllegalArgumentException("connectionTimeoutMs must be > 0.");
        }
        stop();
        this.connectionTimeoutMs = j9;
        Runnable runnable = new Runnable() { // from class: com.amazonaws.mobileconnectors.appsync.TimeoutWatchdog.1
            @Override // java.lang.Runnable
            public void run() {
                Log.d(TimeoutWatchdog.TAG, "WebSocket closed gracefully due to timeout.");
                webSocket.close(1000, "WebSocket closed due to timeout.");
            }
        };
        this.cleanupRunnable = runnable;
        this.handler.postDelayed(runnable, j9);
    }

    public synchronized void stop() {
        try {
            Runnable runnable = this.cleanupRunnable;
            if (runnable != null) {
                this.handler.removeCallbacks(runnable);
            }
            this.cleanupRunnable = null;
            this.connectionTimeoutMs = -1L;
        } catch (Throwable th) {
            throw th;
        }
    }
}
