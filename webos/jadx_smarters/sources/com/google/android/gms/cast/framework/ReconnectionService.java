package com.google.android.gms.cast.framework;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.internal.cast.zzaf;
import o4.C2325b;
import o4.J;
import t4.C2775b;

/* JADX INFO: loaded from: classes3.dex */
public class ReconnectionService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2775b f26314c = new C2775b("ReconnectionService");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public J f26315a;

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        J j9 = this.f26315a;
        if (j9 != null) {
            try {
                return j9.v(intent);
            } catch (RemoteException e9) {
                f26314c.b(e9, "Unable to call %s on %s.", "onBind", J.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        C2325b c2325bE = C2325b.e(this);
        J jZzc = zzaf.zzc(this, c2325bE.c().f(), c2325bE.h().a());
        this.f26315a = jZzc;
        if (jZzc != null) {
            try {
                jZzc.zzg();
            } catch (RemoteException e9) {
                f26314c.b(e9, "Unable to call %s on %s.", "onCreate", J.class.getSimpleName());
            }
            super.onCreate();
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        J j9 = this.f26315a;
        if (j9 != null) {
            try {
                j9.zzh();
            } catch (RemoteException e9) {
                f26314c.b(e9, "Unable to call %s on %s.", "onDestroy", J.class.getSimpleName());
            }
            super.onDestroy();
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        J j9 = this.f26315a;
        if (j9 != null) {
            try {
                return j9.X0(intent, i9, i10);
            } catch (RemoteException e9) {
                f26314c.b(e9, "Unable to call %s on %s.", "onStartCommand", J.class.getSimpleName());
            }
        }
        return 2;
    }
}
