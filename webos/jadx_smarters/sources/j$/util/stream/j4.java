package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import java.util.function.LongPredicate;

/* JADX INFO: loaded from: classes2.dex */
final class j4 extends l4 implements LongConsumer, j$.util.K {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    long f42688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f42689g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(Spliterator spliterator, int i9) {
        super(spliterator);
        this.f42689g = i9;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j4(Spliterator spliterator, l4 l4Var, int i9) {
        super(spliterator, l4Var);
        this.f42689g = i9;
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42703e = (this.f42703e + 1) & 63;
        this.f42688f = j9;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.l4
    final Spliterator c(Spliterator spliterator) {
        j$.util.K k9 = (j$.util.K) spliterator;
        switch (this.f42689g) {
            case 0:
                return new j4(k9, this, 0);
            default:
                return new j4(k9, this, 1);
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        j$.util.A.c(this, consumer);
    }

    @Override // j$.util.N
    public final void forEachRemaining(LongConsumer longConsumer) {
        while (tryAdvance(longConsumer)) {
        }
    }

    @Override // j$.util.N
    public /* bridge */ /* synthetic */ boolean tryAdvance(Object obj) {
        switch (this.f42689g) {
            case 1:
                tryAdvance((LongConsumer) obj);
                return false;
            default:
                return d(obj);
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return j$.util.A.i(this, consumer);
    }

    @Override // j$.util.K
    public final boolean d(LongConsumer longConsumer) {
        switch (this.f42689g) {
            case 0:
                boolean z9 = this.f42702d;
                Spliterator spliterator = this.f42699a;
                if (!z9) {
                    return ((j$.util.K) spliterator).tryAdvance(longConsumer);
                }
                this.f42702d = false;
                boolean zD = ((j$.util.K) spliterator).tryAdvance((LongConsumer) this);
                if (zD && b()) {
                    LongPredicate longPredicate = null;
                    longPredicate.test(this.f42688f);
                    throw null;
                }
                if (!zD) {
                    return zD;
                }
                longConsumer.accept(this.f42688f);
                return zD;
            default:
                if (!this.f42702d || !b() || !((j$.util.K) this.f42699a).tryAdvance((LongConsumer) this)) {
                    this.f42702d = false;
                    return false;
                }
                LongPredicate longPredicate2 = null;
                longPredicate2.test(this.f42688f);
                throw null;
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public j$.util.K trySplit() {
        switch (this.f42689g) {
            case 1:
                if (this.f42701c.get()) {
                    return null;
                }
                return (j$.util.K) super.trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ j$.util.N trySplit() {
        switch (this.f42689g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }

    @Override // j$.util.stream.l4, j$.util.Spliterator
    public /* bridge */ /* synthetic */ Spliterator trySplit() {
        switch (this.f42689g) {
            case 1:
                return trySplit();
            default:
                return super.trySplit();
        }
    }
}
