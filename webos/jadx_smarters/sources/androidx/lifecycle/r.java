package androidx.lifecycle;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

/* JADX INFO: loaded from: classes.dex */
public abstract class r extends Service implements InterfaceC1186p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H f15946a = new H(this);

    @Override // androidx.lifecycle.InterfaceC1186p
    public AbstractC1180j getLifecycle() {
        return this.f15946a.a();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        this.f15946a.b();
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        this.f15946a.c();
        super.onCreate();
    }

    @Override // android.app.Service
    public void onDestroy() {
        this.f15946a.d();
        super.onDestroy();
    }

    @Override // android.app.Service
    public void onStart(Intent intent, int i9) {
        this.f15946a.e();
        super.onStart(intent, i9);
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i9, int i10) {
        return super.onStartCommand(intent, i9, i10);
    }
}
