package s5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class W extends Q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W f50036a = new W();

    @Override // s5.Q
    public Q f() {
        return Q.c();
    }

    @Override // s5.Q, java.util.Comparator
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable comparable, Comparable comparable2) {
        r5.m.k(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    public String toString() {
        return "Ordering.natural().reverse()";
    }
}
