package s5;

import java.io.Serializable;
import r5.InterfaceC2677f;

/* JADX INFO: renamed from: s5.k, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2730k extends Q implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2677f f50088a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Q f50089c;

    public C2730k(InterfaceC2677f interfaceC2677f, Q q9) {
        this.f50088a = (InterfaceC2677f) r5.m.k(interfaceC2677f);
        this.f50089c = (Q) r5.m.k(q9);
    }

    @Override // s5.Q, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return this.f50089c.compare(this.f50088a.apply(obj), this.f50088a.apply(obj2));
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C2730k)) {
            return false;
        }
        C2730k c2730k = (C2730k) obj;
        return this.f50088a.equals(c2730k.f50088a) && this.f50089c.equals(c2730k.f50089c);
    }

    public int hashCode() {
        return r5.j.b(this.f50088a, this.f50089c);
    }

    public String toString() {
        String strValueOf = String.valueOf(this.f50089c);
        String strValueOf2 = String.valueOf(this.f50088a);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 13 + strValueOf2.length());
        sb.append(strValueOf);
        sb.append(".onResultOf(");
        sb.append(strValueOf2);
        sb.append(")");
        return sb.toString();
    }
}
