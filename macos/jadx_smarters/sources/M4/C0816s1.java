package M4;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcel;

/* JADX INFO: renamed from: M4.s1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0816s1 extends G1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0810r1 f5052c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5053d;

    public C0816s1(C0776l2 c0776l2) {
        super(c0776l2);
        Context contextC = this.f4245a.c();
        this.f4245a.z();
        this.f5052c = new C0810r1(this, contextC, "google_app_measurement_local.db");
    }

    @Override // M4.G1
    public final boolean n() {
        return false;
    }

    public final SQLiteDatabase o() {
        if (this.f5053d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f5052c.getWritableDatabase();
        if (writableDatabase != null) {
            return writableDatabase;
        }
        this.f5053d = true;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x023d A[PHI: r9 r15
      0x023d: PHI (r9v3 int) = (r9v1 int), (r9v1 int), (r9v4 int) binds: [B:147:0x0229, B:163:0x0258, B:156:0x023b] A[DONT_GENERATE, DONT_INLINE]
      0x023d: PHI (r15v7 android.database.sqlite.SQLiteDatabase) = 
      (r15v5 android.database.sqlite.SQLiteDatabase)
      (r15v6 android.database.sqlite.SQLiteDatabase)
      (r15v8 android.database.sqlite.SQLiteDatabase)
     binds: [B:147:0x0229, B:163:0x0258, B:156:0x023b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0209 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x01ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x025b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:208:0x025b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List p(int r23) {
        /*
            Method dump skipped, instruction units count: 635
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0816s1.p(int):java.util.List");
    }

    public final void q() {
        int iDelete;
        h();
        try {
            SQLiteDatabase sQLiteDatabaseO = o();
            if (sQLiteDatabaseO == null || (iDelete = sQLiteDatabaseO.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f4245a.d().v().b("Reset local analytics data. records", Integer.valueOf(iDelete));
        } catch (SQLiteException e9) {
            this.f4245a.d().r().b("Error resetting local analytics data. error", e9);
        }
    }

    public final boolean r() {
        return x(3, new byte[0]);
    }

    public final boolean s() {
        Context contextC = this.f4245a.c();
        this.f4245a.z();
        return contextC.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0069 A[PHI: r4
      0x0069: PHI (r4v4 int) = (r4v1 int), (r4v2 int), (r4v1 int) binds: [B:35:0x007c, B:32:0x0067, B:29:0x0060] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean t() {
        /*
            r10 = this;
            java.lang.String r0 = "Error deleting app launch break from local database"
            r10.h()
            boolean r1 = r10.f5053d
            r2 = 0
            if (r1 == 0) goto Lb
            return r2
        Lb:
            boolean r1 = r10.s()
            if (r1 == 0) goto L97
            r1 = 5
            r3 = 0
            r4 = 5
        L14:
            if (r3 >= r1) goto L88
            r5 = 0
            r6 = 1
            android.database.sqlite.SQLiteDatabase r5 = r10.o()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            if (r5 != 0) goto L27
            r10.f5053d = r6     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            return r2
        L21:
            r0 = move-exception
            goto L82
        L23:
            r7 = move-exception
            goto L44
        L25:
            r7 = move-exception
            goto L6d
        L27:
            r5.beginTransaction()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String r7 = "messages"
            java.lang.String r8 = "type == ?"
            r9 = 3
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            java.lang.String[] r9 = new java.lang.String[]{r9}     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.delete(r7, r8, r9)     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.endTransaction()     // Catch: java.lang.Throwable -> L21 android.database.sqlite.SQLiteException -> L23 android.database.sqlite.SQLiteFullException -> L25 android.database.sqlite.SQLiteDatabaseLockedException -> L61
            r5.close()
            return r6
        L44:
            if (r5 == 0) goto L4f
            boolean r8 = r5.inTransaction()     // Catch: java.lang.Throwable -> L21
            if (r8 == 0) goto L4f
            r5.endTransaction()     // Catch: java.lang.Throwable -> L21
        L4f:
            M4.l2 r8 = r10.f4245a     // Catch: java.lang.Throwable -> L21
            M4.z1 r8 = r8.d()     // Catch: java.lang.Throwable -> L21
            M4.x1 r8 = r8.r()     // Catch: java.lang.Throwable -> L21
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L21
            r10.f5053d = r6     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L7f
            goto L69
        L61:
            long r6 = (long) r4     // Catch: java.lang.Throwable -> L21
            android.os.SystemClock.sleep(r6)     // Catch: java.lang.Throwable -> L21
            int r4 = r4 + 20
            if (r5 == 0) goto L7f
        L69:
            r5.close()
            goto L7f
        L6d:
            M4.l2 r8 = r10.f4245a     // Catch: java.lang.Throwable -> L21
            M4.z1 r8 = r8.d()     // Catch: java.lang.Throwable -> L21
            M4.x1 r8 = r8.r()     // Catch: java.lang.Throwable -> L21
            r8.b(r0, r7)     // Catch: java.lang.Throwable -> L21
            r10.f5053d = r6     // Catch: java.lang.Throwable -> L21
            if (r5 == 0) goto L7f
            goto L69
        L7f:
            int r3 = r3 + 1
            goto L14
        L82:
            if (r5 == 0) goto L87
            r5.close()
        L87:
            throw r0
        L88:
            M4.l2 r0 = r10.f4245a
            M4.z1 r0 = r0.d()
            M4.x1 r0 = r0.w()
            java.lang.String r1 = "Error deleting app launch break from local database in reasonable time"
            r0.a(r1)
        L97:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0816s1.t():boolean");
    }

    public final boolean u(C0725d c0725d) {
        byte[] bArrE0 = this.f4245a.N().e0(c0725d);
        if (bArrE0.length <= 131072) {
            return x(2, bArrE0);
        }
        this.f4245a.d().t().a("Conditional user property too long for local database. Sending directly to service");
        return false;
    }

    public final boolean v(C0832v c0832v) {
        Parcel parcelObtain = Parcel.obtain();
        C0838w.a(c0832v, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(0, bArrMarshall);
        }
        this.f4245a.d().t().a("Event is too long for local database. Sending event directly to service");
        return false;
    }

    public final boolean w(V4 v42) {
        Parcel parcelObtain = Parcel.obtain();
        W4.a(v42, parcelObtain, 0);
        byte[] bArrMarshall = parcelObtain.marshall();
        parcelObtain.recycle();
        if (bArrMarshall.length <= 131072) {
            return x(1, bArrMarshall);
        }
        this.f4245a.d().t().a("User property too long for local database. Sending directly to service");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f4 A[PHI: r8
      0x00f4: PHI (r8v3 android.database.sqlite.SQLiteDatabase) = (r8v2 android.database.sqlite.SQLiteDatabase), (r8v4 android.database.sqlite.SQLiteDatabase) binds: [B:60:0x00f2, B:76:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0135  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v5, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v6, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean x(int r17, byte[] r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.C0816s1.x(int, byte[]):boolean");
    }
}
