package q5;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

/* JADX INFO: renamed from: q5.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC2577x implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2578y f46930a;

    public /* synthetic */ ServiceConnectionC2577x(C2578y c2578y, AbstractC2576w abstractC2576w) {
        this.f46930a = c2578y;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f46930a.f46933b.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f46930a.c().post(new C2574u(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        this.f46930a.f46933b.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f46930a.c().post(new C2575v(this));
    }
}
