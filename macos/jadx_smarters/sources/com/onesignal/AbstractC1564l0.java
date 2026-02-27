package com.onesignal;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.Build;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.onesignal.F1;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.l0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1564l0 {
    public static void a(JSONArray jSONArray, String str, M1 m12) {
        Cursor cursorD = m12.d(TransferService.INTENT_KEY_NOTIFICATION, new String[]{"full_data"}, "group_id = ? AND dismissed = 0 AND opened = 0 AND is_summary = 0", new String[]{str}, null, null, null);
        if (cursorD.getCount() > 1) {
            cursorD.moveToFirst();
            do {
                try {
                    jSONArray.put(new JSONObject(cursorD.getString(cursorD.getColumnIndex("full_data"))));
                } catch (JSONException unused) {
                    F1.a(F1.v.ERROR, "Could not parse JSON of sub notification in group: " + str);
                }
            } while (cursorD.moveToNext());
        }
        cursorD.close();
    }

    public static void b(Context context, M1 m12, String str) {
        if (str != null) {
            AbstractC1576p0.a(context, m12, str);
        } else {
            if (Build.VERSION.SDK_INT < 23 || Q1.e(context).intValue() >= 1) {
                return;
            }
            Q1.i(context).cancel(Q1.f());
        }
    }

    public static void c(Context context, Intent intent) {
        if (intent.getBooleanExtra("action_button", false)) {
            D.L.d(context).b(intent.getIntExtra("androidNotificationId", 0));
            if (Build.VERSION.SDK_INT < 31) {
                context.sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
            }
        }
    }

    public static boolean d(Intent intent) {
        return intent.hasExtra("onesignalData") || intent.hasExtra("summary") || intent.hasExtra("androidNotificationId");
    }

    public static void e(Context context, Intent intent, M1 m12, boolean z9) {
        String str;
        String stringExtra = intent.getStringExtra("summary");
        String[] strArr = null;
        if (stringExtra != null) {
            boolean zEquals = stringExtra.equals(Q1.g());
            if (zEquals) {
                str = "group_id IS NULL";
            } else {
                strArr = new String[]{stringExtra};
                str = "group_id = ?";
            }
            if (!z9 && !F1.O()) {
                String strValueOf = String.valueOf(Q1.h(m12, stringExtra, zEquals));
                str = str + " AND android_notification_id = ?";
                strArr = zEquals ? new String[]{strValueOf} : new String[]{stringExtra, strValueOf};
            }
        } else {
            str = "android_notification_id = " + intent.getIntExtra("androidNotificationId", 0);
        }
        b(context, m12, stringExtra);
        m12.a(TransferService.INTENT_KEY_NOTIFICATION, f(intent), str, strArr);
        AbstractC1563l.c(m12, context);
    }

    public static ContentValues f(Intent intent) {
        ContentValues contentValues = new ContentValues();
        if (intent.getBooleanExtra("dismissed", false)) {
            contentValues.put("dismissed", (Integer) 1);
        } else {
            contentValues.put("opened", (Integer) 1);
        }
        return contentValues;
    }

    public static void g(Context context, Intent intent) {
        if (d(intent)) {
            if (context != null) {
                F1.K0(context.getApplicationContext());
            }
            c(context, intent);
            h(context, intent);
        }
    }

    public static void h(Context context, Intent intent) {
        W0 w0I;
        String stringExtra;
        M1 m1I = M1.i(context);
        String stringExtra2 = intent.getStringExtra("summary");
        boolean booleanExtra = intent.getBooleanExtra("dismissed", false);
        if (booleanExtra) {
            w0I = null;
        } else {
            w0I = i(context, intent, m1I, stringExtra2);
            if (w0I == null) {
                return;
            }
        }
        e(context, intent, m1I, booleanExtra);
        if (stringExtra2 == null && (stringExtra = intent.getStringExtra("grp")) != null) {
            AbstractC1576p0.f(context, m1I, stringExtra, booleanExtra);
        }
        F1.v vVar = F1.v.DEBUG;
        F1.c1(vVar, "processIntent from context: " + context + " and intent: " + intent);
        if (intent.getExtras() != null) {
            F1.c1(vVar, "processIntent intent extras: " + intent.getExtras().toString());
        }
        if (booleanExtra) {
            return;
        }
        if (context instanceof Activity) {
            F1.D0((Activity) context, w0I.a(), U0.b(w0I.b()));
            return;
        }
        F1.c1(F1.v.ERROR, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
    }

    public static W0 i(Context context, Intent intent, M1 m12, String str) {
        JSONObject jSONObject;
        JSONArray jSONArrayG = null;
        try {
            jSONObject = new JSONObject(intent.getStringExtra("onesignalData"));
        } catch (JSONException e9) {
            e = e9;
            jSONObject = null;
        }
        try {
            if (!(context instanceof Activity)) {
                F1.c1(F1.v.ERROR, "NotificationOpenedProcessor processIntent from an non Activity context: " + context);
            } else if (H0.b((Activity) context, jSONObject)) {
                return null;
            }
            jSONObject.put("androidNotificationId", intent.getIntExtra("androidNotificationId", 0));
            intent.putExtra("onesignalData", jSONObject.toString());
            jSONArrayG = T.g(new JSONObject(intent.getStringExtra("onesignalData")));
        } catch (JSONException e10) {
            e = e10;
            e.printStackTrace();
        }
        if (str != null) {
            a(jSONArrayG, str, m12);
        }
        return new W0(jSONArrayG, jSONObject);
    }
}
