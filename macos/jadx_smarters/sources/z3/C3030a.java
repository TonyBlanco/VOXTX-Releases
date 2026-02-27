package z3;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.text.TextUtils;
import com.amazonaws.mobileconnectors.appsync.AppSyncMutationsSqlHelper;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.achartengine.ChartFactory;
import org.simpleframework.xml.strategy.Name;
import z3.C3052w;

/* JADX INFO: renamed from: z3.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3030a implements InterfaceC3029I {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f52703f = p(3, 4);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String[] f52704g = {Name.MARK, AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded", "key_set_id"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f52705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f52706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T2.b f52707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f52708d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f52709e;

    /* JADX INFO: renamed from: z3.a$b */
    public static final class b implements InterfaceC3034e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Cursor f52710a;

        public b(Cursor cursor) {
            this.f52710a = cursor;
        }

        @Override // z3.InterfaceC3034e
        public C3032c J() {
            return C3030a.n(this.f52710a);
        }

        @Override // z3.InterfaceC3034e
        public boolean W(int i9) {
            return this.f52710a.moveToPosition(i9);
        }

        @Override // z3.InterfaceC3034e
        public /* synthetic */ boolean a0() {
            return AbstractC3033d.a(this);
        }

        @Override // z3.InterfaceC3034e, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f52710a.close();
        }

        @Override // z3.InterfaceC3034e
        public int getPosition() {
            return this.f52710a.getPosition();
        }
    }

    public C3030a(T2.b bVar) {
        this(bVar, "");
    }

    public C3030a(T2.b bVar, String str) {
        this.f52705a = str;
        this.f52707c = bVar;
        this.f52706b = "ExoPlayerDownloads" + str;
        this.f52708d = new Object();
    }

    public static List j(String str) {
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(str)) {
            return arrayList;
        }
        for (String str2 : k0.i1(str, ",")) {
            String[] strArrI1 = k0.i1(str2, "\\.");
            AbstractC1684a.g(strArrI1.length == 3);
            arrayList.add(new C3028H(Integer.parseInt(strArrI1[0]), Integer.parseInt(strArrI1[1]), Integer.parseInt(strArrI1[2])));
        }
        return arrayList;
    }

    public static String k(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i9 = 0; i9 < list.size(); i9++) {
            C3028H c3028h = (C3028H) list.get(i9);
            sb.append(c3028h.f52700a);
            sb.append('.');
            sb.append(c3028h.f52701c);
            sb.append('.');
            sb.append(c3028h.f52702d);
            sb.append(',');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    public static C3032c n(Cursor cursor) {
        byte[] blob = cursor.getBlob(14);
        C3052w.b bVarF = new C3052w.b((String) AbstractC1684a.e(cursor.getString(0)), Uri.parse((String) AbstractC1684a.e(cursor.getString(2)))).e(cursor.getString(1)).f(j(cursor.getString(3)));
        if (blob.length <= 0) {
            blob = null;
        }
        C3052w c3052wA = bVarF.d(blob).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        C3051v c3051v = new C3051v();
        c3051v.f52799a = cursor.getLong(13);
        c3051v.f52800b = cursor.getFloat(12);
        int i9 = cursor.getInt(6);
        return new C3032c(c3052wA, i9, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i9 == 4 ? cursor.getInt(11) : 0, c3051v);
    }

    public static C3032c o(Cursor cursor) {
        C3052w c3052wA = new C3052w.b((String) AbstractC1684a.e(cursor.getString(0)), Uri.parse((String) AbstractC1684a.e(cursor.getString(2)))).e(q(cursor.getString(1))).f(j(cursor.getString(3))).b(cursor.getString(4)).c(cursor.getBlob(5)).a();
        C3051v c3051v = new C3051v();
        c3051v.f52799a = cursor.getLong(13);
        c3051v.f52800b = cursor.getFloat(12);
        int i9 = cursor.getInt(6);
        return new C3032c(c3052wA, i9, cursor.getLong(7), cursor.getLong(8), cursor.getLong(9), cursor.getInt(10), i9 == 4 ? cursor.getInt(11) : 0, c3051v);
    }

    public static String p(int... iArr) {
        if (iArr.length == 0) {
            return "1";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("state");
        sb.append(" IN (");
        for (int i9 = 0; i9 < iArr.length; i9++) {
            if (i9 > 0) {
                sb.append(',');
            }
            sb.append(iArr[i9]);
        }
        sb.append(')');
        return sb.toString();
    }

    public static String q(String str) {
        return "dash".equals(str) ? "application/dash+xml" : "hls".equals(str) ? "application/x-mpegURL" : "ss".equals(str) ? "application/vnd.ms-sstr+xml" : "video/x-unknown";
    }

    @Override // z3.InterfaceC3029I
    public void a(String str, int i9) throws T2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i9));
            this.f52707c.getWritableDatabase().update(this.f52706b, contentValues, f52703f + " AND id = ?", new String[]{str});
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    @Override // z3.InterfaceC3029I
    public void b(String str) throws T2.a {
        l();
        try {
            this.f52707c.getWritableDatabase().delete(this.f52706b, "id = ?", new String[]{str});
        } catch (SQLiteException e9) {
            throw new T2.a(e9);
        }
    }

    @Override // z3.InterfaceC3029I
    public void c(int i9) throws T2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("stop_reason", Integer.valueOf(i9));
            this.f52707c.getWritableDatabase().update(this.f52706b, contentValues, f52703f, null);
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    @Override // z3.InterfaceC3045p
    public InterfaceC3034e d(int... iArr) throws T2.a {
        l();
        return new b(m(p(iArr), null));
    }

    @Override // z3.InterfaceC3029I
    public void e(C3032c c3032c) throws T2.a {
        l();
        try {
            s(c3032c, this.f52707c.getWritableDatabase());
        } catch (SQLiteException e9) {
            throw new T2.a(e9);
        }
    }

    @Override // z3.InterfaceC3029I
    public void f() throws T2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 5);
            contentValues.put("failure_reason", (Integer) 0);
            this.f52707c.getWritableDatabase().update(this.f52706b, contentValues, null, null);
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    @Override // z3.InterfaceC3029I
    public void g() throws T2.a {
        l();
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("state", (Integer) 0);
            this.f52707c.getWritableDatabase().update(this.f52706b, contentValues, "state = 2", null);
        } catch (SQLException e9) {
            throw new T2.a(e9);
        }
    }

    @Override // z3.InterfaceC3045p
    public C3032c h(String str) throws T2.a {
        l();
        try {
            Cursor cursorM = m("id = ?", new String[]{str});
            try {
                if (cursorM.getCount() == 0) {
                    cursorM.close();
                    return null;
                }
                cursorM.moveToNext();
                C3032c c3032cN = n(cursorM);
                cursorM.close();
                return c3032cN;
            } finally {
            }
        } catch (SQLiteException e9) {
            throw new T2.a(e9);
        }
        throw new T2.a(e9);
    }

    public final void l() {
        synchronized (this.f52708d) {
            if (this.f52709e) {
                return;
            }
            try {
                int iB = T2.e.b(this.f52707c.getReadableDatabase(), 0, this.f52705a);
                if (iB != 3) {
                    SQLiteDatabase writableDatabase = this.f52707c.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        T2.e.d(writableDatabase, 0, this.f52705a, 3);
                        List listR = iB == 2 ? r(writableDatabase) : new ArrayList();
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + this.f52706b);
                        writableDatabase.execSQL("CREATE TABLE " + this.f52706b + " (id TEXT PRIMARY KEY NOT NULL,mime_type TEXT,uri TEXT NOT NULL,stream_keys TEXT NOT NULL,custom_cache_key TEXT,data BLOB NOT NULL,state INTEGER NOT NULL,start_time_ms INTEGER NOT NULL,update_time_ms INTEGER NOT NULL,content_length INTEGER NOT NULL,stop_reason INTEGER NOT NULL,failure_reason INTEGER NOT NULL,percent_downloaded REAL NOT NULL,bytes_downloaded INTEGER NOT NULL,key_set_id BLOB NOT NULL)");
                        Iterator it = listR.iterator();
                        while (it.hasNext()) {
                            s((C3032c) it.next(), writableDatabase);
                        }
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                this.f52709e = true;
            } catch (SQLException e9) {
                throw new T2.a(e9);
            }
        }
    }

    public final Cursor m(String str, String[] strArr) throws T2.a {
        try {
            return this.f52707c.getReadableDatabase().query(this.f52706b, f52704g, str, strArr, null, null, "start_time_ms ASC");
        } catch (SQLiteException e9) {
            throw new T2.a(e9);
        }
    }

    public final List r(SQLiteDatabase sQLiteDatabase) {
        ArrayList arrayList = new ArrayList();
        if (!k0.o1(sQLiteDatabase, this.f52706b)) {
            return arrayList;
        }
        Cursor cursorQuery = sQLiteDatabase.query(this.f52706b, new String[]{Name.MARK, ChartFactory.TITLE, "uri", "stream_keys", "custom_cache_key", "data", "state", "start_time_ms", "update_time_ms", "content_length", "stop_reason", "failure_reason", "percent_downloaded", "bytes_downloaded"}, null, null, null, null, null);
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(o(cursorQuery));
            } finally {
            }
        }
        cursorQuery.close();
        return arrayList;
    }

    public final void s(C3032c c3032c, SQLiteDatabase sQLiteDatabase) {
        byte[] bArr = c3032c.f52714a.f52805f;
        if (bArr == null) {
            bArr = k0.f39782f;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(Name.MARK, c3032c.f52714a.f52801a);
        contentValues.put(AppSyncMutationsSqlHelper.COLUMN_MIME_TYPE, c3032c.f52714a.f52803d);
        contentValues.put("uri", c3032c.f52714a.f52802c.toString());
        contentValues.put("stream_keys", k(c3032c.f52714a.f52804e));
        contentValues.put("custom_cache_key", c3032c.f52714a.f52806g);
        contentValues.put("data", c3032c.f52714a.f52807h);
        contentValues.put("state", Integer.valueOf(c3032c.f52715b));
        contentValues.put("start_time_ms", Long.valueOf(c3032c.f52716c));
        contentValues.put("update_time_ms", Long.valueOf(c3032c.f52717d));
        contentValues.put("content_length", Long.valueOf(c3032c.f52718e));
        contentValues.put("stop_reason", Integer.valueOf(c3032c.f52719f));
        contentValues.put("failure_reason", Integer.valueOf(c3032c.f52720g));
        contentValues.put("percent_downloaded", Float.valueOf(c3032c.b()));
        contentValues.put("bytes_downloaded", Long.valueOf(c3032c.a()));
        contentValues.put("key_set_id", bArr);
        sQLiteDatabase.replaceOrThrow(this.f52706b, null, contentValues);
    }
}
