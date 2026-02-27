package E0;

import android.database.Cursor;
import android.database.MatrixCursor;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {
    public static Cursor a(Cursor cursor) {
        try {
            MatrixCursor matrixCursor = new MatrixCursor(cursor.getColumnNames(), cursor.getCount());
            while (cursor.moveToNext()) {
                Object[] objArr = new Object[cursor.getColumnCount()];
                for (int i9 = 0; i9 < cursor.getColumnCount(); i9++) {
                    int type = cursor.getType(i9);
                    if (type == 0) {
                        objArr[i9] = null;
                    } else if (type == 1) {
                        objArr[i9] = Long.valueOf(cursor.getLong(i9));
                    } else if (type == 2) {
                        objArr[i9] = Double.valueOf(cursor.getDouble(i9));
                    } else if (type == 3) {
                        objArr[i9] = cursor.getString(i9);
                    } else {
                        if (type != 4) {
                            throw new IllegalStateException();
                        }
                        objArr[i9] = cursor.getBlob(i9);
                    }
                }
                matrixCursor.addRow(objArr);
            }
            cursor.close();
            return matrixCursor;
        } catch (Throwable th) {
            cursor.close();
            throw th;
        }
    }

    public static int b(Cursor cursor, String str) {
        int columnIndex = cursor.getColumnIndex(str);
        if (columnIndex >= 0) {
            return columnIndex;
        }
        return cursor.getColumnIndexOrThrow("`" + str + "`");
    }
}
