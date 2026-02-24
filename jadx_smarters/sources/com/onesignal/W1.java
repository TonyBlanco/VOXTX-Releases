package com.onesignal;

import com.onesignal.F1;
import com.onesignal.O;
import com.onesignal.T1;
import com.onesignal.u2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class W1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f38621a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap f38622b = new HashMap();

    public interface a {
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38623a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f38624b;

        public b(int i9, String str) {
            this.f38623a = i9;
            this.f38624b = str;
        }
    }

    public enum c {
        PUSH,
        EMAIL,
        SMS;

        public boolean isEmail() {
            return equals(EMAIL);
        }

        public boolean isPush() {
            return equals(PUSH);
        }

        public boolean isSMS() {
            return equals(SMS);
        }
    }

    public static void a() {
        d().o();
        b().o();
        f().o();
    }

    public static o2 b() {
        HashMap map = f38622b;
        c cVar = c.EMAIL;
        if (!map.containsKey(cVar) || f38622b.get(cVar) == null) {
            synchronized (f38621a) {
                try {
                    if (f38622b.get(cVar) == null) {
                        f38622b.put(cVar, new o2());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (o2) f38622b.get(cVar);
    }

    public static String c() {
        return d().f0();
    }

    public static q2 d() {
        HashMap map = f38622b;
        c cVar = c.PUSH;
        if (!map.containsKey(cVar) || f38622b.get(cVar) == null) {
            synchronized (f38621a) {
                try {
                    if (f38622b.get(cVar) == null) {
                        f38622b.put(cVar, new q2());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (q2) f38622b.get(cVar);
    }

    public static String e() {
        return d().D();
    }

    public static s2 f() {
        HashMap map = f38622b;
        c cVar = c.SMS;
        if (!map.containsKey(cVar) || f38622b.get(cVar) == null) {
            synchronized (f38621a) {
                try {
                    if (f38622b.get(cVar) == null) {
                        f38622b.put(cVar, new s2());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (s2) f38622b.get(cVar);
    }

    public static boolean g() {
        return d().E() || b().E() || f().E();
    }

    public static u2.e h(boolean z9) {
        return d().g0(z9);
    }

    public static List i() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(d());
        if (F1.G0()) {
            arrayList.add(b());
        }
        if (F1.H0()) {
            arrayList.add(f());
        }
        return arrayList;
    }

    public static boolean j() {
        return d().h0();
    }

    public static void k() {
        d().J();
        b().J();
        f().J();
    }

    public static boolean l() {
        boolean zP = d().P();
        boolean zP2 = b().P();
        boolean zP3 = f().P();
        if (zP2) {
            zP2 = b().D() != null;
        }
        if (zP3) {
            zP3 = f().D() != null;
        }
        return zP || zP2 || zP3;
    }

    public static void m(boolean z9) {
        d().Q(z9);
        b().Q(z9);
        f().Q(z9);
    }

    public static void n() {
        b().j0();
        f().j0();
    }

    public static void o() {
        d().R();
        b().R();
        f().R();
        d().i0(null);
        b().k0(null);
        f().k0(null);
        F1.C1(-3660L);
    }

    public static void p(JSONObject jSONObject, T1.g gVar) {
        Iterator it = i().iterator();
        while (it.hasNext()) {
            ((u2) it.next()).U(jSONObject, gVar);
        }
    }

    public static void q(JSONObject jSONObject, F1.s sVar) {
        try {
            JSONObject jSONObjectPut = new JSONObject().put("tags", jSONObject);
            d().V(jSONObjectPut, sVar);
            b().V(jSONObjectPut, sVar);
            f().V(jSONObjectPut, sVar);
        } catch (JSONException e9) {
            if (sVar != null) {
                sVar.a(new F1.B(-1, "Encountered an error attempting to serialize your tags into JSON: " + e9.getMessage() + "\n" + e9.getStackTrace()));
            }
            e9.printStackTrace();
        }
    }

    public static void r() {
        d().Y();
        b().Y();
        f().Y();
    }

    public static void s() {
        b().Y();
    }

    public static void t(boolean z9) {
        d().j0(z9);
    }

    public static void u(boolean z9) {
        d().a0(z9);
        b().a0(z9);
        f().a0(z9);
    }

    public static void v(JSONObject jSONObject, a aVar) {
        d().b0(jSONObject, aVar);
        b().b0(jSONObject, aVar);
        f().b0(jSONObject, aVar);
    }

    public static void w(O.d dVar) {
        d().d0(dVar);
        b().d0(dVar);
        f().d0(dVar);
    }

    public static void x(JSONObject jSONObject) {
        d().k0(jSONObject);
    }
}
