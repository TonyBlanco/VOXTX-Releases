package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.DoublePredicate;

/* JADX INFO: loaded from: classes2.dex */
final class h4 extends l4 implements DoubleConsumer, j$.util.E {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    double f42678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f42679g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Spliterator spliterator, int i9) {
        super(spliterator);
        this.f42679g = i9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h4(Spliterator spliterator, l4 l4Var, int i9) {
        super(spliterator, l4Var);
        this.f42679g = i9;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d9) {
        this.f42703e = (this.f42703e + 1) & 63;
        this.f42678f = d9;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.l4
    final Spliterator c(Spliterator spliterator) {
        j$.util.E e9 = (j$.util.E) spliterator;
        switch (this.f42679g) {
            case 0:
                return new h4(e9, this, 0);
            default:
                return new h4(e9, this, 1);
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.a(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(DoubleConsumer doubleConsumer) {
        while (tryAdvance(doubleConsumer)) {
        }
    }

    @Override // j$.util.N
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f42679g) {
            case 1:
                tryAdvance((DoubleConsumer) obj);
                return false;
            default:
                return d(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.g(this, consumer);
    }

    @Override // j$.util.E
    public final boolean d(DoubleConsumer doubleConsumer) {
        switch (this.f42679g) {
            case 0:
                boolean z9 = this.f42702d;
                Spliterator spliterator = this.f42699a;
                if (!z9) {
                    return ((j$.util.E) spliterator).tryAdvance(doubleConsumer);
                }
                this.f42702d = false;
                boolean zD = ((j$.util.E) spliterator).tryAdvance((DoubleConsumer) this);
                if (zD && b()) {
                    DoublePredicate doublePredicate = null;
                    doublePredicate.test(this.f42678f);
                    throw null;
                }
                if (!zD) {
                    return zD;
                }
                doubleConsumer.accept(this.f42678f);
                return zD;
            default:
                if (!this.f42702d || !b() || !((j$.util.E) this.f42699a).tryAdvance((DoubleConsumer) this)) {
                    this.f42702d = false;
                    return false;
                }
                DoublePredicate doublePredicate2 = null;
                doublePredicate2.test(this.f42678f);
                throw null;
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public j$.util.E trySplit() {
        switch (this.f42679g) {
            case 1:
                if (this.f42701c.get()) {
                    return null;
                }
                return (j$.util.E) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        switch (this.f42679g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f42679g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }
}
