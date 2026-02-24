package com.nst.iptvsmarterstvbox.miscelleneious.chromecastfeature;

import a7.f;
import a7.h;
import android.view.Menu;
import o4.AbstractC2324a;
import s4.AbstractActivityC2709a;

/* JADX INFO: loaded from: classes.dex */
public class ExpandedControlsActivity extends AbstractActivityC2709a {
    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(h.f12918a, menu);
        AbstractC2324a.a(this, menu, f.eb);
        return true;
    }
}
