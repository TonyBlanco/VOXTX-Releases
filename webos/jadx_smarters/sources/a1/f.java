package a1;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.work.impl.WorkDatabase;

/* JADX INFO: loaded from: classes.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WorkDatabase f11453a;

    public f(WorkDatabase workDatabase) {
        this.f11453a = workDatabase;
    }

    public static void a(Context context, G0.b bVar) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("androidx.work.util.id", 0);
        if (sharedPreferences.contains("next_job_scheduler_id") || sharedPreferences.contains("next_job_scheduler_id")) {
            int i9 = sharedPreferences.getInt("next_job_scheduler_id", 0);
            int i10 = sharedPreferences.getInt("next_alarm_manager_id", 0);
            bVar.u();
            try {
                bVar.H("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_job_scheduler_id", Integer.valueOf(i9)});
                bVar.H("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"next_alarm_manager_id", Integer.valueOf(i10)});
                sharedPreferences.edit().clear().apply();
                bVar.G();
            } finally {
                bVar.I();
            }
        }
    }

    public int b() {
        int iC;
        synchronized (f.class) {
            iC = c("next_alarm_manager_id");
        }
        return iC;
    }

    public final int c(String str) {
        this.f11453a.c();
        try {
            Long lB = this.f11453a.x().b(str);
            int i9 = 0;
            int iIntValue = lB != null ? lB.intValue() : 0;
            if (iIntValue != Integer.MAX_VALUE) {
                i9 = iIntValue + 1;
            }
            e(str, i9);
            this.f11453a.r();
            this.f11453a.g();
            return iIntValue;
        } catch (Throwable th) {
            this.f11453a.g();
            throw th;
        }
    }

    public int d(int i9, int i10) {
        synchronized (f.class) {
            int iC = c("next_job_scheduler_id");
            if (iC < i9 || iC > i10) {
                e("next_job_scheduler_id", i9 + 1);
            } else {
                i9 = iC;
            }
        }
        return i9;
    }

    public final void e(String str, int i9) {
        this.f11453a.x().a(new Z0.d(str, i9));
    }
}
