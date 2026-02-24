package com.nst.iptvsmarterstvbox.model.database;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.nst.iptvsmarterstvbox.model.MultiUserDBModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class MultiUserDBHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "iptv_smarters_multi_user.db";
    private static final int DATABASE_VERSION = 7;
    private static final String KEY_AUTO_ID = "auto_id";
    private static final String KEY_CREATED_AT = "user_created";
    private static final String KEY_EPGURL = "epgurl";
    private static final String KEY_LOGGED_IN_USING = "logged_in_using";
    private static final String KEY_MAC_ADDRESS = "mac_address";
    private static final String KEY_MAGPORTAL = "magportal";
    private static final String KEY_MAGPORTAL2 = "magportal2";
    private static final String KEY_NAME = "name";
    private static final String KEY_PASSWORD = "password";
    private static final String KEY_SERVER_URL = "server_url";
    private static final String KEY_TYPE = "type";
    private static final String KEY_TYPE_OF_M3U = "type_of_m3u";
    private static final String KEY_USERNAME = "username";
    private static final String KEY_USER_ID = "user_id";
    private static final String TABLE_LOGIN = "login_user";
    private static final String TABLE_MULTI_USER = "multi_user";
    private static final String TABLE_MULTI_USER_EPG_M3U = "multi_user_epg_m3u";
    private static final String TABLE_MULTI_USER_M3U = "multi_user_m3u";
    private static final String TABLE_MULTI_USER_STALKER = "multi_user_stalker";
    private String ALTERED_TABLE_MULTIUSER;
    private String ALTERED_TABLE_MULTIUSER2;
    String CREATE_LOGIN_TABLE;
    String CREATE_MULTIUSER_EPG_TABLE;
    String CREATE_MULTIUSER_STALKER_TABLE;
    String CREATE_MULTIUSER_TABLE;
    String CREATE_MULTIUSER_TABLE_M3U;
    Context context;
    SQLiteDatabase db;

    public MultiUserDBHandler(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 7);
        this.CREATE_LOGIN_TABLE = "CREATE TABLE IF NOT EXISTS login_user(server_url TEXT,user_created TEXT)";
        this.CREATE_MULTIUSER_TABLE = "CREATE TABLE IF NOT EXISTS multi_user(auto_id INTEGER PRIMARY KEY,name TEXT,username TEXT,password TEXT,magportal TEXT,magportal2 TEXT,logged_in_using TEXT)";
        this.CREATE_MULTIUSER_STALKER_TABLE = "CREATE TABLE IF NOT EXISTS multi_user_stalker(auto_id INTEGER PRIMARY KEY,name TEXT,magportal TEXT,mac_address TEXT)";
        this.ALTERED_TABLE_MULTIUSER = "ALTER TABLE multi_user ADD COLUMN magportal2 TEXT;";
        this.ALTERED_TABLE_MULTIUSER2 = "ALTER TABLE multi_user ADD COLUMN logged_in_using TEXT;";
        this.CREATE_MULTIUSER_TABLE_M3U = "CREATE TABLE IF NOT EXISTS multi_user_m3u(auto_id INTEGER PRIMARY KEY,name TEXT,username TEXT,password TEXT,magportal TEXT,type_of_m3u TEXT)";
        this.CREATE_MULTIUSER_EPG_TABLE = "CREATE TABLE IF NOT EXISTS multi_user_epg_m3u(auto_id INTEGER PRIMARY KEY,user_id TEXT,epgurl TEXT)";
        this.context = context;
    }

    public void addmultiusers(String str, String str2, String str3, String str4, String str5, String str6) {
        try {
            this.db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_NAME, str.replaceAll("'", ""));
            contentValues.put("username", str2);
            contentValues.put("password", str3);
            contentValues.put(KEY_MAGPORTAL, str4);
            contentValues.put(KEY_MAGPORTAL2, str5);
            contentValues.put(KEY_LOGGED_IN_USING, str6);
            this.db.insert(TABLE_MULTI_USER, null, contentValues);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException e9) {
            e9.printStackTrace();
        }
    }

    public void addmultiusersEPG(String str, String str2) {
        try {
            this.db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_USER_ID, str);
            contentValues.put(KEY_EPGURL, str2);
            this.db.execSQL("DELETE FROM multi_user_epg_m3u WHERE user_id='" + str + "'");
            this.db.insert(TABLE_MULTI_USER_EPG_M3U, null, contentValues);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void addmultiusersM3U(String str, String str2, String str3, String str4, String str5) {
        try {
            this.db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_NAME, str.replaceAll("'", ""));
            contentValues.put("username", str2);
            contentValues.put("password", str3);
            contentValues.put(KEY_MAGPORTAL, str4);
            contentValues.put(KEY_TYPE_OF_M3U, str5);
            this.db.insert(TABLE_MULTI_USER_M3U, null, contentValues);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void addmultiusersStalker(String str, String str2, String str3) {
        try {
            this.db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_NAME, str.replaceAll("'", ""));
            contentValues.put(KEY_MAGPORTAL, str2);
            contentValues.put(KEY_MAC_ADDRESS, str3);
            this.db.insert(TABLE_MULTI_USER_STALKER, null, contentValues);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x015c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015e A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean checkregistration(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler.checkregistration(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0158 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x015a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean checkregistrationForMultiuserAapter(java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler.checkregistrationForMultiuserAapter(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public void deleteSaveLogin() {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.db = writableDatabase;
        writableDatabase.execSQL("DELETE FROM login_user");
        this.db.close();
    }

    public void deleteUserAPI(int i9) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.db = writableDatabase;
        writableDatabase.execSQL("DELETE FROM multi_user WHERE auto_id='" + i9 + "'");
        this.db.close();
    }

    public void deleteUserM3U(int i9) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.db = writableDatabase;
        writableDatabase.execSQL("DELETE FROM multi_user_m3u WHERE auto_id='" + i9 + "'");
        this.db.execSQL("DELETE FROM multi_user_epg_m3u WHERE user_id='" + i9 + "'");
        this.db.close();
    }

    public void editmultiusersEPG(String str, String str2) {
        this.db = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_EPGURL, str2);
            this.db.update(TABLE_MULTI_USER_EPG_M3U, contentValues, "user_id = ?", new String[]{String.valueOf(str)});
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public ArrayList<MultiUserDBModel> getAllUsers() {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user ORDER BY auto_id DESC", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    multiUserDBModel.setusername(cursorRawQuery.getString(2));
                    multiUserDBModel.setpassword(cursorRawQuery.getString(3));
                    multiUserDBModel.setmagportal(cursorRawQuery.getString(4));
                    multiUserDBModel.setmagportal2(cursorRawQuery.getString(5));
                    multiUserDBModel.setLogged_in_using(cursorRawQuery.getString(6));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public boolean getAllUsersCount() {
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user ORDER BY auto_id DESC", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList.size() > 0;
    }

    public ArrayList<MultiUserDBModel> getAllUsersM3U() {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_m3u ORDER BY auto_id DESC", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    multiUserDBModel.setusername(cursorRawQuery.getString(2));
                    multiUserDBModel.setpassword(cursorRawQuery.getString(3));
                    multiUserDBModel.setmagportal(cursorRawQuery.getString(4));
                    multiUserDBModel.setM3uType(cursorRawQuery.getString(5));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public ArrayList<MultiUserDBModel> getAllUsersStalker() {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_stalker ORDER BY auto_id DESC", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    multiUserDBModel.setmagportal(cursorRawQuery.getString(2));
                    multiUserDBModel.setmacAddress(cursorRawQuery.getString(3));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0135 A[Catch: Exception -> 0x002c, SQLiteDatabaseLockedException -> 0x0031, TryCatch #3 {SQLiteDatabaseLockedException -> 0x0031, Exception -> 0x002c, blocks: (B:3:0x000a, B:11:0x0022, B:31:0x0065, B:32:0x00b9, B:36:0x016d, B:33:0x00bf, B:34:0x0102, B:35:0x0135, B:18:0x0036, B:21:0x003e), top: B:51:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x017c A[Catch: Exception -> 0x002e, SQLiteDatabaseLockedException -> 0x0033, TryCatch #4 {SQLiteDatabaseLockedException -> 0x0033, Exception -> 0x002e, blocks: (B:38:0x0173, B:40:0x017c, B:42:0x0182), top: B:49:0x0173 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int getAutoIdLoggedInUser(java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, java.lang.String r24) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.MultiUserDBHandler.getAutoIdLoggedInUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):int");
    }

    @SuppressLint({"Range"})
    public int getAutoIdLoggedInUseroneStream(String str, String str2, String str3, String str4, String str5, String str6) {
        StringBuilder sb;
        Cursor cursorRawQuery;
        try {
            if (str5.equals("m3u")) {
                sb = new StringBuilder();
                sb.append("SELECT auto_id FROM multi_user_m3u WHERE name='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("username");
                sb.append("='");
                sb.append(str2);
                sb.append("' AND ");
                sb.append("password");
                sb.append("='");
                sb.append(str3);
                sb.append("' AND ");
                sb.append(KEY_MAGPORTAL);
                sb.append(" LIKE '%");
                sb.append(str4);
            } else {
                if (!str5.equals("onestream_api")) {
                    sb = new StringBuilder();
                    sb.append("SELECT auto_id FROM multi_user WHERE name='");
                    sb.append(str);
                    sb.append("' AND ");
                    sb.append("username");
                    sb.append("='");
                    sb.append(str2);
                    sb.append("' AND ");
                    sb.append("password");
                    sb.append("='");
                    sb.append(str3);
                    sb.append("' AND (");
                    sb.append(KEY_MAGPORTAL);
                    sb.append(" LIKE '%");
                    sb.append(str4);
                    sb.append("%' OR ");
                    sb.append(KEY_MAGPORTAL2);
                    sb.append(" LIKE '%");
                    sb.append(str6);
                    sb.append("%' )");
                    String string = sb.toString();
                    SQLiteDatabase readableDatabase = getReadableDatabase();
                    this.db = readableDatabase;
                    cursorRawQuery = readableDatabase.rawQuery(string, null);
                    if (cursorRawQuery == null && cursorRawQuery.moveToFirst()) {
                        int i9 = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex(KEY_AUTO_ID));
                        cursorRawQuery.close();
                        return i9;
                    }
                }
                sb = new StringBuilder();
                sb.append("SELECT auto_id FROM multi_user WHERE name='");
                sb.append(str);
                sb.append("' AND ");
                sb.append("username");
                sb.append("='");
                sb.append(str2);
                sb.append("' AND ");
                sb.append("password");
                sb.append("='");
                sb.append(str3);
                sb.append("' AND ");
                sb.append(KEY_MAGPORTAL);
                sb.append(" LIKE '%");
                sb.append(str4);
            }
            sb.append("%'");
            String string2 = sb.toString();
            SQLiteDatabase readableDatabase2 = getReadableDatabase();
            this.db = readableDatabase2;
            cursorRawQuery = readableDatabase2.rawQuery(string2, null);
            return cursorRawQuery == null ? -1 : -1;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return -1;
        }
    }

    public ArrayList<MultiUserDBModel> getSaveLoginDate() {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        SQLiteDatabase readableDatabase = getReadableDatabase();
        this.db = readableDatabase;
        Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT * FROM login_user", null);
        if (cursorRawQuery.moveToFirst()) {
            MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
            multiUserDBModel.setServerUrl(cursorRawQuery.getString(0));
            multiUserDBModel.setDate(cursorRawQuery.getString(1));
            arrayList.add(multiUserDBModel);
            cursorRawQuery.close();
        }
        return arrayList;
    }

    public ArrayList<MultiUserDBModel> getUserDetails(int i9) {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_m3u WHERE auto_id ='" + i9 + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    multiUserDBModel.setusername(cursorRawQuery.getString(2));
                    multiUserDBModel.setpassword(cursorRawQuery.getString(3));
                    multiUserDBModel.setmagportal(cursorRawQuery.getString(4));
                    multiUserDBModel.setM3uType(cursorRawQuery.getString(5));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public ArrayList<MultiUserDBModel> getUserDetailsAPI(String str, String str2, String str3, String str4, String str5) {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            String str6 = "SELECT  * FROM multi_user WHERE name ='" + str + "' AND username ='" + str2 + "' AND password ='" + str3 + "' AND (" + KEY_MAGPORTAL + " LIKE '%" + str4 + "%' OR " + KEY_MAGPORTAL2 + " LIKE '%" + str5 + "%' )";
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str6, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    multiUserDBModel.setusername(cursorRawQuery.getString(2));
                    multiUserDBModel.setpassword(cursorRawQuery.getString(3));
                    multiUserDBModel.setmagportal(cursorRawQuery.getString(4));
                    multiUserDBModel.setmagportal2(cursorRawQuery.getString(5));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public ArrayList<MultiUserDBModel> getUserDetailsM3U(String str, String str2, String str3, String str4) {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            String str5 = "SELECT  * FROM multi_user_m3u WHERE name ='" + str + "' AND username ='" + str2 + "' AND password ='" + str3 + "' AND " + KEY_MAGPORTAL + " LIKE '%" + str4 + "%'";
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str5, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    multiUserDBModel.setusername(cursorRawQuery.getString(2));
                    multiUserDBModel.setpassword(cursorRawQuery.getString(3));
                    multiUserDBModel.setmagportal(cursorRawQuery.getString(4));
                    multiUserDBModel.setM3uType(cursorRawQuery.getString(5));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public ArrayList<MultiUserDBModel> getUserDetailsStalkerAPI(int i9) {
        ArrayList<MultiUserDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery("SELECT  * FROM multi_user_stalker WHERE auto_id ='" + i9 + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    MultiUserDBModel multiUserDBModel = new MultiUserDBModel();
                    multiUserDBModel.setname(cursorRawQuery.getString(1));
                    multiUserDBModel.setmagportal(cursorRawQuery.getString(2));
                    multiUserDBModel.setmacAddress(cursorRawQuery.getString(3));
                    arrayList.add(multiUserDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
        return arrayList;
    }

    public String getUserEPG(int i9) {
        String string;
        String str = "SELECT  * FROM multi_user_epg_m3u WHERE user_id ='" + i9 + "'";
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str, null);
            if (cursorRawQuery.getCount() > 0) {
                cursorRawQuery.moveToFirst();
                string = cursorRawQuery.getString(cursorRawQuery.getColumnIndex(KEY_EPGURL));
            } else {
                string = "";
            }
            cursorRawQuery.close();
            return string;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return "";
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.CREATE_MULTIUSER_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_MULTIUSER_EPG_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_MULTIUSER_TABLE_M3U);
        sQLiteDatabase.execSQL(this.CREATE_LOGIN_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_MULTIUSER_STALKER_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (i9 < 2) {
            sQLiteDatabase.execSQL(this.CREATE_MULTIUSER_EPG_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_MULTIUSER_TABLE_M3U);
        }
        if (i9 < 3) {
            sQLiteDatabase.execSQL(this.ALTERED_TABLE_MULTIUSER);
        }
        if (i9 < 4) {
            sQLiteDatabase.execSQL(this.CREATE_LOGIN_TABLE);
        }
        if (i9 < 5) {
            sQLiteDatabase.execSQL(this.CREATE_MULTIUSER_STALKER_TABLE);
        }
        if (i9 < 6) {
            sQLiteDatabase.execSQL(this.ALTERED_TABLE_MULTIUSER2);
        }
    }

    public void saveLoginData(String str, String str2) {
        StringBuilder sb;
        try {
            this.db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_SERVER_URL, str);
            contentValues.put(KEY_CREATED_AT, str2);
            this.db.insert(TABLE_LOGIN, null, contentValues);
            this.db.close();
        } catch (SQLiteDatabaseLockedException e9) {
            e = e9;
            sb = new StringBuilder();
            sb.append("");
            sb.append(e);
            Log.d("", sb.toString());
        } catch (SQLiteException e10) {
            e = e10;
            sb = new StringBuilder();
            sb.append("");
            sb.append(e);
            Log.d("", sb.toString());
        }
    }

    public void updateEditMultiUserdetails(int i9, String str, String str2, String str3, String str4, String str5) {
        this.db = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_NAME, str);
            contentValues.put("username", str2);
            contentValues.put("password", str3);
            contentValues.put(KEY_MAGPORTAL, str4);
            contentValues.put(KEY_MAGPORTAL2, str5);
            this.db.update(TABLE_MULTI_USER, contentValues, "auto_id = ?", new String[]{String.valueOf(i9)});
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void updateMultiUser(int i9, String str) {
        this.db = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_MAGPORTAL2, str);
            this.db.update(TABLE_MULTI_USER, contentValues, "auto_id = ?", new String[]{String.valueOf(i9)});
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void updateMultiUserNew(int i9, String str, String str2) {
        this.db = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_MAGPORTAL, str);
            contentValues.put(KEY_MAGPORTAL2, str2);
            this.db.update(TABLE_MULTI_USER, contentValues, "auto_id = ?", new String[]{String.valueOf(i9)});
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void updatemultiusersM3U(int i9, String str, String str2, String str3, String str4, String str5) {
        this.db = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_NAME, str.replaceAll("'", ""));
            contentValues.put("username", str2);
            contentValues.put("password", str3);
            contentValues.put(KEY_MAGPORTAL, str4);
            contentValues.put(KEY_TYPE_OF_M3U, str5);
            this.db.update(TABLE_MULTI_USER_M3U, contentValues, "auto_id = ?", new String[]{String.valueOf(i9)});
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }
}
