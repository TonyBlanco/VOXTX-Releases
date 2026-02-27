package z1;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: z1.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3006e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f52626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicReference f52627b = new AtomicReference();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AtomicBoolean f52628c = new AtomicBoolean();

    /* JADX INFO: renamed from: z1.e$a */
    public static class a extends AbstractC3006e {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Object f52629d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Executor executor, Object obj) {
            super(executor);
            this.f52629d = obj;
        }

        @Override // z1.AbstractC3006e
        public Object d() {
            return this.f52629d;
        }
    }

    public AbstractC3006e(Executor executor) {
        this.f52626a = executor;
    }

    public static AbstractC3006e b(Object obj) {
        return new a(null, obj);
    }

    public final void a() {
        if (!this.f52628c.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
    }

    public final Object c() throws B1.b {
        a();
        try {
            return d();
        } catch (Exception e9) {
            throw new B1.b("Failed to perform store operation", e9);
        }
    }

    public abstract Object d();
}
