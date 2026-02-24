package A1;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.amazonaws.mobileconnectors.appsync.cache.normalized.sql.AppSyncSqlHelper;
import java.io.IOException;
import java.util.Collections;
import java.util.Set;
import x1.InterfaceC2951b;
import x1.g;
import y1.C2982a;
import z1.AbstractC3007f;
import z1.C3003b;
import z1.C3010i;
import z1.C3011j;

/* JADX INFO: loaded from: classes.dex */
public final class a extends AbstractC3007f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f46j = String.format("INSERT INTO %s (%s,%s) VALUES (?,?)", AppSyncSqlHelper.TABLE_RECORDS, "key", "record");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f47k = String.format("UPDATE %s SET %s=?, %s=? WHERE %s=?", AppSyncSqlHelper.TABLE_RECORDS, "key", "record", "key");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f48l = String.format("DELETE FROM %s WHERE %s=?", AppSyncSqlHelper.TABLE_RECORDS, "key");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f49m = String.format("DELETE FROM %s", AppSyncSqlHelper.TABLE_RECORDS);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SQLiteDatabase f50b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteOpenHelper f51c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String[] f52d = {"_id", "key", "record"};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final SQLiteStatement f53e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final SQLiteStatement f54f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final SQLiteStatement f55g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final SQLiteStatement f56h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3011j f57i;

    /* JADX INFO: renamed from: A1.a$a, reason: collision with other inner class name */
    public class C0000a implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f58a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2982a f59b;

        public C0000a(String str, C2982a c2982a) {
            this.f58a = str;
            this.f59b = c2982a;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x1.d apply(AbstractC3007f abstractC3007f) {
            return x1.d.d(abstractC3007f.c(this.f58a, this.f59b));
        }
    }

    public class b implements InterfaceC2951b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2982a f61a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f62b;

        public b(C2982a c2982a, String str) {
            this.f61a = c2982a;
            this.f62b = str;
        }

        @Override // x1.InterfaceC2951b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(C3010i c3010i) {
            if (this.f61a.a("evict-after-read")) {
                a.this.l(this.f62b);
            }
        }
    }

    public class c implements InterfaceC2951b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3010i f64a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2982a f65b;

        public c(C3010i c3010i, C2982a c2982a) {
            this.f64a = c3010i;
            this.f65b = c2982a;
        }

        @Override // x1.InterfaceC2951b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(AbstractC3007f abstractC3007f) {
            abstractC3007f.f(this.f64a, this.f65b);
        }
    }

    public class d implements InterfaceC2951b {
        public d() {
        }

        @Override // x1.InterfaceC2951b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(AbstractC3007f abstractC3007f) {
            abstractC3007f.b();
        }
    }

    public class e implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3003b f68a;

        public e(C3003b c3003b) {
            this.f68a = c3003b;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(AbstractC3007f abstractC3007f) {
            return Boolean.valueOf(abstractC3007f.h(this.f68a));
        }
    }

    public a(C3011j c3011j, SQLiteOpenHelper sQLiteOpenHelper) {
        this.f57i = c3011j;
        this.f51c = sQLiteOpenHelper;
        SQLiteDatabase writableDatabase = sQLiteOpenHelper.getWritableDatabase();
        this.f50b = writableDatabase;
        this.f53e = writableDatabase.compileStatement(f46j);
        this.f54f = this.f50b.compileStatement(f47k);
        this.f55g = this.f50b.compileStatement(f48l);
        this.f56h = this.f50b.compileStatement(f49m);
    }

    @Override // z1.AbstractC3007f
    public void b() {
        g().b(new d());
        i();
    }

    @Override // z1.AbstractC3007f
    public C3010i c(String str, C2982a c2982a) {
        return (C3010i) m(str).b(new b(c2982a, str)).j(g().c(new C0000a(str, c2982a))).k();
    }

    @Override // z1.AbstractC3007f
    public Set f(C3010i c3010i, C2982a c2982a) {
        if (c2982a.a("do-not-store")) {
            return Collections.emptySet();
        }
        g().b(new c(c3010i, c2982a));
        x1.d dVarM = m(c3010i.g());
        if (!dVarM.f()) {
            j(c3010i.g(), this.f57i.d(c3010i.e()));
            return Collections.emptySet();
        }
        C3010i c3010i2 = (C3010i) dVarM.e();
        Set setH = c3010i2.h(c3010i);
        if (setH.isEmpty()) {
            return setH;
        }
        n(c3010i2.g(), this.f57i.d(c3010i2.e()));
        return setH;
    }

    @Override // z1.AbstractC3007f
    public boolean h(C3003b c3003b) {
        g.c(c3003b, "cacheKey == null");
        return l(c3003b.b()) | ((Boolean) g().g(new e(c3003b)).i(Boolean.FALSE)).booleanValue();
    }

    public void i() {
        this.f56h.execute();
    }

    public long j(String str, String str2) {
        this.f53e.bindString(1, str);
        this.f53e.bindString(2, str2);
        return this.f53e.executeInsert();
    }

    public C3010i k(Cursor cursor) {
        return C3010i.b(cursor.getString(1)).b(this.f57i.b(cursor.getString(2))).c();
    }

    public boolean l(String str) {
        this.f55g.bindString(1, str);
        return this.f55g.executeUpdateDelete() > 0;
    }

    public x1.d m(String str) {
        Cursor cursorQuery = this.f50b.query(AppSyncSqlHelper.TABLE_RECORDS, this.f52d, "key = ?", new String[]{str}, null, null, null);
        try {
            if (cursorQuery != null) {
                try {
                    if (cursorQuery.moveToFirst()) {
                        x1.d dVarH = x1.d.h(k(cursorQuery));
                        if (!cursorQuery.isClosed()) {
                            cursorQuery.close();
                        }
                        return dVarH;
                    }
                } catch (SQLiteException | IOException unused) {
                    x1.d dVarA = x1.d.a();
                    if (cursorQuery != null && !cursorQuery.isClosed()) {
                        cursorQuery.close();
                    }
                    return dVarA;
                }
            }
            x1.d dVarA2 = x1.d.a();
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            return dVarA2;
        } catch (Throwable th) {
            if (cursorQuery != null && !cursorQuery.isClosed()) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public void n(String str, String str2) {
        this.f54f.bindString(1, str);
        this.f54f.bindString(2, str2);
        this.f54f.bindString(3, str);
        this.f54f.executeInsert();
    }
}
