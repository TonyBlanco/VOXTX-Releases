package com.nst.iptvsmarterstvbox.vpn;

import G7.a;
import a7.f;
import a7.g;
import android.os.Bundle;
import android.view.MenuItem;

/* JADX INFO: loaded from: classes4.dex */
public class LogWindow extends a {
    @Override // G7.a, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(g.f12636F3);
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(f.f12463m2, new K7.a()).commit();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        return super.onOptionsItemSelected(menuItem);
    }
}
