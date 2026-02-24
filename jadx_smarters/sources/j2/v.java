package J2;

import K2.InterfaceC0689d;
import L2.b;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f3088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0689d f3089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x f3090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L2.b f3091d;

    public v(Executor executor, InterfaceC0689d interfaceC0689d, x xVar, L2.b bVar) {
        this.f3088a = executor;
        this.f3089b = interfaceC0689d;
        this.f3090c = xVar;
        this.f3091d = bVar;
    }

    public void c() {
        this.f3088a.execute(new Runnable() { // from class: J2.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f3086a.e();
            }
        });
    }

    public final /* synthetic */ Object d() {
        Iterator it = this.f3089b.F().iterator();
        while (it.hasNext()) {
            this.f3090c.b((C2.p) it.next(), 1);
        }
        return null;
    }

    public final /* synthetic */ void e() {
        this.f3091d.a(new b.a() { // from class: J2.u
            @Override // L2.b.a
            public final Object execute() {
                return this.f3087a.d();
            }
        });
    }
}
