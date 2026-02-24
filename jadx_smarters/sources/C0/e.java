package C0;

import G0.c;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile G0.b f885a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Executor f886b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Executor f887c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public G0.c f888d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f890f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f891g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public List f892h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final ReentrantReadWriteLock f893i = new ReentrantReadWriteLock();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ThreadLocal f894j = new ThreadLocal();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Map f895k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.room.c f889e = e();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f896a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ArrayList f899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Executor f900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Executor f901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public c.InterfaceC0032c f902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f903h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f905j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f907l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Set f909n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Set f910o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public String f911p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public File f912q;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c f904i = c.AUTOMATIC;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f906k = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final d f908m = new d();

        public a(Context context, Class cls, String str) {
            this.f898c = context;
            this.f896a = cls;
            this.f897b = str;
        }

        public a a(b bVar) {
            if (this.f899d == null) {
                this.f899d = new ArrayList();
            }
            this.f899d.add(bVar);
            return this;
        }

        public a b(D0.a... aVarArr) {
            if (this.f910o == null) {
                this.f910o = new HashSet();
            }
            for (D0.a aVar : aVarArr) {
                this.f910o.add(Integer.valueOf(aVar.f1311a));
                this.f910o.add(Integer.valueOf(aVar.f1312b));
            }
            this.f908m.b(aVarArr);
            return this;
        }

        public a c() {
            this.f903h = true;
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x003d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0067  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x007a  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x00d4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public C0.e d() {
            /*
                Method dump skipped, instruction units count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: C0.e.a.d():C0.e");
        }

        public a e() {
            this.f906k = false;
            this.f907l = true;
            return this;
        }

        public a f(c.InterfaceC0032c interfaceC0032c) {
            this.f902g = interfaceC0032c;
            return this;
        }

        public a g(Executor executor) {
            this.f900e = executor;
            return this;
        }
    }

    public static abstract class b {
        public void a(G0.b bVar) {
        }

        public void b(G0.b bVar) {
        }

        public void c(G0.b bVar) {
        }
    }

    public enum c {
        AUTOMATIC,
        TRUNCATE,
        WRITE_AHEAD_LOGGING;

        private static boolean isLowRamDevice(ActivityManager activityManager) {
            return activityManager.isLowRamDevice();
        }

        @SuppressLint({"NewApi"})
        public c resolve(Context context) {
            if (this != AUTOMATIC) {
                return this;
            }
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            return (activityManager == null || isLowRamDevice(activityManager)) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public HashMap f913a = new HashMap();

        public final void a(D0.a aVar) {
            int i9 = aVar.f1311a;
            int i10 = aVar.f1312b;
            TreeMap treeMap = (TreeMap) this.f913a.get(Integer.valueOf(i9));
            if (treeMap == null) {
                treeMap = new TreeMap();
                this.f913a.put(Integer.valueOf(i9), treeMap);
            }
            D0.a aVar2 = (D0.a) treeMap.get(Integer.valueOf(i10));
            if (aVar2 != null) {
                Log.w("ROOM", "Overriding migration " + aVar2 + " with " + aVar);
            }
            treeMap.put(Integer.valueOf(i10), aVar);
        }

        public void b(D0.a... aVarArr) {
            for (D0.a aVar : aVarArr) {
                a(aVar);
            }
        }

        public List c(int i9, int i10) {
            if (i9 == i10) {
                return Collections.emptyList();
            }
            return d(new ArrayList(), i10 > i9, i9, i10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:27:0x0052, code lost:
        
            return r6;
         */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0016 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.util.List d(java.util.List r6, boolean r7, int r8, int r9) {
            /*
                r5 = this;
            L0:
                if (r7 == 0) goto L5
                if (r8 >= r9) goto L52
                goto L7
            L5:
                if (r8 <= r9) goto L52
            L7:
                java.util.HashMap r0 = r5.f913a
                java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
                java.lang.Object r0 = r0.get(r1)
                java.util.TreeMap r0 = (java.util.TreeMap) r0
                r1 = 0
                if (r0 != 0) goto L17
                return r1
            L17:
                if (r7 == 0) goto L1e
                java.util.NavigableSet r2 = r0.descendingKeySet()
                goto L22
            L1e:
                java.util.Set r2 = r0.keySet()
            L22:
                java.util.Iterator r2 = r2.iterator()
            L26:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L4a
                java.lang.Object r3 = r2.next()
                java.lang.Integer r3 = (java.lang.Integer) r3
                int r4 = r3.intValue()
                if (r7 == 0) goto L3d
                if (r4 > r9) goto L26
                if (r4 <= r8) goto L26
                goto L41
            L3d:
                if (r4 < r9) goto L26
                if (r4 >= r8) goto L26
            L41:
                java.lang.Object r8 = r0.get(r3)
                r6.add(r8)
                r8 = 1
                goto L4d
            L4a:
                r0 = 0
                r4 = r8
                r8 = 0
            L4d:
                if (r8 != 0) goto L50
                return r1
            L50:
                r8 = r4
                goto L0
            L52:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: C0.e.d.d(java.util.List, boolean, int, int):java.util.List");
        }
    }

    public static boolean n() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public void a() {
        if (!this.f890f && n()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public void b() {
        if (!k() && this.f894j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void c() {
        a();
        G0.b writableDatabase = this.f888d.getWritableDatabase();
        this.f889e.m(writableDatabase);
        writableDatabase.u();
    }

    public G0.f d(String str) {
        a();
        b();
        return this.f888d.getWritableDatabase().Q(str);
    }

    public abstract androidx.room.c e();

    public abstract G0.c f(C0.a aVar);

    public void g() {
        this.f888d.getWritableDatabase().I();
        if (k()) {
            return;
        }
        this.f889e.f();
    }

    public Lock h() {
        return this.f893i.readLock();
    }

    public G0.c i() {
        return this.f888d;
    }

    public Executor j() {
        return this.f886b;
    }

    public boolean k() {
        return this.f888d.getWritableDatabase().Z();
    }

    public void l(C0.a aVar) {
        G0.c cVarF = f(aVar);
        this.f888d = cVarF;
        if (cVarF instanceof i) {
            ((i) cVarF).c(aVar);
        }
        boolean z9 = aVar.f874g == c.WRITE_AHEAD_LOGGING;
        this.f888d.setWriteAheadLoggingEnabled(z9);
        this.f892h = aVar.f872e;
        this.f886b = aVar.f875h;
        this.f887c = new l(aVar.f876i);
        this.f890f = aVar.f873f;
        this.f891g = z9;
        if (aVar.f877j) {
            this.f889e.i(aVar.f869b, aVar.f870c);
        }
    }

    public void m(G0.b bVar) {
        this.f889e.d(bVar);
    }

    public boolean o() {
        G0.b bVar = this.f885a;
        return bVar != null && bVar.isOpen();
    }

    public Cursor p(G0.e eVar) {
        return q(eVar, null);
    }

    public Cursor q(G0.e eVar, CancellationSignal cancellationSignal) {
        a();
        b();
        return cancellationSignal != null ? this.f888d.getWritableDatabase().K(eVar, cancellationSignal) : this.f888d.getWritableDatabase().D(eVar);
    }

    public void r() {
        this.f888d.getWritableDatabase().G();
    }
}
