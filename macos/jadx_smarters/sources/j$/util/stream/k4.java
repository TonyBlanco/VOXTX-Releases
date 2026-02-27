package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
final class k4 extends l4 implements Consumer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Predicate f42692f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Object f42693g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f42694h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Spliterator spliterator, k4 k4Var, int i9) {
        super(spliterator, k4Var);
        this.f42694h = i9;
        this.f42692f = k4Var.f42692f;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(Spliterator spliterator, Predicate predicate, int i9) {
        super(spliterator);
        this.f42694h = i9;
        this.f42692f = predicate;
    }

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        this.f42703e = (this.f42703e + 1) & 63;
        this.f42693g = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return j$.com.android.tools.r8.a.d(this, consumer);
    }

    @Override // j$.util.stream.l4
    final Spliterator c(Spliterator spliterator) {
        switch (this.f42694h) {
            case 0:
                return new k4(spliterator, this, 0);
            default:
                return new k4(spliterator, this, 1);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        boolean zTryAdvance;
        boolean zTest;
        switch (this.f42694h) {
            case 0:
                boolean z9 = this.f42702d;
                Spliterator spliterator = this.f42699a;
                if (!z9) {
                    return spliterator.tryAdvance(consumer);
                }
                boolean z10 = false;
                this.f42702d = false;
                while (true) {
                    zTryAdvance = spliterator.tryAdvance(this);
                    if (zTryAdvance && b() && this.f42692f.test(this.f42693g)) {
                        z10 = true;
                    }
                }
                if (!zTryAdvance) {
                    return zTryAdvance;
                }
                if (z10) {
                    this.f42701c.set(true);
                }
                consumer.accept(this.f42693g);
                return zTryAdvance;
            default:
                if (this.f42702d && b() && this.f42699a.tryAdvance(this)) {
                    zTest = this.f42692f.test(this.f42693g);
                    if (zTest) {
                        consumer.accept(this.f42693g);
                        return true;
                    }
                } else {
                    zTest = true;
                }
                this.f42702d = false;
                if (!zTest) {
                    this.f42701c.set(true);
                }
                return false;
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public Spliterator trySplit() {
        switch (this.f42694h) {
            case 1:
                if (!this.f42701c.get()) {
                    break;
                }
                break;
        }
        return super.trySplit();
    }
}
