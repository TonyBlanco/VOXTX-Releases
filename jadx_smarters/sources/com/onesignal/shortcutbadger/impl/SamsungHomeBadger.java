package com.onesignal.shortcutbadger.impl;

import T7.a;
import T7.b;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import java.util.Arrays;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes4.dex */
public class SamsungHomeBadger implements a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String[] f38834b = {"_id", Name.LABEL};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public DefaultBadger f38835a = new DefaultBadger();

    @Override // T7.a
    public List a() {
        return Arrays.asList("com.sec.android.app.launcher", "com.sec.android.app.twlauncher");
    }

    @Override // T7.a
    public void b(Context context, ComponentName componentName, int i9) throws b {
        DefaultBadger defaultBadger = this.f38835a;
        if (defaultBadger != null && defaultBadger.c(context)) {
            this.f38835a.b(context, componentName, i9);
            return;
        }
        Uri uri = Uri.parse("content://com.sec.badge/apps?notify=true");
        ContentResolver contentResolver = context.getContentResolver();
        Cursor cursorQuery = null;
        try {
            cursorQuery = contentResolver.query(uri, f38834b, "package=?", new String[]{componentName.getPackageName()}, null);
            if (cursorQuery != null) {
                String className = componentName.getClassName();
                boolean z9 = false;
                while (cursorQuery.moveToNext()) {
                    contentResolver.update(uri, c(componentName, i9, false), "_id=?", new String[]{String.valueOf(cursorQuery.getInt(0))});
                    if (className.equals(cursorQuery.getString(cursorQuery.getColumnIndex(Name.LABEL)))) {
                        z9 = true;
                    }
                }
                if (!z9) {
                    contentResolver.insert(uri, c(componentName, i9, true));
                }
            }
            U7.b.a(cursorQuery);
        } catch (Throwable th) {
            U7.b.a(cursorQuery);
            throw th;
        }
    }

    public final ContentValues c(ComponentName componentName, int i9, boolean z9) {
        ContentValues contentValues = new ContentValues();
        if (z9) {
            contentValues.put("package", componentName.getPackageName());
            contentValues.put(Name.LABEL, componentName.getClassName());
        }
        contentValues.put("badgecount", Integer.valueOf(i9));
        return contentValues;
    }
}
