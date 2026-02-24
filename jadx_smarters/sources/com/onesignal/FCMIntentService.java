package com.onesignal;

import android.app.IntentService;
import android.content.Intent;
import android.os.Bundle;
import com.onesignal.T;
import k0.AbstractC2131a;

/* JADX INFO: loaded from: classes4.dex */
public class FCMIntentService extends IntentService {

    public class a implements T.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Intent f38325a;

        public a(Intent intent) {
            this.f38325a = intent;
        }

        @Override // com.onesignal.T.e
        public void a(T.f fVar) {
            AbstractC2131a.b(this.f38325a);
        }
    }

    public FCMIntentService() {
        super("FCMIntentService");
        setIntentRedelivery(true);
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        F1.K0(this);
        T.h(this, extras, new a(intent));
    }
}
