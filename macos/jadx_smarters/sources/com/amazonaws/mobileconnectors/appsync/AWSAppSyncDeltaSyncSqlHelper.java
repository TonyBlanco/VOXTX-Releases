package com.amazonaws.mobileconnectors.appsync;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
class AWSAppSyncDeltaSyncSqlHelper extends SQLiteOpenHelper {
    public static final String COLUMN_ID = "_id";
    private static final String DATABASE_NAME = "appsync_deltasync_db";
    private static final int DATABASE_VERSION = 1;
    public static final String TABLE_DELTA_SYNC = "delta_sync";
    public static final String COLUMN_DELTA_SYNC_KEY = "delta_sync_key";
    public static final String COLUMN_LAST_RUN_TIME = "last_run_time";
    private static final String DATABASE_CREATE = String.format("create table %s( %s integer primary key autoincrement, %s text not null, %s Integer);", TABLE_DELTA_SYNC, "_id", COLUMN_DELTA_SYNC_KEY, COLUMN_LAST_RUN_TIME);

    public AWSAppSyncDeltaSyncSqlHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public AWSAppSyncDeltaSyncSqlHelper(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(DATABASE_CREATE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS delta_sync");
        onCreate(sQLiteDatabase);
    }
}
