package k6;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: loaded from: classes3.dex */
public class k implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f43619a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f43620b;

    public k(p pVar, TaskCompletionSource taskCompletionSource) {
        this.f43619a = pVar;
        this.f43620b = taskCompletionSource;
    }

    @Override // k6.o
    public boolean a(Exception exc) {
        this.f43620b.trySetException(exc);
        return true;
    }

    @Override // k6.o
    public boolean b(l6.d dVar) {
        if (!dVar.k() || this.f43619a.f(dVar)) {
            return false;
        }
        this.f43620b.setResult(m.a().b(dVar.b()).d(dVar.c()).c(dVar.h()).a());
        return true;
    }
}
