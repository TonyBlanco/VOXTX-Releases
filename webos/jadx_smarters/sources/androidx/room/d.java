package androidx.room;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.a;
import androidx.room.b;
import androidx.room.c;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f17141b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f17142c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.room.c f17143d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c.AbstractC0198c f17144e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public androidx.room.b f17145f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Executor f17146g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.room.a f17147h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f17148i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ServiceConnection f17149j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Runnable f17150k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Runnable f17151l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Runnable f17152m;

    public class a extends a.AbstractBinderC0195a {

        /* JADX INFO: renamed from: androidx.room.d$a$a, reason: collision with other inner class name */
        public class RunnableC0199a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String[] f17154a;

            public RunnableC0199a(String[] strArr) {
                this.f17154a = strArr;
            }

            @Override // java.lang.Runnable
            public void run() {
                d.this.f17143d.e(this.f17154a);
            }
        }

        public a() {
        }

        @Override // androidx.room.a
        public void o(String[] strArr) {
            d.this.f17146g.execute(new RunnableC0199a(strArr));
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            d.this.f17145f = b.a.A(iBinder);
            d dVar = d.this;
            dVar.f17146g.execute(dVar.f17150k);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            d dVar = d.this;
            dVar.f17146g.execute(dVar.f17151l);
            d.this.f17145f = null;
        }
    }

    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                d dVar = d.this;
                androidx.room.b bVar = dVar.f17145f;
                if (bVar != null) {
                    dVar.f17142c = bVar.n0(dVar.f17147h, dVar.f17141b);
                    d dVar2 = d.this;
                    dVar2.f17143d.a(dVar2.f17144e);
                }
            } catch (RemoteException e9) {
                Log.w("ROOM", "Cannot register multi-instance invalidation callback", e9);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.d$d, reason: collision with other inner class name */
    public class RunnableC0200d implements Runnable {
        public RunnableC0200d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.f17143d.g(dVar.f17144e);
        }
    }

    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            d dVar = d.this;
            dVar.f17143d.g(dVar.f17144e);
            try {
                d dVar2 = d.this;
                androidx.room.b bVar = dVar2.f17145f;
                if (bVar != null) {
                    bVar.W0(dVar2.f17147h, dVar2.f17142c);
                }
            } catch (RemoteException e9) {
                Log.w("ROOM", "Cannot unregister multi-instance invalidation callback", e9);
            }
            d dVar3 = d.this;
            dVar3.f17140a.unbindService(dVar3.f17149j);
        }
    }

    public class f extends c.AbstractC0198c {
        public f(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.c.AbstractC0198c
        public boolean a() {
            return true;
        }

        @Override // androidx.room.c.AbstractC0198c
        public void b(Set set) {
            if (d.this.f17148i.get()) {
                return;
            }
            try {
                d dVar = d.this;
                androidx.room.b bVar = dVar.f17145f;
                if (bVar != null) {
                    bVar.V(dVar.f17142c, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e9) {
                Log.w("ROOM", "Cannot broadcast invalidation", e9);
            }
        }
    }

    public d(Context context, String str, androidx.room.c cVar, Executor executor) {
        b bVar = new b();
        this.f17149j = bVar;
        this.f17150k = new c();
        this.f17151l = new RunnableC0200d();
        this.f17152m = new e();
        Context applicationContext = context.getApplicationContext();
        this.f17140a = applicationContext;
        this.f17141b = str;
        this.f17143d = cVar;
        this.f17146g = executor;
        this.f17144e = new f((String[]) cVar.f17117a.keySet().toArray(new String[0]));
        applicationContext.bindService(new Intent(applicationContext, (Class<?>) MultiInstanceInvalidationService.class), bVar, 1);
    }
}
