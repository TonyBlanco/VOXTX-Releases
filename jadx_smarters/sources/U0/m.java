package U0;

import Q0.t;
import Z0.q;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class m implements R0.e {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f9587f = Q0.k.f("SystemJobScheduler");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f9588a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final JobScheduler f9589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final R0.j f9590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l f9591e;

    public m(Context context, R0.j jVar) {
        this(context, jVar, (JobScheduler) context.getSystemService("jobscheduler"), new l(context));
    }

    public m(Context context, R0.j jVar, JobScheduler jobScheduler, l lVar) {
        this.f9588a = context;
        this.f9590d = jVar;
        this.f9589c = jobScheduler;
        this.f9591e = lVar;
    }

    public static void b(Context context) {
        List listG;
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        if (jobScheduler == null || (listG = g(context, jobScheduler)) == null || listG.isEmpty()) {
            return;
        }
        Iterator it = listG.iterator();
        while (it.hasNext()) {
            d(jobScheduler, ((JobInfo) it.next()).getId());
        }
    }

    public static void d(JobScheduler jobScheduler, int i9) {
        try {
            jobScheduler.cancel(i9);
        } catch (Throwable th) {
            Q0.k.c().b(f9587f, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i9)), th);
        }
    }

    public static List f(Context context, JobScheduler jobScheduler, String str) {
        List<JobInfo> listG = g(context, jobScheduler);
        if (listG == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(2);
        for (JobInfo jobInfo : listG) {
            if (str.equals(h(jobInfo))) {
                arrayList.add(Integer.valueOf(jobInfo.getId()));
            }
        }
        return arrayList;
    }

    public static List g(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
        } catch (Throwable th) {
            Q0.k.c().b(f9587f, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static String h(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return extras.getString("EXTRA_WORK_SPEC_ID");
            }
            return null;
        } catch (NullPointerException unused) {
            return null;
        }
    }

    public static boolean i(Context context, R0.j jVar) {
        JobScheduler jobScheduler = (JobScheduler) context.getSystemService("jobscheduler");
        List<JobInfo> listG = g(context, jobScheduler);
        List listB = jVar.q().y().b();
        boolean z9 = false;
        HashSet hashSet = new HashSet(listG != null ? listG.size() : 0);
        if (listG != null && !listG.isEmpty()) {
            for (JobInfo jobInfo : listG) {
                String strH = h(jobInfo);
                if (TextUtils.isEmpty(strH)) {
                    d(jobScheduler, jobInfo.getId());
                } else {
                    hashSet.add(strH);
                }
            }
        }
        Iterator it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!hashSet.contains((String) it.next())) {
                Q0.k.c().a(f9587f, "Reconciling jobs", new Throwable[0]);
                z9 = true;
                break;
            }
        }
        if (z9) {
            WorkDatabase workDatabaseQ = jVar.q();
            workDatabaseQ.c();
            try {
                q qVarB = workDatabaseQ.B();
                Iterator it2 = listB.iterator();
                while (it2.hasNext()) {
                    qVarB.m((String) it2.next(), -1L);
                }
                workDatabaseQ.r();
                workDatabaseQ.g();
            } catch (Throwable th) {
                workDatabaseQ.g();
                throw th;
            }
        }
        return z9;
    }

    @Override // R0.e
    public void a(String str) {
        List listF = f(this.f9588a, this.f9589c, str);
        if (listF == null || listF.isEmpty()) {
            return;
        }
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            d(this.f9589c, ((Integer) it.next()).intValue());
        }
        this.f9590d.q().y().d(str);
    }

    @Override // R0.e
    public boolean c() {
        return true;
    }

    @Override // R0.e
    public void e(Z0.p... pVarArr) {
        List listF;
        WorkDatabase workDatabaseQ = this.f9590d.q();
        a1.f fVar = new a1.f(workDatabaseQ);
        for (Z0.p pVar : pVarArr) {
            workDatabaseQ.c();
            try {
                Z0.p pVarH = workDatabaseQ.B().h(pVar.f10811a);
                if (pVarH == null) {
                    Q0.k.c().h(f9587f, "Skipping scheduling " + pVar.f10811a + " because it's no longer in the DB", new Throwable[0]);
                } else if (pVarH.f10812b != t.ENQUEUED) {
                    Q0.k.c().h(f9587f, "Skipping scheduling " + pVar.f10811a + " because it is no longer enqueued", new Throwable[0]);
                } else {
                    Z0.g gVarA = workDatabaseQ.y().a(pVar.f10811a);
                    int iD = gVarA != null ? gVarA.f10791b : fVar.d(this.f9590d.k().i(), this.f9590d.k().g());
                    if (gVarA == null) {
                        this.f9590d.q().y().c(new Z0.g(pVar.f10811a, iD));
                    }
                    j(pVar, iD);
                    if (Build.VERSION.SDK_INT == 23 && (listF = f(this.f9588a, this.f9589c, pVar.f10811a)) != null) {
                        int iIndexOf = listF.indexOf(Integer.valueOf(iD));
                        if (iIndexOf >= 0) {
                            listF.remove(iIndexOf);
                        }
                        j(pVar, !listF.isEmpty() ? ((Integer) listF.get(0)).intValue() : fVar.d(this.f9590d.k().i(), this.f9590d.k().g()));
                    }
                }
                workDatabaseQ.r();
            } finally {
                workDatabaseQ.g();
            }
        }
    }

    public void j(Z0.p pVar, int i9) {
        JobInfo jobInfoA = this.f9591e.a(pVar, i9);
        Q0.k kVarC = Q0.k.c();
        String str = f9587f;
        kVarC.a(str, String.format("Scheduling work ID %s Job ID %s", pVar.f10811a, Integer.valueOf(i9)), new Throwable[0]);
        try {
            if (this.f9589c.schedule(jobInfoA) == 0) {
                Q0.k.c().h(str, String.format("Unable to schedule work ID %s", pVar.f10811a), new Throwable[0]);
                if (pVar.f10827q && pVar.f10828r == Q0.o.RUN_AS_NON_EXPEDITED_WORK_REQUEST) {
                    pVar.f10827q = false;
                    Q0.k.c().a(str, String.format("Scheduling a non-expedited job (work ID %s)", pVar.f10811a), new Throwable[0]);
                    j(pVar, i9);
                }
            }
        } catch (IllegalStateException e9) {
            List listG = g(this.f9588a, this.f9589c);
            String str2 = String.format(Locale.getDefault(), "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d.", Integer.valueOf(listG != null ? listG.size() : 0), Integer.valueOf(this.f9590d.q().B().c().size()), Integer.valueOf(this.f9590d.k().h()));
            Q0.k.c().b(f9587f, str2, new Throwable[0]);
            throw new IllegalStateException(str2, e9);
        } catch (Throwable th) {
            Q0.k.c().b(f9587f, String.format("Unable to schedule %s", pVar), th);
        }
    }
}
