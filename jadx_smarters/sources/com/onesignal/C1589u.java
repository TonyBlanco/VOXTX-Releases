package com.onesignal;

import com.onesignal.F1;
import com.onesignal.T1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.onesignal.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1589u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Long f38860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f38861b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C1599x0 f38862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public P0 f38863d;

    /* JADX INFO: renamed from: com.onesignal.u$a */
    public enum a {
        BACKGROUND,
        END_SESSION
    }

    /* JADX INFO: renamed from: com.onesignal.u$b */
    public static class b extends c {
        public b() {
            this.f38864a = 1L;
            this.f38865b = "OS_UNSENT_ATTRIBUTED_ACTIVE_TIME";
        }

        @Override // com.onesignal.C1589u.c
        public void h(JSONObject jSONObject) {
            F1.r0().b(jSONObject, j());
        }

        @Override // com.onesignal.C1589u.c
        public List j() {
            ArrayList arrayList = new ArrayList();
            Iterator it = R1.g(R1.f38511a, "PREFS_OS_ATTRIBUTED_INFLUENCES", new HashSet()).iterator();
            while (it.hasNext()) {
                try {
                    arrayList.add(new P7.a((String) it.next()));
                } catch (JSONException e9) {
                    F1.a(F1.v.ERROR, getClass().getSimpleName() + ": error generation OSInfluence from json object: " + e9);
                }
            }
            return arrayList;
        }

        @Override // com.onesignal.C1589u.c
        public void m(List list) {
            HashSet hashSet = new HashSet();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                try {
                    hashSet.add(((P7.a) it.next()).g());
                } catch (JSONException e9) {
                    F1.a(F1.v.ERROR, getClass().getSimpleName() + ": error generation json object OSInfluence: " + e9);
                }
            }
            R1.n(R1.f38511a, "PREFS_OS_ATTRIBUTED_INFLUENCES", hashSet);
        }

        @Override // com.onesignal.C1589u.c
        public void r(a aVar) {
            F1.c1(F1.v.DEBUG, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(a.END_SESSION)) {
                u();
            } else {
                C1574o1.q().s(F1.f38270b);
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.u$c */
    public static abstract class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f38864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f38866c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final AtomicBoolean f38867d = new AtomicBoolean();

        /* JADX INFO: renamed from: com.onesignal.u$c$a */
        public class a extends T1.g {
            public a() {
            }

            @Override // com.onesignal.T1.g
            public void a(int i9, String str, Throwable th) {
                F1.T0("sending on_focus Failed", i9, th, str);
            }

            @Override // com.onesignal.T1.g
            public void b(String str) {
                c.this.o(0L);
            }
        }

        public final void g(long j9, List list, a aVar) {
            n(j9, list);
            t(aVar);
        }

        public void h(JSONObject jSONObject) {
        }

        public final JSONObject i(long j9) throws JSONException {
            JSONObject jSONObjectPut = new JSONObject().put("app_id", F1.n0()).put("type", 1).put("state", "ping").put("active_time", j9).put("device_type", new OSUtils().e());
            F1.x(jSONObjectPut);
            return jSONObjectPut;
        }

        public abstract List j();

        public final long k() {
            if (this.f38866c == null) {
                this.f38866c = Long.valueOf(R1.d(R1.f38511a, this.f38865b, 0L));
            }
            F1.a(F1.v.DEBUG, getClass().getSimpleName() + ":getUnsentActiveTime: " + this.f38866c);
            return this.f38866c.longValue();
        }

        public final boolean l() {
            return k() >= this.f38864a;
        }

        public abstract void m(List list);

        public final void n(long j9, List list) {
            F1.a(F1.v.DEBUG, getClass().getSimpleName() + ":saveUnsentActiveData with lastFocusTimeInfluences: " + list.toString());
            long jK = k() + j9;
            m(list);
            o(jK);
        }

        public final void o(long j9) {
            this.f38866c = Long.valueOf(j9);
            F1.a(F1.v.DEBUG, getClass().getSimpleName() + ":saveUnsentActiveTime: " + this.f38866c);
            R1.l(R1.f38511a, this.f38865b, j9);
        }

        public final void p(long j9) {
            try {
                F1.a(F1.v.DEBUG, getClass().getSimpleName() + ":sendOnFocus with totalTimeActive: " + j9);
                JSONObject jSONObjectI = i(j9);
                h(jSONObjectI);
                q(F1.y0(), jSONObjectI);
                if (F1.G0()) {
                    q(F1.X(), i(j9));
                }
                if (F1.H0()) {
                    q(F1.l0(), i(j9));
                }
                m(new ArrayList());
            } catch (JSONException e9) {
                F1.b(F1.v.ERROR, "Generating on_focus:JSON Failed.", e9);
            }
        }

        public final void q(String str, JSONObject jSONObject) {
            T1.k("players/" + str + "/on_focus", jSONObject, new a());
        }

        public abstract void r(a aVar);

        public final void s() {
            List listJ = j();
            long jK = k();
            F1.a(F1.v.DEBUG, getClass().getSimpleName() + ":sendUnsentTimeNow with time: " + jK + " and influences: " + listJ.toString());
            t(a.BACKGROUND);
        }

        public final void t(a aVar) {
            if (F1.I0()) {
                r(aVar);
                return;
            }
            F1.a(F1.v.WARN, getClass().getSimpleName() + ":sendUnsentTimeNow not possible due to user id null");
        }

        public void u() {
            if (this.f38867d.get()) {
                return;
            }
            synchronized (this.f38867d) {
                try {
                    this.f38867d.set(true);
                    if (l()) {
                        p(k());
                    }
                    this.f38867d.set(false);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public final void v() {
            if (l()) {
                u();
            }
        }

        public void w() {
            if (l()) {
                C1574o1.q().s(F1.f38270b);
            }
        }
    }

    /* JADX INFO: renamed from: com.onesignal.u$d */
    public static class d extends c {
        public d() {
            this.f38864a = 60L;
            this.f38865b = "GT_UNSENT_ACTIVE_TIME";
        }

        @Override // com.onesignal.C1589u.c
        public List j() {
            return new ArrayList();
        }

        @Override // com.onesignal.C1589u.c
        public void m(List list) {
        }

        @Override // com.onesignal.C1589u.c
        public void r(a aVar) {
            F1.c1(F1.v.DEBUG, getClass().getSimpleName() + " sendTime with: " + aVar);
            if (aVar.equals(a.END_SESSION)) {
                return;
            }
            w();
        }
    }

    public C1589u(C1599x0 c1599x0, P0 p02) {
        this.f38862c = c1599x0;
        this.f38863d = p02;
    }

    public void a() {
        synchronized (this.f38861b) {
            this.f38863d.debug("Application backgrounded focus time: " + this.f38860a);
            this.f38862c.b().s();
            this.f38860a = null;
        }
    }

    public void b() {
        synchronized (this.f38861b) {
            this.f38860a = Long.valueOf(F1.v0().b());
            this.f38863d.debug("Application foregrounded focus time: " + this.f38860a);
        }
    }

    public void c() {
        Long lE = e();
        synchronized (this.f38861b) {
            this.f38863d.debug("Application stopped focus time: " + this.f38860a + " timeElapsed: " + lE);
        }
        if (lE == null) {
            return;
        }
        List listF = F1.r0().f();
        this.f38862c.c(listF).n(lE.longValue(), listF);
    }

    public void d() {
        if (F1.N0()) {
            return;
        }
        this.f38862c.b().v();
    }

    public final Long e() {
        synchronized (this.f38861b) {
            try {
                if (this.f38860a == null) {
                    return null;
                }
                long jB = (long) (((F1.v0().b() - this.f38860a.longValue()) / 1000.0d) + 0.5d);
                if (jB >= 1 && jB <= 86400) {
                    return Long.valueOf(jB);
                }
                return null;
            } finally {
            }
        }
    }

    public final boolean f(List list, a aVar) {
        Long lE = e();
        if (lE == null) {
            return false;
        }
        this.f38862c.c(list).g(lE.longValue(), list, aVar);
        return true;
    }

    public void g(List list) {
        a aVar = a.END_SESSION;
        if (f(list, aVar)) {
            return;
        }
        this.f38862c.c(list).t(aVar);
    }
}
