package com.onesignal;

import android.content.Context;
import com.amazon.device.messaging.ADM;
import com.onesignal.F1;
import com.onesignal.Y1;

/* JADX INFO: loaded from: classes4.dex */
public class Z1 implements Y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Y1.a f38635a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f38636b;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f38637a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y1.a f38638c;

        public a(Context context, Y1.a aVar) {
            this.f38637a = context;
            this.f38638c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ADM adm = new ADM(this.f38637a);
            String registrationId = adm.getRegistrationId();
            if (registrationId == null) {
                adm.startRegister();
            } else {
                F1.a(F1.v.DEBUG, "ADM Already registered with ID:" + registrationId);
                this.f38638c.a(registrationId, 1);
            }
            try {
                Thread.sleep(30000L);
            } catch (InterruptedException unused) {
            }
            if (Z1.f38636b) {
                return;
            }
            F1.a(F1.v.ERROR, "com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.");
            Z1.c(null);
        }
    }

    public static void c(String str) {
        Y1.a aVar = f38635a;
        if (aVar == null) {
            return;
        }
        f38636b = true;
        aVar.a(str, 1);
    }

    @Override // com.onesignal.Y1
    public void a(Context context, String str, Y1.a aVar) {
        f38635a = aVar;
        new Thread(new a(context, aVar)).start();
    }
}
