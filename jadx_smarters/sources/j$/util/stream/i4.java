package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;

/* JADX INFO: loaded from: classes2.dex */
final class i4 extends l4 implements IntConsumer, j$.util.H {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f42682f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f42683g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Spliterator spliterator, int i9) {
        super(spliterator);
        this.f42683g = i9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i4(Spliterator spliterator, l4 l4Var, int i9) {
        super(spliterator, l4Var);
        this.f42683g = i9;
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.f42703e = (this.f42703e + 1) & 63;
        this.f42682f = i9;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.l4
    final Spliterator c(Spliterator spliterator) {
        j$.util.H h9 = (j$.util.H) spliterator;
        switch (this.f42683g) {
            case 0:
                return new i4(h9, this, 0);
            default:
                return new i4(h9, this, 1);
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.b(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(IntConsumer intConsumer) {
        while (tryAdvance(intConsumer)) {
        }
    }

    @Override // j$.util.N
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f42683g) {
            case 1:
                tryAdvance((IntConsumer) obj);
                return false;
            default:
                return d(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.h(this, consumer);
    }

    @Override // j$.util.H
    public final boolean d(IntConsumer intConsumer) {
        switch (this.f42683g) {
            case 0:
                boolean z9 = this.f42702d;
                Spliterator spliterator = this.f42699a;
                if (!z9) {
                    return ((j$.util.H) spliterator).tryAdvance(intConsumer);
                }
                this.f42702d = false;
                boolean zD = ((j$.util.H) spliterator).tryAdvance((IntConsumer) this);
                if (zD && b()) {
                    IntPredicate intPredicate = null;
                    intPredicate.test(this.f42682f);
                    throw null;
                }
                if (!zD) {
                    return zD;
                }
                intConsumer.accept(this.f42682f);
                return zD;
            default:
                if (!this.f42702d || !b() || !((j$.util.H) this.f42699a).tryAdvance((IntConsumer) this)) {
                    this.f42702d = false;
                    return false;
                }
                IntPredicate intPredicate2 = null;
                intPredicate2.test(this.f42682f);
                throw null;
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public j$.util.H trySplit() {
        switch (this.f42683g) {
            case 1:
                if (this.f42701c.get()) {
                    return null;
                }
                return (j$.util.H) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        switch (this.f42683g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f42683g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }
}
