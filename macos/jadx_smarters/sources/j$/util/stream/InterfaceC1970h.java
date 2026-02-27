package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* JADX INFO: renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC1970h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC1970h onClose(Runnable runnable);

    InterfaceC1970h parallel();

    InterfaceC1970h sequential();

    Spliterator spliterator();

    InterfaceC1970h unordered();
}
