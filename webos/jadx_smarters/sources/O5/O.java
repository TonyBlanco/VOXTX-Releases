package O5;

import Q5.B;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.Executor;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C0953q f6535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T5.e f6536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.b f6537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final P5.c f6538d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final P5.h f6539e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final y f6540f;

    public O(C0953q c0953q, T5.e eVar, U5.b bVar, P5.c cVar, P5.h hVar, y yVar) {
        this.f6535a = c0953q;
        this.f6536b = eVar;
        this.f6537c = bVar;
        this.f6538d = cVar;
        this.f6539e = hVar;
        this.f6540f = yVar;
    }

    public static B.a e(ApplicationExitInfo applicationExitInfo) {
        String strF = null;
        try {
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            if (traceInputStream != null) {
                strF = f(traceInputStream);
            }
        } catch (IOException e9) {
            L5.f.f().k("Could not get input trace in application exit info: " + applicationExitInfo.toString() + " Error: " + e9);
        }
        return B.a.a().c(applicationExitInfo.getImportance()).e(applicationExitInfo.getProcessName()).g(applicationExitInfo.getReason()).i(applicationExitInfo.getTimestamp()).d(applicationExitInfo.getPid()).f(applicationExitInfo.getPss()).h(applicationExitInfo.getRss()).j(strF).a();
    }

    public static String f(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[Segment.SIZE];
        while (true) {
            int i9 = inputStream.read(bArr);
            if (i9 == -1) {
                return byteArrayOutputStream.toString(StandardCharsets.UTF_8.name());
            }
            byteArrayOutputStream.write(bArr, 0, i9);
        }
    }

    public static O g(Context context, y yVar, T5.f fVar, C0937a c0937a, P5.c cVar, P5.h hVar, W5.d dVar, V5.i iVar, D d9, C0946j c0946j) {
        return new O(new C0953q(context, yVar, c0937a, dVar, iVar), new T5.e(fVar, iVar, c0946j), U5.b.b(context, iVar, d9), cVar, hVar, yVar);
    }

    public static List l(Map map) {
        ArrayList arrayList = new ArrayList();
        arrayList.ensureCapacity(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(B.c.a().b((String) entry.getKey()).c((String) entry.getValue()).a());
        }
        Collections.sort(arrayList, new Comparator() { // from class: O5.M
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return O.n((B.c) obj, (B.c) obj2);
            }
        });
        return arrayList;
    }

    public static /* synthetic */ int n(B.c cVar, B.c cVar2) {
        return cVar.b().compareTo(cVar2.b());
    }

    public final B.e.d c(B.e.d dVar) {
        return d(dVar, this.f6538d, this.f6539e);
    }

    public final B.e.d d(B.e.d dVar, P5.c cVar, P5.h hVar) {
        B.e.d.b bVarG = dVar.g();
        String strC = cVar.c();
        if (strC != null) {
            bVarG.d(B.e.d.AbstractC0107d.a().b(strC).a());
        } else {
            L5.f.f().i("No log data to include with this event.");
        }
        List listL = l(hVar.d());
        List listL2 = l(hVar.e());
        if (!listL.isEmpty() || !listL2.isEmpty()) {
            bVarG.b(dVar.b().g().c(Q5.C.a(listL)).e(Q5.C.a(listL2)).a());
        }
        return bVarG.a();
    }

    public final r h(r rVar) {
        if (rVar.b().f() != null) {
            return rVar;
        }
        return r.a(rVar.b().q(this.f6540f.d()), rVar.d(), rVar.c());
    }

    public void i(String str, List list, B.a aVar) {
        L5.f.f().b("SessionReportingCoordinator#finalizeSessionWithNativeEvent");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            B.d.b bVarA = ((B) it.next()).a();
            if (bVarA != null) {
                arrayList.add(bVarA);
            }
        }
        this.f6536b.l(str, B.d.a().b(Q5.C.a(arrayList)).a(), aVar);
    }

    public void j(long j9, String str) {
        this.f6536b.k(str, j9);
    }

    public final ApplicationExitInfo k(String str, List list) {
        long jQ = this.f6536b.q(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = a1.d.a(it.next());
            if (applicationExitInfoA.getTimestamp() < jQ) {
                return null;
            }
            if (applicationExitInfoA.getReason() == 6) {
                return applicationExitInfoA;
            }
        }
        return null;
    }

    public boolean m() {
        return this.f6536b.r();
    }

    public SortedSet o() {
        return this.f6536b.p();
    }

    public void p(String str, long j9) {
        this.f6536b.z(this.f6535a.e(str, j9));
    }

    public final boolean q(Task task) {
        if (!task.isSuccessful()) {
            L5.f.f().l("Crashlytics report could not be enqueued to DataTransport", task.getException());
            return false;
        }
        r rVar = (r) task.getResult();
        L5.f.f().b("Crashlytics report successfully enqueued to DataTransport: " + rVar.d());
        File fileC = rVar.c();
        if (fileC.delete()) {
            L5.f.f().b("Deleted report file: " + fileC.getPath());
            return true;
        }
        L5.f.f().k("Crashlytics could not delete report file: " + fileC.getPath());
        return true;
    }

    public final void r(Throwable th, Thread thread, String str, String str2, long j9, boolean z9) {
        this.f6536b.y(c(this.f6535a.d(th, thread, str2, j9, 4, 8, z9)), str, str2.equals("crash"));
    }

    public void s(Throwable th, Thread thread, String str, long j9) {
        L5.f.f().i("Persisting fatal event for session " + str);
        r(th, thread, str, "crash", j9, true);
    }

    public void t(String str, List list, P5.c cVar, P5.h hVar) {
        ApplicationExitInfo applicationExitInfoK = k(str, list);
        if (applicationExitInfoK == null) {
            L5.f.f().i("No relevant ApplicationExitInfo occurred during session: " + str);
            return;
        }
        B.e.d dVarC = this.f6535a.c(e(applicationExitInfoK));
        L5.f.f().b("Persisting anr for session " + str);
        this.f6536b.y(d(dVarC, cVar, hVar), str, true);
    }

    public void u() {
        this.f6536b.i();
    }

    public Task v(Executor executor) {
        return w(executor, null);
    }

    public Task w(Executor executor, String str) {
        List<r> listW = this.f6536b.w();
        ArrayList arrayList = new ArrayList();
        for (r rVar : listW) {
            if (str == null || str.equals(rVar.d())) {
                arrayList.add(this.f6537c.c(h(rVar), str != null).continueWith(executor, new Continuation() { // from class: O5.N
                    @Override // com.google.android.gms.tasks.Continuation
                    public final Object then(Task task) {
                        return Boolean.valueOf(this.f6534a.q(task));
                    }
                }));
            }
        }
        return Tasks.whenAll(arrayList);
    }
}
