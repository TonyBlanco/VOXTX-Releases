package com.onesignal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import com.onesignal.F1;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class M1 extends SQLiteOpenHelper implements L1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static M1 f38392e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f38389a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f38390c = {"CREATE INDEX notification_notification_id_idx ON notification(notification_id); ", "CREATE INDEX notification_android_notification_id_idx ON notification(android_notification_id); ", "CREATE INDEX notification_group_id_idx ON notification(group_id); ", "CREATE INDEX notification_collapse_id_idx ON notification(collapse_id); ", "CREATE INDEX notification_created_time_idx ON notification(created_time); ", "CREATE INDEX notification_expire_time_idx ON notification(expire_time); "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static P0 f38391d = new O0();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static R7.i f38393f = new R7.i();

    public M1(Context context) {
        super(context, "OneSignal.db", (SQLiteDatabase.CursorFactory) null, h());
    }

    public static int h() {
        return 8;
    }

    public static M1 i(Context context) {
        if (f38392e == null) {
            synchronized (f38389a) {
                try {
                    if (f38392e == null) {
                        f38392e = new M1(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        return f38392e;
    }

    public static StringBuilder n() {
        long jA = F1.v0().a() / 1000;
        StringBuilder sb = new StringBuilder("created_time > " + (jA - 604800) + " AND dismissed = 0 AND opened = 0 AND is_summary = 0");
        if (F1.j0().l()) {
            sb.append(" AND expire_time > " + jA);
        }
        return sb;
    }

    public static void o(SQLiteDatabase sQLiteDatabase, String str) {
        try {
            sQLiteDatabase.execSQL(str);
        } catch (SQLiteException e9) {
            e9.printStackTrace();
        }
    }

    public static void p(SQLiteDatabase sQLiteDatabase) {
        f38393f.b(sQLiteDatabase);
    }

    public static void q(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN collapse_id TEXT;");
        o(sQLiteDatabase, "CREATE INDEX notification_group_id_idx ON notification(group_id); ");
    }

    public static void r(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase, "ALTER TABLE notification ADD COLUMN expire_time TIMESTAMP;");
        o(sQLiteDatabase, "UPDATE notification SET expire_time = created_time + 259200;");
        o(sQLiteDatabase, "CREATE INDEX notification_expire_time_idx ON notification(expire_time); ");
    }

    public static void s(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase, "CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_ids TEXT,name TEXT,session TEXT,params TEXT,timestamp TIMESTAMP);");
    }

    public static void t(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase, "CREATE TABLE cached_unique_outcome_notification (_id INTEGER PRIMARY KEY,notification_id TEXT,name TEXT);");
        p(sQLiteDatabase);
    }

    public static void v(SQLiteDatabase sQLiteDatabase) {
        o(sQLiteDatabase, "CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
    }

    @Override // com.onesignal.L1
    public int a(String str, ContentValues contentValues, String str2, String[] strArr) {
        P0 p02;
        String str3;
        P0 p03;
        String str4;
        int iUpdate = 0;
        if (contentValues == null || contentValues.toString().isEmpty()) {
            return 0;
        }
        synchronized (f38389a) {
            SQLiteDatabase sQLiteDatabaseK = k();
            try {
                try {
                    try {
                        sQLiteDatabaseK.beginTransaction();
                        iUpdate = sQLiteDatabaseK.update(str, contentValues, str2, strArr);
                        sQLiteDatabaseK.setTransactionSuccessful();
                    } catch (Throwable th) {
                        if (sQLiteDatabaseK != null) {
                            try {
                                sQLiteDatabaseK.endTransaction();
                            } catch (SQLiteException e9) {
                                e = e9;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            } catch (IllegalStateException e10) {
                                e = e10;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IllegalStateException e11) {
                    f38391d.error("Error under update transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e11);
                    if (sQLiteDatabaseK != null) {
                        try {
                            sQLiteDatabaseK.endTransaction();
                        } catch (SQLiteException e12) {
                            e = e12;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        } catch (IllegalStateException e13) {
                            e = e13;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        }
                    }
                }
            } catch (SQLiteException e14) {
                f38391d.error("Error updating on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e14);
                if (sQLiteDatabaseK != null) {
                    try {
                        sQLiteDatabaseK.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    }
                }
            }
            try {
                sQLiteDatabaseK.endTransaction();
            } catch (SQLiteException e17) {
                e = e17;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            } catch (IllegalStateException e18) {
                e = e18;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            }
        }
        return iUpdate;
    }

    @Override // com.onesignal.L1
    public Cursor c(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5, String str6) {
        Cursor cursorQuery;
        synchronized (f38389a) {
            cursorQuery = k().query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }
        return cursorQuery;
    }

    @Override // com.onesignal.L1
    public Cursor d(String str, String[] strArr, String str2, String[] strArr2, String str3, String str4, String str5) {
        Cursor cursorQuery;
        synchronized (f38389a) {
            cursorQuery = k().query(str, strArr, str2, strArr2, str3, str4, str5);
        }
        return cursorQuery;
    }

    @Override // com.onesignal.L1
    public void e(String str, String str2, String[] strArr) {
        P0 p02;
        String str3;
        P0 p03;
        String str4;
        synchronized (f38389a) {
            SQLiteDatabase sQLiteDatabaseK = k();
            try {
                try {
                    try {
                        sQLiteDatabaseK.beginTransaction();
                        sQLiteDatabaseK.delete(str, str2, strArr);
                        sQLiteDatabaseK.setTransactionSuccessful();
                    } catch (Throwable th) {
                        if (sQLiteDatabaseK != null) {
                            try {
                                sQLiteDatabaseK.endTransaction();
                            } catch (SQLiteException e9) {
                                e = e9;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            } catch (IllegalStateException e10) {
                                e = e10;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IllegalStateException e11) {
                    f38391d.error("Error under delete transaction under table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e11);
                    if (sQLiteDatabaseK != null) {
                        try {
                            sQLiteDatabaseK.endTransaction();
                        } catch (SQLiteException e12) {
                            e = e12;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        } catch (IllegalStateException e13) {
                            e = e13;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        }
                    }
                }
            } catch (SQLiteException e14) {
                f38391d.error("Error deleting on table: " + str + " with whereClause: " + str2 + " and whereArgs: " + strArr, e14);
                if (sQLiteDatabaseK != null) {
                    try {
                        sQLiteDatabaseK.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    }
                }
            }
            try {
                sQLiteDatabaseK.endTransaction();
            } catch (SQLiteException e17) {
                e = e17;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            } catch (IllegalStateException e18) {
                e = e18;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            }
        }
    }

    @Override // com.onesignal.L1
    public void g(String str, String str2, ContentValues contentValues) {
        P0 p02;
        String str3;
        P0 p03;
        String str4;
        synchronized (f38389a) {
            SQLiteDatabase sQLiteDatabaseK = k();
            try {
                try {
                    try {
                        sQLiteDatabaseK.beginTransaction();
                        sQLiteDatabaseK.insert(str, str2, contentValues);
                        sQLiteDatabaseK.setTransactionSuccessful();
                    } catch (Throwable th) {
                        if (sQLiteDatabaseK != null) {
                            try {
                                sQLiteDatabaseK.endTransaction();
                            } catch (SQLiteException e9) {
                                e = e9;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            } catch (IllegalStateException e10) {
                                e = e10;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IllegalStateException e11) {
                    f38391d.error("Error under inserting transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e11);
                    if (sQLiteDatabaseK != null) {
                        try {
                            sQLiteDatabaseK.endTransaction();
                        } catch (SQLiteException e12) {
                            e = e12;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        } catch (IllegalStateException e13) {
                            e = e13;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        }
                    }
                }
            } catch (SQLiteException e14) {
                f38391d.error("Error inserting on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e14);
                if (sQLiteDatabaseK != null) {
                    try {
                        sQLiteDatabaseK.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    }
                }
            }
            try {
                sQLiteDatabaseK.endTransaction();
            } catch (SQLiteException e17) {
                e = e17;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            } catch (IllegalStateException e18) {
                e = e18;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            }
        }
    }

    public final SQLiteDatabase j() {
        SQLiteDatabase writableDatabase;
        synchronized (f38389a) {
            try {
                try {
                    writableDatabase = getWritableDatabase();
                } finally {
                }
            } catch (SQLiteCantOpenDatabaseException e9) {
                throw e9;
            } catch (SQLiteDatabaseLockedException e10) {
                throw e10;
            }
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0012  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0018 A[Catch: all -> 0x000b, LOOP:0: B:21:0x0005->B:17:0x0018, LOOP_END, TryCatch #2 {all -> 0x000b, blocks: (B:5:0x0005, B:6:0x0009, B:15:0x0013, B:17:0x0018, B:18:0x001f), top: B:21:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x001f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.database.sqlite.SQLiteDatabase k() {
        /*
            r5 = this;
            java.lang.Object r0 = com.onesignal.M1.f38389a
            monitor-enter(r0)
            r1 = 0
            r2 = 0
        L5:
            android.database.sqlite.SQLiteDatabase r1 = r5.j()     // Catch: java.lang.Throwable -> Lb android.database.sqlite.SQLiteDatabaseLockedException -> Ld android.database.sqlite.SQLiteCantOpenDatabaseException -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r1
        Lb:
            r1 = move-exception
            goto L20
        Ld:
            r3 = move-exception
            goto L10
        Lf:
            r3 = move-exception
        L10:
            if (r1 != 0) goto L13
            r1 = r3
        L13:
            int r2 = r2 + 1
            r3 = 5
            if (r2 >= r3) goto L1f
            int r3 = r2 * 400
            long r3 = (long) r3     // Catch: java.lang.Throwable -> Lb
            android.os.SystemClock.sleep(r3)     // Catch: java.lang.Throwable -> Lb
            goto L5
        L1f:
            throw r1     // Catch: java.lang.Throwable -> Lb
        L20:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.onesignal.M1.k():android.database.sqlite.SQLiteDatabase");
    }

    public void l(String str, String str2, ContentValues contentValues) {
        P0 p02;
        String str3;
        P0 p03;
        String str4;
        synchronized (f38389a) {
            SQLiteDatabase sQLiteDatabaseK = k();
            try {
                try {
                    try {
                        sQLiteDatabaseK.beginTransaction();
                        sQLiteDatabaseK.insertOrThrow(str, str2, contentValues);
                        sQLiteDatabaseK.setTransactionSuccessful();
                    } catch (Throwable th) {
                        if (sQLiteDatabaseK != null) {
                            try {
                                sQLiteDatabaseK.endTransaction();
                            } catch (SQLiteException e9) {
                                e = e9;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            } catch (IllegalStateException e10) {
                                e = e10;
                                p03 = f38391d;
                                str4 = "Error closing transaction! ";
                                p03.error(str4, e);
                                throw th;
                            }
                        }
                        throw th;
                    }
                } catch (IllegalStateException e11) {
                    f38391d.error("Error under inserting or throw transaction under table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e11);
                    if (sQLiteDatabaseK != null) {
                        try {
                            sQLiteDatabaseK.endTransaction();
                        } catch (SQLiteException e12) {
                            e = e12;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        } catch (IllegalStateException e13) {
                            e = e13;
                            p02 = f38391d;
                            str3 = "Error closing transaction! ";
                            p02.error(str3, e);
                        }
                    }
                }
            } catch (SQLiteException e14) {
                f38391d.error("Error inserting or throw on table: " + str + " with nullColumnHack: " + str2 + " and values: " + contentValues, e14);
                if (sQLiteDatabaseK != null) {
                    try {
                        sQLiteDatabaseK.endTransaction();
                    } catch (SQLiteException e15) {
                        e = e15;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    } catch (IllegalStateException e16) {
                        e = e16;
                        p02 = f38391d;
                        str3 = "Error closing transaction! ";
                        p02.error(str3, e);
                    }
                }
            }
            try {
                sQLiteDatabaseK.endTransaction();
            } catch (SQLiteException e17) {
                e = e17;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            } catch (IllegalStateException e18) {
                e = e18;
                p02 = f38391d;
                str3 = "Error closing transaction! ";
                p02.error(str3, e);
            }
        }
    }

    public final void m(SQLiteDatabase sQLiteDatabase, int i9) {
        if (i9 < 2) {
            q(sQLiteDatabase);
        }
        if (i9 < 3) {
            r(sQLiteDatabase);
        }
        if (i9 < 4) {
            s(sQLiteDatabase);
        }
        if (i9 < 5) {
            t(sQLiteDatabase);
        }
        if (i9 == 5) {
            p(sQLiteDatabase);
        }
        if (i9 < 7) {
            v(sQLiteDatabase);
        }
        if (i9 < 8) {
            w(sQLiteDatabase);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        synchronized (f38389a) {
            try {
                sQLiteDatabase.execSQL("CREATE TABLE notification (_id INTEGER PRIMARY KEY,notification_id TEXT,android_notification_id INTEGER,group_id TEXT,collapse_id TEXT,is_summary INTEGER DEFAULT 0,opened INTEGER DEFAULT 0,dismissed INTEGER DEFAULT 0,title TEXT,message TEXT,full_data TEXT,created_time TIMESTAMP DEFAULT (strftime('%s', 'now')),expire_time TIMESTAMP);");
                sQLiteDatabase.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                sQLiteDatabase.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                sQLiteDatabase.execSQL("CREATE TABLE in_app_message (_id INTEGER PRIMARY KEY,display_quantity INTEGER,last_display INTEGER,message_id TEXT,displayed_in_session INTEGER,click_ids TEXT);");
                for (String str : f38390c) {
                    sQLiteDatabase.execSQL(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        F1.a(F1.v.WARN, "SDK version rolled back! Clearing OneSignal.db as it could be in an unexpected state.");
        synchronized (f38389a) {
            try {
                Cursor cursorRawQuery = sQLiteDatabase.rawQuery("SELECT name FROM sqlite_master WHERE type='table'", null);
                try {
                    ArrayList<String> arrayList = new ArrayList(cursorRawQuery.getCount());
                    while (cursorRawQuery.moveToNext()) {
                        arrayList.add(cursorRawQuery.getString(0));
                    }
                    for (String str : arrayList) {
                        if (!str.startsWith("sqlite_")) {
                            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
                        }
                    }
                    cursorRawQuery.close();
                    onCreate(sQLiteDatabase);
                } catch (Throwable th) {
                    cursorRawQuery.close();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        F1.a(F1.v.DEBUG, "OneSignal Database onUpgrade from: " + i9 + " to: " + i10);
        synchronized (f38389a) {
            try {
                m(sQLiteDatabase, i9);
            } catch (SQLiteException e9) {
                F1.b(F1.v.ERROR, "Error in upgrade, migration may have already run! Skipping!", e9);
            }
        }
    }

    public final void w(SQLiteDatabase sQLiteDatabase) {
        f38393f.c(sQLiteDatabase);
        f38393f.a(sQLiteDatabase);
    }
}
