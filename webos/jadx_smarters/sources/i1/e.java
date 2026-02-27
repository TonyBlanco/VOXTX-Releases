package I1;

import D1.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import x1.g;

/* JADX INFO: loaded from: classes.dex */
public final class e implements D1.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f2806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2807b;

    public e(List list) {
        this(list, 0);
    }

    public e(List list, int i9) {
        if (i9 > list.size()) {
            throw new IllegalArgumentException();
        }
        this.f2806a = new ArrayList((Collection) g.c(list, "interceptors == null"));
        this.f2807b = i9;
    }

    @Override // D1.b
    public void a(a.c cVar, Executor executor, a.InterfaceC0015a interfaceC0015a) {
        if (this.f2807b >= this.f2806a.size()) {
            throw new IllegalStateException();
        }
        ((D1.a) this.f2806a.get(this.f2807b)).interceptAsync(cVar, new e(this.f2806a, this.f2807b + 1), executor, interfaceC0015a);
    }

    @Override // D1.b
    public void dispose() {
        Iterator it = this.f2806a.iterator();
        while (it.hasNext()) {
            ((D1.a) it.next()).dispose();
        }
    }
}
