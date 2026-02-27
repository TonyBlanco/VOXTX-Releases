package com.amplifyframework.devmenu;

import android.os.Bundle;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC1145e;
import androidx.navigation.NavController;
import androidx.navigation.r;
import com.amplifyframework.core.R;
import com.amplifyframework.devmenu.DeveloperMenu;
import x0.AbstractC2947c;
import x0.C2946b;

/* JADX INFO: loaded from: classes.dex */
public final class DeveloperMenuActivity extends AbstractActivityC1145e {
    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, D.AbstractActivityC0525h, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_dev_menu);
        findViewById(R.id.dev_layout).setFocusable(true);
        NavController navControllerA = r.a(this, R.id.nav_host_fragment);
        AbstractC2947c.d((Toolbar) findViewById(R.id.toolbar), navControllerA, new C2946b.C0477b(navControllerA.j()).a());
        DeveloperMenu.singletonInstance(getApplicationContext()).setOnHideAction(new DeveloperMenu.HideAction() { // from class: com.amplifyframework.devmenu.h
            @Override // com.amplifyframework.devmenu.DeveloperMenu.HideAction
            public final void hideDeveloperMenu() {
                this.f18403a.finish();
            }
        });
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(true);
        super.onStart();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        DeveloperMenu.singletonInstance(getApplicationContext()).setVisible(false);
        super.onStop();
    }
}
