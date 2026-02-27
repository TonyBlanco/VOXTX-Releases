package com.onesignal;

import D.AbstractC0529l;
import android.R;
import android.app.Notification;
import android.app.PendingIntent;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.widget.RemoteViews;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.amazonaws.services.s3.internal.Constants;
import com.facebook.ads.AdError;
import com.onesignal.F1;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.net.URL;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import org.achartengine.ChartFactory;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: com.onesignal.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1598x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Class f38948a = NotificationOpenedReceiver.class;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f38949b = NotificationDismissReceiver.class;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Resources f38950c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Context f38951d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static String f38952e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Integer f38953f;

    /* JADX INFO: renamed from: com.onesignal.x$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC0529l.e f38954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f38955b;

        public b() {
        }
    }

    public static int A(String str) {
        if (str == null) {
            return 0;
        }
        String strTrim = str.trim();
        if (!OSUtils.J(strTrim)) {
            return 0;
        }
        int iW = w(strTrim);
        if (iW != 0) {
            return iW;
        }
        try {
            return R.drawable.class.getField(str).getInt(null);
        } catch (Throwable unused) {
            return 0;
        }
    }

    public static int B(JSONObject jSONObject) {
        int iA = A(jSONObject.optString("sicon", null));
        return iA != 0 ? iA : v();
    }

    public static CharSequence C(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(ChartFactory.TITLE, null);
        return strOptString != null ? strOptString : p();
    }

    public static void D() {
        f38953f = Integer.valueOf(Build.VERSION.SDK_INT >= 24 ? 2 : 1);
    }

    public static void E() {
        if (OSUtils.H()) {
            throw new C1585s1("Process for showing a notification should never been done on Main Thread!");
        }
    }

    public static boolean F(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("sound", null);
        return (Constants.NULL_VERSION_ID.equals(strOptString) || "nil".equals(strOptString)) ? false : true;
    }

    public static void G(AbstractC0529l.e eVar) {
        eVar.z(true).o(0).E(null).H(null).G(null);
    }

    public static Bitmap H(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int dimension = (int) f38950c.getDimension(R.dimen.notification_large_icon_height);
            int dimension2 = (int) f38950c.getDimension(R.dimen.notification_large_icon_width);
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (width <= dimension2 && height <= dimension) {
                return bitmap;
            }
            if (height > width) {
                dimension2 = (int) (dimension * (width / height));
            } else if (width > height) {
                dimension = (int) (dimension2 * (height / width));
            }
            return Bitmap.createScaledBitmap(bitmap, dimension2, dimension, true);
        } catch (Throwable unused) {
            return bitmap;
        }
    }

    public static Integer I(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        try {
            if (jSONObject.has(str)) {
                return Integer.valueOf(new BigInteger(jSONObject.optString(str), 16).intValue());
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static void J(JSONObject jSONObject, AbstractC0529l.e eVar) {
        int iE = e(jSONObject.optInt("pri", 6));
        eVar.A(iE);
        if (iE < 0) {
            return;
        }
        int i9 = 4;
        if (jSONObject.has("ledc") && jSONObject.optInt("led", 1) == 1) {
            try {
                eVar.v(new BigInteger(jSONObject.optString("ledc"), 16).intValue(), AdError.SERVER_ERROR_CODE, 5000);
                i9 = 0;
            } catch (Throwable unused) {
            }
        }
        if (jSONObject.optInt("vib", 1) == 1) {
            if (jSONObject.has("vib_pt")) {
                long[] jArrQ = OSUtils.Q(jSONObject);
                if (jArrQ != null) {
                    eVar.H(jArrQ);
                }
            } else {
                i9 |= 2;
            }
        }
        if (F(jSONObject)) {
            Uri uriN = OSUtils.n(f38951d, jSONObject.optString("sound", null));
            if (uriN != null) {
                eVar.E(uriN);
            } else {
                i9 |= 1;
            }
        }
        eVar.o(i9);
    }

    public static void K(Context context) {
        f38951d = context;
        f38952e = context.getPackageName();
        f38950c = f38951d.getResources();
    }

    public static void L(RemoteViews remoteViews, JSONObject jSONObject, int i9, String str, String str2) {
        int iB;
        Integer numI = I(jSONObject, str);
        if (numI != null) {
            iB = numI.intValue();
        } else {
            int identifier = f38950c.getIdentifier(str2, "color", f38952e);
            if (identifier == 0) {
                return;
            } else {
                iB = AbstractC1551h.b(f38951d, identifier);
            }
        }
        remoteViews.setTextColor(i9, iB);
    }

    public static boolean M(V0 v02) throws Throwable {
        Notification notificationH;
        int iIntValue = v02.a().intValue();
        JSONObject jSONObjectE = v02.e();
        String strOptString = jSONObjectE.optString("grp", null);
        G g9 = new G(f38951d);
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList = Q1.c(f38951d);
            if (strOptString == null && arrayList.size() >= 3) {
                strOptString = Q1.g();
                Q1.b(f38951d, arrayList);
            }
        }
        b bVarQ = q(v02);
        AbstractC0529l.e eVar = bVarQ.f38954a;
        b(jSONObjectE, g9, eVar, iIntValue, null);
        try {
            a(jSONObjectE, eVar);
        } catch (Throwable th) {
            F1.b(F1.v.ERROR, "Could not set background notification image!", th);
        }
        d(v02, eVar);
        if (v02.n()) {
            G(eVar);
        }
        AbstractC1561k0.a(f38951d, strOptString != null ? 2 : 1);
        if (strOptString != null) {
            g(eVar, g9, jSONObjectE, strOptString, iIntValue);
            notificationH = j(v02, eVar);
            if (Build.VERSION.SDK_INT < 24 || !strOptString.equals(Q1.g())) {
                l(v02, bVarQ);
            } else {
                i(v02, g9, arrayList.size() + 1);
            }
        } else {
            notificationH = h(eVar, g9, jSONObjectE, iIntValue);
        }
        c(bVarQ, notificationH);
        D.L.d(f38951d).f(iIntValue, notificationH);
        if (Build.VERSION.SDK_INT >= 26) {
            return Q1.a(f38951d, notificationH.getChannelId());
        }
        return true;
    }

    public static void N(V0 v02) {
        K(v02.d());
        l(v02, null);
    }

    public static void a(JSONObject jSONObject, AbstractC0529l.e eVar) throws JSONException {
        Bitmap bitmapS;
        JSONObject jSONObject2;
        String string;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 31) {
            F1.a(F1.v.VERBOSE, "Cannot use background images in notifications for device on version: " + i9);
            return;
        }
        String strOptString = jSONObject.optString("bg_img", null);
        if (strOptString != null) {
            jSONObject2 = new JSONObject(strOptString);
            bitmapS = r(jSONObject2.optString("img", null));
        } else {
            bitmapS = null;
            jSONObject2 = null;
        }
        if (bitmapS == null) {
            bitmapS = s("onesignal_bgimage_default_image");
        }
        if (bitmapS != null) {
            RemoteViews remoteViews = new RemoteViews(f38951d.getPackageName(), f2.f38721a);
            remoteViews.setTextViewText(e2.f38718e, C(jSONObject));
            remoteViews.setTextViewText(e2.f38717d, jSONObject.optString("alert"));
            L(remoteViews, jSONObject2, e2.f38718e, "tc", "onesignal_bgimage_notif_title_color");
            L(remoteViews, jSONObject2, e2.f38717d, "bc", "onesignal_bgimage_notif_body_color");
            if (jSONObject2 == null || !jSONObject2.has("img_align")) {
                int identifier = f38950c.getIdentifier("onesignal_bgimage_notif_image_align", "string", f38952e);
                string = identifier != 0 ? f38950c.getString(identifier) : null;
            } else {
                string = jSONObject2.getString("img_align");
            }
            if ("right".equals(string)) {
                remoteViews.setViewPadding(e2.f38715b, -5000, 0, 0, 0);
                remoteViews.setImageViewBitmap(e2.f38716c, bitmapS);
                remoteViews.setViewVisibility(e2.f38716c, 0);
                remoteViews.setViewVisibility(e2.f38714a, 2);
            } else {
                remoteViews.setImageViewBitmap(e2.f38714a, bitmapS);
            }
            eVar.k(remoteViews);
            eVar.F(null);
        }
    }

    public static void b(JSONObject jSONObject, G g9, AbstractC0529l.e eVar, int i9, String str) {
        try {
            JSONObject jSONObject2 = new JSONObject(jSONObject.optString("custom"));
            if (jSONObject2.has("a")) {
                JSONObject jSONObject3 = jSONObject2.getJSONObject("a");
                if (jSONObject3.has("actionButtons")) {
                    JSONArray jSONArray = jSONObject3.getJSONArray("actionButtons");
                    for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                        JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                        JSONObject jSONObject4 = new JSONObject(jSONObject.toString());
                        Intent intentB = g9.b(i9);
                        intentB.setAction("" + i10);
                        intentB.putExtra("action_button", true);
                        jSONObject4.put("actionId", jSONObjectOptJSONObject.optString(Name.MARK));
                        intentB.putExtra("onesignalData", jSONObject4.toString());
                        if (str != null) {
                            intentB.putExtra("summary", str);
                        } else if (jSONObject.has("grp")) {
                            intentB.putExtra("grp", jSONObject.optString("grp"));
                        }
                        eVar.a(jSONObjectOptJSONObject.has("icon") ? A(jSONObjectOptJSONObject.optString("icon")) : 0, jSONObjectOptJSONObject.optString("text"), g9.a(i9, intentB));
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static void c(b bVar, Notification notification) {
        if (bVar.f38955b) {
            try {
                Object objNewInstance = Class.forName("android.app.MiuiNotification").newInstance();
                Field declaredField = objNewInstance.getClass().getDeclaredField("customizedIcon");
                declaredField.setAccessible(true);
                declaredField.set(objNewInstance, Boolean.TRUE);
                Field field = notification.getClass().getField("extraNotification");
                field.setAccessible(true);
                field.set(notification, objNewInstance);
            } catch (Throwable unused) {
            }
        }
    }

    public static void d(V0 v02, AbstractC0529l.e eVar) {
        if (v02.l()) {
            try {
                Field declaredField = AbstractC0529l.e.class.getDeclaredField("R");
                declaredField.setAccessible(true);
                Notification notification = (Notification) declaredField.get(eVar);
                v02.s(Integer.valueOf(notification.flags));
                v02.t(notification.sound);
                v02.f().f();
                eVar.d(null);
                Notification notification2 = (Notification) declaredField.get(eVar);
                Field declaredField2 = AbstractC0529l.e.class.getDeclaredField("f");
                declaredField2.setAccessible(true);
                CharSequence charSequence = (CharSequence) declaredField2.get(eVar);
                Field declaredField3 = AbstractC0529l.e.class.getDeclaredField("e");
                declaredField3.setAccessible(true);
                CharSequence charSequence2 = (CharSequence) declaredField3.get(eVar);
                v02.u(charSequence);
                v02.x(charSequence2);
                if (v02.n()) {
                    return;
                }
                v02.v(Integer.valueOf(notification2.flags));
                v02.w(notification2.sound);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static int e(int i9) {
        if (i9 > 9) {
            return 2;
        }
        if (i9 > 7) {
            return 1;
        }
        if (i9 > 4) {
            return 0;
        }
        return i9 > 2 ? -1 : -2;
    }

    public static Intent f(int i9, G g9, JSONObject jSONObject, String str) {
        return g9.b(i9).putExtra("onesignalData", jSONObject.toString()).putExtra("summary", str);
    }

    public static void g(AbstractC0529l.e eVar, G g9, JSONObject jSONObject, String str, int i9) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.l(g9.a(secureRandom.nextInt(), g9.b(i9).putExtra("onesignalData", jSONObject.toString()).putExtra("grp", str)));
        eVar.p(z(secureRandom.nextInt(), y(i9).putExtra("grp", str)));
        eVar.r(str);
        try {
            eVar.s(f38953f.intValue());
        } catch (Throwable unused) {
        }
    }

    public static Notification h(AbstractC0529l.e eVar, G g9, JSONObject jSONObject, int i9) {
        SecureRandom secureRandom = new SecureRandom();
        eVar.l(g9.a(secureRandom.nextInt(), g9.b(i9).putExtra("onesignalData", jSONObject.toString())));
        eVar.p(z(secureRandom.nextInt(), y(i9)));
        return eVar.c();
    }

    public static void i(V0 v02, G g9, int i9) {
        JSONObject jSONObjectE = v02.e();
        SecureRandom secureRandom = new SecureRandom();
        String strG = Q1.g();
        String str = i9 + " new messages";
        int iF = Q1.f();
        k(M1.i(f38951d), strG, iF);
        PendingIntent pendingIntentA = g9.a(secureRandom.nextInt(), f(iF, g9, jSONObjectE, strG));
        PendingIntent pendingIntentZ = z(secureRandom.nextInt(), y(0).putExtra("summary", strG));
        AbstractC0529l.e eVar = q(v02).f38954a;
        if (v02.i() != null) {
            eVar.E(v02.i());
        }
        if (v02.h() != null) {
            eVar.o(v02.h().intValue());
        }
        eVar.l(pendingIntentA).p(pendingIntentZ).n(p()).m(str).x(i9).D(v()).u(u()).z(true).h(false).r(strG).t(true);
        try {
            eVar.s(f38953f.intValue());
        } catch (Throwable unused) {
        }
        AbstractC0529l.g gVar = new AbstractC0529l.g();
        gVar.i(str);
        eVar.F(gVar);
        D.L.d(f38951d).f(iF, eVar.c());
    }

    public static Notification j(V0 v02, AbstractC0529l.e eVar) {
        boolean z9 = Build.VERSION.SDK_INT < 24 && !v02.n();
        if (z9 && v02.i() != null && !v02.i().equals(v02.g())) {
            eVar.E(null);
        }
        Notification notificationC = eVar.c();
        if (z9) {
            eVar.E(v02.i());
        }
        return notificationC;
    }

    public static void k(M1 m12, String str, int i9) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("android_notification_id", Integer.valueOf(i9));
        contentValues.put("group_id", str);
        contentValues.put("is_summary", (Integer) 1);
        m12.l(TransferService.INTENT_KEY_NOTIFICATION, null, contentValues);
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0293  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void l(com.onesignal.V0 r24, com.onesignal.AbstractC1598x.b r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.AbstractC1598x.l(com.onesignal.V0, com.onesignal.x$b):void");
    }

    public static boolean m(V0 v02) {
        K(v02.d());
        return M(v02);
    }

    public static boolean n(V0 v02) {
        K(v02.d());
        E();
        D();
        return M(v02);
    }

    public static BigInteger o(JSONObject jSONObject) {
        try {
            if (jSONObject.has("bgac")) {
                return new BigInteger(jSONObject.optString("bgac", null), 16);
            }
        } catch (Throwable unused) {
        }
        try {
            String strK = OSUtils.k(F1.f38270b, "onesignal_notification_accent_color", null);
            if (strK != null) {
                return new BigInteger(strK, 16);
            }
        } catch (Throwable unused2) {
        }
        try {
            String strF = OSUtils.f(F1.f38270b, "com.onesignal.NotificationAccentColor.DEFAULT");
            if (strF != null) {
                return new BigInteger(strF, 16);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static CharSequence p() {
        ApplicationInfo applicationInfoA = AbstractC1557j.f38736a.a(f38951d);
        return applicationInfoA == null ? "" : f38951d.getPackageManager().getApplicationLabel(applicationInfoA);
    }

    public static b q(V0 v02) {
        AbstractC0529l.e eVar;
        JSONObject jSONObjectE = v02.e();
        b bVar = new b();
        try {
            eVar = new AbstractC0529l.e(f38951d, AbstractC1558j0.c(v02));
        } catch (Throwable unused) {
            eVar = new AbstractC0529l.e(f38951d);
        }
        String strOptString = jSONObjectE.optString("alert", null);
        eVar.h(true).D(B(jSONObjectE)).F(new AbstractC0529l.c().h(strOptString)).m(strOptString).G(strOptString);
        if (Build.VERSION.SDK_INT < 24 || !jSONObjectE.optString(ChartFactory.TITLE).equals("")) {
            eVar.n(C(jSONObjectE));
        }
        try {
            BigInteger bigIntegerO = o(jSONObjectE);
            if (bigIntegerO != null) {
                eVar.j(bigIntegerO.intValue());
            }
        } catch (Throwable unused2) {
        }
        try {
            eVar.I(jSONObjectE.has("vis") ? Integer.parseInt(jSONObjectE.optString("vis")) : 1);
        } catch (Throwable unused3) {
        }
        Bitmap bitmapX = x(jSONObjectE);
        if (bitmapX != null) {
            bVar.f38955b = true;
            eVar.u(bitmapX);
        }
        Bitmap bitmapR = r(jSONObjectE.optString("bicon", null));
        if (bitmapR != null) {
            eVar.F(new AbstractC0529l.b().i(bitmapR).j(strOptString));
        }
        if (v02.j() != null) {
            try {
                eVar.J(v02.j().longValue() * 1000);
            } catch (Throwable unused4) {
            }
        }
        J(jSONObjectE, eVar);
        bVar.f38954a = eVar;
        return bVar;
    }

    public static Bitmap r(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        return (strTrim.startsWith("http://") || strTrim.startsWith("https://")) ? t(strTrim) : s(str);
    }

    public static Bitmap s(String str) {
        Bitmap bitmapDecodeStream;
        try {
            bitmapDecodeStream = BitmapFactory.decodeStream(f38951d.getAssets().open(str));
        } catch (Throwable unused) {
            bitmapDecodeStream = null;
        }
        if (bitmapDecodeStream != null) {
            return bitmapDecodeStream;
        }
        try {
            for (String str2 : Arrays.asList(".png", ".webp", ".jpg", ".gif", ".bmp")) {
                try {
                    bitmapDecodeStream = BitmapFactory.decodeStream(f38951d.getAssets().open(str + str2));
                } catch (Throwable unused2) {
                }
                if (bitmapDecodeStream != null) {
                    return bitmapDecodeStream;
                }
            }
            int iA = A(str);
            if (iA != 0) {
                return BitmapFactory.decodeResource(f38950c, iA);
            }
        } catch (Throwable unused3) {
        }
        return null;
    }

    public static Bitmap t(String str) {
        try {
            return BitmapFactory.decodeStream(new URL(str).openConnection().getInputStream());
        } catch (Throwable th) {
            F1.b(F1.v.WARN, "Could not download image!", th);
            return null;
        }
    }

    public static Bitmap u() {
        return H(s("ic_onesignal_large_icon_default"));
    }

    public static int v() {
        int iW = w("ic_stat_onesignal_default");
        if (iW != 0) {
            return iW;
        }
        int iW2 = w("corona_statusbar_icon_default");
        if (iW2 != 0) {
            return iW2;
        }
        int iW3 = w("ic_os_notification_fallback_white_24dp");
        return iW3 != 0 ? iW3 : R.drawable.ic_popup_reminder;
    }

    public static int w(String str) {
        return f38950c.getIdentifier(str, "drawable", f38952e);
    }

    public static Bitmap x(JSONObject jSONObject) {
        Bitmap bitmapR = r(jSONObject.optString("licon"));
        if (bitmapR == null) {
            bitmapR = s("ic_onesignal_large_icon_default");
        }
        if (bitmapR == null) {
            return null;
        }
        return H(bitmapR);
    }

    public static Intent y(int i9) {
        return new Intent(f38951d, (Class<?>) f38949b).putExtra("androidNotificationId", i9).putExtra("dismissed", true);
    }

    public static PendingIntent z(int i9, Intent intent) {
        return PendingIntent.getBroadcast(f38951d, i9, intent, 201326592);
    }
}
