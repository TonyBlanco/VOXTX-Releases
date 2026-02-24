package j$.util;

/* JADX INFO: loaded from: classes2.dex */
public interface N extends Spliterator {
    void forEachRemaining(Object obj);

    boolean tryAdvance(Object obj);

    @Override // j$.util.Spliterator
    N trySplit();
}
