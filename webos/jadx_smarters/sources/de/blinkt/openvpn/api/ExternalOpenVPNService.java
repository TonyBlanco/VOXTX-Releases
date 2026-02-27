package de.blinkt.openvpn.api;

import a7.j;
import android.annotation.TargetApi;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.net.VpnService;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.api.a;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.C1720c;
import de.blinkt.openvpn.core.EnumC1722e;
import de.blinkt.openvpn.core.F;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNService;
import f8.l;
import h8.C1868a;
import h8.C1869b;
import java.io.IOException;
import java.io.StringReader;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(WebSocketProtocol.B0_MASK_OPCODE)
public class ExternalOpenVPNService extends Service implements G.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final d f39927i = new d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1725h f39929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C1869b f39930d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e f39934h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final RemoteCallbackList f39928a = new RemoteCallbackList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f39931e = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public BroadcastReceiver f39932f = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a.AbstractBinderC0315a f39933g = new c();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ExternalOpenVPNService.this.f39929c = (InterfaceC1725h) iBinder;
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ExternalOpenVPNService.this.f39929c = null;
        }
    }

    public class b extends BroadcastReceiver {
        public b() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"android.intent.action.UNINSTALL_PACKAGE".equals(intent.getAction())) {
                return;
            }
            l lVarI = C.i();
            if (C.l() && intent.getPackage().equals(lVarI.f40901i0) && ExternalOpenVPNService.this.f39929c != null) {
                try {
                    ExternalOpenVPNService.this.f39929c.a(false);
                } catch (RemoteException e9) {
                    e9.printStackTrace();
                }
            }
        }
    }

    public class c extends a.AbstractBinderC0315a {
        public c() {
        }

        public final void A(l lVar) {
            Intent intentPrepare = VpnService.prepare(ExternalOpenVPNService.this);
            int iH = lVar.H(null, null);
            if (intentPrepare == null && iH == 0) {
                F.f(lVar, ExternalOpenVPNService.this.getBaseContext());
                return;
            }
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.setClass(ExternalOpenVPNService.this.getBaseContext(), LaunchVPN.class);
            intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", lVar.B());
            intent.putExtra("de.blinkt.openvpn.showNoLogWindow", true);
            intent.addFlags(268435456);
            ExternalOpenVPNService.this.startActivity(intent);
        }

        @Override // de.blinkt.openvpn.api.a
        public Intent D() {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            if (VpnService.prepare(ExternalOpenVPNService.this) == null) {
                return null;
            }
            return new Intent(ExternalOpenVPNService.this.getBaseContext(), (Class<?>) GrantPermissionsActivity.class);
        }

        @Override // de.blinkt.openvpn.api.a
        public void F0(String str) {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            C.g(ExternalOpenVPNService.this.getBaseContext()).n(ExternalOpenVPNService.this, C.c(ExternalOpenVPNService.this.getBaseContext(), str));
        }

        @Override // de.blinkt.openvpn.api.a
        public boolean L(String str, String str2) {
            return t(str, true, str2) != null;
        }

        @Override // de.blinkt.openvpn.api.a
        public boolean O0(ParcelFileDescriptor parcelFileDescriptor) throws RemoteException {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            try {
                boolean zProtect = ExternalOpenVPNService.this.f39929c.protect(parcelFileDescriptor.getFd());
                parcelFileDescriptor.close();
                return zProtect;
            } catch (IOException e9) {
                throw new RemoteException(e9.getMessage());
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public void R(de.blinkt.openvpn.api.b bVar) {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            if (bVar != null) {
                bVar.U(ExternalOpenVPNService.this.f39934h.f39942d, ExternalOpenVPNService.this.f39934h.f39939a, ExternalOpenVPNService.this.f39934h.f39940b, ExternalOpenVPNService.this.f39934h.f39941c.name());
                ExternalOpenVPNService.this.f39928a.register(bVar);
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public Intent Y0(String str) {
            if (new C1869b(ExternalOpenVPNService.this).f(str)) {
                return null;
            }
            Intent intent = new Intent();
            intent.setClass(ExternalOpenVPNService.this, ConfirmDialog.class);
            return intent;
        }

        @Override // de.blinkt.openvpn.api.a
        public void disconnect() {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            if (ExternalOpenVPNService.this.f39929c != null) {
                ExternalOpenVPNService.this.f39929c.a(false);
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public void k(String str) throws RemoteException {
            q0(str, null);
        }

        @Override // de.blinkt.openvpn.api.a
        public void pause() {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            if (ExternalOpenVPNService.this.f39929c != null) {
                ExternalOpenVPNService.this.f39929c.T(true);
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public void q0(String str, Bundle bundle) throws RemoteException {
            String strB = ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            C1720c c1720c = new C1720c();
            try {
                c1720c.n(new StringReader(str));
                l lVarF = c1720c.f();
                lVarF.f40891d = "Remote APP VPN";
                if (lVarF.c(ExternalOpenVPNService.this.getApplicationContext()) != j.f13291j4) {
                    ExternalOpenVPNService externalOpenVPNService = ExternalOpenVPNService.this;
                    throw new RemoteException(externalOpenVPNService.getString(lVarF.c(externalOpenVPNService.getApplicationContext())));
                }
                lVarF.f40901i0 = strB;
                if (bundle != null) {
                    lVarF.f40897g0 = bundle.getBoolean("de.blinkt.openvpn.api.ALLOW_VPN_BYPASS", false);
                }
                C.t(ExternalOpenVPNService.this, lVarF);
                A(lVarF);
            } catch (C1720c.a e9) {
                e = e9;
                throw new RemoteException(e.getMessage());
            } catch (IOException e10) {
                e = e10;
                throw new RemoteException(e.getMessage());
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public List r0() {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            C cG = C.g(ExternalOpenVPNService.this.getBaseContext());
            LinkedList linkedList = new LinkedList();
            for (l lVar : cG.k()) {
                if (!lVar.f40889a) {
                    linkedList.add(new C1868a(lVar.B(), lVar.f40891d, lVar.f40880R, lVar.f40901i0));
                }
            }
            return linkedList;
        }

        @Override // de.blinkt.openvpn.api.a
        public void resume() {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            if (ExternalOpenVPNService.this.f39929c != null) {
                ExternalOpenVPNService.this.f39929c.T(false);
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public C1868a t(String str, boolean z9, String str2) {
            String strB = ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            C1720c c1720c = new C1720c();
            try {
                c1720c.n(new StringReader(str2));
                l lVarF = c1720c.f();
                lVarF.f40891d = str;
                lVarF.f40901i0 = strB;
                lVarF.f40880R = z9;
                C cG = C.g(ExternalOpenVPNService.this.getBaseContext());
                cG.a(lVarF);
                cG.o(ExternalOpenVPNService.this, lVarF);
                cG.q(ExternalOpenVPNService.this);
                return new C1868a(lVarF.B(), lVarF.f40891d, lVarF.f40880R, lVarF.f40901i0);
            } catch (C1720c.a e9) {
                G.r(e9);
                return null;
            } catch (IOException e10) {
                G.r(e10);
                return null;
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public void u(String str) throws RemoteException {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            l lVarC = C.c(ExternalOpenVPNService.this.getBaseContext(), str);
            if (lVarC.c(ExternalOpenVPNService.this.getApplicationContext()) == j.f13291j4) {
                A(lVarC);
            } else {
                ExternalOpenVPNService externalOpenVPNService = ExternalOpenVPNService.this;
                throw new RemoteException(externalOpenVPNService.getString(lVarC.c(externalOpenVPNService.getApplicationContext())));
            }
        }

        @Override // de.blinkt.openvpn.api.a
        public void w(de.blinkt.openvpn.api.b bVar) {
            ExternalOpenVPNService.this.f39930d.b(ExternalOpenVPNService.this.getPackageManager());
            if (bVar != null) {
                ExternalOpenVPNService.this.f39928a.unregister(bVar);
            }
        }
    }

    public static class d extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public WeakReference f39938a = null;

        public final void b(de.blinkt.openvpn.api.b bVar, e eVar) {
            bVar.U(eVar.f39942d, eVar.f39939a, eVar.f39940b, eVar.f39941c.name());
        }

        public final void c(ExternalOpenVPNService externalOpenVPNService) {
            this.f39938a = new WeakReference(externalOpenVPNService);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference weakReference;
            if (message.what != 0 || (weakReference = this.f39938a) == null || weakReference.get() == null) {
                return;
            }
            RemoteCallbackList remoteCallbackList = ((ExternalOpenVPNService) this.f39938a.get()).f39928a;
            int iBeginBroadcast = remoteCallbackList.beginBroadcast();
            for (int i9 = 0; i9 < iBeginBroadcast; i9++) {
                try {
                    b((de.blinkt.openvpn.api.b) remoteCallbackList.getBroadcastItem(i9), (e) message.obj);
                } catch (RemoteException unused) {
                }
            }
            remoteCallbackList.finishBroadcast();
        }
    }

    public class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f39939a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f39940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public EnumC1722e f39941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f39942d;

        public e(String str, String str2, EnumC1722e enumC1722e) {
            this.f39939a = str;
            this.f39940b = str2;
            this.f39941c = enumC1722e;
        }
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void Z(String str) {
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        this.f39934h = new e(str, str2, enumC1722e);
        if (C.i() != null) {
            this.f39934h.f39942d = C.i().B();
        }
        f39927i.obtainMessage(0, this.f39934h).sendToTarget();
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f39933g;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        G.c(this);
        this.f39930d = new C1869b(this);
        Intent intent = new Intent(getBaseContext(), (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f39931e, 1);
        f39927i.c(this);
        registerReceiver(this.f39932f, new IntentFilter("android.intent.action.PACKAGE_REMOVED"));
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f39928a.kill();
        unbindService(this.f39931e);
        G.E(this);
        unregisterReceiver(this.f39932f);
    }
}
