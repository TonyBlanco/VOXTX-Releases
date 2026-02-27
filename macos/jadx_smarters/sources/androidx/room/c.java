package androidx.room;

import C0.e;
import G0.f;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.Lock;
import m.C2214b;
import org.apache.http.client.methods.HttpDelete;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String[] f17116m = {"UPDATE", HttpDelete.METHOD_NAME, "INSERT"};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String[] f17118b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Map f17119c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f17120d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile f f17123g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public b f17124h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0.c f17125i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public androidx.room.d f17127k;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public AtomicBoolean f17121e = new AtomicBoolean(false);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public volatile boolean f17122f = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C2214b f17126j = new C2214b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Runnable f17128l = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f17117a = new HashMap();

    public class a implements Runnable {
        public a() {
        }

        public final Set a() {
            HashSet hashSet = new HashSet();
            Cursor cursorP = c.this.f17120d.p(new G0.a("SELECT * FROM room_table_modification_log WHERE invalidated = 1;"));
            while (cursorP.moveToNext()) {
                try {
                    hashSet.add(Integer.valueOf(cursorP.getInt(0)));
                } catch (Throwable th) {
                    cursorP.close();
                    throw th;
                }
            }
            cursorP.close();
            if (!hashSet.isEmpty()) {
                c.this.f17123g.E();
            }
            return hashSet;
        }

        @Override // java.lang.Runnable
        public void run() {
            Lock lockH = c.this.f17120d.h();
            Set setA = null;
            try {
                try {
                    lockH.lock();
                } finally {
                    lockH.unlock();
                }
            } catch (SQLiteException e9) {
                e = e9;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            } catch (IllegalStateException e10) {
                e = e10;
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e);
            }
            if (!c.this.c()) {
                lockH.unlock();
                return;
            }
            if (!c.this.f17121e.compareAndSet(true, false)) {
                lockH.unlock();
                return;
            }
            if (c.this.f17120d.k()) {
                lockH.unlock();
                return;
            }
            e eVar = c.this.f17120d;
            if (eVar.f891g) {
                G0.b writableDatabase = eVar.i().getWritableDatabase();
                writableDatabase.u();
                try {
                    setA = a();
                    writableDatabase.G();
                    writableDatabase.I();
                } catch (Throwable th) {
                    writableDatabase.I();
                    throw th;
                }
            } else {
                setA = a();
            }
            lockH.unlock();
            if (setA == null || setA.isEmpty()) {
                return;
            }
            synchronized (c.this.f17126j) {
                try {
                    Iterator it = c.this.f17126j.iterator();
                    while (it.hasNext()) {
                        ((d) ((Map.Entry) it.next()).getValue()).a(setA);
                    }
                } finally {
                }
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long[] f17130a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f17131b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f17132c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f17133d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f17134e;

        public b(int i9) {
            long[] jArr = new long[i9];
            this.f17130a = jArr;
            boolean[] zArr = new boolean[i9];
            this.f17131b = zArr;
            this.f17132c = new int[i9];
            Arrays.fill(jArr, 0L);
            Arrays.fill(zArr, false);
        }

        public int[] a() {
            synchronized (this) {
                try {
                    if (this.f17133d && !this.f17134e) {
                        int length = this.f17130a.length;
                        int i9 = 0;
                        while (true) {
                            int i10 = 1;
                            if (i9 >= length) {
                                this.f17134e = true;
                                this.f17133d = false;
                                return this.f17132c;
                            }
                            boolean z9 = this.f17130a[i9] > 0;
                            boolean[] zArr = this.f17131b;
                            if (z9 != zArr[i9]) {
                                int[] iArr = this.f17132c;
                                if (!z9) {
                                    i10 = 2;
                                }
                                iArr[i9] = i10;
                            } else {
                                this.f17132c[i9] = 0;
                            }
                            zArr[i9] = z9;
                            i9++;
                        }
                    }
                    return null;
                } finally {
                }
            }
        }

        public boolean b(int... iArr) {
            boolean z9;
            synchronized (this) {
                try {
                    z9 = false;
                    for (int i9 : iArr) {
                        long[] jArr = this.f17130a;
                        long j9 = jArr[i9];
                        jArr[i9] = 1 + j9;
                        if (j9 == 0) {
                            z9 = true;
                            this.f17133d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z9;
        }

        public boolean c(int... iArr) {
            boolean z9;
            synchronized (this) {
                try {
                    z9 = false;
                    for (int i9 : iArr) {
                        long[] jArr = this.f17130a;
                        long j9 = jArr[i9];
                        jArr[i9] = j9 - 1;
                        if (j9 == 1) {
                            z9 = true;
                            this.f17133d = true;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return z9;
        }

        public void d() {
            synchronized (this) {
                this.f17134e = false;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.room.c$c, reason: collision with other inner class name */
    public static abstract class AbstractC0198c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String[] f17135a;

        public AbstractC0198c(String[] strArr) {
            this.f17135a = (String[]) Arrays.copyOf(strArr, strArr.length);
        }

        public abstract boolean a();

        public abstract void b(Set set);
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f17136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String[] f17137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final AbstractC0198c f17138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Set f17139d;

        public d(AbstractC0198c abstractC0198c, int[] iArr, String[] strArr) {
            Set setUnmodifiableSet;
            this.f17138c = abstractC0198c;
            this.f17136a = iArr;
            this.f17137b = strArr;
            if (iArr.length == 1) {
                HashSet hashSet = new HashSet();
                hashSet.add(strArr[0]);
                setUnmodifiableSet = Collections.unmodifiableSet(hashSet);
            } else {
                setUnmodifiableSet = null;
            }
            this.f17139d = setUnmodifiableSet;
        }

        public void a(Set set) {
            int length = this.f17136a.length;
            Set hashSet = null;
            for (int i9 = 0; i9 < length; i9++) {
                if (set.contains(Integer.valueOf(this.f17136a[i9]))) {
                    if (length == 1) {
                        hashSet = this.f17139d;
                    } else {
                        if (hashSet == null) {
                            hashSet = new HashSet(length);
                        }
                        hashSet.add(this.f17137b[i9]);
                    }
                }
            }
            if (hashSet != null) {
                this.f17138c.b(hashSet);
            }
        }

        public void b(String[] strArr) {
            Set set = null;
            if (this.f17137b.length == 1) {
                int length = strArr.length;
                int i9 = 0;
                while (true) {
                    if (i9 >= length) {
                        break;
                    }
                    if (strArr[i9].equalsIgnoreCase(this.f17137b[0])) {
                        set = this.f17139d;
                        break;
                    }
                    i9++;
                }
            } else {
                HashSet hashSet = new HashSet();
                for (String str : strArr) {
                    String[] strArr2 = this.f17137b;
                    int length2 = strArr2.length;
                    int i10 = 0;
                    while (true) {
                        if (i10 < length2) {
                            String str2 = strArr2[i10];
                            if (str2.equalsIgnoreCase(str)) {
                                hashSet.add(str2);
                                break;
                            }
                            i10++;
                        }
                    }
                }
                if (hashSet.size() > 0) {
                    set = hashSet;
                }
            }
            if (set != null) {
                this.f17138c.b(set);
            }
        }
    }

    public c(e eVar, Map map, Map map2, String... strArr) {
        this.f17120d = eVar;
        this.f17124h = new b(strArr.length);
        this.f17119c = map2;
        this.f17125i = new C0.c(eVar);
        int length = strArr.length;
        this.f17118b = new String[length];
        for (int i9 = 0; i9 < length; i9++) {
            String str = strArr[i9];
            Locale locale = Locale.US;
            String lowerCase = str.toLowerCase(locale);
            this.f17117a.put(lowerCase, Integer.valueOf(i9));
            String str2 = (String) map.get(strArr[i9]);
            if (str2 != null) {
                this.f17118b[i9] = str2.toLowerCase(locale);
            } else {
                this.f17118b[i9] = lowerCase;
            }
        }
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getValue();
            Locale locale2 = Locale.US;
            String lowerCase2 = str3.toLowerCase(locale2);
            if (this.f17117a.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                HashMap map3 = this.f17117a;
                map3.put(lowerCase3, map3.get(lowerCase2));
            }
        }
    }

    public static void b(StringBuilder sb, String str, String str2) {
        sb.append("`");
        sb.append("room_table_modification_trigger_");
        sb.append(str);
        sb.append("_");
        sb.append(str2);
        sb.append("`");
    }

    public void a(AbstractC0198c abstractC0198c) {
        d dVar;
        String[] strArrH = h(abstractC0198c.f17135a);
        int[] iArr = new int[strArrH.length];
        int length = strArrH.length;
        for (int i9 = 0; i9 < length; i9++) {
            Integer num = (Integer) this.f17117a.get(strArrH[i9].toLowerCase(Locale.US));
            if (num == null) {
                throw new IllegalArgumentException("There is no table with name " + strArrH[i9]);
            }
            iArr[i9] = num.intValue();
        }
        d dVar2 = new d(abstractC0198c, iArr, strArrH);
        synchronized (this.f17126j) {
            dVar = (d) this.f17126j.i(abstractC0198c, dVar2);
        }
        if (dVar == null && this.f17124h.b(iArr)) {
            l();
        }
    }

    public boolean c() {
        if (!this.f17120d.o()) {
            return false;
        }
        if (!this.f17122f) {
            this.f17120d.i().getWritableDatabase();
        }
        if (this.f17122f) {
            return true;
        }
        Log.e("ROOM", "database is not initialized even though it is open");
        return false;
    }

    public void d(G0.b bVar) {
        synchronized (this) {
            try {
                if (this.f17122f) {
                    Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                    return;
                }
                bVar.C("PRAGMA temp_store = MEMORY;");
                bVar.C("PRAGMA recursive_triggers='ON';");
                bVar.C("CREATE TEMP TABLE room_table_modification_log(table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
                m(bVar);
                this.f17123g = bVar.Q("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1 ");
                this.f17122f = true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void e(String... strArr) {
        synchronized (this.f17126j) {
            try {
                for (Map.Entry entry : this.f17126j) {
                    if (!((AbstractC0198c) entry.getKey()).a()) {
                        ((d) entry.getValue()).b(strArr);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void f() {
        if (this.f17121e.compareAndSet(false, true)) {
            this.f17120d.j().execute(this.f17128l);
        }
    }

    public void g(AbstractC0198c abstractC0198c) {
        d dVar;
        synchronized (this.f17126j) {
            dVar = (d) this.f17126j.j(abstractC0198c);
        }
        if (dVar == null || !this.f17124h.c(dVar.f17136a)) {
            return;
        }
        l();
    }

    public final String[] h(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.US);
            if (this.f17119c.containsKey(lowerCase)) {
                hashSet.addAll((Collection) this.f17119c.get(lowerCase));
            } else {
                hashSet.add(str);
            }
        }
        return (String[]) hashSet.toArray(new String[hashSet.size()]);
    }

    public void i(Context context, String str) {
        this.f17127k = new androidx.room.d(context, str, this, this.f17120d.j());
    }

    public final void j(G0.b bVar, int i9) {
        bVar.C("INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i9 + ", 0)");
        String str = this.f17118b[i9];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f17116m) {
            sb.setLength(0);
            sb.append("CREATE TEMP TRIGGER IF NOT EXISTS ");
            b(sb, str, str2);
            sb.append(" AFTER ");
            sb.append(str2);
            sb.append(" ON `");
            sb.append(str);
            sb.append("` BEGIN UPDATE ");
            sb.append("room_table_modification_log");
            sb.append(" SET ");
            sb.append("invalidated");
            sb.append(" = 1");
            sb.append(" WHERE ");
            sb.append("table_id");
            sb.append(" = ");
            sb.append(i9);
            sb.append(" AND ");
            sb.append("invalidated");
            sb.append(" = 0");
            sb.append("; END");
            bVar.C(sb.toString());
        }
    }

    public final void k(G0.b bVar, int i9) {
        String str = this.f17118b[i9];
        StringBuilder sb = new StringBuilder();
        for (String str2 : f17116m) {
            sb.setLength(0);
            sb.append("DROP TRIGGER IF EXISTS ");
            b(sb, str, str2);
            bVar.C(sb.toString());
        }
    }

    public void l() {
        if (this.f17120d.o()) {
            m(this.f17120d.i().getWritableDatabase());
        }
    }

    public void m(G0.b bVar) {
        if (bVar.Z()) {
            return;
        }
        while (true) {
            try {
                Lock lockH = this.f17120d.h();
                lockH.lock();
                try {
                    int[] iArrA = this.f17124h.a();
                    if (iArrA == null) {
                        return;
                    }
                    int length = iArrA.length;
                    bVar.u();
                    for (int i9 = 0; i9 < length; i9++) {
                        try {
                            int i10 = iArrA[i9];
                            if (i10 == 1) {
                                j(bVar, i9);
                            } else if (i10 == 2) {
                                k(bVar, i9);
                            }
                        } finally {
                        }
                    }
                    bVar.G();
                    bVar.I();
                    this.f17124h.d();
                } finally {
                    lockH.unlock();
                }
            } catch (SQLiteException | IllegalStateException e9) {
                Log.e("ROOM", "Cannot run invalidation tracker. Is the db closed?", e9);
                return;
            }
        }
    }
}
