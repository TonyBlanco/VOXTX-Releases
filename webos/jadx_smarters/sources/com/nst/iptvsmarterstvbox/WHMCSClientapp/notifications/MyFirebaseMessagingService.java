package com.nst.iptvsmarterstvbox.WHMCSClientapp.notifications;

import android.content.Intent;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.nst.iptvsmarterstvbox.sbpfunction.activitypushnotification.NotificationPanelActivtiy;
import java.util.Iterator;
import q6.S;

/* JADX INFO: loaded from: classes.dex */
public class MyFirebaseMessagingService extends FirebaseMessagingService {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public NotificationUtils f28602h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Intent f28603i;

    @Override // com.google.firebase.messaging.FirebaseMessagingService, q6.AbstractServiceC2590h
    public void d(Intent intent) {
        NotificationUtils notificationUtils;
        String str;
        Log.e("jaskirat", "handleIntent called");
        v(intent);
        Intent intent2 = new Intent(getApplicationContext(), (Class<?>) NotificationPanelActivtiy.class);
        intent2.putExtra("fromNotification", "fromNotification");
        intent2.setFlags(335544320);
        intent2.setAction("notification_action");
        this.f28602h = new NotificationUtils(getApplicationContext());
        if (t() != null && t().getExtras() != null) {
            Iterator<String> it = t().getExtras().keySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                String next = it.next();
                Object obj = t().getExtras().get(next);
                if (!next.equalsIgnoreCase("gcm.notification.title")) {
                    Log.e("jaskirat", "else condition");
                } else if (obj != null && obj.toString().equalsIgnoreCase("This app has been updated in the background.")) {
                    this.f28602h.q("This app has been updated in the background.", "", "", intent2, "", "");
                    return;
                }
            }
            if (intent.getExtras() != null) {
                String stringExtra = intent.hasExtra("gcm.notification.title") ? intent.getStringExtra("gcm.notification.title") : "";
                String stringExtra2 = intent.hasExtra("gcm.notification.body") ? intent.getStringExtra("gcm.notification.body") : "";
                String stringExtra3 = intent.hasExtra("gcm.notification.image") ? intent.getStringExtra("gcm.notification.image") : "";
                String stringExtra4 = intent.hasExtra("custombody") ? intent.getStringExtra("custombody") : "";
                if (stringExtra != null && stringExtra.length() > 0 && stringExtra2 != null && stringExtra2.length() > 0) {
                    if (stringExtra3 == null || stringExtra3.length() <= 0) {
                        notificationUtils = this.f28602h;
                        str = "";
                        stringExtra3 = "";
                    } else {
                        notificationUtils = this.f28602h;
                        str = "";
                    }
                    notificationUtils.q(stringExtra, stringExtra2, str, intent2, stringExtra3, stringExtra4);
                    return;
                }
            }
        }
        super.d(intent);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void o(S s9) {
        Log.e("Result<<<>>>", "From: " + s9.H());
        Intent intent = new Intent(getApplicationContext(), (Class<?>) NotificationPanelActivtiy.class);
        intent.putExtra("fromNotification", "fromNotification");
        intent.setFlags(335544320);
        intent.setAction("notification_action");
        this.f28602h = new NotificationUtils(getApplicationContext());
        Log.e("jaskirat", "noti called");
        u(s9, intent);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void q(String str) {
        super.q(str);
    }

    public Intent t() {
        return this.f28603i;
    }

    public final void u(S s9, Intent intent) {
        NotificationUtils notificationUtils;
        String string;
        String str;
        String strD;
        String strA;
        if (s9 == null || s9.I() == null) {
            if (t() == null || t().getExtras() == null) {
                return;
            }
            for (String str2 : t().getExtras().keySet()) {
                Object obj = t().getExtras().get(str2);
                Log.d("jaskirat", "Key: " + str2 + " Value: " + obj);
                if (str2.equalsIgnoreCase("gcm.notification.title")) {
                    if (obj == null || !obj.toString().equalsIgnoreCase("This app has been updated in the background.")) {
                        return;
                    }
                    notificationUtils = this.f28602h;
                    string = "";
                    str = "";
                    strD = "This app has been updated in the background.";
                    strA = "";
                }
            }
            return;
        }
        if (s9.I().b() == null) {
            this.f28602h.q(s9.I().d(), s9.I().a(), "", intent, "", "");
            return;
        }
        notificationUtils = this.f28602h;
        strD = s9.I().d();
        strA = s9.I().a();
        string = s9.I().b().toString();
        str = "";
        notificationUtils.q(strD, strA, "", intent, string, str);
    }

    public void v(Intent intent) {
        this.f28603i = intent;
    }
}
