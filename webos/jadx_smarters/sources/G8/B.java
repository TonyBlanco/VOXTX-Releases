package G8;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class B {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f2260b = AtomicIntegerFieldUpdater.newUpdater(B.class, "_handled");

    @NotNull
    private volatile /* synthetic */ int _handled;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f2261a;

    public B(Throwable th, boolean z9) {
        this.f2261a = th;
        this._handled = z9 ? 1 : 0;
    }

    public /* synthetic */ B(Throwable th, boolean z9, int i9, kotlin.jvm.internal.g gVar) {
        this(th, (i9 & 2) != 0 ? false : z9);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [boolean, int] */
    public final boolean a() {
        return this._handled;
    }

    public final boolean b() {
        return f2260b.compareAndSet(this, 0, 1);
    }

    public String toString() {
        return P.a(this) + '[' + this.f2261a + ']';
    }
}
