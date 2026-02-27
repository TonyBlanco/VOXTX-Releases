package R0;

import U0.m;
import Z0.p;
import Z0.q;
import android.content.Context;
import android.os.Build;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemalarm.SystemAlarmService;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f8476a = Q0.k.f("Schedulers");

    public static e a(Context context, j jVar) {
        if (Build.VERSION.SDK_INT >= 23) {
            m mVar = new m(context, jVar);
            a1.g.a(context, SystemJobService.class, true);
            Q0.k.c().a(f8476a, "Created SystemJobScheduler and enabled SystemJobService", new Throwable[0]);
            return mVar;
        }
        e eVarC = c(context);
        if (eVarC != null) {
            return eVarC;
        }
        T0.b bVar = new T0.b(context);
        a1.g.a(context, SystemAlarmService.class, true);
        Q0.k.c().a(f8476a, "Created SystemAlarmScheduler", new Throwable[0]);
        return bVar;
    }

    public static void b(androidx.work.a aVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q qVarB = workDatabase.B();
        workDatabase.c();
        try {
            List listO = qVarB.o(aVar.h());
            List listK = qVarB.k(200);
            if (listO != null && listO.size() > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                Iterator it = listO.iterator();
                while (it.hasNext()) {
                    qVarB.m(((p) it.next()).f10811a, jCurrentTimeMillis);
                }
            }
            workDatabase.r();
            workDatabase.g();
            if (listO != null && listO.size() > 0) {
                p[] pVarArr = (p[]) listO.toArray(new p[listO.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    e eVar = (e) it2.next();
                    if (eVar.c()) {
                        eVar.e(pVarArr);
                    }
                }
            }
            if (listK == null || listK.size() <= 0) {
                return;
            }
            p[] pVarArr2 = (p[]) listK.toArray(new p[listK.size()]);
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                e eVar2 = (e) it3.next();
                if (!eVar2.c()) {
                    eVar2.e(pVarArr2);
                }
            }
        } catch (Throwable th) {
            workDatabase.g();
            throw th;
        }
    }

    public static e c(Context context) {
        try {
            e eVar = (e) Class.forName("androidx.work.impl.background.gcm.GcmScheduler").getConstructor(Context.class).newInstance(context);
            Q0.k.c().a(f8476a, String.format("Created %s", "androidx.work.impl.background.gcm.GcmScheduler"), new Throwable[0]);
            return eVar;
        } catch (Throwable th) {
            Q0.k.c().a(f8476a, "Unable to create GCM Scheduler", th);
            return null;
        }
    }
}
