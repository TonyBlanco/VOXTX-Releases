package androidx.work.impl.workers;

import Q0.k;
import R0.j;
import Z0.g;
import Z0.h;
import Z0.p;
import Z0.q;
import Z0.t;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.ListenableWorker;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class DiagnosticsWorker extends Worker {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f17417h = k.f("DiagnosticsWrkr");

    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
    }

    public static String s(p pVar, String str, Integer num, String str2) {
        return String.format("\n%s\t %s\t %s\t %s\t %s\t %s\t", pVar.f10811a, pVar.f10813c, num, pVar.f10812b.name(), str, str2);
    }

    public static String t(Z0.k kVar, t tVar, h hVar, List list) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("\n Id \t Class Name\t %s\t State\t Unique Name\t Tags\t", Build.VERSION.SDK_INT >= 23 ? "Job Id" : "Alarm Id"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            g gVarA = hVar.a(pVar.f10811a);
            sb.append(s(pVar, TextUtils.join(",", kVar.a(pVar.f10811a)), gVarA != null ? Integer.valueOf(gVarA.f10791b) : null, TextUtils.join(",", tVar.a(pVar.f10811a))));
        }
        return sb.toString();
    }

    @Override // androidx.work.Worker
    public ListenableWorker.a r() {
        WorkDatabase workDatabaseQ = j.m(a()).q();
        q qVarB = workDatabaseQ.B();
        Z0.k kVarZ = workDatabaseQ.z();
        t tVarC = workDatabaseQ.C();
        h hVarY = workDatabaseQ.y();
        List listB = qVarB.b(System.currentTimeMillis() - TimeUnit.DAYS.toMillis(1L));
        List listQ = qVarB.q();
        List listK = qVarB.k(200);
        if (listB != null && !listB.isEmpty()) {
            k kVarC = k.c();
            String str = f17417h;
            kVarC.d(str, "Recently completed work:\n\n", new Throwable[0]);
            k.c().d(str, t(kVarZ, tVarC, hVarY, listB), new Throwable[0]);
        }
        if (listQ != null && !listQ.isEmpty()) {
            k kVarC2 = k.c();
            String str2 = f17417h;
            kVarC2.d(str2, "Running work:\n\n", new Throwable[0]);
            k.c().d(str2, t(kVarZ, tVarC, hVarY, listQ), new Throwable[0]);
        }
        if (listK != null && !listK.isEmpty()) {
            k kVarC3 = k.c();
            String str3 = f17417h;
            kVarC3.d(str3, "Enqueued work:\n\n", new Throwable[0]);
            k.c().d(str3, t(kVarZ, tVarC, hVarY, listK), new Throwable[0]);
        }
        return ListenableWorker.a.c();
    }
}
