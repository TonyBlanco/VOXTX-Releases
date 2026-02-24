package R7;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i {
    public final void a(SQLiteDatabase db) {
        l.e(db, "db");
        String strL = l.l("_id,name", ",notification_id");
        String strL2 = l.l("_id,name", ",channel_influence_id");
        try {
            try {
                db.execSQL("BEGIN TRANSACTION;");
                db.execSQL("CREATE TABLE cached_unique_outcome (_id INTEGER PRIMARY KEY,channel_influence_id TEXT,channel_type TEXT,name TEXT);");
                db.execSQL("INSERT INTO cached_unique_outcome(" + strL2 + ") SELECT " + strL + " FROM cached_unique_outcome_notification;");
                StringBuilder sb = new StringBuilder();
                sb.append("UPDATE cached_unique_outcome SET channel_type = '");
                sb.append(P7.b.NOTIFICATION);
                sb.append("';");
                db.execSQL(sb.toString());
                db.execSQL("DROP TABLE cached_unique_outcome_notification;");
            } catch (SQLiteException e9) {
                e9.printStackTrace();
            }
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void b(SQLiteDatabase db) {
        l.e(db, "db");
        try {
            try {
                db.execSQL("BEGIN TRANSACTION;");
                db.execSQL("CREATE TEMPORARY TABLE outcome_backup(_id,session,notification_ids,name,timestamp);");
                db.execSQL("INSERT INTO outcome_backup SELECT _id,session,notification_ids,name,timestamp FROM outcome;");
                db.execSQL("DROP TABLE outcome;");
                db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,session TEXT,notification_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                db.execSQL("INSERT INTO outcome (_id,session,notification_ids,name,timestamp, weight) SELECT _id,session,notification_ids,name,timestamp, 0 FROM outcome_backup;");
                db.execSQL("DROP TABLE outcome_backup;");
            } catch (SQLiteException e9) {
                e9.printStackTrace();
            }
        } finally {
            db.execSQL("COMMIT;");
        }
    }

    public final void c(SQLiteDatabase db) {
        l.e(db, "db");
        String strL = l.l("_id,name,timestamp,notification_ids,weight", ",session");
        String strL2 = l.l("_id,name,timestamp,notification_ids,weight", ",notification_influence_type");
        try {
            try {
                db.execSQL("BEGIN TRANSACTION;");
                db.execSQL("ALTER TABLE outcome RENAME TO outcome_aux;");
                db.execSQL("CREATE TABLE outcome (_id INTEGER PRIMARY KEY,notification_influence_type TEXT,iam_influence_type TEXT,notification_ids TEXT,iam_ids TEXT,name TEXT,timestamp TIMESTAMP,weight FLOAT);");
                db.execSQL("INSERT INTO outcome(" + strL2 + ") SELECT " + strL + " FROM outcome_aux;");
                StringBuilder sb = new StringBuilder();
                sb.append("DROP TABLE ");
                sb.append("outcome_aux");
                sb.append(';');
                db.execSQL(sb.toString());
            } catch (SQLiteException e9) {
                e9.printStackTrace();
            }
        } finally {
            db.execSQL("COMMIT;");
        }
    }
}
