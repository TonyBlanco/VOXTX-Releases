package com.onesignal;

import com.onesignal.F1;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.k1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1562k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O7.e f38751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f38752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public P0 f38753c;

    /* JADX INFO: renamed from: com.onesignal.k1$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ List f38754a;

        public a(List list) {
            this.f38754a = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setPriority(10);
            C1562k1.this.f38752b.a(this.f38754a);
        }
    }

    /* JADX INFO: renamed from: com.onesignal.k1$b */
    public interface b {
        void a(List list);
    }

    public C1562k1(b bVar, O7.e eVar, P0 p02) {
        this.f38752b = bVar;
        this.f38751a = eVar;
        this.f38753c = p02;
    }

    public void b(JSONObject jSONObject, List list) {
        this.f38753c.debug("OneSignal SessionManager addSessionData with influences: " + list.toString());
        this.f38751a.a(jSONObject, list);
        this.f38753c.debug("OneSignal SessionManager addSessionIds on jsonObject: " + jSONObject);
    }

    public void c(F1.r rVar) {
        d(rVar, null);
    }

    public final void d(F1.r rVar, String str) {
        boolean zO;
        P7.a aVarE;
        this.f38753c.debug("OneSignal SessionManager attemptSessionUpgrade with entryAction: " + rVar);
        O7.a aVarB = this.f38751a.b(rVar);
        List<O7.a> listD = this.f38751a.d(rVar);
        ArrayList arrayList = new ArrayList();
        if (aVarB != null) {
            aVarE = aVarB.e();
            P7.c cVar = P7.c.DIRECT;
            if (str == null) {
                str = aVarB.g();
            }
            zO = o(aVarB, cVar, str, null);
        } else {
            zO = false;
            aVarE = null;
        }
        if (zO) {
            this.f38753c.debug("OneSignal SessionManager attemptSessionUpgrade channel updated, search for ending direct influences on channels: " + listD);
            arrayList.add(aVarE);
            for (O7.a aVar : listD) {
                if (aVar.k().isDirect()) {
                    arrayList.add(aVar.e());
                    aVar.t();
                }
            }
        }
        this.f38753c.debug("OneSignal SessionManager attemptSessionUpgrade try UNATTRIBUTED to INDIRECT upgrade");
        for (O7.a aVar2 : listD) {
            if (aVar2.k().isUnattributed()) {
                JSONArray jSONArrayN = aVar2.n();
                if (jSONArrayN.length() > 0 && !rVar.isAppClose()) {
                    P7.a aVarE2 = aVar2.e();
                    if (o(aVar2, P7.c.INDIRECT, null, jSONArrayN)) {
                        arrayList.add(aVarE2);
                    }
                }
            }
        }
        F1.a(F1.v.DEBUG, "Trackers after update attempt: " + this.f38751a.c().toString());
        n(arrayList);
    }

    public List e() {
        return this.f38751a.f();
    }

    public List f() {
        return this.f38751a.h();
    }

    public void g() {
        this.f38751a.i();
    }

    public void h(String str) {
        this.f38753c.debug("OneSignal SessionManager onDirectInfluenceFromIAMClick messageId: " + str);
        o(this.f38751a.e(), P7.c.DIRECT, str, null);
    }

    public void i() {
        this.f38753c.debug("OneSignal SessionManager onDirectInfluenceFromIAMClickFinished");
        this.f38751a.e().t();
    }

    public void j(F1.r rVar, String str) {
        this.f38753c.debug("OneSignal SessionManager onDirectInfluenceFromNotificationOpen notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        d(rVar, str);
    }

    public void k(String str) {
        this.f38753c.debug("OneSignal SessionManager onInAppMessageReceived messageId: " + str);
        O7.a aVarE = this.f38751a.e();
        aVarE.v(str);
        aVarE.t();
    }

    public void l(String str) {
        this.f38753c.debug("OneSignal SessionManager onNotificationReceived notificationId: " + str);
        if (str == null || str.isEmpty()) {
            return;
        }
        this.f38751a.g().v(str);
    }

    public void m(F1.r rVar) {
        List<O7.a> listD = this.f38751a.d(rVar);
        ArrayList arrayList = new ArrayList();
        this.f38753c.debug("OneSignal SessionManager restartSessionIfNeeded with entryAction: " + rVar + "\n channelTrackers: " + listD.toString());
        for (O7.a aVar : listD) {
            JSONArray jSONArrayN = aVar.n();
            this.f38753c.debug("OneSignal SessionManager restartSessionIfNeeded lastIds: " + jSONArrayN);
            P7.a aVarE = aVar.e();
            if (jSONArrayN.length() > 0 ? o(aVar, P7.c.INDIRECT, null, jSONArrayN) : o(aVar, P7.c.UNATTRIBUTED, null, null)) {
                arrayList.add(aVarE);
            }
        }
        n(arrayList);
    }

    public final void n(List list) {
        this.f38753c.debug("OneSignal SessionManager sendSessionEndingWithInfluences with influences: " + list);
        if (list.size() > 0) {
            new Thread(new a(list), "OS_END_CURRENT_SESSION").start();
        }
    }

    public final boolean o(O7.a aVar, P7.c cVar, String str, JSONArray jSONArray) {
        if (!p(aVar, cVar, str, jSONArray)) {
            return false;
        }
        F1.v vVar = F1.v.DEBUG;
        F1.a(vVar, "OSChannelTracker changed: " + aVar.h() + "\nfrom:\ninfluenceType: " + aVar.k() + ", directNotificationId: " + aVar.g() + ", indirectNotificationIds: " + aVar.j() + "\nto:\ninfluenceType: " + cVar + ", directNotificationId: " + str + ", indirectNotificationIds: " + jSONArray);
        aVar.y(cVar);
        aVar.w(str);
        aVar.x(jSONArray);
        aVar.b();
        StringBuilder sb = new StringBuilder();
        sb.append("Trackers changed to: ");
        sb.append(this.f38751a.c().toString());
        F1.a(vVar, sb.toString());
        return true;
    }

    public final boolean p(O7.a aVar, P7.c cVar, String str, JSONArray jSONArray) {
        if (!cVar.equals(aVar.k())) {
            return true;
        }
        P7.c cVarK = aVar.k();
        if (!cVarK.isDirect() || aVar.g() == null || aVar.g().equals(str)) {
            return cVarK.isIndirect() && aVar.j() != null && aVar.j().length() > 0 && !H.a(aVar.j(), jSONArray);
        }
        return true;
    }
}
