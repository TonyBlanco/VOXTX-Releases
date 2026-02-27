package R0;

import Q0.n;
import Q0.s;
import Q0.v;
import a1.RunnableC1078b;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class g extends s {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f8477j = Q0.k.f("WorkContinuationImpl");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f8478a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f8479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q0.d f8480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f8481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f8482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f8483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f8484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f8485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public n f8486i;

    public g(j jVar, String str, Q0.d dVar, List list) {
        this(jVar, str, dVar, list, null);
    }

    public g(j jVar, String str, Q0.d dVar, List list, List list2) {
        this.f8478a = jVar;
        this.f8479b = str;
        this.f8480c = dVar;
        this.f8481d = list;
        this.f8484g = list2;
        this.f8482e = new ArrayList(list.size());
        this.f8483f = new ArrayList();
        if (list2 != null) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                this.f8483f.addAll(((g) it.next()).f8483f);
            }
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            String strA = ((v) list.get(i9)).a();
            this.f8482e.add(strA);
            this.f8483f.add(strA);
        }
    }

    public g(j jVar, List list) {
        this(jVar, null, Q0.d.KEEP, list, null);
    }

    public static boolean i(g gVar, Set set) {
        set.addAll(gVar.c());
        Set setL = l(gVar);
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (setL.contains((String) it.next())) {
                return true;
            }
        }
        List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it2 = listE.iterator();
            while (it2.hasNext()) {
                if (i((g) it2.next(), set)) {
                    return true;
                }
            }
        }
        set.removeAll(gVar.c());
        return false;
    }

    public static Set l(g gVar) {
        HashSet hashSet = new HashSet();
        List listE = gVar.e();
        if (listE != null && !listE.isEmpty()) {
            Iterator it = listE.iterator();
            while (it.hasNext()) {
                hashSet.addAll(((g) it.next()).c());
            }
        }
        return hashSet;
    }

    public n a() {
        if (this.f8485h) {
            Q0.k.c().h(f8477j, String.format("Already enqueued work ids (%s)", TextUtils.join(", ", this.f8482e)), new Throwable[0]);
        } else {
            RunnableC1078b runnableC1078b = new RunnableC1078b(this);
            this.f8478a.r().b(runnableC1078b);
            this.f8486i = runnableC1078b.d();
        }
        return this.f8486i;
    }

    public Q0.d b() {
        return this.f8480c;
    }

    public List c() {
        return this.f8482e;
    }

    public String d() {
        return this.f8479b;
    }

    public List e() {
        return this.f8484g;
    }

    public List f() {
        return this.f8481d;
    }

    public j g() {
        return this.f8478a;
    }

    public boolean h() {
        return i(this, new HashSet());
    }

    public boolean j() {
        return this.f8485h;
    }

    public void k() {
        this.f8485h = true;
    }
}
