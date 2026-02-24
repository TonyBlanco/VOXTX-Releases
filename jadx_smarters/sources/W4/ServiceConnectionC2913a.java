package w4;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: w4.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class ServiceConnectionC2913a implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f51644a = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final BlockingQueue f51645c = new LinkedBlockingQueue();

    public IBinder a(long j9, TimeUnit timeUnit) throws TimeoutException {
        com.google.android.gms.common.internal.r.l("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (this.f51644a) {
            throw new IllegalStateException("Cannot call get on this connection more than once");
        }
        this.f51644a = true;
        IBinder iBinder = (IBinder) this.f51645c.poll(j9, timeUnit);
        if (iBinder != null) {
            return iBinder;
        }
        throw new TimeoutException("Timed out waiting for the service connection");
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f51645c.add(iBinder);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
    }
}
