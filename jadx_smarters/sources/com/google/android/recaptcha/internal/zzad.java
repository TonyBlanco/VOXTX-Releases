package com.google.android.recaptcha.internal;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g;
import l8.j;
import l8.k;
import l8.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes3.dex */
public final class zzad extends SQLiteOpenHelper {

    @NotNull
    public static final zzab zza = new zzab(null);

    @Nullable
    private static zzad zzb;

    public /* synthetic */ zzad(Context context, g gVar) {
        super(context, "cesdb", (SQLiteDatabase.CursorFactory) null, 1);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@NotNull SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@NotNull SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS ce");
        sQLiteDatabase.execSQL("CREATE TABLE ce (id INTEGER PRIMARY KEY,ts BIGINT NOT NULL,ss TEXT NOT NULL)");
    }

    public final int zza(@NotNull List list) {
        if (list.isEmpty()) {
            return 0;
        }
        return getWritableDatabase().delete("ce", "id IN ".concat(String.valueOf(s.A(list, ", ", "(", ")", 0, null, zzac.zza, 24, null))), null);
    }

    public final int zzb() {
        Cursor cursorRawQuery = getReadableDatabase().rawQuery("SELECT COUNT(*) FROM ce", null);
        try {
            if (cursorRawQuery.moveToNext()) {
                return cursorRawQuery.getInt(0);
            }
            return -1;
        } catch (Exception unused) {
            return -1;
        } finally {
            cursorRawQuery.close();
        }
    }

    @NotNull
    public final List zzd() {
        Cursor cursorQuery = getReadableDatabase().query("ce", null, null, null, null, null, "ts ASC");
        ArrayList arrayList = new ArrayList();
        while (cursorQuery.moveToNext()) {
            try {
                arrayList.add(new zzae(cursorQuery.getString(cursorQuery.getColumnIndexOrThrow("ss")), cursorQuery.getLong(cursorQuery.getColumnIndexOrThrow("ts")), cursorQuery.getInt(cursorQuery.getColumnIndexOrThrow(Name.MARK))));
            } catch (Exception unused) {
                return k.f();
            } finally {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    public final boolean zzf(@NotNull zzae zzaeVar) {
        return zza(j.b(zzaeVar)) == 1;
    }
}
