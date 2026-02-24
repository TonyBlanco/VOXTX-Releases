package J8;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends CancellationException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final transient kotlinx.coroutines.flow.c f3394a;

    public a(kotlinx.coroutines.flow.c cVar) {
        super("Flow was aborted, no more elements needed");
        this.f3394a = cVar;
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
