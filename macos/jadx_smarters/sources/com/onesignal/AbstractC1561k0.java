package com.onesignal;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.service.notification.StatusBarNotification;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.onesignal.F1;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: renamed from: com.onesignal.k0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1561k0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f38750a = Integer.toString(49);

    public static void a(Context context, int i9) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                c(context, i9);
            } else {
                b(context, i9);
            }
        } catch (Throwable unused) {
            b(context, i9);
        }
    }

    public static void b(Context context, int i9) {
        M1 m1I = M1.i(context);
        Cursor cursorC = null;
        try {
            cursorC = m1I.c(TransferService.INTENT_KEY_NOTIFICATION, new String[]{"android_notification_id"}, M1.n().toString(), null, null, null, "_id", e() + i9);
            int count = (cursorC.getCount() - d()) + i9;
            if (count < 1) {
                if (cursorC.isClosed()) {
                    return;
                }
                cursorC.close();
            } else {
                while (cursorC.moveToNext()) {
                    F1.n1(cursorC.getInt(cursorC.getColumnIndex("android_notification_id")));
                    count--;
                    if (count <= 0) {
                        break;
                    }
                }
                if (cursorC.isClosed()) {
                }
            }
        } catch (Throwable th) {
            try {
                F1.b(F1.v.ERROR, "Error clearing oldest notifications over limit! ", th);
            } finally {
                if (cursorC != null && !cursorC.isClosed()) {
                    cursorC.close();
                }
            }
        }
    }

    public static void c(Context context, int i9) {
        StatusBarNotification[] statusBarNotificationArrD = Q1.d(context);
        int length = (statusBarNotificationArrD.length - d()) + i9;
        if (length < 1) {
            return;
        }
        TreeMap treeMap = new TreeMap();
        for (StatusBarNotification statusBarNotification : statusBarNotificationArrD) {
            if (!f(statusBarNotification)) {
                treeMap.put(Long.valueOf(statusBarNotification.getNotification().when), Integer.valueOf(statusBarNotification.getId()));
            }
        }
        Iterator it = treeMap.entrySet().iterator();
        while (it.hasNext()) {
            F1.n1(((Integer) ((Map.Entry) it.next()).getValue()).intValue());
            length--;
            if (length <= 0) {
                return;
            }
        }
    }

    public static int d() {
        return 49;
    }

    public static String e() {
        return f38750a;
    }

    public static boolean f(StatusBarNotification statusBarNotification) {
        return (statusBarNotification.getNotification().flags & IjkMediaMeta.FF_PROFILE_H264_CONSTRAINED) != 0;
    }
}
