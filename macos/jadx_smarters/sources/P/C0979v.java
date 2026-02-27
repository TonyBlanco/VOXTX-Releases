package P;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import d.AbstractC1617D;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: P.v, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C0979v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f6837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f6838b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f6839c = new HashMap();

    /* JADX INFO: renamed from: P.v$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AbstractC1180j f6840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public InterfaceC1184n f6841b;

        public a(AbstractC1180j abstractC1180j, InterfaceC1184n interfaceC1184n) {
            this.f6840a = abstractC1180j;
            this.f6841b = interfaceC1184n;
            abstractC1180j.a(interfaceC1184n);
        }

        public void a() {
            this.f6840a.c(this.f6841b);
            this.f6841b = null;
        }
    }

    public C0979v(Runnable runnable) {
        this.f6837a = runnable;
    }

    public void c(InterfaceC0981x interfaceC0981x) {
        this.f6838b.add(interfaceC0981x);
        this.f6837a.run();
    }

    public void d(final InterfaceC0981x interfaceC0981x, InterfaceC1186p interfaceC1186p) {
        c(interfaceC0981x);
        AbstractC1180j lifecycle = interfaceC1186p.getLifecycle();
        a aVar = (a) this.f6839c.remove(interfaceC0981x);
        if (aVar != null) {
            aVar.a();
        }
        this.f6839c.put(interfaceC0981x, new a(lifecycle, new InterfaceC1184n(interfaceC0981x) { // from class: P.u
            @Override // androidx.lifecycle.InterfaceC1184n
            public final void b(InterfaceC1186p interfaceC1186p2, AbstractC1180j.b bVar) {
                this.f6836a.f(null, interfaceC1186p2, bVar);
            }
        }));
    }

    public void e(final InterfaceC0981x interfaceC0981x, InterfaceC1186p interfaceC1186p, final AbstractC1180j.c cVar) {
        AbstractC1180j lifecycle = interfaceC1186p.getLifecycle();
        a aVar = (a) this.f6839c.remove(interfaceC0981x);
        if (aVar != null) {
            aVar.a();
        }
        this.f6839c.put(interfaceC0981x, new a(lifecycle, new InterfaceC1184n(cVar, interfaceC0981x) { // from class: P.t

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ AbstractC1180j.c f6835c;

            @Override // androidx.lifecycle.InterfaceC1184n
            public final void b(InterfaceC1186p interfaceC1186p2, AbstractC1180j.b bVar) {
                this.f6834a.g(this.f6835c, null, interfaceC1186p2, bVar);
            }
        }));
    }

    public final /* synthetic */ void f(InterfaceC0981x interfaceC0981x, InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        if (bVar == AbstractC1180j.b.ON_DESTROY) {
            l(interfaceC0981x);
        }
    }

    public final /* synthetic */ void g(AbstractC1180j.c cVar, InterfaceC0981x interfaceC0981x, InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        if (bVar == AbstractC1180j.b.upTo(cVar)) {
            c(interfaceC0981x);
            return;
        }
        if (bVar == AbstractC1180j.b.ON_DESTROY) {
            l(interfaceC0981x);
        } else if (bVar == AbstractC1180j.b.downFrom(cVar)) {
            this.f6838b.remove(interfaceC0981x);
            this.f6837a.run();
        }
    }

    public void h(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f6838b.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
    }

    public void i(Menu menu) {
        Iterator it = this.f6838b.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
    }

    public boolean j(MenuItem menuItem) {
        Iterator it = this.f6838b.iterator();
        if (!it.hasNext()) {
            return false;
        }
        AbstractC1617D.a(it.next());
        throw null;
    }

    public void k(Menu menu) {
        Iterator it = this.f6838b.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
    }

    public void l(InterfaceC0981x interfaceC0981x) {
        this.f6838b.remove(interfaceC0981x);
        a aVar = (a) this.f6839c.remove(interfaceC0981x);
        if (aVar != null) {
            aVar.a();
        }
        this.f6837a.run();
    }
}
