package b7;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SharedPreferences f17713a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences.Editor f17714b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f17715c = "";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f17716d = Boolean.FALSE;

    public static String a(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("url", "");
        f17715c = string;
        return string.toLowerCase();
    }

    public static String b(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("notificationkey", "");
        f17715c = string;
        return string;
    }

    public static String c(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("key", "");
        f17715c = string;
        return string;
    }

    public static String d(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        String string = defaultSharedPreferences.getString("salt", "");
        f17715c = string;
        return string;
    }

    public static void e(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f17714b = editorEdit;
        editorEdit.putString("url", str);
        f17714b.commit();
    }

    public static void f(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f17714b = editorEdit;
        editorEdit.putString("notificationkey", str);
        f17714b.commit();
    }

    public static void g(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f17714b = editorEdit;
        editorEdit.putString("key", str);
        f17714b.commit();
    }

    public static void h(Context context, String str) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context);
        f17713a = defaultSharedPreferences;
        SharedPreferences.Editor editorEdit = defaultSharedPreferences.edit();
        f17714b = editorEdit;
        editorEdit.putString("salt", str);
        f17714b.commit();
    }
}
