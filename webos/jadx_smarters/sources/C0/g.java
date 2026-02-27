package C0;

import G0.c;
import android.database.Cursor;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class g extends c.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0.a f914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f917e;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f918a;

        public a(int i9) {
            this.f918a = i9;
        }

        public abstract void a(G0.b bVar);

        public abstract void b(G0.b bVar);

        public abstract void c(G0.b bVar);

        public abstract void d(G0.b bVar);

        public abstract void e(G0.b bVar);

        public abstract void f(G0.b bVar);

        public abstract b g(G0.b bVar);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f919a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f920b;

        public b(boolean z9, String str) {
            this.f919a = z9;
            this.f920b = str;
        }
    }

    public g(C0.a aVar, a aVar2, String str, String str2) {
        super(aVar2.f918a);
        this.f914b = aVar;
        this.f915c = aVar2;
        this.f916d = str;
        this.f917e = str2;
    }

    public static boolean j(G0.b bVar) {
        Cursor cursorU = bVar.U("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z9 = false;
            if (cursorU.moveToFirst()) {
                if (cursorU.getInt(0) == 0) {
                    z9 = true;
                }
            }
            return z9;
        } finally {
            cursorU.close();
        }
    }

    public static boolean k(G0.b bVar) {
        Cursor cursorU = bVar.U("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'");
        try {
            boolean z9 = false;
            if (cursorU.moveToFirst()) {
                if (cursorU.getInt(0) != 0) {
                    z9 = true;
                }
            }
            return z9;
        } finally {
            cursorU.close();
        }
    }

    @Override // G0.c.a
    public void b(G0.b bVar) {
        super.b(bVar);
    }

    @Override // G0.c.a
    public void d(G0.b bVar) {
        boolean zJ = j(bVar);
        this.f915c.a(bVar);
        if (!zJ) {
            b bVarG = this.f915c.g(bVar);
            if (!bVarG.f919a) {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f920b);
            }
        }
        l(bVar);
        this.f915c.c(bVar);
    }

    @Override // G0.c.a
    public void e(G0.b bVar, int i9, int i10) {
        g(bVar, i9, i10);
    }

    @Override // G0.c.a
    public void f(G0.b bVar) {
        super.f(bVar);
        h(bVar);
        this.f915c.d(bVar);
        this.f914b = null;
    }

    @Override // G0.c.a
    public void g(G0.b bVar, int i9, int i10) {
        List listC;
        C0.a aVar = this.f914b;
        if (aVar == null || (listC = aVar.f871d.c(i9, i10)) == null) {
            C0.a aVar2 = this.f914b;
            if (aVar2 != null && !aVar2.a(i9, i10)) {
                this.f915c.b(bVar);
                this.f915c.a(bVar);
                return;
            }
            throw new IllegalStateException("A migration from " + i9 + " to " + i10 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods.");
        }
        this.f915c.f(bVar);
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            ((D0.a) it.next()).a(bVar);
        }
        b bVarG = this.f915c.g(bVar);
        if (bVarG.f919a) {
            this.f915c.e(bVar);
            l(bVar);
        } else {
            throw new IllegalStateException("Migration didn't properly handle: " + bVarG.f920b);
        }
    }

    public final void h(G0.b bVar) {
        if (!k(bVar)) {
            b bVarG = this.f915c.g(bVar);
            if (bVarG.f919a) {
                this.f915c.e(bVar);
                l(bVar);
                return;
            } else {
                throw new IllegalStateException("Pre-packaged database has an invalid schema: " + bVarG.f920b);
            }
        }
        Cursor cursorD = bVar.D(new G0.a("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
        try {
            String string = cursorD.moveToFirst() ? cursorD.getString(0) : null;
            cursorD.close();
            if (!this.f916d.equals(string) && !this.f917e.equals(string)) {
                throw new IllegalStateException("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number.");
            }
        } catch (Throwable th) {
            cursorD.close();
            throw th;
        }
    }

    public final void i(G0.b bVar) {
        bVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
    }

    public final void l(G0.b bVar) {
        i(bVar);
        bVar.C(f.a(this.f916d));
    }
}
