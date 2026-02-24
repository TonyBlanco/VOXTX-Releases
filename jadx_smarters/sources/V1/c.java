package V1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f9847a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f9848b = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f9849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public List f9850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public a f9851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public a f9852d;

        public a() {
            this(null);
        }

        public a(Object obj) {
            this.f9852d = this;
            this.f9851c = this;
            this.f9849a = obj;
        }

        public void b(Object obj) {
            if (this.f9850b == null) {
                this.f9850b = new ArrayList();
            }
            this.f9850b.add(obj);
        }

        public Object c() {
            int iD = d();
            if (iD > 0) {
                return this.f9850b.remove(iD - 1);
            }
            return null;
        }

        public int d() {
            List list = this.f9850b;
            if (list != null) {
                return list.size();
            }
            return 0;
        }
    }

    public static void e(a aVar) {
        a aVar2 = aVar.f9852d;
        aVar2.f9851c = aVar.f9851c;
        aVar.f9851c.f9852d = aVar2;
    }

    public static void g(a aVar) {
        aVar.f9851c.f9852d = aVar;
        aVar.f9852d.f9851c = aVar;
    }

    public Object a(f fVar) {
        a aVar = (a) this.f9848b.get(fVar);
        if (aVar == null) {
            aVar = new a(fVar);
            this.f9848b.put(fVar, aVar);
        } else {
            fVar.a();
        }
        b(aVar);
        return aVar.c();
    }

    public final void b(a aVar) {
        e(aVar);
        a aVar2 = this.f9847a;
        aVar.f9852d = aVar2;
        aVar.f9851c = aVar2.f9851c;
        g(aVar);
    }

    public final void c(a aVar) {
        e(aVar);
        a aVar2 = this.f9847a;
        aVar.f9852d = aVar2.f9852d;
        aVar.f9851c = aVar2;
        g(aVar);
    }

    public void d(f fVar, Object obj) {
        a aVar = (a) this.f9848b.get(fVar);
        if (aVar == null) {
            aVar = new a(fVar);
            c(aVar);
            this.f9848b.put(fVar, aVar);
        } else {
            fVar.a();
        }
        aVar.b(obj);
    }

    public Object f() {
        a aVar = this.f9847a;
        while (true) {
            aVar = aVar.f9852d;
            if (aVar.equals(this.f9847a)) {
                return null;
            }
            Object objC = aVar.c();
            if (objC != null) {
                return objC;
            }
            e(aVar);
            this.f9848b.remove(aVar.f9849a);
            ((f) aVar.f9849a).a();
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
        a aVar = this.f9847a.f9851c;
        boolean z9 = false;
        while (!aVar.equals(this.f9847a)) {
            sb.append('{');
            sb.append(aVar.f9849a);
            sb.append(':');
            sb.append(aVar.d());
            sb.append("}, ");
            aVar = aVar.f9851c;
            z9 = true;
        }
        if (z9) {
            sb.delete(sb.length() - 2, sb.length());
        }
        sb.append(" )");
        return sb.toString();
    }
}
