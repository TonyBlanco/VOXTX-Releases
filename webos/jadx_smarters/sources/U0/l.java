package U0;

import Q0.c;
import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f9584b = Q0.k.f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ComponentName f9585a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9586a;

        static {
            int[] iArr = new int[Q0.l.values().length];
            f9586a = iArr;
            try {
                iArr[Q0.l.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9586a[Q0.l.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9586a[Q0.l.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9586a[Q0.l.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9586a[Q0.l.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public l(Context context) {
        this.f9585a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    public static JobInfo.TriggerContentUri b(c.a aVar) {
        boolean zB = aVar.b();
        k.a();
        return j.a(aVar.a(), zB ? 1 : 0);
    }

    public static int c(Q0.l lVar) {
        int i9 = a.f9586a[lVar.ordinal()];
        if (i9 == 1) {
            return 0;
        }
        if (i9 == 2) {
            return 1;
        }
        if (i9 == 3) {
            return 2;
        }
        if (i9 != 4) {
            if (i9 == 5 && Build.VERSION.SDK_INT >= 26) {
                return 4;
            }
        } else if (Build.VERSION.SDK_INT >= 24) {
            return 3;
        }
        Q0.k.c().a(f9584b, String.format("API version too low. Cannot convert network type value %s", lVar), new Throwable[0]);
        return 1;
    }

    public static void d(JobInfo.Builder builder, Q0.l lVar) {
        if (Build.VERSION.SDK_INT < 30 || lVar != Q0.l.TEMPORARILY_UNMETERED) {
            builder.setRequiredNetworkType(c(lVar));
        } else {
            builder.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
        }
    }

    public JobInfo a(Z0.p pVar, int i9) {
        Q0.b bVar = pVar.f10820j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", pVar.f10811a);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", pVar.d());
        JobInfo.Builder extras = new JobInfo.Builder(i9, this.f9585a).setRequiresCharging(bVar.g()).setRequiresDeviceIdle(bVar.h()).setExtras(persistableBundle);
        d(extras, bVar.b());
        if (!bVar.h()) {
            extras.setBackoffCriteria(pVar.f10823m, pVar.f10822l == Q0.a.LINEAR ? 0 : 1);
        }
        long jMax = Math.max(pVar.a() - System.currentTimeMillis(), 0L);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!pVar.f10827q) {
            extras.setImportantWhileForeground(true);
        }
        if (i10 >= 24 && bVar.e()) {
            Iterator it = bVar.a().b().iterator();
            while (it.hasNext()) {
                extras.addTriggerContentUri(b((c.a) it.next()));
            }
            extras.setTriggerContentUpdateDelay(bVar.c());
            extras.setTriggerContentMaxDelay(bVar.d());
        }
        extras.setPersisted(false);
        if (Build.VERSION.SDK_INT >= 26) {
            extras.setRequiresBatteryNotLow(bVar.f());
            extras.setRequiresStorageNotLow(bVar.i());
        }
        boolean z9 = pVar.f10821k > 0;
        if (L.a.c() && pVar.f10827q && !z9) {
            extras.setExpedited(true);
        }
        return extras.build();
    }
}
