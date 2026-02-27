package K2;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class U extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f3623d = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f3624e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f3625f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f3626g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f3627h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f3628i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f3629j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final List f3630k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f3631a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3632c;

    public interface a {
        void a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        a aVar = new a() { // from class: K2.O
            @Override // K2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.i(sQLiteDatabase);
            }
        };
        f3625f = aVar;
        a aVar2 = new a() { // from class: K2.P
            @Override // K2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.j(sQLiteDatabase);
            }
        };
        f3626g = aVar2;
        a aVar3 = new a() { // from class: K2.Q
            @Override // K2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
            }
        };
        f3627h = aVar3;
        a aVar4 = new a() { // from class: K2.S
            @Override // K2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.l(sQLiteDatabase);
            }
        };
        f3628i = aVar4;
        a aVar5 = new a() { // from class: K2.T
            @Override // K2.U.a
            public final void a(SQLiteDatabase sQLiteDatabase) {
                U.m(sQLiteDatabase);
            }
        };
        f3629j = aVar5;
        f3630k = Arrays.asList(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public U(Context context, String str, int i9) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i9);
        this.f3632c = false;
        this.f3631a = i9;
    }

    public static /* synthetic */ void i(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    public static /* synthetic */ void j(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    public static /* synthetic */ void l(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    public static /* synthetic */ void m(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f3623d);
    }

    public final void h(SQLiteDatabase sQLiteDatabase) {
        if (this.f3632c) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    public final void n(SQLiteDatabase sQLiteDatabase, int i9) {
        h(sQLiteDatabase);
        o(sQLiteDatabase, 0, i9);
    }

    public final void o(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        List list = f3630k;
        if (i10 <= list.size()) {
            while (i9 < i10) {
                ((a) f3630k.get(i9)).a(sQLiteDatabase);
                i9++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i9 + " to " + i10 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f3632c = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        n(sQLiteDatabase, this.f3631a);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        n(sQLiteDatabase, i10);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        h(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i9, int i10) {
        h(sQLiteDatabase);
        o(sQLiteDatabase, i9, i10);
    }
}
