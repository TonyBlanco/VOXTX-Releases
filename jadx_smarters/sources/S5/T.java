package s5;

import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public class T extends AbstractC2743y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final AbstractC2743y f50012f = new T(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f50013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f50014e;

    public T(Object[] objArr, int i9) {
        this.f50013d = objArr;
        this.f50014e = i9;
    }

    @Override // s5.AbstractC2743y, s5.AbstractC2741w
    public int e(Object[] objArr, int i9) {
        System.arraycopy(this.f50013d, 0, objArr, i9, this.f50014e);
        return i9 + this.f50014e;
    }

    @Override // s5.AbstractC2741w
    public Object[] f() {
        return this.f50013d;
    }

    @Override // s5.AbstractC2741w
    public int g() {
        return this.f50014e;
    }

    @Override // java.util.List
    public Object get(int i9) {
        r5.m.i(i9, this.f50014e);
        Object obj = this.f50013d[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // s5.AbstractC2741w
    public int i() {
        return 0;
    }

    @Override // s5.AbstractC2741w
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f50014e;
    }
}
