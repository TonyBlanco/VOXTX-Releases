package K2;

import C2.i;
import F2.a;
import F2.c;
import L2.b;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import j$.util.Objects;
import j8.InterfaceC2104a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import org.apache.commons.logging.LogFactory;
import z2.C3014b;
import z2.EnumC3016d;

/* JADX INFO: loaded from: classes3.dex */
public class M implements InterfaceC0689d, L2.b, InterfaceC0688c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C3014b f3610g = C3014b.b("proto");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U f3611a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final M2.a f3612c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final M2.a f3613d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AbstractC0690e f3614e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC2104a f3615f;

    public interface b {
        Object apply(Object obj);
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3616a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f3617b;

        public c(String str, String str2) {
            this.f3616a = str;
            this.f3617b = str2;
        }
    }

    public interface d {
        Object a();
    }

    public M(M2.a aVar, M2.a aVar2, AbstractC0690e abstractC0690e, U u9, InterfaceC2104a interfaceC2104a) {
        this.f3611a = u9;
        this.f3612c = aVar;
        this.f3613d = aVar2;
        this.f3614e = abstractC0690e;
        this.f3615f = interfaceC2104a;
    }

    public static /* synthetic */ F2.f A0(long j9, Cursor cursor) {
        cursor.moveToNext();
        return F2.f.c().c(cursor.getLong(0)).b(j9).a();
    }

    public static /* synthetic */ F2.f B0(final long j9, SQLiteDatabase sQLiteDatabase) {
        return (F2.f) b1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new b() { // from class: K2.D
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.A0(j9, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long C0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ List E0(SQLiteDatabase sQLiteDatabase) {
        return (List) b1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new b() { // from class: K2.K
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.F0((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List F0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(C2.p.a().b(cursor.getString(1)).d(N2.a.b(cursor.getInt(2))).c(V0(cursor.getString(3))).a());
        }
        return arrayList;
    }

    public static /* synthetic */ Object K0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j9 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j9));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j9), hashSet);
            }
            hashSet.add(new c(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ byte[] M0(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            byte[] bArr2 = (byte[]) arrayList.get(i9);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ Boolean P0(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    public static /* synthetic */ Object Q0(String str, c.b bVar, long j9, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) b1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())}), new b() { // from class: K2.y
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.P0((Cursor) obj);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j9 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(bVar.getNumber())});
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(bVar.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j9));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ Object R0(long j9, C2.p pVar, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j9));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(N2.a.a(pVar.d()))}) < 1) {
            contentValues.put("backend_name", pVar.b());
            contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(N2.a.a(pVar.d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static byte[] V0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    public static C3014b Z0(String str) {
        return str == null ? f3610g : C3014b.b(str);
    }

    public static String a1(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((AbstractC0696k) it.next()).c());
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object b1(Cursor cursor, b bVar) {
        try {
            return bVar.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object w0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Object x0(Throwable th) {
        throw new L2.a("Timed out while trying to acquire the lock.", th);
    }

    public static /* synthetic */ SQLiteDatabase y0(Throwable th) {
        throw new L2.a("Timed out while trying to open db.", th);
    }

    public static /* synthetic */ Long z0(Cursor cursor) {
        return Long.valueOf(cursor.moveToNext() ? cursor.getLong(0) : 0L);
    }

    public final /* synthetic */ Boolean D0(C2.p pVar, SQLiteDatabase sQLiteDatabase) {
        Long lQ0 = q0(sQLiteDatabase, pVar);
        return lQ0 == null ? Boolean.FALSE : (Boolean) b1(l0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lQ0.toString()}), new b() { // from class: K2.u
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    @Override // K2.InterfaceC0689d
    public Iterable F() {
        return (Iterable) r0(new b() { // from class: K2.G
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.E0((SQLiteDatabase) obj);
            }
        });
    }

    public final /* synthetic */ List G0(C2.p pVar, SQLiteDatabase sQLiteDatabase) {
        List listT0 = T0(sQLiteDatabase, pVar, this.f3614e.d());
        for (EnumC3016d enumC3016d : EnumC3016d.values()) {
            if (enumC3016d != pVar.d()) {
                int iD = this.f3614e.d() - listT0.size();
                if (iD <= 0) {
                    break;
                }
                listT0.addAll(T0(sQLiteDatabase, pVar.f(enumC3016d), iD));
            }
        }
        return t0(listT0, U0(sQLiteDatabase, listT0));
    }

    public final /* synthetic */ F2.a H0(Map map, a.C0027a c0027a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            c.b bVarH0 = h0(cursor.getInt(1));
            long j9 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(F2.c.c().c(bVarH0).b(j9).a());
        }
        W0(c0027a, map);
        c0027a.e(p0());
        c0027a.d(m0());
        c0027a.c((String) this.f3615f.get());
        return c0027a.b();
    }

    public final /* synthetic */ F2.a I0(String str, final Map map, final a.C0027a c0027a, SQLiteDatabase sQLiteDatabase) {
        return (F2.a) b1(sQLiteDatabase.rawQuery(str, new String[0]), new b() { // from class: K2.A
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3596a.H0(map, c0027a, (Cursor) obj);
            }
        });
    }

    public final /* synthetic */ Object J0(List list, C2.p pVar, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j9 = cursor.getLong(0);
            boolean z9 = cursor.getInt(7) != 0;
            i.a aVarK = C2.i.a().j(cursor.getString(1)).i(cursor.getLong(2)).k(cursor.getLong(3));
            aVarK.h(z9 ? new C2.h(Z0(cursor.getString(4)), cursor.getBlob(5)) : new C2.h(Z0(cursor.getString(4)), X0(j9)));
            if (!cursor.isNull(6)) {
                aVarK.g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC0696k.a(j9, pVar, aVarK.d()));
        }
        return null;
    }

    @Override // K2.InterfaceC0689d
    public Iterable L(final C2.p pVar) {
        return (Iterable) r0(new b() { // from class: K2.m
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3655a.G0(pVar, (SQLiteDatabase) obj);
            }
        });
    }

    public final /* synthetic */ Long L0(C2.i iVar, C2.p pVar, SQLiteDatabase sQLiteDatabase) {
        if (s0()) {
            d(1L, c.b.CACHE_FULL, iVar.j());
            return -1L;
        }
        long jJ0 = j0(sQLiteDatabase, pVar);
        int iE = this.f3614e.e();
        byte[] bArrA = iVar.e().a();
        boolean z9 = bArrA.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jJ0));
        contentValues.put("transport_name", iVar.j());
        contentValues.put("timestamp_ms", Long.valueOf(iVar.f()));
        contentValues.put("uptime_ms", Long.valueOf(iVar.k()));
        contentValues.put("payload_encoding", iVar.e().b().a());
        contentValues.put("code", iVar.d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z9));
        contentValues.put("payload", z9 ? bArrA : new byte[0]);
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z9) {
            int iCeil = (int) Math.ceil(((double) bArrA.length) / ((double) iE));
            for (int i9 = 1; i9 <= iCeil; i9++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArrA, (i9 - 1) * iE, Math.min(i9 * iE, bArrA.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i9));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry entry : iVar.i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", (String) entry.getKey());
            contentValues3.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    @Override // K2.InterfaceC0689d
    public boolean M(final C2.p pVar) {
        return ((Boolean) r0(new b() { // from class: K2.o
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3657a.D0(pVar, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // K2.InterfaceC0689d
    public void N(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + a1(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            r0(new b() { // from class: K2.L
                @Override // K2.M.b
                public final Object apply(Object obj) {
                    return this.f3607a.O0(str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    public final /* synthetic */ Object N0(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), c.b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    public final /* synthetic */ Object O0(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        b1(sQLiteDatabase.rawQuery(str2, null), new b() { // from class: K2.v
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3670a.N0((Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    @Override // K2.InterfaceC0689d
    public void P(final C2.p pVar, final long j9) {
        r0(new b() { // from class: K2.p
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.R0(j9, pVar, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // K2.InterfaceC0689d
    public AbstractC0696k R(final C2.p pVar, final C2.i iVar) {
        G2.a.c("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", pVar.d(), iVar.j(), pVar.b());
        long jLongValue = ((Long) r0(new b() { // from class: K2.I
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3602a.L0(iVar, pVar, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return AbstractC0696k.a(jLongValue, pVar, iVar);
    }

    public final /* synthetic */ Object S0(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f3612c.a()).execute();
        return null;
    }

    public final List T0(SQLiteDatabase sQLiteDatabase, final C2.p pVar, int i9) {
        final ArrayList arrayList = new ArrayList();
        Long lQ0 = q0(sQLiteDatabase, pVar);
        if (lQ0 == null) {
            return arrayList;
        }
        b1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{lQ0.toString()}, null, null, null, String.valueOf(i9)), new b() { // from class: K2.x
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3671a.J0(arrayList, pVar, (Cursor) obj);
            }
        });
        return arrayList;
    }

    public final Map U0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb = new StringBuilder("event_id IN (");
        for (int i9 = 0; i9 < list.size(); i9++) {
            sb.append(((AbstractC0696k) list.get(i9)).c());
            if (i9 < list.size() - 1) {
                sb.append(',');
            }
        }
        sb.append(')');
        b1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb.toString(), null, null, null, null), new b() { // from class: K2.z
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.K0(map, (Cursor) obj);
            }
        });
        return map;
    }

    public final void W0(a.C0027a c0027a, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            c0027a.a(F2.d.c().c((String) entry.getKey()).b((List) entry.getValue()).a());
        }
    }

    public final byte[] X0(long j9) {
        return (byte[]) b1(l0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j9)}, null, null, "sequence_num"), new b() { // from class: K2.B
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.M0((Cursor) obj);
            }
        });
    }

    public final Object Y0(d dVar, b bVar) {
        long jA = this.f3613d.a();
        while (true) {
            try {
                return dVar.a();
            } catch (SQLiteDatabaseLockedException e9) {
                if (this.f3613d.a() >= ((long) this.f3614e.b()) + jA) {
                    return bVar.apply(e9);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // L2.b
    public Object a(b.a aVar) {
        SQLiteDatabase sQLiteDatabaseL0 = l0();
        i0(sQLiteDatabaseL0);
        try {
            Object objExecute = aVar.execute();
            sQLiteDatabaseL0.setTransactionSuccessful();
            return objExecute;
        } finally {
            sQLiteDatabaseL0.endTransaction();
        }
    }

    @Override // K2.InterfaceC0689d
    public long b(C2.p pVar) {
        return ((Long) b1(l0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{pVar.b(), String.valueOf(N2.a.a(pVar.d()))}), new b() { // from class: K2.H
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.z0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // K2.InterfaceC0688c
    public void c() {
        r0(new b() { // from class: K2.q
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3661a.S0((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3611a.close();
    }

    @Override // K2.InterfaceC0688c
    public void d(final long j9, final c.b bVar, final String str) {
        r0(new b() { // from class: K2.r
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.Q0(str, bVar, j9, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // K2.InterfaceC0688c
    public F2.a e() {
        final a.C0027a c0027aE = F2.a.e();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (F2.a) r0(new b() { // from class: K2.t
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3666a.I0(str, map, c0027aE, (SQLiteDatabase) obj);
            }
        });
    }

    public final c.b h0(int i9) {
        c.b bVar = c.b.REASON_UNKNOWN;
        if (i9 == bVar.getNumber()) {
            return bVar;
        }
        c.b bVar2 = c.b.MESSAGE_TOO_OLD;
        if (i9 == bVar2.getNumber()) {
            return bVar2;
        }
        c.b bVar3 = c.b.CACHE_FULL;
        if (i9 == bVar3.getNumber()) {
            return bVar3;
        }
        c.b bVar4 = c.b.PAYLOAD_TOO_BIG;
        if (i9 == bVar4.getNumber()) {
            return bVar4;
        }
        c.b bVar5 = c.b.MAX_RETRIES_REACHED;
        if (i9 == bVar5.getNumber()) {
            return bVar5;
        }
        c.b bVar6 = c.b.INVALID_PAYLOD;
        if (i9 == bVar6.getNumber()) {
            return bVar6;
        }
        c.b bVar7 = c.b.SERVER_ERROR;
        if (i9 == bVar7.getNumber()) {
            return bVar7;
        }
        G2.a.b("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i9));
        return bVar;
    }

    public final void i0(final SQLiteDatabase sQLiteDatabase) {
        Y0(new d() { // from class: K2.l
            @Override // K2.M.d
            public final Object a() {
                return M.w0(sQLiteDatabase);
            }
        }, new b() { // from class: K2.w
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.x0((Throwable) obj);
            }
        });
    }

    public final long j0(SQLiteDatabase sQLiteDatabase, C2.p pVar) {
        Long lQ0 = q0(sQLiteDatabase, pVar);
        if (lQ0 != null) {
            return lQ0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", pVar.b());
        contentValues.put(LogFactory.PRIORITY_KEY, Integer.valueOf(N2.a.a(pVar.d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (pVar.c() != null) {
            contentValues.put("extras", Base64.encodeToString(pVar.c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public long k0() {
        return n0() * o0();
    }

    public SQLiteDatabase l0() {
        final U u9 = this.f3611a;
        Objects.requireNonNull(u9);
        return (SQLiteDatabase) Y0(new d() { // from class: K2.E
            @Override // K2.M.d
            public final Object a() {
                return u9.getWritableDatabase();
            }
        }, new b() { // from class: K2.F
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.y0((Throwable) obj);
            }
        });
    }

    public final F2.b m0() {
        return F2.b.b().b(F2.e.c().b(k0()).c(AbstractC0690e.f3649a.f()).a()).a();
    }

    public final long n0() {
        return l0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    public final long o0() {
        return l0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public final F2.f p0() {
        final long jA = this.f3612c.a();
        return (F2.f) r0(new b() { // from class: K2.C
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.B0(jA, (SQLiteDatabase) obj);
            }
        });
    }

    public final Long q0(SQLiteDatabase sQLiteDatabase, C2.p pVar) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(pVar.b(), String.valueOf(N2.a.a(pVar.d()))));
        if (pVar.c() != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(pVar.c(), 0));
        } else {
            sb.append(" and extras is null");
        }
        return (Long) b1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new b() { // from class: K2.n
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return M.C0((Cursor) obj);
            }
        });
    }

    public Object r0(b bVar) {
        SQLiteDatabase sQLiteDatabaseL0 = l0();
        sQLiteDatabaseL0.beginTransaction();
        try {
            Object objApply = bVar.apply(sQLiteDatabaseL0);
            sQLiteDatabaseL0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseL0.endTransaction();
        }
    }

    public final boolean s0() {
        return n0() * o0() >= this.f3614e.f();
    }

    public final List t0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC0696k abstractC0696k = (AbstractC0696k) listIterator.next();
            if (map.containsKey(Long.valueOf(abstractC0696k.c()))) {
                i.a aVarL = abstractC0696k.b().l();
                for (c cVar : (Set) map.get(Long.valueOf(abstractC0696k.c()))) {
                    aVarL.c(cVar.f3616a, cVar.f3617b);
                }
                listIterator.set(AbstractC0696k.a(abstractC0696k.c(), abstractC0696k.d(), aVarL.d()));
            }
        }
        return list;
    }

    public final /* synthetic */ Object u0(Cursor cursor) {
        while (cursor.moveToNext()) {
            d(cursor.getInt(0), c.b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public final /* synthetic */ Integer v0(long j9, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j9)};
        b1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new b() { // from class: K2.s
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3665a.u0((Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    @Override // K2.InterfaceC0689d
    public int y() {
        final long jA = this.f3612c.a() - this.f3614e.c();
        return ((Integer) r0(new b() { // from class: K2.J
            @Override // K2.M.b
            public final Object apply(Object obj) {
                return this.f3605a.v0(jA, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @Override // K2.InterfaceC0689d
    public void z(Iterable iterable) {
        if (iterable.iterator().hasNext()) {
            l0().compileStatement("DELETE FROM events WHERE _id in " + a1(iterable)).execute();
        }
    }
}
