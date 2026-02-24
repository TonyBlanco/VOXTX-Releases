package kotlinx.coroutines.scheduling;

import G8.AbstractC0586n0;
import G8.H;
import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.B;
import kotlinx.coroutines.internal.z;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC0586n0 implements Executor {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f43808e = new b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final H f43809f = m.f43828d.e0(B.d("kotlinx.coroutines.io.parallelism", B8.h.c(64, z.a()), 0, 0, 12, null));

    @Override // G8.H
    public void c0(o8.g gVar, Runnable runnable) {
        f43809f.c0(gVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO".toString());
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        c0(o8.h.f46144a, runnable);
    }

    @Override // G8.H
    public String toString() {
        return "Dispatchers.IO";
    }
}
