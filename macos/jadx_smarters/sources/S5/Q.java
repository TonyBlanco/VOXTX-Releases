package s5;

import java.util.Comparator;
import r5.InterfaceC2677f;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Q implements Comparator {
    public static Q a(Comparator comparator) {
        return comparator instanceof Q ? (Q) comparator : new C2735p(comparator);
    }

    public static Q c() {
        return N.f50011a;
    }

    public AbstractC2743y b(Iterable iterable) {
        return AbstractC2743y.F(this, iterable);
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public Q d() {
        return e(I.e());
    }

    public Q e(InterfaceC2677f interfaceC2677f) {
        return new C2730k(interfaceC2677f, this);
    }

    public Q f() {
        return new X(this);
    }
}
