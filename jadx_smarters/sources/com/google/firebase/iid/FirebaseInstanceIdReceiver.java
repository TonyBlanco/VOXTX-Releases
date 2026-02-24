package com.google.firebase.iid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import q6.C2596n;
import q6.H;
import v4.AbstractC2878b;
import v4.C2877a;

/* JADX INFO: loaded from: classes3.dex */
public final class FirebaseInstanceIdReceiver extends AbstractC2878b {
    @Override // v4.AbstractC2878b
    public final int b(Context context, C2877a c2877a) {
        try {
            return ((Integer) Tasks.await(new C2596n(context).g(c2877a.H()))).intValue();
        } catch (InterruptedException | ExecutionException e9) {
            Log.e("FirebaseMessaging", "Failed to send message to service.", e9);
            return 500;
        }
    }

    @Override // v4.AbstractC2878b
    public final void c(Context context, Bundle bundle) {
        Intent intentPutExtras = new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS").putExtras(bundle);
        if (H.A(intentPutExtras)) {
            H.s(intentPutExtras);
        }
    }
}
