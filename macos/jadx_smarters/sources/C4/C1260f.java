package c4;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import d4.AbstractC1684a;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: renamed from: c4.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1260f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f18240c = {"name", Name.LENGTH, "last_touch_timestamp"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T2.b f18241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f18242b;

    public C1260f(T2.b bVar) {
        this.f18241a = bVar;
    }

    public static void a(SQLiteDatabase sQLiteDatabase, String str) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS " + str);
    }

    public static String d(String str) {
        return "ExoPlayerCacheFileMetadata" + str;
    }

    public Map b() throws T2.a {
        try {
            Cursor cursorC = c();
            try {
                HashMap map = new HashMap(cursorC.getCount());
                while (cursorC.moveToNext()) {
                    map.put((String) AbstractC1684a.e(cursorC.getString(0)), new C1259e(cursorC.getLong(1), cursorC.getLong(2)));
                }
                cursorC.close();
                return map;
            } finally {
            }
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    public final Cursor c() {
        AbstractC1684a.e(this.f18242b);
        return this.f18241a.getReadableDatabase().query(this.f18242b, f18240c, null, null, null, null, null);
    }

    public void e(long j9) throws T2.a {
        try {
            String hexString = Long.toHexString(j9);
            this.f18242b = d(hexString);
            if (T2.e.b(this.f18241a.getReadableDatabase(), 2, hexString) != 1) {
                SQLiteDatabase writableDatabase = this.f18241a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    T2.e.d(writableDatabase, 2, hexString, 1);
                    a(writableDatabase, this.f18242b);
                    writableDatabase.execSQL("CREATE TABLE " + this.f18242b + " (name TEXT PRIMARY KEY NOT NULL,length INTEGER NOT NULL,last_touch_timestamp INTEGER NOT NULL)");
                    writableDatabase.setTransactionSuccessful();
                    writableDatabase.endTransaction();
                } catch (Throwable th) {
                    writableDatabase.endTransaction();
                    throw th;
                }
            }
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    public void f(String str) throws T2.a {
        AbstractC1684a.e(this.f18242b);
        try {
            this.f18241a.getWritableDatabase().delete(this.f18242b, "name = ?", new String[]{str});
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    public void g(Set set) throws T2.a {
        AbstractC1684a.e(this.f18242b);
        try {
            SQLiteDatabase writableDatabase = this.f18241a.getWritableDatabase();
            writableDatabase.beginTransactionNonExclusive();
            try {
                Iterator it = set.iterator();
                while (it.hasNext()) {
                    writableDatabase.delete(this.f18242b, "name = ?", new String[]{(String) it.next()});
                }
                writableDatabase.setTransactionSuccessful();
                writableDatabase.endTransaction();
            } catch (Throwable th) {
                writableDatabase.endTransaction();
                throw th;
            }
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    public void h(String str, long j9, long j10) throws T2.a {
        AbstractC1684a.e(this.f18242b);
        try {
            SQLiteDatabase writableDatabase = this.f18241a.getWritableDatabase();
            ContentValues contentValues = new ContentValues();
            contentValues.put("name", str);
            contentValues.put(Name.LENGTH, Long.valueOf(j9));
            contentValues.put("last_touch_timestamp", Long.valueOf(j10));
            writableDatabase.replaceOrThrow(this.f18242b, null, contentValues);
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }
}
