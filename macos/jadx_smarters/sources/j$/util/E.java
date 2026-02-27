package j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface E extends N {
    void forEachRemaining(DoubleConsumer doubleConsumer);

    boolean tryAdvance(DoubleConsumer doubleConsumer);

    @Override // j$.util.N, j$.util.Spliterator
    E trySplit();
}
