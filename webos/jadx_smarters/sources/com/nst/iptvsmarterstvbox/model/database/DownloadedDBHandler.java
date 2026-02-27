package com.nst.iptvsmarterstvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.nst.iptvsmarterstvbox.model.DownloadedDataModel;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class DownloadedDBHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "iptv_downloaded.db";
    private static final int DATABASE_VERSION = 7;
    private static final String KEY_ID = "id";
    private static final String KEY_MOVIE_CURRENT_POSITION = "KEY_MOVIE_CURRENT_POSITION";
    private static final String KEY_MOVIE_DURATION = "KEY_MOVIE_DURATION";
    private static final String KEY_MOVIE_EXTENSION = "KEY_MOVIE_EXTENSION";
    private static final String KEY_MOVIE_IMAGE = "KEY_MOVIE_IMAGE";
    private static final String KEY_MOVIE_NAME = "KEY_MOVIE_NAME";
    private static final String KEY_MOVIE_NUM = "KEY_MOVIE_NUM";
    private static final String KEY_MOVIE_PERCENTAGE = "KEY_MOVIE_PERCENTAGE";
    private static final String KEY_MOVIE_STATE = "KEY_MOVIE_STATE";
    private static final String KEY_MOVIE_STREAM_ID = "KEY_MOVIE_STREAM_ID";
    private static final String KEY_MOVIE_TYPE = "KEY_MOVIE_TYPE";
    private static final String KEY_MOVIE_URL = "KEY_MOVIE_URL";
    private static final String TABLE_IPTV_DOWNLOADED = "iptv_downloaded";
    String CREATE_TABLE_IPTV_DOWNLOADED_TABLE;
    Context context;
    SQLiteDatabase db;

    public DownloadedDBHandler(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 7);
        this.CREATE_TABLE_IPTV_DOWNLOADED_TABLE = "CREATE TABLE IF NOT EXISTS iptv_downloaded(id INTEGER PRIMARY KEY,KEY_MOVIE_NAME TEXT,KEY_MOVIE_EXTENSION TEXT,KEY_MOVIE_STREAM_ID TEXT,KEY_MOVIE_DURATION TEXT,KEY_MOVIE_NUM TEXT,KEY_MOVIE_IMAGE TEXT,KEY_MOVIE_URL TEXT,KEY_MOVIE_STATE TEXT,KEY_MOVIE_PERCENTAGE TEXT,KEY_MOVIE_TYPE TEXT,KEY_MOVIE_CURRENT_POSITION TEXT)";
        this.context = context;
    }

    public void addDownloadedData(ArrayList<DownloadedDataModel> arrayList) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (DownloadedDataModel downloadedDataModel : arrayList) {
                    if (downloadedDataModel.getMovieName() != null) {
                        contentValues.put(KEY_MOVIE_NAME, downloadedDataModel.getMovieName());
                    } else {
                        contentValues.put(KEY_MOVIE_NAME, "");
                    }
                    if (downloadedDataModel.getMovieExtension() != null) {
                        contentValues.put(KEY_MOVIE_EXTENSION, downloadedDataModel.getMovieExtension());
                    } else {
                        contentValues.put(KEY_MOVIE_EXTENSION, "");
                    }
                    if (downloadedDataModel.getMovieStreamID() != null) {
                        contentValues.put(KEY_MOVIE_STREAM_ID, downloadedDataModel.getMovieStreamID());
                    } else {
                        contentValues.put(KEY_MOVIE_STREAM_ID, "");
                    }
                    if (downloadedDataModel.getMovieDuration() != null) {
                        contentValues.put(KEY_MOVIE_DURATION, downloadedDataModel.getMovieDuration());
                    } else {
                        contentValues.put(KEY_MOVIE_DURATION, "");
                    }
                    if (downloadedDataModel.getMovieNum() != null) {
                        contentValues.put(KEY_MOVIE_NUM, downloadedDataModel.getMovieNum());
                    } else {
                        contentValues.put(KEY_MOVIE_NUM, "");
                    }
                    if (downloadedDataModel.getMovieImage() != null) {
                        contentValues.put(KEY_MOVIE_IMAGE, downloadedDataModel.getMovieImage());
                    } else {
                        contentValues.put(KEY_MOVIE_IMAGE, "");
                    }
                    if (downloadedDataModel.getMovieImage() != null) {
                        contentValues.put(KEY_MOVIE_URL, downloadedDataModel.getMovieURL());
                    } else {
                        contentValues.put(KEY_MOVIE_URL, "");
                    }
                    if (downloadedDataModel.getMovieState() != null) {
                        contentValues.put(KEY_MOVIE_STATE, downloadedDataModel.getMovieState());
                    } else {
                        contentValues.put(KEY_MOVIE_STATE, "");
                    }
                    contentValues.put(KEY_MOVIE_PERCENTAGE, downloadedDataModel.getMoviePercentage() != 0 ? Integer.valueOf(downloadedDataModel.getMoviePercentage()) : 0);
                    if (downloadedDataModel.getMovieType() != null) {
                        contentValues.put(KEY_MOVIE_TYPE, downloadedDataModel.getMovieType());
                    } else {
                        contentValues.put(KEY_MOVIE_TYPE, "");
                    }
                    if (downloadedDataModel.getMoviePercentage() != 0) {
                        contentValues.put(KEY_MOVIE_CURRENT_POSITION, Long.valueOf(downloadedDataModel.getMovieCurrentPosition()));
                    } else {
                        contentValues.put(KEY_MOVIE_CURRENT_POSITION, (Integer) 0);
                    }
                    writableDatabase.insert(TABLE_IPTV_DOWNLOADED, null, contentValues);
                    Log.i("valuesAre", contentValues.toString());
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
                Log.e("sdsadsd", "addAllAvailableChannel: Transaction end");
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public void deleteDownloadedData(int i9) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                writableDatabase.delete(TABLE_IPTV_DOWNLOADED, "id=" + i9, null);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
                Log.e("sdsadsd", "addAllAvailableChannel: Transaction end");
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public ArrayList<DownloadedDataModel> getDownloadedData() {
        ArrayList<DownloadedDataModel> arrayList = new ArrayList<>();
        SharepreferenceDBHandler.getUserID(this.context);
        SharepreferenceDBHandler.getCurrentAPPType(this.context);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_downloaded", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    DownloadedDataModel downloadedDataModel = new DownloadedDataModel();
                    downloadedDataModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                    downloadedDataModel.setMovieName(cursorRawQuery.getString(1));
                    downloadedDataModel.setMovieExtension(cursorRawQuery.getString(2));
                    downloadedDataModel.setMovieStreamID(cursorRawQuery.getString(3));
                    downloadedDataModel.setMovieDuration(cursorRawQuery.getString(4));
                    downloadedDataModel.setMovieNum(cursorRawQuery.getString(5));
                    downloadedDataModel.setMovieImage(cursorRawQuery.getString(6));
                    downloadedDataModel.setMovieURL(cursorRawQuery.getString(7));
                    downloadedDataModel.setMovieState(cursorRawQuery.getString(8));
                    downloadedDataModel.setMoviePercentage(cursorRawQuery.getInt(9));
                    downloadedDataModel.setMovieType(cursorRawQuery.getString(10));
                    downloadedDataModel.setMovieCurrentPosition(cursorRawQuery.getLong(11));
                    Log.i("cursorVal", "valIS:" + cursorRawQuery.getLong(11));
                    arrayList.add(downloadedDataModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.CREATE_TABLE_IPTV_DOWNLOADED_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL(this.CREATE_TABLE_IPTV_DOWNLOADED_TABLE);
    }

    public void updateCurrentPosition(ArrayList<DownloadedDataModel> arrayList, int i9) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (DownloadedDataModel downloadedDataModel : arrayList) {
                    if (downloadedDataModel.getMovieCurrentPosition() != 0) {
                        contentValues.put(KEY_MOVIE_CURRENT_POSITION, Long.valueOf(downloadedDataModel.getMovieCurrentPosition()));
                    } else {
                        contentValues.put(KEY_MOVIE_CURRENT_POSITION, (Integer) 0);
                    }
                    writableDatabase.update(TABLE_IPTV_DOWNLOADED, contentValues, "id=" + i9, null);
                    Log.i("valuesAre", contentValues.toString());
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
                Log.e("sdsadsd", "addAllAvailableChannel: Transaction end");
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public void updateDownloadedData(ArrayList<DownloadedDataModel> arrayList, int i9) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (DownloadedDataModel downloadedDataModel : arrayList) {
                    contentValues.put(KEY_MOVIE_STATE, downloadedDataModel.getMovieState() != null ? downloadedDataModel.getMovieState() : "");
                    contentValues.put(KEY_MOVIE_PERCENTAGE, downloadedDataModel.getMoviePercentage() != 0 ? Integer.valueOf(downloadedDataModel.getMoviePercentage()) : 0);
                    writableDatabase.update(TABLE_IPTV_DOWNLOADED, contentValues, "id=" + i9, null);
                    Log.i("valuesAre", contentValues.toString());
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
                Log.e("sdsadsd", "addAllAvailableChannel: Transaction end");
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }
}
