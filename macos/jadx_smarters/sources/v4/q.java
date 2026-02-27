package v4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import com.google.android.gms.internal.cloudmessaging.zzf;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class q implements ServiceConnection {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public r f51368d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ w f51371g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f51366a = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Messenger f51367c = new Messenger(new zzf(Looper.getMainLooper(), new Handler.Callback() { // from class: v4.j
        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            q qVar = this.f51358a;
            int i9 = message.arg1;
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                StringBuilder sb = new StringBuilder(41);
                sb.append("Received response to request: ");
                sb.append(i9);
                Log.d("MessengerIpcClient", sb.toString());
            }
            synchronized (qVar) {
                try {
                    t tVar = (t) qVar.f51370f.get(i9);
                    if (tVar == null) {
                        StringBuilder sb2 = new StringBuilder(50);
                        sb2.append("Received response for unknown request: ");
                        sb2.append(i9);
                        Log.w("MessengerIpcClient", sb2.toString());
                        return true;
                    }
                    qVar.f51370f.remove(i9);
                    qVar.f();
                    Bundle data = message.getData();
                    if (data.getBoolean("unsupported", false)) {
                        tVar.c(new u(4, "Not supported by GmsCore", null));
                        return true;
                    }
                    tVar.a(data);
                    return true;
                } finally {
                }
            }
        }
    }));

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Queue f51369e = new ArrayDeque();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SparseArray f51370f = new SparseArray();

    public /* synthetic */ q(w wVar, p pVar) {
        this.f51371g = wVar;
    }

    public final synchronized void a(int i9, String str) {
        b(i9, str, null);
    }

    public final synchronized void b(int i9, String str, Throwable th) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                String strValueOf = String.valueOf(str);
                Log.d("MessengerIpcClient", strValueOf.length() != 0 ? "Disconnected: ".concat(strValueOf) : new String("Disconnected: "));
            }
            int i10 = this.f51366a;
            if (i10 == 0) {
                throw new IllegalStateException();
            }
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                this.f51366a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.f51366a = 4;
            B4.b.b().c(this.f51371g.f51379a, this);
            u uVar = new u(i9, str, th);
            Iterator it = this.f51369e.iterator();
            while (it.hasNext()) {
                ((t) it.next()).c(uVar);
            }
            this.f51369e.clear();
            for (int i11 = 0; i11 < this.f51370f.size(); i11++) {
                ((t) this.f51370f.valueAt(i11)).c(uVar);
            }
            this.f51370f.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final void c() {
        this.f51371g.f51380b.execute(new Runnable() { // from class: v4.l
            @Override // java.lang.Runnable
            public final void run() {
                final t tVar;
                final q qVar = this.f51360a;
                while (true) {
                    synchronized (qVar) {
                        try {
                            if (qVar.f51366a != 2) {
                                return;
                            }
                            if (qVar.f51369e.isEmpty()) {
                                qVar.f();
                                return;
                            } else {
                                tVar = (t) qVar.f51369e.poll();
                                qVar.f51370f.put(tVar.f51374a, tVar);
                                qVar.f51371g.f51380b.schedule(new Runnable() { // from class: v4.o
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        qVar.e(tVar.f51374a);
                                    }
                                }, 30L, TimeUnit.SECONDS);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (Log.isLoggable("MessengerIpcClient", 3)) {
                        String strValueOf = String.valueOf(tVar);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 8);
                        sb.append("Sending ");
                        sb.append(strValueOf);
                        Log.d("MessengerIpcClient", sb.toString());
                    }
                    Context context = qVar.f51371g.f51379a;
                    Messenger messenger = qVar.f51367c;
                    Message messageObtain = Message.obtain();
                    messageObtain.what = tVar.f51376c;
                    messageObtain.arg1 = tVar.f51374a;
                    messageObtain.replyTo = messenger;
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("oneWay", tVar.b());
                    bundle.putString("pkg", context.getPackageName());
                    bundle.putBundle("data", tVar.f51377d);
                    messageObtain.setData(bundle);
                    try {
                        qVar.f51368d.a(messageObtain);
                    } catch (RemoteException e9) {
                        qVar.a(2, e9.getMessage());
                    }
                }
            }
        });
    }

    public final synchronized void d() {
        if (this.f51366a == 1) {
            a(1, "Timed out while binding");
        }
    }

    public final synchronized void e(int i9) {
        t tVar = (t) this.f51370f.get(i9);
        if (tVar != null) {
            StringBuilder sb = new StringBuilder(31);
            sb.append("Timing out request: ");
            sb.append(i9);
            Log.w("MessengerIpcClient", sb.toString());
            this.f51370f.remove(i9);
            tVar.c(new u(3, "Timed out waiting for response", null));
            f();
        }
    }

    public final synchronized void f() {
        try {
            if (this.f51366a == 2 && this.f51369e.isEmpty() && this.f51370f.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.f51366a = 3;
                B4.b.b().c(this.f51371g.f51379a, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized boolean g(t tVar) {
        int i9 = this.f51366a;
        if (i9 != 0) {
            if (i9 == 1) {
                this.f51369e.add(tVar);
                return true;
            }
            if (i9 != 2) {
                return false;
            }
            this.f51369e.add(tVar);
            c();
            return true;
        }
        this.f51369e.add(tVar);
        com.google.android.gms.common.internal.r.p(this.f51366a == 0);
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.f51366a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            if (B4.b.b().a(this.f51371g.f51379a, intent, this, 1)) {
                this.f51371g.f51380b.schedule(new Runnable() { // from class: v4.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f51361a.d();
                    }
                }, 30L, TimeUnit.SECONDS);
            } else {
                a(0, "Unable to bind to service");
            }
        } catch (SecurityException e9) {
            b(0, "Unable to bind to service", e9);
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        this.f51371g.f51380b.execute(new Runnable() { // from class: v4.n
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = this.f51362a;
                IBinder iBinder2 = iBinder;
                synchronized (qVar) {
                    if (iBinder2 == null) {
                        qVar.a(0, "Null service connection");
                        return;
                    }
                    try {
                        qVar.f51368d = new r(iBinder2);
                        qVar.f51366a = 2;
                        qVar.c();
                    } catch (RemoteException e9) {
                        qVar.a(0, e9.getMessage());
                    }
                }
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        this.f51371g.f51380b.execute(new Runnable() { // from class: v4.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f51359a.a(2, "Service disconnected");
            }
        });
    }
}
