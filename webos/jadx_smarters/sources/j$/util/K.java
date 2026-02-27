package j$.util;

import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface K extends N {
    void forEachRemaining(LongConsumer longConsumer);

    boolean tryAdvance(LongConsumer longConsumer);

    @Override // j$.util.N, j$.util.Spliterator
    K trySplit();
}
