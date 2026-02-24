package com.onesignal;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.onesignal.F1;

/* JADX INFO: renamed from: com.onesignal.l, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC1563l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static int f38762a = -1;

    public static boolean a(Context context) {
        int i9 = f38762a;
        if (i9 != -1) {
            return i9 == 1;
        }
        ApplicationInfo applicationInfoA = AbstractC1557j.f38736a.a(context);
        if (applicationInfoA == null) {
            f38762a = 0;
            F1.a(F1.v.ERROR, "Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.");
            return false;
        }
        Bundle bundle = applicationInfoA.metaData;
        if (bundle != null) {
            f38762a = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
        } else {
            f38762a = 1;
        }
        return f38762a == 1;
    }

    public static boolean b(Context context) {
        return a(context) && OSUtils.a(context);
    }

    public static void c(L1 l12, Context context) {
        if (b(context)) {
            if (Build.VERSION.SDK_INT >= 23) {
                f(context);
            } else {
                e(l12, context);
            }
        }
    }

    public static void d(int i9, Context context) {
        if (a(context)) {
            try {
                T7.c.a(context, i9);
            } catch (T7.b unused) {
            }
        }
    }

    public static void e(L1 l12, Context context) {
        Cursor cursorC = l12.c(TransferService.INTENT_KEY_NOTIFICATION, null, M1.n().toString(), null, null, null, null, AbstractC1561k0.f38750a);
        int count = cursorC.getCount();
        cursorC.close();
        d(count, context);
    }

    public static void f(Context context) {
        int i9 = 0;
        for (StatusBarNotification statusBarNotification : Q1.d(context)) {
            if (!AbstractC1561k0.f(statusBarNotification)) {
                i9++;
            }
        }
        d(i9, context);
    }
}
