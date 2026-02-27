package com.amazonaws.mobileconnectors.appsync.cache.normalized.sql;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncSqlHelper extends SQLiteOpenHelper {
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_RECORD = "record";
    private static final String DATABASE_NAME = "appsync.db";
    private static final int DATABASE_VERSION = 1;
    public static final String IDX_RECORDS_KEY = "idx_records_key";
    private static final String TAG = "AppSyncSqlHelper";
    public static final String TABLE_RECORDS = "records";
    private static final String DATABASE_CREATE = String.format("create table %s( %s integer primary key autoincrement, %s text not null, %s text not null);", TABLE_RECORDS, "_id", "key", "record");
    private static final String CREATE_KEY_INDEX = String.format("CREATE INDEX %s ON %s (%s)", "idx_records_key", TABLE_RECORDS, "key");

    private AppSyncSqlHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public AppSyncSqlHelper(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    public static AppSyncSqlHelper create(Context context) {
        return new AppSyncSqlHelper(context);
    }

    public static AppSyncSqlHelper create(Context context, String str) {
        return new AppSyncSqlHelper(context, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.d(TAG, "In onCreate for [appsync.db]. Will create tables now");
        sQLiteDatabase.execSQL(DATABASE_CREATE);
        sQLiteDatabase.execSQL(CREATE_KEY_INDEX);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        Log.d(TAG, "In onUpgrade for [appsync.db]. Will drop tables now");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS records");
        onCreate(sQLiteDatabase);
    }
}
