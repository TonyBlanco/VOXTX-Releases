package de.blinkt.openvpn.api;

import android.app.Activity;
import android.content.ComponentName;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import android.widget.Button;
import android.widget.CompoundButton;
import de.blinkt.openvpn.core.InterfaceC1725h;
import de.blinkt.openvpn.core.OpenVPNService;

/* JADX INFO: loaded from: classes4.dex */
public class ConfirmDialog extends Activity implements CompoundButton.OnCheckedChangeListener, DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f39922a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Button f39923c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public InterfaceC1725h f39924d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ServiceConnection f39925e = new a();

    public class a implements ServiceConnection {
        public a() {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            ConfirmDialog.this.f39924d = InterfaceC1725h.a.A(iBinder);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
            ConfirmDialog.this.f39924d = null;
        }
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        setResult(0);
        finish();
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public void onCheckedChanged(CompoundButton compoundButton, boolean z9) {
        this.f39923c.setEnabled(z9);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i9) {
        if (i9 == -1) {
            try {
                this.f39924d.H0(this.f39922a);
                setResult(-1);
                finish();
            } catch (RemoteException e9) {
                e9.printStackTrace();
                throw new RuntimeException(e9);
            }
        }
        if (i9 == -2) {
            setResult(0);
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        unbindService(this.f39925e);
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        Intent intent = new Intent(this, (Class<?>) OpenVPNService.class);
        intent.setAction("de.blinkt.openvpn.START_SERVICE");
        bindService(intent, this.f39925e, 1);
        Intent intent2 = getIntent();
        if (intent2.getStringExtra("android.intent.extra.PACKAGE_NAME") != null) {
            this.f39922a = intent2.getStringExtra("android.intent.extra.PACKAGE_NAME");
            return;
        }
        String callingPackage = getCallingPackage();
        this.f39922a = callingPackage;
        if (callingPackage == null) {
            finish();
        }
    }
}
