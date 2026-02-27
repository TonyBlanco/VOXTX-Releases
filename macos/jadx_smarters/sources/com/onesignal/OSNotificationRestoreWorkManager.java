package com.onesignal;

import Q0.m;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.onesignal.F1;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OSNotificationRestoreWorkManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String[] f38417a = {"notification_id", "android_notification_id", "full_data", "created_time"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f38418b = NotificationRestoreWorker.class.getCanonicalName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f38419c;

    public static class NotificationRestoreWorker extends Worker {
        public NotificationRestoreWorker(Context context, WorkerParameters workerParameters) {
            super(context, workerParameters);
        }

        @Override // androidx.work.Worker
        public ListenableWorker.a r() {
            Context contextA = a();
            if (F1.f38270b == null) {
                F1.K0(contextA);
            }
            if (OSUtils.a(contextA) && !OSNotificationRestoreWorkManager.f38419c) {
                OSNotificationRestoreWorkManager.f38419c = true;
                F1.a(F1.v.INFO, "Restoring notifications");
                M1 m1I = M1.i(contextA);
                StringBuilder sbN = M1.n();
                OSNotificationRestoreWorkManager.f(contextA, sbN);
                OSNotificationRestoreWorkManager.d(contextA, m1I, sbN);
                return ListenableWorker.a.c();
            }
            return ListenableWorker.a.a();
        }
    }

    public static void c(Context context, boolean z9) {
        E1.a(context).d(f38418b, Q0.d.KEEP, (Q0.m) ((m.a) new m.a(NotificationRestoreWorker.class).f(z9 ? 15 : 0, TimeUnit.SECONDS)).b());
    }

    public static void d(Context context, M1 m12, StringBuilder sb) {
        F1.a(F1.v.INFO, "Querying DB for notifications to restore: " + sb.toString());
        Cursor cursorC = null;
        try {
            cursorC = m12.c(TransferService.INTENT_KEY_NOTIFICATION, f38417a, sb.toString(), null, null, null, "_id DESC", AbstractC1561k0.f38750a);
            e(context, cursorC, 200);
            AbstractC1563l.c(m12, context);
        } catch (Throwable th) {
            try {
                F1.b(F1.v.ERROR, "Error restoring notification records! ", th);
                if (cursorC == null || cursorC.isClosed()) {
                    return;
                }
            } finally {
                if (cursorC != null && !cursorC.isClosed()) {
                    cursorC.close();
                }
            }
        }
    }

    public static void e(Context context, Cursor cursor, int i9) {
        if (cursor.moveToFirst()) {
            do {
                OSNotificationWorkManager.b(context, cursor.getString(cursor.getColumnIndex("notification_id")), cursor.getInt(cursor.getColumnIndex("android_notification_id")), cursor.getString(cursor.getColumnIndex("full_data")), cursor.getLong(cursor.getColumnIndex("created_time")), true, false);
                if (i9 > 0) {
                    OSUtils.V(i9);
                }
            } while (cursor.moveToNext());
        }
    }

    public static void f(Context context, StringBuilder sb) {
        if (Build.VERSION.SDK_INT < 23) {
            return;
        }
        StatusBarNotification[] statusBarNotificationArrD = Q1.d(context);
        if (statusBarNotificationArrD.length == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrD) {
            arrayList.add(Integer.valueOf(statusBarNotification.getId()));
        }
        sb.append(" AND android_notification_id NOT IN (");
        sb.append(TextUtils.join(",", arrayList));
        sb.append(")");
    }
}
