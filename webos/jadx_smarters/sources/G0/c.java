package G0;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public interface c extends Closeable {

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f2136a;

        public a(int i9) {
            this.f2136a = i9;
        }

        public final void a(String str) {
            if (str.equalsIgnoreCase(":memory:") || str.trim().length() == 0) {
                return;
            }
            Log.w("SupportSQLite", "deleting the database file: " + str);
            try {
                SQLiteDatabase.deleteDatabase(new File(str));
            } catch (Exception e9) {
                Log.w("SupportSQLite", "delete failed: ", e9);
            }
        }

        public void b(G0.b bVar) {
        }

        public void c(G0.b bVar) {
            Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + bVar.getPath());
            if (!bVar.isOpen()) {
                a(bVar.getPath());
                return;
            }
            List listB = null;
            try {
                try {
                    listB = bVar.B();
                } catch (SQLiteException unused) {
                }
                try {
                    bVar.close();
                } catch (IOException unused2) {
                }
            } finally {
                if (listB != null) {
                    Iterator it = listB.iterator();
                    while (it.hasNext()) {
                        a((String) ((Pair) it.next()).second);
                    }
                } else {
                    a(bVar.getPath());
                }
            }
        }

        public abstract void d(G0.b bVar);

        public abstract void e(G0.b bVar, int i9, int i10);

        public void f(G0.b bVar) {
        }

        public abstract void g(G0.b bVar, int i9, int i10);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f2137a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f2138b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f2139c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f2140d;

        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Context f2141a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f2142b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public a f2143c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f2144d;

            public a(Context context) {
                this.f2141a = context;
            }

            public b a() {
                if (this.f2143c == null) {
                    throw new IllegalArgumentException("Must set a callback to create the configuration.");
                }
                if (this.f2141a == null) {
                    throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
                }
                if (this.f2144d && TextUtils.isEmpty(this.f2142b)) {
                    throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
                }
                return new b(this.f2141a, this.f2142b, this.f2143c, this.f2144d);
            }

            public a b(a aVar) {
                this.f2143c = aVar;
                return this;
            }

            public a c(String str) {
                this.f2142b = str;
                return this;
            }

            public a d(boolean z9) {
                this.f2144d = z9;
                return this;
            }
        }

        public b(Context context, String str, a aVar, boolean z9) {
            this.f2137a = context;
            this.f2138b = str;
            this.f2139c = aVar;
            this.f2140d = z9;
        }

        public static a a(Context context) {
            return new a(context);
        }
    }

    /* JADX INFO: renamed from: G0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0032c {
        c a(b bVar);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    String getDatabaseName();

    G0.b getWritableDatabase();

    void setWriteAheadLoggingEnabled(boolean z9);
}
