package de.blinkt.openvpn.core;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Pair;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.i;
import java.io.DataOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import org.apache.http.HttpStatus;

/* JADX INFO: loaded from: classes4.dex */
public class OpenVPNStatusService extends Service implements G.d, G.b, G.e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static c f40019d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final RemoteCallbackList f40017a = new RemoteCallbackList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final i.a f40018c = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f40020e = new b(null);

    public class a extends i.a {

        /* JADX INFO: renamed from: de.blinkt.openvpn.core.OpenVPNStatusService$a$a, reason: collision with other inner class name */
        public class C0317a extends Thread {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ ParcelFileDescriptor[] f40021a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k[] f40022c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0317a(String str, ParcelFileDescriptor[] parcelFileDescriptorArr, k[] kVarArr) {
                super(str);
                this.f40021a = parcelFileDescriptorArr;
                this.f40022c = kVarArr;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                DataOutputStream dataOutputStream = new DataOutputStream(new ParcelFileDescriptor.AutoCloseOutputStream(this.f40021a[1]));
                try {
                    Object obj = G.f39977k;
                    synchronized (obj) {
                        try {
                            if (!G.f39976j) {
                                obj.wait();
                            }
                        } finally {
                        }
                    }
                } catch (InterruptedException e9) {
                    G.r(e9);
                }
                try {
                    for (k kVar : this.f40022c) {
                        byte[] bArrC = kVar.c();
                        dataOutputStream.writeShort(bArrC.length);
                        dataOutputStream.write(bArrC);
                    }
                    dataOutputStream.writeShort(32767);
                    dataOutputStream.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
        }

        @Override // de.blinkt.openvpn.core.i
        public String B0() {
            return G.g();
        }

        @Override // de.blinkt.openvpn.core.i
        public void E0(j jVar) {
            OpenVPNStatusService.f40017a.unregister(jVar);
        }

        @Override // de.blinkt.openvpn.core.i
        public ParcelFileDescriptor K(j jVar) throws RemoteException {
            k[] kVarArrJ = G.j();
            c cVar = OpenVPNStatusService.f40019d;
            if (cVar != null) {
                OpenVPNStatusService.c(jVar, cVar);
            }
            OpenVPNStatusService.f40017a.register(jVar);
            try {
                ParcelFileDescriptor[] parcelFileDescriptorArrCreatePipe = ParcelFileDescriptor.createPipe();
                new C0317a("pushLogs", parcelFileDescriptorArrCreatePipe, kVarArrJ).start();
                return parcelFileDescriptorArrCreatePipe[0];
            } catch (IOException e9) {
                e9.printStackTrace();
                throw new RemoteException(e9.getMessage());
            }
        }

        @Override // de.blinkt.openvpn.core.i
        public E O() {
            return G.f39978l;
        }

        @Override // de.blinkt.openvpn.core.i
        public void g0(String str, int i9, String str2) {
            A.d(str, i9, str2);
        }
    }

    public static class b extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f40024a;

        public b() {
            this.f40024a = null;
        }

        public /* synthetic */ b(a aVar) {
            this();
        }

        public final void b(OpenVPNStatusService openVPNStatusService) {
            this.f40024a = new WeakReference(openVPNStatusService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            j jVar;
            WeakReference weakReference = this.f40024a;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            RemoteCallbackList remoteCallbackList = OpenVPNStatusService.f40017a;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i9 = 0; i9 < iBeginBroadcast; i9++) {
                try {
                    jVar = (j) remoteCallbackList.getBroadcastItem(i9);
                } catch (RemoteException unused) {
                }
                switch (message.what) {
                    case 100:
                        jVar.Q((k) message.obj);
                        continue;
                        break;
                    case 101:
                        OpenVPNStatusService.c(jVar, (c) message.obj);
                        continue;
                        break;
                    case HttpStatus.SC_PROCESSING /* 102 */:
                        Pair pair = (Pair) message.obj;
                        jVar.k0(((Long) pair.first).longValue(), ((Long) pair.second).longValue());
                        continue;
                        break;
                    case 103:
                        jVar.y0((String) message.obj);
                        continue;
                        break;
                    default:
                        continue;
                        break;
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f40025a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f40026b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EnumC1722e f40027c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Intent f40028d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f40029e;

        public c(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
            this.f40025a = str;
            this.f40029e = i9;
            this.f40026b = str2;
            this.f40027c = enumC1722e;
            this.f40028d = intent;
        }
    }

    public static void c(j jVar, c cVar) {
        jVar.t0(cVar.f40025a, cVar.f40026b, cVar.f40029e, cVar.f40027c, cVar.f40028d);
    }

    @Override // de.blinkt.openvpn.core.G.b
    public void E(long j9, long j10, long j11, long j12) {
        f40020e.obtainMessage(HttpStatus.SC_PROCESSING, Pair.create(Long.valueOf(j9), Long.valueOf(j10))).sendToTarget();
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void Z(String str) {
        f40020e.obtainMessage(103, str).sendToTarget();
    }

    @Override // de.blinkt.openvpn.core.G.d
    public void a(k kVar) {
        f40020e.obtainMessage(100, kVar).sendToTarget();
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        c cVar = new c(str, str2, i9, enumC1722e, intent);
        f40019d = cVar;
        f40020e.obtainMessage(101, cVar).sendToTarget();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f40018c;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        G.b(this);
        G.a(this);
        G.c(this);
        f40020e.b(this);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        G.D(this);
        G.C(this);
        G.E(this);
        f40017a.kill();
    }
}
