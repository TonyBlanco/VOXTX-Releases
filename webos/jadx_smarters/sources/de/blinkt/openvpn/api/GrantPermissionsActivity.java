package de.blinkt.openvpn.api;

import android.app.Activity;
import android.content.Intent;
import android.net.VpnService;

/* JADX INFO: loaded from: classes4.dex */
public class GrantPermissionsActivity extends Activity {
    @Override // android.app.Activity
    public void onActivityResult(int i9, int i10, Intent intent) {
        super.onActivityResult(i9, i10, intent);
        setResult(i10);
        finish();
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        Intent intentPrepare = VpnService.prepare(this);
        if (intentPrepare == null) {
            onActivityResult(0, -1, null);
        } else {
            startActivityForResult(intentPrepare, 0);
        }
    }
}
