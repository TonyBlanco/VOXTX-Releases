package q5;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: q5.u, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2574u extends AbstractRunnableC2568o {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ IBinder f46927f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ServiceConnectionC2577x f46928g;

    public C2574u(ServiceConnectionC2577x serviceConnectionC2577x, IBinder iBinder) {
        this.f46928g = serviceConnectionC2577x;
        this.f46927f = iBinder;
    }

    @Override // q5.AbstractRunnableC2568o
    public final void b() {
        this.f46928g.f46930a.f46944m = AbstractBinderC2563j.A(this.f46927f);
        C2578y.n(this.f46928g.f46930a);
        this.f46928g.f46930a.f46938g = false;
        Iterator it = this.f46928g.f46930a.f46935d.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f46928g.f46930a.f46935d.clear();
    }
}
