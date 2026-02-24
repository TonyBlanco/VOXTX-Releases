package com.nst.iptvsmarterstvbox.WHMCSClientapp.Clientdatabase;

import android.content.Context;
import android.content.SharedPreferences;
import com.amazonaws.mobileconnectors.cognitoauth.util.ClientConstants;
import org.joda.time.DateTimeConstants;

/* JADX INFO: loaded from: classes.dex */
public class ClientSharepreferenceHandler {
    public static int a(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getInt(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, -1);
    }

    public static int b(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getInt("freetrailtime", DateTimeConstants.SECONDS_PER_DAY);
    }

    public static String c(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("email", "abc@gmail.com");
    }

    public static String d(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("prefix", "$");
    }

    public static String e(Context context) {
        return context.getSharedPreferences("sharedPreference", 0).getString("Suffix", "USD");
    }

    public static void f(int i9, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sharedPreference", 0).edit();
        editorEdit.putInt(ClientConstants.DOMAIN_QUERY_PARAM_CLIENT_ID, i9);
        editorEdit.apply();
    }

    public static void g(int i9, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sharedPreference", 0).edit();
        editorEdit.putInt("freetrailtime", i9);
        editorEdit.apply();
    }

    public static void h(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sharedPreference", 0).edit();
        editorEdit.putString("isfreetrial", str);
        editorEdit.apply();
    }

    public static void i(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sharedPreference", 0).edit();
        editorEdit.putString("email", str);
        editorEdit.apply();
    }

    public static void j(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sharedPreference", 0).edit();
        editorEdit.putString("prefix", str);
        editorEdit.apply();
    }

    public static void k(String str, Context context) {
        SharedPreferences.Editor editorEdit = context.getSharedPreferences("sharedPreference", 0).edit();
        editorEdit.putString("Suffix", str);
        editorEdit.apply();
    }
}
