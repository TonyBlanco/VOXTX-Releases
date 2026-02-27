package com.amazonaws.mobileconnectors.appsync;

import android.util.Log;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1185o;
import androidx.lifecycle.w;

/* JADX INFO: loaded from: classes.dex */
public class AWSAppSyncAppLifecycleObserver implements InterfaceC1185o {
    private static final String TAG = AWSAppSyncDeltaSync.class.getSimpleName();

    @w(AbstractC1180j.b.ON_START)
    public void startSomething() {
        Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Delta Sync: App is in FOREGROUND");
        AWSAppSyncDeltaSync.handleAppForeground();
    }

    @w(AbstractC1180j.b.ON_STOP)
    public void stopSomething() {
        Log.v(TAG, "Thread:[" + Thread.currentThread().getId() + "]: Delta Sync: App is in BACKGROUND");
        AWSAppSyncDeltaSync.handleAppBackground();
    }
}
