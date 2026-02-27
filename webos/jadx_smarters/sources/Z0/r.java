package Z0;

import Z0.p;
import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class r implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0.e f10831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C0.b f10832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C0.k f10833c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0.k f10834d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C0.k f10835e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C0.k f10836f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0.k f10837g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C0.k f10838h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C0.k f10839i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C0.k f10840j;

    public class a extends C0.b {
        public a(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`period_start_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`required_network_type`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // C0.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void g(G0.f fVar, p pVar) throws Throwable {
            String str = pVar.f10811a;
            if (str == null) {
                fVar.X(1);
            } else {
                fVar.x(1, str);
            }
            fVar.A(2, v.j(pVar.f10812b));
            String str2 = pVar.f10813c;
            if (str2 == null) {
                fVar.X(3);
            } else {
                fVar.x(3, str2);
            }
            String str3 = pVar.f10814d;
            if (str3 == null) {
                fVar.X(4);
            } else {
                fVar.x(4, str3);
            }
            byte[] bArrN = androidx.work.b.n(pVar.f10815e);
            if (bArrN == null) {
                fVar.X(5);
            } else {
                fVar.S(5, bArrN);
            }
            byte[] bArrN2 = androidx.work.b.n(pVar.f10816f);
            if (bArrN2 == null) {
                fVar.X(6);
            } else {
                fVar.S(6, bArrN2);
            }
            fVar.A(7, pVar.f10817g);
            fVar.A(8, pVar.f10818h);
            fVar.A(9, pVar.f10819i);
            fVar.A(10, pVar.f10821k);
            fVar.A(11, v.a(pVar.f10822l));
            fVar.A(12, pVar.f10823m);
            fVar.A(13, pVar.f10824n);
            fVar.A(14, pVar.f10825o);
            fVar.A(15, pVar.f10826p);
            fVar.A(16, pVar.f10827q ? 1L : 0L);
            fVar.A(17, v.i(pVar.f10828r));
            Q0.b bVar = pVar.f10820j;
            if (bVar != null) {
                fVar.A(18, v.h(bVar.b()));
                fVar.A(19, bVar.g() ? 1L : 0L);
                fVar.A(20, bVar.h() ? 1L : 0L);
                fVar.A(21, bVar.f() ? 1L : 0L);
                fVar.A(22, bVar.i() ? 1L : 0L);
                fVar.A(23, bVar.c());
                fVar.A(24, bVar.d());
                byte[] bArrC = v.c(bVar.a());
                if (bArrC != null) {
                    fVar.S(25, bArrC);
                    return;
                }
            } else {
                fVar.X(18);
                fVar.X(19);
                fVar.X(20);
                fVar.X(21);
                fVar.X(22);
                fVar.X(23);
                fVar.X(24);
            }
            fVar.X(25);
        }
    }

    public class b extends C0.k {
        public b(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    public class c extends C0.k {
        public c(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    public class d extends C0.k {
        public d(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "UPDATE workspec SET period_start_time=? WHERE id=?";
        }
    }

    public class e extends C0.k {
        public e(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public class f extends C0.k {
        public f(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    public class g extends C0.k {
        public g(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    public class h extends C0.k {
        public h(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    public class i extends C0.k {
        public i(C0.e eVar) {
            super(eVar);
        }

        @Override // C0.k
        public String d() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    public r(C0.e eVar) {
        this.f10831a = eVar;
        this.f10832b = new a(eVar);
        this.f10833c = new b(eVar);
        this.f10834d = new c(eVar);
        this.f10835e = new d(eVar);
        this.f10836f = new e(eVar);
        this.f10837g = new f(eVar);
        this.f10838h = new g(eVar);
        this.f10839i = new h(eVar);
        this.f10840j = new i(eVar);
    }

    @Override // Z0.q
    public void a(String str) {
        this.f10831a.b();
        G0.f fVarA = this.f10833c.a();
        if (str == null) {
            fVarA.X(1);
        } else {
            fVarA.x(1, str);
        }
        this.f10831a.c();
        try {
            fVarA.E();
            this.f10831a.r();
        } finally {
            this.f10831a.g();
            this.f10833c.f(fVarA);
        }
    }

    @Override // Z0.q
    public List b(long j9) throws Throwable {
        C0.h hVar;
        C0.h hVarD = C0.h.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC", 1);
        hVarD.A(1, j9);
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            int iB = E0.b.b(cursorB, "required_network_type");
            int iB2 = E0.b.b(cursorB, "requires_charging");
            int iB3 = E0.b.b(cursorB, "requires_device_idle");
            int iB4 = E0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = E0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = E0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = E0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = E0.b.b(cursorB, "content_uri_triggers");
            int iB9 = E0.b.b(cursorB, Name.MARK);
            int iB10 = E0.b.b(cursorB, "state");
            int iB11 = E0.b.b(cursorB, "worker_class_name");
            int iB12 = E0.b.b(cursorB, "input_merger_class_name");
            int iB13 = E0.b.b(cursorB, "input");
            int iB14 = E0.b.b(cursorB, "output");
            hVar = hVarD;
            try {
                int iB15 = E0.b.b(cursorB, "initial_delay");
                int iB16 = E0.b.b(cursorB, "interval_duration");
                int iB17 = E0.b.b(cursorB, "flex_duration");
                int iB18 = E0.b.b(cursorB, "run_attempt_count");
                int iB19 = E0.b.b(cursorB, "backoff_policy");
                int iB20 = E0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = E0.b.b(cursorB, "period_start_time");
                int iB22 = E0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = E0.b.b(cursorB, "schedule_requested_at");
                int iB24 = E0.b.b(cursorB, "run_in_foreground");
                int iB25 = E0.b.b(cursorB, "out_of_quota_policy");
                int i9 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i10 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i11 = iB11;
                    Q0.b bVar = new Q0.b();
                    int i12 = iB;
                    bVar.k(v.e(cursorB.getInt(iB)));
                    bVar.m(cursorB.getInt(iB2) != 0);
                    bVar.n(cursorB.getInt(iB3) != 0);
                    bVar.l(cursorB.getInt(iB4) != 0);
                    bVar.o(cursorB.getInt(iB5) != 0);
                    int i13 = iB2;
                    int i14 = iB3;
                    bVar.p(cursorB.getLong(iB6));
                    bVar.q(cursorB.getLong(iB7));
                    bVar.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f10812b = v.g(cursorB.getInt(iB10));
                    pVar.f10814d = cursorB.getString(iB12);
                    pVar.f10815e = androidx.work.b.g(cursorB.getBlob(iB13));
                    int i15 = i9;
                    pVar.f10816f = androidx.work.b.g(cursorB.getBlob(i15));
                    int i16 = iB15;
                    i9 = i15;
                    pVar.f10817g = cursorB.getLong(i16);
                    int i17 = iB12;
                    int i18 = iB16;
                    pVar.f10818h = cursorB.getLong(i18);
                    int i19 = iB4;
                    int i20 = iB17;
                    pVar.f10819i = cursorB.getLong(i20);
                    int i21 = iB18;
                    pVar.f10821k = cursorB.getInt(i21);
                    int i22 = iB19;
                    pVar.f10822l = v.d(cursorB.getInt(i22));
                    iB17 = i20;
                    int i23 = iB20;
                    pVar.f10823m = cursorB.getLong(i23);
                    int i24 = iB21;
                    pVar.f10824n = cursorB.getLong(i24);
                    iB21 = i24;
                    int i25 = iB22;
                    pVar.f10825o = cursorB.getLong(i25);
                    int i26 = iB23;
                    pVar.f10826p = cursorB.getLong(i26);
                    int i27 = iB24;
                    pVar.f10827q = cursorB.getInt(i27) != 0;
                    int i28 = iB25;
                    pVar.f10828r = v.f(cursorB.getInt(i28));
                    pVar.f10820j = bVar;
                    arrayList.add(pVar);
                    iB2 = i13;
                    iB25 = i28;
                    iB12 = i17;
                    iB15 = i16;
                    iB16 = i18;
                    iB18 = i21;
                    iB23 = i26;
                    iB9 = i10;
                    iB11 = i11;
                    iB = i12;
                    iB24 = i27;
                    iB22 = i25;
                    iB3 = i14;
                    iB20 = i23;
                    iB4 = i19;
                    iB19 = i22;
                }
                cursorB.close();
                hVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                hVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = hVarD;
        }
    }

    @Override // Z0.q
    public List c() throws Throwable {
        C0.h hVar;
        C0.h hVarD = C0.h.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            int iB = E0.b.b(cursorB, "required_network_type");
            int iB2 = E0.b.b(cursorB, "requires_charging");
            int iB3 = E0.b.b(cursorB, "requires_device_idle");
            int iB4 = E0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = E0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = E0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = E0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = E0.b.b(cursorB, "content_uri_triggers");
            int iB9 = E0.b.b(cursorB, Name.MARK);
            int iB10 = E0.b.b(cursorB, "state");
            int iB11 = E0.b.b(cursorB, "worker_class_name");
            int iB12 = E0.b.b(cursorB, "input_merger_class_name");
            int iB13 = E0.b.b(cursorB, "input");
            int iB14 = E0.b.b(cursorB, "output");
            hVar = hVarD;
            try {
                int iB15 = E0.b.b(cursorB, "initial_delay");
                int iB16 = E0.b.b(cursorB, "interval_duration");
                int iB17 = E0.b.b(cursorB, "flex_duration");
                int iB18 = E0.b.b(cursorB, "run_attempt_count");
                int iB19 = E0.b.b(cursorB, "backoff_policy");
                int iB20 = E0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = E0.b.b(cursorB, "period_start_time");
                int iB22 = E0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = E0.b.b(cursorB, "schedule_requested_at");
                int iB24 = E0.b.b(cursorB, "run_in_foreground");
                int iB25 = E0.b.b(cursorB, "out_of_quota_policy");
                int i9 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i10 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i11 = iB11;
                    Q0.b bVar = new Q0.b();
                    int i12 = iB;
                    bVar.k(v.e(cursorB.getInt(iB)));
                    bVar.m(cursorB.getInt(iB2) != 0);
                    bVar.n(cursorB.getInt(iB3) != 0);
                    bVar.l(cursorB.getInt(iB4) != 0);
                    bVar.o(cursorB.getInt(iB5) != 0);
                    int i13 = iB2;
                    int i14 = iB3;
                    bVar.p(cursorB.getLong(iB6));
                    bVar.q(cursorB.getLong(iB7));
                    bVar.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f10812b = v.g(cursorB.getInt(iB10));
                    pVar.f10814d = cursorB.getString(iB12);
                    pVar.f10815e = androidx.work.b.g(cursorB.getBlob(iB13));
                    int i15 = i9;
                    pVar.f10816f = androidx.work.b.g(cursorB.getBlob(i15));
                    i9 = i15;
                    int i16 = iB15;
                    pVar.f10817g = cursorB.getLong(i16);
                    int i17 = iB13;
                    int i18 = iB16;
                    pVar.f10818h = cursorB.getLong(i18);
                    int i19 = iB4;
                    int i20 = iB17;
                    pVar.f10819i = cursorB.getLong(i20);
                    int i21 = iB18;
                    pVar.f10821k = cursorB.getInt(i21);
                    int i22 = iB19;
                    pVar.f10822l = v.d(cursorB.getInt(i22));
                    iB17 = i20;
                    int i23 = iB20;
                    pVar.f10823m = cursorB.getLong(i23);
                    int i24 = iB21;
                    pVar.f10824n = cursorB.getLong(i24);
                    iB21 = i24;
                    int i25 = iB22;
                    pVar.f10825o = cursorB.getLong(i25);
                    int i26 = iB23;
                    pVar.f10826p = cursorB.getLong(i26);
                    int i27 = iB24;
                    pVar.f10827q = cursorB.getInt(i27) != 0;
                    int i28 = iB25;
                    pVar.f10828r = v.f(cursorB.getInt(i28));
                    pVar.f10820j = bVar;
                    arrayList.add(pVar);
                    iB25 = i28;
                    iB2 = i13;
                    iB13 = i17;
                    iB15 = i16;
                    iB16 = i18;
                    iB18 = i21;
                    iB23 = i26;
                    iB9 = i10;
                    iB11 = i11;
                    iB = i12;
                    iB24 = i27;
                    iB22 = i25;
                    iB3 = i14;
                    iB20 = i23;
                    iB4 = i19;
                    iB19 = i22;
                }
                cursorB.close();
                hVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                hVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = hVarD;
        }
    }

    @Override // Z0.q
    public int d(Q0.t tVar, String... strArr) {
        this.f10831a.b();
        StringBuilder sbB = E0.e.b();
        sbB.append("UPDATE workspec SET state=");
        sbB.append("?");
        sbB.append(" WHERE id IN (");
        E0.e.a(sbB, strArr.length);
        sbB.append(")");
        G0.f fVarD = this.f10831a.d(sbB.toString());
        fVarD.A(1, v.j(tVar));
        int i9 = 2;
        for (String str : strArr) {
            if (str == null) {
                fVarD.X(i9);
            } else {
                fVarD.x(i9, str);
            }
            i9++;
        }
        this.f10831a.c();
        try {
            int iE = fVarD.E();
            this.f10831a.r();
            return iE;
        } finally {
            this.f10831a.g();
        }
    }

    @Override // Z0.q
    public List e(String str) {
        C0.h hVarD = C0.h.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.q
    public void f(p pVar) {
        this.f10831a.b();
        this.f10831a.c();
        try {
            this.f10832b.h(pVar);
            this.f10831a.r();
        } finally {
            this.f10831a.g();
        }
    }

    @Override // Z0.q
    public Q0.t g(String str) {
        C0.h hVarD = C0.h.d("SELECT state FROM workspec WHERE id=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            return cursorB.moveToFirst() ? v.g(cursorB.getInt(0)) : null;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.q
    public p h(String str) throws Throwable {
        C0.h hVar;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int iB5;
        int iB6;
        int iB7;
        int iB8;
        int iB9;
        int iB10;
        int iB11;
        int iB12;
        int iB13;
        int iB14;
        p pVar;
        C0.h hVarD = C0.h.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            iB = E0.b.b(cursorB, "required_network_type");
            iB2 = E0.b.b(cursorB, "requires_charging");
            iB3 = E0.b.b(cursorB, "requires_device_idle");
            iB4 = E0.b.b(cursorB, "requires_battery_not_low");
            iB5 = E0.b.b(cursorB, "requires_storage_not_low");
            iB6 = E0.b.b(cursorB, "trigger_content_update_delay");
            iB7 = E0.b.b(cursorB, "trigger_max_content_delay");
            iB8 = E0.b.b(cursorB, "content_uri_triggers");
            iB9 = E0.b.b(cursorB, Name.MARK);
            iB10 = E0.b.b(cursorB, "state");
            iB11 = E0.b.b(cursorB, "worker_class_name");
            iB12 = E0.b.b(cursorB, "input_merger_class_name");
            iB13 = E0.b.b(cursorB, "input");
            iB14 = E0.b.b(cursorB, "output");
            hVar = hVarD;
        } catch (Throwable th) {
            th = th;
            hVar = hVarD;
        }
        try {
            int iB15 = E0.b.b(cursorB, "initial_delay");
            int iB16 = E0.b.b(cursorB, "interval_duration");
            int iB17 = E0.b.b(cursorB, "flex_duration");
            int iB18 = E0.b.b(cursorB, "run_attempt_count");
            int iB19 = E0.b.b(cursorB, "backoff_policy");
            int iB20 = E0.b.b(cursorB, "backoff_delay_duration");
            int iB21 = E0.b.b(cursorB, "period_start_time");
            int iB22 = E0.b.b(cursorB, "minimum_retention_duration");
            int iB23 = E0.b.b(cursorB, "schedule_requested_at");
            int iB24 = E0.b.b(cursorB, "run_in_foreground");
            int iB25 = E0.b.b(cursorB, "out_of_quota_policy");
            if (cursorB.moveToFirst()) {
                String string = cursorB.getString(iB9);
                String string2 = cursorB.getString(iB11);
                Q0.b bVar = new Q0.b();
                bVar.k(v.e(cursorB.getInt(iB)));
                bVar.m(cursorB.getInt(iB2) != 0);
                bVar.n(cursorB.getInt(iB3) != 0);
                bVar.l(cursorB.getInt(iB4) != 0);
                bVar.o(cursorB.getInt(iB5) != 0);
                bVar.p(cursorB.getLong(iB6));
                bVar.q(cursorB.getLong(iB7));
                bVar.j(v.b(cursorB.getBlob(iB8)));
                p pVar2 = new p(string, string2);
                pVar2.f10812b = v.g(cursorB.getInt(iB10));
                pVar2.f10814d = cursorB.getString(iB12);
                pVar2.f10815e = androidx.work.b.g(cursorB.getBlob(iB13));
                pVar2.f10816f = androidx.work.b.g(cursorB.getBlob(iB14));
                pVar2.f10817g = cursorB.getLong(iB15);
                pVar2.f10818h = cursorB.getLong(iB16);
                pVar2.f10819i = cursorB.getLong(iB17);
                pVar2.f10821k = cursorB.getInt(iB18);
                pVar2.f10822l = v.d(cursorB.getInt(iB19));
                pVar2.f10823m = cursorB.getLong(iB20);
                pVar2.f10824n = cursorB.getLong(iB21);
                pVar2.f10825o = cursorB.getLong(iB22);
                pVar2.f10826p = cursorB.getLong(iB23);
                pVar2.f10827q = cursorB.getInt(iB24) != 0;
                pVar2.f10828r = v.f(cursorB.getInt(iB25));
                pVar2.f10820j = bVar;
                pVar = pVar2;
            } else {
                pVar = null;
            }
            cursorB.close();
            hVar.h();
            return pVar;
        } catch (Throwable th2) {
            th = th2;
            cursorB.close();
            hVar.h();
            throw th;
        }
    }

    @Override // Z0.q
    public List i(String str) {
        C0.h hVarD = C0.h.d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(cursorB.getString(0));
            }
            return arrayList;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.q
    public List j(String str) {
        C0.h hVarD = C0.h.d("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                arrayList.add(androidx.work.b.g(cursorB.getBlob(0)));
            }
            return arrayList;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.q
    public List k(int i9) throws Throwable {
        C0.h hVar;
        C0.h hVarD = C0.h.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?", 1);
        hVarD.A(1, i9);
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            int iB = E0.b.b(cursorB, "required_network_type");
            int iB2 = E0.b.b(cursorB, "requires_charging");
            int iB3 = E0.b.b(cursorB, "requires_device_idle");
            int iB4 = E0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = E0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = E0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = E0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = E0.b.b(cursorB, "content_uri_triggers");
            int iB9 = E0.b.b(cursorB, Name.MARK);
            int iB10 = E0.b.b(cursorB, "state");
            int iB11 = E0.b.b(cursorB, "worker_class_name");
            int iB12 = E0.b.b(cursorB, "input_merger_class_name");
            int iB13 = E0.b.b(cursorB, "input");
            int iB14 = E0.b.b(cursorB, "output");
            hVar = hVarD;
            try {
                int iB15 = E0.b.b(cursorB, "initial_delay");
                int iB16 = E0.b.b(cursorB, "interval_duration");
                int iB17 = E0.b.b(cursorB, "flex_duration");
                int iB18 = E0.b.b(cursorB, "run_attempt_count");
                int iB19 = E0.b.b(cursorB, "backoff_policy");
                int iB20 = E0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = E0.b.b(cursorB, "period_start_time");
                int iB22 = E0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = E0.b.b(cursorB, "schedule_requested_at");
                int iB24 = E0.b.b(cursorB, "run_in_foreground");
                int iB25 = E0.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    Q0.b bVar = new Q0.b();
                    int i13 = iB;
                    bVar.k(v.e(cursorB.getInt(iB)));
                    bVar.m(cursorB.getInt(iB2) != 0);
                    bVar.n(cursorB.getInt(iB3) != 0);
                    bVar.l(cursorB.getInt(iB4) != 0);
                    bVar.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    bVar.p(cursorB.getLong(iB6));
                    bVar.q(cursorB.getLong(iB7));
                    bVar.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f10812b = v.g(cursorB.getInt(iB10));
                    pVar.f10814d = cursorB.getString(iB12);
                    pVar.f10815e = androidx.work.b.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f10816f = androidx.work.b.g(cursorB.getBlob(i16));
                    i10 = i16;
                    int i17 = iB15;
                    pVar.f10817g = cursorB.getLong(i17);
                    int i18 = iB12;
                    int i19 = iB16;
                    pVar.f10818h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f10819i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f10821k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f10822l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f10823m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f10824n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f10825o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f10826p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f10827q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f10828r = v.f(cursorB.getInt(i29));
                    pVar.f10820j = bVar;
                    arrayList.add(pVar);
                    iB25 = i29;
                    iB2 = i14;
                    iB12 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                }
                cursorB.close();
                hVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                hVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = hVarD;
        }
    }

    @Override // Z0.q
    public int l() {
        this.f10831a.b();
        G0.f fVarA = this.f10839i.a();
        this.f10831a.c();
        try {
            int iE = fVarA.E();
            this.f10831a.r();
            return iE;
        } finally {
            this.f10831a.g();
            this.f10839i.f(fVarA);
        }
    }

    @Override // Z0.q
    public int m(String str, long j9) {
        this.f10831a.b();
        G0.f fVarA = this.f10838h.a();
        fVarA.A(1, j9);
        if (str == null) {
            fVarA.X(2);
        } else {
            fVarA.x(2, str);
        }
        this.f10831a.c();
        try {
            int iE = fVarA.E();
            this.f10831a.r();
            return iE;
        } finally {
            this.f10831a.g();
            this.f10838h.f(fVarA);
        }
    }

    @Override // Z0.q
    public List n(String str) {
        C0.h hVarD = C0.h.d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        if (str == null) {
            hVarD.X(1);
        } else {
            hVarD.x(1, str);
        }
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            int iB = E0.b.b(cursorB, Name.MARK);
            int iB2 = E0.b.b(cursorB, "state");
            ArrayList arrayList = new ArrayList(cursorB.getCount());
            while (cursorB.moveToNext()) {
                p.b bVar = new p.b();
                bVar.f10829a = cursorB.getString(iB);
                bVar.f10830b = v.g(cursorB.getInt(iB2));
                arrayList.add(bVar);
            }
            return arrayList;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.q
    public List o(int i9) throws Throwable {
        C0.h hVar;
        C0.h hVarD = C0.h.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))", 1);
        hVarD.A(1, i9);
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            int iB = E0.b.b(cursorB, "required_network_type");
            int iB2 = E0.b.b(cursorB, "requires_charging");
            int iB3 = E0.b.b(cursorB, "requires_device_idle");
            int iB4 = E0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = E0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = E0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = E0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = E0.b.b(cursorB, "content_uri_triggers");
            int iB9 = E0.b.b(cursorB, Name.MARK);
            int iB10 = E0.b.b(cursorB, "state");
            int iB11 = E0.b.b(cursorB, "worker_class_name");
            int iB12 = E0.b.b(cursorB, "input_merger_class_name");
            int iB13 = E0.b.b(cursorB, "input");
            int iB14 = E0.b.b(cursorB, "output");
            hVar = hVarD;
            try {
                int iB15 = E0.b.b(cursorB, "initial_delay");
                int iB16 = E0.b.b(cursorB, "interval_duration");
                int iB17 = E0.b.b(cursorB, "flex_duration");
                int iB18 = E0.b.b(cursorB, "run_attempt_count");
                int iB19 = E0.b.b(cursorB, "backoff_policy");
                int iB20 = E0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = E0.b.b(cursorB, "period_start_time");
                int iB22 = E0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = E0.b.b(cursorB, "schedule_requested_at");
                int iB24 = E0.b.b(cursorB, "run_in_foreground");
                int iB25 = E0.b.b(cursorB, "out_of_quota_policy");
                int i10 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i11 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i12 = iB11;
                    Q0.b bVar = new Q0.b();
                    int i13 = iB;
                    bVar.k(v.e(cursorB.getInt(iB)));
                    bVar.m(cursorB.getInt(iB2) != 0);
                    bVar.n(cursorB.getInt(iB3) != 0);
                    bVar.l(cursorB.getInt(iB4) != 0);
                    bVar.o(cursorB.getInt(iB5) != 0);
                    int i14 = iB2;
                    int i15 = iB3;
                    bVar.p(cursorB.getLong(iB6));
                    bVar.q(cursorB.getLong(iB7));
                    bVar.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f10812b = v.g(cursorB.getInt(iB10));
                    pVar.f10814d = cursorB.getString(iB12);
                    pVar.f10815e = androidx.work.b.g(cursorB.getBlob(iB13));
                    int i16 = i10;
                    pVar.f10816f = androidx.work.b.g(cursorB.getBlob(i16));
                    i10 = i16;
                    int i17 = iB15;
                    pVar.f10817g = cursorB.getLong(i17);
                    int i18 = iB12;
                    int i19 = iB16;
                    pVar.f10818h = cursorB.getLong(i19);
                    int i20 = iB4;
                    int i21 = iB17;
                    pVar.f10819i = cursorB.getLong(i21);
                    int i22 = iB18;
                    pVar.f10821k = cursorB.getInt(i22);
                    int i23 = iB19;
                    pVar.f10822l = v.d(cursorB.getInt(i23));
                    iB17 = i21;
                    int i24 = iB20;
                    pVar.f10823m = cursorB.getLong(i24);
                    int i25 = iB21;
                    pVar.f10824n = cursorB.getLong(i25);
                    iB21 = i25;
                    int i26 = iB22;
                    pVar.f10825o = cursorB.getLong(i26);
                    int i27 = iB23;
                    pVar.f10826p = cursorB.getLong(i27);
                    int i28 = iB24;
                    pVar.f10827q = cursorB.getInt(i28) != 0;
                    int i29 = iB25;
                    pVar.f10828r = v.f(cursorB.getInt(i29));
                    pVar.f10820j = bVar;
                    arrayList.add(pVar);
                    iB25 = i29;
                    iB2 = i14;
                    iB12 = i18;
                    iB15 = i17;
                    iB16 = i19;
                    iB18 = i22;
                    iB23 = i27;
                    iB9 = i11;
                    iB11 = i12;
                    iB = i13;
                    iB24 = i28;
                    iB22 = i26;
                    iB3 = i15;
                    iB20 = i24;
                    iB4 = i20;
                    iB19 = i23;
                }
                cursorB.close();
                hVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                hVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = hVarD;
        }
    }

    @Override // Z0.q
    public void p(String str, androidx.work.b bVar) throws Throwable {
        this.f10831a.b();
        G0.f fVarA = this.f10834d.a();
        byte[] bArrN = androidx.work.b.n(bVar);
        if (bArrN == null) {
            fVarA.X(1);
        } else {
            fVarA.S(1, bArrN);
        }
        if (str == null) {
            fVarA.X(2);
        } else {
            fVarA.x(2, str);
        }
        this.f10831a.c();
        try {
            fVarA.E();
            this.f10831a.r();
        } finally {
            this.f10831a.g();
            this.f10834d.f(fVarA);
        }
    }

    @Override // Z0.q
    public List q() throws Throwable {
        C0.h hVar;
        C0.h hVarD = C0.h.d("SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1", 0);
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            int iB = E0.b.b(cursorB, "required_network_type");
            int iB2 = E0.b.b(cursorB, "requires_charging");
            int iB3 = E0.b.b(cursorB, "requires_device_idle");
            int iB4 = E0.b.b(cursorB, "requires_battery_not_low");
            int iB5 = E0.b.b(cursorB, "requires_storage_not_low");
            int iB6 = E0.b.b(cursorB, "trigger_content_update_delay");
            int iB7 = E0.b.b(cursorB, "trigger_max_content_delay");
            int iB8 = E0.b.b(cursorB, "content_uri_triggers");
            int iB9 = E0.b.b(cursorB, Name.MARK);
            int iB10 = E0.b.b(cursorB, "state");
            int iB11 = E0.b.b(cursorB, "worker_class_name");
            int iB12 = E0.b.b(cursorB, "input_merger_class_name");
            int iB13 = E0.b.b(cursorB, "input");
            int iB14 = E0.b.b(cursorB, "output");
            hVar = hVarD;
            try {
                int iB15 = E0.b.b(cursorB, "initial_delay");
                int iB16 = E0.b.b(cursorB, "interval_duration");
                int iB17 = E0.b.b(cursorB, "flex_duration");
                int iB18 = E0.b.b(cursorB, "run_attempt_count");
                int iB19 = E0.b.b(cursorB, "backoff_policy");
                int iB20 = E0.b.b(cursorB, "backoff_delay_duration");
                int iB21 = E0.b.b(cursorB, "period_start_time");
                int iB22 = E0.b.b(cursorB, "minimum_retention_duration");
                int iB23 = E0.b.b(cursorB, "schedule_requested_at");
                int iB24 = E0.b.b(cursorB, "run_in_foreground");
                int iB25 = E0.b.b(cursorB, "out_of_quota_policy");
                int i9 = iB14;
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(iB9);
                    int i10 = iB9;
                    String string2 = cursorB.getString(iB11);
                    int i11 = iB11;
                    Q0.b bVar = new Q0.b();
                    int i12 = iB;
                    bVar.k(v.e(cursorB.getInt(iB)));
                    bVar.m(cursorB.getInt(iB2) != 0);
                    bVar.n(cursorB.getInt(iB3) != 0);
                    bVar.l(cursorB.getInt(iB4) != 0);
                    bVar.o(cursorB.getInt(iB5) != 0);
                    int i13 = iB2;
                    int i14 = iB3;
                    bVar.p(cursorB.getLong(iB6));
                    bVar.q(cursorB.getLong(iB7));
                    bVar.j(v.b(cursorB.getBlob(iB8)));
                    p pVar = new p(string, string2);
                    pVar.f10812b = v.g(cursorB.getInt(iB10));
                    pVar.f10814d = cursorB.getString(iB12);
                    pVar.f10815e = androidx.work.b.g(cursorB.getBlob(iB13));
                    int i15 = i9;
                    pVar.f10816f = androidx.work.b.g(cursorB.getBlob(i15));
                    i9 = i15;
                    int i16 = iB15;
                    pVar.f10817g = cursorB.getLong(i16);
                    int i17 = iB13;
                    int i18 = iB16;
                    pVar.f10818h = cursorB.getLong(i18);
                    int i19 = iB4;
                    int i20 = iB17;
                    pVar.f10819i = cursorB.getLong(i20);
                    int i21 = iB18;
                    pVar.f10821k = cursorB.getInt(i21);
                    int i22 = iB19;
                    pVar.f10822l = v.d(cursorB.getInt(i22));
                    iB17 = i20;
                    int i23 = iB20;
                    pVar.f10823m = cursorB.getLong(i23);
                    int i24 = iB21;
                    pVar.f10824n = cursorB.getLong(i24);
                    iB21 = i24;
                    int i25 = iB22;
                    pVar.f10825o = cursorB.getLong(i25);
                    int i26 = iB23;
                    pVar.f10826p = cursorB.getLong(i26);
                    int i27 = iB24;
                    pVar.f10827q = cursorB.getInt(i27) != 0;
                    int i28 = iB25;
                    pVar.f10828r = v.f(cursorB.getInt(i28));
                    pVar.f10820j = bVar;
                    arrayList.add(pVar);
                    iB25 = i28;
                    iB2 = i13;
                    iB13 = i17;
                    iB15 = i16;
                    iB16 = i18;
                    iB18 = i21;
                    iB23 = i26;
                    iB9 = i10;
                    iB11 = i11;
                    iB = i12;
                    iB24 = i27;
                    iB22 = i25;
                    iB3 = i14;
                    iB20 = i23;
                    iB4 = i19;
                    iB19 = i22;
                }
                cursorB.close();
                hVar.h();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorB.close();
                hVar.h();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = hVarD;
        }
    }

    @Override // Z0.q
    public boolean r() {
        boolean z9 = false;
        C0.h hVarD = C0.h.d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0);
        this.f10831a.b();
        Cursor cursorB = E0.c.b(this.f10831a, hVarD, false, null);
        try {
            if (cursorB.moveToFirst()) {
                if (cursorB.getInt(0) != 0) {
                    z9 = true;
                }
            }
            return z9;
        } finally {
            cursorB.close();
            hVarD.h();
        }
    }

    @Override // Z0.q
    public int s(String str) {
        this.f10831a.b();
        G0.f fVarA = this.f10837g.a();
        if (str == null) {
            fVarA.X(1);
        } else {
            fVarA.x(1, str);
        }
        this.f10831a.c();
        try {
            int iE = fVarA.E();
            this.f10831a.r();
            return iE;
        } finally {
            this.f10831a.g();
            this.f10837g.f(fVarA);
        }
    }

    @Override // Z0.q
    public int t(String str) {
        this.f10831a.b();
        G0.f fVarA = this.f10836f.a();
        if (str == null) {
            fVarA.X(1);
        } else {
            fVarA.x(1, str);
        }
        this.f10831a.c();
        try {
            int iE = fVarA.E();
            this.f10831a.r();
            return iE;
        } finally {
            this.f10831a.g();
            this.f10836f.f(fVarA);
        }
    }

    @Override // Z0.q
    public void u(String str, long j9) {
        this.f10831a.b();
        G0.f fVarA = this.f10835e.a();
        fVarA.A(1, j9);
        if (str == null) {
            fVarA.X(2);
        } else {
            fVarA.x(2, str);
        }
        this.f10831a.c();
        try {
            fVarA.E();
            this.f10831a.r();
        } finally {
            this.f10831a.g();
            this.f10835e.f(fVarA);
        }
    }
}
