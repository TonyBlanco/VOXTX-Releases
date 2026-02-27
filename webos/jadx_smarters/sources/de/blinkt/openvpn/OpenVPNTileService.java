package de.blinkt.openvpn;

import a7.j;
import android.annotation.TargetApi;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.service.quicksettings.Tile;
import android.service.quicksettings.TileService;
import android.widget.Toast;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.EnumC1722e;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNService;
import f8.l;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes4.dex */
@TargetApi(DateTimeConstants.HOURS_PER_DAY)
public class OpenVPNTileService extends TileService implements G.e {

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l f39919a;

        public a(l lVar) {
            this.f39919a = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            OpenVPNTileService.this.b(this.f39919a);
        }
    }

    public class b implements ServiceConnection {
        public b() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            InterfaceC1725h interfaceC1725hA = InterfaceC1725h.a.A(iBinder);
            if (interfaceC1725hA != null) {
                try {
                    interfaceC1725hA.a(false);
                } catch (RemoteException e9) {
                    G.r(e9);
                }
            }
            OpenVPNTileService.this.unbindService(this);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void Z(String str) {
    }

    public final void b(l lVar) {
        if (!G.k()) {
            d(lVar, this);
            return;
        }
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, new b(), 1);
    }

    public l c() {
        return C.f(this);
    }

    @Override // de.blinkt.openvpn.core.G.e
    public void c0(String str, String str2, int i9, EnumC1722e enumC1722e, Intent intent) {
        try {
            Tile qsTile = getQsTile();
            if (enumC1722e == EnumC1722e.LEVEL_AUTH_FAILED || enumC1722e == EnumC1722e.LEVEL_NOTCONNECTED) {
                l lVarC = c();
                if (lVarC == null) {
                    qsTile.setLabel(getString(j.f13048K4));
                    qsTile.setState(0);
                } else {
                    qsTile.setLabel(getString(j.f13059L5, lVarC.u()));
                    qsTile.setState(1);
                }
            } else {
                l lVarC2 = C.c(getBaseContext(), G.g());
                qsTile.setLabel(getString(j.f13069M5, lVarC2 == null ? "null?!" : lVarC2.u()));
                qsTile.setState(2);
            }
            qsTile.updateTile();
        } catch (Exception unused) {
        }
    }

    public void d(l lVar, Context context) {
        Intent intent = new Intent("android.intent.action.MAIN");
        intent.setClass(context, LaunchVPN.class);
        intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", lVar.B());
        intent.setFlags(268435456);
        intent.putExtra("de.blinkt.openvpn.showNoLogWindow", true);
        context.startActivity(intent);
    }

    @Override // android.service.quicksettings.TileService
    public void onClick() {
        super.onClick();
        l lVarC = c();
        if (lVarC == null) {
            Toast.makeText(this, j.f13048K4, 0).show();
        } else if (isLocked()) {
            unlockAndRun(new a(lVarC));
        } else {
            b(lVarC);
        }
    }

    @Override // android.service.quicksettings.TileService
    public void onStartListening() {
        super.onStartListening();
        G.c(this);
    }

    @Override // android.service.quicksettings.TileService
    public void onStopListening() {
        G.E(this);
        super.onStopListening();
    }

    @Override // android.service.quicksettings.TileService
    public void onTileAdded() {
    }
}
