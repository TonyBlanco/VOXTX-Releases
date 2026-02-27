package com.amazonaws.mobileconnectors.appsync;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: loaded from: classes.dex */
public class AppSyncMutationsSqlHelper extends SQLiteOpenHelper {
    public static final String COLUMN_ID = "_id";
    public static final String COLUMN_KEY = "key";
    public static final String COLUMN_RECORD = "record";
    private static final String DATABASE_NAME = "appsync.mutations.db";
    private static final int DATABASE_VERSION = 2;
    public static final String IDX_RECORDS_KEY = "idx_records_key";
    public static final String TABLE_MUTATION_RECORDS = "mutation_records";
    public static final String RECORD_IDENTIFIER = "record_id";
    public static final String RESPONSE_CLASS = "response_class";
    public static final String COLUMN_CLIENT_STATE = "client_state";
    public static final String COLUMN_BUCKET = "bucket";
    public static final String COLUMN_REGION = "region";
    public static final String COLUMN_LOCAL_URI = "local_uri";
    public static final String COLUMN_MIME_TYPE = "mime_type";
    private static final String DATABASE_CREATE = String.format("create table %s( %s integer primary key autoincrement, %s text not null, %s text not null, %s text not null, %s text not null, %s text, %s text, %s text, %s text, %s text);", TABLE_MUTATION_RECORDS, "_id", RECORD_IDENTIFIER, "record", RESPONSE_CLASS, COLUMN_CLIENT_STATE, COLUMN_BUCKET, "key", COLUMN_REGION, COLUMN_LOCAL_URI, COLUMN_MIME_TYPE);
    private static final String CREATE_KEY_INDEX = String.format("CREATE INDEX %s ON %s (%s)", "idx_records_key", TABLE_MUTATION_RECORDS, RECORD_IDENTIFIER);

    private AppSyncMutationsSqlHelper(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 2);
    }

    public AppSyncMutationsSqlHelper(Context context, String str) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 2);
    }

    public static AppSyncMutationsSqlHelper create(Context context) {
        return new AppSyncMutationsSqlHelper(context);
    }

    public static AppSyncMutationsSqlHelper create(Context context, String str) {
        return new AppSyncMutationsSqlHelper(context, str);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(DATABASE_CREATE);
        sQLiteDatabase.execSQL(CREATE_KEY_INDEX);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS mutation_records");
        onCreate(sQLiteDatabase);
    }
}
