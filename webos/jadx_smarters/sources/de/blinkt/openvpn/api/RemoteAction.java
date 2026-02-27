package de.blinkt.openvpn.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Toast;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNService;
import f8.l;
import h8.C1869b;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteAction extends Activity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public C1869b f39944a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1725h f39945c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ServiceConnection f39946d = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            RemoteAction.this.f39945c = InterfaceC1725h.a.A(iBinder);
            try {
                RemoteAction.this.c();
            } catch (RemoteException e9) {
                e9.printStackTrace();
            }
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }
    }

    public final void c() {
        if (!this.f39945c.s(getCallingPackage())) {
            finish();
            return;
        }
        Intent intent = getIntent();
        setIntent(null);
        ComponentName component = intent.getComponent();
        if (component.getShortClassName().equals(".api.DisconnectVPN")) {
            this.f39945c.a(false);
        } else if (component.getShortClassName().equals(".api.ConnectVPN")) {
            String stringExtra = intent.getStringExtra("de.blinkt.openvpn.api.profileName");
            l lVarJ = C.g(this).j(stringExtra);
            if (lVarJ == null) {
                Toast.makeText(this, String.format("Vpn profile %s from API call not found", stringExtra), 1).show();
            } else {
                Intent intent2 = new Intent(this, (Class<?>) LaunchVPN.class);
                intent2.putExtra("de.blinkt.openvpn.shortcutProfileUUID", lVarJ.A().toString());
                intent2.setAction("android.intent.action.MAIN");
                startActivity(intent2);
            }
        }
        finish();
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.f39945c != null) {
            this.f39945c = null;
            getApplicationContext().unbindService(this.f39946d);
        }
        super.finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f39944a = new C1869b(this);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        getApplicationContext().bindService(intent, this.f39946d, 1);
    }
}
