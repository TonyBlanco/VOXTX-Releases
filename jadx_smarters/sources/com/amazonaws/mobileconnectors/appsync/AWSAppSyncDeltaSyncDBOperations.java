package com.amazonaws.mobileconnectors.appsync;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
final class AWSAppSyncDeltaSyncDBOperations {
    private final String[] allColumns = {"_id", AWSAppSyncDeltaSyncSqlHelper.COLUMN_DELTA_SYNC_KEY, AWSAppSyncDeltaSyncSqlHelper.COLUMN_LAST_RUN_TIME};
    private final SQLiteDatabase database;
    private final SQLiteOpenHelper dbHelper;
    private final SQLiteStatement deleteAllRecordsStatement;
    private final SQLiteStatement deleteStatement;
    private final SQLiteStatement getRecordByID;
    private final SQLiteStatement getRecordByKey;
    private final SQLiteStatement insertStatement;
    private final SQLiteStatement updateLastRunTimeStatement;
    private static final String INSERT_STATEMENT = String.format("INSERT INTO %S ( %s, %s) VALUES (?,?)", AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC, AWSAppSyncDeltaSyncSqlHelper.COLUMN_DELTA_SYNC_KEY, AWSAppSyncDeltaSyncSqlHelper.COLUMN_LAST_RUN_TIME);
    private static final String DELETE_STATEMENT = String.format("DELETE FROM %s WHERE %s = ?", AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC, "_id");
    private static final String DELETE_ALL_RECORD_STATEMENT = String.format("DELETE FROM %s", AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC);
    private static final String UPDATE_LAST_RUN_TIME = String.format("UPDATE %s set %s = ? WHERE %s = ?", AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC, AWSAppSyncDeltaSyncSqlHelper.COLUMN_LAST_RUN_TIME, "_id");
    private static final String GET_RECORD_BY_ID = String.format("SELECT * FROM %s WHERE %s = ?", AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC, "_id");
    private static final String GET_RECORD_BY_KEY = String.format("SELECT * FROM %s WHERE %s = ?", AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC, AWSAppSyncDeltaSyncSqlHelper.COLUMN_DELTA_SYNC_KEY);

    public final class DeltaSyncRecord {
        long id;
        String key;
        long lastRunTimeInMilliSeconds;

        public DeltaSyncRecord() {
        }
    }

    public AWSAppSyncDeltaSyncDBOperations(SQLiteOpenHelper sQLiteOpenHelper) {
        this.dbHelper = sQLiteOpenHelper;
        SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
        this.database = writableDatabase;
        this.insertStatement = writableDatabase.compileStatement(INSERT_STATEMENT);
        this.deleteStatement = writableDatabase.compileStatement(DELETE_STATEMENT);
        this.deleteAllRecordsStatement = writableDatabase.compileStatement(DELETE_ALL_RECORD_STATEMENT);
        this.updateLastRunTimeStatement = writableDatabase.compileStatement(UPDATE_LAST_RUN_TIME);
        this.getRecordByID = writableDatabase.compileStatement(GET_RECORD_BY_ID);
        this.getRecordByKey = writableDatabase.compileStatement(GET_RECORD_BY_KEY);
    }

    public void clearDeltaSyncStore() {
        this.deleteAllRecordsStatement.execute();
    }

    public void close() {
        this.dbHelper.close();
    }

    public long createRecord(String str, long j9) {
        this.insertStatement.bindString(1, str);
        this.insertStatement.bindLong(2, j9);
        return this.insertStatement.executeInsert();
    }

    public boolean deleteRecord(Long l9) {
        this.deleteStatement.bindLong(1, l9.longValue());
        return this.deleteStatement.executeUpdateDelete() > 0;
    }

    public DeltaSyncRecord getRecordByID(long j9) throws Throwable {
        Cursor cursor = null;
        try {
            Cursor cursorQuery = this.database.query(AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC, this.allColumns, "_id = ?", new String[]{"" + j9}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0 && cursorQuery.moveToNext()) {
                        cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                        throw null;
                    }
                } catch (Throwable th) {
                    th = th;
                    cursor = cursorQuery;
                    if (cursor != null && !cursor.isClosed()) {
                        cursor.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public DeltaSyncRecord getRecordByKey(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        DeltaSyncRecord deltaSyncRecord = null;
        try {
            cursorQuery = this.database.query(AWSAppSyncDeltaSyncSqlHelper.TABLE_DELTA_SYNC, this.allColumns, "delta_sync_key = ?", new String[]{str}, null, null, null);
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.getCount() > 0 && cursorQuery.moveToNext()) {
                        deltaSyncRecord = new DeltaSyncRecord();
                        deltaSyncRecord.id = cursorQuery.getLong(cursorQuery.getColumnIndex("_id"));
                        deltaSyncRecord.key = cursorQuery.getString(cursorQuery.getColumnIndex(AWSAppSyncDeltaSyncSqlHelper.COLUMN_DELTA_SYNC_KEY));
                        deltaSyncRecord.lastRunTimeInMilliSeconds = cursorQuery.getLong(cursorQuery.getColumnIndex(AWSAppSyncDeltaSyncSqlHelper.COLUMN_LAST_RUN_TIME));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    throw th;
                }
            }
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return deltaSyncRecord;
        } catch (Throwable th3) {
            th = th3;
            cursorQuery = null;
        }
    }

    public void updateLastRunTime(long j9, long j10) {
        this.updateLastRunTimeStatement.bindLong(1, j10);
        this.updateLastRunTimeStatement.bindLong(2, j9);
        this.updateLastRunTimeStatement.executeUpdateDelete();
    }
}
