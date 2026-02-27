package s;

/* JADX INFO: renamed from: s.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2700f implements Cloneable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final Object f49826f = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f49827a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long[] f49828c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object[] f49829d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f49830e;

    public C2700f() {
        this(10);
    }

    public C2700f(int i9) {
        this.f49827a = false;
        if (i9 == 0) {
            this.f49828c = AbstractC2699e.f49824b;
            this.f49829d = AbstractC2699e.f49825c;
        } else {
            int iF = AbstractC2699e.f(i9);
            this.f49828c = new long[iF];
            this.f49829d = new Object[iF];
        }
    }

    public void b(long j9, Object obj) {
        int i9 = this.f49830e;
        if (i9 != 0 && j9 <= this.f49828c[i9 - 1]) {
            k(j9, obj);
            return;
        }
        if (this.f49827a && i9 >= this.f49828c.length) {
            f();
        }
        int i10 = this.f49830e;
        if (i10 >= this.f49828c.length) {
            int iF = AbstractC2699e.f(i10 + 1);
            long[] jArr = new long[iF];
            Object[] objArr = new Object[iF];
            long[] jArr2 = this.f49828c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr2 = this.f49829d;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f49828c = jArr;
            this.f49829d = objArr;
        }
        this.f49828c[i10] = j9;
        this.f49829d[i10] = obj;
        this.f49830e = i10 + 1;
    }

    public void d() {
        int i9 = this.f49830e;
        Object[] objArr = this.f49829d;
        for (int i10 = 0; i10 < i9; i10++) {
            objArr[i10] = null;
        }
        this.f49830e = 0;
        this.f49827a = false;
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public C2700f clone() {
        try {
            C2700f c2700f = (C2700f) super.clone();
            c2700f.f49828c = (long[]) this.f49828c.clone();
            c2700f.f49829d = (Object[]) this.f49829d.clone();
            return c2700f;
        } catch (CloneNotSupportedException e9) {
            throw new AssertionError(e9);
        }
    }

    public final void f() {
        int i9 = this.f49830e;
        long[] jArr = this.f49828c;
        Object[] objArr = this.f49829d;
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            Object obj = objArr[i11];
            if (obj != f49826f) {
                if (i11 != i10) {
                    jArr[i10] = jArr[i11];
                    objArr[i10] = obj;
                    objArr[i11] = null;
                }
                i10++;
            }
        }
        this.f49827a = false;
        this.f49830e = i10;
    }

    public Object g(long j9) {
        return h(j9, null);
    }

    public Object h(long j9, Object obj) {
        Object obj2;
        int iB = AbstractC2699e.b(this.f49828c, this.f49830e, j9);
        return (iB < 0 || (obj2 = this.f49829d[iB]) == f49826f) ? obj : obj2;
    }

    public int i(long j9) {
        if (this.f49827a) {
            f();
        }
        return AbstractC2699e.b(this.f49828c, this.f49830e, j9);
    }

    public long j(int i9) {
        if (this.f49827a) {
            f();
        }
        return this.f49828c[i9];
    }

    public void k(long j9, Object obj) {
        int iB = AbstractC2699e.b(this.f49828c, this.f49830e, j9);
        if (iB >= 0) {
            this.f49829d[iB] = obj;
            return;
        }
        int i9 = ~iB;
        int i10 = this.f49830e;
        if (i9 < i10) {
            Object[] objArr = this.f49829d;
            if (objArr[i9] == f49826f) {
                this.f49828c[i9] = j9;
                objArr[i9] = obj;
                return;
            }
        }
        if (this.f49827a && i10 >= this.f49828c.length) {
            f();
            i9 = ~AbstractC2699e.b(this.f49828c, this.f49830e, j9);
        }
        int i11 = this.f49830e;
        if (i11 >= this.f49828c.length) {
            int iF = AbstractC2699e.f(i11 + 1);
            long[] jArr = new long[iF];
            Object[] objArr2 = new Object[iF];
            long[] jArr2 = this.f49828c;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            Object[] objArr3 = this.f49829d;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.f49828c = jArr;
            this.f49829d = objArr2;
        }
        int i12 = this.f49830e;
        if (i12 - i9 != 0) {
            long[] jArr3 = this.f49828c;
            int i13 = i9 + 1;
            System.arraycopy(jArr3, i9, jArr3, i13, i12 - i9);
            Object[] objArr4 = this.f49829d;
            System.arraycopy(objArr4, i9, objArr4, i13, this.f49830e - i9);
        }
        this.f49828c[i9] = j9;
        this.f49829d[i9] = obj;
        this.f49830e++;
    }

    public void l(long j9) {
        int iB = AbstractC2699e.b(this.f49828c, this.f49830e, j9);
        if (iB >= 0) {
            Object[] objArr = this.f49829d;
            Object obj = objArr[iB];
            Object obj2 = f49826f;
            if (obj != obj2) {
                objArr[iB] = obj2;
                this.f49827a = true;
            }
        }
    }

    public void m(int i9) {
        Object[] objArr = this.f49829d;
        Object obj = objArr[i9];
        Object obj2 = f49826f;
        if (obj != obj2) {
            objArr[i9] = obj2;
            this.f49827a = true;
        }
    }

    public int n() {
        if (this.f49827a) {
            f();
        }
        return this.f49830e;
    }

    public Object o(int i9) {
        if (this.f49827a) {
            f();
        }
        return this.f49829d[i9];
    }

    public String toString() {
        if (n() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f49830e * 28);
        sb.append('{');
        for (int i9 = 0; i9 < this.f49830e; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            sb.append(j(i9));
            sb.append('=');
            Object objO = o(i9);
            if (objO != this) {
                sb.append(objO);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
