package com.nst.iptvsmarterstvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class DatabaseHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "iptv_smarters_tv.db";
    private static final int DATABASE_VERSION = 4;
    private static final String KEY_CATEGORY_ID = "categoryID";
    private static final String KEY_ID = "id";
    private static final String KEY_NAME = "name";
    private static final String KEY_NUM_LIVE_STREAMS = "num";
    private static final String KEY_STREAM_ID = "streamID";
    private static final String KEY_TYPE = "type";
    private static final String KEY_USER_ID = "user_id_referred";
    private static final String TABLE_IPTV_AVAILABLE_CHANNNELS = "iptv_live_streams";
    private static final String TABLE_IPTV_FAVOURITES = "iptv_favourites";
    private static final String TABLE_ONESTREAM_IPTV_FAVOURITES = "onestream_iptv_favourites";
    private String ALTER_PRODUCTS_TABLE_1;
    private String ALTER_PRODUCTS_TABLE_2;
    private String ALTER_PRODUCTS_TABLE_3;
    String CREATE_ONESTREAM_PRODUCTS_TABLE;
    String CREATE_PRODUCTS_TABLE;
    Context context;
    SQLiteDatabase db;

    public DatabaseHandler(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 4);
        this.CREATE_PRODUCTS_TABLE = "CREATE TABLE IF NOT EXISTS iptv_favourites(id INTEGER PRIMARY KEY,type TEXT,streamID TEXT,categoryID TEXT,name TEXT,user_id_referred TEXT,num TEXT)";
        this.CREATE_ONESTREAM_PRODUCTS_TABLE = "CREATE TABLE IF NOT EXISTS onestream_iptv_favourites(id INTEGER PRIMARY KEY,type TEXT,streamID TEXT,categoryID TEXT,name TEXT,user_id_referred TEXT,num TEXT)";
        this.ALTER_PRODUCTS_TABLE_1 = "ALTER TABLE iptv_favourites ADD COLUMN name TEXT;";
        this.ALTER_PRODUCTS_TABLE_2 = "ALTER TABLE iptv_favourites ADD COLUMN user_id_referred TEXT;";
        this.ALTER_PRODUCTS_TABLE_3 = "ALTER TABLE iptv_favourites ADD COLUMN num TEXT;";
        this.context = context;
    }

    public void addFavouritesFromBackup(ArrayList<LiveStreamsDBModel> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        try {
            ContentValues contentValues = new ContentValues();
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                contentValues.put("type", arrayList.get(i9).getStreamType().equals("movie") ? "vod" : arrayList.get(i9).getStreamType());
                contentValues.put(KEY_STREAM_ID, arrayList.get(i9).getStreamId());
                contentValues.put(KEY_CATEGORY_ID, arrayList.get(i9).getCategoryId());
                contentValues.put(KEY_NAME, arrayList.get(i9).getName());
                contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                contentValues.put(KEY_NUM_LIVE_STREAMS, arrayList.get(i9).getNum());
                writableDatabase.insert(currentAPPType.equals("onestream_api") ? TABLE_ONESTREAM_IPTV_FAVOURITES : TABLE_IPTV_FAVOURITES, null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    public void addToFavourite(FavouriteDBModel favouriteDBModel, String str) {
        SQLiteDatabase sQLiteDatabase;
        String str2;
        try {
            this.db = getWritableDatabase();
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            ContentValues contentValues = new ContentValues();
            contentValues.put("type", str);
            if (currentAPPType.equals("onestream_api")) {
                contentValues.put(KEY_STREAM_ID, favouriteDBModel.getStreamIDOneStream());
            } else {
                contentValues.put(KEY_STREAM_ID, Integer.valueOf(favouriteDBModel.getStreamID()));
            }
            contentValues.put(KEY_CATEGORY_ID, favouriteDBModel.getCategoryID());
            contentValues.put(KEY_NAME, favouriteDBModel.getName());
            contentValues.put(KEY_USER_ID, Integer.valueOf(favouriteDBModel.getUserID()));
            contentValues.put(KEY_NUM_LIVE_STREAMS, favouriteDBModel.getNum());
            if (currentAPPType.equals("onestream_api")) {
                sQLiteDatabase = this.db;
                str2 = TABLE_ONESTREAM_IPTV_FAVOURITES;
            } else {
                sQLiteDatabase = this.db;
                str2 = TABLE_IPTV_FAVOURITES;
            }
            sQLiteDatabase.insert(str2, null, contentValues);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public ArrayList<FavouriteDBModel> checkFavourite(int i9, String str, String str2, int i10, String str3) {
        String str4;
        String str5;
        String str6;
        String string;
        int i11;
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        try {
            try {
                if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                    try {
                        StringBuilder sb = new StringBuilder();
                        str6 = "msg";
                        sb.append("SELECT  * FROM onestream_iptv_favourites WHERE streamID='");
                        sb.append(str3);
                        sb.append("' AND ");
                        sb.append(KEY_CATEGORY_ID);
                        sb.append("='");
                        sb.append(str);
                        sb.append("' AND ");
                        sb.append("type");
                        sb.append(" LIKE '%");
                        sb.append(str2);
                        sb.append("%'  AND ");
                        sb.append(KEY_USER_ID);
                        sb.append("=");
                        sb.append(i10);
                        sb.append("");
                        string = sb.toString();
                    } catch (SQLiteDatabaseLockedException | Exception unused) {
                        str5 = "msg";
                        str4 = "exception";
                        Log.w(str5, str4);
                        return arrayList;
                    }
                } else {
                    str6 = "msg";
                    string = "SELECT  * FROM iptv_favourites WHERE streamID='" + i9 + "' AND " + KEY_CATEGORY_ID + "='" + str + "' AND type LIKE '%" + str2 + "%'  AND " + KEY_USER_ID + "=" + i10 + "";
                }
                SQLiteDatabase readableDatabase = getReadableDatabase();
                this.db = readableDatabase;
                Cursor cursorRawQuery = readableDatabase.rawQuery(string, null);
                if (cursorRawQuery.moveToFirst()) {
                    do {
                        try {
                            i11 = Integer.parseInt(cursorRawQuery.getString(2));
                        } catch (NumberFormatException unused2) {
                            i11 = -1;
                        }
                        String string2 = cursorRawQuery.getString(2);
                        FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                        favouriteDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                        favouriteDBModel.setType(cursorRawQuery.getString(1));
                        favouriteDBModel.setStreamID(i11);
                        favouriteDBModel.setStreamIDOneStream(string2);
                        favouriteDBModel.setCategoryID(cursorRawQuery.getString(3));
                        arrayList.add(favouriteDBModel);
                    } while (cursorRawQuery.moveToNext());
                }
                cursorRawQuery.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException | Exception unused3) {
                str4 = "exception";
                str5 = str6;
            }
        } catch (SQLiteDatabaseLockedException | Exception unused4) {
            str4 = "exception";
            str5 = "msg";
        }
    }

    public void deleteAndRecreateAllTables() {
        SQLiteDatabase sQLiteDatabase;
        String str;
        this.db = getWritableDatabase();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sQLiteDatabase = this.db;
            str = "DROP TABLE IF EXISTS onestream_iptv_favourites";
        } else {
            sQLiteDatabase = this.db;
            str = "DROP TABLE IF EXISTS iptv_favourites";
        }
        sQLiteDatabase.execSQL(str);
        onCreate(this.db);
        this.db.close();
    }

    public void deleteDataForUser(int i9) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        StringBuilder sb;
        try {
            this.db = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sQLiteDatabase = this.db;
                str = TABLE_ONESTREAM_IPTV_FAVOURITES;
                sb = new StringBuilder();
                sb.append("user_id_referred='");
                sb.append(i9);
                sb.append("'");
            } else {
                sQLiteDatabase = this.db;
                str = TABLE_IPTV_FAVOURITES;
                sb = new StringBuilder();
                sb.append("user_id_referred='");
                sb.append(i9);
                sb.append("'");
            }
            sQLiteDatabase.delete(str, sb.toString(), null);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void deleteFavAfterUpdate(String str) {
        StringBuilder sb;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sb = new StringBuilder();
                sb.append("DELETE FROM onestream_iptv_favourites WHERE user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(KEY_STREAM_ID);
                sb.append(" IN (");
                sb.append(str);
                sb.append(")");
            } else {
                sb = new StringBuilder();
                sb.append("DELETE FROM iptv_favourites WHERE user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(KEY_STREAM_ID);
                sb.append(" IN (");
                sb.append(str);
                sb.append(")");
            }
            writableDatabase.execSQL(sb.toString());
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void deleteFavourite(int i9, String str, String str2, String str3, int i10, String str4) {
        try {
            this.db = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                this.db.delete(TABLE_ONESTREAM_IPTV_FAVOURITES, "streamID='" + str4 + "' AND " + KEY_USER_ID + "=" + i10, null);
            } else {
                this.db.delete(TABLE_IPTV_FAVOURITES, "streamID='" + i9 + "' AND " + KEY_USER_ID + "=" + i10, null);
            }
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:82:0x01f7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.nst.iptvsmarterstvbox.model.FavouriteDBModel> getAllFavourites(java.lang.String r34, int r35) {
        /*
            Method dump skipped, instruction units count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.DatabaseHandler.getAllFavourites(java.lang.String, int):java.util.ArrayList");
    }

    public ArrayList<FavouriteDBModel> getAllFavouritesIDString() {
        StringBuilder sb;
        String str;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT GROUP_CONCAT(streamID) AS streamID , type FROM onestream_iptv_favourites WHERE user_id_referred=";
        } else {
            sb = new StringBuilder();
            str = "SELECT GROUP_CONCAT(streamID) AS streamID , type FROM iptv_favourites WHERE user_id_referred=";
        }
        sb.append(str);
        sb.append(userID);
        sb.append(" GROUP BY ");
        sb.append("type");
        String string = sb.toString();
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(string, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                    favouriteDBModel.setCommaSeparatedStreamIDs(cursorRawQuery.getString(0));
                    favouriteDBModel.setType(cursorRawQuery.getString(1));
                    arrayList.add(favouriteDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public ArrayList<FavouriteDBModel> getAllFavouritesStreamIDs(String str) {
        StringBuilder sb;
        String str2;
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  streamID FROM onestream_iptv_favourites WHERE type LIKE '%";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  streamID FROM iptv_favourites WHERE type LIKE '%";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("%' AND ");
        sb.append(KEY_USER_ID);
        sb.append("=");
        sb.append(SharepreferenceDBHandler.getUserID(this.context));
        sb.append(" ");
        String string = sb.toString();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(string, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    String string2 = "";
                    FavouriteDBModel favouriteDBModel = new FavouriteDBModel();
                    int i9 = 0;
                    try {
                        int i10 = Integer.parseInt(cursorRawQuery.getString(0));
                        string2 = cursorRawQuery.getString(0);
                        i9 = i10;
                    } catch (NumberFormatException unused) {
                    }
                    favouriteDBModel.setStreamID(i9);
                    favouriteDBModel.setStreamIDOneStream(string2);
                    arrayList.add(favouriteDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
        }
        return arrayList;
    }

    public int getFavouriteCount(String str, int i9) {
        StringBuilder sb;
        String str2;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM onestream_iptv_favourites WHERE type LIKE '%";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM iptv_favourites WHERE type LIKE '%";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("%' AND ");
        sb.append(KEY_USER_ID);
        sb.append("=");
        sb.append(i9);
        sb.append("  ");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i10 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        Log.e("fav_oncreate", "asdfasdfsadfa");
        sQLiteDatabase.execSQL(this.CREATE_PRODUCTS_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_PRODUCTS_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (i10 >= 3) {
            sQLiteDatabase.execSQL(this.ALTER_PRODUCTS_TABLE_1);
            sQLiteDatabase.execSQL(this.ALTER_PRODUCTS_TABLE_2);
            sQLiteDatabase.execSQL(this.ALTER_PRODUCTS_TABLE_3);
        }
        if (i9 < 4) {
            sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_PRODUCTS_TABLE);
        }
    }
}
