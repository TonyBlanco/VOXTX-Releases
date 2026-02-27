package com.onesignal;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.aaid.HmsInstanceId;
import com.huawei.hms.common.ApiException;
import com.onesignal.F1;
import com.onesignal.Y1;

/* JADX INFO: loaded from: classes4.dex */
public class c2 implements Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f38687a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Y1.a f38688b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38689a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y1.a f38690c;

        public a(Context context, Y1.a aVar) {
            this.f38689a = context;
            this.f38690c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                c2.this.d(this.f38689a, this.f38690c);
            } catch (ApiException e9) {
                F1.b(F1.v.ERROR, "HMS ApiException getting Huawei push token!", e9);
                this.f38690c.a(null, e9.getStatusCode() == 907135000 ? -26 : -27);
            }
        }
    }

    public static void c() {
        try {
            Thread.sleep(30000L);
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.onesignal.Y1
    public void a(Context context, String str, Y1.a aVar) {
        f38688b = aVar;
        new Thread(new a(context, aVar), "OS_HMS_GET_TOKEN").start();
    }

    public final synchronized void d(Context context, Y1.a aVar) {
        if (!OSUtils.p()) {
            aVar.a(null, -28);
            return;
        }
        String token = HmsInstanceId.getInstance(context).getToken(AGConnectServicesConfig.fromContext(context).getString("client/app_id"), "HCM");
        if (TextUtils.isEmpty(token)) {
            e(aVar);
        } else {
            F1.a(F1.v.INFO, "Device registered for HMS, push token = " + token);
            aVar.a(token, 1);
        }
    }

    public final void e(Y1.a aVar) {
        c();
        if (f38687a) {
            return;
        }
        F1.a(F1.v.ERROR, "HmsMessageServiceOneSignal.onNewToken timed out.");
        aVar.a(null, -25);
    }
}
