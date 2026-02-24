package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SharedPreferences f27951a;

    public static class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final long f27952d = TimeUnit.DAYS.toMillis(7);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f27953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f27954b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f27955c;

        public a(String str, String str2, long j9) {
            this.f27953a = str;
            this.f27954b = str2;
            this.f27955c = j9;
        }

        public static String a(String str, String str2, long j9) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT, str);
                jSONObject.put("appVersion", str2);
                jSONObject.put("timestamp", j9);
                return jSONObject.toString();
            } catch (JSONException e9) {
                Log.w("FirebaseMessaging", "Failed to encode token: ".concat(e9.toString()));
                return null;
            }
        }

        public static a c(String str) {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            if (!str.startsWith("{")) {
                return new a(str, null, 0L);
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new a(jSONObject.getString(ClientConstants.DOMAIN_PATH_TOKEN_ENDPOINT), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e9) {
                Log.w("FirebaseMessaging", "Failed to parse token: ".concat(e9.toString()));
                return null;
            }
        }

        public boolean b(String str) {
            return System.currentTimeMillis() > this.f27955c + f27952d || !str.equals(this.f27954b);
        }
    }

    public b(Context context) {
        this.f27951a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        a(context, "com.google.android.gms.appid-no-backup");
    }

    public final void a(Context context, String str) {
        File file = new File(E.b.getNoBackupFilesDir(context), "com.google.android.gms.appid-no-backup");
        if (file.exists()) {
            return;
        }
        try {
            if (!file.createNewFile() || e()) {
                return;
            }
            Log.i("FirebaseMessaging", "App restored, clearing state");
            c();
        } catch (IOException e9) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                String strValueOf = String.valueOf(e9.getMessage());
                Log.d("FirebaseMessaging", strValueOf.length() != 0 ? "Error creating file in no backup dir: ".concat(strValueOf) : new String("Error creating file in no backup dir: "));
            }
        }
    }

    public final String b(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public synchronized void c() {
        this.f27951a.edit().clear().commit();
    }

    public synchronized a d(String str, String str2) {
        return a.c(this.f27951a.getString(b(str, str2), null));
    }

    public synchronized boolean e() {
        return this.f27951a.getAll().isEmpty();
    }

    public synchronized void f(String str, String str2, String str3, String str4) {
        String strA = a.a(str3, str4, System.currentTimeMillis());
        if (strA == null) {
            return;
        }
        SharedPreferences.Editor editorEdit = this.f27951a.edit();
        editorEdit.putString(b(str, str2), strA);
        editorEdit.commit();
    }
}
