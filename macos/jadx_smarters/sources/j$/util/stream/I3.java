package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class I3 extends AbstractC1969g3 {
    @Override // j$.util.stream.AbstractC1969g3
    final void d() {
        C1939a3 c1939a3 = new C1939a3();
        this.f42666h = c1939a3;
        Objects.requireNonNull(c1939a3);
        this.f42663e = this.f42660b.W(new H3(c1939a3, 0));
        this.f42664f = new C1935a(this, 5);
    }

    @Override // j$.util.stream.AbstractC1969g3
    final AbstractC1969g3 e(Spliterator spliterator) {
        return new I3(this.f42660b, spliterator, this.f42659a);
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        if (this.f42666h != null || this.f42667i) {
            while (tryAdvance(consumer)) {
            }
            return;
        }
        Objects.requireNonNull(consumer);
        c();
        Objects.requireNonNull(consumer);
        H3 h32 = new H3(consumer, 1);
        this.f42660b.V(this.f42662d, h32);
        this.f42667i = true;
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        Object obj;
        Objects.requireNonNull(consumer);
        boolean zA = a();
        if (zA) {
            C1939a3 c1939a3 = (C1939a3) this.f42666h;
            long j9 = this.f42665g;
            if (c1939a3.f42605c != 0) {
                if (j9 >= c1939a3.count()) {
                    throw new IndexOutOfBoundsException(Long.toString(j9));
                }
                for (int i9 = 0; i9 <= c1939a3.f42605c; i9++) {
                    long j10 = c1939a3.f42606d[i9];
                    Object[] objArr = c1939a3.f42583f[i9];
                    if (j9 < ((long) objArr.length) + j10) {
                        obj = objArr[(int) (j9 - j10)];
                    }
                }
                throw new IndexOutOfBoundsException(Long.toString(j9));
            }
            if (j9 >= c1939a3.f42604b) {
                throw new IndexOutOfBoundsException(Long.toString(j9));
            }
            obj = c1939a3.f42582e[(int) j9];
            consumer.q(obj);
        }
        return zA;
    }
}
