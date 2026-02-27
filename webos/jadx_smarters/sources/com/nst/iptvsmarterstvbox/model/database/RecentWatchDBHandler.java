package com.nst.iptvsmarterstvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class RecentWatchDBHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "iptv_movie_streams_recent_watch.db";
    private static final int DATABASE_VERSION = 4;
    private static final String KEY_ADDED = "added";
    private static final String KEY_AVAIL_CHANNEL_CATEGORY_NAME = "category_name";
    private static final String KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION = "container_extension";
    private static final String KEY_AVAIL_CHANNEL_LINK = "movie_links";
    private static final String KEY_AVAIL_CHANNEL_LIVE = "live";
    private static final String KEY_AVAIL_CHANNEL_RATING_FROM_FIVE = "rating_from_five";
    private static final String KEY_AVAIL_CHANNEL_RATING_FROM_TEN = "rating_from_ten";
    private static final String KEY_AVAIL_CHANNEL_SERIES_NO = "series_no";
    private static final String KEY_AVAIL_CHANNEL_TYPE_NAME = "type_name";
    private static final String KEY_CATEGORY_ID_LIVE_STREAMS = "categoryID";
    private static final String KEY_CUSTOMER_SID = "custom_sid";
    private static final String KEY_DIRECT_SOURCE = "direct_source";
    private static final String KEY_EPG_CHANNEL_ID = "epg_channel_id";
    private static final String KEY_ID_LIVE_STREAMS = "id";
    private static final String KEY_IS_RECENT_WATCHED = "is_watched";
    private static final String KEY_MOVIE_DURTION = "movie_duration";
    private static final String KEY_MOVIE_ELAPSED_TIME = "movie_elapsed_time";
    private static final String KEY_NAME = "name";
    private static final String KEY_NUM_LIVE_STREAMS = "num";
    private static final String KEY_STREAM_ICON = "stream_icon";
    private static final String KEY_STREAM_ID = "stream_id";
    private static final String KEY_STRESM_TYPE = "stream_type";
    private static final String KEY_TV_ARCHIVE = "tv_archive";
    private static final String KEY_TV_ARCHIVE_DURATION = "tv_archive_duration";
    private static final String KEY_USER_ID = "user_id_referred";
    private static final String TABLE_IPTV_AVAILABLE_CHANNNELS = "iptv_movie_streams_recent_watch";
    private static final String TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM = "iptv_movie_streams_recent_watch_one_stream";
    private String ALTER_MOVIE_KEY_IS_RECENT_WATCHED;
    private String ALTER_RATING_COLUMN1;
    private String ALTER_RATING_COLUMN2;
    String CREATE_LIVE_AVAILABLE_CHANELS;
    String CREATE_LIVE_AVAILABLE_CHANELS_ONE_STREAM;
    Context context;
    SQLiteDatabase db;

    public RecentWatchDBHandler(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 4);
        this.CREATE_LIVE_AVAILABLE_CHANELS_ONE_STREAM = "CREATE TABLE IF NOT EXISTS iptv_movie_streams_recent_watch_one_stream(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,user_id_referred TEXT,movie_elapsed_time TEXT,movie_duration TEXT,is_watched TEXT,rating_from_ten TEXT,rating_from_five TEXT,movie_links TEXT)";
        this.CREATE_LIVE_AVAILABLE_CHANELS = "CREATE TABLE IF NOT EXISTS iptv_movie_streams_recent_watch(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,user_id_referred TEXT,movie_elapsed_time TEXT,movie_duration TEXT,is_watched TEXT,rating_from_ten TEXT,rating_from_five TEXT)";
        this.ALTER_MOVIE_KEY_IS_RECENT_WATCHED = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN is_watched TEXT;";
        this.ALTER_RATING_COLUMN1 = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN rating_from_ten TEXT;";
        this.ALTER_RATING_COLUMN2 = "ALTER TABLE iptv_movie_streams_recent_watch ADD COLUMN rating_from_five TEXT;";
        this.context = context;
    }

    public void addAllAvailableChannel(PanelAvailableChannelsPojo panelAvailableChannelsPojo) {
        String str;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            if (panelAvailableChannelsPojo.getNum() != null) {
                contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(panelAvailableChannelsPojo.getNum()));
            } else {
                contentValues.put(KEY_NUM_LIVE_STREAMS, "");
            }
            if (panelAvailableChannelsPojo.getName() != null) {
                contentValues.put(KEY_NAME, panelAvailableChannelsPojo.getName());
            } else {
                contentValues.put(KEY_NAME, "");
            }
            if (panelAvailableChannelsPojo.getStreamType() != null) {
                contentValues.put(KEY_STRESM_TYPE, panelAvailableChannelsPojo.getStreamType());
            } else {
                contentValues.put(KEY_STRESM_TYPE, "");
            }
            if (panelAvailableChannelsPojo.getStreamId() != null) {
                contentValues.put(KEY_STREAM_ID, panelAvailableChannelsPojo.getStreamId());
            } else {
                contentValues.put(KEY_STREAM_ID, "");
            }
            if (panelAvailableChannelsPojo.getStreamIcon() != null) {
                contentValues.put(KEY_STREAM_ICON, panelAvailableChannelsPojo.getStreamIcon());
            } else {
                contentValues.put(KEY_STREAM_ICON, "");
            }
            if (panelAvailableChannelsPojo.getEpgChannelId() != null) {
                contentValues.put(KEY_EPG_CHANNEL_ID, panelAvailableChannelsPojo.getEpgChannelId());
            } else {
                contentValues.put(KEY_EPG_CHANNEL_ID, "");
            }
            if (panelAvailableChannelsPojo.getAdded() != null) {
                contentValues.put(KEY_ADDED, panelAvailableChannelsPojo.getAdded());
            } else {
                contentValues.put(KEY_ADDED, "");
            }
            if (panelAvailableChannelsPojo.getCategoryId() != null) {
                contentValues.put(KEY_CATEGORY_ID_LIVE_STREAMS, panelAvailableChannelsPojo.getCategoryId());
            } else {
                contentValues.put(KEY_CATEGORY_ID_LIVE_STREAMS, "");
            }
            if (panelAvailableChannelsPojo.getCustomSid() != null) {
                contentValues.put(KEY_CUSTOMER_SID, panelAvailableChannelsPojo.getCustomSid());
            } else {
                contentValues.put(KEY_CUSTOMER_SID, "");
            }
            if (panelAvailableChannelsPojo.getTvArchive() != null) {
                contentValues.put(KEY_TV_ARCHIVE, panelAvailableChannelsPojo.getTvArchive());
            } else {
                contentValues.put(KEY_TV_ARCHIVE, "");
            }
            if (panelAvailableChannelsPojo.getDirectSource() != null) {
                contentValues.put(KEY_DIRECT_SOURCE, panelAvailableChannelsPojo.getDirectSource());
            } else {
                contentValues.put(KEY_DIRECT_SOURCE, "");
            }
            if (panelAvailableChannelsPojo.getTvArchiveDuration() != null) {
                contentValues.put(KEY_TV_ARCHIVE_DURATION, panelAvailableChannelsPojo.getTvArchiveDuration());
            } else {
                contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
            }
            if (panelAvailableChannelsPojo.getTypeName() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, String.valueOf(panelAvailableChannelsPojo.getTypeName()));
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
            }
            if (panelAvailableChannelsPojo.getCategoryName() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, panelAvailableChannelsPojo.getCategoryName());
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
            }
            if (panelAvailableChannelsPojo.getSeriesNo() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, String.valueOf(panelAvailableChannelsPojo.getSeriesNo()));
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
            }
            if (panelAvailableChannelsPojo.getLive() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, String.valueOf(panelAvailableChannelsPojo.getSeriesNo()));
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
            }
            if (panelAvailableChannelsPojo.getLive() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_LIVE, panelAvailableChannelsPojo.getLive());
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
            }
            if (panelAvailableChannelsPojo.getContainerExtension() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, String.valueOf(panelAvailableChannelsPojo.getContainerExtension()));
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, "");
            }
            contentValues.put(KEY_USER_ID, panelAvailableChannelsPojo.getUserIdReferred() != -1 ? Integer.valueOf(panelAvailableChannelsPojo.getUserIdReferred()) : -1);
            if (panelAvailableChannelsPojo.getMovieElapsedTime() != -1) {
                contentValues.put(KEY_MOVIE_ELAPSED_TIME, Long.valueOf(panelAvailableChannelsPojo.getMovieElapsedTime()));
            } else {
                contentValues.put(KEY_MOVIE_ELAPSED_TIME, (Integer) (-1));
            }
            if (panelAvailableChannelsPojo.getMovieDuration() != -1) {
                contentValues.put(KEY_MOVIE_DURTION, Long.valueOf(panelAvailableChannelsPojo.getMovieDuration()));
            } else {
                contentValues.put(KEY_MOVIE_DURTION, (Integer) (-1));
            }
            contentValues.put(KEY_IS_RECENT_WATCHED, "1");
            if (panelAvailableChannelsPojo.getRatingFromTen() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, panelAvailableChannelsPojo.getRatingFromTen());
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, "");
            }
            if (panelAvailableChannelsPojo.getRatingFromFive() != null) {
                contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, String.valueOf(panelAvailableChannelsPojo.getRatingFromFive()));
            } else {
                contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, "");
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                if (panelAvailableChannelsPojo.getUrl() != null) {
                    contentValues.put(KEY_AVAIL_CHANNEL_LINK, String.valueOf(panelAvailableChannelsPojo.getUrl()));
                } else {
                    contentValues.put(KEY_AVAIL_CHANNEL_LINK, "");
                }
                str = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
            } else {
                str = TABLE_IPTV_AVAILABLE_CHANNNELS;
            }
            writableDatabase.insert(str, null, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void addMoviesWatchedFromBackup(ArrayList<LiveStreamsDBModel> arrayList) {
        String str;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                contentValues.put(KEY_NUM_LIVE_STREAMS, arrayList.get(i9).getNum());
                contentValues.put(KEY_NAME, arrayList.get(i9).getName());
                contentValues.put(KEY_STRESM_TYPE, arrayList.get(i9).getStreamType());
                contentValues.put(KEY_STREAM_ID, arrayList.get(i9).getStreamId());
                contentValues.put(KEY_STREAM_ICON, arrayList.get(i9).getStreamIcon());
                contentValues.put(KEY_EPG_CHANNEL_ID, "");
                contentValues.put(KEY_ADDED, arrayList.get(i9).getAdded());
                contentValues.put(KEY_CATEGORY_ID_LIVE_STREAMS, arrayList.get(i9).getCategoryId());
                contentValues.put(KEY_CUSTOMER_SID, "");
                contentValues.put(KEY_TV_ARCHIVE, "");
                contentValues.put(KEY_DIRECT_SOURCE, "");
                contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
                contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
                contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
                contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
                contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, arrayList.get(i9).getContaiinerExtension());
                contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                contentValues.put(KEY_MOVIE_ELAPSED_TIME, Long.valueOf(arrayList.get(i9).getMovieElapsedTime()));
                contentValues.put(KEY_MOVIE_DURTION, Long.valueOf(arrayList.get(i9).getMovieDuraton()));
                contentValues.put(KEY_IS_RECENT_WATCHED, arrayList.get(i9).getIsRecentlyWatched());
                contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, arrayList.get(i9).getRatingFromTen());
                contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, arrayList.get(i9).getRatingFromFive());
                if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                    contentValues.put(KEY_AVAIL_CHANNEL_LINK, arrayList.get(i9).getLinks());
                    str = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
                } else {
                    str = TABLE_IPTV_AVAILABLE_CHANNNELS;
                }
                writableDatabase.insert(str, null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void deletRecentWatchForThisUser(int i9) {
        SQLiteDatabase sQLiteDatabase;
        String str;
        StringBuilder sb;
        try {
            this.db = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sQLiteDatabase = this.db;
                str = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
                sb = new StringBuilder();
                sb.append("user_id_referred='");
                sb.append(i9);
                sb.append("'");
            } else {
                sQLiteDatabase = this.db;
                str = TABLE_IPTV_AVAILABLE_CHANNNELS;
                sb = new StringBuilder();
                sb.append("user_id_referred='");
                sb.append(i9);
                sb.append("'");
            }
            sQLiteDatabase.delete(str, sb.toString(), null);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void deleteALLRecentwatch(String str, int i9) {
        SQLiteDatabase sQLiteDatabase;
        String str2;
        String str3;
        this.db = getWritableDatabase();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sQLiteDatabase = this.db;
            str2 = "stream_type='" + str + "' AND " + KEY_USER_ID + "=" + i9 + "";
            str3 = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
        } else {
            sQLiteDatabase = this.db;
            str2 = "stream_type='" + str + "' AND " + KEY_USER_ID + "=" + i9 + "";
            str3 = TABLE_IPTV_AVAILABLE_CHANNNELS;
        }
        sQLiteDatabase.delete(str3, str2, null);
        this.db.close();
    }

    public void deleteAndRecreateAllTables() {
        try {
            getReadableDatabase();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL(SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api") ? "DROP TABLE IF EXISTS iptv_movie_streams_recent_watch_one_stream" : "DROP TABLE IF EXISTS iptv_movie_streams_recent_watch");
            onCreate(writableDatabase);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteContinueWatchingAfterUpdate(String str) {
        StringBuilder sb;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sb = new StringBuilder();
                sb.append("DELETE FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(KEY_STREAM_ID);
                sb.append(" IN (");
                sb.append(str);
                sb.append(")");
            } else {
                sb = new StringBuilder();
                sb.append("DELETE FROM iptv_movie_streams_recent_watch WHERE user_id_referred = '");
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

    public void deleteMovieRecentWatch(String str) {
        SQLiteDatabase sQLiteDatabase;
        String str2;
        StringBuilder sb;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            this.db = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sQLiteDatabase = this.db;
                str2 = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
                sb = new StringBuilder();
                sb.append("stream_id='");
                sb.append(str);
                sb.append("'  AND  ");
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(userID);
                sb.append("");
            } else {
                sQLiteDatabase = this.db;
                str2 = TABLE_IPTV_AVAILABLE_CHANNNELS;
                sb = new StringBuilder();
                sb.append("stream_id='");
                sb.append(str);
                sb.append("'  AND  ");
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(userID);
                sb.append("");
            }
            sQLiteDatabase.delete(str2, sb.toString(), null);
            this.db.close();
        } catch (Exception unused) {
        }
    }

    public void deleteRecentwatch(int i9, String str) {
        SQLiteDatabase sQLiteDatabase;
        String str2;
        StringBuilder sb;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            this.db = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sQLiteDatabase = this.db;
                str2 = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
                sb = new StringBuilder();
                sb.append("stream_id='");
                sb.append(i9);
                sb.append("'  AND ");
                sb.append(KEY_STRESM_TYPE);
                sb.append("='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(userID);
                sb.append("");
            } else {
                sQLiteDatabase = this.db;
                str2 = TABLE_IPTV_AVAILABLE_CHANNNELS;
                sb = new StringBuilder();
                sb.append("stream_id='");
                sb.append(i9);
                sb.append("'  AND ");
                sb.append(KEY_STRESM_TYPE);
                sb.append("='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(userID);
                sb.append("");
            }
            sQLiteDatabase.delete(str2, sb.toString(), null);
            this.db.close();
        } catch (Exception unused) {
        }
    }

    public ArrayList<LiveStreamsDBModel> getAllLiveStreasWithCategoryId(String str, int i9, String str2) {
        ArrayList<LiveStreamsDBModel> arrayList;
        Object obj;
        String string;
        StringBuilder sb;
        ArrayList<LiveStreamsDBModel> arrayList2;
        StringBuilder sb2;
        ArrayList<LiveStreamsDBModel> arrayList3 = new ArrayList<>();
        if (str2.equals("getalldata")) {
            String vODSubCatSort = SharepreferenceDBHandler.getVODSubCatSort(this.context);
            arrayList = arrayList3;
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                if (vODSubCatSort.equals("0")) {
                    sb2 = new StringBuilder();
                } else if (vODSubCatSort.equals("1")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=");
                    sb2.append(i9);
                    sb2.append(" ORDER BY ");
                    sb2.append("id");
                    sb2.append(" DESC");
                    string = sb2.toString();
                    obj = "onestream_api";
                } else if (vODSubCatSort.equals("2")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=");
                    sb2.append(i9);
                    sb2.append(" ORDER BY ");
                    sb2.append(KEY_NAME);
                    sb2.append(" ASC");
                    string = sb2.toString();
                    obj = "onestream_api";
                } else if (vODSubCatSort.equals("3")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=");
                    sb2.append(i9);
                    sb2.append(" ORDER BY ");
                    sb2.append(KEY_NAME);
                    sb2.append(" DESC");
                    string = sb2.toString();
                    obj = "onestream_api";
                } else {
                    sb2 = new StringBuilder();
                }
                sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=");
                sb2.append(i9);
                sb2.append("");
                string = sb2.toString();
                obj = "onestream_api";
            } else {
                if (vODSubCatSort.equals("0")) {
                    sb2 = new StringBuilder();
                } else if (vODSubCatSort.equals("1")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch WHERE user_id_referred=");
                    sb2.append(i9);
                    sb2.append(" ORDER BY ");
                    sb2.append("id");
                    sb2.append(" DESC");
                    string = sb2.toString();
                    obj = "onestream_api";
                } else if (vODSubCatSort.equals("2")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch WHERE user_id_referred=");
                    sb2.append(i9);
                    sb2.append(" ORDER BY ");
                    sb2.append(KEY_NAME);
                    sb2.append(" ASC");
                    string = sb2.toString();
                    obj = "onestream_api";
                } else if (vODSubCatSort.equals("3")) {
                    sb2 = new StringBuilder();
                    sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch WHERE user_id_referred=");
                    sb2.append(i9);
                    sb2.append(" ORDER BY ");
                    sb2.append(KEY_NAME);
                    sb2.append(" DESC");
                    string = sb2.toString();
                    obj = "onestream_api";
                } else {
                    sb2 = new StringBuilder();
                }
                sb2.append("SELECT  * FROM iptv_movie_streams_recent_watch WHERE user_id_referred=");
                sb2.append(i9);
                sb2.append("");
                string = sb2.toString();
                obj = "onestream_api";
            }
        } else {
            arrayList = arrayList3;
            if (str2.equals("getOnedata")) {
                obj = "onestream_api";
                if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals(obj)) {
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=");
                } else {
                    sb = new StringBuilder();
                    sb.append("SELECT  * FROM iptv_movie_streams_recent_watch WHERE user_id_referred=");
                }
                sb.append(i9);
                sb.append(" ORDER BY ");
                sb.append(KEY_ADDED);
                sb.append(" ASC LIMIT 1");
                string = sb.toString();
            } else {
                obj = "onestream_api";
                string = null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
                if (cursorRawQuery.moveToFirst()) {
                    while (true) {
                        LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                        try {
                            liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                        } catch (NumberFormatException unused) {
                        }
                        liveStreamsDBModel.setNum(cursorRawQuery.getString(1));
                        liveStreamsDBModel.setName(cursorRawQuery.getString(2));
                        liveStreamsDBModel.setStreamType(cursorRawQuery.getString(3));
                        liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(4));
                        liveStreamsDBModel.setStreamId(cursorRawQuery.getString(4));
                        liveStreamsDBModel.setStreamIcon(cursorRawQuery.getString(5));
                        liveStreamsDBModel.setEpgChannelId(cursorRawQuery.getString(6));
                        liveStreamsDBModel.setAdded(cursorRawQuery.getString(7));
                        liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(8));
                        liveStreamsDBModel.setCustomSid(cursorRawQuery.getString(9));
                        liveStreamsDBModel.setTvArchive(cursorRawQuery.getString(10));
                        liveStreamsDBModel.setDirectSource(cursorRawQuery.getString(11));
                        liveStreamsDBModel.setTvArchiveDuration(cursorRawQuery.getString(12));
                        liveStreamsDBModel.setTypeName(cursorRawQuery.getString(13));
                        liveStreamsDBModel.setCategoryName(cursorRawQuery.getString(14));
                        liveStreamsDBModel.setSeriesNo(cursorRawQuery.getString(15));
                        liveStreamsDBModel.setLive(cursorRawQuery.getString(16));
                        liveStreamsDBModel.setContaiinerExtension(cursorRawQuery.getString(17));
                        liveStreamsDBModel.setUserIdReffered(cursorRawQuery.getInt(18));
                        liveStreamsDBModel.setMovieElapsedTime(cursorRawQuery.getLong(19));
                        liveStreamsDBModel.setMovieDuraton(cursorRawQuery.getLong(20));
                        liveStreamsDBModel.setIsRecentlyWatched(cursorRawQuery.getString(21));
                        liveStreamsDBModel.setRatingFromTen(cursorRawQuery.getString(22));
                        liveStreamsDBModel.setRatingFromFive(cursorRawQuery.getString(23));
                        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals(obj)) {
                            liveStreamsDBModel.setLinks(cursorRawQuery.getString(24));
                        }
                        arrayList2 = arrayList;
                        arrayList2.add(liveStreamsDBModel);
                        if (!cursorRawQuery.moveToNext()) {
                            break;
                        }
                        arrayList = arrayList2;
                    }
                } else {
                    arrayList2 = arrayList;
                }
                cursorRawQuery.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused2) {
                return null;
            } catch (SQLiteException unused3) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused4) {
            return null;
        } catch (SQLiteException unused5) {
            return null;
        }
    }

    public ArrayList<LiveStreamsDBModel> getAllMoviesContinueWatchingStreamIDs() {
        StringBuilder sb;
        String str;
        int i9;
        SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT stream_id FROM iptv_movie_streams_recent_watch_one_stream WHERE stream_type LIKE '%movie%' AND user_id_referred=";
        } else {
            sb = new StringBuilder();
            str = "SELECT stream_id FROM iptv_movie_streams_recent_watch WHERE stream_type LIKE '%movie%' AND user_id_referred=";
        }
        sb.append(str);
        sb.append(SharepreferenceDBHandler.getUserID(this.context));
        sb.append(" ");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    String string = "";
                    try {
                        i9 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                        i9 = 0;
                    }
                    try {
                        string = cursorRawQuery.getString(0);
                    } catch (Exception unused2) {
                    }
                    liveStreamsDBModel.setStreamId(String.valueOf(i9));
                    liveStreamsDBModel.setStreamIdOneStream(string);
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused3) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0091 A[Catch: SQLiteDatabaseLockedException | SQLiteException -> 0x0193, LOOP:0: B:20:0x0091->B:38:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteDatabaseLockedException | SQLiteException -> 0x0193, blocks: (B:18:0x0083, B:20:0x0091, B:22:0x0097, B:22:0x0097, B:24:0x00a3, B:24:0x00a3, B:26:0x017d, B:26:0x017d, B:27:0x0186, B:27:0x0186, B:29:0x018f, B:29:0x018f), top: B:35:0x0083 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel> getAllVodContiueWatching(java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler.getAllVodContiueWatching(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public ArrayList<LiveStreamsDBModel> getAllVodContiueWatchingforBackup() {
        StringBuilder sb;
        String str;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT  movie_elapsed_time,movie_duration,is_watched,stream_id FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=";
        } else {
            sb = new StringBuilder();
            str = "SELECT  movie_elapsed_time,movie_duration,is_watched,stream_id FROM iptv_movie_streams_recent_watch WHERE user_id_referred=";
        }
        sb.append(str);
        sb.append(userID);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setMovieElapsedTime(cursorRawQuery.getLong(0));
                    liveStreamsDBModel.setMovieDuraton(cursorRawQuery.getLong(1));
                    liveStreamsDBModel.setIsRecentlyWatched(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(3));
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return null;
        }
    }

    public int getLiveStreamsCount(int i9) {
        StringBuilder sb;
        String str;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred='";
        } else {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred='";
        }
        sb.append(str);
        sb.append(i9);
        sb.append("'");
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

    public ArrayList<LiveStreamsDBModel> getRecentWatchedByStreamID(int i9) {
        StringBuilder sb;
        String str;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT * FROM iptv_movie_streams_recent_watch_one_stream WHERE stream_id = '";
        } else {
            sb = new StringBuilder();
            str = "SELECT * FROM iptv_movie_streams_recent_watch WHERE stream_id = '";
        }
        sb.append(str);
        sb.append(i9);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append(" = '");
        sb.append(userID);
        sb.append("' ORDER BY ");
        sb.append("id");
        sb.append(" DESC LIMIT 1");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    try {
                        liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                    } catch (NumberFormatException unused) {
                    }
                    liveStreamsDBModel.setNum(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setName(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setStreamType(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setStreamIcon(cursorRawQuery.getString(5));
                    liveStreamsDBModel.setEpgChannelId(cursorRawQuery.getString(6));
                    liveStreamsDBModel.setAdded(cursorRawQuery.getString(7));
                    liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(8));
                    liveStreamsDBModel.setCustomSid(cursorRawQuery.getString(9));
                    liveStreamsDBModel.setTvArchive(cursorRawQuery.getString(10));
                    liveStreamsDBModel.setDirectSource(cursorRawQuery.getString(11));
                    liveStreamsDBModel.setTvArchiveDuration(cursorRawQuery.getString(12));
                    liveStreamsDBModel.setTypeName(cursorRawQuery.getString(13));
                    liveStreamsDBModel.setCategoryName(cursorRawQuery.getString(14));
                    liveStreamsDBModel.setSeriesNo(cursorRawQuery.getString(15));
                    liveStreamsDBModel.setLive(cursorRawQuery.getString(16));
                    liveStreamsDBModel.setContaiinerExtension(cursorRawQuery.getString(17));
                    liveStreamsDBModel.setUserIdReffered(cursorRawQuery.getInt(18));
                    liveStreamsDBModel.setMovieElapsedTime(cursorRawQuery.getLong(19));
                    liveStreamsDBModel.setMovieDuraton(cursorRawQuery.getLong(20));
                    liveStreamsDBModel.setIsRecentlyWatched(cursorRawQuery.getString(21));
                    liveStreamsDBModel.setRatingFromTen(cursorRawQuery.getString(22));
                    liveStreamsDBModel.setRatingFromFive(cursorRawQuery.getString(23));
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                        liveStreamsDBModel.setLinks(cursorRawQuery.getString(24));
                    }
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            return null;
        }
    }

    public ArrayList<LiveStreamsDBModel> getRecentWatchedByStreamIDOneStream(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT * FROM iptv_movie_streams_recent_watch_one_stream WHERE stream_id = '";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT * FROM iptv_movie_streams_recent_watch WHERE stream_id = '";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append(" = '");
        sb.append(userID);
        sb.append("' ORDER BY ");
        sb.append("id");
        sb.append(" DESC LIMIT 1");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    try {
                        liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                    } catch (NumberFormatException unused) {
                    }
                    liveStreamsDBModel.setNum(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setName(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setStreamType(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setStreamIcon(cursorRawQuery.getString(5));
                    liveStreamsDBModel.setEpgChannelId(cursorRawQuery.getString(6));
                    liveStreamsDBModel.setAdded(cursorRawQuery.getString(7));
                    liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(8));
                    liveStreamsDBModel.setCustomSid(cursorRawQuery.getString(9));
                    liveStreamsDBModel.setTvArchive(cursorRawQuery.getString(10));
                    liveStreamsDBModel.setDirectSource(cursorRawQuery.getString(11));
                    liveStreamsDBModel.setTvArchiveDuration(cursorRawQuery.getString(12));
                    liveStreamsDBModel.setTypeName(cursorRawQuery.getString(13));
                    liveStreamsDBModel.setCategoryName(cursorRawQuery.getString(14));
                    liveStreamsDBModel.setSeriesNo(cursorRawQuery.getString(15));
                    liveStreamsDBModel.setLive(cursorRawQuery.getString(16));
                    liveStreamsDBModel.setContaiinerExtension(cursorRawQuery.getString(17));
                    liveStreamsDBModel.setUserIdReffered(cursorRawQuery.getInt(18));
                    liveStreamsDBModel.setMovieElapsedTime(cursorRawQuery.getLong(19));
                    liveStreamsDBModel.setMovieDuraton(cursorRawQuery.getLong(20));
                    liveStreamsDBModel.setIsRecentlyWatched(cursorRawQuery.getString(21));
                    liveStreamsDBModel.setRatingFromTen(cursorRawQuery.getString(22));
                    liveStreamsDBModel.setRatingFromFive(cursorRawQuery.getString(23));
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                        liveStreamsDBModel.setLinks(cursorRawQuery.getString(24));
                    }
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            return null;
        }
    }

    public int getRecentwatchmoviesCount(int i9) {
        StringBuilder sb;
        String str;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=";
        } else {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred=";
        }
        sb.append(str);
        sb.append(i9);
        sb.append("");
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

    public ArrayList<LiveStreamsDBModel> getStreamStatus(String str, int i9) {
        StringBuilder sb;
        String str2;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT * FROM iptv_movie_streams_recent_watch_one_stream WHERE stream_id = '";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT * FROM iptv_movie_streams_recent_watch WHERE stream_id = '";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append(" = '");
        sb.append(i9);
        sb.append("' LIMIT 1");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    try {
                        liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                    } catch (NumberFormatException unused) {
                    }
                    liveStreamsDBModel.setNum(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setName(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setStreamType(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setStreamIcon(cursorRawQuery.getString(5));
                    liveStreamsDBModel.setEpgChannelId(cursorRawQuery.getString(6));
                    liveStreamsDBModel.setAdded(cursorRawQuery.getString(7));
                    liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(8));
                    liveStreamsDBModel.setCustomSid(cursorRawQuery.getString(9));
                    liveStreamsDBModel.setTvArchive(cursorRawQuery.getString(10));
                    liveStreamsDBModel.setDirectSource(cursorRawQuery.getString(11));
                    liveStreamsDBModel.setTvArchiveDuration(cursorRawQuery.getString(12));
                    liveStreamsDBModel.setTypeName(cursorRawQuery.getString(13));
                    liveStreamsDBModel.setCategoryName(cursorRawQuery.getString(14));
                    liveStreamsDBModel.setSeriesNo(cursorRawQuery.getString(15));
                    liveStreamsDBModel.setLive(cursorRawQuery.getString(16));
                    liveStreamsDBModel.setContaiinerExtension(cursorRawQuery.getString(17));
                    liveStreamsDBModel.setUserIdReffered(cursorRawQuery.getInt(18));
                    liveStreamsDBModel.setMovieElapsedTime(cursorRawQuery.getLong(19));
                    liveStreamsDBModel.setMovieDuraton(cursorRawQuery.getLong(20));
                    liveStreamsDBModel.setIsRecentlyWatched(cursorRawQuery.getString(21));
                    liveStreamsDBModel.setRatingFromTen(cursorRawQuery.getString(22));
                    liveStreamsDBModel.setRatingFromFive(cursorRawQuery.getString(23));
                    if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                        liveStreamsDBModel.setLinks(cursorRawQuery.getString(24));
                    }
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused2) {
            return null;
        }
    }

    public int getUncatCount(String str, String str2) {
        StringBuilder sb;
        String str3;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str3 = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch_one_stream WHERE ( stream_type LIKE '%";
        } else {
            sb = new StringBuilder();
            str3 = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE ( stream_type LIKE '%";
        }
        sb.append(str3);
        sb.append(str2);
        sb.append("%' OR ");
        sb.append(KEY_STRESM_TYPE);
        sb.append(" LIKE '%radio%' )  AND ");
        sb.append(KEY_CATEGORY_ID_LIVE_STREAMS);
        sb.append("='");
        sb.append(str);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    public int getVodRecentwatchmCount() {
        StringBuilder sb;
        String str;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch_one_stream WHERE user_id_referred=";
        } else {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE user_id_referred=";
        }
        sb.append(str);
        sb.append(userID);
        sb.append(" AND ");
        sb.append(KEY_IS_RECENT_WATCHED);
        sb.append("=1");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            return 0;
        }
    }

    public int isStreamAvailable(String str, int i9) {
        StringBuilder sb;
        String str2;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch_one_stream WHERE stream_id='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM iptv_movie_streams_recent_watch WHERE stream_id='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(i9);
        sb.append("'");
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
        sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS_ONE_STREAM);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (i9 < 2) {
            sQLiteDatabase.execSQL(this.ALTER_MOVIE_KEY_IS_RECENT_WATCHED);
        }
        if (i9 < 3) {
            sQLiteDatabase.execSQL(this.ALTER_RATING_COLUMN1);
            sQLiteDatabase.execSQL(this.ALTER_RATING_COLUMN2);
        }
    }

    public int updateAllRecordsRecentWatchDB() {
        String str;
        StringBuilder sb;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_IS_RECENT_WATCHED, "0");
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                str = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
                sb = new StringBuilder();
                sb.append("user_id_referred=");
                sb.append(userID);
            } else {
                str = TABLE_IPTV_AVAILABLE_CHANNNELS;
                sb = new StringBuilder();
                sb.append("user_id_referred=");
                sb.append(userID);
            }
            return writableDatabase.update(str, contentValues, sb.toString(), null);
        } catch (Exception unused) {
            return 0;
        }
    }

    public int updateAllRecordsRecentWatchDB(String str) {
        String str2;
        StringBuilder sb;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        SQLiteDatabase writableDatabase = getWritableDatabase();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_IS_RECENT_WATCHED, "0");
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                str2 = TABLE_IPTV_AVAILABLE_CHANNNELS_ONE_STREAM;
                sb = new StringBuilder();
                sb.append("stream_id='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(userID);
            } else {
                str2 = TABLE_IPTV_AVAILABLE_CHANNNELS;
                sb = new StringBuilder();
                sb.append("stream_id=");
                sb.append(str);
                sb.append(" AND ");
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(userID);
            }
            return writableDatabase.update(str2, contentValues, sb.toString(), null);
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bd A[Catch: SQLiteException -> 0x0101, SQLiteDatabaseLockedException -> 0x0105, TRY_LEAVE, TryCatch #3 {SQLiteDatabaseLockedException -> 0x0105, SQLiteException -> 0x0101, blocks: (B:3:0x000e, B:6:0x0024, B:7:0x0049, B:9:0x0077, B:12:0x0088, B:14:0x008e, B:17:0x00a2, B:24:0x00b7, B:26:0x00bd, B:29:0x00e2, B:32:0x00f7, B:30:0x00ec, B:35:0x00fd, B:20:0x00a9, B:22:0x00ad, B:8:0x0051), top: B:43:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean updateResumePlayerStatuTimes(java.lang.String r16, java.lang.String r17, boolean r18, long r19, long r21, int r23) {
        /*
            Method dump skipped, instruction units count: 265
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler.updateResumePlayerStatuTimes(java.lang.String, java.lang.String, boolean, long, long, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x009c A[Catch: SQLiteException -> 0x00d7, SQLiteDatabaseLockedException -> 0x00db, TRY_LEAVE, TryCatch #3 {SQLiteDatabaseLockedException -> 0x00db, SQLiteException -> 0x00d7, blocks: (B:3:0x0007, B:6:0x001b, B:7:0x0034, B:9:0x0056, B:12:0x0067, B:14:0x006d, B:17:0x0081, B:24:0x0096, B:26:0x009c, B:29:0x00b8, B:32:0x00cd, B:30:0x00c2, B:35:0x00d3, B:20:0x0088, B:22:0x008c, B:8:0x003c), top: B:43:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00d1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean updateResumePlayerStatus(java.lang.String r10, java.lang.String r11, boolean r12, long r13) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.RecentWatchDBHandler.updateResumePlayerStatus(java.lang.String, java.lang.String, boolean, long):boolean");
    }
}
