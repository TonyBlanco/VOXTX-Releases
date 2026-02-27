package H0;

import G0.f;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import android.os.CancellationSignal;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements G0.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f2385c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String[] f2386d = new String[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteDatabase f2387a;

    /* JADX INFO: renamed from: H0.a$a, reason: collision with other inner class name */
    public class C0042a implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G0.e f2388a;

        public C0042a(G0.e eVar) {
            this.f2388a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f2388a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public class b implements SQLiteDatabase.CursorFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ G0.e f2390a;

        public b(G0.e eVar) {
            this.f2390a = eVar;
        }

        @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
        public Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
            this.f2390a.c(new d(sQLiteQuery));
            return new SQLiteCursor(sQLiteCursorDriver, str, sQLiteQuery);
        }
    }

    public a(SQLiteDatabase sQLiteDatabase) {
        this.f2387a = sQLiteDatabase;
    }

    @Override // G0.b
    public List B() {
        return this.f2387a.getAttachedDbs();
    }

    @Override // G0.b
    public void C(String str) {
        this.f2387a.execSQL(str);
    }

    @Override // G0.b
    public Cursor D(G0.e eVar) {
        return this.f2387a.rawQueryWithFactory(new C0042a(eVar), eVar.a(), f2386d, null);
    }

    @Override // G0.b
    public void G() {
        this.f2387a.setTransactionSuccessful();
    }

    @Override // G0.b
    public void H(String str, Object[] objArr) {
        this.f2387a.execSQL(str, objArr);
    }

    @Override // G0.b
    public void I() {
        this.f2387a.endTransaction();
    }

    @Override // G0.b
    public Cursor K(G0.e eVar, CancellationSignal cancellationSignal) {
        return this.f2387a.rawQueryWithFactory(new b(eVar), eVar.a(), f2386d, null, cancellationSignal);
    }

    @Override // G0.b
    public f Q(String str) {
        return new e(this.f2387a.compileStatement(str));
    }

    @Override // G0.b
    public Cursor U(String str) {
        return D(new G0.a(str));
    }

    @Override // G0.b
    public boolean Z() {
        return this.f2387a.inTransaction();
    }

    public boolean a(SQLiteDatabase sQLiteDatabase) {
        return this.f2387a == sQLiteDatabase;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2387a.close();
    }

    @Override // G0.b
    public String getPath() {
        return this.f2387a.getPath();
    }

    @Override // G0.b
    public boolean isOpen() {
        return this.f2387a.isOpen();
    }

    @Override // G0.b
    public void u() {
        this.f2387a.beginTransaction();
    }
}
