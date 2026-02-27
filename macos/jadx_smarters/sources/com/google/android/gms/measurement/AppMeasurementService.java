package com.google.android.gms.measurement;

import M4.C0808q4;
import M4.InterfaceC0802p4;
import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import k0.AbstractC2131a;

/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements InterfaceC0802p4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C0808q4 f26946a;

    private final C0808q4 a() {
        if (this.f26946a == null) {
            this.f26946a = new C0808q4(this);
        }
        return this.f26946a;
    }

    @Override // M4.InterfaceC0802p4
    public final boolean c(int i9) {
        return stopSelfResult(i9);
    }

    @Override // M4.InterfaceC0802p4
    public final void d(Intent intent) {
        AbstractC2131a.b(intent);
    }

    @Override // M4.InterfaceC0802p4
    public final void e(JobParameters jobParameters, boolean z9) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return a().b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        a().e();
    }

    @Override // android.app.Service
    public void onDestroy() {
        a().f();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onRebind(Intent intent) {
        a().g(intent);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        a().a(intent, i9, i10);
        return 2;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        a().j(intent);
        return true;
    }
}
