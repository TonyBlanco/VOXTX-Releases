package com.onesignal;

import Q0.b;
import Q0.m;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.onesignal.F1;
import com.onesignal.T1;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class OSReceiveReceiptController {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static OSReceiveReceiptController f38421d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38422a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38423b = 25;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1553h1 f38424c = F1.j0();

    public static class ReceiveReceiptWorker extends Worker {

        public class a extends T1.g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f38425a;

            public a(String str) {
                this.f38425a = str;
            }

            @Override // com.onesignal.T1.g
            public void a(int i9, String str, Throwable th) {
                F1.a(F1.v.ERROR, "Receive receipt failed with statusCode: " + i9 + " response: " + str);
            }

            @Override // com.onesignal.T1.g
            public void b(String str) {
                F1.a(F1.v.DEBUG, "Receive receipt sent for notificationID: " + this.f38425a);
            }
        }

        public ReceiveReceiptWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public ListenableWorker.a r() {
            s(g().l("os_notification_id"));
            return ListenableWorker.a.c();
        }

        public void s(String str) {
            Integer numValueOf;
            String str2 = F1.f38274d;
            String strN0 = (str2 == null || str2.isEmpty()) ? F1.n0() : F1.f38274d;
            String strY0 = F1.y0();
            C1550g1 c1550g1 = new C1550g1();
            try {
                numValueOf = Integer.valueOf(new OSUtils().e());
            } catch (NullPointerException e9) {
                e9.printStackTrace();
                numValueOf = null;
            }
            Integer num = numValueOf;
            F1.a(F1.v.DEBUG, "ReceiveReceiptWorker: Device Type is: " + num);
            c1550g1.a(strN0, strY0, num, str, new a(str));
        }
    }

    public static synchronized OSReceiveReceiptController c() {
        try {
            if (f38421d == null) {
                f38421d = new OSReceiveReceiptController();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f38421d;
    }

    public void a(Context context, String str) {
        if (!this.f38424c.j()) {
            F1.a(F1.v.DEBUG, "sendReceiveReceipt disabled");
            return;
        }
        int iJ = OSUtils.j(this.f38422a, this.f38423b);
        Q0.m mVar = (Q0.m) ((m.a) ((m.a) ((m.a) new m.a(ReceiveReceiptWorker.class).e(b())).f(iJ, TimeUnit.SECONDS)).g(new b.a().h("os_notification_id", str).a())).b();
        F1.a(F1.v.DEBUG, "OSReceiveReceiptController enqueueing send receive receipt work with notificationId: " + str + " and delay: " + iJ + " seconds");
        Q0.u uVarA = E1.a(context);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_receive_receipt");
        uVarA.d(sb.toString(), Q0.d.KEEP, mVar);
    }

    public Q0.b b() {
        return new b.a().b(Q0.l.CONNECTED).a();
    }
}
