package s5;

/* JADX INFO: loaded from: classes3.dex */
public final class a0 extends AbstractC2719C {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f50044d;

    public a0(Object obj) {
        this.f50044d = r5.m.k(obj);
    }

    @Override // s5.AbstractC2741w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f50044d.equals(obj);
    }

    @Override // s5.AbstractC2719C, s5.AbstractC2741w
    public AbstractC2743y d() {
        return AbstractC2743y.A(this.f50044d);
    }

    @Override // s5.AbstractC2741w
    public int e(Object[] objArr, int i9) {
        objArr[i9] = this.f50044d;
        return i9 + 1;
    }

    @Override // s5.AbstractC2719C, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f50044d.hashCode();
    }

    @Override // s5.AbstractC2741w
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public c0 iterator() {
        return E.r(this.f50044d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String string = this.f50044d.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }
}
