package s5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class N extends Q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final N f50011a = new N();

    @Override // s5.Q
    public Q f() {
        return W.f50036a;
    }

    @Override // s5.Q, java.util.Comparator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        r5.m.k(comparable);
        r5.m.k(comparable2);
        return comparable.compareTo(comparable2);
    }

    public String toString() {
        return "Ordering.natural()";
    }
}
