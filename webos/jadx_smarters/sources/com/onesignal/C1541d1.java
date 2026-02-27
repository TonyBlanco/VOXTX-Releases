package com.onesignal;

import com.amazonaws.mobileconnectors.s3.transferutility.TransferService;
import com.onesignal.F1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.onesignal.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1541d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Set f38693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final R7.c f38694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C1562k1 f38695c;

    /* JADX INFO: renamed from: com.onesignal.d1$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            C1541d1.this.f38694b.b().c(TransferService.INTENT_KEY_NOTIFICATION, "notification_id");
        }
    }

    /* JADX INFO: renamed from: com.onesignal.d1$b */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            Iterator it = C1541d1.this.f38694b.b().b().iterator();
            while (it.hasNext()) {
                C1541d1.this.p((S7.b) it.next());
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.d1$c */
    public class c implements I1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S7.b f38698a;

        public c(S7.b bVar) {
            this.f38698a = bVar;
        }

        @Override // com.onesignal.I1
        public void a(int i9, String str, Throwable th) {
        }

        @Override // com.onesignal.I1
        public void onSuccess(String str) {
            C1541d1.this.f38694b.b().g(this.f38698a);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.d1$d */
    public class d implements I1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S7.b f38700a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f38701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f38702c;

        /* JADX INFO: renamed from: com.onesignal.d1$d$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                Thread.currentThread().setPriority(10);
                d dVar = d.this;
                dVar.f38700a.f(dVar.f38701b);
                C1541d1.this.f38694b.b().e(d.this.f38700a);
            }
        }

        public d(S7.b bVar, F1.y yVar, long j9, String str) {
            this.f38700a = bVar;
            this.f38701b = j9;
            this.f38702c = str;
        }

        @Override // com.onesignal.I1
        public void a(int i9, String str, Throwable th) {
            new Thread(new a(), "OS_SAVE_OUTCOMES").start();
            F1.c1(F1.v.WARN, "Sending outcome with name: " + this.f38702c + " failed with status code: " + i9 + " and response: " + str + "\nOutcome event was cached and will be reattempted on app cold start");
        }

        @Override // com.onesignal.I1
        public void onSuccess(String str) {
            C1541d1.this.k(this.f38700a);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.d1$e */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ S7.b f38705a;

        public e(S7.b bVar) {
            this.f38705a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            C1541d1.this.f38694b.b().d(this.f38705a);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.d1$f */
    public static /* synthetic */ class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f38707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f38708b;

        static {
            int[] iArr = new int[P7.b.values().length];
            f38708b = iArr;
            try {
                iArr[P7.b.IAM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38708b[P7.b.NOTIFICATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[P7.c.values().length];
            f38707a = iArr2;
            try {
                iArr2[P7.c.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38707a[P7.c.INDIRECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38707a[P7.c.UNATTRIBUTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38707a[P7.c.DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public C1541d1(C1562k1 c1562k1, R7.c cVar) {
        this.f38695c = c1562k1;
        this.f38694b = cVar;
        g();
    }

    public void d() {
        new Thread(new a(), "OS_DELETE_CACHED_UNIQUE_OUTCOMES_NOTIFICATIONS_THREAD").start();
    }

    public void e() {
        F1.a(F1.v.DEBUG, "OneSignal cleanOutcomes for session");
        this.f38693a = OSUtils.K();
        j();
    }

    public final List f(String str, List list) {
        List listA = this.f38694b.b().a(str, list);
        if (listA.size() > 0) {
            return listA;
        }
        return null;
    }

    public final void g() {
        this.f38693a = OSUtils.K();
        Set setH = this.f38694b.b().h();
        if (setH != null) {
            this.f38693a = setH;
        }
    }

    public final List h(List list) {
        ArrayList arrayList = new ArrayList(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P7.a aVar = (P7.a) it.next();
            if (aVar.d().isDisabled()) {
                F1.c1(F1.v.DEBUG, "Outcomes disabled for channel: " + aVar.c().toString());
                arrayList.remove(aVar);
            }
        }
        return arrayList;
    }

    public final void i(S7.b bVar) {
        new Thread(new e(bVar), "OS_SAVE_UNIQUE_OUTCOME_NOTIFICATIONS").start();
    }

    public final void j() {
        this.f38694b.b().f(this.f38693a);
    }

    public final void k(S7.b bVar) {
        if (bVar.e()) {
            j();
        } else {
            i(bVar);
        }
    }

    public final void l(String str, float f9, List list, F1.y yVar) {
        long jA = F1.v0().a() / 1000;
        int iE = new OSUtils().e();
        String str2 = F1.f38274d;
        Iterator it = list.iterator();
        boolean z9 = false;
        S7.e eVarT = null;
        S7.e eVarT2 = null;
        while (it.hasNext()) {
            P7.a aVar = (P7.a) it.next();
            int i9 = f.f38707a[aVar.d().ordinal()];
            if (i9 == 1) {
                if (eVarT == null) {
                    eVarT = new S7.e();
                }
                eVarT = t(aVar, eVarT);
            } else if (i9 == 2) {
                if (eVarT2 == null) {
                    eVarT2 = new S7.e();
                }
                eVarT2 = t(aVar, eVarT2);
            } else if (i9 == 3) {
                z9 = true;
            } else if (i9 == 4) {
                F1.a(F1.v.VERBOSE, "Outcomes disabled for channel: " + aVar.c());
                if (yVar != null) {
                    yVar.a(null);
                    return;
                }
                return;
            }
        }
        if (eVarT != null || eVarT2 != null || z9) {
            S7.b bVar = new S7.b(str, new S7.d(eVarT, eVarT2), f9, 0L);
            this.f38694b.b().i(str2, iE, bVar, new d(bVar, yVar, jA, str));
        } else {
            F1.a(F1.v.VERBOSE, "Outcomes disabled for all channels");
            if (yVar != null) {
                yVar.a(null);
            }
        }
    }

    public void m(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            F0 f02 = (F0) it.next();
            String strA = f02.a();
            if (f02.c()) {
                r(strA, null);
            } else if (f02.b() > 0.0f) {
                o(strA, f02.b(), null);
            } else {
                n(strA, null);
            }
        }
    }

    public void n(String str, F1.y yVar) {
        l(str, 0.0f, this.f38695c.e(), yVar);
    }

    public void o(String str, float f9, F1.y yVar) {
        l(str, f9, this.f38695c.e(), yVar);
    }

    public final void p(S7.b bVar) {
        int iE = new OSUtils().e();
        this.f38694b.b().i(F1.f38274d, iE, bVar, new c(bVar));
    }

    public void q() {
        new Thread(new b(), "OS_SEND_SAVED_OUTCOMES").start();
    }

    public void r(String str, F1.y yVar) {
        s(str, this.f38695c.e(), yVar);
    }

    public final void s(String str, List list, F1.y yVar) {
        List listH = h(list);
        if (listH.isEmpty()) {
            F1.a(F1.v.DEBUG, "Unique Outcome disabled for current session");
            return;
        }
        Iterator it = listH.iterator();
        while (it.hasNext()) {
            if (((P7.a) it.next()).d().isAttributed()) {
                List listF = f(str, listH);
                if (listF != null) {
                    l(str, 0.0f, listF, yVar);
                    return;
                }
                F1.a(F1.v.DEBUG, "Measure endpoint will not send because unique outcome already sent for: \nSessionInfluences: " + listH.toString() + "\nOutcome name: " + str);
                if (yVar != null) {
                    yVar.a(null);
                    return;
                }
                return;
            }
        }
        if (!this.f38693a.contains(str)) {
            this.f38693a.add(str);
            l(str, 0.0f, listH, yVar);
            return;
        }
        F1.a(F1.v.DEBUG, "Measure endpoint will not send because unique outcome already sent for: \nSession: " + P7.c.UNATTRIBUTED + "\nOutcome name: " + str);
        if (yVar != null) {
            yVar.a(null);
        }
    }

    public final S7.e t(P7.a aVar, S7.e eVar) {
        int i9 = f.f38708b[aVar.c().ordinal()];
        if (i9 == 1) {
            eVar.c(aVar.b());
        } else if (i9 == 2) {
            eVar.d(aVar.b());
        }
        return eVar;
    }
}
