package B3;

/* JADX INFO: loaded from: classes3.dex */
public class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f275e;

    public A(A a9) {
        this.f271a = a9.f271a;
        this.f272b = a9.f272b;
        this.f273c = a9.f273c;
        this.f274d = a9.f274d;
        this.f275e = a9.f275e;
    }

    public A(Object obj) {
        this(obj, -1L);
    }

    public A(Object obj, int i9, int i10, long j9) {
        this(obj, i9, i10, j9, -1);
    }

    public A(Object obj, int i9, int i10, long j9, int i11) {
        this.f271a = obj;
        this.f272b = i9;
        this.f273c = i10;
        this.f274d = j9;
        this.f275e = i11;
    }

    public A(Object obj, long j9) {
        this(obj, -1, -1, j9, -1);
    }

    public A(Object obj, long j9, int i9) {
        this(obj, -1, -1, j9, i9);
    }

    public A a(Object obj) {
        return this.f271a.equals(obj) ? this : new A(obj, this.f272b, this.f273c, this.f274d, this.f275e);
    }

    public boolean b() {
        return this.f272b != -1;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        return this.f271a.equals(a9.f271a) && this.f272b == a9.f272b && this.f273c == a9.f273c && this.f274d == a9.f274d && this.f275e == a9.f275e;
    }

    public int hashCode() {
        return ((((((((527 + this.f271a.hashCode()) * 31) + this.f272b) * 31) + this.f273c) * 31) + ((int) this.f274d)) * 31) + this.f275e;
    }
}
