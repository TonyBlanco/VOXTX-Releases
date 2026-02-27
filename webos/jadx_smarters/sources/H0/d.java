package H0;

import android.database.sqlite.SQLiteProgram;

/* JADX INFO: loaded from: classes.dex */
public class d implements G0.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SQLiteProgram f2404a;

    public d(SQLiteProgram sQLiteProgram) {
        this.f2404a = sQLiteProgram;
    }

    @Override // G0.d
    public void A(int i9, long j9) {
        this.f2404a.bindLong(i9, j9);
    }

    @Override // G0.d
    public void S(int i9, byte[] bArr) {
        this.f2404a.bindBlob(i9, bArr);
    }

    @Override // G0.d
    public void X(int i9) {
        this.f2404a.bindNull(i9);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f2404a.close();
    }

    @Override // G0.d
    public void f(int i9, double d9) {
        this.f2404a.bindDouble(i9, d9);
    }

    @Override // G0.d
    public void x(int i9, String str) {
        this.f2404a.bindString(i9, str);
    }
}
