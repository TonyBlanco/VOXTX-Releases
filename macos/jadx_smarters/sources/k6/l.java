package k6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public class l implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TaskCompletionSource f43621a;

    public l(TaskCompletionSource taskCompletionSource) {
        this.f43621a = taskCompletionSource;
    }

    @Override // k6.o
    public boolean a(Exception exc) {
        return false;
    }

    @Override // k6.o
    public boolean b(l6.d dVar) {
        if (!dVar.l() && !dVar.k() && !dVar.i()) {
            return false;
        }
        this.f43621a.trySetResult(dVar.d());
        return true;
    }
}
