package com.nst.iptvsmarterstvbox.model.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.AsyncTask;
import android.util.Log;
import com.amazonaws.services.s3.internal.Constants;
import com.amazonaws.services.s3.model.InstructionFileId;
import com.nst.iptvsmarterstvbox.model.FavouriteDBModel;
import com.nst.iptvsmarterstvbox.model.FavouriteM3UModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel;
import com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel;
import com.nst.iptvsmarterstvbox.model.M3UCategoriesModel;
import com.nst.iptvsmarterstvbox.model.OneStreamLiveStreamDataModel;
import com.nst.iptvsmarterstvbox.model.OneStreamMovieStreamDataModel;
import com.nst.iptvsmarterstvbox.model.OneStreamSeriesStreamDataModel;
import com.nst.iptvsmarterstvbox.model.callback.GetEpisdoeDetailsCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCallback;
import com.nst.iptvsmarterstvbox.model.callback.GetSeriesStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.LiveStreamsCallback;
import com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetGenresCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetSeriesCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.StalkerGetVodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodCategoriesCallback;
import com.nst.iptvsmarterstvbox.model.callback.VodStreamsCallback;
import com.nst.iptvsmarterstvbox.model.pojo.LiveDataModel;
import com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo;
import com.nst.iptvsmarterstvbox.model.pojo.StalkerGetAllChannelsPojo2;
import com.nst.iptvsmarterstvbox.model.pojo.XMLTVProgrammePojo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import m7.w;
import org.simpleframework.xml.strategy.Name;
import u7.C2858a;

/* JADX INFO: loaded from: classes.dex */
public class LiveStreamDBHandler extends SQLiteOpenHelper {
    private static final String DATABASE_NAME = "iptv_live_streams_tv.db";
    private static final int DATABASE_VERSION = 12;
    private static final String KEY_ADDED = "added";
    private static final String KEY_ADDED_VOD = "added";
    private static final String KEY_APP_TYPE = "app_type";
    private static final String KEY_AUTO_ID = "auto_id";
    private static final String KEY_AVAIL_CHANNEL_CATEGORY_NAME = "category_name";
    private static final String KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION = "container_extension";
    private static final String KEY_AVAIL_CHANNEL_IS_ADULT = "is_adult";
    private static final String KEY_AVAIL_CHANNEL_LINKS = "links";
    private static final String KEY_AVAIL_CHANNEL_LIVE = "live";
    private static final String KEY_AVAIL_CHANNEL_RATING_FROM_FIVE = "rating_from_five";
    private static final String KEY_AVAIL_CHANNEL_RATING_FROM_TEN = "rating_from_ten";
    private static final String KEY_AVAIL_CHANNEL_SERIES_NO = "series_no";
    private static final String KEY_AVAIL_CHANNEL_TYPE_NAME = "type_name";
    private static final String KEY_AVAIL_CHANNEL_URL = "url";
    private static final String KEY_AVAIL_CHANNEL_URL_FIRE_DB = "url_fire_db";
    private static final String KEY_BACKDROPE = "backdrop";
    private static final String KEY_CAST = "cast_series_stream_v2";
    private static final String KEY_CATEGORY_ALIAS_LIVE = "category_alias_live";
    private static final String KEY_CATEGORY_ALIAS_MOVIE = "category_alias_movie";
    private static final String KEY_CATEGORY_ALIAS_SERIES = "category_alias_series_v2";
    private static final String KEY_CATEGORY_CENSORED_LIVE = "category_censored_live";
    private static final String KEY_CATEGORY_CENSORED_MOVIE = "category_censored_movie";
    private static final String KEY_CATEGORY_CENSORED_SERIES = "category_censored_series_v2";
    private static final String KEY_CATEGORY_ID = "categoryID";
    private static final String KEY_CATEGORY_ID_LIVE = "categoryID_live";
    private static final String KEY_CATEGORY_ID_LIVE_STREAMS = "categoryID";
    private static final String KEY_CATEGORY_ID_MOVIE = "categoryID_movie";
    private static final String KEY_CATEGORY_ID_S = "category_id_series_stream_v2";
    private static final String KEY_CATEGORY_ID_SERIES = "category_id_series_v2";
    private static final String KEY_CATEGORY_ID_VOD = "categoryId";
    private static final String KEY_CATEGORY_NAME = "categoryname";
    private static final String KEY_CATEGORY_NAME_LIVE = "categoryname_live";
    private static final String KEY_CATEGORY_NAME_MOVIE = "categoryname_movie";
    private static final String KEY_CATEGORY_NAME_SERIES = "category_name_series_v2";
    private static final String KEY_CHANNEL_ID = "channel_id";
    private static final String KEY_CMD = "cmd";
    private static final String KEY_CONTAINER_EXT_VOD = "containerExtension";
    private static final String KEY_COVER = "stream_cover_series_stream_v2";
    private static final String KEY_CUSTOMER_SID = "custom_sid";
    private static final String KEY_CUSTOM_SID_VOD = "customSid";
    private static final String KEY_DATE_IMPORT_STATUS = "date";
    private static final String KEY_DB_CATEGORY = "iptv_db_updated_status_category";
    private static final String KEY_DB_CATEGORY_ID = "iptv_db_updated_status_category_id";
    private static final String KEY_DB_LAST_UPDATED_DATE = "iptv_db_updated_status_last_updated_date";
    private static final String KEY_DB_SERIES_M3U_STREAM_CAT_ID = "series_m3u_stream_container_cat_id";
    private static final String KEY_DB_SERIES_M3U_STREAM_EXT = "series_m3u_stream_container_ext";
    private static final String KEY_DB_SERIES_M3U_STREAM_ID = "series_m3u_stream_id";
    private static final String KEY_DB_SERIES_M3U_STREAM_IMAGE = "series_m3u_stream_container_image";
    private static final String KEY_DB_SERIES_M3U_STREAM_TITLE = "series_m3u_stream_title";
    private static final String KEY_DB_STATUS_STATE = "iptv_db_updated_status_state";
    private static final String KEY_DEFAULT_SOURCE = "default_source";
    private static final String KEY_DESCRIPTION = "description";
    private static final String KEY_DIRECTOR = "director_series_stream_v2";
    private static final String KEY_DIRECT_SOURCE = "direct_source";
    private static final String KEY_DIRECT_SOURCE_VOD = "directSource";
    private static final String KEY_EPGURL = "epgurl";
    private static final String KEY_EPG_CHANNEL_ID = "epg_channel_id";
    private static final String KEY_GENERE = "genre_series_stream_v2";
    private static final String KEY_ID = "id";
    private static final String KEY_ID_AUTO_EPG = "id_epg_aut0";
    private static final String KEY_ID_AUTO_VOD = "id_auto_vod";
    private static final String KEY_ID_DB_UPDATE_STATUS = "iptv_db_update_status_id";
    private static final String KEY_ID_IMPORT_STATUS = "id";
    private static final String KEY_ID_LIVE = "id_live";
    private static final String KEY_ID_LIVE_STREAMS = "id";
    private static final String KEY_ID_MAG_PORTAL = "id_auto_mag";
    private static final String KEY_ID_MOVIE = "id_movie";
    private static final String KEY_ID_PARENT_ID = "paent_id";
    private static final String KEY_ID_PASWORD = "id_password";
    private static final String KEY_ID_PASWORD_STATUS = "id_password_status";
    private static final String KEY_ID_SERIES_M3U_STREAMS_AUTO_INC = "series_m3u_streams_auto_inc";
    private static final String KEY_ID_SERIES_STREAMS = "id_series_stream_v2";
    private static final String KEY_ID_VOD = "id_series_v2";
    private static final String KEY_LAST_MODIFIED = "last_modified_series_stream_v2";
    private static final String KEY_MAG_PORTAL = "mag_portal";
    private static final String KEY_MOVE_TO = "move_to";
    private static final String KEY_MOVIE_DURTION = "movie_duration";
    private static final String KEY_MOVIE_ELAPSED_TIME = "movie_elapsed_time";
    private static final String KEY_NAME = "name";
    private static final String KEY_NAME_S = "name_series_stream_v2";
    private static final String KEY_NAME_VOD = "name";
    private static final String KEY_NUM_LIVE_STREAMS = "num";
    private static final String KEY_NUM_SERIES_STREAMS = "num_series_stream_v2";
    private static final String KEY_NUM_VOD = "num_";
    private static final String KEY_PASSWORD_STATUS = "password_status";
    private static final String KEY_PASSWORD_STATUS_CAT_ID = "password_status_cat_id";
    private static final String KEY_PASSWORD_USER_DETAIL = "user_detail";
    private static final String KEY_PLOT = "plot_series_stream_v2";
    private static final String KEY_RATING = "rating_series_stream_v2";
    private static final String KEY_RELEASE_DATE = "release_date_series_stream_v2";
    private static final String KEY_SERIAL_NO_VOD = "seriesNo";
    private static final String KEY_SERIES_ID = "stream_id_series_stream_v2";
    private static final String KEY_SOURCE_NAME = "name";
    private static final String KEY_SOURCE_REF_ID = "source_ref_id";
    private static final String KEY_SOURCE_TYPE = "source_type";
    private static final String KEY_START = "start";
    private static final String KEY_STATUS_IMPORT_STATUS = "status";
    private static final String KEY_STOP = "stop";
    private static final String KEY_STREAMTYPE_VOD = "streamType";
    private static final String KEY_STREAM_ICON = "stream_icon";
    private static final String KEY_STREAM_ICON_VOD = "streamIcon";
    private static final String KEY_STREAM_ID = "stream_id";
    private static final String KEY_STREAM_ID_URL = "stream_id_url";
    private static final String KEY_STREAM_ID_VOD = "streamId";
    private static final String KEY_STREAM_TYPE = "stream_type_series_stream_v2";
    private static final String KEY_STRESM_TYPE = "stream_type";
    private static final String KEY_TIME_IMPORT_STATUS = "time";
    private static final String KEY_TITLE = "title";
    private static final String KEY_TV_ARCHIVE = "tv_archive";
    private static final String KEY_TV_ARCHIVE_DURATION = "tv_archive_duration";
    private static final String KEY_TYPE = "type";
    private static final String KEY_TYPE_IMPORT_STATUS = "type";
    private static final String KEY_URL = "url";
    private static final String KEY_USER_DETAIL = "password_user_detail";
    private static final String KEY_USER_ID = "user_id_referred";
    private static final String KEY_USER_PASSWORD = "password";
    private static final String KEY_YOUTUBE_TRAILER = "youtube_trailer";
    private static final String TABLE_DATABASE_IMPORT_STATUS = "iptv_import_status";
    private static final String TABLE_DATABASE_UPDATE_STATUS = "iptv_db_update_status";
    private static final String TABLE_EPG = "epg";
    private static final String TABLE_EPG_M3U = "epg_m3u";
    private static final String TABLE_EPG_SOURCES = "iptv_epg_sources";
    private static final String TABLE_EPG_SOURCES_M3U = "iptv_epg_sources_m3u";
    private static final String TABLE_IPTV_ALL_M3U_CATEGORY = "iptv_m3u_all_category";
    private static final String TABLE_IPTV_AVAILABLE_CHANNNELS = "iptv_live_streams";
    private static final String TABLE_IPTV_AVAILABLE_CHANNNELS_ALL_M3U = "iptv_live_streams_m3u_all";
    private static final String TABLE_IPTV_AVAILABLE_CHANNNELS_M3U = "iptv_live_streams_m3u";
    private static final String TABLE_IPTV_FAVOURITES_M3U = "iptv_m3u_favourites";
    private static final String TABLE_IPTV_LIVE_CATEGORY = "iptv_live_category";
    private static final String TABLE_IPTV_LIVE_CATEGORY_M3U = "iptv_live_category_m3u";
    private static final String TABLE_IPTV_LIVE_STREAMS_CATEGORY = "iptv_live_streams_category";
    private static final String TABLE_IPTV_LIVE_WATCHED = "iptv_live_watched";
    private static final String TABLE_IPTV_MAG_PORTAL = "iptv_mag_portal_table";
    private static final String TABLE_IPTV_MOVIE_CATEGORY = "iptv_movie_category";
    private static final String TABLE_IPTV_MOVIE_CATEGORY_M3U = "iptv_movie_category_m3u";
    private static final String TABLE_IPTV_ONESTREAM_LIVE_CATEGORY = "iptv_onestream_live_category";
    private static final String TABLE_IPTV_ONSESTREAM_MOVIE_CATEGORY = "iptv_onestream_movie_category";
    private static final String TABLE_IPTV_PASSWORD = "iptv_password_table";
    private static final String TABLE_IPTV_PASSWORD_M3U = "iptv_password_table_m3u";
    private static final String TABLE_IPTV_PASSWORD_STATUS = "iptv_password_status_table";
    private static final String TABLE_IPTV_PASSWORD_STATUS_M3U = "iptv_password_status_table_m3u";
    private static final String TABLE_IPTV_RECENT_WATCHED_M3U = "iptv_recent_watched_m3u";
    private static final String TABLE_IPTV_SERIES_CATEGORY = "series_category_v2";
    private static final String TABLE_IPTV_SERIES_CATEGORY_M3U = "iptv_series_category_m3u";
    private static final String TABLE_IPTV_SERIES_STREAMS = "series_streams_v2";
    private static final String TABLE_IPTV_STALKER_ALL_CHANNNELS = "iptv_stalker_live_streams";
    private static final String TABLE_IPTV_STALKER_LIVE_CATEGORY = "iptv_stalker_live_category";
    private static final String TABLE_IPTV_STALKER_MOVIE_CATEGORY = "iptv_stalker_movie_category";
    private static final String TABLE_IPTV_STALKER_SERIES_CATEGORY = "iptv_stalker_series_category";
    private static final String TABLE_IPTV_VOD_STREAMS = "iptv_vod_streams";
    private static final String TABLE_M3U_SERIES_STREAMS = "series_m3u_streams";
    private static final String TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS = "onestream_iptv_live_streams";
    private static final String TABLE_ONESTREAM_IPTV_SERIES_CATEGORY = "onestream_series_category_v2";
    private static final String TABLE_ONESTREAM_IPTV_SERIES_STREAMS = "onestream_series_streams_v2";
    private String ALTER_PASSWORD_STATUS_TABLE_2;
    private String ALTER_PASSWORD_TABLE_1;
    private String ALTER_RATING_COLUMN1;
    private String ALTER_RATING_COLUMN2;
    private String ALTER_TYPE_COLUMN_RECENT_WATCHED_CHANNNELS;
    private String ALTER_URL_FIREBASE_DB_CHANNNELS_ALL_M3U;
    private String ALTER_URL_FIREBASE_DB_CHANNNELS_M3U;
    private String ALTER_URL_FIREBASE_DB_WATCHED_M3U;
    String CREATE_DB_UPDATED_STATUS_TABLE;
    String CREATE_EPG_M3U_TABLE;
    String CREATE_EPG_TABLE;
    String CREATE_FAV_M3U_TABLE;
    String CREATE_LIVE_AVAILABLE_CHANELS;
    String CREATE_LIVE_AVAILABLE_CHANELS_ALL_M3U;
    String CREATE_LIVE_AVAILABLE_CHANELS_M3U;
    String CREATE_LIVE_CATEGORY_TABLE;
    String CREATE_LIVE_CATEGORY_TABLE_M3U;
    String CREATE_LIVE_ONESTREAM_AVAILABLE_CHANELS;
    String CREATE_LIVE_STALKER_AVAILABLE_CHANNELS;
    String CREATE_LIVE_STALKER_CATEGORY_TABLE;
    String CREATE_LIVE_STREAM_CATEGORY_TABLE;
    String CREATE_LIVE_WATCHED_TABLE;
    String CREATE_M3U_CATEGORY_TABLE;
    String CREATE_M3U_SERIES_STREAMS_TABLE;
    String CREATE_MAG_PORTAL_TABLE;
    String CREATE_MOVIE_CATEGORY_TABLE;
    String CREATE_MOVIE_CATEGORY_TABLE_M3U;
    String CREATE_MOVIE_STALKER_CATEGORY_TABLE;
    String CREATE_ONESTREAM_LIVE_CATEGORY_TABLE;
    String CREATE_ONESTREAM_MOVIE_CATEGORY_TABLE;
    String CREATE_ONESTREAM_SERIES_CATEGORY_TABLE;
    String CREATE_ONESTREAM_SERIES_STREAMS;
    String CREATE_PASSWORD_STATUS_TABLE;
    String CREATE_PASSWORD_STATUS_TABLE_M3U;
    String CREATE_PASSWORD_TABLE;
    String CREATE_PASSWORD_TABLE_M3U;
    String CREATE_RECENT_WATCHED_M3U;
    String CREATE_SERIES_CATEGORY_TABLE;
    String CREATE_SERIES_CATEGORY_TABLE_M3U;
    String CREATE_SERIES_STALKER_CATEGORY_TABLE;
    String CREATE_SERIES_STREAMS;
    String CREATE_TABLE_EPG_SOURCES;
    String CREATE_TABLE_EPG_SOURCES_M3U;
    String CREATE_VOD_TABLE;
    Context context;
    SQLiteDatabase db;
    private int totalMilliSec;

    public LiveStreamDBHandler(Context context) {
        super(context, DATABASE_NAME, (SQLiteDatabase.CursorFactory) null, 12);
        this.totalMilliSec = 0;
        this.CREATE_LIVE_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_live_category(id_live INTEGER PRIMARY KEY,categoryID_live TEXT,categoryname_live TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.CREATE_MOVIE_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_movie_category(id_movie INTEGER PRIMARY KEY,categoryID_movie TEXT,categoryname_movie TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.CREATE_LIVE_STREAM_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_live_streams_category(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT)";
        this.CREATE_M3U_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_m3u_all_category(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.CREATE_ONESTREAM_MOVIE_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_onestream_movie_category(id_movie INTEGER PRIMARY KEY,categoryID_movie TEXT,categoryname_movie TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.CREATE_ONESTREAM_LIVE_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_onestream_live_category(id_live INTEGER PRIMARY KEY,categoryID_live TEXT,categoryname_live TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.CREATE_LIVE_CATEGORY_TABLE_M3U = "CREATE TABLE IF NOT EXISTS iptv_live_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.CREATE_MOVIE_CATEGORY_TABLE_M3U = "CREATE TABLE IF NOT EXISTS iptv_movie_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,paent_id TEXT,user_id_referred TEXT)";
        this.CREATE_SERIES_CATEGORY_TABLE_M3U = "CREATE TABLE IF NOT EXISTS iptv_series_category_m3u(id INTEGER PRIMARY KEY,categoryID TEXT,categoryname TEXT,user_id_referred TEXT)";
        this.CREATE_PASSWORD_TABLE = "CREATE TABLE IF NOT EXISTS iptv_password_table(id_password INTEGER PRIMARY KEY,user_detail TEXT,password TEXT,user_id_referred TEXT)";
        this.CREATE_PASSWORD_TABLE_M3U = "CREATE TABLE IF NOT EXISTS iptv_password_table_m3u(id_password INTEGER PRIMARY KEY,user_detail TEXT,password TEXT,user_id_referred TEXT)";
        this.ALTER_PASSWORD_TABLE_1 = "ALTER TABLE iptv_password_table ADD COLUMN user_id_referred TEXT;";
        this.CREATE_PASSWORD_STATUS_TABLE = "CREATE TABLE IF NOT EXISTS iptv_password_status_table(id_password_status INTEGER PRIMARY KEY,password_status_cat_id TEXT,password_user_detail TEXT,password_status TEXT,user_id_referred TEXT)";
        this.CREATE_PASSWORD_STATUS_TABLE_M3U = "CREATE TABLE IF NOT EXISTS iptv_password_status_table_m3u(id_password_status INTEGER PRIMARY KEY,password_status_cat_id TEXT,password_user_detail TEXT,password_status TEXT,user_id_referred TEXT)";
        this.ALTER_PASSWORD_STATUS_TABLE_2 = "ALTER TABLE iptv_password_status_table ADD COLUMN user_id_referred TEXT;";
        this.CREATE_LIVE_ONESTREAM_AVAILABLE_CHANELS = "CREATE TABLE IF NOT EXISTS onestream_iptv_live_streams(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,rating_from_ten TEXT,rating_from_five TEXT,links TEXT,is_adult TEXT,user_id_referred TEXT)";
        this.CREATE_LIVE_AVAILABLE_CHANELS = "CREATE TABLE IF NOT EXISTS iptv_live_streams(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,rating_from_ten TEXT,rating_from_five TEXT,user_id_referred TEXT)";
        this.CREATE_LIVE_STALKER_AVAILABLE_CHANNELS = "CREATE TABLE IF NOT EXISTS iptv_stalker_live_streams(id INTEGER PRIMARY KEY,stream_id TEXT,num TEXT,name TEXT,cmd TEXT,stream_icon TEXT,epg_channel_id TEXT,categoryID TEXT,tv_archive TEXT,user_id_referred TEXT)";
        this.CREATE_LIVE_AVAILABLE_CHANELS_M3U = "CREATE TABLE IF NOT EXISTS iptv_live_streams_m3u(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,url TEXT,user_id_referred TEXT,url_fire_db TEXT)";
        this.CREATE_RECENT_WATCHED_M3U = "CREATE TABLE IF NOT EXISTS iptv_recent_watched_m3u(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,container_extension TEXT,url TEXT,user_id_referred TEXT,movie_elapsed_time TEXT,movie_duration TEXT,url_fire_db TEXT)";
        this.CREATE_LIVE_AVAILABLE_CHANELS_ALL_M3U = "CREATE TABLE IF NOT EXISTS iptv_live_streams_m3u_all(id INTEGER PRIMARY KEY,num TEXT,name TEXT,stream_type TEXT,stream_id TEXT,stream_icon TEXT,epg_channel_id TEXT,added TEXT,categoryID TEXT,custom_sid TEXT,tv_archive TEXT,direct_source TEXT,tv_archive_duration TEXT,type_name TEXT,category_name TEXT,series_no TEXT,live TEXT,url TEXT,container_extension TEXT,user_id_referred TEXT,move_to TEXT,url_fire_db TEXT)";
        this.CREATE_EPG_TABLE = "CREATE TABLE IF NOT EXISTS epg(id_epg_aut0 INTEGER PRIMARY KEY,title TEXT,start TEXT,stop TEXT,description TEXT,channel_id TEXT,user_id_referred TEXT,source_ref_id TEXT)";
        this.CREATE_EPG_M3U_TABLE = "CREATE TABLE IF NOT EXISTS epg_m3u(id_epg_aut0 INTEGER PRIMARY KEY,title TEXT,start TEXT,stop TEXT,description TEXT,channel_id TEXT,user_id_referred TEXT,source_ref_id TEXT)";
        this.CREATE_FAV_M3U_TABLE = "CREATE TABLE IF NOT EXISTS iptv_m3u_favourites(id INTEGER PRIMARY KEY,url TEXT,user_id_referred TEXT,name TEXT,categoryID TEXT)";
        this.CREATE_VOD_TABLE = "CREATE TABLE IF NOT EXISTS iptv_vod_streams(id_auto_vod INTEGER PRIMARY KEY,num_ TEXT,name TEXT,streamType TEXT,streamId TEXT,streamIcon TEXT,added TEXT,categoryId TEXT,seriesNo TEXT,containerExtension TEXT,customSid TEXT,directSource TEXT)";
        this.CREATE_DB_UPDATED_STATUS_TABLE = "CREATE TABLE IF NOT EXISTS iptv_import_status(id INTEGER PRIMARY KEY,type TEXT,status TEXT,date TEXT,time TEXT,user_id_referred TEXT,app_type TEXT,source_ref_id TEXT)";
        this.CREATE_MAG_PORTAL_TABLE = "CREATE TABLE IF NOT EXISTS iptv_mag_portal_table(id_auto_mag INTEGER PRIMARY KEY,mag_portal TEXT)";
        this.CREATE_M3U_SERIES_STREAMS_TABLE = "CREATE TABLE IF NOT EXISTS series_m3u_streams(series_m3u_streams_auto_inc INTEGER PRIMARY KEY,series_m3u_stream_id TEXT,series_m3u_stream_title TEXT,series_m3u_stream_container_ext TEXT,series_m3u_stream_container_image TEXT,series_m3u_stream_container_cat_id TEXT)";
        this.ALTER_RATING_COLUMN1 = "ALTER TABLE iptv_live_streams ADD COLUMN rating_from_ten TEXT;";
        this.ALTER_RATING_COLUMN2 = "ALTER TABLE iptv_live_streams ADD COLUMN rating_from_five TEXT;";
        this.ALTER_URL_FIREBASE_DB_CHANNNELS_ALL_M3U = "ALTER TABLE iptv_live_streams_m3u_all ADD COLUMN url_fire_db TEXT;";
        this.ALTER_URL_FIREBASE_DB_WATCHED_M3U = "ALTER TABLE iptv_recent_watched_m3u ADD COLUMN url_fire_db TEXT;";
        this.ALTER_URL_FIREBASE_DB_CHANNNELS_M3U = "ALTER TABLE iptv_live_streams_m3u ADD COLUMN url_fire_db TEXT;";
        this.CREATE_TABLE_EPG_SOURCES = "CREATE TABLE IF NOT EXISTS iptv_epg_sources(auto_id INTEGER PRIMARY KEY,user_id_referred TEXT,name TEXT,source_type TEXT,epgurl TEXT,default_source TEXT)";
        this.CREATE_TABLE_EPG_SOURCES_M3U = "CREATE TABLE IF NOT EXISTS iptv_epg_sources_m3u(auto_id INTEGER PRIMARY KEY,user_id_referred TEXT,name TEXT,source_type TEXT,epgurl TEXT,default_source TEXT)";
        this.CREATE_LIVE_WATCHED_TABLE = "CREATE TABLE IF NOT EXISTS iptv_live_watched(id INTEGER PRIMARY KEY,stream_id_url TEXT,user_id_referred TEXT,app_type TEXT,type TEXT)";
        this.ALTER_TYPE_COLUMN_RECENT_WATCHED_CHANNNELS = "ALTER TABLE iptv_live_watched ADD COLUMN type TEXT;";
        this.CREATE_LIVE_STALKER_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_stalker_live_category(id_live INTEGER PRIMARY KEY,categoryID_live TEXT,categoryname_live TEXT,category_alias_live TEXT,category_censored_live TEXT,user_id_referred TEXT)";
        this.CREATE_MOVIE_STALKER_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_stalker_movie_category(id_movie INTEGER PRIMARY KEY,categoryID_movie TEXT,categoryname_movie TEXT,category_alias_movie TEXT,category_censored_movie TEXT,user_id_referred TEXT)";
        this.CREATE_SERIES_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS series_category_v2(id_series_v2 INTEGER PRIMARY KEY,category_name_series_v2 TEXT,category_id_series_v2 TEXT,user_id_referred TEXT)";
        this.CREATE_ONESTREAM_SERIES_STREAMS = "CREATE TABLE IF NOT EXISTS onestream_series_streams_v2(id_series_stream_v2 INTEGER PRIMARY KEY,num_series_stream_v2 TEXT,name_series_stream_v2 TEXT,stream_type_series_stream_v2 TEXT,stream_id_series_stream_v2 TEXT,stream_cover_series_stream_v2 TEXT,plot_series_stream_v2 TEXT,cast_series_stream_v2 TEXT,director_series_stream_v2 TEXT,genre_series_stream_v2 TEXT,release_date_series_stream_v2 TEXT,last_modified_series_stream_v2 TEXT,rating_series_stream_v2 TEXT,category_id_series_stream_v2 TEXT,youtube_trailer TEXT,backdrop TEXT,user_id_referred TEXT)";
        this.CREATE_ONESTREAM_SERIES_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS onestream_series_category_v2(id_series_v2 INTEGER PRIMARY KEY,category_name_series_v2 TEXT,category_id_series_v2 TEXT,user_id_referred TEXT)";
        this.CREATE_SERIES_STALKER_CATEGORY_TABLE = "CREATE TABLE IF NOT EXISTS iptv_stalker_series_category(id_series_v2 INTEGER PRIMARY KEY,category_name_series_v2 TEXT,category_id_series_v2 TEXT,category_alias_series_v2 TEXT,category_censored_series_v2 TEXT,user_id_referred TEXT)";
        this.CREATE_SERIES_STREAMS = "CREATE TABLE IF NOT EXISTS series_streams_v2(id_series_stream_v2 INTEGER PRIMARY KEY,num_series_stream_v2 TEXT,name_series_stream_v2 TEXT,stream_type_series_stream_v2 TEXT,stream_id_series_stream_v2 TEXT,stream_cover_series_stream_v2 TEXT,plot_series_stream_v2 TEXT,cast_series_stream_v2 TEXT,director_series_stream_v2 TEXT,genre_series_stream_v2 TEXT,release_date_series_stream_v2 TEXT,last_modified_series_stream_v2 TEXT,rating_series_stream_v2 TEXT,category_id_series_stream_v2 TEXT,youtube_trailer TEXT,backdrop TEXT,user_id_referred TEXT)";
        this.context = context;
    }

    private int checkUnCategoryCountLive(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM iptv_onestream_live_category WHERE categoryID_live ='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM iptv_live_category WHERE categoryID_live ='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    private int checkUnCategoryCountMovies(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM iptv_onestream_movie_category WHERE categoryID_movie ='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM iptv_movie_category WHERE categoryID_movie ='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    private int checkUnCategoryCountSeries(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM onestream_series_category_v2 WHERE category_id_series_v2 ='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM series_category_v2 WHERE category_id_series_v2 ='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append(" = '");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void addALLM3UCategories(Map<String, M3UCategoriesModel> map) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (M3UCategoriesModel m3UCategoriesModel : map.values()) {
                    if (m3UCategoriesModel.getCategoryId() != null) {
                        contentValues.put("categoryID", m3UCategoriesModel.getCategoryId());
                    } else {
                        contentValues.put("categoryID", "");
                    }
                    if (m3UCategoriesModel.getCategoryName() != null) {
                        contentValues.put(KEY_CATEGORY_NAME, m3UCategoriesModel.getCategoryName());
                    } else {
                        contentValues.put(KEY_CATEGORY_NAME, "");
                    }
                    contentValues.put(KEY_USER_ID, Integer.valueOf(SharepreferenceDBHandler.getUserID(this.context)));
                    writableDatabase.insert(TABLE_IPTV_ALL_M3U_CATEGORY, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public void addAllAvailableChannel(PanelAvailableChannelsPojo panelAvailableChannelsPojo, String str) {
        String str2;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                if (panelAvailableChannelsPojo.getNum() != null) {
                    contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(panelAvailableChannelsPojo.getNum()));
                } else {
                    contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                }
                if (panelAvailableChannelsPojo.getName() != null) {
                    contentValues.put("name", panelAvailableChannelsPojo.getName());
                } else {
                    contentValues.put("name", "");
                }
                contentValues.put(KEY_STRESM_TYPE, str);
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
                    contentValues.put("added", panelAvailableChannelsPojo.getAdded());
                } else {
                    contentValues.put("added", "");
                }
                if (panelAvailableChannelsPojo.getCategoryId() != null) {
                    contentValues.put("categoryID", panelAvailableChannelsPojo.getCategoryId());
                } else {
                    contentValues.put("categoryID", "");
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
                if (panelAvailableChannelsPojo.getUrl() != null) {
                    contentValues.put("url", panelAvailableChannelsPojo.getUrl());
                    contentValues.put(KEY_AVAIL_CHANNEL_URL_FIRE_DB, panelAvailableChannelsPojo.getUrl().replaceAll("/", "").replaceAll("\\.", ""));
                } else {
                    contentValues.put("url", "");
                    contentValues.put(KEY_AVAIL_CHANNEL_URL_FIRE_DB, "");
                }
                contentValues.put(KEY_USER_ID, Integer.valueOf(SharepreferenceDBHandler.getUserID(this.context)));
                writableDatabase.insert(TABLE_IPTV_RECENT_WATCHED_M3U, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (SQLiteDatabaseLockedException unused) {
                writableDatabase.endTransaction();
                str2 = "msg";
                Log.w(str2, "exception");
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                str2 = "msg";
                Log.w(str2, "exception");
            }
        } catch (Exception unused3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0185 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:101:0x018d A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0198 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a4 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01ad A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b9 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c2 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01ca A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01d5 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e1 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01ec A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01f4 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01ff A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x020b A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bb A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c3 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ce A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00d6 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00e1 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e9 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0117 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0122 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012a A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0135 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x013d A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0148 A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0150 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x015b A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0163 A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016e A[Catch: Exception -> 0x0229, TRY_ENTER, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x017a A[Catch: Exception -> 0x0229, TryCatch #0 {Exception -> 0x0229, blocks: (B:3:0x0007, B:4:0x001a, B:6:0x0020, B:9:0x0030, B:11:0x003f, B:14:0x0047, B:16:0x0052, B:19:0x005c, B:20:0x0060, B:39:0x00a0, B:42:0x00a8, B:44:0x00b3, B:47:0x00bb, B:49:0x00c6, B:52:0x00ce, B:54:0x00d9, B:57:0x00e1, B:59:0x00ec, B:62:0x00f6, B:64:0x00fc, B:67:0x0104, B:70:0x010f, B:72:0x011a, B:75:0x0122, B:77:0x012d, B:80:0x0135, B:82:0x0140, B:85:0x0148, B:87:0x0153, B:90:0x015b, B:92:0x0166, B:95:0x016e, B:97:0x017d, B:100:0x0185, B:102:0x0190, B:105:0x0198, B:107:0x01a7, B:109:0x01ad, B:111:0x01bc, B:113:0x01c2, B:115:0x01cd, B:118:0x01d5, B:120:0x01e4, B:123:0x01ec, B:125:0x01f7, B:128:0x01ff, B:130:0x020e, B:129:0x020b, B:124:0x01f4, B:119:0x01e1, B:114:0x01ca, B:110:0x01b9, B:106:0x01a4, B:101:0x018d, B:96:0x017a, B:91:0x0163, B:86:0x0150, B:81:0x013d, B:76:0x012a, B:71:0x0117, B:58:0x00e9, B:53:0x00d6, B:48:0x00c3, B:43:0x00b0, B:21:0x0064, B:23:0x006a, B:25:0x0070, B:30:0x0082, B:28:0x007a, B:32:0x0088, B:35:0x0092, B:38:0x009d, B:15:0x004f, B:10:0x003c, B:131:0x021f), top: B:136:0x0007, outer: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addAllAvailableChannel(java.util.Map<java.lang.String, com.nst.iptvsmarterstvbox.model.pojo.PanelAvailableChannelsPojo> r11) {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.addAllAvailableChannel(java.util.Map):void");
    }

    public boolean addAllAvailableChannel(List<LiveStreamsCallback> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    int userID = SharepreferenceDBHandler.getUserID(this.context);
                    ContentValues contentValues = new ContentValues();
                    for (LiveStreamsCallback liveStreamsCallback : list) {
                        w.f44704q = true;
                        if (liveStreamsCallback.getNum() != null) {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(liveStreamsCallback.getNum()));
                        } else {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                        }
                        if (liveStreamsCallback.getName() != null) {
                            contentValues.put("name", liveStreamsCallback.getName());
                        } else {
                            contentValues.put("name", "");
                        }
                        if (liveStreamsCallback.getStreamType() != null) {
                            contentValues.put(KEY_STRESM_TYPE, liveStreamsCallback.getStreamType());
                        } else {
                            contentValues.put(KEY_STRESM_TYPE, "");
                        }
                        if (liveStreamsCallback.getStreamId() != null) {
                            contentValues.put(KEY_STREAM_ID, liveStreamsCallback.getStreamId());
                        } else {
                            contentValues.put(KEY_STREAM_ID, "");
                        }
                        if (liveStreamsCallback.getStreamIcon() != null) {
                            contentValues.put(KEY_STREAM_ICON, liveStreamsCallback.getStreamIcon());
                        } else {
                            contentValues.put(KEY_STREAM_ICON, "");
                        }
                        if (liveStreamsCallback.getEpgChannelId() != null) {
                            contentValues.put(KEY_EPG_CHANNEL_ID, liveStreamsCallback.getEpgChannelId());
                        } else {
                            contentValues.put(KEY_EPG_CHANNEL_ID, "");
                        }
                        if (liveStreamsCallback.getAdded() != null) {
                            contentValues.put("added", liveStreamsCallback.getAdded());
                        } else {
                            contentValues.put("added", "");
                        }
                        if (liveStreamsCallback.getCategoryId() == null || checkUnCategoryCountLive(liveStreamsCallback.getCategoryId()) <= 0) {
                            contentValues.put("categoryID", "-2");
                        } else {
                            contentValues.put("categoryID", liveStreamsCallback.getCategoryId());
                        }
                        if (liveStreamsCallback.getCustomSid() != null) {
                            contentValues.put(KEY_CUSTOMER_SID, liveStreamsCallback.getCustomSid());
                        } else {
                            contentValues.put(KEY_CUSTOMER_SID, "");
                        }
                        if (liveStreamsCallback.getTvArchive() != null) {
                            contentValues.put(KEY_TV_ARCHIVE, liveStreamsCallback.getTvArchive());
                        } else {
                            contentValues.put(KEY_TV_ARCHIVE, "");
                        }
                        if (liveStreamsCallback.getDirectSource() != null) {
                            contentValues.put(KEY_DIRECT_SOURCE, liveStreamsCallback.getDirectSource());
                        } else {
                            contentValues.put(KEY_DIRECT_SOURCE, "");
                        }
                        if (liveStreamsCallback.getTvArchiveDuration() != null) {
                            contentValues.put(KEY_TV_ARCHIVE_DURATION, liveStreamsCallback.getTvArchiveDuration());
                        } else {
                            contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
                        }
                        contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, "");
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        writableDatabase.insert(TABLE_IPTV_AVAILABLE_CHANNNELS, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public void addAllAvailableChannelM3U(ArrayList<LiveStreamsDBModel> arrayList, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                for (LiveStreamsDBModel liveStreamsDBModel : arrayList) {
                    if (liveStreamsDBModel.getName() == null) {
                        Log.e("sdsadsd", "addAllAvailableChannel:" + liveStreamsDBModel.getName());
                    }
                    if (liveStreamsDBModel.getNum() != null) {
                        contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(liveStreamsDBModel.getNum()));
                    } else {
                        contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                    }
                    if (liveStreamsDBModel.getName() != null) {
                        contentValues.put("name", liveStreamsDBModel.getName());
                    } else {
                        contentValues.put("name", "");
                    }
                    contentValues.put(KEY_STRESM_TYPE, str);
                    if (liveStreamsDBModel.getStreamId() != null) {
                        contentValues.put(KEY_STREAM_ID, liveStreamsDBModel.getStreamId());
                    } else {
                        contentValues.put(KEY_STREAM_ID, "");
                    }
                    if (liveStreamsDBModel.getStreamIcon() != null) {
                        contentValues.put(KEY_STREAM_ICON, liveStreamsDBModel.getStreamIcon());
                    } else {
                        contentValues.put(KEY_STREAM_ICON, "");
                    }
                    if (liveStreamsDBModel.getEpgChannelId() != null) {
                        contentValues.put(KEY_EPG_CHANNEL_ID, liveStreamsDBModel.getEpgChannelId());
                    } else {
                        contentValues.put(KEY_EPG_CHANNEL_ID, "");
                    }
                    if (liveStreamsDBModel.getAdded() != null) {
                        contentValues.put("added", liveStreamsDBModel.getAdded());
                    } else {
                        contentValues.put("added", "");
                    }
                    if (liveStreamsDBModel.getCategoryId() != null) {
                        contentValues.put("categoryID", liveStreamsDBModel.getCategoryId());
                    } else {
                        contentValues.put("categoryID", "");
                    }
                    if (liveStreamsDBModel.getCustomSid() != null) {
                        contentValues.put(KEY_CUSTOMER_SID, liveStreamsDBModel.getCustomSid());
                    } else {
                        contentValues.put(KEY_CUSTOMER_SID, "");
                    }
                    if (liveStreamsDBModel.getTvArchive() != null) {
                        contentValues.put(KEY_TV_ARCHIVE, liveStreamsDBModel.getTvArchive());
                    } else {
                        contentValues.put(KEY_TV_ARCHIVE, "");
                    }
                    if (liveStreamsDBModel.getDirectSource() != null) {
                        contentValues.put(KEY_DIRECT_SOURCE, liveStreamsDBModel.getDirectSource());
                    } else {
                        contentValues.put(KEY_DIRECT_SOURCE, "");
                    }
                    if (liveStreamsDBModel.getTvArchiveDuration() != null) {
                        contentValues.put(KEY_TV_ARCHIVE_DURATION, liveStreamsDBModel.getTvArchiveDuration());
                    } else {
                        contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
                    }
                    if (liveStreamsDBModel.getTypeName() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, String.valueOf(liveStreamsDBModel.getTypeName()));
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
                    }
                    if (liveStreamsDBModel.getCategoryName() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, liveStreamsDBModel.getCategoryName());
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                    }
                    if (liveStreamsDBModel.getSeriesNo() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, String.valueOf(liveStreamsDBModel.getSeriesNo()));
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
                    }
                    if (liveStreamsDBModel.getLive() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_LIVE, liveStreamsDBModel.getLive());
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
                    }
                    if (liveStreamsDBModel.getContaiinerExtension() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, String.valueOf(liveStreamsDBModel.getContaiinerExtension()));
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, "");
                    }
                    if (liveStreamsDBModel.getUrl() != null) {
                        contentValues.put("url", liveStreamsDBModel.getUrl());
                        contentValues.put(KEY_AVAIL_CHANNEL_URL_FIRE_DB, liveStreamsDBModel.getUrl().replaceAll("/", "").replaceAll("\\.", ""));
                    } else {
                        contentValues.put("url", "");
                        contentValues.put(KEY_AVAIL_CHANNEL_URL_FIRE_DB, "");
                    }
                    contentValues.put(KEY_USER_ID, Integer.valueOf(SharepreferenceDBHandler.getUserID(this.context)));
                    writableDatabase.insert(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U, null, contentValues);
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

    public boolean addAllAvailableChannelM3U_import(ArrayList<LiveStreamsDBModel> arrayList, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    for (LiveStreamsDBModel liveStreamsDBModel : arrayList) {
                        if (liveStreamsDBModel.getName() == null) {
                            Log.e("sdsadsd", "addAllAvailableChannel:" + liveStreamsDBModel.getName());
                        }
                        if (liveStreamsDBModel.getNum() != null) {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(liveStreamsDBModel.getNum()));
                        } else {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                        }
                        if (liveStreamsDBModel.getName() != null) {
                            contentValues.put("name", liveStreamsDBModel.getName());
                        } else {
                            contentValues.put("name", "");
                        }
                        contentValues.put(KEY_STRESM_TYPE, str);
                        if (liveStreamsDBModel.getStreamId() != null) {
                            contentValues.put(KEY_STREAM_ID, liveStreamsDBModel.getStreamId());
                        } else {
                            contentValues.put(KEY_STREAM_ID, "");
                        }
                        if (liveStreamsDBModel.getStreamIcon() != null) {
                            contentValues.put(KEY_STREAM_ICON, liveStreamsDBModel.getStreamIcon());
                        } else {
                            contentValues.put(KEY_STREAM_ICON, "");
                        }
                        if (liveStreamsDBModel.getEpgChannelId() != null) {
                            contentValues.put(KEY_EPG_CHANNEL_ID, liveStreamsDBModel.getEpgChannelId());
                        } else {
                            contentValues.put(KEY_EPG_CHANNEL_ID, "");
                        }
                        if (liveStreamsDBModel.getAdded() != null) {
                            contentValues.put("added", liveStreamsDBModel.getAdded());
                        } else {
                            contentValues.put("added", "");
                        }
                        if (liveStreamsDBModel.getCategoryId() != null) {
                            contentValues.put("categoryID", liveStreamsDBModel.getCategoryId());
                        } else {
                            contentValues.put("categoryID", "");
                        }
                        if (liveStreamsDBModel.getCustomSid() != null) {
                            contentValues.put(KEY_CUSTOMER_SID, liveStreamsDBModel.getCustomSid());
                        } else {
                            contentValues.put(KEY_CUSTOMER_SID, "");
                        }
                        if (liveStreamsDBModel.getTvArchive() != null) {
                            contentValues.put(KEY_TV_ARCHIVE, liveStreamsDBModel.getTvArchive());
                        } else {
                            contentValues.put(KEY_TV_ARCHIVE, "");
                        }
                        if (liveStreamsDBModel.getDirectSource() != null) {
                            contentValues.put(KEY_DIRECT_SOURCE, liveStreamsDBModel.getDirectSource());
                        } else {
                            contentValues.put(KEY_DIRECT_SOURCE, "");
                        }
                        if (liveStreamsDBModel.getTvArchiveDuration() != null) {
                            contentValues.put(KEY_TV_ARCHIVE_DURATION, liveStreamsDBModel.getTvArchiveDuration());
                        } else {
                            contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
                        }
                        if (liveStreamsDBModel.getTypeName() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, String.valueOf(liveStreamsDBModel.getTypeName()));
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
                        }
                        if (liveStreamsDBModel.getCategoryName() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, liveStreamsDBModel.getCategoryName());
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                        }
                        if (liveStreamsDBModel.getSeriesNo() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, String.valueOf(liveStreamsDBModel.getSeriesNo()));
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
                        }
                        if (liveStreamsDBModel.getLive() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_LIVE, liveStreamsDBModel.getLive());
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
                        }
                        if (liveStreamsDBModel.getContaiinerExtension() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, String.valueOf(liveStreamsDBModel.getContaiinerExtension()));
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, "");
                        }
                        if (liveStreamsDBModel.getUrl() != null) {
                            contentValues.put("url", liveStreamsDBModel.getUrl());
                            contentValues.put(KEY_AVAIL_CHANNEL_URL_FIRE_DB, liveStreamsDBModel.getUrl().replaceAll("/", "").replaceAll("\\.", ""));
                        } else {
                            contentValues.put("url", "");
                            contentValues.put(KEY_AVAIL_CHANNEL_URL_FIRE_DB, "");
                        }
                        contentValues.put(KEY_USER_ID, Integer.valueOf(SharepreferenceDBHandler.getUserID(this.context)));
                        writableDatabase.insert(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    writableDatabase.close();
                    Log.e("sdsadsd", "addAllAvailableChannel: Transaction end");
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean addAllAvailableMovies(List<VodStreamsCallback> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    int userID = SharepreferenceDBHandler.getUserID(this.context);
                    ContentValues contentValues = new ContentValues();
                    for (VodStreamsCallback vodStreamsCallback : list) {
                        w.f44704q = true;
                        if (vodStreamsCallback.getNum() != null) {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(vodStreamsCallback.getNum()));
                        } else {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                        }
                        if (vodStreamsCallback.getName() != null) {
                            contentValues.put("name", vodStreamsCallback.getName());
                        } else {
                            contentValues.put("name", "");
                        }
                        if (vodStreamsCallback.getStreamType() != null) {
                            contentValues.put(KEY_STRESM_TYPE, vodStreamsCallback.getStreamType());
                        } else {
                            contentValues.put(KEY_STRESM_TYPE, "");
                        }
                        if (vodStreamsCallback.getStreamId() != null) {
                            contentValues.put(KEY_STREAM_ID, vodStreamsCallback.getStreamId());
                        } else {
                            contentValues.put(KEY_STREAM_ID, "");
                        }
                        if (vodStreamsCallback.getStreamIcon() != null) {
                            contentValues.put(KEY_STREAM_ICON, vodStreamsCallback.getStreamIcon());
                        } else {
                            contentValues.put(KEY_STREAM_ICON, "");
                        }
                        contentValues.put(KEY_EPG_CHANNEL_ID, "");
                        if (vodStreamsCallback.getAdded() != null) {
                            contentValues.put("added", vodStreamsCallback.getAdded());
                        } else {
                            contentValues.put("added", "");
                        }
                        if (vodStreamsCallback.getCategoryId() == null || checkUnCategoryCountMovies(vodStreamsCallback.getCategoryId()) <= 0) {
                            contentValues.put("categoryID", "-3");
                        } else {
                            contentValues.put("categoryID", vodStreamsCallback.getCategoryId());
                        }
                        if (vodStreamsCallback.getCustomSid() != null) {
                            contentValues.put(KEY_CUSTOMER_SID, vodStreamsCallback.getCustomSid());
                        } else {
                            contentValues.put(KEY_CUSTOMER_SID, "");
                        }
                        contentValues.put(KEY_TV_ARCHIVE, "");
                        if (vodStreamsCallback.getDirectSource() != null) {
                            contentValues.put(KEY_DIRECT_SOURCE, vodStreamsCallback.getDirectSource());
                        } else {
                            contentValues.put(KEY_DIRECT_SOURCE, "");
                        }
                        contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                        if (vodStreamsCallback.getSeriesNo() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, String.valueOf(vodStreamsCallback.getSeriesNo()));
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
                        }
                        contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
                        if (vodStreamsCallback.getContainerExtension() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, String.valueOf(vodStreamsCallback.getContainerExtension()));
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, "");
                        }
                        if (vodStreamsCallback.getRating() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, vodStreamsCallback.getRating());
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, "");
                        }
                        if (vodStreamsCallback.getRating5based() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, String.valueOf(vodStreamsCallback.getRating5based()));
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, "");
                        }
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        writableDatabase.insert(TABLE_IPTV_AVAILABLE_CHANNNELS, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                writableDatabase.endTransaction();
                w.f44704q = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean addAllAvailableONESTREAMMovies(List<OneStreamMovieStreamDataModel> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int userID = SharepreferenceDBHandler.getUserID(this.context);
                ContentValues contentValues = new ContentValues();
                for (OneStreamMovieStreamDataModel oneStreamMovieStreamDataModel : list) {
                    w.f44704q = true;
                    if (oneStreamMovieStreamDataModel.getNum() != null) {
                        contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(oneStreamMovieStreamDataModel.getNum()));
                    } else {
                        contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                    }
                    if (oneStreamMovieStreamDataModel.getName() != null) {
                        contentValues.put("name", oneStreamMovieStreamDataModel.getName());
                    } else {
                        contentValues.put("name", "");
                    }
                    if (oneStreamMovieStreamDataModel.getStream_type() != null) {
                        contentValues.put(KEY_STRESM_TYPE, oneStreamMovieStreamDataModel.getStream_type());
                    } else {
                        contentValues.put(KEY_STRESM_TYPE, "");
                    }
                    if (oneStreamMovieStreamDataModel.getStream_id() != null) {
                        contentValues.put(KEY_STREAM_ID, oneStreamMovieStreamDataModel.getStream_id());
                    } else {
                        contentValues.put(KEY_STREAM_ID, "");
                    }
                    if (oneStreamMovieStreamDataModel.getStream_icon() != null) {
                        contentValues.put(KEY_STREAM_ICON, oneStreamMovieStreamDataModel.getStream_icon());
                    } else {
                        contentValues.put(KEY_STREAM_ICON, "");
                    }
                    contentValues.put(KEY_EPG_CHANNEL_ID, "");
                    if (oneStreamMovieStreamDataModel.getAdded() != null) {
                        contentValues.put("added", oneStreamMovieStreamDataModel.getAdded());
                    } else {
                        contentValues.put("added", "");
                    }
                    if (oneStreamMovieStreamDataModel.getIs_adult() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_IS_ADULT, oneStreamMovieStreamDataModel.getIs_adult());
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_IS_ADULT, "");
                    }
                    if (oneStreamMovieStreamDataModel.getCategories() == null || checkUnCategoryCountMovies(oneStreamMovieStreamDataModel.getCategories()) <= 0) {
                        contentValues.put("categoryID", "-3");
                    } else {
                        contentValues.put("categoryID", oneStreamMovieStreamDataModel.getCategories());
                    }
                    contentValues.put(KEY_CUSTOMER_SID, "");
                    contentValues.put(KEY_TV_ARCHIVE, "");
                    contentValues.put(KEY_DIRECT_SOURCE, "");
                    contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
                    contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
                    contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                    contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
                    contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
                    contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, "");
                    if (oneStreamMovieStreamDataModel.getRating() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, oneStreamMovieStreamDataModel.getRating());
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, "");
                    }
                    if (oneStreamMovieStreamDataModel.getRating_5based() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, String.valueOf(oneStreamMovieStreamDataModel.getRating_5based()));
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, "");
                    }
                    if (oneStreamMovieStreamDataModel.getLinks() != null) {
                        contentValues.put(KEY_AVAIL_CHANNEL_LINKS, String.valueOf(oneStreamMovieStreamDataModel.getLinks()));
                    } else {
                        contentValues.put(KEY_AVAIL_CHANNEL_LINKS, "");
                    }
                    contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                    writableDatabase.insert(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                w.f44704q = false;
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                writableDatabase.endTransaction();
                w.f44704q = false;
                Log.w("msg", "exception");
                return false;
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                w.f44704q = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean addAllOneStreamSeriesStreams(List<OneStreamSeriesStreamDataModel> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        w.f44704q = true;
                        if (list.get(i9).getNum() != null) {
                            contentValues.put(KEY_NUM_SERIES_STREAMS, String.valueOf(list.get(i9).getNum()));
                        } else {
                            contentValues.put(KEY_NUM_SERIES_STREAMS, "");
                        }
                        if (list.get(i9).getName() != null) {
                            contentValues.put(KEY_NAME_S, list.get(i9).getName());
                        } else {
                            contentValues.put(KEY_NAME_S, "");
                        }
                        contentValues.put(KEY_STREAM_TYPE, "");
                        if (list.get(i9).getSeries_id() != null) {
                            contentValues.put(KEY_SERIES_ID, list.get(i9).getSeries_id());
                        } else {
                            contentValues.put(KEY_SERIES_ID, "");
                        }
                        if (list.get(i9).getCover() != null) {
                            contentValues.put(KEY_COVER, list.get(i9).getCover());
                        } else {
                            contentValues.put(KEY_COVER, "");
                        }
                        if (list.get(i9).getPlot() != null) {
                            contentValues.put(KEY_PLOT, list.get(i9).getPlot());
                        } else {
                            contentValues.put(KEY_PLOT, "");
                        }
                        if (list.get(i9).getCast() != null) {
                            contentValues.put(KEY_CAST, list.get(i9).getCast());
                        } else {
                            contentValues.put(KEY_CAST, "");
                        }
                        if (list.get(i9).getDirector() != null) {
                            contentValues.put(KEY_DIRECTOR, String.valueOf(list.get(i9).getDirector()));
                        } else {
                            contentValues.put(KEY_DIRECTOR, "");
                        }
                        if (list.get(i9).getGenre() != null) {
                            contentValues.put(KEY_GENERE, list.get(i9).getGenre());
                        } else {
                            contentValues.put(KEY_GENERE, "");
                        }
                        if (list.get(i9).getRelease_date() != null) {
                            contentValues.put(KEY_RELEASE_DATE, String.valueOf(list.get(i9).getRelease_date()));
                        } else {
                            contentValues.put(KEY_RELEASE_DATE, "");
                        }
                        if (list.get(i9).getLast_modified() != null) {
                            contentValues.put(KEY_LAST_MODIFIED, String.valueOf(list.get(i9).getLast_modified()));
                        } else {
                            contentValues.put(KEY_LAST_MODIFIED, "");
                        }
                        if (list.get(i9).getRating() != null) {
                            contentValues.put(KEY_RATING, String.valueOf(list.get(i9).getRating()));
                        } else {
                            contentValues.put(KEY_RATING, "");
                        }
                        if (list.get(i9).getRating_5based() != null) {
                            contentValues.put(KEY_RATING, String.valueOf(list.get(i9).getRating_5based()));
                        } else {
                            contentValues.put(KEY_RATING, "");
                        }
                        if (list.get(i9).getCategories() == null || checkUnCategoryCountSeries(list.get(i9).getCategories()) <= 0) {
                            contentValues.put(KEY_CATEGORY_ID_S, "-5");
                        } else {
                            contentValues.put(KEY_CATEGORY_ID_S, String.valueOf(list.get(i9).getCategories()));
                        }
                        if (list.get(i9).getYoutube_trailer() != null) {
                            contentValues.put(KEY_YOUTUBE_TRAILER, String.valueOf(list.get(i9).getYoutube_trailer()));
                        } else {
                            contentValues.put(KEY_YOUTUBE_TRAILER, "");
                        }
                        if (list.get(i9).getBackdrop_path() != null) {
                            contentValues.put(KEY_BACKDROPE, list.get(i9).getBackdrop_path().toString());
                        } else {
                            contentValues.put(KEY_BACKDROPE, "");
                        }
                        contentValues.put(KEY_USER_ID, Integer.valueOf(SharepreferenceDBHandler.getUserID(this.context)));
                        writableDatabase.insert(TABLE_ONESTREAM_IPTV_SERIES_STREAMS, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                w.f44704q = false;
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            } catch (Exception e9) {
                writableDatabase.endTransaction();
                w.f44704q = false;
                Log.w("msg", "exception:" + e9.getMessage());
                return false;
            }
        } catch (Exception unused2) {
        }
    }

    public boolean addAllSeriesStreams(ArrayList<GetSeriesStreamCallback> arrayList) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = arrayList.size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        w.f44704q = true;
                        if (arrayList.get(i9).getNum() != null) {
                            contentValues.put(KEY_NUM_SERIES_STREAMS, String.valueOf(arrayList.get(i9).getNum()));
                        } else {
                            contentValues.put(KEY_NUM_SERIES_STREAMS, "");
                        }
                        if (arrayList.get(i9).getName() != null) {
                            contentValues.put(KEY_NAME_S, arrayList.get(i9).getName());
                        } else {
                            contentValues.put(KEY_NAME_S, "");
                        }
                        if (arrayList.get(i9).getStreamType() != null) {
                            contentValues.put(KEY_STREAM_TYPE, String.valueOf(arrayList.get(i9).getStreamType()));
                        } else {
                            contentValues.put(KEY_STREAM_TYPE, "");
                        }
                        if (arrayList.get(i9).getSeriesId() != null) {
                            contentValues.put(KEY_SERIES_ID, arrayList.get(i9).getSeriesId());
                        } else {
                            contentValues.put(KEY_SERIES_ID, "");
                        }
                        if (arrayList.get(i9).getCover() != null) {
                            contentValues.put(KEY_COVER, arrayList.get(i9).getCover());
                        } else {
                            contentValues.put(KEY_COVER, "");
                        }
                        if (arrayList.get(i9).getPlot() != null) {
                            contentValues.put(KEY_PLOT, arrayList.get(i9).getPlot());
                        } else {
                            contentValues.put(KEY_PLOT, "");
                        }
                        if (arrayList.get(i9).getCast() != null) {
                            contentValues.put(KEY_CAST, arrayList.get(i9).getCast());
                        } else {
                            contentValues.put(KEY_CAST, "");
                        }
                        if (arrayList.get(i9).getDirector() != null) {
                            contentValues.put(KEY_DIRECTOR, String.valueOf(arrayList.get(i9).getDirector()));
                        } else {
                            contentValues.put(KEY_DIRECTOR, "");
                        }
                        if (arrayList.get(i9).getGenre() != null) {
                            contentValues.put(KEY_GENERE, arrayList.get(i9).getGenre());
                        } else {
                            contentValues.put(KEY_GENERE, "");
                        }
                        if (arrayList.get(i9).getReleaseDate() != null) {
                            contentValues.put(KEY_RELEASE_DATE, String.valueOf(arrayList.get(i9).getReleaseDate()));
                        } else {
                            contentValues.put(KEY_RELEASE_DATE, "");
                        }
                        if (arrayList.get(i9).getLastModified() != null) {
                            contentValues.put(KEY_LAST_MODIFIED, String.valueOf(arrayList.get(i9).getLastModified()));
                        } else {
                            contentValues.put(KEY_LAST_MODIFIED, "");
                        }
                        if (arrayList.get(i9).getRating() != null) {
                            contentValues.put(KEY_RATING, String.valueOf(arrayList.get(i9).getRating()));
                        } else {
                            contentValues.put(KEY_RATING, "");
                        }
                        if (arrayList.get(i9).getCategoryId() == null || checkUnCategoryCountSeries(arrayList.get(i9).getCategoryId()) <= 0) {
                            contentValues.put(KEY_CATEGORY_ID_S, "-5");
                        } else {
                            contentValues.put(KEY_CATEGORY_ID_S, String.valueOf(arrayList.get(i9).getCategoryId()));
                        }
                        if (arrayList.get(i9).getYoutubTrailer() != null) {
                            contentValues.put(KEY_YOUTUBE_TRAILER, String.valueOf(arrayList.get(i9).getYoutubTrailer()));
                        } else {
                            contentValues.put(KEY_YOUTUBE_TRAILER, "");
                        }
                        if (arrayList.get(i9).getBackdropPath() != null) {
                            contentValues.put(KEY_BACKDROPE, arrayList.get(i9).getBackdropPath().toString());
                        } else {
                            contentValues.put(KEY_BACKDROPE, "");
                        }
                        contentValues.put(KEY_USER_ID, Integer.valueOf(SharepreferenceDBHandler.getUserID(this.context)));
                        writableDatabase.insert(TABLE_IPTV_SERIES_STREAMS, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                w.f44704q = false;
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            } catch (Exception e9) {
                writableDatabase.endTransaction();
                w.f44704q = false;
                Log.w("msg", "exception:" + e9.getMessage());
                return false;
            }
        } catch (Exception unused2) {
        }
    }

    public void addCategoriesM3U(ArrayList<M3UCategoriesModel> arrayList, String str) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        String str2 = str.equals(KEY_AVAIL_CHANNEL_LIVE) ? TABLE_IPTV_LIVE_CATEGORY_M3U : str.equals("movie") ? TABLE_IPTV_MOVIE_CATEGORY_M3U : str.equals("series") ? TABLE_IPTV_SERIES_CATEGORY_M3U : "";
        try {
            ContentValues contentValues = new ContentValues();
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            for (M3UCategoriesModel m3UCategoriesModel : arrayList) {
                contentValues.put("categoryID", m3UCategoriesModel.getCategoryId());
                contentValues.put(KEY_CATEGORY_NAME, m3UCategoriesModel.getCategoryName());
                contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                writableDatabase.insert(str2, null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    public void addEPG(List<XMLTVProgrammePojo> list) {
        String str;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            if (currentAPPType.equals("m3u")) {
                str = TABLE_EPG_M3U;
            } else {
                currentAPPType.equals("onestream_api");
                str = TABLE_EPG;
            }
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        contentValues.put("title", list.get(i9).getTitle());
                        contentValues.put(KEY_START, list.get(i9).getStart());
                        contentValues.put(KEY_STOP, list.get(i9).getStop());
                        contentValues.put(KEY_DESCRIPTION, list.get(i9).getDesc());
                        contentValues.put(KEY_CHANNEL_ID, list.get(i9).getChannel());
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        contentValues.put(KEY_SOURCE_REF_ID, list.get(i9).getSourceRef());
                        writableDatabase.insert(str, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public void addEPGNew(XMLTVProgrammePojo xMLTVProgrammePojo) {
        String str;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            if (currentAPPType.equals("m3u")) {
                str = TABLE_EPG_M3U;
            } else {
                currentAPPType.equals("onestream_api");
                str = TABLE_EPG;
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("title", xMLTVProgrammePojo.getTitle());
                contentValues.put(KEY_START, xMLTVProgrammePojo.getStart());
                contentValues.put(KEY_STOP, xMLTVProgrammePojo.getStop());
                contentValues.put(KEY_DESCRIPTION, xMLTVProgrammePojo.getDesc());
                contentValues.put(KEY_CHANNEL_ID, xMLTVProgrammePojo.getChannel());
                contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                contentValues.put(KEY_SOURCE_REF_ID, xMLTVProgrammePojo.getSourceRef());
                writableDatabase.insert(str, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public void addEPGSource(String str, String str2, String str3, String str4) {
        try {
            String str5 = SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES;
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
            contentValues.put("name", str);
            contentValues.put(KEY_SOURCE_TYPE, str2);
            contentValues.put(KEY_EPGURL, str3);
            contentValues.put(KEY_DEFAULT_SOURCE, str4);
            writableDatabase.insert(str5, null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public boolean addEPGTesting2(List<XMLTVProgrammePojo> list) {
        String str;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            if (currentAPPType.equals("m3u")) {
                str = TABLE_EPG_M3U;
            } else {
                currentAPPType.equals("onestream_api");
                str = TABLE_EPG;
            }
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        contentValues.put("title", list.get(i9).getTitle());
                        contentValues.put(KEY_START, list.get(i9).getStart());
                        contentValues.put(KEY_STOP, list.get(i9).getStop());
                        contentValues.put(KEY_DESCRIPTION, list.get(i9).getDesc());
                        contentValues.put(KEY_CHANNEL_ID, list.get(i9).getChannel());
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        contentValues.put(KEY_SOURCE_REF_ID, list.get(i9).getSourceRef());
                        writableDatabase.insert(str, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean addLiveCategories(List<LiveStreamCategoriesCallback> list) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i9 = 0; i9 < size; i9++) {
                            w.f44704q = true;
                            contentValues.put(KEY_CATEGORY_ID_LIVE, list.get(i9).getCategoryId());
                            contentValues.put(KEY_CATEGORY_NAME_LIVE, list.get(i9).getCategoryName());
                            contentValues.put(KEY_ID_PARENT_ID, list.get(i9).getParentId());
                            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                            writableDatabase.insert(TABLE_IPTV_LIVE_CATEGORY, null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                writableDatabase.endTransaction();
                w.f44704q = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
            w.f44704q = false;
            return false;
        }
    }

    public void addLiveCategoriesM3U(M3UCategoriesModel m3UCategoriesModel) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentValues contentValues = new ContentValues();
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            contentValues.put("categoryID", m3UCategoriesModel.getCategoryId());
            contentValues.put(KEY_CATEGORY_NAME, m3UCategoriesModel.getCategoryName());
            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
            writableDatabase.insert(TABLE_IPTV_LIVE_CATEGORY_M3U, null, contentValues);
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    public void addLiveRecentlyWatched(String str, String str2) {
        try {
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_STREAM_ID_URL, str);
            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
            contentValues.put(KEY_APP_TYPE, currentAPPType);
            contentValues.put("type", str2);
            writableDatabase.insert(TABLE_IPTV_LIVE_WATCHED, null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception e9) {
            e9.printStackTrace();
        }
    }

    public void addLiveWatchedFromBackup(ArrayList<LiveStreamsDBModel> arrayList) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        writableDatabase.beginTransaction();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        try {
            ContentValues contentValues = new ContentValues();
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                contentValues.put(KEY_STREAM_ID_URL, arrayList.get(i9).getStreamId());
                contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                contentValues.put(KEY_APP_TYPE, currentAPPType);
                writableDatabase.insert(TABLE_IPTV_LIVE_WATCHED, null, contentValues);
            }
            writableDatabase.setTransactionSuccessful();
            writableDatabase.endTransaction();
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            writableDatabase.endTransaction();
            Log.w("msg", "exception");
        }
    }

    public void addMagPortal(String str) {
        try {
            getReadableDatabase();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_MAG_PORTAL, str);
            writableDatabase.insert(TABLE_IPTV_MAG_PORTAL, null, contentValues);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean addMovieCategories(List<VodCategoriesCallback> list) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i9 = 0; i9 < size; i9++) {
                            w.f44704q = true;
                            contentValues.put(KEY_CATEGORY_ID_MOVIE, list.get(i9).getCategoryId());
                            contentValues.put(KEY_CATEGORY_NAME_MOVIE, list.get(i9).getCategoryName());
                            contentValues.put(KEY_ID_PARENT_ID, list.get(i9).getParentId());
                            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                            writableDatabase.insert(TABLE_IPTV_MOVIE_CATEGORY, null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    Log.w("msg", "exception");
                    w.f44704q = false;
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            }
        } catch (Exception unused3) {
            w.f44704q = false;
            return false;
        }
    }

    public void addMovieCategoriesM3U(M3UCategoriesModel m3UCategoriesModel) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int userID = SharepreferenceDBHandler.getUserID(this.context);
                contentValues.put("categoryID", m3UCategoriesModel.getCategoryId());
                contentValues.put(KEY_CATEGORY_NAME, m3UCategoriesModel.getCategoryName());
                contentValues.put(KEY_ID_PARENT_ID, (Integer) 0);
                contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                writableDatabase.insert(TABLE_IPTV_MOVIE_CATEGORY_M3U, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void addMultipleCategoriesM3U(java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel> r9, java.lang.String r10) {
        /*
            r8 = this;
            java.lang.String r0 = "exception"
            java.lang.String r1 = "msg"
            android.database.sqlite.SQLiteDatabase r2 = r8.getWritableDatabase()
            r2.beginTransaction()
            android.content.ContentValues r3 = new android.content.ContentValues     // Catch: java.lang.Throwable -> Lb1
            r3.<init>()     // Catch: java.lang.Throwable -> Lb1
            int r4 = r10.hashCode()     // Catch: java.lang.Throwable -> Lb1
            r5 = -905838985(0xffffffffca01fe77, float:-2129821.8)
            r6 = 2
            r7 = 1
            if (r4 == r5) goto L3a
            r5 = 3322092(0x32b0ec, float:4.655242E-39)
            if (r4 == r5) goto L30
            r5 = 104087344(0x6343f30, float:3.390066E-35)
            if (r4 == r5) goto L26
            goto L44
        L26:
            java.lang.String r4 = "movie"
            boolean r10 = r10.equals(r4)     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto L44
            r10 = 1
            goto L45
        L30:
            java.lang.String r4 = "live"
            boolean r10 = r10.equals(r4)     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto L44
            r10 = 0
            goto L45
        L3a:
            java.lang.String r4 = "series"
            boolean r10 = r10.equals(r4)     // Catch: java.lang.Throwable -> Lb1
            if (r10 == 0) goto L44
            r10 = 2
            goto L45
        L44:
            r10 = -1
        L45:
            java.lang.String r4 = ""
            if (r10 == 0) goto L55
            if (r10 == r7) goto L52
            if (r10 == r6) goto L4f
            r10 = r4
            goto L57
        L4f:
            java.lang.String r10 = "iptv_series_category_m3u"
            goto L57
        L52:
            java.lang.String r10 = "iptv_movie_category_m3u"
            goto L57
        L55:
            java.lang.String r10 = "iptv_live_category_m3u"
        L57:
            boolean r5 = r10.equals(r4)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            if (r5 != 0) goto La7
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
        L61:
            boolean r5 = r9.hasNext()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            if (r5 == 0) goto La7
            java.lang.Object r5 = r9.next()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel r5 = (com.nst.iptvsmarterstvbox.model.LiveStreamCategoryIdDBModel) r5     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            java.lang.String r6 = r5.getLiveStreamCategoryID()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            java.lang.String r7 = "categoryID"
            if (r6 == 0) goto L7d
            java.lang.String r6 = r5.getLiveStreamCategoryID()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r3.put(r7, r6)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            goto L80
        L7d:
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
        L80:
            java.lang.String r6 = r5.getLiveStreamCategoryName()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            java.lang.String r7 = "categoryname"
            if (r6 == 0) goto L90
            java.lang.String r5 = r5.getLiveStreamCategoryName()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r3.put(r7, r5)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            goto L93
        L90:
            r3.put(r7, r4)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
        L93:
            java.lang.String r5 = "user_id_referred"
            android.content.Context r6 = r8.context     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            int r6 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getUserID(r6)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r3.put(r5, r6)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r5 = 0
            r2.insert(r10, r5, r3)     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            goto L61
        La7:
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r2.endTransaction()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            r2.close()     // Catch: java.lang.Throwable -> Lb1 java.lang.Throwable -> Lb1
            goto Lb7
        Lb1:
            r2.endTransaction()
            android.util.Log.w(r1, r0)
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.addMultipleCategoriesM3U(java.util.ArrayList, java.lang.String):void");
    }

    public boolean addOneStreamAllChannels(List<OneStreamLiveStreamDataModel> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    int userID = SharepreferenceDBHandler.getUserID(this.context);
                    ContentValues contentValues = new ContentValues();
                    for (OneStreamLiveStreamDataModel oneStreamLiveStreamDataModel : list) {
                        w.f44704q = true;
                        if (oneStreamLiveStreamDataModel.getNum() != null) {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(oneStreamLiveStreamDataModel.getNum()));
                        } else {
                            contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                        }
                        if (oneStreamLiveStreamDataModel.getName() != null) {
                            contentValues.put("name", oneStreamLiveStreamDataModel.getName());
                        } else {
                            contentValues.put("name", "");
                        }
                        if (oneStreamLiveStreamDataModel.getStream_type() != null) {
                            contentValues.put(KEY_STRESM_TYPE, oneStreamLiveStreamDataModel.getStream_type());
                        } else {
                            contentValues.put(KEY_STRESM_TYPE, "");
                        }
                        if (oneStreamLiveStreamDataModel.getStream_id() != null) {
                            contentValues.put(KEY_STREAM_ID, oneStreamLiveStreamDataModel.getStream_id());
                        } else {
                            contentValues.put(KEY_STREAM_ID, "");
                        }
                        if (oneStreamLiveStreamDataModel.getStream_icon() != null) {
                            contentValues.put(KEY_STREAM_ICON, oneStreamLiveStreamDataModel.getStream_icon());
                        } else {
                            contentValues.put(KEY_STREAM_ICON, "");
                        }
                        if (oneStreamLiveStreamDataModel.getEpg_channel_id() != null) {
                            contentValues.put(KEY_EPG_CHANNEL_ID, oneStreamLiveStreamDataModel.getEpg_channel_id());
                        } else {
                            contentValues.put(KEY_EPG_CHANNEL_ID, "");
                        }
                        contentValues.put("added", "");
                        if (oneStreamLiveStreamDataModel.getCategories() == null || checkUnCategoryCountLive(oneStreamLiveStreamDataModel.getCategories()) <= 0) {
                            contentValues.put("categoryID", "-2");
                        } else {
                            contentValues.put("categoryID", oneStreamLiveStreamDataModel.getCategories());
                        }
                        contentValues.put(KEY_CUSTOMER_SID, "");
                        if (oneStreamLiveStreamDataModel.getTv_archive() != null) {
                            contentValues.put(KEY_TV_ARCHIVE, oneStreamLiveStreamDataModel.getTv_archive());
                        } else {
                            contentValues.put(KEY_TV_ARCHIVE, "");
                        }
                        if (oneStreamLiveStreamDataModel.getLinks() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_LINKS, oneStreamLiveStreamDataModel.getLinks());
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_LINKS, "");
                        }
                        if (oneStreamLiveStreamDataModel.getIs_adult() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_IS_ADULT, oneStreamLiveStreamDataModel.getIs_adult());
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_IS_ADULT, "");
                        }
                        contentValues.put(KEY_DIRECT_SOURCE, "");
                        if (oneStreamLiveStreamDataModel.getTv_archive_duration() != null) {
                            contentValues.put(KEY_TV_ARCHIVE_DURATION, oneStreamLiveStreamDataModel.getTv_archive_duration());
                        } else {
                            contentValues.put(KEY_TV_ARCHIVE_DURATION, "");
                        }
                        contentValues.put(KEY_AVAIL_CHANNEL_TYPE_NAME, "");
                        if (oneStreamLiveStreamDataModel.getCategories() != null) {
                            contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, oneStreamLiveStreamDataModel.getCategories());
                        } else {
                            contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                        }
                        contentValues.put(KEY_AVAIL_CHANNEL_CATEGORY_NAME, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_SERIES_NO, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_LIVE, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_CONTAINER_EXTENSION, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_TEN, "");
                        contentValues.put(KEY_AVAIL_CHANNEL_RATING_FROM_FIVE, "");
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        writableDatabase.insert(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean addOneStreamLiveCategories(List<LiveDataModel> list) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i9 = 0; i9 < size; i9++) {
                            w.f44704q = true;
                            contentValues.put(KEY_CATEGORY_ID_LIVE, list.get(i9).getCategory_id());
                            contentValues.put(KEY_CATEGORY_NAME_LIVE, list.get(i9).getCategory_name());
                            contentValues.put(KEY_ID_PARENT_ID, list.get(i9).getParent_id());
                            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                            writableDatabase.insert(TABLE_IPTV_ONESTREAM_LIVE_CATEGORY, null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    Log.w("msg", "exception");
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                writableDatabase.endTransaction();
                w.f44704q = false;
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
            w.f44704q = false;
            return false;
        }
    }

    public boolean addOnestreamMovieCategories(List<LiveDataModel> list) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                try {
                    ContentValues contentValues = new ContentValues();
                    int size = list.size();
                    if (size != 0) {
                        for (int i9 = 0; i9 < size; i9++) {
                            w.f44704q = true;
                            contentValues.put(KEY_CATEGORY_ID_MOVIE, list.get(i9).getCategory_id());
                            contentValues.put(KEY_CATEGORY_NAME_MOVIE, list.get(i9).getCategory_name());
                            contentValues.put(KEY_ID_PARENT_ID, list.get(i9).getParent_id());
                            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                            writableDatabase.insert(TABLE_IPTV_ONSESTREAM_MOVIE_CATEGORY, null, contentValues);
                        }
                    }
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                    w.f44704q = false;
                    return true;
                } catch (Exception unused) {
                    writableDatabase.endTransaction();
                    Log.w("msg", "exception");
                    w.f44704q = false;
                    return false;
                }
            } catch (SQLiteDatabaseLockedException unused2) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            }
        } catch (Exception unused3) {
            w.f44704q = false;
            return false;
        }
    }

    public void addPassword(PasswordDBModel passwordDBModel) {
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_PASSWORD_USER_DETAIL, passwordDBModel.getUserDetail());
            contentValues.put("password", passwordDBModel.getUserPassword());
            contentValues.put(KEY_USER_ID, Integer.valueOf(passwordDBModel.getUserId()));
            if (currentAPPType.equals("m3u")) {
                writableDatabase.insert(TABLE_IPTV_PASSWORD_M3U, null, contentValues);
            } else {
                currentAPPType.equals("onestream_api");
                writableDatabase.insert(TABLE_IPTV_PASSWORD, null, contentValues);
            }
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void addPasswordStatus(PasswordStatusDBModel passwordStatusDBModel) {
        String str = SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_IPTV_PASSWORD_STATUS_M3U : TABLE_IPTV_PASSWORD_STATUS;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_PASSWORD_STATUS_CAT_ID, passwordStatusDBModel.getPasswordStatusCategoryId());
            contentValues.put(KEY_USER_DETAIL, passwordStatusDBModel.getPasswordStatusUserDetail());
            contentValues.put(KEY_PASSWORD_STATUS, passwordStatusDBModel.getPasswordStatus());
            contentValues.put(KEY_USER_ID, Integer.valueOf(passwordStatusDBModel.getUserID()));
            writableDatabase.insert(str, null, contentValues);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public boolean addSeriesCategories(ArrayList<GetSeriesStreamCategoriesCallback> arrayList) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = arrayList.size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        w.f44704q = true;
                        contentValues.put(KEY_CATEGORY_ID_SERIES, arrayList.get(i9).getCategoryId());
                        contentValues.put(KEY_CATEGORY_NAME_SERIES, arrayList.get(i9).getCategoryName());
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        writableDatabase.insert(TABLE_IPTV_SERIES_CATEGORY, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                w.f44704q = false;
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            } catch (Exception e9) {
                Log.w("msg", "exception: " + e9.getMessage());
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            }
        } catch (Exception unused2) {
            w.f44704q = false;
            return false;
        }
    }

    public void addSeriesCategoriesM3U(M3UCategoriesModel m3UCategoriesModel) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int userID = SharepreferenceDBHandler.getUserID(this.context);
                contentValues.put("categoryID", m3UCategoriesModel.getCategoryId());
                contentValues.put(KEY_CATEGORY_NAME, m3UCategoriesModel.getCategoryName());
                contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                writableDatabase.insert(TABLE_IPTV_SERIES_CATEGORY_M3U, null, contentValues);
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                writableDatabase.close();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public boolean addSeriesCategoriesStalker(StalkerGetSeriesCategoriesCallback stalkerGetSeriesCategoriesCallback) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = stalkerGetSeriesCategoriesCallback.getJs().size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (!stalkerGetSeriesCategoriesCallback.getJs().get(i9).getId().equals("*")) {
                            contentValues.put(KEY_CATEGORY_ID_SERIES, stalkerGetSeriesCategoriesCallback.getJs().get(i9).getId());
                            contentValues.put(KEY_CATEGORY_NAME_SERIES, stalkerGetSeriesCategoriesCallback.getJs().get(i9).getTitle());
                            contentValues.put(KEY_CATEGORY_ALIAS_SERIES, stalkerGetSeriesCategoriesCallback.getJs().get(i9).getAlias());
                            contentValues.put(KEY_CATEGORY_CENSORED_SERIES, stalkerGetSeriesCategoriesCallback.getJs().get(i9).getCensored());
                            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                            writableDatabase.insert(TABLE_IPTV_STALKER_SERIES_CATEGORY, null, contentValues);
                        }
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                return false;
            } catch (Exception e9) {
                Log.w("msg", "exception: " + e9.getMessage());
                writableDatabase.endTransaction();
                return false;
            }
        } catch (Exception unused2) {
        }
    }

    public boolean addStalkerAllChannels(List<StalkerGetAllChannelsPojo2> list) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int userID = SharepreferenceDBHandler.getUserID(this.context);
                ContentValues contentValues = new ContentValues();
                for (StalkerGetAllChannelsPojo2 stalkerGetAllChannelsPojo2 : list) {
                    if (stalkerGetAllChannelsPojo2.getNumber() != null) {
                        contentValues.put(KEY_NUM_LIVE_STREAMS, String.valueOf(stalkerGetAllChannelsPojo2.getNumber()));
                    } else {
                        contentValues.put(KEY_NUM_LIVE_STREAMS, "");
                    }
                    if (stalkerGetAllChannelsPojo2.getName() != null) {
                        contentValues.put("name", stalkerGetAllChannelsPojo2.getName());
                    } else {
                        contentValues.put("name", "");
                    }
                    if (stalkerGetAllChannelsPojo2.getId() != null) {
                        contentValues.put(KEY_STREAM_ID, stalkerGetAllChannelsPojo2.getId());
                    } else {
                        contentValues.put(KEY_STREAM_ID, "");
                    }
                    if (stalkerGetAllChannelsPojo2.getLogo() != null) {
                        contentValues.put(KEY_STREAM_ICON, stalkerGetAllChannelsPojo2.getLogo());
                    } else {
                        contentValues.put(KEY_STREAM_ICON, "");
                    }
                    if (stalkerGetAllChannelsPojo2.getXmltvId() != null) {
                        contentValues.put(KEY_EPG_CHANNEL_ID, stalkerGetAllChannelsPojo2.getXmltvId());
                    } else {
                        contentValues.put(KEY_EPG_CHANNEL_ID, "");
                    }
                    contentValues.put("categoryID", stalkerGetAllChannelsPojo2.getTvGenreId() != null ? stalkerGetAllChannelsPojo2.getTvGenreId() : "-2");
                    if (stalkerGetAllChannelsPojo2.getArchive() != null) {
                        contentValues.put(KEY_TV_ARCHIVE, stalkerGetAllChannelsPojo2.getArchive());
                    } else {
                        contentValues.put(KEY_TV_ARCHIVE, "");
                    }
                    if (stalkerGetAllChannelsPojo2.getCmd() != null) {
                        contentValues.put(KEY_CMD, stalkerGetAllChannelsPojo2.getCmd());
                    } else {
                        contentValues.put(KEY_CMD, "");
                    }
                    contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                    writableDatabase.insert(TABLE_IPTV_STALKER_ALL_CHANNNELS, null, contentValues);
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                return false;
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean addStalkerLiveCategories(StalkerGetGenresCallback stalkerGetGenresCallback) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = stalkerGetGenresCallback.getJs().size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (!stalkerGetGenresCallback.getJs().get(i9).getId().equals("*")) {
                            contentValues.put(KEY_CATEGORY_ID_LIVE, stalkerGetGenresCallback.getJs().get(i9).getId());
                            contentValues.put(KEY_CATEGORY_NAME_LIVE, stalkerGetGenresCallback.getJs().get(i9).getTitle());
                            contentValues.put(KEY_CATEGORY_ALIAS_LIVE, stalkerGetGenresCallback.getJs().get(i9).getAlias());
                            contentValues.put(KEY_CATEGORY_CENSORED_LIVE, stalkerGetGenresCallback.getJs().get(i9).getCensored());
                            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                            writableDatabase.insert(TABLE_IPTV_STALKER_LIVE_CATEGORY, null, contentValues);
                        }
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public boolean addStalkerMoviesCategories(StalkerGetVodCategoriesCallback stalkerGetVodCategoriesCallback) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = stalkerGetVodCategoriesCallback.getJs().size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        if (!stalkerGetVodCategoriesCallback.getJs().get(i9).getId().equals("*")) {
                            contentValues.put(KEY_CATEGORY_ID_MOVIE, stalkerGetVodCategoriesCallback.getJs().get(i9).getId());
                            contentValues.put(KEY_CATEGORY_NAME_MOVIE, stalkerGetVodCategoriesCallback.getJs().get(i9).getTitle());
                            contentValues.put(KEY_CATEGORY_ALIAS_MOVIE, stalkerGetVodCategoriesCallback.getJs().get(i9).getAlias());
                            contentValues.put(KEY_CATEGORY_CENSORED_MOVIE, stalkerGetVodCategoriesCallback.getJs().get(i9).getCensored());
                            contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                            writableDatabase.insert(TABLE_IPTV_STALKER_MOVIE_CATEGORY, null, contentValues);
                        }
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                return false;
            } catch (Exception unused2) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
                return false;
            }
        } catch (Exception unused3) {
        }
    }

    public void addToFavourite(FavouriteM3UModel favouriteM3UModel) {
        try {
            this.db = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("url", favouriteM3UModel.getUrl());
            contentValues.put(KEY_USER_ID, Integer.valueOf(favouriteM3UModel.getUserID()));
            contentValues.put("name", favouriteM3UModel.getName());
            contentValues.put("categoryID", favouriteM3UModel.getCategoryID());
            this.db.insert(TABLE_IPTV_FAVOURITES_M3U, null, contentValues);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public boolean addonestreamSeriesCategories(List<LiveDataModel> list) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                int size = list.size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        w.f44704q = true;
                        contentValues.put(KEY_CATEGORY_ID_SERIES, list.get(i9).getCategory_id());
                        contentValues.put(KEY_CATEGORY_NAME_SERIES, list.get(i9).getCategory_name());
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        writableDatabase.insert(TABLE_ONESTREAM_IPTV_SERIES_CATEGORY, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
                w.f44704q = false;
                return true;
            } catch (SQLiteDatabaseLockedException unused) {
                Log.w("msg", "exception");
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            } catch (Exception e9) {
                Log.w("msg", "exception: " + e9.getMessage());
                writableDatabase.endTransaction();
                w.f44704q = false;
                return false;
            }
        } catch (Exception unused2) {
            w.f44704q = false;
            return false;
        }
    }

    public boolean checkCategoryExistsM3U(String str, String str2) {
        StringBuilder sb;
        String str3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        str2.hashCode();
        if (str2.equals(KEY_AVAIL_CHANNEL_LIVE)) {
            sb = new StringBuilder();
            str3 = "SELECT  COUNT(*) FROM iptv_live_category_m3u WHERE categoryID='";
        } else if (str2.equals("movie")) {
            sb = new StringBuilder();
            str3 = "SELECT  COUNT(*) FROM iptv_movie_category_m3u WHERE categoryID='";
        } else {
            sb = new StringBuilder();
            str3 = "SELECT  COUNT(*) FROM iptv_series_category_m3u WHERE categoryID='";
        }
        sb.append(str3);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9 > 0;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return false;
        }
    }

    public ArrayList<FavouriteM3UModel> checkFavourite(String str, int i9) {
        ArrayList<FavouriteM3UModel> arrayList = new ArrayList<>();
        try {
            String str2 = "SELECT  * FROM iptv_m3u_favourites WHERE url='" + str + "' AND " + KEY_USER_ID + "=" + i9 + "";
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                    favouriteM3UModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    favouriteM3UModel.setUrl(str);
                    favouriteM3UModel.setUserID(i9);
                    favouriteM3UModel.setName(cursorRawQuery.getString(3));
                    favouriteM3UModel.setCategoryID(cursorRawQuery.getString(4));
                    arrayList.add(favouriteM3UModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
            return arrayList;
        }
    }

    public int checkIfEPGSourceAlreadyExists(String str) {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES) + " WHERE " + KEY_USER_ID + " ='" + userID + "' AND " + KEY_EPGURL + " = '" + str + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void deleteALLLiveRecentlyWatched() {
        try {
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE user_id_referred = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteALLLiveRecentlyWatched(int i9, String str) {
        try {
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE user_id_referred = '" + i9 + "' AND " + KEY_APP_TYPE + " = '" + str + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteALLRecentwatch(String str, int i9) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.db = writableDatabase;
        writableDatabase.delete(TABLE_IPTV_RECENT_WATCHED_M3U, "stream_type='" + str + "' AND " + KEY_USER_ID + "=" + i9 + "", null);
        this.db.close();
    }

    public void deleteAllEPGSources(int i9, String str) {
        try {
            String str2 = str.equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES;
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE " + KEY_USER_ID + " = '" + i9 + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteAllPasswordData() throws Throwable {
        SQLiteDatabase writableDatabase;
        String str = SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_IPTV_PASSWORD_M3U : TABLE_IPTV_PASSWORD;
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = getWritableDatabase();
        } catch (SQLiteDatabaseLockedException unused) {
        } catch (Exception unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            writableDatabase.delete(str, null, null);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException unused3) {
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (Exception unused4) {
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    public void deleteAndRecreateAllTables() {
        try {
            getReadableDatabase();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_category");
            writableDatabase.execSQL("DROP TABLE IF EXISTS iptv_movie_category");
            writableDatabase.execSQL("DROP TABLE IF EXISTS epg");
            writableDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_streams_category");
            writableDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_streams");
            writableDatabase.execSQL("DROP TABLE IF EXISTS iptv_vod_streams");
            writableDatabase.execSQL("DROP TABLE IF EXISTS iptv_mag_portal_table");
            onCreate(writableDatabase);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteChannelsHistoryDuplicate() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url NOT IN (SELECT stream_id FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred ='" + userID + "' ) AND " + KEY_USER_ID + " = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteChannelsHistoryDuplicateM3U() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE stream_id_url NOT IN (SELECT url FROM iptv_live_streams_m3u WHERE stream_type LIKE '%live%' AND user_id_referred ='" + userID + "' ) AND " + KEY_USER_ID + " = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteEPGSource(int i9) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            String str = SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES;
            getWritableDatabase().execSQL("DELETE FROM " + str + " WHERE " + KEY_USER_ID + " = '" + userID + "' AND " + KEY_AUTO_ID + " = '" + i9 + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteExtraLiveRecentlyWatched() {
        try {
            C2858a c2858a = new C2858a(this.context);
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_watched WHERE user_id_referred = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "' AND " + Name.MARK + " NOT IN ( SELECT " + Name.MARK + " FROM " + TABLE_IPTV_LIVE_WATCHED + " WHERE " + KEY_USER_ID + " = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "' ORDER BY " + Name.MARK + " DESC LIMIT " + c2858a.z() + ")");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteFavDuplicateM3U() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SharepreferenceDBHandler.getCurrentAPPType(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_m3u_favourites WHERE url NOT IN (SELECT url FROM iptv_live_streams_m3u WHERE user_id_referred ='" + userID + "' ) AND " + KEY_USER_ID + " = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deleteFavourite(String str, int i9) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.db = writableDatabase;
            writableDatabase.delete(TABLE_IPTV_FAVOURITES_M3U, "url='" + str + "' AND " + KEY_USER_ID + "=" + i9, null);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void deleteImportStatusForUser(int i9, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.db = writableDatabase;
            writableDatabase.delete(TABLE_DATABASE_IMPORT_STATUS, "user_id_referred='" + i9 + "' AND " + KEY_APP_TYPE + "='" + str + "'", null);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void deleteImportStatusForUser(int i9, String str, String str2) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.db = writableDatabase;
            writableDatabase.delete(TABLE_DATABASE_IMPORT_STATUS, "user_id_referred='" + i9 + "' AND " + KEY_APP_TYPE + "='" + str2 + "' AND " + KEY_SOURCE_REF_ID + "='" + str + "'", null);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void deleteLiveRecentlyWatched(String str) {
        StringBuilder sb;
        try {
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sb = new StringBuilder();
                sb.append("DELETE FROM iptv_live_watched WHERE stream_id_url = '");
                sb.append(str);
                sb.append("' AND ");
                sb.append(KEY_USER_ID);
                sb.append(" = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(KEY_APP_TYPE);
                sb.append(" = '");
                sb.append(currentAPPType);
                sb.append("'");
            } else {
                sb = new StringBuilder();
                sb.append("DELETE FROM iptv_live_watched WHERE stream_id_url = '");
                sb.append(str);
                sb.append("' AND ");
                sb.append(KEY_USER_ID);
                sb.append(" = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(KEY_APP_TYPE);
                sb.append(" = '");
                sb.append(currentAPPType);
                sb.append("'");
            }
            writableDatabase.execSQL(sb.toString());
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void deletePasswordDataForUser(int i9) {
        String str;
        String str2;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u")) {
            str = TABLE_IPTV_PASSWORD_M3U;
            str2 = TABLE_IPTV_PASSWORD_STATUS_M3U;
        } else {
            str = TABLE_IPTV_PASSWORD;
            str2 = TABLE_IPTV_PASSWORD_STATUS;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.db = writableDatabase;
            writableDatabase.delete(str, "user_id_referred='" + i9 + "'", null);
            this.db.delete(str2, "user_id_referred='" + i9 + "'", null);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
        }
    }

    public void deletePasswordDataForUser(int i9, String str) {
        String str2;
        String str3;
        if (str.equals("m3u")) {
            str2 = TABLE_IPTV_PASSWORD_M3U;
            str3 = TABLE_IPTV_PASSWORD_STATUS_M3U;
        } else {
            str2 = TABLE_IPTV_PASSWORD;
            str3 = TABLE_IPTV_PASSWORD_STATUS;
        }
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            this.db = writableDatabase;
            writableDatabase.delete(str2, "user_id_referred='" + i9 + "'", null);
            this.db.delete(str3, "user_id_referred='" + i9 + "'", null);
            this.db.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void deleteRecentwatch(String str, String str2, String str3, int i9) {
        SQLiteDatabase writableDatabase = getWritableDatabase();
        this.db = writableDatabase;
        writableDatabase.delete(TABLE_IPTV_RECENT_WATCHED_M3U, "url='" + str + "'  AND " + KEY_STRESM_TYPE + "='" + str2 + "' AND " + KEY_USER_ID + "=" + i9 + "", null);
        this.db.close();
    }

    public ArrayList<LiveStreamsDBModel> getALLFavouritesWithSeriesIDs(String str) {
        String str2 = "SELECT stream_id_series_stream_v2,category_id_series_stream_v2,name_series_stream_v2,num_series_stream_v2 FROM series_streams_v2 WHERE stream_id_series_stream_v2 IN(" + str + ") AND " + KEY_USER_ID + " = '" + SharepreferenceDBHandler.getUserID(this.context) + "'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setStreamType("series");
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(0));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(0));
                    liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setName(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setNum(cursorRawQuery.getString(3));
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<LiveStreamsDBModel> getALLFavouritesWithStreamIDs(String str) {
        String str2 = "SELECT stream_type,stream_id,categoryID,name,num FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND " + KEY_USER_ID + " = '" + SharepreferenceDBHandler.getUserID(this.context) + "'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setStreamType(cursorRawQuery.getString(0));
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setName(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setNum(cursorRawQuery.getString(4));
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<LiveStreamsDBModel> getALLLiveWatchedWithStreamIDs(String str) {
        String str2 = "SELECT stream_id FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND " + KEY_USER_ID + " = '" + SharepreferenceDBHandler.getUserID(this.context) + "'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(0));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(0));
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<LiveStreamsDBModel> getALLMoviesWatchedWithStreamIDs(String str) {
        String str2 = "SELECT num,name,stream_type,stream_id,stream_icon,added,categoryID,container_extension,rating_from_ten,rating_from_five FROM iptv_live_streams WHERE stream_id IN(" + str + ") AND " + KEY_USER_ID + " = '" + SharepreferenceDBHandler.getUserID(this.context) + "' AND " + KEY_STRESM_TYPE + " LIKE '%movie%'";
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setNum(cursorRawQuery.getString(0));
                    liveStreamsDBModel.setName(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setStreamType(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setStreamIdOneStream(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setStreamIcon(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setAdded(cursorRawQuery.getString(5));
                    liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(6));
                    liveStreamsDBModel.setContaiinerExtension(cursorRawQuery.getString(7));
                    liveStreamsDBModel.setRatingFromTen(cursorRawQuery.getString(8));
                    liveStreamsDBModel.setRatingFromFive(cursorRawQuery.getString(9));
                    liveStreamsDBModel.setUrl(cursorRawQuery.getString(10));
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<GetEpisdoeDetailsCallback> getALLSeriesWatchedWithSeriesIDs(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  category_id_series_stream_v2,stream_cover_series_stream_v2,num_series_stream_v2,name_series_stream_v2,stream_id_series_stream_v2 FROM onestream_series_streams_v2 WHERE stream_id_series_stream_v2 IN(";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  category_id_series_stream_v2,stream_cover_series_stream_v2,num_series_stream_v2,name_series_stream_v2,stream_id_series_stream_v2 FROM series_streams_v2 WHERE stream_id_series_stream_v2 IN(";
        }
        sb.append(str2);
        sb.append(str);
        sb.append(") AND ");
        sb.append(KEY_USER_ID);
        sb.append(" = '");
        sb.append(userID);
        sb.append("'");
        String string = sb.toString();
        ArrayList<GetEpisdoeDetailsCallback> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    GetEpisdoeDetailsCallback getEpisdoeDetailsCallback = new GetEpisdoeDetailsCallback();
                    getEpisdoeDetailsCallback.setCategoryId(cursorRawQuery.getString(0));
                    getEpisdoeDetailsCallback.setSeriesCover(cursorRawQuery.getString(1));
                    getEpisdoeDetailsCallback.setSeriesNum(cursorRawQuery.getString(2));
                    getEpisdoeDetailsCallback.setSeriesName(cursorRawQuery.getString(3));
                    getEpisdoeDetailsCallback.setSeriesId(cursorRawQuery.getString(4));
                    arrayList.add(getEpisdoeDetailsCallback);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<EPGSourcesModel> getActiveEPGSource() {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String str = "SELECT  * FROM " + (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES) + " WHERE " + KEY_USER_ID + " ='" + userID + "' AND " + KEY_DEFAULT_SOURCE + " = '1' LIMIT 1";
        try {
            ArrayList<EPGSourcesModel> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    EPGSourcesModel ePGSourcesModel = new EPGSourcesModel();
                    ePGSourcesModel.setIdAuto(w.r0(cursorRawQuery.getString(0)));
                    ePGSourcesModel.setUser_id(cursorRawQuery.getString(1));
                    ePGSourcesModel.setName(cursorRawQuery.getString(2));
                    ePGSourcesModel.setSource_type(cursorRawQuery.getString(3));
                    ePGSourcesModel.setEpgurl(cursorRawQuery.getString(4));
                    ePGSourcesModel.setDefault_source(cursorRawQuery.getString(5));
                    arrayList.add(ePGSourcesModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:42)
        */
    public java.util.ArrayList<com.nst.iptvsmarterstvbox.model.FavouriteM3UModel> getAllFavourites(
    /*  JADX ERROR: ConcurrentModificationException in pass: ConstructorVisitor
        java.util.ConcurrentModificationException
        	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1096)
        	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:1050)
        	at jadx.core.dex.visitors.ConstructorVisitor.insertPhiInsn(ConstructorVisitor.java:139)
        	at jadx.core.dex.visitors.ConstructorVisitor.processInvoke(ConstructorVisitor.java:91)
        	at jadx.core.dex.visitors.ConstructorVisitor.replaceInvoke(ConstructorVisitor.java:56)
        */
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r13v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:224)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:169)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:407)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:337)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:303)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
        	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
        	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
        	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
        	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
        	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
        	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:299)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:288)
        	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:272)
        	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:159)
        	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
        	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
        	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
        	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
        	at jadx.core.ProcessClass.process(ProcessClass.java:88)
        	at jadx.core.ProcessClass.generateCode(ProcessClass.java:126)
        	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:405)
        	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:393)
        	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:343)
        */

    public ArrayList<LiveStreamsDBModel> getAllLiveMoviesStreamIDs(String str) {
        StringBuilder sb;
        String str2;
        int i9;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            sb.append("SELECT stream_id FROM onestream_iptv_live_streams WHERE stream_type LIKE '%");
            sb.append(str);
            sb.append("%'  AND ");
            str2 = TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS;
        } else {
            sb = new StringBuilder();
            sb.append("SELECT stream_id FROM iptv_live_streams WHERE stream_type LIKE '%");
            sb.append(str);
            sb.append("%'  AND ");
            str2 = TABLE_IPTV_AVAILABLE_CHANNNELS;
        }
        sb.append(str2);
        sb.append(InstructionFileId.DOT);
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    try {
                        i9 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                        i9 = 0;
                    }
                    String string = cursorRawQuery.getString(0);
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setStreamId(String.valueOf(i9));
                    liveStreamsDBModel.setStreamIdOneStream(string);
                    arrayList.add(liveStreamsDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public ArrayList<LiveStreamsDBModel> getAllLiveStreamsArchive(String str) {
        String str2;
        String str3;
        StringBuilder sb;
        StringBuilder sb2;
        String string;
        ArrayList<LiveStreamsDBModel> arrayList;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String liveSubCatSort = SharepreferenceDBHandler.getLiveSubCatSort(this.context);
        if (!str.equals("0")) {
            ArrayList<LiveStreamsDBModel> arrayList2 = new ArrayList<>();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                str2 = "SELECT  * FROM onestream_iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='" + userID + "' AND " + KEY_TV_ARCHIVE + "='1' AND categoryID ='" + str + "'";
            } else {
                str2 = "SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='" + userID + "' AND " + KEY_TV_ARCHIVE + "='1' AND categoryID ='" + str + "' AND " + KEY_EPG_CHANNEL_ID + " IS NOT NULL AND " + KEY_EPG_CHANNEL_ID + " !='' ORDER BY added DESC";
            }
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                            liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            liveStreamsDBModel.setUrl(cursorRawQuery.getString(18));
                            arrayList2.add(liveStreamsDBModel);
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        ArrayList<LiveStreamsDBModel> arrayList3 = new ArrayList<>();
        if (!SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            str3 = " ASC";
            if (liveSubCatSort.equals("0")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_TV_ARCHIVE);
                sb2.append("='1' AND ");
                sb2.append(KEY_EPG_CHANNEL_ID);
                sb2.append(" IS NOT NULL AND ");
                sb2.append(KEY_EPG_CHANNEL_ID);
                sb2.append(" !='' ");
                string = sb2.toString();
            } else if (liveSubCatSort.equals("1")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_TV_ARCHIVE);
                sb2.append("='1' AND ");
                sb2.append(KEY_EPG_CHANNEL_ID);
                sb2.append(" IS NOT NULL AND ");
                sb2.append(KEY_EPG_CHANNEL_ID);
                sb2.append(" !='' ORDER BY ");
                sb2.append("added");
                sb2.append(" DESC");
                string = sb2.toString();
            } else if (liveSubCatSort.equals("3")) {
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(KEY_TV_ARCHIVE);
                sb.append("='1' AND ");
                sb.append(KEY_EPG_CHANNEL_ID);
                sb.append(" IS NOT NULL AND ");
                sb.append(KEY_EPG_CHANNEL_ID);
                sb.append(" !='' ORDER BY ");
                sb.append("name");
                sb.append(" DESC");
                string = sb.toString();
            } else {
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(KEY_TV_ARCHIVE);
                sb.append("='1' AND ");
                sb.append(KEY_EPG_CHANNEL_ID);
                sb.append(" IS NOT NULL AND ");
                sb.append(KEY_EPG_CHANNEL_ID);
                sb.append(" !='' ORDER BY ");
                sb.append("name");
                sb.append(str3);
                string = sb.toString();
            }
        } else if (liveSubCatSort.equals("0")) {
            sb2 = new StringBuilder();
            sb2.append("SELECT  * FROM onestream_iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
            sb2.append(userID);
            sb2.append("' AND ");
            sb2.append(KEY_TV_ARCHIVE);
            sb2.append("='1' AND ");
            sb2.append(KEY_EPG_CHANNEL_ID);
            sb2.append(" IS NOT NULL AND ");
            sb2.append(KEY_EPG_CHANNEL_ID);
            sb2.append(" !='' ");
            string = sb2.toString();
        } else if (liveSubCatSort.equals("1")) {
            sb2 = new StringBuilder();
            sb2.append("SELECT  * FROM onestream_iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
            sb2.append(userID);
            sb2.append("' AND ");
            sb2.append(KEY_TV_ARCHIVE);
            sb2.append("='1' AND ");
            sb2.append(KEY_EPG_CHANNEL_ID);
            sb2.append(" IS NOT NULL AND ");
            sb2.append(KEY_EPG_CHANNEL_ID);
            sb2.append(" !='' ORDER BY ");
            sb2.append("added");
            sb2.append(" DESC");
            string = sb2.toString();
        } else if (liveSubCatSort.equals("3")) {
            sb = new StringBuilder();
            sb.append("SELECT  * FROM onestream_iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(KEY_TV_ARCHIVE);
            sb.append("='1' AND ");
            sb.append(KEY_EPG_CHANNEL_ID);
            sb.append(" IS NOT NULL AND ");
            sb.append(KEY_EPG_CHANNEL_ID);
            sb.append(" !='' ORDER BY ");
            sb.append("name");
            sb.append(" DESC");
            string = sb.toString();
        } else {
            sb = new StringBuilder();
            sb.append("SELECT  * FROM onestream_iptv_live_streams WHERE stream_type LIKE '%live%' AND user_id_referred='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(KEY_TV_ARCHIVE);
            sb.append("='1' AND ");
            sb.append(KEY_EPG_CHANNEL_ID);
            sb.append(" IS NOT NULL AND ");
            sb.append(KEY_EPG_CHANNEL_ID);
            sb.append(" !='' ORDER BY ");
            sb.append("name");
            str3 = " ASC";
            sb.append(str3);
            string = sb.toString();
        }
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string, null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                        liveStreamsDBModel2.setIdAuto(Integer.parseInt(cursorRawQuery2.getString(0)));
                        liveStreamsDBModel2.setNum(cursorRawQuery2.getString(1));
                        liveStreamsDBModel2.setName(cursorRawQuery2.getString(2));
                        liveStreamsDBModel2.setStreamType(cursorRawQuery2.getString(3));
                        liveStreamsDBModel2.setStreamId(cursorRawQuery2.getString(4));
                        liveStreamsDBModel2.setStreamIdOneStream(cursorRawQuery2.getString(4));
                        liveStreamsDBModel2.setStreamIcon(cursorRawQuery2.getString(5));
                        liveStreamsDBModel2.setEpgChannelId(cursorRawQuery2.getString(6));
                        liveStreamsDBModel2.setAdded(cursorRawQuery2.getString(7));
                        liveStreamsDBModel2.setCategoryId(cursorRawQuery2.getString(8));
                        liveStreamsDBModel2.setCustomSid(cursorRawQuery2.getString(9));
                        liveStreamsDBModel2.setTvArchive(cursorRawQuery2.getString(10));
                        liveStreamsDBModel2.setDirectSource(cursorRawQuery2.getString(11));
                        liveStreamsDBModel2.setTvArchiveDuration(cursorRawQuery2.getString(12));
                        liveStreamsDBModel2.setTypeName(cursorRawQuery2.getString(13));
                        liveStreamsDBModel2.setCategoryName(cursorRawQuery2.getString(14));
                        liveStreamsDBModel2.setSeriesNo(cursorRawQuery2.getString(15));
                        liveStreamsDBModel2.setLive(cursorRawQuery2.getString(16));
                        liveStreamsDBModel2.setContaiinerExtension(cursorRawQuery2.getString(17));
                        liveStreamsDBModel2.setUrl(cursorRawQuery2.getString(18));
                        arrayList = arrayList3;
                        arrayList.add(liveStreamsDBModel2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                        arrayList3 = arrayList;
                    }
                } else {
                    arrayList = arrayList3;
                }
                cursorRawQuery2.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00c5 A[Catch: SQLiteDatabaseLockedException | Exception -> 0x01a0, LOOP:0: B:27:0x00c5->B:42:?, LOOP_START, TRY_LEAVE, TryCatch #1 {SQLiteDatabaseLockedException | Exception -> 0x01a0, blocks: (B:25:0x00b7, B:27:0x00c5, B:29:0x00cb, B:29:0x00cb, B:31:0x00d7, B:31:0x00d7, B:33:0x019c, B:33:0x019c), top: B:39:0x00b7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel> getAllLiveStreasWithCategoryId(java.lang.String r8, int r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 417
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.getAllLiveStreasWithCategoryId(java.lang.String, int, java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:391:0x1d63, code lost:
    
        r38 = " FROM ";
        r37 = " WHERE ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:393:0x1d6b, code lost:
    
        r37 = " WHERE ";
        r38 = " FROM ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x1d80, code lost:
    
        r38 = " FROM ";
        r37 = " WHERE ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x1d92, code lost:
    
        r38 = " FROM ";
        r37 = " WHERE ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x1da4, code lost:
    
        r38 = " FROM ";
        r37 = " WHERE ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x1db6, code lost:
    
        r38 = " FROM ";
        r37 = " WHERE ";
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x1dc8, code lost:
    
        r38 = " FROM ";
        r37 = " WHERE ";
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:234:0x0ff7. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:131:0x08b7  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0d8e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0fcb  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x1304 A[PHI: r78
      0x1304: PHI (r78v2 java.lang.String) = (r78v1 java.lang.String), (r78v1 java.lang.String), (r78v3 java.lang.String) binds: [B:280:0x1302, B:276:0x12f4, B:270:0x12e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:283:0x130e  */
    /* JADX WARN: Removed duplicated region for block: B:321:0x1647  */
    /* JADX WARN: Removed duplicated region for block: B:358:0x19b9  */
    /* JADX WARN: Removed duplicated region for block: B:392:0x1d67 A[PHI: r37 r38
      0x1d67: PHI (r37v19 java.lang.String) = 
      (r37v12 java.lang.String)
      (r37v13 java.lang.String)
      (r37v14 java.lang.String)
      (r37v15 java.lang.String)
      (r37v16 java.lang.String)
      (r37v17 java.lang.String)
      (r37v20 java.lang.String)
     binds: [B:414:0x1dd4, B:410:0x1dc2, B:406:0x1db0, B:402:0x1d9e, B:398:0x1d8c, B:394:0x1d77, B:391:0x1d63] A[DONT_GENERATE, DONT_INLINE]
      0x1d67: PHI (r38v20 java.lang.String) = 
      (r38v13 java.lang.String)
      (r38v14 java.lang.String)
      (r38v15 java.lang.String)
      (r38v16 java.lang.String)
      (r38v17 java.lang.String)
      (r38v18 java.lang.String)
      (r38v21 java.lang.String)
     binds: [B:414:0x1dd4, B:410:0x1dc2, B:406:0x1db0, B:402:0x1d9e, B:398:0x1d8c, B:394:0x1d77, B:391:0x1d63] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:428:0x214a  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x24e3 A[PHI: r72
      0x24e3: PHI (r72v3 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>) = 
      (r72v0 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
      (r72v1 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
     binds: [B:462:0x24d2, B:465:0x24dd] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:494:0x2630 A[PHI: r18
      0x2630: PHI (r18v7 java.lang.String) = (r18v3 java.lang.String), (r18v3 java.lang.String), (r18v8 java.lang.String) binds: [B:493:0x262e, B:489:0x2620, B:483:0x260f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:496:0x263a  */
    /* JADX WARN: Removed duplicated region for block: B:532:0x296b  */
    /* JADX WARN: Removed duplicated region for block: B:569:0x2cc2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:606:0x3074 A[PHI: r37 r38
      0x3074: PHI (r37v9 java.lang.String) = 
      (r37v2 java.lang.String)
      (r37v3 java.lang.String)
      (r37v4 java.lang.String)
      (r37v5 java.lang.String)
      (r37v6 java.lang.String)
      (r37v7 java.lang.String)
      (r37v10 java.lang.String)
     binds: [B:628:0x30e1, B:624:0x30cf, B:620:0x30bd, B:616:0x30ab, B:612:0x3099, B:608:0x3084, B:605:0x3070] A[DONT_GENERATE, DONT_INLINE]
      0x3074: PHI (r38v10 java.lang.String) = 
      (r38v3 java.lang.String)
      (r38v4 java.lang.String)
      (r38v5 java.lang.String)
      (r38v6 java.lang.String)
      (r38v7 java.lang.String)
      (r38v8 java.lang.String)
      (r38v11 java.lang.String)
     binds: [B:628:0x30e1, B:624:0x30cf, B:620:0x30bd, B:616:0x30ab, B:612:0x3099, B:608:0x3084, B:605:0x3070] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:643:0x3457  */
    /* JADX WARN: Removed duplicated region for block: B:676:0x37d8  */
    /* JADX WARN: Removed duplicated region for block: B:687:0x38c8  */
    /* JADX WARN: Removed duplicated region for block: B:707:0x24d4 A[EXC_TOP_SPLITTER, LOOP:2: B:707:0x24d4->B:472:0x25be, LOOP_START, PHI: r72
      0x24d4: PHI (r72v1 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>) = 
      (r72v0 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
      (r72v2 java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel>)
     binds: [B:462:0x24d2, B:472:0x25be] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.nst.iptvsmarterstvbox.model.LiveStreamsDBModel> getAllLiveStreasWithCategoryId(java.lang.String r184, java.lang.String r185) {
        /*
            Method dump skipped, instruction units count: 15030
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.getAllLiveStreasWithCategoryId(java.lang.String, java.lang.String):java.util.ArrayList");
    }

    public ArrayList<LiveStreamsDBModel> getAllLiveStreasWithSkyId(String str, String str2) {
        String string;
        ArrayList<LiveStreamsDBModel> arrayList;
        String string2;
        ArrayList<LiveStreamsDBModel> arrayList2;
        String str3;
        ArrayList<LiveStreamsDBModel> arrayList3 = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            if (str.equals("0")) {
                str3 = "SELECT  * FROM iptv_live_streams_m3u WHERE stream_type ='" + str2 + "' AND " + KEY_USER_ID + "='" + userID + "'";
            } else if (str.equals("-2") || str.equals("-3") || str.equals(Constants.NULL_VERSION_ID)) {
                str3 = "";
            } else {
                str3 = "SELECT  * FROM iptv_live_streams_m3u WHERE stream_type ='" + str2 + "' AND categoryID ='" + str + "' AND " + KEY_USER_ID + "='" + userID + "'";
            }
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                            liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            liveStreamsDBModel.setUrl(cursorRawQuery.getString(18));
                            arrayList3.add(liveStreamsDBModel);
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return arrayList3;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        ArrayList<LiveStreamsDBModel> arrayList4 = arrayList3;
        if (currentAPPType.equals("onestream_api")) {
            if (str.equals("0") && str2.equals(KEY_AVAIL_CHANNEL_LIVE)) {
                string2 = "SELECT  * FROM onestream_iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR " + KEY_STRESM_TYPE + " LIKE '%radio%' ) AND " + KEY_USER_ID + "='" + userID + "'";
            } else if (str.equals("-2") || str.equals("-3")) {
                string2 = "SELECT  * FROM onestream_iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR " + KEY_STRESM_TYPE + " LIKE '%radio%' ) AND categoryID ='" + str + "' AND " + KEY_USER_ID + "='" + userID + "'";
            } else {
                StringBuilder sb = str.equals(Constants.NULL_VERSION_ID) ? new StringBuilder() : new StringBuilder();
                sb.append("SELECT  * FROM onestream_iptv_live_streams WHERE categoryID ='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(KEY_USER_ID);
                sb.append("='");
                sb.append(userID);
                sb.append("'");
                string2 = sb.toString();
            }
            try {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string2, null);
                    if (cursorRawQuery2.moveToFirst()) {
                        while (true) {
                            LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                            liveStreamsDBModel2.setIdAuto(Integer.parseInt(cursorRawQuery2.getString(0)));
                            liveStreamsDBModel2.setNum(cursorRawQuery2.getString(1));
                            liveStreamsDBModel2.setName(cursorRawQuery2.getString(2));
                            liveStreamsDBModel2.setStreamType(cursorRawQuery2.getString(3));
                            liveStreamsDBModel2.setStreamId(cursorRawQuery2.getString(4));
                            liveStreamsDBModel2.setStreamIdOneStream(cursorRawQuery2.getString(4));
                            liveStreamsDBModel2.setStreamIcon(cursorRawQuery2.getString(5));
                            liveStreamsDBModel2.setEpgChannelId(cursorRawQuery2.getString(6));
                            liveStreamsDBModel2.setAdded(cursorRawQuery2.getString(7));
                            liveStreamsDBModel2.setCategoryId(cursorRawQuery2.getString(8));
                            liveStreamsDBModel2.setCustomSid(cursorRawQuery2.getString(9));
                            liveStreamsDBModel2.setTvArchive(cursorRawQuery2.getString(10));
                            liveStreamsDBModel2.setDirectSource(cursorRawQuery2.getString(11));
                            liveStreamsDBModel2.setTvArchiveDuration(cursorRawQuery2.getString(12));
                            liveStreamsDBModel2.setTypeName(cursorRawQuery2.getString(13));
                            liveStreamsDBModel2.setCategoryName(cursorRawQuery2.getString(14));
                            liveStreamsDBModel2.setSeriesNo(cursorRawQuery2.getString(15));
                            liveStreamsDBModel2.setLive(cursorRawQuery2.getString(16));
                            liveStreamsDBModel2.setContaiinerExtension(cursorRawQuery2.getString(17));
                            liveStreamsDBModel2.setUrl(cursorRawQuery2.getString(20));
                            arrayList2 = arrayList4;
                            arrayList2.add(liveStreamsDBModel2);
                            if (!cursorRawQuery2.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList2;
                        }
                    } else {
                        arrayList2 = arrayList4;
                    }
                    cursorRawQuery2.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused5) {
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                return null;
            } catch (Exception unused8) {
                return null;
            }
        }
        if (str.equals("0") && str2.equals(KEY_AVAIL_CHANNEL_LIVE)) {
            string = "SELECT  * FROM iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR " + KEY_STRESM_TYPE + " LIKE '%radio%' ) AND " + KEY_USER_ID + "='" + userID + "'";
        } else if (str.equals("-2") || str.equals("-3")) {
            string = "SELECT  * FROM iptv_live_streams WHERE (stream_type LIKE '%" + str2 + "%' OR " + KEY_STRESM_TYPE + " LIKE '%radio%' ) AND categoryID ='" + str + "' AND " + KEY_USER_ID + "='" + userID + "'";
        } else {
            StringBuilder sb2 = str.equals(Constants.NULL_VERSION_ID) ? new StringBuilder() : new StringBuilder();
            sb2.append("SELECT  * FROM iptv_live_streams WHERE categoryID ='");
            sb2.append(str);
            sb2.append("' AND ");
            sb2.append(KEY_USER_ID);
            sb2.append("='");
            sb2.append(userID);
            sb2.append("'");
            string = sb2.toString();
        }
        try {
            try {
                Cursor cursorRawQuery3 = getReadableDatabase().rawQuery(string, null);
                if (cursorRawQuery3.moveToFirst()) {
                    while (true) {
                        LiveStreamsDBModel liveStreamsDBModel3 = new LiveStreamsDBModel();
                        liveStreamsDBModel3.setIdAuto(Integer.parseInt(cursorRawQuery3.getString(0)));
                        liveStreamsDBModel3.setNum(cursorRawQuery3.getString(1));
                        liveStreamsDBModel3.setName(cursorRawQuery3.getString(2));
                        liveStreamsDBModel3.setStreamType(cursorRawQuery3.getString(3));
                        liveStreamsDBModel3.setStreamId(cursorRawQuery3.getString(4));
                        liveStreamsDBModel3.setStreamIdOneStream(cursorRawQuery3.getString(4));
                        liveStreamsDBModel3.setStreamIcon(cursorRawQuery3.getString(5));
                        liveStreamsDBModel3.setEpgChannelId(cursorRawQuery3.getString(6));
                        liveStreamsDBModel3.setAdded(cursorRawQuery3.getString(7));
                        liveStreamsDBModel3.setCategoryId(cursorRawQuery3.getString(8));
                        liveStreamsDBModel3.setCustomSid(cursorRawQuery3.getString(9));
                        liveStreamsDBModel3.setTvArchive(cursorRawQuery3.getString(10));
                        liveStreamsDBModel3.setDirectSource(cursorRawQuery3.getString(11));
                        liveStreamsDBModel3.setTvArchiveDuration(cursorRawQuery3.getString(12));
                        liveStreamsDBModel3.setTypeName(cursorRawQuery3.getString(13));
                        liveStreamsDBModel3.setCategoryName(cursorRawQuery3.getString(14));
                        liveStreamsDBModel3.setSeriesNo(cursorRawQuery3.getString(15));
                        liveStreamsDBModel3.setLive(cursorRawQuery3.getString(16));
                        liveStreamsDBModel3.setContaiinerExtension(cursorRawQuery3.getString(17));
                        liveStreamsDBModel3.setUrl(cursorRawQuery3.getString(18));
                        arrayList = arrayList4;
                        arrayList.add(liveStreamsDBModel3);
                        if (!cursorRawQuery3.moveToNext()) {
                            break;
                        }
                        arrayList4 = arrayList;
                    }
                } else {
                    arrayList = arrayList4;
                }
                cursorRawQuery3.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused9) {
                return null;
            } catch (Exception unused10) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused11) {
            return null;
        } catch (Exception unused12) {
            return null;
        }
    }

    public ArrayList<FavouriteDBModel> getAllLiveWatchedIDString() {
        String str = "SELECT GROUP_CONCAT(stream_id_url) AS stream_id_url , app_type FROM iptv_live_watched WHERE user_id_referred=" + SharepreferenceDBHandler.getUserID(this.context) + " GROUP BY " + KEY_APP_TYPE;
        ArrayList<FavouriteDBModel> arrayList = new ArrayList<>();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            this.db = readableDatabase;
            Cursor cursorRawQuery = readableDatabase.rawQuery(str, null);
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

    public ArrayList<LiveStreamCategoryIdDBModel> getAllMovieCategoriesHavingParentIdNotZero(String str) {
        StringBuilder sb;
        String str2;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT * FROM iptv_onestream_movie_category WHERE paent_id='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT * FROM iptv_movie_category WHERE paent_id='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                    liveStreamCategoryIdDBModel.setParentId(Integer.parseInt(cursorRawQuery.getString(3)));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllMovieCategoriesHavingParentIdZero() {
        int i9;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList;
        int i10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            StringBuilder sb = new StringBuilder();
            ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = arrayList3;
            sb.append("SELECT iptv_movie_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_movie_category_m3u,iptv_live_streams_m3u WHERE iptv_movie_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_movie_category_m3u.user_id_referred = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_STRESM_TYPE);
            sb.append(" = 'movie' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb.append(" FROM ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(" WHERE ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" ='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS);
            sb.append(" ='1') GROUP BY ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" ORDER BY ");
            sb.append(TABLE_IPTV_MOVIE_CATEGORY_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(Name.MARK);
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                            liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                            liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                            liveStreamCategoryIdDBModel.setLiveStreamCounter(w.r0(cursorRawQuery.getString(5)));
                            arrayList2 = arrayList4;
                            arrayList2.add(liveStreamCategoryIdDBModel);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList2;
                        }
                    } else {
                        arrayList2 = arrayList4;
                    }
                    cursorRawQuery.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList5 = arrayList3;
        if (currentAPPType.equals("onestream_api")) {
            try {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_onestream_movie_category.* , COUNT(onestream_iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_onestream_movie_category,onestream_iptv_live_streams WHERE iptv_onestream_movie_category.categoryID_movie = onestream_iptv_live_streams.categoryID AND iptv_onestream_movie_category.user_id_referred = '" + userID + "' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_STRESM_TYPE + " = 'movie' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID ORDER BY " + TABLE_IPTV_ONSESTREAM_MOVIE_CATEGORY + InstructionFileId.DOT + KEY_ID_MOVIE, null);
                    if (cursorRawQuery2.moveToFirst()) {
                        while (true) {
                            try {
                                i10 = Integer.parseInt(cursorRawQuery2.getString(3));
                            } catch (NumberFormatException unused5) {
                                i10 = 0;
                            }
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel2.setId(Integer.parseInt(cursorRawQuery2.getString(0)));
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryID(cursorRawQuery2.getString(1));
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(cursorRawQuery2.getString(2));
                            liveStreamCategoryIdDBModel2.setParentId(i10);
                            liveStreamCategoryIdDBModel2.setLiveStreamCounter(w.r0(cursorRawQuery2.getString(5)));
                            arrayList = arrayList5;
                            arrayList.add(liveStreamCategoryIdDBModel2);
                            if (!cursorRawQuery2.moveToNext()) {
                                break;
                            }
                            arrayList5 = arrayList;
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    cursorRawQuery2.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused6) {
                    return null;
                } catch (Exception unused7) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused8) {
                return null;
            } catch (Exception unused9) {
                return null;
            }
        }
        if (currentAPPType.equals("stalker_api")) {
            try {
                try {
                    Cursor cursorRawQuery3 = getReadableDatabase().rawQuery("SELECT iptv_stalker_movie_category.* FROM iptv_stalker_movie_category WHERE iptv_stalker_movie_category.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_STALKER_MOVIE_CATEGORY + InstructionFileId.DOT + KEY_CATEGORY_ID_MOVIE + " NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_IPTV_STALKER_MOVIE_CATEGORY + InstructionFileId.DOT + KEY_ID_MOVIE, null);
                    if (cursorRawQuery3.moveToFirst()) {
                        do {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel3.setId(Integer.parseInt(cursorRawQuery3.getString(0)));
                            liveStreamCategoryIdDBModel3.setLiveStreamCategoryID(cursorRawQuery3.getString(1));
                            liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(cursorRawQuery3.getString(2));
                            liveStreamCategoryIdDBModel3.setAlias(cursorRawQuery3.getString(3));
                            liveStreamCategoryIdDBModel3.setCensored(cursorRawQuery3.getString(4));
                            arrayList5.add(liveStreamCategoryIdDBModel3);
                        } while (cursorRawQuery3.moveToNext());
                    }
                    cursorRawQuery3.close();
                    return arrayList5;
                } catch (SQLiteDatabaseLockedException unused10) {
                    return null;
                } catch (Exception unused11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused12) {
                return null;
            } catch (Exception unused13) {
                return null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery4 = getReadableDatabase().rawQuery("SELECT iptv_movie_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_movie_category,iptv_live_streams WHERE iptv_movie_category.categoryID_movie = iptv_live_streams.categoryID AND iptv_movie_category.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_STRESM_TYPE + " = 'movie' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID ORDER BY " + TABLE_IPTV_MOVIE_CATEGORY + InstructionFileId.DOT + KEY_ID_MOVIE, null);
                if (cursorRawQuery4.moveToFirst()) {
                    do {
                        try {
                            i9 = Integer.parseInt(cursorRawQuery4.getString(3));
                        } catch (NumberFormatException unused14) {
                            i9 = 0;
                        }
                        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel4 = new LiveStreamCategoryIdDBModel();
                        liveStreamCategoryIdDBModel4.setId(Integer.parseInt(cursorRawQuery4.getString(0)));
                        liveStreamCategoryIdDBModel4.setLiveStreamCategoryID(cursorRawQuery4.getString(1));
                        liveStreamCategoryIdDBModel4.setLiveStreamCategoryName(cursorRawQuery4.getString(2));
                        liveStreamCategoryIdDBModel4.setParentId(i9);
                        liveStreamCategoryIdDBModel4.setLiveStreamCounter(w.r0(cursorRawQuery4.getString(5)));
                        arrayList5.add(liveStreamCategoryIdDBModel4);
                    } while (cursorRawQuery4.moveToNext());
                }
                cursorRawQuery4.close();
                return arrayList5;
            } catch (SQLiteDatabaseLockedException unused15) {
                return null;
            } catch (Exception unused16) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused17) {
            return null;
        } catch (Exception unused18) {
            return null;
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllMovieCategoriesHavingParentIdZeroForParental() {
        StringBuilder sb;
        String str;
        int i9;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            sb = new StringBuilder();
            sb.append("SELECT * FROM iptv_movie_category_m3u WHERE user_id_referred='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append("categoryID");
            sb.append(" IS NOT NULL");
        } else {
            if (currentAPPType.equals("onestream_api")) {
                sb = new StringBuilder();
                sb.append("SELECT iptv_onestream_movie_category.* , COUNT(onestream_iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_onestream_movie_category,onestream_iptv_live_streams WHERE iptv_onestream_movie_category.categoryID_movie = onestream_iptv_live_streams.categoryID AND iptv_onestream_movie_category.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_STRESM_TYPE);
                sb.append(" = 'movie' GROUP BY ");
                sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append("categoryID");
                sb.append(" ORDER BY ");
                str = TABLE_IPTV_ONSESTREAM_MOVIE_CATEGORY;
            } else {
                sb = new StringBuilder();
                sb.append("SELECT iptv_movie_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_movie_category,iptv_live_streams WHERE iptv_movie_category.categoryID_movie = iptv_live_streams.categoryID AND iptv_movie_category.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_STRESM_TYPE);
                sb.append(" = 'movie' GROUP BY ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append("categoryID");
                sb.append(" ORDER BY ");
                str = TABLE_IPTV_MOVIE_CATEGORY;
            }
            sb.append(str);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_ID_MOVIE);
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    try {
                        i9 = Integer.parseInt(cursorRawQuery.getString(3));
                    } catch (NumberFormatException unused) {
                        i9 = 0;
                    }
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                    liveStreamCategoryIdDBModel.setParentId(i9);
                    liveStreamCategoryIdDBModel.setLiveStreamCounter(w.r0(cursorRawQuery.getString(5)));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public ArrayList<PasswordDBModel> getAllPassword(int i9) {
        StringBuilder sb;
        String str;
        ArrayList<PasswordDBModel> arrayList = new ArrayList<>();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u")) {
            sb = new StringBuilder();
            str = "SELECT * FROM iptv_password_table_m3u WHERE user_id_referred=";
        } else {
            sb = new StringBuilder();
            str = "SELECT * FROM iptv_password_table WHERE user_id_referred=";
        }
        sb.append(str);
        sb.append(i9);
        sb.append("");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    PasswordDBModel passwordDBModel = new PasswordDBModel();
                    passwordDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    passwordDBModel.setUserDetail(cursorRawQuery.getString(1));
                    passwordDBModel.setUserPassword(cursorRawQuery.getString(2));
                    arrayList.add(passwordDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<PasswordStatusDBModel> getAllPasswordStatus(int i9) {
        String str;
        ArrayList<PasswordStatusDBModel> arrayList = new ArrayList<>();
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            str = TABLE_IPTV_PASSWORD_STATUS_M3U;
        } else {
            currentAPPType.equals("onestream_api");
            str = TABLE_IPTV_PASSWORD_STATUS;
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + str + " WHERE " + KEY_USER_ID + "=" + i9 + "", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    PasswordStatusDBModel passwordStatusDBModel = new PasswordStatusDBModel();
                    passwordStatusDBModel.setIdPaswordStaus(Integer.parseInt(cursorRawQuery.getString(0)));
                    passwordStatusDBModel.setPasswordStatusCategoryId(cursorRawQuery.getString(1));
                    passwordStatusDBModel.setPasswordStatusUserDetail(cursorRawQuery.getString(2));
                    passwordStatusDBModel.setPasswordStatus(cursorRawQuery.getString(3));
                    arrayList.add(passwordStatusDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int getAllRecentlyMoviesStreamCount(int i9) {
        StringBuilder sb;
        String str;
        int i10;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT * FROM onestream_iptv_live_streams WHERE stream_type ='movie' AND user_id_referred = '";
        } else {
            sb = new StringBuilder();
            str = "SELECT * FROM iptv_live_streams WHERE stream_type ='movie' AND user_id_referred = '";
        }
        sb.append(str);
        sb.append(userID);
        sb.append("'  ORDER BY ");
        sb.append(Name.MARK);
        sb.append(" DESC LIMIT ");
        sb.append(i9);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                i10 = 0;
                while (true) {
                    AsyncTask asyncTask = w.f44700m;
                    if (asyncTask != null && asyncTask.isCancelled()) {
                        Log.e("honey", "stopped");
                        break;
                    }
                    i10++;
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                }
            } else {
                i10 = 0;
            }
            cursorRawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getAllRecentlySeriesStreamCount(int i9) {
        StringBuilder sb;
        String str;
        int i10;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT * FROM onestream_series_streams_v2 WHERE user_id_referred = '";
        } else {
            sb = new StringBuilder();
            str = "SELECT * FROM series_streams_v2 WHERE user_id_referred = '";
        }
        sb.append(str);
        sb.append(userID);
        sb.append("' ORDER BY ");
        sb.append(KEY_ID_SERIES_STREAMS);
        sb.append(" DESC LIMIT ");
        sb.append(i9);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                i10 = 0;
                while (true) {
                    AsyncTask asyncTask = w.f44700m;
                    if (asyncTask != null && asyncTask.isCancelled()) {
                        Log.e("honey", "stopped");
                        break;
                    }
                    i10++;
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                }
            } else {
                i10 = 0;
            }
            cursorRawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<LiveStreamsDBModel> getAllRecentlyWatchedLiveStreams(String str) {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        ArrayList<LiveStreamsDBModel> arrayList3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        ArrayList<LiveStreamsDBModel> arrayList4 = new ArrayList<>();
        if (currentAPPType.equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_streams_m3u.* FROM iptv_live_streams_m3u INNER JOIN iptv_live_watched ON iptv_live_streams_m3u.url = iptv_live_watched.stream_id_url AND iptv_live_streams_m3u.stream_type LIKE '%live%'  AND iptv_live_streams_m3u.user_id_referred ='" + userID + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + KEY_APP_TYPE + " ='m3u' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS_M3U + " WHERE " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + Name.MARK + " DESC", null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (SharepreferenceDBHandler.getAsyncTaskStatus(this.context) != 1) {
                            try {
                                LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                                liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
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
                                liveStreamsDBModel.setUrl(cursorRawQuery.getString(18));
                                arrayList3 = arrayList4;
                                arrayList3.add(liveStreamsDBModel);
                                if (!cursorRawQuery.moveToNext()) {
                                    break;
                                }
                                arrayList4 = arrayList3;
                            } catch (SQLiteDatabaseLockedException unused) {
                                return null;
                            } catch (Exception unused2) {
                                return null;
                            }
                        }
                        SharepreferenceDBHandler.setAsyncTaskStatus(0, this.context);
                        arrayList3 = arrayList4;
                    } else {
                        arrayList3 = arrayList4;
                    }
                    cursorRawQuery.close();
                    return arrayList3;
                } catch (SQLiteDatabaseLockedException unused3) {
                    return null;
                } catch (Exception unused4) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused5) {
            } catch (Exception unused6) {
            }
        } else {
            ArrayList<LiveStreamsDBModel> arrayList5 = arrayList4;
            if (currentAPPType.equals("onestream_api")) {
                try {
                    try {
                        Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT onestream_iptv_live_streams.* FROM onestream_iptv_live_streams INNER JOIN iptv_live_watched ON onestream_iptv_live_streams.stream_id = iptv_live_watched.stream_id_url AND onestream_iptv_live_streams.stream_type LIKE '%live%'  AND onestream_iptv_live_streams.user_id_referred ='" + userID + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + "type ='" + str + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + KEY_APP_TYPE + " ='onestream_api' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + Name.MARK + " DESC", null);
                        if (cursorRawQuery2.moveToFirst()) {
                            while (SharepreferenceDBHandler.getAsyncTaskStatus(this.context) != 1) {
                                try {
                                    LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                                    liveStreamsDBModel2.setIdAuto(Integer.parseInt(cursorRawQuery2.getString(0)));
                                    liveStreamsDBModel2.setNum(cursorRawQuery2.getString(1));
                                    liveStreamsDBModel2.setName(cursorRawQuery2.getString(2));
                                    liveStreamsDBModel2.setStreamType(cursorRawQuery2.getString(3));
                                    liveStreamsDBModel2.setStreamId(cursorRawQuery2.getString(4));
                                    liveStreamsDBModel2.setStreamIdOneStream(cursorRawQuery2.getString(4));
                                    liveStreamsDBModel2.setStreamIcon(cursorRawQuery2.getString(5));
                                    liveStreamsDBModel2.setEpgChannelId(cursorRawQuery2.getString(6));
                                    liveStreamsDBModel2.setAdded(cursorRawQuery2.getString(7));
                                    liveStreamsDBModel2.setCategoryId(cursorRawQuery2.getString(8));
                                    liveStreamsDBModel2.setCustomSid(cursorRawQuery2.getString(9));
                                    liveStreamsDBModel2.setTvArchive(cursorRawQuery2.getString(10));
                                    liveStreamsDBModel2.setDirectSource(cursorRawQuery2.getString(11));
                                    liveStreamsDBModel2.setTvArchiveDuration(cursorRawQuery2.getString(12));
                                    liveStreamsDBModel2.setTypeName(cursorRawQuery2.getString(13));
                                    liveStreamsDBModel2.setCategoryName(cursorRawQuery2.getString(14));
                                    liveStreamsDBModel2.setSeriesNo(cursorRawQuery2.getString(15));
                                    liveStreamsDBModel2.setLive(cursorRawQuery2.getString(16));
                                    liveStreamsDBModel2.setContaiinerExtension(cursorRawQuery2.getString(17));
                                    liveStreamsDBModel2.setRatingFromTen(cursorRawQuery2.getString(18));
                                    liveStreamsDBModel2.setRatingFromFive(cursorRawQuery2.getString(19));
                                    liveStreamsDBModel2.setUrl(cursorRawQuery2.getString(20));
                                    arrayList2 = arrayList5;
                                    arrayList2.add(liveStreamsDBModel2);
                                    if (!cursorRawQuery2.moveToNext()) {
                                        break;
                                    }
                                    arrayList5 = arrayList2;
                                } catch (SQLiteDatabaseLockedException unused7) {
                                    return null;
                                } catch (Exception unused8) {
                                    return null;
                                }
                            }
                            SharepreferenceDBHandler.setAsyncTaskStatus(0, this.context);
                        }
                        arrayList2 = arrayList5;
                        cursorRawQuery2.close();
                        return arrayList2;
                    } catch (SQLiteDatabaseLockedException unused9) {
                        return null;
                    } catch (Exception unused10) {
                        return null;
                    }
                } catch (SQLiteDatabaseLockedException unused11) {
                } catch (Exception unused12) {
                }
            } else {
                ArrayList<LiveStreamsDBModel> arrayList6 = arrayList5;
                try {
                    try {
                        Cursor cursorRawQuery3 = getReadableDatabase().rawQuery("SELECT iptv_live_streams.* FROM iptv_live_streams INNER JOIN iptv_live_watched ON iptv_live_streams.stream_id = iptv_live_watched.stream_id_url AND iptv_live_streams.stream_type LIKE '%live%'  AND iptv_live_streams.user_id_referred ='" + userID + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + "type ='" + str + "' AND " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + KEY_APP_TYPE + " ='api' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_IPTV_LIVE_WATCHED + InstructionFileId.DOT + Name.MARK + " DESC", null);
                        if (cursorRawQuery3.moveToFirst()) {
                            while (SharepreferenceDBHandler.getAsyncTaskStatus(this.context) != 1) {
                                try {
                                    LiveStreamsDBModel liveStreamsDBModel3 = new LiveStreamsDBModel();
                                    liveStreamsDBModel3.setIdAuto(Integer.parseInt(cursorRawQuery3.getString(0)));
                                    liveStreamsDBModel3.setNum(cursorRawQuery3.getString(1));
                                    liveStreamsDBModel3.setName(cursorRawQuery3.getString(2));
                                    liveStreamsDBModel3.setStreamType(cursorRawQuery3.getString(3));
                                    liveStreamsDBModel3.setStreamId(cursorRawQuery3.getString(4));
                                    liveStreamsDBModel3.setStreamIdOneStream(cursorRawQuery3.getString(4));
                                    liveStreamsDBModel3.setStreamIcon(cursorRawQuery3.getString(5));
                                    liveStreamsDBModel3.setEpgChannelId(cursorRawQuery3.getString(6));
                                    liveStreamsDBModel3.setAdded(cursorRawQuery3.getString(7));
                                    liveStreamsDBModel3.setCategoryId(cursorRawQuery3.getString(8));
                                    liveStreamsDBModel3.setCustomSid(cursorRawQuery3.getString(9));
                                    liveStreamsDBModel3.setTvArchive(cursorRawQuery3.getString(10));
                                    liveStreamsDBModel3.setDirectSource(cursorRawQuery3.getString(11));
                                    liveStreamsDBModel3.setTvArchiveDuration(cursorRawQuery3.getString(12));
                                    liveStreamsDBModel3.setTypeName(cursorRawQuery3.getString(13));
                                    liveStreamsDBModel3.setCategoryName(cursorRawQuery3.getString(14));
                                    liveStreamsDBModel3.setSeriesNo(cursorRawQuery3.getString(15));
                                    liveStreamsDBModel3.setLive(cursorRawQuery3.getString(16));
                                    liveStreamsDBModel3.setContaiinerExtension(cursorRawQuery3.getString(17));
                                    liveStreamsDBModel3.setRatingFromTen(cursorRawQuery3.getString(18));
                                    liveStreamsDBModel3.setRatingFromFive(cursorRawQuery3.getString(19));
                                    liveStreamsDBModel3.setUrl(cursorRawQuery3.getString(20));
                                    arrayList = arrayList6;
                                    arrayList.add(liveStreamsDBModel3);
                                    if (!cursorRawQuery3.moveToNext()) {
                                        break;
                                    }
                                    arrayList6 = arrayList;
                                } catch (SQLiteDatabaseLockedException unused13) {
                                    return null;
                                } catch (Exception unused14) {
                                    return null;
                                }
                            }
                            SharepreferenceDBHandler.setAsyncTaskStatus(0, this.context);
                        }
                        arrayList = arrayList6;
                        cursorRawQuery3.close();
                        return arrayList;
                    } catch (SQLiteDatabaseLockedException unused15) {
                        return null;
                    } catch (Exception unused16) {
                        return null;
                    }
                } catch (SQLiteDatabaseLockedException unused17) {
                } catch (Exception unused18) {
                }
            }
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllSeriesCategories() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_series_category_m3u WHERE user_id_referred='" + SharepreferenceDBHandler.getUserID(this.context) + "' AND categoryID IS NOT NULL", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                    liveStreamCategoryIdDBModel.setParentId(0);
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllSeriesCategoriesForParental() {
        StringBuilder sb;
        String str;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            sb.append("SELECT onestream_series_category_v2.* FROM onestream_series_category_v2,onestream_series_streams_v2 WHERE onestream_series_category_v2.category_id_series_v2 = onestream_series_streams_v2.category_id_series_stream_v2 AND onestream_series_category_v2.user_id_referred = '");
            sb.append(userID);
            sb.append("' GROUP BY ");
            sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_CATEGORY_ID_S);
            sb.append(" ORDER BY ");
            str = TABLE_ONESTREAM_IPTV_SERIES_CATEGORY;
        } else {
            sb = new StringBuilder();
            sb.append("SELECT series_category_v2.* FROM series_category_v2,series_streams_v2 WHERE series_category_v2.category_id_series_v2 = series_streams_v2.category_id_series_stream_v2 AND series_category_v2.user_id_referred = '");
            sb.append(userID);
            sb.append("' GROUP BY ");
            sb.append(TABLE_IPTV_SERIES_STREAMS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_CATEGORY_ID_S);
            sb.append(" ORDER BY ");
            str = TABLE_IPTV_SERIES_CATEGORY;
        }
        sb.append(str);
        sb.append(InstructionFileId.DOT);
        sb.append(KEY_ID_VOD);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(1));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(2));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllSeriesCategoriesMain() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_series_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_series_category_m3u,iptv_live_streams_m3u WHERE iptv_series_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_series_category_m3u.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_STRESM_TYPE + " = 'series' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS_M3U + " WHERE " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + "categoryID ORDER BY " + TABLE_IPTV_SERIES_CATEGORY_M3U + InstructionFileId.DOT + Name.MARK, null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                            liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                            liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                            liveStreamCategoryIdDBModel.setLiveStreamCounter(w.r0(cursorRawQuery.getString(4)));
                            arrayList3.add(liveStreamCategoryIdDBModel);
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return arrayList3;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        if (currentAPPType.equals("stalker_api")) {
            try {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_stalker_series_category.* FROM iptv_stalker_series_category WHERE iptv_stalker_series_category.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_STALKER_SERIES_CATEGORY + InstructionFileId.DOT + KEY_CATEGORY_ID_SERIES + " NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_IPTV_STALKER_SERIES_CATEGORY + InstructionFileId.DOT + KEY_ID_VOD, null);
                    if (cursorRawQuery2.moveToFirst()) {
                        do {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel2.setId(Integer.parseInt(cursorRawQuery2.getString(0)));
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(cursorRawQuery2.getString(1));
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryID(cursorRawQuery2.getString(2));
                            liveStreamCategoryIdDBModel2.setAlias(cursorRawQuery2.getString(3));
                            liveStreamCategoryIdDBModel2.setCensored(cursorRawQuery2.getString(4));
                            arrayList3.add(liveStreamCategoryIdDBModel2);
                        } while (cursorRawQuery2.moveToNext());
                    }
                    cursorRawQuery2.close();
                    return arrayList3;
                } catch (SQLiteDatabaseLockedException unused5) {
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                return null;
            } catch (Exception unused8) {
                return null;
            }
        }
        if (currentAPPType.equals("onestream_api")) {
            StringBuilder sb = new StringBuilder();
            ArrayList<LiveStreamCategoryIdDBModel> arrayList4 = arrayList3;
            sb.append("SELECT onestream_series_category_v2.* , COUNT(onestream_series_streams_v2.id_series_stream_v2) AS TOTAL_COUNT FROM onestream_series_category_v2,onestream_series_streams_v2 WHERE onestream_series_category_v2.category_id_series_v2 = onestream_series_streams_v2.category_id_series_stream_v2 AND onestream_series_category_v2.user_id_referred = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_CATEGORY_ID_S);
            sb.append(" NOT IN (SELECT ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb.append(" FROM ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(" WHERE ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" ='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS);
            sb.append(" ='1') GROUP BY ");
            sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_CATEGORY_ID_S);
            sb.append(" ORDER BY ");
            sb.append(TABLE_ONESTREAM_IPTV_SERIES_CATEGORY);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_ID_VOD);
            try {
                try {
                    Cursor cursorRawQuery3 = getReadableDatabase().rawQuery(sb.toString(), null);
                    if (cursorRawQuery3.moveToFirst()) {
                        while (true) {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel3.setId(Integer.parseInt(cursorRawQuery3.getString(0)));
                            liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(cursorRawQuery3.getString(1));
                            liveStreamCategoryIdDBModel3.setLiveStreamCategoryID(cursorRawQuery3.getString(2));
                            liveStreamCategoryIdDBModel3.setLiveStreamCounter(w.r0(cursorRawQuery3.getString(4)));
                            arrayList2 = arrayList4;
                            arrayList2.add(liveStreamCategoryIdDBModel3);
                            if (!cursorRawQuery3.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList2;
                        }
                    } else {
                        arrayList2 = arrayList4;
                    }
                    cursorRawQuery3.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused9) {
                    return null;
                } catch (Exception unused10) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused11) {
                return null;
            } catch (Exception unused12) {
                return null;
            }
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList5 = arrayList3;
        try {
            try {
                Cursor cursorRawQuery4 = getReadableDatabase().rawQuery("SELECT series_category_v2.* , COUNT(series_streams_v2.id_series_stream_v2) AS TOTAL_COUNT FROM series_category_v2,series_streams_v2 WHERE series_category_v2.category_id_series_v2 = series_streams_v2.category_id_series_stream_v2 AND series_category_v2.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_SERIES_STREAMS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_IPTV_SERIES_STREAMS + InstructionFileId.DOT + KEY_CATEGORY_ID_S + " NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_IPTV_SERIES_STREAMS + InstructionFileId.DOT + KEY_CATEGORY_ID_S + " ORDER BY " + TABLE_IPTV_SERIES_CATEGORY + InstructionFileId.DOT + KEY_ID_VOD, null);
                if (cursorRawQuery4.moveToFirst()) {
                    while (true) {
                        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel4 = new LiveStreamCategoryIdDBModel();
                        liveStreamCategoryIdDBModel4.setId(Integer.parseInt(cursorRawQuery4.getString(0)));
                        liveStreamCategoryIdDBModel4.setLiveStreamCategoryName(cursorRawQuery4.getString(1));
                        liveStreamCategoryIdDBModel4.setLiveStreamCategoryID(cursorRawQuery4.getString(2));
                        liveStreamCategoryIdDBModel4.setLiveStreamCounter(w.r0(cursorRawQuery4.getString(4)));
                        arrayList = arrayList5;
                        arrayList.add(liveStreamCategoryIdDBModel4);
                        if (!cursorRawQuery4.moveToNext()) {
                            break;
                        }
                        arrayList5 = arrayList;
                    }
                } else {
                    arrayList = arrayList5;
                }
                cursorRawQuery4.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused13) {
                return null;
            } catch (Exception unused14) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused15) {
            return null;
        } catch (Exception unused16) {
            return null;
        }
    }

    public ArrayList<SeriesDBModel> getAllSeriesIDs() {
        StringBuilder sb;
        String str;
        int i9;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT stream_id_series_stream_v2 FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred='";
        } else {
            sb = new StringBuilder();
            str = "SELECT stream_id_series_stream_v2 FROM series_streams_v2 WHERE series_streams_v2.user_id_referred='";
        }
        sb.append(str);
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    try {
                        i9 = Integer.parseInt(cursorRawQuery.getString(0));
                    } catch (NumberFormatException unused) {
                        i9 = 0;
                    }
                    String string = cursorRawQuery.getString(0);
                    SeriesDBModel seriesDBModel = new SeriesDBModel();
                    seriesDBModel.setseriesID(i9);
                    seriesDBModel.setOneStreamseriesID(string);
                    arrayList.add(seriesDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public int getAllSeriesStreamCount() {
        StringBuilder sb;
        String str;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE stream_type='series' AND user_id_referred='";
        } else if (currentAPPType.equals("onestream_api")) {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM onestream_series_streams_v2 WHERE user_id_referred = '";
        } else {
            sb = new StringBuilder();
            str = "SELECT  COUNT(*) FROM series_streams_v2 WHERE user_id_referred = '";
        }
        sb.append(str);
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:125:0x0c6a, code lost:
    
        android.util.Log.e("honey", "stopped");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0749, code lost:
    
        android.util.Log.e("honey", "stopped");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel> getAllSeriesStreamsWithCategoryId(java.lang.String r36) {
        /*
            Method dump skipped, instruction units count: 3428
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.getAllSeriesStreamsWithCategoryId(java.lang.String):java.util.ArrayList");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:27:0x00ac. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList<com.nst.iptvsmarterstvbox.model.callback.SeriesDBModel> getAllSeriesStreamsWithCategoryIdM3U(java.lang.String r41) {
        /*
            Method dump skipped, instruction units count: 1794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.getAllSeriesStreamsWithCategoryIdM3U(java.lang.String):java.util.ArrayList");
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllliveCategories() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3;
        int i9;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList4;
        int i10;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList5 = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        ArrayList<LiveStreamCategoryIdDBModel> arrayList6 = arrayList5;
        if (currentAPPType.equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_category_m3u.* , COUNT(iptv_live_streams_m3u.id) AS TOTAL_COUNT FROM iptv_live_category_m3u,iptv_live_streams_m3u WHERE iptv_live_category_m3u.categoryID = iptv_live_streams_m3u.categoryID AND iptv_live_category_m3u.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_STRESM_TYPE + " = 'live' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS_M3U + " WHERE " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + "categoryID ORDER BY " + TABLE_IPTV_LIVE_CATEGORY_M3U + InstructionFileId.DOT + Name.MARK, null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                            liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                            liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                            liveStreamCategoryIdDBModel.setLiveStreamCounter(w.r0(cursorRawQuery.getString(4)));
                            arrayList = arrayList6;
                            arrayList.add(liveStreamCategoryIdDBModel);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList6 = arrayList;
                        }
                    } else {
                        arrayList = arrayList6;
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        ArrayList<LiveStreamCategoryIdDBModel> arrayList7 = arrayList6;
        if (currentAPPType.equals("stalker_api")) {
            try {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT iptv_stalker_live_category.* , COUNT(iptv_stalker_live_streams.id) AS TOTAL_COUNT FROM iptv_stalker_live_category,iptv_stalker_live_streams WHERE iptv_stalker_live_category.categoryID_live = iptv_stalker_live_streams.categoryID AND iptv_stalker_live_category.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_STALKER_ALL_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_IPTV_STALKER_ALL_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_IPTV_STALKER_ALL_CHANNNELS + InstructionFileId.DOT + "categoryID ORDER BY " + TABLE_IPTV_STALKER_LIVE_CATEGORY + InstructionFileId.DOT + KEY_ID_LIVE, null);
                    if (cursorRawQuery2.moveToFirst()) {
                        while (true) {
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel2.setId(Integer.parseInt(cursorRawQuery2.getString(0)));
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryID(cursorRawQuery2.getString(1));
                            liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(cursorRawQuery2.getString(2));
                            liveStreamCategoryIdDBModel2.setAlias(cursorRawQuery2.getString(3));
                            liveStreamCategoryIdDBModel2.setCensored(cursorRawQuery2.getString(4));
                            liveStreamCategoryIdDBModel2.setLiveStreamCounter(w.r0(cursorRawQuery2.getString(6)));
                            arrayList2 = arrayList7;
                            arrayList2.add(liveStreamCategoryIdDBModel2);
                            if (!cursorRawQuery2.moveToNext()) {
                                break;
                            }
                            arrayList7 = arrayList2;
                        }
                    } else {
                        arrayList2 = arrayList7;
                    }
                    cursorRawQuery2.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused5) {
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                return null;
            } catch (Exception unused8) {
                return null;
            }
        }
        if (currentAPPType.equals("onestream_api")) {
            try {
                try {
                    Cursor cursorRawQuery3 = getReadableDatabase().rawQuery("SELECT iptv_onestream_live_category.* , COUNT(onestream_iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_onestream_live_category,onestream_iptv_live_streams WHERE iptv_onestream_live_category.categoryID_live = onestream_iptv_live_streams.categoryID AND iptv_onestream_live_category.user_id_referred = '" + userID + "' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID ORDER BY " + TABLE_IPTV_ONESTREAM_LIVE_CATEGORY + InstructionFileId.DOT + KEY_ID_LIVE, null);
                    if (cursorRawQuery3.moveToFirst()) {
                        while (true) {
                            try {
                                i9 = Integer.parseInt(cursorRawQuery3.getString(3));
                            } catch (NumberFormatException unused9) {
                                i9 = 0;
                            }
                            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel3 = new LiveStreamCategoryIdDBModel();
                            liveStreamCategoryIdDBModel3.setId(Integer.parseInt(cursorRawQuery3.getString(0)));
                            liveStreamCategoryIdDBModel3.setLiveStreamCategoryID(cursorRawQuery3.getString(1));
                            liveStreamCategoryIdDBModel3.setLiveStreamCategoryName(cursorRawQuery3.getString(2));
                            liveStreamCategoryIdDBModel3.setParentId(i9);
                            liveStreamCategoryIdDBModel3.setLiveStreamCounter(w.r0(cursorRawQuery3.getString(5)));
                            arrayList3 = arrayList7;
                            arrayList3.add(liveStreamCategoryIdDBModel3);
                            if (!cursorRawQuery3.moveToNext()) {
                                break;
                            }
                            arrayList7 = arrayList3;
                        }
                    } else {
                        arrayList3 = arrayList7;
                    }
                    cursorRawQuery3.close();
                    return arrayList3;
                } catch (SQLiteDatabaseLockedException unused10) {
                    return null;
                } catch (Exception unused11) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused12) {
                return null;
            } catch (Exception unused13) {
                return null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery4 = getReadableDatabase().rawQuery("SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND ( " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_STRESM_TYPE + " = 'live' OR " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_STRESM_TYPE + " = 'created_live' ) AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') GROUP BY " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID ORDER BY " + TABLE_IPTV_LIVE_CATEGORY + InstructionFileId.DOT + KEY_ID_LIVE, null);
                if (cursorRawQuery4.moveToFirst()) {
                    while (true) {
                        try {
                            i10 = Integer.parseInt(cursorRawQuery4.getString(3));
                        } catch (NumberFormatException unused14) {
                            i10 = 0;
                        }
                        LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel4 = new LiveStreamCategoryIdDBModel();
                        liveStreamCategoryIdDBModel4.setId(Integer.parseInt(cursorRawQuery4.getString(0)));
                        liveStreamCategoryIdDBModel4.setLiveStreamCategoryID(cursorRawQuery4.getString(1));
                        liveStreamCategoryIdDBModel4.setLiveStreamCategoryName(cursorRawQuery4.getString(2));
                        liveStreamCategoryIdDBModel4.setParentId(i10);
                        liveStreamCategoryIdDBModel4.setLiveStreamCounter(w.r0(cursorRawQuery4.getString(5)));
                        arrayList4 = arrayList7;
                        arrayList4.add(liveStreamCategoryIdDBModel4);
                        if (!cursorRawQuery4.moveToNext()) {
                            break;
                        }
                        arrayList7 = arrayList4;
                    }
                } else {
                    arrayList4 = arrayList7;
                }
                cursorRawQuery4.close();
                return arrayList4;
            } catch (SQLiteDatabaseLockedException unused15) {
                return null;
            } catch (Exception unused16) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused17) {
            return null;
        } catch (Exception unused18) {
            return null;
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllliveCategoriesForParental(String str) {
        StringBuilder sb;
        String str2;
        String string;
        int i9;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        System.currentTimeMillis();
        if (currentAPPType.equals("m3u")) {
            string = "SELECT * FROM iptv_live_category_m3u WHERE user_id_referred='" + userID + "' AND categoryID IS NOT NULL";
        } else {
            if (currentAPPType.equals("onestream_api")) {
                sb = new StringBuilder();
                sb.append("SELECT iptv_onestream_live_category.* , COUNT(onestream_iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_onestream_live_category,onestream_iptv_live_streams WHERE iptv_onestream_live_category.categoryID_live = onestream_iptv_live_streams.categoryID AND iptv_onestream_live_category.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_STRESM_TYPE);
                sb.append(" LIKE '%");
                sb.append(str);
                sb.append("%'  GROUP BY ");
                sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append("categoryID");
                sb.append(" ORDER BY ");
                str2 = TABLE_IPTV_ONESTREAM_LIVE_CATEGORY;
            } else {
                sb = new StringBuilder();
                sb.append("SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_STRESM_TYPE);
                sb.append(" LIKE '%");
                sb.append(str);
                sb.append("%'  GROUP BY ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append("categoryID");
                sb.append(" ORDER BY ");
                str2 = TABLE_IPTV_LIVE_CATEGORY;
            }
            sb.append(str2);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_ID_LIVE);
            string = sb.toString();
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
            if (cursorRawQuery.moveToFirst()) {
                System.currentTimeMillis();
                do {
                    try {
                        i9 = Integer.parseInt(cursorRawQuery.getString(3));
                    } catch (NumberFormatException unused) {
                        i9 = 0;
                    }
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                    liveStreamCategoryIdDBModel.setParentId(i9);
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllliveRadioCategories() {
        StringBuilder sb;
        String str;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList;
        int i9;
        ArrayList<LiveStreamCategoryIdDBModel> arrayList2 = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        System.currentTimeMillis();
        ArrayList<LiveStreamCategoryIdDBModel> arrayList3 = arrayList2;
        if (currentAPPType.equals("onestream_api")) {
            sb = new StringBuilder();
            sb.append("SELECT iptv_onestream_live_category.* , COUNT(onestream_iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_onestream_live_category,onestream_iptv_live_streams WHERE iptv_onestream_live_category.categoryID_live = onestream_iptv_live_streams.categoryID AND iptv_onestream_live_category.user_id_referred = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_STRESM_TYPE);
            sb.append(" = 'radio_streams' AND ");
            sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb.append(" FROM ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(" WHERE ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" ='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS);
            sb.append(" ='1') GROUP BY ");
            sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" ORDER BY ");
            str = TABLE_IPTV_ONESTREAM_LIVE_CATEGORY;
        } else {
            sb = new StringBuilder();
            sb.append("SELECT iptv_live_category.* , COUNT(iptv_live_streams.id) AS TOTAL_COUNT FROM iptv_live_category,iptv_live_streams WHERE iptv_live_category.categoryID_live = iptv_live_streams.categoryID AND iptv_live_category.user_id_referred = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_STRESM_TYPE);
            sb.append(" = 'radio_streams' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb.append(" FROM ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(" WHERE ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" ='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS);
            sb.append(" ='1') GROUP BY ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" ORDER BY ");
            str = TABLE_IPTV_LIVE_CATEGORY;
        }
        sb.append(str);
        sb.append(InstructionFileId.DOT);
        sb.append(KEY_ID_LIVE);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (cursorRawQuery.moveToFirst()) {
                System.currentTimeMillis();
                while (true) {
                    try {
                        i9 = Integer.parseInt(cursorRawQuery.getString(3));
                    } catch (NumberFormatException unused) {
                        i9 = 0;
                    }
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                    liveStreamCategoryIdDBModel.setParentId(i9);
                    liveStreamCategoryIdDBModel.setLiveStreamCounter(w.r0(cursorRawQuery.getString(5)));
                    arrayList = arrayList3;
                    arrayList.add(liveStreamCategoryIdDBModel);
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                    arrayList3 = arrayList;
                }
            } else {
                arrayList = arrayList3;
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public ArrayList<LiveStreamCategoryIdDBModel> getAllm3uCategories() {
        ArrayList<LiveStreamCategoryIdDBModel> arrayList = new ArrayList<>();
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        new ArrayList();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_m3u_all_category WHERE user_id_referred='" + userID + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                    liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                    liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                    liveStreamCategoryIdDBModel.setParentId(Integer.parseInt(cursorRawQuery.getString(3)));
                    arrayList.add(liveStreamCategoryIdDBModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<M3UCategoriesModel> getAllm3uCategoriesWithType(String str) {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<M3UCategoriesModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  iptv_m3u_all_category.* FROM iptv_m3u_all_category,iptv_live_streams_m3u WHERE iptv_live_streams_m3u.user_id_referred = " + userID + " AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_STRESM_TYPE + " = '" + str + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + "categoryID=" + TABLE_IPTV_ALL_M3U_CATEGORY + InstructionFileId.DOT + "categoryID GROUP BY " + TABLE_IPTV_ALL_M3U_CATEGORY + InstructionFileId.DOT + "categoryID", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    M3UCategoriesModel m3UCategoriesModel = new M3UCategoriesModel();
                    m3UCategoriesModel.setCategoryId(cursorRawQuery.getString(1));
                    m3UCategoriesModel.setCategoryName(cursorRawQuery.getString(2));
                    arrayList.add(m3UCategoriesModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int getAvailableCountM3U(String str, String str2) {
        String str3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (str.equals("0")) {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE user_id_referred='" + userID + "' AND " + KEY_STRESM_TYPE + "='" + str2 + "'";
        } else if (str.equals("-1")) {
            str3 = "";
        } else {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND " + KEY_USER_ID + "='" + userID + "' AND " + KEY_STRESM_TYPE + "='" + str2 + "'";
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public M3UCategoriesModel getCatByCatIDALLM3U(String str) {
        String str2 = "SELECT  * FROM iptv_m3u_all_category WHERE categoryID='" + str + "' AND " + KEY_USER_ID + "='" + SharepreferenceDBHandler.getUserID(this.context) + "'";
        M3UCategoriesModel m3UCategoriesModel = new M3UCategoriesModel();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    m3UCategoriesModel.setCategoryId(cursorRawQuery.getString(1));
                    m3UCategoriesModel.setCategoryName(cursorRawQuery.getString(2));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return m3UCategoriesModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public LiveStreamCategoryIdDBModel getChannelCatNameFromSelectedCatId(String str) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u")) {
            sb = new StringBuilder();
            sb.append("SELECT  * FROM iptv_live_category_m3u WHERE user_id_referred='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append("categoryID");
        } else {
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sb = new StringBuilder();
                str2 = "SELECT  * FROM iptv_onestream_live_category WHERE user_id_referred='";
            } else {
                sb = new StringBuilder();
                str2 = "SELECT  * FROM iptv_live_category WHERE user_id_referred='";
            }
            sb.append(str2);
            sb.append(userID);
            sb.append("' AND ");
            sb.append(KEY_CATEGORY_ID_LIVE);
        }
        sb.append("='");
        sb.append(str);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            if (!cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                return null;
            }
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u")) {
                LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
                liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
                liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
                liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
                return liveStreamCategoryIdDBModel;
            }
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel2 = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel2.setId(Integer.parseInt(cursorRawQuery.getString(0)));
            liveStreamCategoryIdDBModel2.setLiveStreamCategoryID(cursorRawQuery.getString(1));
            liveStreamCategoryIdDBModel2.setLiveStreamCategoryName(cursorRawQuery.getString(2));
            liveStreamCategoryIdDBModel2.setLiveStreamCounter(w.r0(cursorRawQuery.getString(4)));
            return liveStreamCategoryIdDBModel2;
        } catch (SQLiteDatabaseLockedException e9) {
            e = e9;
            sb2 = new StringBuilder();
            sb2.append("msg");
            sb2.append(e);
            Log.e("msg", sb2.toString());
            return null;
        } catch (Exception e10) {
            e = e10;
            sb2 = new StringBuilder();
            sb2.append("msg");
            sb2.append(e);
            Log.e("msg", sb2.toString());
            return null;
        }
    }

    public LiveStreamCategoryIdDBModel getChannelCatNameFromSelectedCatIdForM3U(String str) {
        StringBuilder sb;
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_category_m3u WHERE user_id_referred='" + SharepreferenceDBHandler.getUserID(this.context) + "' AND " + KEY_CATEGORY_ID_LIVE + "='" + str + "'", null);
            if (!cursorRawQuery.moveToFirst()) {
                cursorRawQuery.close();
                return null;
            }
            LiveStreamCategoryIdDBModel liveStreamCategoryIdDBModel = new LiveStreamCategoryIdDBModel();
            liveStreamCategoryIdDBModel.setId(Integer.parseInt(cursorRawQuery.getString(0)));
            liveStreamCategoryIdDBModel.setLiveStreamCategoryID(cursorRawQuery.getString(1));
            liveStreamCategoryIdDBModel.setLiveStreamCategoryName(cursorRawQuery.getString(2));
            liveStreamCategoryIdDBModel.setLiveStreamCounter(w.r0(cursorRawQuery.getString(4)));
            return liveStreamCategoryIdDBModel;
        } catch (SQLiteDatabaseLockedException e9) {
            e = e9;
            sb = new StringBuilder();
            sb.append("msg");
            sb.append(e);
            Log.e("msg", sb.toString());
            return null;
        } catch (Exception e10) {
            e = e10;
            sb = new StringBuilder();
            sb.append("msg");
            sb.append(e);
            Log.e("msg", sb.toString());
            return null;
        }
    }

    public ArrayList<LiveStreamsDBModel> getChannelDetails(String str, String str2) {
        if (str != null) {
            ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            if (currentAPPType.equals("m3u")) {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams_m3u WHERE stream_type LIKE '%live%' AND num='" + str + "' AND " + KEY_USER_ID + "='" + userID + "' LIMIT 1", null);
                    if (cursorRawQuery.moveToFirst()) {
                        do {
                            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                            liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            liveStreamsDBModel.setUrl(cursorRawQuery.getString(18));
                            arrayList.add(liveStreamsDBModel);
                        } while (cursorRawQuery.moveToNext());
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException | Exception unused) {
                    return null;
                }
            }
            if (currentAPPType.equals("onestream_api")) {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT  * FROM onestream_iptv_live_streams WHERE stream_type LIKE '%" + str2 + "%' AND " + KEY_NUM_LIVE_STREAMS + "='" + str + "' AND " + KEY_USER_ID + "='" + userID + "' LIMIT 1", null);
                    if (cursorRawQuery2.moveToFirst()) {
                        do {
                            LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                            liveStreamsDBModel2.setIdAuto(Integer.parseInt(cursorRawQuery2.getString(0)));
                            liveStreamsDBModel2.setNum(cursorRawQuery2.getString(1));
                            liveStreamsDBModel2.setName(cursorRawQuery2.getString(2));
                            liveStreamsDBModel2.setStreamType(cursorRawQuery2.getString(3));
                            liveStreamsDBModel2.setStreamId(cursorRawQuery2.getString(4));
                            liveStreamsDBModel2.setStreamIdOneStream(cursorRawQuery2.getString(4));
                            liveStreamsDBModel2.setStreamIcon(cursorRawQuery2.getString(5));
                            liveStreamsDBModel2.setEpgChannelId(cursorRawQuery2.getString(6));
                            liveStreamsDBModel2.setAdded(cursorRawQuery2.getString(7));
                            liveStreamsDBModel2.setCategoryId(cursorRawQuery2.getString(8));
                            liveStreamsDBModel2.setCustomSid(cursorRawQuery2.getString(9));
                            liveStreamsDBModel2.setTvArchive(cursorRawQuery2.getString(10));
                            liveStreamsDBModel2.setDirectSource(cursorRawQuery2.getString(11));
                            liveStreamsDBModel2.setTvArchiveDuration(cursorRawQuery2.getString(12));
                            liveStreamsDBModel2.setTypeName(cursorRawQuery2.getString(13));
                            liveStreamsDBModel2.setCategoryName(cursorRawQuery2.getString(14));
                            liveStreamsDBModel2.setSeriesNo(cursorRawQuery2.getString(15));
                            liveStreamsDBModel2.setLive(cursorRawQuery2.getString(16));
                            liveStreamsDBModel2.setContaiinerExtension(cursorRawQuery2.getString(17));
                            liveStreamsDBModel2.setUrl(cursorRawQuery2.getString(20));
                            arrayList.add(liveStreamsDBModel2);
                        } while (cursorRawQuery2.moveToNext());
                    }
                    cursorRawQuery2.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException | Exception unused2) {
                    return null;
                }
            }
            try {
                Cursor cursorRawQuery3 = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%" + str2 + "%' AND " + KEY_NUM_LIVE_STREAMS + "='" + str + "' AND " + KEY_USER_ID + "='" + userID + "' LIMIT 1", null);
                if (cursorRawQuery3.moveToFirst()) {
                    do {
                        LiveStreamsDBModel liveStreamsDBModel3 = new LiveStreamsDBModel();
                        liveStreamsDBModel3.setIdAuto(Integer.parseInt(cursorRawQuery3.getString(0)));
                        liveStreamsDBModel3.setNum(cursorRawQuery3.getString(1));
                        liveStreamsDBModel3.setName(cursorRawQuery3.getString(2));
                        liveStreamsDBModel3.setStreamType(cursorRawQuery3.getString(3));
                        liveStreamsDBModel3.setStreamId(cursorRawQuery3.getString(4));
                        liveStreamsDBModel3.setStreamIdOneStream(cursorRawQuery3.getString(4));
                        liveStreamsDBModel3.setStreamIcon(cursorRawQuery3.getString(5));
                        liveStreamsDBModel3.setEpgChannelId(cursorRawQuery3.getString(6));
                        liveStreamsDBModel3.setAdded(cursorRawQuery3.getString(7));
                        liveStreamsDBModel3.setCategoryId(cursorRawQuery3.getString(8));
                        liveStreamsDBModel3.setCustomSid(cursorRawQuery3.getString(9));
                        liveStreamsDBModel3.setTvArchive(cursorRawQuery3.getString(10));
                        liveStreamsDBModel3.setDirectSource(cursorRawQuery3.getString(11));
                        liveStreamsDBModel3.setTvArchiveDuration(cursorRawQuery3.getString(12));
                        liveStreamsDBModel3.setTypeName(cursorRawQuery3.getString(13));
                        liveStreamsDBModel3.setCategoryName(cursorRawQuery3.getString(14));
                        liveStreamsDBModel3.setSeriesNo(cursorRawQuery3.getString(15));
                        liveStreamsDBModel3.setLive(cursorRawQuery3.getString(16));
                        liveStreamsDBModel3.setContaiinerExtension(cursorRawQuery3.getString(17));
                        liveStreamsDBModel3.setUrl(cursorRawQuery3.getString(18));
                        arrayList.add(liveStreamsDBModel3);
                    } while (cursorRawQuery3.moveToNext());
                }
                cursorRawQuery3.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException | Exception unused3) {
            }
        }
        return null;
    }

    public int getCountMovedItems(String str, String str2) {
        String str3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (str.equals("0")) {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u_all WHERE user_id_referred='" + userID + "' AND " + KEY_MOVE_TO + "='" + str2 + "'";
        } else {
            str3 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u_all WHERE categoryID='" + str + "' AND " + KEY_USER_ID + "='" + userID + "' AND " + KEY_MOVE_TO + "='" + str2 + "'";
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str3, null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<XMLTVProgrammePojo> getEPG(String str) {
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<XMLTVProgrammePojo> arrayList = new ArrayList<>();
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            str2 = TABLE_EPG_M3U;
        } else {
            currentAPPType.equals("onestream_api");
            str2 = TABLE_EPG;
        }
        ArrayList<EPGSourcesModel> activeEPGSource = getActiveEPGSource();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + str2 + " WHERE " + KEY_CHANNEL_ID + "='" + str + "' AND " + KEY_USER_ID + "='" + userID + "' AND " + KEY_SOURCE_REF_ID + "='" + ((activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto())) + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.setTitle(cursorRawQuery.getString(1));
                    xMLTVProgrammePojo.setStart(cursorRawQuery.getString(2));
                    xMLTVProgrammePojo.setStop(cursorRawQuery.getString(3));
                    xMLTVProgrammePojo.setDesc(cursorRawQuery.getString(4));
                    xMLTVProgrammePojo.setChannel(cursorRawQuery.getString(5));
                    xMLTVProgrammePojo.setSourceRef(cursorRawQuery.getString(7));
                    arrayList.add(xMLTVProgrammePojo);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int getEPGCount() {
        String str;
        StringBuilder sb;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        ArrayList<EPGSourcesModel> activeEPGSource = getActiveEPGSource();
        String strValueOf = (activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto());
        if (currentAPPType.equals("m3u")) {
            sb = new StringBuilder();
            str = "SELECT  * FROM epg_m3u WHERE user_id_referred='";
        } else {
            str = "SELECT  * FROM epg WHERE user_id_referred='";
            sb = currentAPPType.equals("onestream_api") ? new StringBuilder() : new StringBuilder();
        }
        sb.append(str);
        sb.append(userID);
        sb.append("' AND ");
        sb.append(KEY_SOURCE_REF_ID);
        sb.append("='");
        sb.append(strValueOf);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getEPGCountWithSourceRef(String str) {
        String str2;
        StringBuilder sb;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM epg_m3u WHERE user_id_referred='";
        } else {
            str2 = "SELECT  * FROM epg WHERE user_id_referred='";
            sb = currentAPPType.equals("onestream_api") ? new StringBuilder() : new StringBuilder();
        }
        sb.append(str2);
        sb.append(userID);
        sb.append("' AND ");
        sb.append(KEY_SOURCE_REF_ID);
        sb.append("='");
        sb.append(str);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<XMLTVProgrammePojo> getEPGSearch(String str, String str2) {
        ArrayList<XMLTVProgrammePojo> arrayList;
        ArrayList<XMLTVProgrammePojo> arrayList2;
        ArrayList<XMLTVProgrammePojo> arrayList3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<XMLTVProgrammePojo> arrayList4 = new ArrayList<>();
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        ArrayList<EPGSourcesModel> activeEPGSource = getActiveEPGSource();
        String strValueOf = (activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto());
        ArrayList<XMLTVProgrammePojo> arrayList5 = arrayList4;
        if (currentAPPType.equals("m3u")) {
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT DISTINCT title,start,stop,description,channel_id,num,name,stream_icon,categoryID,url FROM epg_m3u , iptv_live_streams_m3u WHERE epg_m3u.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_EPG_M3U + InstructionFileId.DOT + KEY_SOURCE_REF_ID + " = '" + strValueOf + "' AND " + TABLE_EPG_M3U + InstructionFileId.DOT + KEY_CHANNEL_ID + " = " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_EPG_CHANNEL_ID + " AND " + TABLE_EPG_M3U + InstructionFileId.DOT + "title LIKE '%" + str + "%' AND " + KEY_STOP + ">='" + str2 + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS_M3U + " WHERE " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS_M3U + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_EPG_M3U + InstructionFileId.DOT + KEY_STOP + " ASC", null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = w.f44703p;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", "stopped epg");
                                break;
                            }
                            XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                            xMLTVProgrammePojo.setTitle(cursorRawQuery.getString(0));
                            xMLTVProgrammePojo.setStart(cursorRawQuery.getString(1));
                            xMLTVProgrammePojo.setStop(cursorRawQuery.getString(2));
                            xMLTVProgrammePojo.setDesc(cursorRawQuery.getString(3));
                            xMLTVProgrammePojo.setChannel(cursorRawQuery.getString(4));
                            xMLTVProgrammePojo.setLiveNum(cursorRawQuery.getString(5));
                            xMLTVProgrammePojo.setLiveName(cursorRawQuery.getString(6));
                            xMLTVProgrammePojo.setLiveStreamID("");
                            xMLTVProgrammePojo.setLiveLogo(cursorRawQuery.getString(7));
                            xMLTVProgrammePojo.setLiveCategoryId(cursorRawQuery.getString(8));
                            xMLTVProgrammePojo.setUrl(cursorRawQuery.getString(9));
                            arrayList3 = arrayList5;
                            arrayList3.add(xMLTVProgrammePojo);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList5 = arrayList3;
                        }
                    } else {
                        arrayList3 = arrayList5;
                    }
                    cursorRawQuery.close();
                    return arrayList3;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        if (!currentAPPType.equals("onestream_api")) {
            try {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT DISTINCT title,start,stop,description,channel_id,num,name,stream_id,stream_icon,categoryID FROM epg , iptv_live_streams WHERE epg.user_id_referred = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_EPG + InstructionFileId.DOT + KEY_SOURCE_REF_ID + " = '" + strValueOf + "' AND " + TABLE_EPG + InstructionFileId.DOT + KEY_CHANNEL_ID + " = " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_EPG_CHANNEL_ID + " AND " + TABLE_EPG + InstructionFileId.DOT + "title LIKE '%" + str + "%' AND " + KEY_STOP + ">='" + str2 + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_EPG + InstructionFileId.DOT + KEY_STOP + " ASC", null);
                    if (cursorRawQuery2.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask2 = w.f44703p;
                            if (asyncTask2 != null && asyncTask2.isCancelled()) {
                                Log.e("honey", "stopped epg");
                                break;
                            }
                            XMLTVProgrammePojo xMLTVProgrammePojo2 = new XMLTVProgrammePojo();
                            xMLTVProgrammePojo2.setTitle(cursorRawQuery2.getString(0));
                            xMLTVProgrammePojo2.setStart(cursorRawQuery2.getString(1));
                            xMLTVProgrammePojo2.setStop(cursorRawQuery2.getString(2));
                            xMLTVProgrammePojo2.setDesc(cursorRawQuery2.getString(3));
                            xMLTVProgrammePojo2.setChannel(cursorRawQuery2.getString(4));
                            xMLTVProgrammePojo2.setLiveNum(cursorRawQuery2.getString(5));
                            xMLTVProgrammePojo2.setLiveName(cursorRawQuery2.getString(6));
                            xMLTVProgrammePojo2.setLiveStreamID(cursorRawQuery2.getString(7));
                            xMLTVProgrammePojo2.setLiveLogo(cursorRawQuery2.getString(8));
                            xMLTVProgrammePojo2.setLiveCategoryId(cursorRawQuery2.getString(9));
                            arrayList = arrayList5;
                            arrayList.add(xMLTVProgrammePojo2);
                            if (!cursorRawQuery2.moveToNext()) {
                                break;
                            }
                            arrayList5 = arrayList;
                        }
                    } else {
                        arrayList = arrayList5;
                    }
                    cursorRawQuery2.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused5) {
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                return null;
            } catch (Exception unused8) {
                return null;
            }
        }
        try {
            try {
                Cursor cursorRawQuery3 = getReadableDatabase().rawQuery("SELECT DISTINCT title,start,stop,description,channel_id,num,name,stream_id,stream_icon,categoryID FROM epg , onestream_iptv_live_streams WHERE epg.user_id_referred = '" + userID + "' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_EPG + InstructionFileId.DOT + KEY_SOURCE_REF_ID + " = '" + strValueOf + "' AND " + TABLE_EPG + InstructionFileId.DOT + KEY_CHANNEL_ID + " = " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_EPG_CHANNEL_ID + " AND " + TABLE_EPG + InstructionFileId.DOT + "title LIKE '%" + str + "%' AND " + KEY_STOP + ">='" + str2 + "' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + TABLE_EPG + InstructionFileId.DOT + KEY_STOP + " ASC", null);
                if (cursorRawQuery3.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask3 = w.f44703p;
                        if (asyncTask3 != null && asyncTask3.isCancelled()) {
                            Log.e("honey", "stopped epg");
                            break;
                        }
                        XMLTVProgrammePojo xMLTVProgrammePojo3 = new XMLTVProgrammePojo();
                        xMLTVProgrammePojo3.setTitle(cursorRawQuery3.getString(0));
                        xMLTVProgrammePojo3.setStart(cursorRawQuery3.getString(1));
                        xMLTVProgrammePojo3.setStop(cursorRawQuery3.getString(2));
                        xMLTVProgrammePojo3.setDesc(cursorRawQuery3.getString(3));
                        xMLTVProgrammePojo3.setChannel(cursorRawQuery3.getString(4));
                        xMLTVProgrammePojo3.setLiveNum(cursorRawQuery3.getString(5));
                        xMLTVProgrammePojo3.setLiveName(cursorRawQuery3.getString(6));
                        xMLTVProgrammePojo3.setLiveStreamID(cursorRawQuery3.getString(7));
                        xMLTVProgrammePojo3.setLiveLogo(cursorRawQuery3.getString(8));
                        xMLTVProgrammePojo3.setLiveCategoryId(cursorRawQuery3.getString(9));
                        arrayList2 = arrayList5;
                        arrayList2.add(xMLTVProgrammePojo3);
                        if (!cursorRawQuery3.moveToNext()) {
                            break;
                        }
                        arrayList5 = arrayList2;
                    }
                    arrayList2 = arrayList5;
                } else {
                    arrayList2 = arrayList5;
                }
                cursorRawQuery3.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused9) {
                return null;
            } catch (Exception unused10) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused11) {
            return null;
        } catch (Exception unused12) {
            return null;
        }
    }

    public ArrayList<EPGSourcesModel> getEPGSources() {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String str = "SELECT  * FROM " + (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES) + " WHERE " + KEY_USER_ID + " ='" + userID + "' ORDER BY " + KEY_SOURCE_TYPE + " DESC , " + KEY_AUTO_ID + " DESC";
        try {
            ArrayList<EPGSourcesModel> arrayList = new ArrayList<>();
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    EPGSourcesModel ePGSourcesModel = new EPGSourcesModel();
                    ePGSourcesModel.setIdAuto(w.r0(cursorRawQuery.getString(0)));
                    ePGSourcesModel.setUser_id(cursorRawQuery.getString(1));
                    ePGSourcesModel.setName(cursorRawQuery.getString(2));
                    ePGSourcesModel.setSource_type(cursorRawQuery.getString(3));
                    ePGSourcesModel.setEpgurl(cursorRawQuery.getString(4));
                    ePGSourcesModel.setDefault_source(cursorRawQuery.getString(5));
                    arrayList.add(ePGSourcesModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<XMLTVProgrammePojo> getEPGTesting(String str, String str2) {
        String str3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            str3 = TABLE_EPG_M3U;
        } else {
            currentAPPType.equals("onestream_api");
            str3 = TABLE_EPG;
        }
        ArrayList<EPGSourcesModel> activeEPGSource = getActiveEPGSource();
        String strValueOf = (activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto());
        ArrayList<XMLTVProgrammePojo> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + str3 + " WHERE " + KEY_USER_ID + "='" + userID + "' AND " + KEY_SOURCE_REF_ID + "='" + strValueOf + "' AND '" + str2 + "' BETWEEN " + KEY_START + " AND " + KEY_STOP, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    XMLTVProgrammePojo xMLTVProgrammePojo = new XMLTVProgrammePojo();
                    xMLTVProgrammePojo.setTitle(cursorRawQuery.getString(1));
                    xMLTVProgrammePojo.setStart(cursorRawQuery.getString(2));
                    xMLTVProgrammePojo.setStop(cursorRawQuery.getString(3));
                    xMLTVProgrammePojo.setDesc(cursorRawQuery.getString(4));
                    xMLTVProgrammePojo.setChannel(cursorRawQuery.getString(5));
                    xMLTVProgrammePojo.setSourceRef(cursorRawQuery.getString(7));
                    arrayList.add(xMLTVProgrammePojo);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int getFavouriteCount(int i9) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u_all.id FROM iptv_live_streams_m3u_all WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u_all.url AND iptv_live_streams_m3u_all.user_id_referred=iptv_m3u_favourites.user_id_referred AND iptv_live_streams_m3u_all.move_to<>'live' AND iptv_live_streams_m3u_all.move_to<>'series' AND iptv_live_streams_m3u_all.move_to<>'movie' AND iptv_m3u_favourites.user_id_referred ='" + i9 + "')", null);
            cursorRawQuery.moveToFirst();
            int i10 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getFavouriteCountM3U(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u , iptv_m3u_favourites WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='" + str + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS_M3U + InstructionFileId.DOT + KEY_USER_ID + "=" + TABLE_IPTV_FAVOURITES_M3U + InstructionFileId.DOT + KEY_USER_ID + " AND " + TABLE_IPTV_FAVOURITES_M3U + InstructionFileId.DOT + KEY_USER_ID + " ='" + SharepreferenceDBHandler.getUserID(this.context) + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x00a7. Please report as an issue. */
    public ArrayList<FavouriteM3UModel> getFavouriteM3U(String str) {
        String str2;
        StringBuilder sb;
        String str3;
        ArrayList<FavouriteM3UModel> arrayList;
        int i9;
        String liveSubCatSort = str.equals(KEY_AVAIL_CHANNEL_LIVE) ? SharepreferenceDBHandler.getLiveSubCatSort(this.context) : str.equals("series") ? SharepreferenceDBHandler.getSeriesSubCatSort(this.context) : SharepreferenceDBHandler.getVODSubCatSort(this.context);
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<FavouriteM3UModel> arrayList2 = new ArrayList<>();
        liveSubCatSort.hashCode();
        ArrayList<FavouriteM3UModel> arrayList3 = arrayList2;
        byte b9 = -1;
        switch (liveSubCatSort.hashCode()) {
            case 48:
                str2 = "') ORDER BY ";
                if (liveSubCatSort.equals("0")) {
                    b9 = 0;
                }
                break;
            case 49:
            default:
                str2 = "') ORDER BY ";
                break;
            case 50:
                str2 = "') ORDER BY ";
                if (liveSubCatSort.equals("2")) {
                    b9 = 1;
                }
                break;
            case 51:
                str2 = "') ORDER BY ";
                if (liveSubCatSort.equals("3")) {
                    b9 = 2;
                }
                break;
            case 52:
                str2 = "') ORDER BY ";
                if (liveSubCatSort.equals("4")) {
                    b9 = 3;
                }
                break;
            case 53:
                str2 = "') ORDER BY ";
                if (liveSubCatSort.equals("5")) {
                    b9 = 4;
                }
                break;
        }
        switch (b9) {
            case 0:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" AND ");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("')");
                break;
            case 1:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" AND ");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append(str2);
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append("name");
                str3 = " ASC ";
                sb.append(str3);
                break;
            case 2:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" AND ");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append(str2);
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append("name");
                str3 = " DESC ";
                sb.append(str3);
                break;
            case 3:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" AND ");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' ORDER BY cast(");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_NUM_LIVE_STREAMS);
                str3 = " as REAL) ASC)";
                sb.append(str3);
                break;
            case 4:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" AND ");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' ORDER BY cast(");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_NUM_LIVE_STREAMS);
                str3 = " as REAL) DESC)";
                sb.append(str3);
                break;
            default:
                sb = new StringBuilder();
                sb.append("SELECT  * FROM iptv_m3u_favourites WHERE  (SELECT iptv_live_streams_m3u.id FROM iptv_live_streams_m3u WHERE iptv_m3u_favourites.url = iptv_live_streams_m3u.url AND iptv_live_streams_m3u.stream_type='");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append("=");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" AND ");
                sb.append(TABLE_IPTV_FAVOURITES_M3U);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("')");
                break;
        }
        String string = sb.toString();
        try {
            SQLiteDatabase readableDatabase = getReadableDatabase();
            try {
                this.db = readableDatabase;
                Cursor cursorRawQuery = readableDatabase.rawQuery(string, null);
                if (cursorRawQuery.moveToFirst()) {
                    while (true) {
                        FavouriteM3UModel favouriteM3UModel = new FavouriteM3UModel();
                        try {
                            i9 = Integer.parseInt(cursorRawQuery.getString(0));
                        } catch (NumberFormatException unused) {
                            i9 = 0;
                        }
                        favouriteM3UModel.setId(i9);
                        favouriteM3UModel.setUrl(cursorRawQuery.getString(1));
                        favouriteM3UModel.setUserID(Integer.parseInt(cursorRawQuery.getString(2)));
                        favouriteM3UModel.setName(cursorRawQuery.getString(3));
                        favouriteM3UModel.setCategoryID(cursorRawQuery.getString(4));
                        arrayList = arrayList3;
                        try {
                            arrayList.add(favouriteM3UModel);
                            if (cursorRawQuery.moveToNext()) {
                                arrayList3 = arrayList;
                            }
                        } catch (SQLiteDatabaseLockedException unused2) {
                            return arrayList;
                        } catch (Exception unused3) {
                            return arrayList;
                        }
                    }
                } else {
                    arrayList = arrayList3;
                }
                cursorRawQuery.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused4) {
                return arrayList3;
            } catch (Exception unused5) {
                return arrayList3;
            }
        } catch (SQLiteDatabaseLockedException unused6) {
        } catch (Exception unused7) {
        }
    }

    public int getImportTableCount(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_import_status WHERE user_id_referred = '" + SharepreferenceDBHandler.getUserID(this.context) + "' AND " + KEY_APP_TYPE + " = '" + str + "'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<LiveStreamsDBModel> getLiveFavStalker(String str) {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_stalker_live_streams WHERE iptv_stalker_live_streams.user_id_referred='" + userID + "' AND " + TABLE_IPTV_STALKER_ALL_CHANNNELS + InstructionFileId.DOT + KEY_STREAM_ID + " IN (" + str + ") AND " + TABLE_IPTV_STALKER_ALL_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1')", null);
            if (cursorRawQuery.moveToFirst()) {
                while (true) {
                    if (SharepreferenceDBHandler.getAsyncTaskStatus(this.context) == 1) {
                        SharepreferenceDBHandler.setAsyncTaskStatus(0, this.context);
                        break;
                    }
                    LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                    liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                    liveStreamsDBModel.setStreamId(cursorRawQuery.getString(1));
                    liveStreamsDBModel.setNum(cursorRawQuery.getString(2));
                    liveStreamsDBModel.setName(cursorRawQuery.getString(3));
                    liveStreamsDBModel.setCmd(cursorRawQuery.getString(4));
                    liveStreamsDBModel.setStreamIcon(cursorRawQuery.getString(5));
                    liveStreamsDBModel.setEpgChannelId(cursorRawQuery.getString(6));
                    liveStreamsDBModel.setCategoryId(cursorRawQuery.getString(7));
                    liveStreamsDBModel.setTvArchive(cursorRawQuery.getString(8));
                    arrayList.add(liveStreamsDBModel);
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                }
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public LiveStreamsDBModel getLiveStreamFavouriteRow(String str, String str2, String str3, String str4) {
        StringBuilder sb;
        String str5;
        String string;
        Cursor cursorRawQuery;
        LiveStreamsDBModel liveStreamsDBModel;
        StringBuilder sb2;
        String str6;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        new ArrayList();
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (str4.equalsIgnoreCase("radio_streams") || str4.equalsIgnoreCase(KEY_AVAIL_CHANNEL_LIVE)) {
            if (currentAPPType.equals("onestream_api")) {
                sb = new StringBuilder();
                str5 = "SELECT  * FROM onestream_iptv_live_streams WHERE stream_type LIKE '%";
            } else {
                sb = new StringBuilder();
                str5 = "SELECT  * FROM iptv_live_streams WHERE stream_type LIKE '%";
            }
            sb.append(str5);
            sb.append(str4);
            sb.append("%' AND ");
            sb.append("categoryID");
            sb.append("='");
            sb.append(str);
            sb.append("'  AND ");
            sb.append(KEY_USER_ID);
            sb.append(" = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(KEY_STREAM_ID);
            sb.append("='");
            sb.append(str2);
            sb.append("' LIMIT 1");
            string = sb.toString();
        } else {
            if (currentAPPType.equals("onestream_api")) {
                sb2 = new StringBuilder();
                str6 = "SELECT  * FROM onestream_iptv_live_streams WHERE categoryID='";
            } else {
                sb2 = new StringBuilder();
                str6 = "SELECT  * FROM iptv_live_streams WHERE categoryID='";
            }
            sb2.append(str6);
            sb2.append(str);
            sb2.append("'  AND ");
            sb2.append(KEY_USER_ID);
            sb2.append(" = '");
            sb2.append(userID);
            sb2.append("' AND ");
            sb2.append(KEY_STREAM_ID);
            sb2.append("='");
            sb2.append(str2);
            sb2.append("' LIMIT 1");
            string = sb2.toString();
        }
        try {
            cursorRawQuery = getReadableDatabase().rawQuery(string, null);
            liveStreamsDBModel = new LiveStreamsDBModel();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
        if (!cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            return null;
        }
        do {
            liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
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
            liveStreamsDBModel.setRatingFromTen(cursorRawQuery.getString(18));
            liveStreamsDBModel.setRatingFromFive(cursorRawQuery.getString(19));
            liveStreamsDBModel.setUrl(cursorRawQuery.getString(20));
            liveStreamsDBModel.setTimestamp(str3);
        } while (cursorRawQuery.moveToNext());
        cursorRawQuery.close();
        return liveStreamsDBModel;
    }

    public int getLiveStreamsCount(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM onestream_iptv_live_streams WHERE categoryID='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM iptv_live_streams WHERE categoryID='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getM3UCount(String str) {
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (str.equals("0")) {
            str2 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u_all WHERE user_id_referred='" + userID + "' AND " + KEY_MOVE_TO + " NOT IN ('live','movie','series') OR " + KEY_MOVE_TO + " IS NULL";
        } else {
            str2 = "SELECT  COUNT(*) FROM iptv_live_streams_m3u_all WHERE categoryID='" + str + "' AND " + KEY_USER_ID + "='" + userID + "' AND " + KEY_MOVE_TO + " NOT IN ('live','movie','series') OR " + KEY_MOVE_TO + " IS NULL";
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<LiveStreamsDBModel> getM3UFavouriteRow(String str, String str2, String str3) {
        Cursor cursorRawQuery;
        LiveStreamsDBModel liveStreamsDBModel;
        ArrayList<LiveStreamsDBModel> arrayList = new ArrayList<>();
        try {
            cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND url='" + str2 + "' AND " + KEY_USER_ID + "='" + SharepreferenceDBHandler.getUserID(this.context) + "'", null);
            liveStreamsDBModel = new LiveStreamsDBModel();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
        if (!cursorRawQuery.moveToFirst()) {
            cursorRawQuery.close();
            return null;
        }
        do {
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
            liveStreamsDBModel.setDirectSource(cursorRawQuery.getString(11));
            liveStreamsDBModel.setTvArchiveDuration(cursorRawQuery.getString(12));
            liveStreamsDBModel.setTypeName(cursorRawQuery.getString(13));
            liveStreamsDBModel.setCategoryName(cursorRawQuery.getString(14));
            liveStreamsDBModel.setSeriesNo(cursorRawQuery.getString(15));
            liveStreamsDBModel.setLive(cursorRawQuery.getString(16));
            liveStreamsDBModel.setContaiinerExtension(cursorRawQuery.getString(17));
            liveStreamsDBModel.setUrl(cursorRawQuery.getString(18));
            liveStreamsDBModel.setTimestamp(str3);
            arrayList.add(liveStreamsDBModel);
        } while (cursorRawQuery.moveToNext());
        cursorRawQuery.close();
        return arrayList;
    }

    public SeriesDBModel getM3UFavouriteRowSeries(String str, String str2, String str3) {
        String str4 = "SELECT  * FROM iptv_live_streams_m3u WHERE categoryID='" + str + "' AND url='" + str2 + "' AND " + KEY_USER_ID + "='" + SharepreferenceDBHandler.getUserID(this.context) + "'";
        SeriesDBModel seriesDBModel = new SeriesDBModel();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str4, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    seriesDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                    seriesDBModel.setNum(cursorRawQuery.getString(1));
                    seriesDBModel.setName(cursorRawQuery.getString(2));
                    seriesDBModel.setStreamType(cursorRawQuery.getString(3));
                    seriesDBModel.setseriesID(w.r0(cursorRawQuery.getString(4)));
                    seriesDBModel.setOneStreamseriesID(cursorRawQuery.getString(4));
                    seriesDBModel.setcover(cursorRawQuery.getString(5));
                    seriesDBModel.setplot("");
                    seriesDBModel.setcast("");
                    seriesDBModel.setdirector("");
                    seriesDBModel.setgenre("");
                    seriesDBModel.setreleaseDate("");
                    seriesDBModel.setlast_modified("");
                    seriesDBModel.setrating("");
                    seriesDBModel.setCategoryId(cursorRawQuery.getString(8));
                    seriesDBModel.setYouTubeTrailer("");
                    seriesDBModel.setBackdrop("");
                    seriesDBModel.setUrl(cursorRawQuery.getString(18));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return seriesDBModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int getMagportal(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_mag_portal_table WHERE mag_portal='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public String getMagportal() {
        String string;
        new ArrayList();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM iptv_mag_portal_table", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    string = cursorRawQuery.getString(1);
                } while (cursorRawQuery.moveToNext());
            } else {
                string = "";
            }
            cursorRawQuery.close();
            return string;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return "";
        }
    }

    public ArrayList<SeriesDBModel> getOneStreamAllSeriesStreamsWithCategoryId(String str) {
        StringBuilder sb;
        String str2;
        StringBuilder sb2;
        String str3;
        String string;
        String str4 = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String seriesSubCatSort = SharepreferenceDBHandler.getSeriesSubCatSort(this.context);
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (str4.equals("") || str4.equals("0")) {
            if (seriesSubCatSort.equals("0")) {
                sb = new StringBuilder();
                sb.append("SELECT  * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CATEGORY_ID_S);
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                str2 = " ='1')";
            } else if (seriesSubCatSort.equals("3")) {
                sb = new StringBuilder();
                sb.append("SELECT  * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CATEGORY_ID_S);
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                sb.append(" ='1') ORDER BY ");
                sb.append(KEY_NAME_S);
                str2 = " DESC";
            } else if (seriesSubCatSort.equals("2")) {
                sb = new StringBuilder();
                sb.append("SELECT  * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CATEGORY_ID_S);
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                sb.append(" ='1') ORDER BY ");
                sb.append(KEY_NAME_S);
                str2 = " ASC";
            } else if (seriesSubCatSort.equals("6")) {
                sb = new StringBuilder();
                sb.append("SELECT  * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CATEGORY_ID_S);
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                sb.append(" ='1') ORDER BY cast(");
                sb.append(KEY_RATING);
                str2 = " as REAL) DESC ";
            } else if (seriesSubCatSort.equals("1")) {
                sb = new StringBuilder();
                sb.append("SELECT  * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CATEGORY_ID_S);
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                sb.append(" ='1') ORDER BY ");
                sb.append(KEY_LAST_MODIFIED);
                str2 = " DESC ";
            } else {
                sb = new StringBuilder();
                sb.append("SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CATEGORY_ID_S);
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                sb.append(" ='1') ORDER BY ");
                sb.append(KEY_ID_SERIES_STREAMS);
                str2 = " DESC";
            }
            sb.append(str2);
            String string2 = sb.toString();
            ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(string2, null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = w.f44700m;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", "stopped");
                                break;
                            }
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                            seriesDBModel.setNum(cursorRawQuery.getString(1));
                            seriesDBModel.setName(cursorRawQuery.getString(2));
                            seriesDBModel.setStreamType(cursorRawQuery.getString(3));
                            seriesDBModel.setseriesID(w.r0(cursorRawQuery.getString(4)));
                            seriesDBModel.setOneStreamseriesID(cursorRawQuery.getString(4));
                            seriesDBModel.setcover(cursorRawQuery.getString(5));
                            seriesDBModel.setplot(cursorRawQuery.getString(6));
                            seriesDBModel.setcast(cursorRawQuery.getString(7));
                            seriesDBModel.setdirector(cursorRawQuery.getString(8));
                            seriesDBModel.setgenre(cursorRawQuery.getString(9));
                            seriesDBModel.setreleaseDate(cursorRawQuery.getString(10));
                            seriesDBModel.setlast_modified(cursorRawQuery.getString(11));
                            seriesDBModel.setrating(cursorRawQuery.getString(12));
                            seriesDBModel.setCategoryId(cursorRawQuery.getString(13));
                            seriesDBModel.setYouTubeTrailer(cursorRawQuery.getString(14));
                            seriesDBModel.setBackdrop(cursorRawQuery.getString(15));
                            arrayList.add(seriesDBModel);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                        }
                    }
                    cursorRawQuery.close();
                    Log.e("honey testing", "milli: " + (System.currentTimeMillis() - jCurrentTimeMillis));
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        if (str4.equals("-5")) {
            string = "SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '" + userID + "' AND " + TABLE_ONESTREAM_IPTV_SERIES_STREAMS + InstructionFileId.DOT + KEY_CATEGORY_ID_S + " NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1') ORDER BY " + KEY_LAST_MODIFIED + " DESC LIMIT " + new C2858a(this.context).y();
        } else {
            if (str4.equals("-6")) {
                str4 = "-5";
            }
            if (seriesSubCatSort.equals("0")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" ='");
                sb2.append(str4);
                sb2.append("' AND ");
                sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" NOT IN (SELECT ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb2.append(" FROM ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(" WHERE ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_USER_ID);
                sb2.append(" ='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS);
                str3 = " ='1')";
            } else if (seriesSubCatSort.equals("3")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" ='");
                sb2.append(str4);
                sb2.append("' AND ");
                sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" NOT IN (SELECT ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb2.append(" FROM ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(" WHERE ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_USER_ID);
                sb2.append(" ='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS);
                sb2.append(" ='1') ORDER BY ");
                sb2.append(KEY_NAME_S);
                str3 = " DESC";
            } else if (seriesSubCatSort.equals("2")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" ='");
                sb2.append(str4);
                sb2.append("' AND ");
                sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" NOT IN (SELECT ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb2.append(" FROM ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(" WHERE ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_USER_ID);
                sb2.append(" ='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS);
                sb2.append(" ='1') ORDER BY ");
                sb2.append(KEY_NAME_S);
                str3 = " ASC";
            } else if (seriesSubCatSort.equals("6")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" ='");
                sb2.append(str4);
                sb2.append("' AND ");
                sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" NOT IN (SELECT ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb2.append(" FROM ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(" WHERE ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_USER_ID);
                sb2.append(" ='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS);
                sb2.append(" ='1') ORDER BY cast(");
                sb2.append(KEY_RATING);
                str3 = " as REAL) DESC ";
            } else if (seriesSubCatSort.equals("1")) {
                sb2 = new StringBuilder();
                sb2.append("SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" ='");
                sb2.append(str4);
                sb2.append("' AND ");
                sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" NOT IN (SELECT ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb2.append(" FROM ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(" WHERE ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_USER_ID);
                sb2.append(" ='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS);
                sb2.append(" ='1') ORDER BY ");
                sb2.append(KEY_LAST_MODIFIED);
                str3 = " DESC ";
            } else {
                sb2 = new StringBuilder();
                sb2.append("SELECT * FROM onestream_series_streams_v2 WHERE onestream_series_streams_v2.user_id_referred = '");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" ='");
                sb2.append(str4);
                sb2.append("' AND ");
                sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_CATEGORY_ID_S);
                sb2.append(" NOT IN (SELECT ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb2.append(" FROM ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(" WHERE ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_USER_ID);
                sb2.append(" ='");
                sb2.append(userID);
                sb2.append("' AND ");
                sb2.append(TABLE_IPTV_PASSWORD_STATUS);
                sb2.append(InstructionFileId.DOT);
                sb2.append(KEY_PASSWORD_STATUS);
                sb2.append(" ='1') ORDER BY ");
                sb2.append(KEY_ID_SERIES_STREAMS);
                str3 = " DESC";
            }
            sb2.append(str3);
            string = sb2.toString();
        }
        ArrayList<SeriesDBModel> arrayList2 = new ArrayList<>();
        try {
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string, null);
                if (cursorRawQuery2.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask2 = w.f44700m;
                        if (asyncTask2 != null && asyncTask2.isCancelled()) {
                            Log.e("honey", "stopped");
                            break;
                        }
                        SeriesDBModel seriesDBModel2 = new SeriesDBModel();
                        seriesDBModel2.setIdAuto(Integer.parseInt(cursorRawQuery2.getString(0)));
                        seriesDBModel2.setNum(cursorRawQuery2.getString(1));
                        seriesDBModel2.setName(cursorRawQuery2.getString(2));
                        seriesDBModel2.setStreamType(cursorRawQuery2.getString(3));
                        seriesDBModel2.setseriesID(w.r0(cursorRawQuery2.getString(4)));
                        seriesDBModel2.setOneStreamseriesID(cursorRawQuery2.getString(4));
                        seriesDBModel2.setcover(cursorRawQuery2.getString(5));
                        seriesDBModel2.setplot(cursorRawQuery2.getString(6));
                        seriesDBModel2.setcast(cursorRawQuery2.getString(7));
                        seriesDBModel2.setdirector(cursorRawQuery2.getString(8));
                        seriesDBModel2.setgenre(cursorRawQuery2.getString(9));
                        seriesDBModel2.setreleaseDate(cursorRawQuery2.getString(10));
                        seriesDBModel2.setlast_modified(cursorRawQuery2.getString(11));
                        seriesDBModel2.setrating(cursorRawQuery2.getString(12));
                        seriesDBModel2.setCategoryId(cursorRawQuery2.getString(13));
                        seriesDBModel2.setYouTubeTrailer(cursorRawQuery2.getString(14));
                        seriesDBModel2.setBackdrop(cursorRawQuery2.getString(15));
                        arrayList2.add(seriesDBModel2);
                        if (!cursorRawQuery2.moveToNext()) {
                            break;
                        }
                    }
                }
                cursorRawQuery2.close();
                return arrayList2;
            } catch (SQLiteDatabaseLockedException unused5) {
                return null;
            } catch (Exception unused6) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused7) {
            return null;
        } catch (Exception unused8) {
            return null;
        }
    }

    public int getPanelEPGSource() {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES) + " WHERE " + KEY_USER_ID + "='" + userID + "' AND " + KEY_SOURCE_TYPE + " = 'panel'", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getParentalStatusCount(int i9) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  * FROM " + (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_IPTV_PASSWORD_STATUS_M3U : TABLE_IPTV_PASSWORD_STATUS) + " WHERE " + KEY_USER_ID + "=" + i9 + "", null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public PasswordStatusDBModel getPasswordStatus(String str, String str2, int i9) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM " + (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_IPTV_PASSWORD_STATUS_M3U : TABLE_IPTV_PASSWORD_STATUS) + " WHERE " + KEY_USER_DETAIL + " = '" + str + "' AND " + KEY_PASSWORD_STATUS_CAT_ID + " = '" + str2 + "' AND " + KEY_USER_ID + " = " + i9 + "", null);
            PasswordStatusDBModel passwordStatusDBModel = new PasswordStatusDBModel();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    passwordStatusDBModel.setIdPaswordStaus(Integer.parseInt(cursorRawQuery.getString(0)));
                    passwordStatusDBModel.setPasswordStatusCategoryId(cursorRawQuery.getString(1));
                    passwordStatusDBModel.setPasswordStatusUserDetail(cursorRawQuery.getString(2));
                    passwordStatusDBModel.setPasswordStatus(cursorRawQuery.getString(3));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return passwordStatusDBModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public int getRecentwatchCount(int i9, String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_recent_watched_m3u WHERE user_id_referred=" + i9 + " AND " + KEY_STRESM_TYPE + "='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i10 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ArrayList<LiveStreamsDBModel> getSearchRecords(String str) {
        ArrayList<LiveStreamsDBModel> arrayList;
        ArrayList<LiveStreamsDBModel> arrayList2;
        ArrayList<LiveStreamsDBModel> arrayList3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        ArrayList<LiveStreamsDBModel> arrayList4 = new ArrayList<>();
        String str2 = "stopped live movies";
        if (currentAPPType.equals("m3u")) {
            StringBuilder sb = new StringBuilder();
            String str3 = "honey";
            sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE name LIKE '%");
            sb.append(str);
            sb.append("%'  AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append("='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_STRESM_TYPE);
            sb.append(" IN ('movie','live') AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb.append(" FROM ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(" WHERE ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" ='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS);
            sb.append(" ='1')");
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = w.f44703p;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e(str3, str2);
                                break;
                            }
                            String str4 = str2;
                            String str5 = str3;
                            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
                            liveStreamsDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
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
                            liveStreamsDBModel.setUrl(cursorRawQuery.getString(18));
                            arrayList3 = arrayList4;
                            arrayList3.add(liveStreamsDBModel);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            arrayList4 = arrayList3;
                            str2 = str4;
                            str3 = str5;
                        }
                        arrayList3 = arrayList4;
                    } else {
                        arrayList3 = arrayList4;
                    }
                    cursorRawQuery.close();
                    return arrayList3;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        ArrayList<LiveStreamsDBModel> arrayList5 = arrayList4;
        String str6 = "honey";
        if (currentAPPType.equals("onestream_api")) {
            try {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery("SELECT  * FROM onestream_iptv_live_streams WHERE name LIKE '%" + str + "%'  AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1')", null);
                    if (cursorRawQuery2.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask2 = w.f44703p;
                            if (asyncTask2 != null && asyncTask2.isCancelled()) {
                                Log.e(str6, str2);
                                break;
                            }
                            String str7 = str2;
                            String str8 = str6;
                            LiveStreamsDBModel liveStreamsDBModel2 = new LiveStreamsDBModel();
                            liveStreamsDBModel2.setIdAuto(Integer.parseInt(cursorRawQuery2.getString(0)));
                            liveStreamsDBModel2.setNum(cursorRawQuery2.getString(1));
                            liveStreamsDBModel2.setName(cursorRawQuery2.getString(2));
                            liveStreamsDBModel2.setStreamType(cursorRawQuery2.getString(3));
                            liveStreamsDBModel2.setStreamId(cursorRawQuery2.getString(4));
                            liveStreamsDBModel2.setStreamIdOneStream(cursorRawQuery2.getString(4));
                            liveStreamsDBModel2.setStreamIcon(cursorRawQuery2.getString(5));
                            liveStreamsDBModel2.setEpgChannelId(cursorRawQuery2.getString(6));
                            liveStreamsDBModel2.setAdded(cursorRawQuery2.getString(7));
                            liveStreamsDBModel2.setCategoryId(cursorRawQuery2.getString(8));
                            liveStreamsDBModel2.setCustomSid(cursorRawQuery2.getString(9));
                            liveStreamsDBModel2.setTvArchive(cursorRawQuery2.getString(10));
                            liveStreamsDBModel2.setDirectSource(cursorRawQuery2.getString(11));
                            liveStreamsDBModel2.setTvArchiveDuration(cursorRawQuery2.getString(12));
                            liveStreamsDBModel2.setTypeName(cursorRawQuery2.getString(13));
                            liveStreamsDBModel2.setCategoryName(cursorRawQuery2.getString(14));
                            liveStreamsDBModel2.setSeriesNo(cursorRawQuery2.getString(15));
                            liveStreamsDBModel2.setLive(cursorRawQuery2.getString(16));
                            liveStreamsDBModel2.setContaiinerExtension(cursorRawQuery2.getString(17));
                            liveStreamsDBModel2.setRatingFromTen(cursorRawQuery2.getString(18));
                            liveStreamsDBModel2.setRatingFromFive(cursorRawQuery2.getString(19));
                            liveStreamsDBModel2.setUrl(cursorRawQuery2.getString(20));
                            arrayList2 = arrayList5;
                            arrayList2.add(liveStreamsDBModel2);
                            if (!cursorRawQuery2.moveToNext()) {
                                break;
                            }
                            str6 = str8;
                            arrayList5 = arrayList2;
                            str2 = str7;
                        }
                    } else {
                        arrayList2 = arrayList5;
                    }
                    cursorRawQuery2.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused5) {
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                return null;
            } catch (Exception unused8) {
                return null;
            }
        }
        String str9 = str6;
        ArrayList<LiveStreamsDBModel> arrayList6 = arrayList5;
        try {
            try {
                Cursor cursorRawQuery3 = getReadableDatabase().rawQuery("SELECT  * FROM iptv_live_streams WHERE name LIKE '%" + str + "%'  AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + KEY_USER_ID + " = '" + userID + "' AND " + TABLE_IPTV_AVAILABLE_CHANNNELS + InstructionFileId.DOT + "categoryID NOT IN (SELECT " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS_CAT_ID + " FROM " + TABLE_IPTV_PASSWORD_STATUS + " WHERE " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_USER_ID + " ='" + userID + "' AND " + TABLE_IPTV_PASSWORD_STATUS + InstructionFileId.DOT + KEY_PASSWORD_STATUS + " ='1')", null);
                if (cursorRawQuery3.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask3 = w.f44703p;
                        if (asyncTask3 != null && asyncTask3.isCancelled()) {
                            Log.e(str9, str2);
                            break;
                        }
                        String str10 = str2;
                        String str11 = str9;
                        LiveStreamsDBModel liveStreamsDBModel3 = new LiveStreamsDBModel();
                        liveStreamsDBModel3.setIdAuto(Integer.parseInt(cursorRawQuery3.getString(0)));
                        liveStreamsDBModel3.setNum(cursorRawQuery3.getString(1));
                        liveStreamsDBModel3.setName(cursorRawQuery3.getString(2));
                        liveStreamsDBModel3.setStreamType(cursorRawQuery3.getString(3));
                        liveStreamsDBModel3.setStreamId(cursorRawQuery3.getString(4));
                        liveStreamsDBModel3.setStreamIdOneStream(cursorRawQuery3.getString(4));
                        liveStreamsDBModel3.setStreamIcon(cursorRawQuery3.getString(5));
                        liveStreamsDBModel3.setEpgChannelId(cursorRawQuery3.getString(6));
                        liveStreamsDBModel3.setAdded(cursorRawQuery3.getString(7));
                        liveStreamsDBModel3.setCategoryId(cursorRawQuery3.getString(8));
                        liveStreamsDBModel3.setCustomSid(cursorRawQuery3.getString(9));
                        liveStreamsDBModel3.setTvArchive(cursorRawQuery3.getString(10));
                        liveStreamsDBModel3.setDirectSource(cursorRawQuery3.getString(11));
                        liveStreamsDBModel3.setTvArchiveDuration(cursorRawQuery3.getString(12));
                        liveStreamsDBModel3.setTypeName(cursorRawQuery3.getString(13));
                        liveStreamsDBModel3.setCategoryName(cursorRawQuery3.getString(14));
                        liveStreamsDBModel3.setSeriesNo(cursorRawQuery3.getString(15));
                        liveStreamsDBModel3.setLive(cursorRawQuery3.getString(16));
                        liveStreamsDBModel3.setContaiinerExtension(cursorRawQuery3.getString(17));
                        liveStreamsDBModel3.setRatingFromTen(cursorRawQuery3.getString(18));
                        liveStreamsDBModel3.setRatingFromFive(cursorRawQuery3.getString(19));
                        liveStreamsDBModel3.setUrl(cursorRawQuery3.getString(20));
                        arrayList = arrayList6;
                        arrayList.add(liveStreamsDBModel3);
                        if (!cursorRawQuery3.moveToNext()) {
                            break;
                        }
                        str2 = str10;
                        str9 = str11;
                        arrayList6 = arrayList;
                    }
                    arrayList = arrayList6;
                } else {
                    arrayList = arrayList6;
                }
                cursorRawQuery3.close();
                return arrayList;
            } catch (SQLiteDatabaseLockedException unused9) {
                return null;
            } catch (Exception unused10) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused11) {
            return null;
        } catch (Exception unused12) {
            return null;
        }
    }

    public ArrayList<SeriesDBModel> getSearchRecordsSeries(String str) {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        String str2 = "";
        if (currentAPPType.equals("m3u")) {
            StringBuilder sb = new StringBuilder();
            String str3 = "stopped series";
            sb.append("SELECT  * FROM iptv_live_streams_m3u WHERE name LIKE '%");
            sb.append(str);
            sb.append("%'  AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append("='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_STRESM_TYPE);
            sb.append("='series' AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb.append(" FROM ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(" WHERE ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" ='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS);
            sb.append(" ='1')");
            String string = sb.toString();
            ArrayList<SeriesDBModel> arrayList = new ArrayList<>();
            try {
                try {
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
                    if (cursorRawQuery.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask = w.f44703p;
                            if (asyncTask != null && asyncTask.isCancelled()) {
                                Log.e("honey", str3);
                                break;
                            }
                            String str4 = str3;
                            SeriesDBModel seriesDBModel = new SeriesDBModel();
                            seriesDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                            seriesDBModel.setNum(cursorRawQuery.getString(1));
                            seriesDBModel.setName(cursorRawQuery.getString(2));
                            seriesDBModel.setStreamType(cursorRawQuery.getString(3));
                            seriesDBModel.setseriesID(w.r0(cursorRawQuery.getString(4)));
                            seriesDBModel.setOneStreamseriesID(cursorRawQuery.getString(4));
                            seriesDBModel.setcover(cursorRawQuery.getString(5));
                            String str5 = str2;
                            seriesDBModel.setplot(str5);
                            seriesDBModel.setcast(str5);
                            seriesDBModel.setdirector(str5);
                            seriesDBModel.setgenre(str5);
                            seriesDBModel.setreleaseDate(str5);
                            seriesDBModel.setlast_modified(str5);
                            seriesDBModel.setrating(str5);
                            seriesDBModel.setCategoryId(cursorRawQuery.getString(8));
                            seriesDBModel.setYouTubeTrailer(str5);
                            seriesDBModel.setBackdrop(str5);
                            seriesDBModel.setUrl(cursorRawQuery.getString(18));
                            arrayList.add(seriesDBModel);
                            if (!cursorRawQuery.moveToNext()) {
                                break;
                            }
                            str2 = str5;
                            str3 = str4;
                        }
                    }
                    cursorRawQuery.close();
                    return arrayList;
                } catch (SQLiteDatabaseLockedException unused) {
                    return null;
                } catch (Exception unused2) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused3) {
                return null;
            } catch (Exception unused4) {
                return null;
            }
        }
        String str6 = "stopped series";
        if (currentAPPType.equals("onestream_api")) {
            StringBuilder sb2 = new StringBuilder();
            String str7 = "honey";
            sb2.append("SELECT  * FROM onestream_series_streams_v2 WHERE name_series_stream_v2 LIKE '%");
            sb2.append(str);
            sb2.append("%'  AND ");
            sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
            sb2.append(InstructionFileId.DOT);
            sb2.append(KEY_USER_ID);
            sb2.append(" = '");
            sb2.append(userID);
            sb2.append("' AND ");
            sb2.append(TABLE_ONESTREAM_IPTV_SERIES_STREAMS);
            sb2.append(InstructionFileId.DOT);
            sb2.append(KEY_CATEGORY_ID_S);
            sb2.append(" NOT IN (SELECT ");
            sb2.append(TABLE_IPTV_PASSWORD_STATUS);
            sb2.append(InstructionFileId.DOT);
            sb2.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb2.append(" FROM ");
            sb2.append(TABLE_IPTV_PASSWORD_STATUS);
            sb2.append(" WHERE ");
            sb2.append(TABLE_IPTV_PASSWORD_STATUS);
            sb2.append(InstructionFileId.DOT);
            sb2.append(KEY_USER_ID);
            sb2.append(" ='");
            sb2.append(userID);
            sb2.append("' AND ");
            sb2.append(TABLE_IPTV_PASSWORD_STATUS);
            sb2.append(InstructionFileId.DOT);
            sb2.append(KEY_PASSWORD_STATUS);
            sb2.append(" ='1')");
            String string2 = sb2.toString();
            ArrayList<SeriesDBModel> arrayList2 = new ArrayList<>();
            try {
                try {
                    Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string2, null);
                    if (cursorRawQuery2.moveToFirst()) {
                        while (true) {
                            AsyncTask asyncTask2 = w.f44703p;
                            if (asyncTask2 != null && asyncTask2.isCancelled()) {
                                Log.e(str7, str6);
                                break;
                            }
                            String str8 = str7;
                            String str9 = str6;
                            SeriesDBModel seriesDBModel2 = new SeriesDBModel();
                            seriesDBModel2.setIdAuto(Integer.parseInt(cursorRawQuery2.getString(0)));
                            seriesDBModel2.setNum(cursorRawQuery2.getString(1));
                            seriesDBModel2.setName(cursorRawQuery2.getString(2));
                            seriesDBModel2.setStreamType(cursorRawQuery2.getString(3));
                            seriesDBModel2.setseriesID(w.r0(cursorRawQuery2.getString(4)));
                            seriesDBModel2.setOneStreamseriesID(cursorRawQuery2.getString(4));
                            seriesDBModel2.setcover(cursorRawQuery2.getString(5));
                            seriesDBModel2.setplot(cursorRawQuery2.getString(6));
                            seriesDBModel2.setcast(cursorRawQuery2.getString(7));
                            seriesDBModel2.setdirector(cursorRawQuery2.getString(8));
                            seriesDBModel2.setgenre(cursorRawQuery2.getString(9));
                            seriesDBModel2.setreleaseDate(cursorRawQuery2.getString(10));
                            seriesDBModel2.setlast_modified(cursorRawQuery2.getString(11));
                            seriesDBModel2.setrating(cursorRawQuery2.getString(12));
                            seriesDBModel2.setCategoryId(cursorRawQuery2.getString(13));
                            seriesDBModel2.setYouTubeTrailer(cursorRawQuery2.getString(14));
                            seriesDBModel2.setBackdrop(cursorRawQuery2.getString(15));
                            arrayList2.add(seriesDBModel2);
                            if (!cursorRawQuery2.moveToNext()) {
                                break;
                            }
                            str6 = str9;
                            str7 = str8;
                        }
                    }
                    cursorRawQuery2.close();
                    return arrayList2;
                } catch (SQLiteDatabaseLockedException unused5) {
                    return null;
                } catch (Exception unused6) {
                    return null;
                }
            } catch (SQLiteDatabaseLockedException unused7) {
                return null;
            } catch (Exception unused8) {
                return null;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        String str10 = "honey";
        sb3.append("SELECT  * FROM series_streams_v2 WHERE name_series_stream_v2 LIKE '%");
        sb3.append(str);
        sb3.append("%'  AND ");
        sb3.append(TABLE_IPTV_SERIES_STREAMS);
        sb3.append(InstructionFileId.DOT);
        sb3.append(KEY_USER_ID);
        sb3.append(" = '");
        sb3.append(userID);
        sb3.append("' AND ");
        sb3.append(TABLE_IPTV_SERIES_STREAMS);
        sb3.append(InstructionFileId.DOT);
        sb3.append(KEY_CATEGORY_ID_S);
        sb3.append(" NOT IN (SELECT ");
        sb3.append(TABLE_IPTV_PASSWORD_STATUS);
        sb3.append(InstructionFileId.DOT);
        sb3.append(KEY_PASSWORD_STATUS_CAT_ID);
        sb3.append(" FROM ");
        sb3.append(TABLE_IPTV_PASSWORD_STATUS);
        sb3.append(" WHERE ");
        sb3.append(TABLE_IPTV_PASSWORD_STATUS);
        sb3.append(InstructionFileId.DOT);
        sb3.append(KEY_USER_ID);
        sb3.append(" ='");
        sb3.append(userID);
        sb3.append("' AND ");
        sb3.append(TABLE_IPTV_PASSWORD_STATUS);
        sb3.append(InstructionFileId.DOT);
        sb3.append(KEY_PASSWORD_STATUS);
        sb3.append(" ='1')");
        String string3 = sb3.toString();
        ArrayList<SeriesDBModel> arrayList3 = new ArrayList<>();
        try {
            try {
                Cursor cursorRawQuery3 = getReadableDatabase().rawQuery(string3, null);
                if (cursorRawQuery3.moveToFirst()) {
                    while (true) {
                        AsyncTask asyncTask3 = w.f44703p;
                        if (asyncTask3 != null && asyncTask3.isCancelled()) {
                            Log.e(str10, str6);
                            break;
                        }
                        String str11 = str10;
                        String str12 = str6;
                        SeriesDBModel seriesDBModel3 = new SeriesDBModel();
                        seriesDBModel3.setIdAuto(Integer.parseInt(cursorRawQuery3.getString(0)));
                        seriesDBModel3.setNum(cursorRawQuery3.getString(1));
                        seriesDBModel3.setName(cursorRawQuery3.getString(2));
                        seriesDBModel3.setStreamType(cursorRawQuery3.getString(3));
                        seriesDBModel3.setseriesID(w.r0(cursorRawQuery3.getString(4)));
                        seriesDBModel3.setOneStreamseriesID(cursorRawQuery3.getString(4));
                        seriesDBModel3.setcover(cursorRawQuery3.getString(5));
                        seriesDBModel3.setplot(cursorRawQuery3.getString(6));
                        seriesDBModel3.setcast(cursorRawQuery3.getString(7));
                        seriesDBModel3.setdirector(cursorRawQuery3.getString(8));
                        seriesDBModel3.setgenre(cursorRawQuery3.getString(9));
                        seriesDBModel3.setreleaseDate(cursorRawQuery3.getString(10));
                        seriesDBModel3.setlast_modified(cursorRawQuery3.getString(11));
                        seriesDBModel3.setrating(cursorRawQuery3.getString(12));
                        seriesDBModel3.setCategoryId(cursorRawQuery3.getString(13));
                        seriesDBModel3.setYouTubeTrailer(cursorRawQuery3.getString(14));
                        seriesDBModel3.setBackdrop(cursorRawQuery3.getString(15));
                        arrayList3.add(seriesDBModel3);
                        if (!cursorRawQuery3.moveToNext()) {
                            break;
                        }
                        str6 = str12;
                        str10 = str11;
                    }
                }
                cursorRawQuery3.close();
                return arrayList3;
            } catch (SQLiteDatabaseLockedException unused9) {
                return null;
            } catch (Exception unused10) {
                return null;
            }
        } catch (SQLiteDatabaseLockedException unused11) {
            return null;
        } catch (Exception unused12) {
            return null;
        }
    }

    public int getSeriesCount(String str) {
        StringBuilder sb;
        String str2;
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM onestream_series_streams_v2 WHERE category_id_series_stream_v2='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  COUNT(*) FROM series_streams_v2 WHERE category_id_series_stream_v2='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public SeriesDBModel getSeriesStreamsWithSeriesId(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM onestream_series_streams_v2 WHERE stream_id_series_stream_v2 ='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT  * FROM series_streams_v2 WHERE stream_id_series_stream_v2 ='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append(" = '");
        sb.append(userID);
        sb.append("'");
        String string = sb.toString();
        new ArrayList();
        SeriesDBModel seriesDBModel = new SeriesDBModel();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    seriesDBModel.setIdAuto(Integer.parseInt(cursorRawQuery.getString(0)));
                    seriesDBModel.setNum(cursorRawQuery.getString(1));
                    seriesDBModel.setName(cursorRawQuery.getString(2));
                    seriesDBModel.setStreamType(cursorRawQuery.getString(3));
                    seriesDBModel.setseriesID(w.r0(cursorRawQuery.getString(4)));
                    seriesDBModel.setOneStreamseriesID(cursorRawQuery.getString(4));
                    seriesDBModel.setcover(cursorRawQuery.getString(5));
                    seriesDBModel.setplot(cursorRawQuery.getString(6));
                    seriesDBModel.setcast(cursorRawQuery.getString(7));
                    seriesDBModel.setdirector(cursorRawQuery.getString(8));
                    seriesDBModel.setgenre(cursorRawQuery.getString(9));
                    seriesDBModel.setreleaseDate(cursorRawQuery.getString(10));
                    seriesDBModel.setlast_modified(cursorRawQuery.getString(11));
                    seriesDBModel.setrating(cursorRawQuery.getString(12));
                    seriesDBModel.setCategoryId(cursorRawQuery.getString(13));
                    seriesDBModel.setYouTubeTrailer(cursorRawQuery.getString(14));
                    seriesDBModel.setBackdrop(cursorRawQuery.getString(15));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return seriesDBModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public LiveStreamsDBModel getStreamStatus(String str, int i9) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_recent_watched_m3u WHERE url = '" + str + "' AND " + KEY_USER_ID + " = '" + i9 + "'", null);
            LiveStreamsDBModel liveStreamsDBModel = new LiveStreamsDBModel();
            if (cursorRawQuery.moveToFirst()) {
                do {
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
                    liveStreamsDBModel.setUrl(cursorRawQuery.getString(18));
                    liveStreamsDBModel.setUserIdReffered(cursorRawQuery.getInt(19));
                    liveStreamsDBModel.setMovieElapsedTime(cursorRawQuery.getLong(20));
                    liveStreamsDBModel.setMovieDuraton(cursorRawQuery.getLong(21));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return liveStreamsDBModel;
        } catch (SQLiteDatabaseLockedException | Exception unused2) {
            return null;
        }
    }

    public int getStreamsCount(String str) {
        StringBuilder sb;
        String str2;
        String string;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        try {
            if (currentAPPType.equals("m3u")) {
                sb = new StringBuilder();
                sb.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE stream_type='");
                sb.append(str);
                sb.append("' AND ");
            } else {
                if (currentAPPType.equals("stalker_api")) {
                    string = "SELECT  COUNT(*) FROM iptv_stalker_live_streams WHERE user_id_referred='" + userID + "'";
                    Cursor cursorRawQuery = getReadableDatabase().rawQuery(string, null);
                    cursorRawQuery.moveToFirst();
                    int i9 = cursorRawQuery.getInt(0);
                    cursorRawQuery.close();
                    return i9;
                }
                if (currentAPPType.equals("onestream_api")) {
                    sb = new StringBuilder();
                    str2 = "SELECT  COUNT(*) FROM onestream_iptv_live_streams WHERE stream_type LIKE '%";
                } else {
                    sb = new StringBuilder();
                    str2 = "SELECT  COUNT(*) FROM iptv_live_streams WHERE stream_type LIKE '%";
                }
                sb.append(str2);
                sb.append(str);
                sb.append("%' AND ");
            }
            Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(string, null);
            cursorRawQuery2.moveToFirst();
            int i92 = cursorRawQuery2.getInt(0);
            cursorRawQuery2.close();
            return i92;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        string = sb.toString();
    }

    public int getSubCatMovieCount(String str, String str2) {
        StringBuilder sb;
        StringBuilder sb2;
        StringBuilder sb3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (str2.equals(KEY_AVAIL_CHANNEL_LIVE)) {
            if (currentAPPType.equals("onestream_api")) {
                sb3 = new StringBuilder();
                sb3.append("SELECT  COUNT(*) FROM onestream_iptv_live_streams WHERE ( stream_type LIKE '%");
            } else {
                sb3 = new StringBuilder();
                sb3.append("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%");
            }
            sb3.append(str2);
            sb3.append("%' OR ");
            sb3.append(KEY_STRESM_TYPE);
            sb3.append(" LIKE '%radio%' )  AND ");
            sb3.append("categoryID");
            sb3.append("='");
            sb3.append(str);
            sb3.append("' AND ");
            sb3.append(KEY_USER_ID);
            sb3.append("='");
            sb3.append(userID);
            sb3.append("'");
            try {
                Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb3.toString(), null);
                cursorRawQuery.moveToFirst();
                int i9 = cursorRawQuery.getInt(0);
                cursorRawQuery.close();
                return i9;
            } catch (SQLiteDatabaseLockedException unused) {
                return 0;
            } catch (Exception unused2) {
                return 0;
            }
        }
        boolean zEquals = str2.equals("movie");
        boolean zEquals2 = currentAPPType.equals("onestream_api");
        if (zEquals) {
            if (zEquals2) {
                sb2 = new StringBuilder();
                sb2.append("SELECT  COUNT(*) FROM onestream_iptv_live_streams WHERE ( stream_type LIKE '%");
            } else {
                sb2 = new StringBuilder();
                sb2.append("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%");
            }
            sb2.append(str2);
            sb2.append("%' OR ");
            sb2.append(KEY_STRESM_TYPE);
            sb2.append(" LIKE '%radio%' )  AND ");
            sb2.append("categoryID");
            sb2.append("='");
            sb2.append(str);
            sb2.append("' AND ");
            sb2.append(KEY_USER_ID);
            sb2.append("='");
            sb2.append(userID);
            sb2.append("'");
            try {
                Cursor cursorRawQuery2 = getReadableDatabase().rawQuery(sb2.toString(), null);
                cursorRawQuery2.moveToFirst();
                int i10 = cursorRawQuery2.getInt(0);
                cursorRawQuery2.close();
                return i10;
            } catch (SQLiteDatabaseLockedException unused3) {
                return 0;
            } catch (Exception unused4) {
                return 0;
            }
        }
        if (zEquals2) {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM onestream_iptv_live_streams WHERE ( stream_type LIKE '%");
        } else {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%");
        }
        sb.append(str2);
        sb.append("%' OR ");
        sb.append(KEY_STRESM_TYPE);
        sb.append(" LIKE '%radio%' )  AND ");
        sb.append("categoryID");
        sb.append("='");
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append("='");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery3 = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery3.moveToFirst();
            int i11 = cursorRawQuery3.getInt(0);
            cursorRawQuery3.close();
            return i11;
        } catch (SQLiteDatabaseLockedException unused5) {
            return 0;
        } catch (Exception unused6) {
            return 0;
        }
    }

    public int getTotalNumberOFChannelsWithEPG(String str) {
        StringBuilder sb;
        String str2;
        String str3;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            sb = new StringBuilder();
            sb.append("SELECT iptv_live_streams_m3u.url  FROM epg_m3u , iptv_live_streams_m3u WHERE iptv_live_streams_m3u.user_id_referred = '");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_EPG_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_SOURCE_REF_ID);
            sb.append(" = '");
            sb.append(str);
            sb.append("' AND ");
            sb.append(TABLE_EPG_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_CHANNEL_ID);
            sb.append(" = ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_EPG_CHANNEL_ID);
            sb.append(" AND ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append("categoryID");
            sb.append(" NOT IN (SELECT ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS_CAT_ID);
            sb.append(" FROM ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(" WHERE ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_USER_ID);
            sb.append(" ='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(TABLE_IPTV_PASSWORD_STATUS_M3U);
            sb.append(InstructionFileId.DOT);
            sb.append(KEY_PASSWORD_STATUS);
            sb.append(" ='1') GROUP BY ");
            sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS_M3U);
            sb.append(InstructionFileId.DOT);
            str3 = "url";
        } else {
            if (currentAPPType.equals("onestream_api")) {
                sb = new StringBuilder();
                sb.append("SELECT onestream_iptv_live_streams.stream_id  FROM epg , onestream_iptv_live_streams WHERE onestream_iptv_live_streams.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_EPG);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_SOURCE_REF_ID);
                sb.append(" = '");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_EPG);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CHANNEL_ID);
                sb.append(" = ");
                str2 = TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS;
                sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_EPG_CHANNEL_ID);
                sb.append(" AND ");
                sb.append(TABLE_ONESTREAM_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append("categoryID");
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                sb.append(" ='1') GROUP BY ");
            } else {
                sb = new StringBuilder();
                sb.append("SELECT iptv_live_streams.stream_id  FROM epg , iptv_live_streams WHERE iptv_live_streams.user_id_referred = '");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_EPG);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_SOURCE_REF_ID);
                sb.append(" = '");
                sb.append(str);
                sb.append("' AND ");
                sb.append(TABLE_EPG);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_CHANNEL_ID);
                sb.append(" = ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_EPG_CHANNEL_ID);
                sb.append(" AND ");
                sb.append(TABLE_IPTV_AVAILABLE_CHANNNELS);
                sb.append(InstructionFileId.DOT);
                sb.append("categoryID");
                sb.append(" NOT IN (SELECT ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS_CAT_ID);
                sb.append(" FROM ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(" WHERE ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_USER_ID);
                sb.append(" ='");
                sb.append(userID);
                sb.append("' AND ");
                sb.append(TABLE_IPTV_PASSWORD_STATUS);
                sb.append(InstructionFileId.DOT);
                sb.append(KEY_PASSWORD_STATUS);
                sb.append(" ='1') GROUP BY ");
                str2 = TABLE_IPTV_AVAILABLE_CHANNNELS;
            }
            sb.append(str2);
            sb.append(InstructionFileId.DOT);
            str3 = KEY_STREAM_ID;
        }
        sb.append(str3);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            int count = cursorRawQuery.getCount();
            cursorRawQuery.close();
            return count;
        } catch (SQLiteDatabaseLockedException unused) {
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    public int getUncatCount(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams WHERE ( stream_type LIKE '%" + str2 + "%' )  AND categoryID='" + str + "' AND " + KEY_USER_ID + " = '" + SharepreferenceDBHandler.getUserID(this.context) + "'", null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getUncatCountM3U(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM series_m3u_streams WHERE series_m3u_stream_container_cat_id ='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getUncatCountM3UALL(Boolean bool) {
        StringBuilder sb;
        String str;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (bool.booleanValue()) {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='");
            sb.append(userID);
            sb.append("' AND ");
            sb.append(KEY_MOVE_TO);
            sb.append(" NOT IN ('live','movie','series') OR ");
            sb.append(KEY_MOVE_TO);
            str = " IS NULL";
        } else {
            sb = new StringBuilder();
            sb.append("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='");
            sb.append(userID);
            str = "'";
        }
        sb.append(str);
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getUncatCountM3UByType(String str) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_streams_m3u WHERE categoryID='' AND user_id_referred='" + SharepreferenceDBHandler.getUserID(this.context) + "' AND " + KEY_STRESM_TYPE + "='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int getUncatCountSeries(String str) {
        StringBuilder sb;
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
            sb = new StringBuilder();
            str2 = "SELECT COUNT(*) FROM onestream_series_streams_v2 WHERE category_id_series_stream_v2 ='";
        } else {
            sb = new StringBuilder();
            str2 = "SELECT COUNT(*) FROM series_streams_v2 WHERE category_id_series_stream_v2 ='";
        }
        sb.append(str2);
        sb.append(str);
        sb.append("' AND ");
        sb.append(KEY_USER_ID);
        sb.append(" = '");
        sb.append(userID);
        sb.append("'");
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(sb.toString(), null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public ImportStatusModel getdateDBStatus(String str) {
        String str2;
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (str.equals(TABLE_EPG)) {
            ArrayList<EPGSourcesModel> activeEPGSource = getActiveEPGSource();
            str2 = "SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND " + KEY_USER_ID + " = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "' AND " + KEY_SOURCE_REF_ID + " = '" + ((activeEPGSource == null || activeEPGSource.size() <= 0) ? "0" : String.valueOf(activeEPGSource.get(0).getIdAuto())) + "'";
        } else {
            str2 = "SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND " + KEY_USER_ID + " = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "'";
        }
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery(str2, null);
            ImportStatusModel importStatusModel = new ImportStatusModel();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    importStatusModel.setIdAuto(w.r0(cursorRawQuery.getString(0)));
                    importStatusModel.setType(cursorRawQuery.getString(1));
                    importStatusModel.setStatus(cursorRawQuery.getString(2));
                    importStatusModel.setDate(cursorRawQuery.getString(3));
                    importStatusModel.setTime(cursorRawQuery.getString(4));
                    importStatusModel.setSourceRef(cursorRawQuery.getString(7));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return importStatusModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ImportStatusModel getdateDBStatus(String str, String str2) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_import_status WHERE type = '" + str + "' AND " + KEY_USER_ID + " = '" + SharepreferenceDBHandler.getUserID(this.context) + "' AND " + KEY_APP_TYPE + " = '" + SharepreferenceDBHandler.getCurrentAPPType(this.context) + "' AND " + KEY_SOURCE_REF_ID + " = '" + str2 + "'", null);
            ImportStatusModel importStatusModel = new ImportStatusModel();
            if (cursorRawQuery.moveToFirst()) {
                do {
                    importStatusModel.setIdAuto(w.r0(cursorRawQuery.getString(0)));
                    importStatusModel.setType(cursorRawQuery.getString(1));
                    importStatusModel.setStatus(cursorRawQuery.getString(2));
                    importStatusModel.setDate(cursorRawQuery.getString(3));
                    importStatusModel.setTime(cursorRawQuery.getString(4));
                    importStatusModel.setSourceRef(cursorRawQuery.getString(7));
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return importStatusModel;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public ArrayList<ImportStatusModel> getdateDBStatus() {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        ArrayList<ImportStatusModel> arrayList = new ArrayList<>();
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT * FROM iptv_import_status WHERE user_id_referred = '" + userID + "' AND " + KEY_APP_TYPE + " = '" + currentAPPType + "'", null);
            if (cursorRawQuery.moveToFirst()) {
                do {
                    ImportStatusModel importStatusModel = new ImportStatusModel();
                    importStatusModel.setIdAuto(w.r0(cursorRawQuery.getString(0)));
                    importStatusModel.setType(cursorRawQuery.getString(1));
                    importStatusModel.setStatus(cursorRawQuery.getString(2));
                    importStatusModel.setDate(cursorRawQuery.getString(3));
                    importStatusModel.setTime(cursorRawQuery.getString(4));
                    importStatusModel.setSourceRef(cursorRawQuery.getString(7));
                    arrayList.add(importStatusModel);
                } while (cursorRawQuery.moveToNext());
            }
            cursorRawQuery.close();
            return arrayList;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return null;
        }
    }

    public void importDataStatusArrayList(ArrayList<ImportStatusModel> arrayList, String str) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.beginTransaction();
            try {
                int userID = SharepreferenceDBHandler.getUserID(this.context);
                ContentValues contentValues = new ContentValues();
                int size = arrayList.size();
                if (size != 0) {
                    for (int i9 = 0; i9 < size; i9++) {
                        contentValues.put("type", arrayList.get(i9).getType());
                        contentValues.put(KEY_STATUS_IMPORT_STATUS, arrayList.get(i9).getStatus());
                        contentValues.put(KEY_DATE_IMPORT_STATUS, arrayList.get(i9).getDate());
                        contentValues.put(KEY_TIME_IMPORT_STATUS, arrayList.get(i9).getTime());
                        contentValues.put(KEY_USER_ID, Integer.valueOf(userID));
                        contentValues.put(KEY_APP_TYPE, str);
                        contentValues.put(KEY_SOURCE_REF_ID, arrayList.get(i9).getSourceRef());
                        writableDatabase.insert(TABLE_DATABASE_IMPORT_STATUS, null, contentValues);
                    }
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (SQLiteDatabaseLockedException | Exception unused) {
                writableDatabase.endTransaction();
                Log.w("msg", "exception");
            }
        } catch (Exception unused2) {
        }
    }

    public int isStreamAvailable(String str, int i9) {
        try {
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_recent_watched_m3u WHERE url='" + str + "' AND " + KEY_USER_ID + "='" + i9 + "'", null);
            cursorRawQuery.moveToFirst();
            int i10 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i10;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public int liveRecentlyWatchedCount(String str) {
        try {
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT  COUNT(*) FROM iptv_live_watched WHERE user_id_referred='" + SharepreferenceDBHandler.getUserID(this.context) + "' AND " + KEY_APP_TYPE + "='" + currentAPPType + "' AND type='" + str + "'", null);
            cursorRawQuery.moveToFirst();
            int i9 = cursorRawQuery.getInt(0);
            cursorRawQuery.close();
            return i9;
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            return 0;
        }
    }

    public void makeEmptyAllTablesRecordsM3U() {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM iptv_m3u_all_category WHERE user_id_referred='" + userID + "'");
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyAllTablesRecordsM3U(int i9) {
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM iptv_movie_category_m3u WHERE user_id_referred='" + i9 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_series_category_m3u WHERE user_id_referred='" + i9 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_live_category_m3u WHERE user_id_referred='" + i9 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_live_streams_m3u WHERE user_id_referred='" + i9 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_m3u_all_category WHERE user_id_referred='" + i9 + "'");
            writableDatabase.execSQL("DELETE FROM iptv_m3u_favourites WHERE user_id_referred='" + i9 + "'");
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyEPG() {
        try {
            getReadableDatabase();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            writableDatabase.execSQL("delete from epg");
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException | SQLiteException unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyEPGWithSourceRef(int i9, String str) {
        try {
            String str2 = str.equals("m3u") ? TABLE_EPG_M3U : TABLE_EPG;
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE " + KEY_USER_ID + " = '" + i9 + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyEPGWithSourceRef(String str) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            String str2 = SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_M3U : TABLE_EPG;
            getWritableDatabase().execSQL("DELETE FROM " + str2 + " WHERE " + KEY_USER_ID + " = '" + userID + "' AND " + KEY_SOURCE_REF_ID + " = '" + str + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyLiveCategory() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_live_category WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyLiveCategoryOneStream() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_onestream_live_category WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyLiveCategoryStalker() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_stalker_live_category WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyLiveStreams() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from iptv_live_streams WHERE (stream_type LIKE '%live%' OR stream_type LIKE '%radio%' ) AND user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyLiveStreamsOneStream() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from onestream_iptv_live_streams WHERE (stream_type LIKE '%live%' OR stream_type LIKE '%radio%' ) AND user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyLiveStreamsStalker() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("delete from iptv_stalker_live_streams WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyMovieCategory() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_movie_category WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyMovieCategoryStalker() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_stalker_movie_category WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyONESTREAMMovieCategory() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from onestream_iptv_live_streams WHERE stream_type LIKE '%movie%' AND user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyOneStreamSeriesCategories() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM onestream_series_category_v2 WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyOneStreamSeriesStreams() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM onestream_series_streams_v2 WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptySeriesCategories() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM series_category_v2 WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptySeriesCategoriesStalker() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getWritableDatabase().execSQL("DELETE FROM iptv_stalker_series_category WHERE user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptySeriesStreams() {
        StringBuilder sb;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("onestream_api")) {
                sb = new StringBuilder();
                sb.append("DELETE FROM onestream_series_streams_v2 WHERE user_id_referred = '");
                sb.append(userID);
                sb.append("'");
            } else {
                sb = new StringBuilder();
                sb.append("DELETE FROM series_streams_v2 WHERE user_id_referred = '");
                sb.append(userID);
                sb.append("'");
            }
            writableDatabase.execSQL(sb.toString());
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void makeEmptyVODStreams() {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getReadableDatabase();
            getWritableDatabase().execSQL("delete from iptv_live_streams WHERE stream_type LIKE '%movie%' AND user_id_referred = '" + userID + "'");
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL(this.CREATE_LIVE_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_MOVIE_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_EPG_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_PASSWORD_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_PASSWORD_STATUS_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_STREAM_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS);
        sQLiteDatabase.execSQL(this.CREATE_VOD_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_MAG_PORTAL_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS_ALL_M3U);
        sQLiteDatabase.execSQL(this.CREATE_M3U_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_FAV_M3U_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_M3U_SERIES_STREAMS_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS_M3U);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_CATEGORY_TABLE_M3U);
        sQLiteDatabase.execSQL(this.CREATE_MOVIE_CATEGORY_TABLE_M3U);
        sQLiteDatabase.execSQL(this.CREATE_SERIES_CATEGORY_TABLE_M3U);
        sQLiteDatabase.execSQL(this.CREATE_PASSWORD_STATUS_TABLE_M3U);
        sQLiteDatabase.execSQL(this.CREATE_PASSWORD_TABLE_M3U);
        sQLiteDatabase.execSQL(this.CREATE_RECENT_WATCHED_M3U);
        sQLiteDatabase.execSQL(this.CREATE_SERIES_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_SERIES_STREAMS);
        sQLiteDatabase.execSQL(this.CREATE_PASSWORD_TABLE_M3U);
        sQLiteDatabase.execSQL(this.CREATE_DB_UPDATED_STATUS_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_EPG_M3U_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_TABLE_EPG_SOURCES);
        sQLiteDatabase.execSQL(this.CREATE_TABLE_EPG_SOURCES_M3U);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_WATCHED_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_STALKER_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_STALKER_AVAILABLE_CHANNELS);
        sQLiteDatabase.execSQL(this.CREATE_MOVIE_STALKER_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_SERIES_STALKER_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_SERIES_STREAMS);
        sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_SERIES_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_LIVE_ONESTREAM_AVAILABLE_CHANELS);
        sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_MOVIE_CATEGORY_TABLE);
        sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_LIVE_CATEGORY_TABLE);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        if (i9 < 3) {
            sQLiteDatabase.execSQL(this.ALTER_PASSWORD_TABLE_1);
            sQLiteDatabase.execSQL(this.ALTER_PASSWORD_STATUS_TABLE_2);
        }
        if (i9 < 4) {
            sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS_ALL_M3U);
            sQLiteDatabase.execSQL(this.CREATE_M3U_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_FAV_M3U_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_M3U_SERIES_STREAMS_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS_M3U);
            sQLiteDatabase.execSQL(this.CREATE_LIVE_CATEGORY_TABLE_M3U);
            sQLiteDatabase.execSQL(this.CREATE_MOVIE_CATEGORY_TABLE_M3U);
            sQLiteDatabase.execSQL(this.CREATE_SERIES_CATEGORY_TABLE_M3U);
            sQLiteDatabase.execSQL(this.CREATE_PASSWORD_STATUS_TABLE_M3U);
            sQLiteDatabase.execSQL(this.CREATE_PASSWORD_TABLE_M3U);
            sQLiteDatabase.execSQL(this.CREATE_RECENT_WATCHED_M3U);
        }
        if (i9 < 5) {
            sQLiteDatabase.execSQL(this.ALTER_RATING_COLUMN1);
            sQLiteDatabase.execSQL(this.ALTER_RATING_COLUMN2);
        }
        if (i9 < 6) {
            sQLiteDatabase.execSQL(this.CREATE_DB_UPDATED_STATUS_TABLE);
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_category");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_movie_category");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS series_category_v2");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS iptv_live_streams");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS series_streams_v2");
            sQLiteDatabase.execSQL("DROP TABLE IF EXISTS epg");
            sQLiteDatabase.execSQL(this.CREATE_LIVE_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_MOVIE_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_SERIES_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_LIVE_AVAILABLE_CHANELS);
            sQLiteDatabase.execSQL(this.CREATE_SERIES_STREAMS);
            sQLiteDatabase.execSQL(this.CREATE_EPG_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_EPG_M3U_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_TABLE_EPG_SOURCES);
            sQLiteDatabase.execSQL(this.CREATE_TABLE_EPG_SOURCES_M3U);
        }
        if (i9 < 7) {
            sQLiteDatabase.execSQL(this.CREATE_LIVE_WATCHED_TABLE);
        }
        if (i9 < 8) {
            sQLiteDatabase.execSQL(this.CREATE_LIVE_STALKER_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_LIVE_STALKER_AVAILABLE_CHANNELS);
            sQLiteDatabase.execSQL(this.CREATE_MOVIE_STALKER_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_SERIES_STALKER_CATEGORY_TABLE);
        }
        if (i9 < 9) {
            sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_SERIES_STREAMS);
            sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_SERIES_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_LIVE_ONESTREAM_AVAILABLE_CHANELS);
            sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_MOVIE_CATEGORY_TABLE);
            sQLiteDatabase.execSQL(this.CREATE_ONESTREAM_LIVE_CATEGORY_TABLE);
        }
        if (i9 < 11) {
            sQLiteDatabase.execSQL(this.ALTER_URL_FIREBASE_DB_CHANNNELS_ALL_M3U);
            sQLiteDatabase.execSQL(this.ALTER_URL_FIREBASE_DB_WATCHED_M3U);
            sQLiteDatabase.execSQL(this.ALTER_URL_FIREBASE_DB_CHANNNELS_M3U);
        }
        if (i9 < 12) {
            sQLiteDatabase.execSQL(this.ALTER_TYPE_COLUMN_RECENT_WATCHED_CHANNNELS);
        }
    }

    public void removeAvailableChannelM3U(String str) {
        String str2;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            getReadableDatabase();
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_live_streams_m3u WHERE user_id_referred='" + userID + "'";
            } else {
                str2 = "DELETE FROM iptv_live_streams_m3u WHERE categoryID ='" + str + "' AND " + KEY_USER_ID + "='" + userID + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void removeLiveCategoriesM3U(String str) {
        String str2;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_live_category_m3u WHERE user_id_referred='" + userID + "'";
            } else {
                str2 = "DELETE FROM iptv_live_category_m3u WHERE categoryID ='" + str + "' AND " + KEY_USER_ID + "='" + userID + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void removeMovieCategoriesM3U(String str) {
        String str2;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_movie_category_m3u WHERE user_id_referred='" + userID + "'";
            } else {
                str2 = "DELETE FROM iptv_movie_category_m3u WHERE categoryID ='" + str + "' AND " + KEY_USER_ID + "='" + userID + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void removeSeriesCategoriesM3U(String str) {
        String str2;
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            if (str.equals("0")) {
                str2 = "DELETE FROM iptv_series_category_m3u WHERE user_id_referred='" + userID + "'";
            } else {
                str2 = "DELETE FROM iptv_series_category_m3u WHERE categoryID ='" + str + "' AND " + KEY_USER_ID + "='" + userID + "'";
            }
            writableDatabase.execSQL(str2);
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0094 A[Catch: Exception -> 0x00b3, SQLiteDatabaseLockedException -> 0x00b7, TryCatch #2 {SQLiteDatabaseLockedException -> 0x00b7, Exception -> 0x00b3, blocks: (B:7:0x001a, B:9:0x0061, B:11:0x0067, B:18:0x008e, B:20:0x0094, B:22:0x00a9, B:25:0x00af, B:14:0x0080, B:16:0x0084), top: B:31:0x001a }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean upDatePassword(java.lang.String r9, java.lang.String r10, int r11) {
        /*
            r8 = this;
            java.lang.String r0 = "exception"
            java.lang.String r1 = "msg"
            java.lang.String r2 = ""
            android.content.Context r3 = r8.context
            java.lang.String r3 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getCurrentAPPType(r3)
            java.lang.String r4 = "m3u"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L17
            java.lang.String r3 = "iptv_password_table_m3u"
            goto L19
        L17:
            java.lang.String r3 = "iptv_password_table"
        L19:
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.<init>()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = "SELECT rowid FROM "
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r3)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = " WHERE "
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = "user_detail"
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = " = '"
            r5.append(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = "' AND "
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = "user_id_referred"
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = " = "
            r5.append(r9)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r11)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5.append(r2)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r9 = r5.toString()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r8.getReadableDatabase()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            android.database.sqlite.SQLiteDatabase r11 = r8.getWritableDatabase()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5 = 0
            android.database.Cursor r9 = r11.rawQuery(r9, r5)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r5 = 1
            if (r9 == 0) goto L80
            boolean r6 = r9.moveToFirst()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r6 == 0) goto L8d
        L67:
            java.lang.String r6 = "id_password"
            int r6 = r9.getColumnIndex(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = r9.getString(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            int r6 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            boolean r7 = r9.moveToNext()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r7 != 0) goto L67
            goto L8e
        L80:
            android.content.Context r6 = r8.context     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r6 == 0) goto L8d
            java.lang.String r7 = "cursor is null"
            android.widget.Toast r6 = android.widget.Toast.makeText(r6, r7, r5)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r6.show()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
        L8d:
            r6 = r2
        L8e:
            boolean r2 = r6.equals(r2)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r2 != 0) goto Lad
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r2.<init>()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r7 = "password"
            r2.put(r7, r10)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            java.lang.String r10 = "id_password= ?"
            java.lang.String[] r6 = new java.lang.String[]{r6}     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            r11.update(r3, r2, r10, r6)     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
            if (r9 == 0) goto Lac
            r9.close()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
        Lac:
            return r5
        Lad:
            if (r9 == 0) goto Lb2
            r9.close()     // Catch: java.lang.Exception -> Lb3 android.database.sqlite.SQLiteDatabaseLockedException -> Lb7
        Lb2:
            return r4
        Lb3:
            android.util.Log.w(r1, r0)
            return r4
        Lb7:
            android.util.Log.w(r1, r0)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.upDatePassword(java.lang.String, java.lang.String, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0071 A[Catch: SQLiteException -> 0x0097, SQLiteDatabaseLockedException -> 0x009b, TryCatch #2 {SQLiteDatabaseLockedException -> 0x009b, SQLiteException -> 0x0097, blocks: (B:3:0x0005, B:6:0x003e, B:8:0x0044, B:15:0x006b, B:17:0x0071, B:19:0x008d, B:22:0x0093, B:11:0x005d, B:13:0x0061), top: B:28:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean updateDBStatusAndDate(java.lang.String r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
        /*
            r7 = this;
            java.lang.String r0 = "exception"
            java.lang.String r1 = "msg"
            r2 = 0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r3.<init>()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r4 = "SELECT rowid FROM iptv_db_update_status WHERE iptv_db_updated_status_category = '"
            r3.append(r4)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r3.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r8 = "' AND "
            r3.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r8 = "iptv_db_updated_status_category_id"
            r3.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r8 = " = '"
            r3.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r3.append(r9)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r8 = "'"
            r3.append(r8)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r8 = r3.toString()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r7.getReadableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            android.database.sqlite.SQLiteDatabase r9 = r7.getWritableDatabase()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r3 = 0
            android.database.Cursor r8 = r9.rawQuery(r8, r3)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r3 = 1
            java.lang.String r4 = ""
            if (r8 == 0) goto L5d
            boolean r5 = r8.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            if (r5 == 0) goto L6a
        L44:
            java.lang.String r5 = "iptv_db_update_status_id"
            int r5 = r8.getColumnIndex(r5)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r5 = r8.getString(r5)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            int r5 = java.lang.Integer.parseInt(r5)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            boolean r6 = r8.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            if (r6 != 0) goto L44
            goto L6b
        L5d:
            android.content.Context r5 = r7.context     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            if (r5 == 0) goto L6a
            java.lang.String r6 = "cursor is null"
            android.widget.Toast r5 = android.widget.Toast.makeText(r5, r6, r3)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r5.show()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
        L6a:
            r5 = r4
        L6b:
            boolean r4 = r5.equals(r4)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            if (r4 != 0) goto L91
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r4.<init>()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r6 = "iptv_db_updated_status_state"
            r4.put(r6, r10)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r10 = "iptv_db_updated_status_last_updated_date"
            r4.put(r10, r11)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            java.lang.String r10 = "iptv_db_update_status"
            java.lang.String r11 = "iptv_db_update_status_id= ?"
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            r9.update(r10, r4, r11, r5)     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
            if (r8 == 0) goto L90
            r8.close()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
        L90:
            return r3
        L91:
            if (r8 == 0) goto L96
            r8.close()     // Catch: android.database.sqlite.SQLiteException -> L97 android.database.sqlite.SQLiteDatabaseLockedException -> L9b
        L96:
            return r2
        L97:
            android.util.Log.w(r1, r0)
            return r2
        L9b:
            android.util.Log.w(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.updateDBStatusAndDate(java.lang.String, java.lang.String, java.lang.String, java.lang.String):boolean");
    }

    public void updateEPGSource(String str, String str2, String str3, String str4, int i9) {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String str5 = SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            ContentValues contentValues2 = new ContentValues();
            contentValues2.put(KEY_USER_ID, Integer.valueOf(userID));
            contentValues2.put("name", str);
            contentValues2.put(KEY_SOURCE_TYPE, str2);
            contentValues2.put(KEY_EPGURL, str3);
            contentValues2.put(KEY_DEFAULT_SOURCE, str4);
            if (str4.equals("1")) {
                contentValues.put(KEY_DEFAULT_SOURCE, "0");
                writableDatabase.update(str5, contentValues, "user_id_referred = ?", new String[]{String.valueOf(userID)});
            }
            writableDatabase.update(str5, contentValues2, "auto_id = ? AND user_id_referred = ?", new String[]{String.valueOf(i9), String.valueOf(userID)});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    public void updateImportStatus(String str, String str2) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_STATUS_IMPORT_STATUS, str2);
            contentValues.put(KEY_DATE_IMPORT_STATUS, w.q());
            contentValues.put(KEY_TIME_IMPORT_STATUS, Long.valueOf(System.currentTimeMillis()));
            writableDatabase.update(TABLE_DATABASE_IMPORT_STATUS, contentValues, "type = ? AND user_id_referred = ? AND app_type = ?", new String[]{String.valueOf(str), String.valueOf(userID), String.valueOf(currentAPPType)});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void updateImportStatus(String str, String str2, String str3) {
        try {
            int userID = SharepreferenceDBHandler.getUserID(this.context);
            String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_STATUS_IMPORT_STATUS, str2);
            contentValues.put(KEY_DATE_IMPORT_STATUS, w.q());
            contentValues.put(KEY_TIME_IMPORT_STATUS, Long.valueOf(System.currentTimeMillis()));
            writableDatabase.update(TABLE_DATABASE_IMPORT_STATUS, contentValues, "type = ? AND user_id_referred = ? AND app_type = ? AND source_ref_id = ?", new String[]{String.valueOf(str), String.valueOf(userID), String.valueOf(currentAPPType), String.valueOf(str3)});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
            Log.w("msg", "exception");
        }
    }

    public void updatePanelEPGSourceToDefault() {
        int userID = SharepreferenceDBHandler.getUserID(this.context);
        String str = SharepreferenceDBHandler.getCurrentAPPType(this.context).equals("m3u") ? TABLE_EPG_SOURCES_M3U : TABLE_EPG_SOURCES;
        try {
            SQLiteDatabase writableDatabase = getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_DEFAULT_SOURCE, "1");
            writableDatabase.update(str, contentValues, "user_id_referred = ? AND source_type = ?", new String[]{String.valueOf(userID), "panel"});
        } catch (SQLiteDatabaseLockedException | Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7 A[Catch: Exception -> 0x00c6, SQLiteDatabaseLockedException -> 0x00ca, TryCatch #2 {SQLiteDatabaseLockedException -> 0x00ca, Exception -> 0x00c6, blocks: (B:7:0x0023, B:9:0x0074, B:11:0x007a, B:18:0x00a1, B:20:0x00a7, B:22:0x00bc, B:25:0x00c2, B:14:0x0093, B:16:0x0097), top: B:31:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean updatePasswordStatus(java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13) {
        /*
            Method dump skipped, instruction units count: 206
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.updatePasswordStatus(java.lang.String, java.lang.String, java.lang.String, int):boolean");
    }

    public void updatePasswordStatusForAll() throws Throwable {
        String str;
        SQLiteDatabase writableDatabase;
        String currentAPPType = SharepreferenceDBHandler.getCurrentAPPType(this.context);
        if (currentAPPType.equals("m3u")) {
            str = TABLE_IPTV_PASSWORD_STATUS_M3U;
        } else {
            currentAPPType.equals("onestream_api");
            str = TABLE_IPTV_PASSWORD_STATUS;
        }
        SQLiteDatabase sQLiteDatabase = null;
        try {
            writableDatabase = getWritableDatabase();
        } catch (SQLiteDatabaseLockedException unused) {
        } catch (Exception unused2) {
        } catch (Throwable th) {
            th = th;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put(KEY_PASSWORD_STATUS, "0");
            writableDatabase.update(str, contentValues, null, null);
            writableDatabase.close();
        } catch (SQLiteDatabaseLockedException unused3) {
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (Exception unused4) {
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase == null) {
                return;
            }
            sQLiteDatabase.close();
        } catch (Throwable th2) {
            th = th2;
            sQLiteDatabase = writableDatabase;
            if (sQLiteDatabase != null) {
                sQLiteDatabase.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0081 A[Catch: Exception -> 0x00af, SQLiteDatabaseLockedException -> 0x00b3, TryCatch #3 {SQLiteDatabaseLockedException -> 0x00b3, Exception -> 0x00af, blocks: (B:3:0x0009, B:6:0x004c, B:8:0x0052, B:11:0x0066, B:18:0x007b, B:20:0x0081, B:22:0x00a5, B:25:0x00ab, B:14:0x006d, B:16:0x0071), top: B:33:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean updateResumePlayerStatuTimes(java.lang.String r7, java.lang.String r8, boolean r9, long r10, long r12, int r14) {
        /*
            r6 = this;
            java.lang.String r9 = "exception"
            java.lang.String r0 = "msg"
            java.lang.String r1 = " = '"
            java.lang.String r2 = "' AND "
            r3 = 0
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.<init>()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r5 = "SELECT rowid FROM iptv_recent_watched_m3u WHERE stream_type = '"
            r4.append(r5)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.append(r8)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.append(r2)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r8 = "user_id_referred"
            r4.append(r8)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.append(r1)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.append(r14)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.append(r2)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r8 = "url"
            r4.append(r8)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.append(r1)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r4.append(r7)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r7 = "'"
            r4.append(r7)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r6.getReadableDatabase()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            android.database.sqlite.SQLiteDatabase r8 = r6.getWritableDatabase()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r14 = 0
            android.database.Cursor r7 = r8.rawQuery(r7, r14)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r14 = 1
            java.lang.String r1 = ""
            if (r7 == 0) goto L6d
            boolean r2 = r7.moveToFirst()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            if (r2 == 0) goto L7a
        L52:
            java.lang.String r2 = "id"
            int r2 = r7.getColumnIndex(r2)     // Catch: java.lang.NumberFormatException -> L65 java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r2 = r7.getString(r2)     // Catch: java.lang.NumberFormatException -> L65 java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> L65 java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.NumberFormatException -> L65 java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            goto L66
        L65:
            r2 = r1
        L66:
            boolean r4 = r7.moveToNext()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            if (r4 != 0) goto L52
            goto L7b
        L6d:
            android.content.Context r2 = r6.context     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            if (r2 == 0) goto L7a
            java.lang.String r4 = "cursor is null"
            android.widget.Toast r2 = android.widget.Toast.makeText(r2, r4, r14)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r2.show()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
        L7a:
            r2 = r1
        L7b:
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            if (r1 != 0) goto La9
            android.content.ContentValues r1 = new android.content.ContentValues     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r1.<init>()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r4 = "movie_elapsed_time"
            java.lang.Long r12 = java.lang.Long.valueOf(r12)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r1.put(r4, r12)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r12 = "movie_duration"
            java.lang.Long r10 = java.lang.Long.valueOf(r10)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r1.put(r12, r10)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            java.lang.String r10 = "iptv_recent_watched_m3u"
            java.lang.String r11 = "id= ?"
            java.lang.String[] r12 = new java.lang.String[]{r2}     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            r8.update(r10, r1, r11, r12)     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
            if (r7 == 0) goto La8
            r7.close()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
        La8:
            return r14
        La9:
            if (r7 == 0) goto Lae
            r7.close()     // Catch: java.lang.Exception -> Laf android.database.sqlite.SQLiteDatabaseLockedException -> Lb3
        Lae:
            return r3
        Laf:
            android.util.Log.w(r0, r9)
            return r3
        Lb3:
            android.util.Log.w(r0, r9)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.updateResumePlayerStatuTimes(java.lang.String, java.lang.String, boolean, long, long, int):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0087 A[Catch: Exception -> 0x00ac, SQLiteDatabaseLockedException -> 0x00b0, TryCatch #3 {SQLiteDatabaseLockedException -> 0x00b0, Exception -> 0x00ac, blocks: (B:3:0x000f, B:6:0x0052, B:8:0x0058, B:11:0x006c, B:18:0x0081, B:20:0x0087, B:22:0x00a2, B:25:0x00a8, B:14:0x0073, B:16:0x0077), top: B:33:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean updateResumePlayerStatus(java.lang.String r8, java.lang.String r9, boolean r10, long r11) {
        /*
            r7 = this;
            java.lang.String r10 = "exception"
            java.lang.String r0 = "msg"
            java.lang.String r1 = " = '"
            java.lang.String r2 = "' AND "
            android.content.Context r3 = r7.context
            int r3 = com.nst.iptvsmarterstvbox.model.database.SharepreferenceDBHandler.getUserID(r3)
            r4 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.<init>()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r6 = "SELECT rowid FROM iptv_recent_watched_m3u WHERE stream_type = '"
            r5.append(r6)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.append(r9)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.append(r2)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r9 = "user_id_referred"
            r5.append(r9)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.append(r1)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.append(r3)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.append(r2)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r9 = "url"
            r5.append(r9)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.append(r1)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r5.append(r8)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r8 = "'"
            r5.append(r8)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r7.getReadableDatabase()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            android.database.sqlite.SQLiteDatabase r9 = r7.getWritableDatabase()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r1 = 0
            android.database.Cursor r8 = r9.rawQuery(r8, r1)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r1 = 1
            java.lang.String r2 = ""
            if (r8 == 0) goto L73
            boolean r3 = r8.moveToFirst()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            if (r3 == 0) goto L80
        L58:
            java.lang.String r3 = "id"
            int r3 = r8.getColumnIndex(r3)     // Catch: java.lang.NumberFormatException -> L6b java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r3 = r8.getString(r3)     // Catch: java.lang.NumberFormatException -> L6b java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L6b java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.NumberFormatException -> L6b java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            goto L6c
        L6b:
            r3 = r2
        L6c:
            boolean r5 = r8.moveToNext()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            if (r5 != 0) goto L58
            goto L81
        L73:
            android.content.Context r3 = r7.context     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            if (r3 == 0) goto L80
            java.lang.String r5 = "cursor is null"
            android.widget.Toast r3 = android.widget.Toast.makeText(r3, r5, r1)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r3.show()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
        L80:
            r3 = r2
        L81:
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            if (r2 != 0) goto La6
            android.content.ContentValues r2 = new android.content.ContentValues     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r2.<init>()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r5 = "movie_elapsed_time"
            java.lang.Long r11 = java.lang.Long.valueOf(r11)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r2.put(r5, r11)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            java.lang.String r11 = "iptv_recent_watched_m3u"
            java.lang.String r12 = "id= ?"
            java.lang.String[] r3 = new java.lang.String[]{r3}     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            r9.update(r11, r2, r12, r3)     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
            if (r8 == 0) goto La5
            r8.close()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
        La5:
            return r1
        La6:
            if (r8 == 0) goto Lab
            r8.close()     // Catch: java.lang.Exception -> Lac android.database.sqlite.SQLiteDatabaseLockedException -> Lb0
        Lab:
            return r4
        Lac:
            android.util.Log.w(r0, r10)
            return r4
        Lb0:
            android.util.Log.w(r0, r10)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nst.iptvsmarterstvbox.model.database.LiveStreamDBHandler.updateResumePlayerStatus(java.lang.String, java.lang.String, boolean, long):boolean");
    }
}
