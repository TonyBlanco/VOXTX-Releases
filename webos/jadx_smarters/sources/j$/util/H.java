package j$.util;

import java.util.function.IntConsumer;

/* JADX INFO: loaded from: classes2.dex */
public interface H extends N {
    void forEachRemaining(IntConsumer intConsumer);

    boolean tryAdvance(IntConsumer intConsumer);

    @Override // j$.util.N, j$.util.Spliterator
    H trySplit();
}
