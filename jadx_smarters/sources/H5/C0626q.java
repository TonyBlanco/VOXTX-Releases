package H5;

import com.google.android.gms.tasks.OnFailureListener;

/* JADX INFO: renamed from: H5.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0626q implements OnFailureListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RunnableC0623n f2711a;

    public C0626q(RunnableC0623n runnableC0623n) {
        this.f2711a = runnableC0623n;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        if (exc instanceof A5.n) {
            C0624o.f2703h.f("Failure to refresh token; scheduling refresh after failure", new Object[0]);
            this.f2711a.f2702c.d();
        }
    }
}
