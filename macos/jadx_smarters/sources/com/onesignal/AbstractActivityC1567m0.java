package com.onesignal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.onesignal.m0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractActivityC1567m0 extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractC1564l0.g(this, getIntent());
        finish();
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        kotlin.jvm.internal.l.e(intent, "intent");
        super.onNewIntent(intent);
        AbstractC1564l0.g(this, getIntent());
        finish();
    }
}
