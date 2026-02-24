package G5;

import com.google.firebase.auth.FirebaseAuth;
import d.AbstractC1617D;
import java.util.Iterator;
import o6.C2367b;

/* JADX INFO: loaded from: classes3.dex */
public final class i0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2237a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2367b f2238c;

    public i0(FirebaseAuth firebaseAuth, C2367b c2367b) {
        this.f2237a = firebaseAuth;
        this.f2238c = c2367b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f2237a.f27874c.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
        Iterator it2 = this.f2237a.f27873b.iterator();
        if (it2.hasNext()) {
            AbstractC1617D.a(it2.next());
            throw null;
        }
    }
}
