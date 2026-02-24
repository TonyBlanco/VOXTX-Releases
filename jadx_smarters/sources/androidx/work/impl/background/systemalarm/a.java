package androidx.work.impl.background.systemalarm;

import Q0.k;
import Z0.p;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class a implements R0.b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f17334e = k.f("CommandHandler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f17335a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f17336c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f17337d = new Object();

    public a(Context context) {
        this.f17335a = context;
    }

    public static Intent a(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    public static Intent b(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent c(Context context, String str, boolean z9) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z9);
        return intent;
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_RESCHEDULE");
        return intent;
    }

    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static Intent g(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        intent.putExtra("KEY_WORKSPEC_ID", str);
        return intent;
    }

    public static boolean n(Bundle bundle, String... strArr) {
        if (bundle == null || bundle.isEmpty()) {
            return false;
        }
        for (String str : strArr) {
            if (bundle.get(str) == null) {
                return false;
            }
        }
        return true;
    }

    @Override // R0.b
    public void d(String str, boolean z9) {
        synchronized (this.f17337d) {
            try {
                R0.b bVar = (R0.b) this.f17336c.remove(str);
                if (bVar != null) {
                    bVar.d(str, z9);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void h(Intent intent, int i9, d dVar) {
        k.c().a(f17334e, String.format("Handling constraints changed %s", intent), new Throwable[0]);
        new b(this.f17335a, i9, dVar).a();
    }

    public final void i(Intent intent, int i9, d dVar) {
        Bundle extras = intent.getExtras();
        synchronized (this.f17337d) {
            try {
                String string = extras.getString("KEY_WORKSPEC_ID");
                k kVarC = k.c();
                String str = f17334e;
                kVarC.a(str, String.format("Handing delay met for %s", string), new Throwable[0]);
                if (this.f17336c.containsKey(string)) {
                    k.c().a(str, String.format("WorkSpec %s is already being handled for ACTION_DELAY_MET", string), new Throwable[0]);
                } else {
                    c cVar = new c(this.f17335a, i9, string, dVar);
                    this.f17336c.put(string, cVar);
                    cVar.e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void j(Intent intent, int i9) {
        Bundle extras = intent.getExtras();
        String string = extras.getString("KEY_WORKSPEC_ID");
        boolean z9 = extras.getBoolean("KEY_NEEDS_RESCHEDULE");
        k.c().a(f17334e, String.format("Handling onExecutionCompleted %s, %s", intent, Integer.valueOf(i9)), new Throwable[0]);
        d(string, z9);
    }

    public final void k(Intent intent, int i9, d dVar) {
        k.c().a(f17334e, String.format("Handling reschedule %s, %s", intent, Integer.valueOf(i9)), new Throwable[0]);
        dVar.g().u();
    }

    public final void l(Intent intent, int i9, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        k kVarC = k.c();
        String str = f17334e;
        kVarC.a(str, String.format("Handling schedule work for %s", string), new Throwable[0]);
        WorkDatabase workDatabaseQ = dVar.g().q();
        workDatabaseQ.c();
        try {
            p pVarH = workDatabaseQ.B().h(string);
            if (pVarH == null) {
                k.c().h(str, "Skipping scheduling " + string + " because it's no longer in the DB", new Throwable[0]);
                return;
            }
            if (pVarH.f10812b.isFinished()) {
                k.c().h(str, "Skipping scheduling " + string + "because it is finished.", new Throwable[0]);
                return;
            }
            long jA = pVarH.a();
            if (pVarH.b()) {
                k.c().a(str, String.format("Opportunistically setting an alarm for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                T0.a.c(this.f17335a, dVar.g(), string, jA);
                dVar.k(new d.b(dVar, a(this.f17335a), i9));
            } else {
                k.c().a(str, String.format("Setting up Alarms for %s at %s", string, Long.valueOf(jA)), new Throwable[0]);
                T0.a.c(this.f17335a, dVar.g(), string, jA);
            }
            workDatabaseQ.r();
        } finally {
            workDatabaseQ.g();
        }
    }

    public final void m(Intent intent, d dVar) {
        String string = intent.getExtras().getString("KEY_WORKSPEC_ID");
        k.c().a(f17334e, String.format("Handing stopWork work for %s", string), new Throwable[0]);
        dVar.g().z(string);
        T0.a.a(this.f17335a, dVar.g(), string);
        dVar.d(string, false);
    }

    public boolean o() {
        boolean z9;
        synchronized (this.f17337d) {
            z9 = !this.f17336c.isEmpty();
        }
        return z9;
    }

    public void p(Intent intent, int i9, d dVar) {
        String action = intent.getAction();
        if ("ACTION_CONSTRAINTS_CHANGED".equals(action)) {
            h(intent, i9, dVar);
            return;
        }
        if ("ACTION_RESCHEDULE".equals(action)) {
            k(intent, i9, dVar);
            return;
        }
        if (!n(intent.getExtras(), "KEY_WORKSPEC_ID")) {
            k.c().b(f17334e, String.format("Invalid request for %s, requires %s.", action, "KEY_WORKSPEC_ID"), new Throwable[0]);
            return;
        }
        if ("ACTION_SCHEDULE_WORK".equals(action)) {
            l(intent, i9, dVar);
            return;
        }
        if ("ACTION_DELAY_MET".equals(action)) {
            i(intent, i9, dVar);
            return;
        }
        if ("ACTION_STOP_WORK".equals(action)) {
            m(intent, dVar);
        } else if ("ACTION_EXECUTION_COMPLETED".equals(action)) {
            j(intent, i9);
        } else {
            k.c().h(f17334e, String.format("Ignoring intent %s", intent), new Throwable[0]);
        }
    }
}
