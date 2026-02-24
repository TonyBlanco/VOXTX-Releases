package j$.util.stream;

import j$.util.Spliterator;
import java.util.ArrayDeque;
import java.util.function.Consumer;

/* JADX INFO: renamed from: j$.util.stream.n1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C2002n1 extends AbstractC2007o1 {
    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f42720a == null) {
            return;
        }
        if (this.f42723d != null) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Spliterator spliterator = this.f42722c;
        if (spliterator != null) {
            spliterator.forEachRemaining(consumer);
            return;
        }
        ArrayDeque arrayDequeB = b();
        while (true) {
            K0 k0A = AbstractC2007o1.a(arrayDequeB);
            if (k0A == null) {
                this.f42720a = null;
                return;
            }
            k0A.forEach(consumer);
        }
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        K0 k0A;
        if (!c()) {
            return false;
        }
        boolean zTryAdvance = this.f42723d.tryAdvance(consumer);
        if (!zTryAdvance) {
            if (this.f42722c == null && (k0A = AbstractC2007o1.a(this.f42724e)) != null) {
                Spliterator spliterator = k0A.spliterator();
                this.f42723d = spliterator;
                return spliterator.tryAdvance(consumer);
            }
            this.f42720a = null;
        }
        return zTryAdvance;
    }
}
