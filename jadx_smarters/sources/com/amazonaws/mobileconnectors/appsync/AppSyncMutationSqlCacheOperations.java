package com.amazonaws.mobileconnectors.appsync;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class AppSyncMutationSqlCacheOperations {
    private final String[] allColumns = {"_id", AppSyncMutationsSqlHelper.RECORD_IDENTIFIER, "record", AppSyncMutationsSqlHelper.RESPONSE_CLASS, AppSyncMutationsSqlHelper.COLUMN_CLIENT_STATE, AppSyncMutationsSqlHelper.COLUMN_BUCKET, "key", AppSyncMutationsSqlHelper.COLUMN_REGION, AppSyncMutationsSqlHelper.COLUMN_LOCAL_URI, AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE};
    SQLiteDatabase database;
    private final SQLiteOpenHelper dbHelper;
    private final SQLiteStatement deleteAllRecordsStatement;
    private final SQLiteStatement deleteStatement;
    private final SQLiteStatement insertStatement;
    private static final String INSERT_STATEMENT = String.format("INSERT INTO %s (%s,%s,%s,%s,%s,%s,%s,%s,%s) VALUES (?,?,?,?,?,?,?,?,?)", AppSyncMutationsSqlHelper.TABLE_MUTATION_RECORDS, AppSyncMutationsSqlHelper.RECORD_IDENTIFIER, "record", AppSyncMutationsSqlHelper.RESPONSE_CLASS, AppSyncMutationsSqlHelper.COLUMN_CLIENT_STATE, AppSyncMutationsSqlHelper.COLUMN_BUCKET, "key", AppSyncMutationsSqlHelper.COLUMN_REGION, AppSyncMutationsSqlHelper.COLUMN_LOCAL_URI, AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE);
    private static final String DELETE_STATEMENT = String.format("DELETE FROM %s WHERE %s=?", AppSyncMutationsSqlHelper.TABLE_MUTATION_RECORDS, AppSyncMutationsSqlHelper.RECORD_IDENTIFIER);
    private static final String DELETE_ALL_RECORD_STATEMENT = String.format("DELETE FROM %s", AppSyncMutationsSqlHelper.TABLE_MUTATION_RECORDS);

    public AppSyncMutationSqlCacheOperations(SQLiteOpenHelper sQLiteOpenHelper) {
        this.dbHelper = sQLiteOpenHelper;
        SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
        this.database = writableDatabase;
        this.insertStatement = writableDatabase.compileStatement(INSERT_STATEMENT);
        this.deleteStatement = this.database.compileStatement(DELETE_STATEMENT);
        this.deleteAllRecordsStatement = this.database.compileStatement(DELETE_ALL_RECORD_STATEMENT);
    }

    public void clearCurrentCache() {
        this.deleteAllRecordsStatement.execute();
    }

    public void close() {
        this.dbHelper.close();
    }

    public long createRecord(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.insertStatement.bindString(1, str);
        this.insertStatement.bindString(2, str2);
        this.insertStatement.bindString(3, str3);
        this.insertStatement.bindString(4, str4);
        SQLiteStatement sQLiteStatement = this.insertStatement;
        if (str5 == null) {
            str5 = "";
        }
        sQLiteStatement.bindString(5, str5);
        SQLiteStatement sQLiteStatement2 = this.insertStatement;
        if (str6 == null) {
            str6 = "";
        }
        sQLiteStatement2.bindString(6, str6);
        SQLiteStatement sQLiteStatement3 = this.insertStatement;
        if (str7 == null) {
            str7 = "";
        }
        sQLiteStatement3.bindString(7, str7);
        SQLiteStatement sQLiteStatement4 = this.insertStatement;
        if (str8 == null) {
            str8 = "";
        }
        sQLiteStatement4.bindString(8, str8);
        SQLiteStatement sQLiteStatement5 = this.insertStatement;
        if (str9 == null) {
            str9 = "";
        }
        sQLiteStatement5.bindString(9, str9);
        return this.insertStatement.executeInsert();
    }

    public boolean deleteRecord(String str) {
        this.deleteStatement.bindString(1, str);
        return this.deleteStatement.executeUpdateDelete() > 0;
    }

    public List<PersistentOfflineMutationObject> fetchAllRecords() {
        LinkedList linkedList = new LinkedList();
        Cursor cursorQuery = null;
        try {
            cursorQuery = this.database.query(AppSyncMutationsSqlHelper.TABLE_MUTATION_RECORDS, this.allColumns, null, null, null, null, "_id");
            if (cursorQuery != null && cursorQuery.moveToFirst()) {
                if (cursorQuery.moveToFirst()) {
                    while (!cursorQuery.isAfterLast()) {
                        linkedList.add(new PersistentOfflineMutationObject(cursorQuery.getString(cursorQuery.getColumnIndex(AppSyncMutationsSqlHelper.RECORD_IDENTIFIER)), cursorQuery.getString(cursorQuery.getColumnIndex("record")), cursorQuery.getString(cursorQuery.getColumnIndex(AppSyncMutationsSqlHelper.RESPONSE_CLASS)), cursorQuery.getString(cursorQuery.getColumnIndex(AppSyncMutationsSqlHelper.COLUMN_CLIENT_STATE)), cursorQuery.getString(cursorQuery.getColumnIndex(AppSyncMutationsSqlHelper.COLUMN_BUCKET)), cursorQuery.getString(cursorQuery.getColumnIndex("key")), cursorQuery.getString(cursorQuery.getColumnIndex(AppSyncMutationsSqlHelper.COLUMN_REGION)), cursorQuery.getString(cursorQuery.getColumnIndex(AppSyncMutationsSqlHelper.COLUMN_LOCAL_URI)), cursorQuery.getString(cursorQuery.getColumnIndex(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE))));
                        cursorQuery.moveToNext();
                    }
                }
                if (!cursorQuery.isClosed()) {
                    cursorQuery.close();
                }
                return linkedList;
            }
            return linkedList;
        } finally {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
        }
    }
}
