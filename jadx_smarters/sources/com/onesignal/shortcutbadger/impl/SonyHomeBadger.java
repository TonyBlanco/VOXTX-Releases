package com.onesignal.shortcutbadger.impl;

import android.content.AsyncQueryHandler;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Looper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class SonyHomeBadger implements T7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f38836a = Uri.parse("content://com.sonymobile.home.resourceprovider/badge");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AsyncQueryHandler f38837b;

    public class a extends AsyncQueryHandler {
        public a(ContentResolver contentResolver) {
            super(contentResolver);
        }
    }

    private static void d(Context context, ComponentName componentName, int i9) {
        Intent intent = new Intent("com.sonyericsson.home.action.UPDATE_BADGE");
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.PACKAGE_NAME", componentName.getPackageName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.ACTIVITY_NAME", componentName.getClassName());
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.MESSAGE", String.valueOf(i9));
        intent.putExtra("com.sonyericsson.home.intent.extra.badge.SHOW_MESSAGE", i9 > 0);
        context.sendBroadcast(intent);
    }

    public static boolean h(Context context) {
        return context.getPackageManager().resolveContentProvider("com.sonymobile.home.resourceprovider", 0) != null;
    }

    @Override // T7.a
    public List a() {
        return Arrays.asList("com.sonyericsson.home", "com.sonymobile.home");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) {
        if (h(context)) {
            e(context, componentName, i9);
        } else {
            d(context, componentName, i9);
        }
    }

    public final ContentValues c(int i9, ComponentName componentName) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("badge_count", Integer.valueOf(i9));
        contentValues.put("package_name", componentName.getPackageName());
        contentValues.put("activity_name", componentName.getClassName());
        return contentValues;
    }

    public final void e(Context context, ComponentName componentName, int i9) {
        if (i9 < 0) {
            return;
        }
        ContentValues contentValuesC = c(i9, componentName);
        if (Looper.myLooper() != Looper.getMainLooper()) {
            g(context, contentValuesC);
            return;
        }
        if (this.f38837b == null) {
            this.f38837b = new a(context.getApplicationContext().getContentResolver());
        }
        f(contentValuesC);
    }

    public final void f(ContentValues contentValues) {
        this.f38837b.startInsert(0, null, this.f38836a, contentValues);
    }

    public final void g(Context context, ContentValues contentValues) {
        context.getApplicationContext().getContentResolver().insert(this.f38836a, contentValues);
    }
}
