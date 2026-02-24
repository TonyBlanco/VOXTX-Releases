package com.onesignal;

import D.AbstractC0529l;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class Q1 {
    public static boolean a(Context context, String str) {
        NotificationChannel notificationChannel;
        if (D.L.d(context).a()) {
            return Build.VERSION.SDK_INT < 26 || (notificationChannel = i(context).getNotificationChannel(str)) == null || notificationChannel.getImportance() != 0;
        }
        return false;
    }

    public static void b(Context context, ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            StatusBarNotification statusBarNotification = (StatusBarNotification) it.next();
            D.L.d(context).f(statusBarNotification.getId(), Notification.Builder.recoverBuilder(context, statusBarNotification.getNotification()).setGroup("os_group_undefined").setOnlyAlertOnce(true).build());
        }
    }

    public static ArrayList c(Context context) {
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : d(context)) {
            Notification notification = statusBarNotification.getNotification();
            boolean zF = AbstractC1561k0.f(statusBarNotification);
            boolean z9 = notification.getGroup() == null || notification.getGroup().equals(g());
            if (!zF && z9) {
                arrayList.add(statusBarNotification);
            }
        }
        return arrayList;
    }

    public static StatusBarNotification[] d(Context context) {
        StatusBarNotification[] statusBarNotificationArr = new StatusBarNotification[0];
        try {
            return i(context).getActiveNotifications();
        } catch (Throwable unused) {
            return statusBarNotificationArr;
        }
    }

    public static Integer e(Context context) {
        int i9 = 0;
        for (StatusBarNotification statusBarNotification : d(context)) {
            if (!AbstractC0529l.b(statusBarNotification.getNotification()) && "os_group_undefined".equals(statusBarNotification.getNotification().getGroup())) {
                i9++;
            }
        }
        return Integer.valueOf(i9);
    }

    public static int f() {
        return -718463522;
    }

    public static String g() {
        return "os_group_undefined";
    }

    public static Integer h(M1 m12, String str, boolean z9) {
        Cursor cursorC = m12.c(TransferService.INTENT_KEY_NOTIFICATION, null, (z9 ? "group_id IS NULL" : "group_id = ?") + " AND dismissed = 0 AND opened = 0 AND is_summary = 0", z9 ? null : new String[]{str}, null, null, "created_time DESC", "1");
        if (!cursorC.moveToFirst()) {
            cursorC.close();
            return null;
        }
        Integer numValueOf = Integer.valueOf(cursorC.getInt(cursorC.getColumnIndex("android_notification_id")));
        cursorC.close();
        return numValueOf;
    }

    public static NotificationManager i(Context context) {
        return (NotificationManager) context.getSystemService(TransferService.INTENT_KEY_NOTIFICATION);
    }
}
