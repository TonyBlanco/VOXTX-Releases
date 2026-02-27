package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class T0 extends AbstractC1579q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M1 f38574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final P0 f38575b;

    public class a extends AbstractRunnableC1560k {
        public a() {
        }

        @Override // com.onesignal.AbstractRunnableC1560k, java.lang.Runnable
        public void run() {
            super.run();
            T0.this.f38574a.e(TransferService.INTENT_KEY_NOTIFICATION, "created_time < ?", new String[]{String.valueOf((F1.v0().a() / 1000) - 604800)});
        }
    }

    public class b extends AbstractRunnableC1560k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ WeakReference f38577a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f38578c;

        public b(WeakReference weakReference, int i9) {
            this.f38577a = weakReference;
            this.f38578c = i9;
        }

        @Override // com.onesignal.AbstractRunnableC1560k, java.lang.Runnable
        public void run() {
            super.run();
            Context context = (Context) this.f38577a.get();
            if (context == null) {
                return;
            }
            String str = "android_notification_id = " + this.f38578c + " AND opened = 0 AND dismissed = 0";
            ContentValues contentValues = new ContentValues();
            contentValues.put("dismissed", (Integer) 1);
            if (T0.this.f38574a.a(TransferService.INTENT_KEY_NOTIFICATION, contentValues, str, null) > 0) {
                AbstractC1576p0.e(context, T0.this.f38574a, this.f38578c);
            }
            AbstractC1563l.c(T0.this.f38574a, context);
            Q1.i(context).cancel(this.f38578c);
        }
    }

    public class c extends AbstractRunnableC1560k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f38580a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ d f38581c;

        public c(String str, d dVar) {
            this.f38580a = str;
            this.f38581c = dVar;
        }

        @Override // com.onesignal.AbstractRunnableC1560k, java.lang.Runnable
        public void run() {
            boolean z9;
            super.run();
            Cursor cursorD = T0.this.f38574a.d(TransferService.INTENT_KEY_NOTIFICATION, new String[]{"notification_id"}, "notification_id = ?", new String[]{this.f38580a}, null, null, null);
            boolean zMoveToFirst = cursorD.moveToFirst();
            cursorD.close();
            if (zMoveToFirst) {
                T0.this.f38575b.debug("Notification notValidOrDuplicated with id duplicated, duplicate FCM message received, skip processing of " + this.f38580a);
                z9 = true;
            } else {
                z9 = false;
            }
            this.f38581c.a(z9);
        }
    }

    public interface d {
        void a(boolean z9);
    }

    public T0(M1 m12, P0 p02) {
        this.f38574a = m12;
        this.f38575b = p02;
    }

    public final void g() {
        d(new a(), "OS_NOTIFICATIONS_THREAD");
    }

    public void h() {
        g();
    }

    public final void i(String str, d dVar) {
        if (str == null || "".equals(str)) {
            dVar.a(false);
        } else if (OSNotificationWorkManager.a(str)) {
            d(new c(str, dVar), "OS_NOTIFICATIONS_THREAD");
        } else {
            this.f38575b.debug("Notification notValidOrDuplicated with id duplicated");
            dVar.a(true);
        }
    }

    public void j(JSONObject jSONObject, d dVar) {
        String strB = U0.b(jSONObject);
        if (strB != null) {
            i(strB, dVar);
        } else {
            this.f38575b.debug("Notification notValidOrDuplicated with id null");
            dVar.a(true);
        }
    }

    public void k(int i9, WeakReference weakReference) {
        d(new b(weakReference, i9), "OS_NOTIFICATIONS_THREAD");
    }
}
