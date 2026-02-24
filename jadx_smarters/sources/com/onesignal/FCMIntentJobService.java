package com.onesignal;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import com.onesignal.T;

/* JADX INFO: loaded from: classes4.dex */
public class FCMIntentJobService extends JobIntentService {

    public class a implements T.e {
        public a() {
        }

        @Override // com.onesignal.T.e
        public void a(T.f fVar) {
        }
    }

    public static void j(Context context, Intent intent) {
        JobIntentService.d(context, FCMIntentJobService.class, 123890, intent, false);
    }

    @Override // com.onesignal.JobIntentService
    public void g(Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null) {
            return;
        }
        F1.K0(this);
        T.h(this, extras, new a());
    }

    @Override // com.onesignal.JobIntentService
    public /* bridge */ /* synthetic */ boolean h() {
        return super.h();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ IBinder onBind(Intent intent) {
        return super.onBind(intent);
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.onesignal.JobIntentService, android.app.Service
    public /* bridge */ /* synthetic */ int onStartCommand(Intent intent, int i9, int i10) {
        return super.onStartCommand(intent, i9, i10);
    }
}
