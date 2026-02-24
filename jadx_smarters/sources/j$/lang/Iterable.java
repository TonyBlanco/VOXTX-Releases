package j$.lang;

import j$.util.A;
import j$.util.List;
import j$.util.Objects;
import j$.util.Spliterator;
import j$.util.Spliterators;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public interface Iterable<T> {

    /* JADX INFO: renamed from: j$.lang.Iterable$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static void $default$forEach(java.lang.Iterable iterable, Consumer consumer) {
            Objects.requireNonNull(consumer);
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }
    }

    /* JADX INFO: renamed from: j$.lang.Iterable$-EL, reason: invalid class name */
    public final /* synthetic */ class EL {
        /* JADX WARN: Multi-variable type inference failed */
        public static void forEach(java.lang.Iterable iterable, Consumer consumer) {
            if (iterable instanceof Iterable) {
                ((Iterable) iterable).forEach(consumer);
                return;
            }
            if (!(iterable instanceof Collection)) {
                CC.$default$forEach(iterable, consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            Iterator it = ((Collection) iterable).iterator();
            while (it.hasNext()) {
                consumer.accept(it.next());
            }
        }

        public static Spliterator spliterator(java.lang.Iterable iterable) {
            return iterable instanceof Iterable ? ((Iterable) iterable).spliterator() : iterable instanceof LinkedHashSet ? Spliterators.spliterator((LinkedHashSet) iterable, 17) : iterable instanceof SortedSet ? A.f((SortedSet) iterable) : iterable instanceof Set ? Spliterators.spliterator((Set) iterable, 1) : iterable instanceof List ? List.CC.a((java.util.List) iterable) : iterable instanceof Collection ? Spliterators.spliterator((Collection) iterable, 0) : Spliterators.n(iterable.iterator(), 0);
        }
    }

    void forEach(Consumer<? super T> consumer);

    Spliterator<T> spliterator();
}
