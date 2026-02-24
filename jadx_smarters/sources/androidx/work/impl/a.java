package androidx.work.impl;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static D0.a f17315a = new C0203a(1, 2);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static D0.a f17316b = new b(3, 4);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static D0.a f17317c = new c(4, 5);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static D0.a f17318d = new d(6, 7);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static D0.a f17319e = new e(7, 8);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static D0.a f17320f = new f(8, 9);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static D0.a f17321g = new g(11, 12);

    /* JADX INFO: renamed from: androidx.work.impl.a$a, reason: collision with other inner class name */
    public class C0203a extends D0.a {
        public C0203a(int i9, int i10) {
            super(i9, i10);
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            bVar.C("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            bVar.C("INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo");
            bVar.C("DROP TABLE IF EXISTS alarmInfo");
            bVar.C("INSERT OR IGNORE INTO worktag(tag, work_spec_id) SELECT worker_class_name AS tag, id AS work_spec_id FROM workspec");
        }
    }

    public class b extends D0.a {
        public b(int i9, int i10) {
            super(i9, i10);
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            if (Build.VERSION.SDK_INT >= 23) {
                bVar.C("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
            }
        }
    }

    public class c extends D0.a {
        public c(int i9, int i10) {
            super(i9, i10);
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            bVar.C("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
            bVar.C("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
        }
    }

    public class d extends D0.a {
        public d(int i9, int i10) {
            super(i9, i10);
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            bVar.C("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        }
    }

    public class e extends D0.a {
        public e(int i9, int i10) {
            super(i9, i10);
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            bVar.C("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
        }
    }

    public class f extends D0.a {
        public f(int i9, int i10) {
            super(i9, i10);
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            bVar.C("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public class g extends D0.a {
        public g(int i9, int i10) {
            super(i9, i10);
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            bVar.C("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
        }
    }

    public static class h extends D0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f17322c;

        public h(Context context, int i9, int i10) {
            super(i9, i10);
            this.f17322c = context;
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            if (this.f1312b >= 10) {
                bVar.H("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
            } else {
                this.f17322c.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
            }
        }
    }

    public static class i extends D0.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f17323c;

        public i(Context context) {
            super(9, 10);
            this.f17323c = context;
        }

        @Override // D0.a
        public void a(G0.b bVar) {
            bVar.C("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            a1.h.b(this.f17323c, bVar);
            a1.f.a(this.f17323c, bVar);
        }
    }
}
