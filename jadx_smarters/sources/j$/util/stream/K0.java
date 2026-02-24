package j$.util.stream;

import j$.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;

/* JADX INFO: loaded from: classes2.dex */
interface K0 {
    K0 b(int i9);

    long count();

    void forEach(Consumer consumer);

    K0 i(long j9, long j10, IntFunction intFunction);

    void j(Object[] objArr, int i9);

    Object[] p(IntFunction intFunction);

    int r();

    Spliterator spliterator();
}
