package com.onesignal;

import Q0.m;
import android.content.Context;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.b;
import com.onesignal.F1;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OSNotificationWorkManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Set f38420a = OSUtils.K();

    public static class NotificationWorker extends Worker {
        public NotificationWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public ListenableWorker.a r() {
            androidx.work.b bVarG = g();
            try {
                F1.c1(F1.v.DEBUG, "NotificationWorker running doWork with data: " + bVarG);
                s(a(), bVarG.i("android_notif_id", 0), new JSONObject(bVarG.l("json_payload")), bVarG.h("is_restoring", false), Long.valueOf(bVarG.k("timestamp", System.currentTimeMillis() / 1000)));
                return ListenableWorker.a.c();
            } catch (JSONException e9) {
                F1.c1(F1.v.ERROR, "Error occurred doing work for job with id: " + e().toString());
                e9.printStackTrace();
                return ListenableWorker.a.a();
            }
        }

        public final void s(Context context, int i9, JSONObject jSONObject, boolean z9, Long l9) {
            Q0 q02 = new Q0(null, jSONObject, i9);
            C1532a1 c1532a1 = new C1532a1(new S0(context, q02, jSONObject, z9, true, l9), q02);
            List list = F1.f38268a;
            F1.a(F1.v.WARN, "remoteNotificationReceivedHandler not setup, displaying normal OneSignal notification");
            c1532a1.b(q02);
        }
    }

    public static boolean a(String str) {
        if (!OSUtils.I(str)) {
            return true;
        }
        if (!f38420a.contains(str)) {
            f38420a.add(str);
            return true;
        }
        F1.a(F1.v.DEBUG, "OSNotificationWorkManager notification with notificationId: " + str + " already queued");
        return false;
    }

    public static void b(Context context, String str, int i9, String str2, long j9, boolean z9, boolean z10) {
        Q0.m mVar = (Q0.m) ((m.a) new m.a(NotificationWorker.class).g(new b.a().f("android_notif_id", i9).h("json_payload", str2).g("timestamp", j9).e("is_restoring", z9).a())).b();
        F1.a(F1.v.DEBUG, "OSNotificationWorkManager enqueueing notification work with notificationId: " + str + " and jsonPayload: " + str2);
        E1.a(context).d(str, Q0.d.KEEP, mVar);
    }

    public static void c(String str) {
        if (OSUtils.I(str)) {
            f38420a.remove(str);
        }
    }
}
