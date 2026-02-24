package R6;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9329a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9330b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9331c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f9332d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f9333e = -1;

    public d(int i9, int i10, int i11, int i12) {
        this.f9329a = i9;
        this.f9330b = i10;
        this.f9331c = i11;
        this.f9332d = i12;
    }

    public int a() {
        return this.f9331c;
    }

    public int b() {
        return this.f9330b;
    }

    public int c() {
        return this.f9333e;
    }

    public int d() {
        return this.f9329a;
    }

    public int e() {
        return this.f9332d;
    }

    public int f() {
        return this.f9330b - this.f9329a;
    }

    public boolean g() {
        return h(this.f9333e);
    }

    public boolean h(int i9) {
        return i9 != -1 && this.f9331c == (i9 % 3) * 3;
    }

    public void i(int i9) {
        this.f9333e = i9;
    }

    public void j() {
        this.f9333e = ((this.f9332d / 30) * 3) + (this.f9331c / 3);
    }

    public String toString() {
        return this.f9333e + "|" + this.f9332d;
    }
}
