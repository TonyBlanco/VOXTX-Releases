package R0;

import Q0.n;
import androidx.lifecycle.u;
import b1.C1199c;

/* JADX INFO: loaded from: classes.dex */
public class c implements n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f8459c = new u();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C1199c f8460d = C1199c.t();

    public c() {
        a(n.f7465b);
    }

    public void a(n.b bVar) {
        this.f8459c.l(bVar);
        if (bVar instanceof n.b.c) {
            this.f8460d.p((n.b.c) bVar);
        } else if (bVar instanceof n.b.a) {
            this.f8460d.q(((n.b.a) bVar).a());
        }
    }
}
