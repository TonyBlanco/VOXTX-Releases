package G5;

import com.google.firebase.auth.FirebaseAuth;
import d.AbstractC1617D;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class k0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FirebaseAuth f2240a;

    public k0(FirebaseAuth firebaseAuth) {
        this.f2240a = firebaseAuth;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Iterator it = this.f2240a.f27875d.iterator();
        if (it.hasNext()) {
            AbstractC1617D.a(it.next());
            throw null;
        }
    }
}
