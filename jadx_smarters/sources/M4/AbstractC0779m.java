package M4;

import android.database.sqlite.SQLiteDatabase;
import java.io.File;

/* JADX INFO: renamed from: M4.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC0779m {
    /* JADX WARN: Removed duplicated region for block: B:49:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(M4.C0858z1 r9, android.database.sqlite.SQLiteDatabase r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String[] r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.AbstractC0779m.a(M4.z1, android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, java.lang.String, java.lang.String[]):void");
    }

    public static void b(C0858z1 c0858z1, SQLiteDatabase sQLiteDatabase) {
        if (c0858z1 == null) {
            throw new IllegalArgumentException("Monitor must not be null");
        }
        File file = new File(sQLiteDatabase.getPath());
        if (!file.setReadable(false, false)) {
            c0858z1.w().a("Failed to turn off database read permission");
        }
        if (!file.setWritable(false, false)) {
            c0858z1.w().a("Failed to turn off database write permission");
        }
        if (!file.setReadable(true, true)) {
            c0858z1.w().a("Failed to turn on database read permission for owner");
        }
        if (file.setWritable(true, true)) {
            return;
        }
        c0858z1.w().a("Failed to turn on database write permission for owner");
    }
}
