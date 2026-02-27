package com.nst.iptvsmarterstvbox.vpn;

import a7.g;
import a7.j;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.amazonaws.mobile.auth.userpools.CognitoUserPoolsSignInProvider;
import de.blinkt.openvpn.LaunchVPN;
import de.blinkt.openvpn.core.C;
import de.blinkt.openvpn.core.G;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNService;
import m7.AbstractC2237a;

/* JADX INFO: loaded from: classes4.dex */
public class DisconnectVPN extends Activity implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public InterfaceC1725h f37855a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Context f37856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ServiceConnection f37857d = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            DisconnectVPN.this.f37855a = InterfaceC1725h.a.A(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            DisconnectVPN.this.f37855a = null;
        }
    }

    public final void b() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(j.f13168W7);
        builder.setMessage(j.f13237e0);
        builder.setNegativeButton(R.string.cancel, this);
        builder.setPositiveButton(j.f13227d0, this);
        builder.setNeutralButton(j.f13166W5, this);
        builder.setOnCancelListener(this);
        builder.show();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        finish();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i9) {
        if (i9 == -1) {
            C.s(this);
            InterfaceC1725h interfaceC1725h = this.f37855a;
            if (interfaceC1725h != null) {
                try {
                    interfaceC1725h.a(false);
                } catch (RemoteException e9) {
                    G.r(e9);
                }
            }
        } else if (i9 == -3) {
            Intent intent = new Intent(this, (Class<?>) LaunchVPN.class);
            intent.putExtra("de.blinkt.openvpn.shortcutProfileUUID", G.g());
            intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.USERNAME, AbstractC2237a.f44503g0);
            intent.putExtra(CognitoUserPoolsSignInProvider.AttributeKeys.PASSWORD, AbstractC2237a.f44506h0);
            intent.setAction("android.intent.action.MAIN");
            startActivity(intent);
        }
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12739W4);
        this.f37856c = this;
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f37857d);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f37857d, 1);
        b();
    }
}
