package G8;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import o8.InterfaceC2372d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends B {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2357c = AtomicIntegerFieldUpdater.newUpdater(r.class, "_resumed");

    @NotNull
    private volatile /* synthetic */ int _resumed;

    public r(InterfaceC2372d interfaceC2372d, Throwable th, boolean z9) {
        if (th == null) {
            th = new CancellationException("Continuation " + interfaceC2372d + " was cancelled normally");
        }
        super(th, z9);
        this._resumed = 0;
    }

    public final boolean c() {
        return f2357c.compareAndSet(this, 0, 1);
    }
}
