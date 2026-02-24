package com.onesignal;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import com.onesignal.F1;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.j0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1558j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f38738a = Pattern.compile("^([A-Fa-f0-9]{8})$");

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(android.content.Context r7, android.app.NotificationManager r8, org.json.JSONObject r9) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC1558j0.a(android.content.Context, android.app.NotificationManager, org.json.JSONObject):java.lang.String");
    }

    public static String b(NotificationManager notificationManager) {
        NotificationChannel notificationChannelA = com.amplifyframework.storage.s3.service.b.a("fcm_fallback_notification_channel", "Miscellaneous", 3);
        notificationChannelA.enableLights(true);
        notificationChannelA.enableVibration(true);
        notificationManager.createNotificationChannel(notificationChannelA);
        return "fcm_fallback_notification_channel";
    }

    public static String c(V0 v02) {
        if (Build.VERSION.SDK_INT < 26) {
            return "fcm_fallback_notification_channel";
        }
        Context contextD = v02.d();
        JSONObject jSONObjectE = v02.e();
        NotificationManager notificationManagerI = Q1.i(contextD);
        if (v02.n()) {
            return d(notificationManagerI);
        }
        if (jSONObjectE.has("oth_chnl")) {
            String strOptString = jSONObjectE.optString("oth_chnl");
            if (notificationManagerI.getNotificationChannel(strOptString) != null) {
                return strOptString;
            }
        }
        if (!jSONObjectE.has("chnl")) {
            return b(notificationManagerI);
        }
        try {
            return a(contextD, notificationManagerI, jSONObjectE);
        } catch (JSONException e9) {
            F1.b(F1.v.ERROR, "Could not create notification channel due to JSON payload error!", e9);
            return "fcm_fallback_notification_channel";
        }
    }

    public static String d(NotificationManager notificationManager) {
        notificationManager.createNotificationChannel(com.amplifyframework.storage.s3.service.b.a("restored_OS_notifications", "Restored", 2));
        return "restored_OS_notifications";
    }

    public static List e(NotificationManager notificationManager) {
        try {
            return notificationManager.getNotificationChannels();
        } catch (NullPointerException e9) {
            F1.c1(F1.v.ERROR, "Error when trying to delete notification channel: " + e9.getMessage());
            return null;
        } catch (RuntimeException e10) {
            if (AbstractC1554i.a(e10.getCause())) {
                return null;
            }
            throw e10;
        }
    }

    public static int f(int i9) {
        if (i9 > 9) {
            return 5;
        }
        if (i9 > 7) {
            return 4;
        }
        if (i9 > 5) {
            return 3;
        }
        if (i9 > 3) {
            return 2;
        }
        return i9 > 1 ? 1 : 0;
    }

    public static void g(Context context, JSONArray jSONArray) {
        List listE;
        if (Build.VERSION.SDK_INT < 26 || jSONArray == null || jSONArray.length() == 0) {
            return;
        }
        NotificationManager notificationManagerI = Q1.i(context);
        HashSet hashSet = new HashSet();
        int length = jSONArray.length();
        for (int i9 = 0; i9 < length; i9++) {
            try {
                hashSet.add(a(context, notificationManagerI, jSONArray.getJSONObject(i9)));
            } catch (JSONException e9) {
                F1.b(F1.v.ERROR, "Could not create notification channel due to JSON payload error!", e9);
            }
        }
        if (hashSet.isEmpty() || (listE = e(notificationManagerI)) == null) {
            return;
        }
        Iterator it = listE.iterator();
        while (it.hasNext()) {
            String id = U.a(it.next()).getId();
            if (id.startsWith("OS_") && !hashSet.contains(id)) {
                notificationManagerI.deleteNotificationChannel(id);
            }
        }
    }
}
