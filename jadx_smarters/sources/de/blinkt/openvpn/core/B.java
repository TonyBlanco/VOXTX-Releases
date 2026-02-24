package de.blinkt.openvpn.core;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public abstract class B {
    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(context.getPackageName() + "_preferences", 4);
    }

    public static SharedPreferences b(String str, Context context) {
        return context.getSharedPreferences(str, 4);
    }
}
