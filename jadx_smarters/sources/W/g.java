package w;

/* JADX INFO: loaded from: classes.dex */
public class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object[] f51516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f51517b;

    public g(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f51516a = new Object[i9];
    }

    @Override // w.f
    public boolean a(Object obj) {
        int i9 = this.f51517b;
        Object[] objArr = this.f51516a;
        if (i9 >= objArr.length) {
            return false;
        }
        objArr[i9] = obj;
        this.f51517b = i9 + 1;
        return true;
    }

    @Override // w.f
    public Object b() {
        int i9 = this.f51517b;
        if (i9 <= 0) {
            return null;
        }
        int i10 = i9 - 1;
        Object[] objArr = this.f51516a;
        Object obj = objArr[i10];
        objArr[i10] = null;
        this.f51517b = i9 - 1;
        return obj;
    }

    @Override // w.f
    public void c(Object[] objArr, int i9) {
        if (i9 > objArr.length) {
            i9 = objArr.length;
        }
        for (int i10 = 0; i10 < i9; i10++) {
            Object obj = objArr[i10];
            int i11 = this.f51517b;
            Object[] objArr2 = this.f51516a;
            if (i11 < objArr2.length) {
                objArr2[i11] = obj;
                this.f51517b = i11 + 1;
            }
        }
    }
}
