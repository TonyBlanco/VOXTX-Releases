package com.google.ads.interactivemedia.v3.impl.data;

import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.google.ads.interactivemedia.v3.internal.agn;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i {
    public static float b(View view) {
        return view.getZ();
    }

    public static String c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static void d(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void e(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void f(String str, Exception exc) {
        if (agn.f19693a.booleanValue()) {
            TextUtils.isEmpty(str);
        }
        Log.e("OMIDLIB", str, exc);
    }
}
