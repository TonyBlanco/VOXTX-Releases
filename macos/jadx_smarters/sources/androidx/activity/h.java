package androidx.activity;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13519a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CopyOnWriteArrayList f13520b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O.a f13521c;

    public h(boolean z9) {
        this.f13519a = z9;
    }

    public void a(a aVar) {
        this.f13520b.add(aVar);
    }

    public abstract void b();

    public final boolean c() {
        return this.f13519a;
    }

    public final void d() {
        Iterator it = this.f13520b.iterator();
        while (it.hasNext()) {
            ((a) it.next()).cancel();
        }
    }

    public void e(a aVar) {
        this.f13520b.remove(aVar);
    }

    public final void f(boolean z9) {
        this.f13519a = z9;
        O.a aVar = this.f13521c;
        if (aVar != null) {
            aVar.accept(Boolean.valueOf(z9));
        }
    }

    public void g(O.a aVar) {
        this.f13521c = aVar;
    }
}
