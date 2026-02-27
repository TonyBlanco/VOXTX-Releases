package a1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f11455a;

    public h(WorkDatabase workDatabase) {
        this.f11455a = workDatabase;
    }

    public static void b(Context context, G0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.preferences", 0);
        if (sharedPreferences.contains("reschedule_needed") || sharedPreferences.contains("last_cancel_all_time_ms")) {
            long j9 = sharedPreferences.getLong("last_cancel_all_time_ms", 0L);
            long j10 = sharedPreferences.getBoolean("reschedule_needed", false) ? 1L : 0L;
            bVar.u();
            try {
                bVar.H("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"last_cancel_all_time_ms", Long.valueOf(j9)});
                bVar.H("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", Long.valueOf(j10)});
                sharedPreferences.edit().clear().apply();
                bVar.G();
            } finally {
                bVar.I();
            }
        }
    }

    public boolean a() {
        Long lB = this.f11455a.x().b("reschedule_needed");
        return lB != null && lB.longValue() == 1;
    }

    public void c(boolean z9) {
        this.f11455a.x().a(new Z0.d("reschedule_needed", z9));
    }
}
