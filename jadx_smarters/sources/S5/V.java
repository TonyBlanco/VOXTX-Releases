package s5;

/* JADX INFO: loaded from: classes3.dex */
public final class V extends AbstractC2719C {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object[] f50029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final V f50030j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f50031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f50032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient Object[] f50033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final transient int f50034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient int f50035h;

    static {
        Object[] objArr = new Object[0];
        f50029i = objArr;
        f50030j = new V(objArr, 0, objArr, 0, 0);
    }

    public V(Object[] objArr, int i9, Object[] objArr2, int i10, int i11) {
        this.f50031d = objArr;
        this.f50032e = i9;
        this.f50033f = objArr2;
        this.f50034g = i10;
        this.f50035h = i11;
    }

    @Override // s5.AbstractC2741w, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        Object[] objArr = this.f50033f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iC = AbstractC2740v.c(obj);
        while (true) {
            int i9 = iC & this.f50034g;
            Object obj2 = objArr[i9];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iC = i9 + 1;
        }
    }

    @Override // s5.AbstractC2741w
    public int e(Object[] objArr, int i9) {
        System.arraycopy(this.f50031d, 0, objArr, i9, this.f50035h);
        return i9 + this.f50035h;
    }

    @Override // s5.AbstractC2741w
    public Object[] f() {
        return this.f50031d;
    }

    @Override // s5.AbstractC2741w
    public int g() {
        return this.f50035h;
    }

    @Override // s5.AbstractC2719C, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f50032e;
    }

    @Override // s5.AbstractC2741w
    public int i() {
        return 0;
    }

    @Override // s5.AbstractC2741w
    public boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: l */
    public c0 iterator() {
        return d().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f50035h;
    }

    @Override // s5.AbstractC2719C
    public AbstractC2743y u() {
        return AbstractC2743y.o(this.f50031d, this.f50035h);
    }

    @Override // s5.AbstractC2719C
    public boolean y() {
        return true;
    }
}
