package M4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: renamed from: M4.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0810r1 extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0816s1 f5037a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0810r1(C0816s1 c0816s1, Context context, String str) {
        super(context, "google_app_measurement_local.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f5037a = c0816s1;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        try {
            return super.getWritableDatabase();
        } catch (SQLiteDatabaseLockedException e9) {
            throw e9;
        } catch (SQLiteException unused) {
            this.f5037a.f4245a.d().r().a("Opening the local database failed, dropping and recreating it");
            this.f5037a.f4245a.z();
            if (!this.f5037a.f4245a.c().getDatabasePath("google_app_measurement_local.db").delete()) {
                this.f5037a.f4245a.d().r().b("Failed to delete corrupted local db file", "google_app_measurement_local.db");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException e10) {
                this.f5037a.f4245a.d().r().b("Failed to open local database. Events will bypass local storage", e10);
                return null;
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        AbstractC0779m.b(this.f5037a.f4245a.d(), sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        AbstractC0779m.a(this.f5037a.f4245a.d(), sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
    }
}
