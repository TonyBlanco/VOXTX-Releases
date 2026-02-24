package s5;

import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: renamed from: s5.p, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2735p extends Q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Comparator f50115a;

    public C2735p(Comparator comparator) {
        this.f50115a = (Comparator) r5.m.k(comparator);
    }

    @Override // s5.Q, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f50115a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2735p) {
            return this.f50115a.equals(((C2735p) obj).f50115a);
        }
        return false;
    }

    public int hashCode() {
        return this.f50115a.hashCode();
    }

    public String toString() {
        return this.f50115a.toString();
    }
}
