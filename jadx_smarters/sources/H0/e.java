package H0;

import G0.f;
import android.database.sqlite.SQLiteStatement;

/* JADX INFO: loaded from: classes.dex */
public class e extends d implements f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SQLiteStatement f2405c;

    public e(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.f2405c = sQLiteStatement;
    }

    @Override // G0.f
    public int E() {
        return this.f2405c.executeUpdateDelete();
    }

    @Override // G0.f
    public long O() {
        return this.f2405c.executeInsert();
    }
}
