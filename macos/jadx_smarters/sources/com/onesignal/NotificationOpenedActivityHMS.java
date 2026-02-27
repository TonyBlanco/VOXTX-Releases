package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class NotificationOpenedActivityHMS extends Activity {
    public final void a() {
        b(getIntent());
        finish();
    }

    public final void b(Intent intent) {
        AbstractC1570n0.b(this, intent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        a();
    }
}
