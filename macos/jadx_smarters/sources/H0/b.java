package H0;

import G0.c;
import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.io.File;

/* JADX INFO: loaded from: classes.dex */
public class b implements G0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2392a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f2393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final c.a f2394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Object f2396f = new Object();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public a f2397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f2398h;

    public static class a extends SQLiteOpenHelper {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H0.a[] f2399a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c.a f2400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f2401d;

        /* JADX INFO: renamed from: H0.b$a$a, reason: collision with other inner class name */
        public class C0043a implements DatabaseErrorHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ c.a f2402a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ H0.a[] f2403b;

            public C0043a(c.a aVar, H0.a[] aVarArr) {
                this.f2402a = aVar;
                this.f2403b = aVarArr;
            }

            @Override // android.database.DatabaseErrorHandler
            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
                this.f2402a.c(a.c(this.f2403b, sQLiteDatabase));
            }
        }

        public a(Context context, String str, H0.a[] aVarArr, c.a aVar) {
            super(context, str, null, aVar.f2136a, new C0043a(aVar, aVarArr));
            this.f2400c = aVar;
            this.f2399a = aVarArr;
        }

        public static H0.a c(H0.a[] aVarArr, SQLiteDatabase sQLiteDatabase) {
            H0.a aVar = aVarArr[0];
            if (aVar == null || !aVar.a(sQLiteDatabase)) {
                aVarArr[0] = new H0.a(sQLiteDatabase);
            }
            return aVarArr[0];
        }

        public H0.a a(SQLiteDatabase sQLiteDatabase) {
            return c(this.f2399a, sQLiteDatabase);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
        public synchronized void close() {
            super.close();
            this.f2399a[0] = null;
        }

        public synchronized G0.b d() {
            this.f2401d = false;
            SQLiteDatabase writableDatabase = super.getWritableDatabase();
            if (!this.f2401d) {
                return a(writableDatabase);
            }
            close();
            return d();
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onConfigure(SQLiteDatabase sQLiteDatabase) {
            this.f2400c.b(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onCreate(SQLiteDatabase sQLiteDatabase) {
            this.f2400c.d(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
            this.f2401d = true;
            this.f2400c.e(a(sQLiteDatabase), i9, i10);
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onOpen(SQLiteDatabase sQLiteDatabase) {
            if (this.f2401d) {
                return;
            }
            this.f2400c.f(a(sQLiteDatabase));
        }

        @Override // android.database.sqlite.SQLiteOpenHelper
        public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
            this.f2401d = true;
            this.f2400c.g(a(sQLiteDatabase), i9, i10);
        }
    }

    public b(Context context, String str, c.a aVar, boolean z9) {
        this.f2392a = context;
        this.f2393c = str;
        this.f2394d = aVar;
        this.f2395e = z9;
    }

    public final a a() {
        a aVar;
        synchronized (this.f2396f) {
            try {
                if (this.f2397g == null) {
                    H0.a[] aVarArr = new H0.a[1];
                    if (Build.VERSION.SDK_INT < 23 || this.f2393c == null || !this.f2395e) {
                        this.f2397g = new a(this.f2392a, this.f2393c, aVarArr, this.f2394d);
                    } else {
                        this.f2397g = new a(this.f2392a, new File(this.f2392a.getNoBackupFilesDir(), this.f2393c).getAbsolutePath(), aVarArr, this.f2394d);
                    }
                    this.f2397g.setWriteAheadLoggingEnabled(this.f2398h);
                }
                aVar = this.f2397g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return aVar;
    }

    @Override // G0.c, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        a().close();
    }

    @Override // G0.c
    public String getDatabaseName() {
        return this.f2393c;
    }

    @Override // G0.c
    public G0.b getWritableDatabase() {
        return a().d();
    }

    @Override // G0.c
    public void setWriteAheadLoggingEnabled(boolean z9) {
        synchronized (this.f2396f) {
            try {
                a aVar = this.f2397g;
                if (aVar != null) {
                    aVar.setWriteAheadLoggingEnabled(z9);
                }
                this.f2398h = z9;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
