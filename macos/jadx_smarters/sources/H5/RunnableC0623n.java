package H5;

import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: renamed from: H5.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC0623n implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2701a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0624o f2702c;

    public RunnableC0623n(C0624o c0624o, String str) {
        this.f2702c = c0624o;
        this.f2701a = com.google.android.gms.common.internal.r.g(str);
    }

    @Override // java.lang.Runnable
    public final void run() {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(A5.f.n(this.f2701a));
        if (firebaseAuth.c() != null) {
            Task taskA = firebaseAuth.a(true);
            C0624o.f2703h.f("Token refreshing started", new Object[0]);
            taskA.addOnFailureListener(new C0626q(this));
        }
    }
}
