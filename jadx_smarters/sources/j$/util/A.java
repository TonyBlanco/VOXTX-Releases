package j$.util;

import j$.util.Comparator;
import j$.util.List;
import j$.util.Map;
import java.util.LinkedHashSet;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;
import java.util.SortedSet;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class A {
    public static void a(E e9, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            e9.forEachRemaining((DoubleConsumer) consumer);
        } else {
            if (e0.f42351a) {
                e0.a(e9.getClass(), "{0} calling Spliterator.OfDouble.forEachRemaining((DoubleConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            e9.forEachRemaining((DoubleConsumer) new C1930n(consumer));
        }
    }

    public static void b(H h9, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            h9.forEachRemaining((IntConsumer) consumer);
        } else {
            if (e0.f42351a) {
                e0.a(h9.getClass(), "{0} calling Spliterator.OfInt.forEachRemaining((IntConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            h9.forEachRemaining((IntConsumer) new r(consumer));
        }
    }

    public static void c(K k9, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            k9.forEachRemaining((LongConsumer) consumer);
        } else {
            if (e0.f42351a) {
                e0.a(k9.getClass(), "{0} calling Spliterator.OfLong.forEachRemaining((LongConsumer) action::accept)");
                throw null;
            }
            Objects.requireNonNull(consumer);
            k9.forEachRemaining((LongConsumer) new C2066v(consumer));
        }
    }

    public static long d(Spliterator spliterator) {
        if ((spliterator.characteristics() & 64) == 0) {
            return -1L;
        }
        return spliterator.estimateSize();
    }

    public static boolean e(Spliterator spliterator, int i9) {
        return (spliterator.characteristics() & i9) == i9;
    }

    public static Spliterator f(SortedSet sortedSet) {
        return new B(sortedSet, sortedSet);
    }

    public static boolean g(E e9, Consumer consumer) {
        if (consumer instanceof DoubleConsumer) {
            return e9.tryAdvance((DoubleConsumer) consumer);
        }
        if (e0.f42351a) {
            e0.a(e9.getClass(), "{0} calling Spliterator.OfDouble.tryAdvance((DoubleConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return e9.tryAdvance((DoubleConsumer) new C1930n(consumer));
    }

    public static boolean h(H h9, Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            return h9.tryAdvance((IntConsumer) consumer);
        }
        if (e0.f42351a) {
            e0.a(h9.getClass(), "{0} calling Spliterator.OfInt.tryAdvance((IntConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return h9.tryAdvance((IntConsumer) new r(consumer));
    }

    public static boolean i(K k9, Consumer consumer) {
        if (consumer instanceof LongConsumer) {
            return k9.tryAdvance((LongConsumer) consumer);
        }
        if (e0.f42351a) {
            e0.a(k9.getClass(), "{0} calling Spliterator.OfLong.tryAdvance((LongConsumer) action::accept)");
            throw null;
        }
        Objects.requireNonNull(consumer);
        return k9.tryAdvance((LongConsumer) new C2066v(consumer));
    }

    public static Optional j(java.util.Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.isPresent() ? Optional.d(optional.get()) : Optional.a();
    }

    public static C1927k k(OptionalDouble optionalDouble) {
        if (optionalDouble == null) {
            return null;
        }
        return optionalDouble.isPresent() ? C1927k.d(optionalDouble.getAsDouble()) : C1927k.a();
    }

    public static C1928l l(OptionalInt optionalInt) {
        if (optionalInt == null) {
            return null;
        }
        return optionalInt.isPresent() ? C1928l.d(optionalInt.getAsInt()) : C1928l.a();
    }

    public static C1929m m(OptionalLong optionalLong) {
        if (optionalLong == null) {
            return null;
        }
        return optionalLong.isPresent() ? C1929m.d(optionalLong.getAsLong()) : C1929m.a();
    }

    public static java.util.Optional n(Optional optional) {
        if (optional == null) {
            return null;
        }
        return optional.c() ? java.util.Optional.of(optional.b()) : java.util.Optional.empty();
    }

    public static OptionalDouble o(C1927k c1927k) {
        if (c1927k == null) {
            return null;
        }
        return c1927k.c() ? OptionalDouble.of(c1927k.b()) : OptionalDouble.empty();
    }

    public static OptionalInt p(C1928l c1928l) {
        if (c1928l == null) {
            return null;
        }
        return c1928l.c() ? OptionalInt.of(c1928l.b()) : OptionalInt.empty();
    }

    public static OptionalLong q(C1929m c1929m) {
        if (c1929m == null) {
            return null;
        }
        return c1929m.c() ? OptionalLong.of(c1929m.b()) : OptionalLong.empty();
    }

    public static /* synthetic */ Object r(java.util.Map map, Object obj, Object obj2) {
        return map instanceof Map ? ((Map) map).putIfAbsent(obj, obj2) : Map.CC.$default$putIfAbsent(map, obj, obj2);
    }

    public static Spliterator s(java.util.Collection collection) {
        return collection instanceof Collection ? ((Collection) collection).spliterator() : collection instanceof LinkedHashSet ? Spliterators.spliterator((LinkedHashSet) collection, 17) : collection instanceof SortedSet ? f((SortedSet) collection) : collection instanceof java.util.Set ? Spliterators.spliterator((java.util.Set) collection, 1) : collection instanceof java.util.List ? List.CC.a((java.util.List) collection) : Spliterators.spliterator(collection, 0);
    }

    public static /* synthetic */ java.util.Comparator t(java.util.Comparator comparator, java.util.Comparator comparator2) {
        return comparator instanceof Comparator ? ((Comparator) comparator).thenComparing(comparator2) : Comparator.CC.$default$thenComparing(comparator, comparator2);
    }

    public int characteristics() {
        return 16448;
    }

    public long estimateSize() {
        return 0L;
    }

    public void forEachRemaining(Object obj) {
        Objects.requireNonNull(obj);
    }

    public boolean tryAdvance(Object obj) {
        Objects.requireNonNull(obj);
        return false;
    }

    public Spliterator trySplit() {
        return null;
    }
}
