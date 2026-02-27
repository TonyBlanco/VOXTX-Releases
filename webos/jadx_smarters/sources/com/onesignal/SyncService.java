package com.onesignal;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.onesignal.C1574o1;

/* JADX INFO: loaded from: classes4.dex */
public class SyncService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        C1574o1.q().b(this, new C1574o1.a(this));
        return 1;
    }
}
