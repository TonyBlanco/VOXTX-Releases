package T2;

import O2.AbstractC0928w0;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import d4.k0;
import org.apache.http.cookie.ClientCookie;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {
    static {
        AbstractC0928w0.a("goog.exo.database");
    }

    public static String[] a(int i9, String str) {
        return new String[]{Integer.toString(i9), str};
    }

    public static int b(SQLiteDatabase sQLiteDatabase, int i9, String str) throws a {
        try {
        } catch (SQLException e9) {
            throw new a(e9);
        }
        if (!k0.o1(sQLiteDatabase, "ExoPlayerVersions")) {
            return -1;
        }
        Cursor cursorQuery = sQLiteDatabase.query("ExoPlayerVersions", new String[]{ClientCookie.VERSION_ATTR}, "feature = ? AND instance_uid = ?", a(i9, str), null, null, null);
        try {
            if (cursorQuery.getCount() == 0) {
                cursorQuery.close();
                return -1;
            }
            cursorQuery.moveToNext();
            int i10 = cursorQuery.getInt(0);
            cursorQuery.close();
            return i10;
        } finally {
        }
        throw new a(e9);
    }

    public static void c(SQLiteDatabase sQLiteDatabase, int i9, String str) throws a {
        try {
            if (k0.o1(sQLiteDatabase, "ExoPlayerVersions")) {
                sQLiteDatabase.delete("ExoPlayerVersions", "feature = ? AND instance_uid = ?", a(i9, str));
            }
        } catch (SQLException e9) {
            throw new a(e9);
        }
    }

    public static void d(SQLiteDatabase sQLiteDatabase, int i9, String str, int i10) throws a {
        try {
            sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS ExoPlayerVersions (feature INTEGER NOT NULL,instance_uid TEXT NOT NULL,version INTEGER NOT NULL,PRIMARY KEY (feature, instance_uid))");
            ContentValues contentValues = new ContentValues();
            contentValues.put("feature", Integer.valueOf(i9));
            contentValues.put("instance_uid", str);
            contentValues.put(ClientCookie.VERSION_ATTR, Integer.valueOf(i10));
            sQLiteDatabase.replaceOrThrow("ExoPlayerVersions", null, contentValues);
        } catch (SQLException e9) {
            throw new a(e9);
        }
    }
}
