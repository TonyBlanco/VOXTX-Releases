package O;

/* JADX INFO: loaded from: classes.dex */
public class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f5402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5403b;

    public f(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f5402a = new Object[i9];
    }

    @Override // O.e
    public boolean a(Object obj) {
        if (c(obj)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i9 = this.f5403b;
        Object[] objArr = this.f5402a;
        if (i9 >= objArr.length) {
            return false;
        }
        objArr[i9] = obj;
        this.f5403b = i9 + 1;
        return true;
    }

    @Override // O.e
    public Object b() {
        int i9 = this.f5403b;
        if (i9 <= 0) {
            return null;
        }
        int i10 = i9 - 1;
        Object[] objArr = this.f5402a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f5403b = i9 - 1;
        return obj;
    }

    public final boolean c(Object obj) {
        for (int i9 = 0; i9 < this.f5403b; i9++) {
            if (this.f5402a[i9] == obj) {
                return true;
            }
        }
        return false;
    }
}
