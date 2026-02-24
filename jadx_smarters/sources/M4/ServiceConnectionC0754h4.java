package M4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.internal.AbstractC1404c;
import w4.C2914b;

/* JADX INFO: renamed from: M4.h4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class ServiceConnectionC0754h4 implements ServiceConnection, AbstractC1404c.a, AbstractC1404c.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile boolean f4722a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public volatile C0834v1 f4723c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0760i4 f4724d;

    public ServiceConnectionC0754h4(C0760i4 c0760i4) {
        this.f4724d = c0760i4;
    }

    public final void b(Intent intent) {
        this.f4724d.h();
        Context contextC = this.f4724d.f4245a.c();
        B4.b bVarB = B4.b.b();
        synchronized (this) {
            try {
                if (this.f4722a) {
                    this.f4724d.f4245a.d().v().a("Connection attempt already in progress");
                    return;
                }
                this.f4724d.f4245a.d().v().a("Using local app measurement service");
                this.f4722a = true;
                bVarB.a(contextC, intent, this.f4724d.f4742c, 129);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c() {
        this.f4724d.h();
        Context contextC = this.f4724d.f4245a.c();
        synchronized (this) {
            try {
                if (this.f4722a) {
                    this.f4724d.f4245a.d().v().a("Connection attempt already in progress");
                    return;
                }
                if (this.f4723c != null && (this.f4723c.isConnecting() || this.f4723c.isConnected())) {
                    this.f4724d.f4245a.d().v().a("Already awaiting connection attempt");
                    return;
                }
                this.f4723c = new C0834v1(contextC, Looper.getMainLooper(), this, this);
                this.f4724d.f4245a.d().v().a("Connecting to remote service");
                this.f4722a = true;
                com.google.android.gms.common.internal.r.m(this.f4723c);
                this.f4723c.checkAvailabilityAndConnect();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        if (this.f4723c != null && (this.f4723c.isConnected() || this.f4723c.isConnecting())) {
            this.f4723c.disconnect();
        }
        this.f4723c = null;
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnected(Bundle bundle) {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onConnected");
        synchronized (this) {
            try {
                com.google.android.gms.common.internal.r.m(this.f4723c);
                this.f4724d.f4245a.f().z(new RunnableC0736e4(this, (InterfaceC0799p1) this.f4723c.getService()));
            } catch (DeadObjectException | IllegalStateException unused) {
                this.f4723c = null;
                this.f4722a = false;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.b
    public final void onConnectionFailed(C2914b c2914b) {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onConnectionFailed");
        C0858z1 c0858z1E = this.f4724d.f4245a.E();
        if (c0858z1E != null) {
            c0858z1E.w().b("Service connection failed", c2914b);
        }
        synchronized (this) {
            this.f4722a = false;
            this.f4723c = null;
        }
        this.f4724d.f4245a.f().z(new RunnableC0748g4(this));
    }

    @Override // com.google.android.gms.common.internal.AbstractC1404c.a
    public final void onConnectionSuspended(int i9) {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onConnectionSuspended");
        this.f4724d.f4245a.d().q().a("Service connection suspended");
        this.f4724d.f4245a.f().z(new RunnableC0742f4(this));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onServiceConnected");
        synchronized (this) {
            if (iBinder == null) {
                this.f4722a = false;
                this.f4724d.f4245a.d().r().a("Service connected with null binder");
                return;
            }
            InterfaceC0799p1 c0787n1 = null;
            try {
                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
                if ("com.google.android.gms.measurement.internal.IMeasurementService".equals(interfaceDescriptor)) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
                    c0787n1 = iInterfaceQueryLocalInterface instanceof InterfaceC0799p1 ? (InterfaceC0799p1) iInterfaceQueryLocalInterface : new C0787n1(iBinder);
                    this.f4724d.f4245a.d().v().a("Bound to IMeasurementService interface");
                } else {
                    this.f4724d.f4245a.d().r().b("Got binder with a wrong descriptor", interfaceDescriptor);
                }
            } catch (RemoteException unused) {
                this.f4724d.f4245a.d().r().a("Service connect failed to get IMeasurementService");
            }
            if (c0787n1 == null) {
                this.f4722a = false;
                try {
                    B4.b.b().c(this.f4724d.f4245a.c(), this.f4724d.f4742c);
                } catch (IllegalArgumentException unused2) {
                }
            } else {
                this.f4724d.f4245a.f().z(new RunnableC0724c4(this, c0787n1));
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.common.internal.r.f("MeasurementServiceConnection.onServiceDisconnected");
        this.f4724d.f4245a.d().q().a("Service disconnected");
        this.f4724d.f4245a.f().z(new RunnableC0730d4(this, componentName));
    }
}
