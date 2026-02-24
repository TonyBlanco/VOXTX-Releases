package com.onesignal;

import android.app.NotificationManager;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.onesignal.F1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.p0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1576p0 {
    public static void a(Context context, M1 m12, String str) {
        Integer numB = b(m12, str);
        boolean zEquals = str.equals(Q1.g());
        NotificationManager notificationManagerI = Q1.i(context);
        Integer numH = Q1.h(m12, str, zEquals);
        if (numH != null) {
            if (!F1.O()) {
                F1.n1(numH.intValue());
                return;
            }
            if (zEquals) {
                numB = Integer.valueOf(Q1.f());
            }
            if (numB != null) {
                notificationManagerI.cancel(numB.intValue());
            }
        }
    }

    public static Integer b(L1 l12, String str) {
        Integer num;
        Cursor cursorD;
        Cursor cursor = null;
        try {
            cursorD = l12.d(TransferService.INTENT_KEY_NOTIFICATION, new String[]{"android_notification_id"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 1", new String[]{str}, null, null, null);
        } catch (Throwable th) {
            th = th;
            num = null;
        }
        try {
            if (!cursorD.moveToFirst()) {
                cursorD.close();
                if (!cursorD.isClosed()) {
                    cursorD.close();
                }
                return null;
            }
            Integer numValueOf = Integer.valueOf(cursorD.getInt(cursorD.getColumnIndex("android_notification_id")));
            cursorD.close();
            if (cursorD.isClosed()) {
                return numValueOf;
            }
            cursorD.close();
            return numValueOf;
        } catch (Throwable th2) {
            th = th2;
            cursor = cursorD;
            num = null;
            try {
                F1.b(F1.v.ERROR, "Error getting android notification id for summary notification group: " + str, th);
                return num;
            } finally {
                if (cursor != null && !cursor.isClosed()) {
                    cursor.close();
                }
            }
        }
    }

    public static Cursor c(Context context, L1 l12, String str, boolean z9) {
        Cursor cursorD = l12.d(TransferService.INTENT_KEY_NOTIFICATION, new String[]{"android_notification_id", "created_time", "full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null, null, "_id DESC");
        int count = cursorD.getCount();
        if (count == 0 && !str.equals(Q1.g())) {
            cursorD.close();
            Integer numB = b(l12, str);
            if (numB == null) {
                return cursorD;
            }
            Q1.i(context).cancel(numB.intValue());
            ContentValues contentValues = new ContentValues();
            contentValues.put(z9 ? "dismissed" : "opened", (Integer) 1);
            l12.a(TransferService.INTENT_KEY_NOTIFICATION, contentValues, "android_notification_id = " + numB, null);
            return cursorD;
        }
        if (count == 1) {
            cursorD.close();
            if (b(l12, str) == null) {
                return cursorD;
            }
            d(context, str);
            return cursorD;
        }
        try {
            cursorD.moveToFirst();
            Long lValueOf = Long.valueOf(cursorD.getLong(cursorD.getColumnIndex("created_time")));
            String string = cursorD.getString(cursorD.getColumnIndex("full_data"));
            cursorD.close();
            if (b(l12, str) == null) {
                return cursorD;
            }
            V0 v02 = new V0(context);
            v02.y(true);
            v02.z(lValueOf);
            v02.q(new JSONObject(string));
            AbstractC1598x.N(v02);
        } catch (JSONException e9) {
            e9.printStackTrace();
        }
        return cursorD;
    }

    public static void d(Context context, String str) {
        String[] strArr = {str};
        Cursor cursorD = null;
        try {
            cursorD = M1.i(context).d(TransferService.INTENT_KEY_NOTIFICATION, OSNotificationRestoreWorkManager.f38417a, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", strArr, null, null, null);
            OSNotificationRestoreWorkManager.e(context, cursorD, 0);
        } catch (Throwable th) {
            try {
                F1.b(F1.v.ERROR, "Error restoring notification records! ", th);
                if (cursorD == null || cursorD.isClosed()) {
                    return;
                }
            } finally {
                if (cursorD != null && !cursorD.isClosed()) {
                    cursorD.close();
                }
            }
        }
    }

    public static void e(Context context, L1 l12, int i9) {
        Cursor cursorD = l12.d(TransferService.INTENT_KEY_NOTIFICATION, new String[]{"group_id"}, "android_notification_id = " + i9, null, null, null, null);
        if (!cursorD.moveToFirst()) {
            cursorD.close();
            return;
        }
        String string = cursorD.getString(cursorD.getColumnIndex("group_id"));
        cursorD.close();
        if (string != null) {
            f(context, l12, string, true);
        }
    }

    public static void f(Context context, L1 l12, String str, boolean z9) {
        try {
            Cursor cursorC = c(context, l12, str, z9);
            if (cursorC == null || cursorC.isClosed()) {
                return;
            }
            cursorC.close();
        } catch (Throwable th) {
            F1.b(F1.v.ERROR, "Error running updateSummaryNotificationAfterChildRemoved!", th);
        }
    }
}
