package androidx.work.impl;

import C0.e;
import C0.g;
import E0.c;
import E0.f;
import G0.c;
import Z0.b;
import Z0.e;
import Z0.h;
import Z0.i;
import Z0.k;
import Z0.l;
import Z0.n;
import Z0.o;
import Z0.q;
import Z0.r;
import Z0.t;
import Z0.u;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.simpleframework.xml.strategy.Name;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile q f17307m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public volatile b f17308n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public volatile t f17309o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile h f17310p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile k f17311q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile n f17312r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile e f17313s;

    public class a extends g.a {
        public a(int i9) {
            super(i9);
        }

        @Override // C0.g.a
        public void a(G0.b bVar) {
            bVar.C("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            bVar.C("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            bVar.C("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `period_start_time` INTEGER NOT NULL, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `required_network_type` INTEGER, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB, PRIMARY KEY(`id`))");
            bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `WorkSpec` (`period_start_time`)");
            bVar.C("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            bVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.C("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            bVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            bVar.C("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            bVar.C("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c103703e120ae8cc73c9248622f3cd1e')");
        }

        @Override // C0.g.a
        public void b(G0.b bVar) {
            bVar.C("DROP TABLE IF EXISTS `Dependency`");
            bVar.C("DROP TABLE IF EXISTS `WorkSpec`");
            bVar.C("DROP TABLE IF EXISTS `WorkTag`");
            bVar.C("DROP TABLE IF EXISTS `SystemIdInfo`");
            bVar.C("DROP TABLE IF EXISTS `WorkName`");
            bVar.C("DROP TABLE IF EXISTS `WorkProgress`");
            bVar.C("DROP TABLE IF EXISTS `Preference`");
            if (WorkDatabase_Impl.this.f892h != null) {
                int size = WorkDatabase_Impl.this.f892h.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((e.b) WorkDatabase_Impl.this.f892h.get(i9)).b(bVar);
                }
            }
        }

        @Override // C0.g.a
        public void c(G0.b bVar) {
            if (WorkDatabase_Impl.this.f892h != null) {
                int size = WorkDatabase_Impl.this.f892h.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((e.b) WorkDatabase_Impl.this.f892h.get(i9)).a(bVar);
                }
            }
        }

        @Override // C0.g.a
        public void d(G0.b bVar) {
            WorkDatabase_Impl.this.f885a = bVar;
            bVar.C("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.m(bVar);
            if (WorkDatabase_Impl.this.f892h != null) {
                int size = WorkDatabase_Impl.this.f892h.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((e.b) WorkDatabase_Impl.this.f892h.get(i9)).c(bVar);
                }
            }
        }

        @Override // C0.g.a
        public void e(G0.b bVar) {
        }

        @Override // C0.g.a
        public void f(G0.b bVar) {
            c.a(bVar);
        }

        @Override // C0.g.a
        public g.b g(G0.b bVar) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new f.a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            hashSet.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList(Name.MARK)));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new f.d("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id")));
            hashSet2.add(new f.d("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id")));
            f fVar = new f("Dependency", map, hashSet, hashSet2);
            f fVarA = f.a(bVar, "Dependency");
            if (!fVar.equals(fVarA)) {
                return new g.b(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + fVar + "\n Found:\n" + fVarA);
            }
            HashMap map2 = new HashMap(25);
            map2.put(Name.MARK, new f.a(Name.MARK, "TEXT", true, 1, null, 1));
            map2.put("state", new f.a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new f.a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new f.a("input_merger_class_name", "TEXT", false, 0, null, 1));
            map2.put("input", new f.a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new f.a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new f.a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new f.a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new f.a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new f.a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new f.a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new f.a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("period_start_time", new f.a("period_start_time", "INTEGER", true, 0, null, 1));
            map2.put("minimum_retention_duration", new f.a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new f.a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new f.a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new f.a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("required_network_type", new f.a("required_network_type", "INTEGER", false, 0, null, 1));
            map2.put("requires_charging", new f.a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new f.a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new f.a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new f.a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new f.a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new f.a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new f.a("content_uri_triggers", "BLOB", false, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new f.d("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at")));
            hashSet4.add(new f.d("index_WorkSpec_period_start_time", false, Arrays.asList("period_start_time")));
            f fVar2 = new f("WorkSpec", map2, hashSet3, hashSet4);
            f fVarA2 = f.a(bVar, "WorkSpec");
            if (!fVar2.equals(fVarA2)) {
                return new g.b(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + fVar2 + "\n Found:\n" + fVarA2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new f.a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new f.d("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id")));
            f fVar3 = new f("WorkTag", map3, hashSet5, hashSet6);
            f fVarA3 = f.a(bVar, "WorkTag");
            if (!fVar3.equals(fVarA3)) {
                return new g.b(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + fVar3 + "\n Found:\n" + fVarA3);
            }
            HashMap map4 = new HashMap(2);
            map4.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("system_id", new f.a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            f fVar4 = new f("SystemIdInfo", map4, hashSet7, new HashSet(0));
            f fVarA4 = f.a(bVar, "SystemIdInfo");
            if (!fVar4.equals(fVarA4)) {
                return new g.b(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + fVar4 + "\n Found:\n" + fVarA4);
            }
            HashMap map5 = new HashMap(2);
            map5.put("name", new f.a("name", "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new f.d("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id")));
            f fVar5 = new f("WorkName", map5, hashSet8, hashSet9);
            f fVarA5 = f.a(bVar, "WorkName");
            if (!fVar5.equals(fVarA5)) {
                return new g.b(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + fVar5 + "\n Found:\n" + fVarA5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new f.a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new f.a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new f.b("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList(Name.MARK)));
            f fVar6 = new f("WorkProgress", map6, hashSet10, new HashSet(0));
            f fVarA6 = f.a(bVar, "WorkProgress");
            if (!fVar6.equals(fVarA6)) {
                return new g.b(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + fVar6 + "\n Found:\n" + fVarA6);
            }
            HashMap map7 = new HashMap(2);
            map7.put("key", new f.a("key", "TEXT", true, 1, null, 1));
            map7.put("long_value", new f.a("long_value", "INTEGER", false, 0, null, 1));
            f fVar7 = new f("Preference", map7, new HashSet(0), new HashSet(0));
            f fVarA7 = f.a(bVar, "Preference");
            if (fVar7.equals(fVarA7)) {
                return new g.b(true, null);
            }
            return new g.b(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + fVar7 + "\n Found:\n" + fVarA7);
        }
    }

    @Override // androidx.work.impl.WorkDatabase
    public n A() {
        n nVar;
        if (this.f17312r != null) {
            return this.f17312r;
        }
        synchronized (this) {
            try {
                if (this.f17312r == null) {
                    this.f17312r = new o(this);
                }
                nVar = this.f17312r;
            } catch (Throwable th) {
                throw th;
            }
        }
        return nVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public q B() {
        q qVar;
        if (this.f17307m != null) {
            return this.f17307m;
        }
        synchronized (this) {
            try {
                if (this.f17307m == null) {
                    this.f17307m = new r(this);
                }
                qVar = this.f17307m;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public t C() {
        t tVar;
        if (this.f17309o != null) {
            return this.f17309o;
        }
        synchronized (this) {
            try {
                if (this.f17309o == null) {
                    this.f17309o = new u(this);
                }
                tVar = this.f17309o;
            } catch (Throwable th) {
                throw th;
            }
        }
        return tVar;
    }

    @Override // C0.e
    public androidx.room.c e() {
        return new androidx.room.c(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // C0.e
    public G0.c f(C0.a aVar) {
        return aVar.f868a.a(c.b.a(aVar.f869b).c(aVar.f870c).b(new g(aVar, new a(12), "c103703e120ae8cc73c9248622f3cd1e", "49f946663a8deb7054212b8adda248c6")).a());
    }

    @Override // androidx.work.impl.WorkDatabase
    public b t() {
        b bVar;
        if (this.f17308n != null) {
            return this.f17308n;
        }
        synchronized (this) {
            try {
                if (this.f17308n == null) {
                    this.f17308n = new Z0.c(this);
                }
                bVar = this.f17308n;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public Z0.e x() {
        Z0.e eVar;
        if (this.f17313s != null) {
            return this.f17313s;
        }
        synchronized (this) {
            try {
                if (this.f17313s == null) {
                    this.f17313s = new Z0.f(this);
                }
                eVar = this.f17313s;
            } catch (Throwable th) {
                throw th;
            }
        }
        return eVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public h y() {
        h hVar;
        if (this.f17310p != null) {
            return this.f17310p;
        }
        synchronized (this) {
            try {
                if (this.f17310p == null) {
                    this.f17310p = new i(this);
                }
                hVar = this.f17310p;
            } catch (Throwable th) {
                throw th;
            }
        }
        return hVar;
    }

    @Override // androidx.work.impl.WorkDatabase
    public k z() {
        k kVar;
        if (this.f17311q != null) {
            return this.f17311q;
        }
        synchronized (this) {
            try {
                if (this.f17311q == null) {
                    this.f17311q = new l(this);
                }
                kVar = this.f17311q;
            } catch (Throwable th) {
                throw th;
            }
        }
        return kVar;
    }
}
