package G8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: G8.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0601v0 extends AbstractC0609z0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2363g = AtomicIntegerFieldUpdater.newUpdater(C0601v0.class, "_invoked");

    @NotNull
    private volatile /* synthetic */ int _invoked = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w8.l f2364f;

    public C0601v0(w8.l lVar) {
        this.f2364f = lVar;
    }

    @Override // w8.l
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        z((Throwable) obj);
        return k8.q.f43674a;
    }

    @Override // G8.D
    public void z(Throwable th) {
        if (f2363g.compareAndSet(this, 0, 1)) {
            this.f2364f.invoke(th);
        }
    }
}
