package W0;

import Z0.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class c implements V0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f10198a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f10199b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public X0.d f10200c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f10201d;

    public interface a {
        void a(List list);

        void b(List list);
    }

    public c(X0.d dVar) {
        this.f10200c = dVar;
    }

    @Override // V0.a
    public void a(Object obj) {
        this.f10199b = obj;
        h(this.f10201d, obj);
    }

    public abstract boolean b(p pVar);

    public abstract boolean c(Object obj);

    public boolean d(String str) {
        Object obj = this.f10199b;
        return obj != null && c(obj) && this.f10198a.contains(str);
    }

    public void e(Iterable iterable) {
        this.f10198a.clear();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            p pVar = (p) it.next();
            if (b(pVar)) {
                this.f10198a.add(pVar.f10811a);
            }
        }
        if (this.f10198a.isEmpty()) {
            this.f10200c.c(this);
        } else {
            this.f10200c.a(this);
        }
        h(this.f10201d, this.f10199b);
    }

    public void f() {
        if (this.f10198a.isEmpty()) {
            return;
        }
        this.f10198a.clear();
        this.f10200c.c(this);
    }

    public void g(a aVar) {
        if (this.f10201d != aVar) {
            this.f10201d = aVar;
            h(aVar, this.f10199b);
        }
    }

    public final void h(a aVar, Object obj) {
        if (this.f10198a.isEmpty() || aVar == null) {
            return;
        }
        if (obj == null || c(obj)) {
            aVar.b(this.f10198a);
        } else {
            aVar.a(this.f10198a);
        }
    }
}
