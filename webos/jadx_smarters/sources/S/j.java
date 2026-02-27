package s;

/* JADX INFO: loaded from: classes.dex */
public class j implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f49853f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49854a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f49855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f49856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49857e;

    public j() {
        this(10);
    }

    public j(int i9) {
        this.f49854a = false;
        if (i9 == 0) {
            this.f49855c = AbstractC2699e.f49823a;
            this.f49856d = AbstractC2699e.f49825c;
        } else {
            int iE = AbstractC2699e.e(i9);
            this.f49855c = new int[iE];
            this.f49856d = new Object[iE];
        }
    }

    public void b(int i9, Object obj) {
        int i10 = this.f49857e;
        if (i10 != 0 && i9 <= this.f49855c[i10 - 1]) {
            k(i9, obj);
            return;
        }
        if (this.f49854a && i10 >= this.f49855c.length) {
            f();
        }
        int i11 = this.f49857e;
        if (i11 >= this.f49855c.length) {
            int iE = AbstractC2699e.e(i11 + 1);
            int[] iArr = new int[iE];
            Object[] objArr = new Object[iE];
            int[] iArr2 = this.f49855c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr2 = this.f49856d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f49855c = iArr;
            this.f49856d = objArr;
        }
        this.f49855c[i11] = i9;
        this.f49856d[i11] = obj;
        this.f49857e = i11 + 1;
    }

    public void d() {
        int i9 = this.f49857e;
        Object[] objArr = this.f49856d;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.f49857e = 0;
        this.f49854a = false;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public j clone() {
        try {
            j jVar = (j) super.clone();
            jVar.f49855c = (int[]) this.f49855c.clone();
            jVar.f49856d = (Object[]) this.f49856d.clone();
            return jVar;
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }

    public final void f() {
        int i9 = this.f49857e;
        int[] iArr = this.f49855c;
        Object[] objArr = this.f49856d;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (obj != f49853f) {
                if (i11 != i10) {
                    iArr[i10] = iArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.f49854a = false;
        this.f49857e = i10;
    }

    public Object g(int i9) {
        return h(i9, null);
    }

    public Object h(int i9, Object obj) {
        Object obj2;
        int iA = AbstractC2699e.a(this.f49855c, this.f49857e, i9);
        return (iA < 0 || (obj2 = this.f49856d[iA]) == f49853f) ? obj : obj2;
    }

    public int i(Object obj) {
        if (this.f49854a) {
            f();
        }
        for (int i9 = 0; i9 < this.f49857e; i9++) {
            if (this.f49856d[i9] == obj) {
                return i9;
            }
        }
        return -1;
    }

    public int j(int i9) {
        if (this.f49854a) {
            f();
        }
        return this.f49855c[i9];
    }

    public void k(int i9, Object obj) {
        int iA = AbstractC2699e.a(this.f49855c, this.f49857e, i9);
        if (iA >= 0) {
            this.f49856d[iA] = obj;
            return;
        }
        int i10 = ~iA;
        int i11 = this.f49857e;
        if (i10 < i11) {
            Object[] objArr = this.f49856d;
            if (objArr[i10] == f49853f) {
                this.f49855c[i10] = i9;
                objArr[i10] = obj;
                return;
            }
        }
        if (this.f49854a && i11 >= this.f49855c.length) {
            f();
            i10 = ~AbstractC2699e.a(this.f49855c, this.f49857e, i9);
        }
        int i12 = this.f49857e;
        if (i12 >= this.f49855c.length) {
            int iE = AbstractC2699e.e(i12 + 1);
            int[] iArr = new int[iE];
            Object[] objArr2 = new Object[iE];
            int[] iArr2 = this.f49855c;
            System.arraycopy(iArr2, 0, iArr, 0, iArr2.length);
            Object[] objArr3 = this.f49856d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f49855c = iArr;
            this.f49856d = objArr2;
        }
        int i13 = this.f49857e;
        if (i13 - i10 != 0) {
            int[] iArr3 = this.f49855c;
            int i14 = i10 + 1;
            System.arraycopy(iArr3, i10, iArr3, i14, i13 - i10);
            Object[] objArr4 = this.f49856d;
            System.arraycopy(objArr4, i10, objArr4, i14, this.f49857e - i10);
        }
        this.f49855c[i10] = i9;
        this.f49856d[i10] = obj;
        this.f49857e++;
    }

    public void l(int i9) {
        Object[] objArr = this.f49856d;
        Object obj = objArr[i9];
        Object obj2 = f49853f;
        if (obj != obj2) {
            objArr[i9] = obj2;
            this.f49854a = true;
        }
    }

    public int m() {
        if (this.f49854a) {
            f();
        }
        return this.f49857e;
    }

    public Object n(int i9) {
        if (this.f49854a) {
            f();
        }
        return this.f49856d[i9];
    }

    public String toString() {
        if (m() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49857e * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.f49857e; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(j(i9));
            sb.append('=');
            Object objN = n(i9);
            if (objN != this) {
                sb.append(objN);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
