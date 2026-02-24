package U7;

import android.database.Cursor;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {
    public static void a(Cursor cursor) {
        if (cursor == null || cursor.isClosed()) {
            return;
        }
        cursor.close();
    }
}
