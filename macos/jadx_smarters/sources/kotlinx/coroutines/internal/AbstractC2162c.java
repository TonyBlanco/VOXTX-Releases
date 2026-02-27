package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import org.jetbrains.annotations.NotNull;
import t.AbstractC2755b;

/* JADX INFO: renamed from: kotlinx.coroutines.internal.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2162c extends u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f43747a = AtomicReferenceFieldUpdater.newUpdater(AbstractC2162c.class, Object.class, "_consensus");

    @NotNull
    private volatile /* synthetic */ Object _consensus = AbstractC2161b.f43745a;

    @Override // kotlinx.coroutines.internal.u
    public AbstractC2162c a() {
        return this;
    }

    @Override // kotlinx.coroutines.internal.u
    public final Object c(Object obj) {
        Object objE = this._consensus;
        if (objE == AbstractC2161b.f43745a) {
            objE = e(g(obj));
        }
        d(obj, objE);
        return objE;
    }

    public abstract void d(Object obj, Object obj2);

    public final Object e(Object obj) {
        Object obj2 = this._consensus;
        Object obj3 = AbstractC2161b.f43745a;
        return obj2 != obj3 ? obj2 : AbstractC2755b.a(f43747a, this, obj3, obj) ? obj : this._consensus;
    }

    public long f() {
        return 0L;
    }

    public abstract Object g(Object obj);
}
