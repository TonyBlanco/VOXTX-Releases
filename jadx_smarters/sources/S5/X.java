package s5;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class X extends Q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f50037a;

    public X(Q q9) {
        this.f50037a = (Q) r5.m.k(q9);
    }

    @Override // s5.Q, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f50037a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof X) {
            return this.f50037a.equals(((X) obj).f50037a);
        }
        return false;
    }

    @Override // s5.Q
    public Q f() {
        return this.f50037a;
    }

    public int hashCode() {
        return -this.f50037a.hashCode();
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f50037a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 10);
        sb.append(strValueOf);
        sb.append(".reverse()");
        return sb.toString();
    }
}
