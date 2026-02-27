package k;

/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f43245a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43246b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43247c = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f43248d = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f43249e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f43250f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f43251g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f43252h = false;

    public int a() {
        return this.f43251g ? this.f43245a : this.f43246b;
    }

    public int b() {
        return this.f43245a;
    }

    public int c() {
        return this.f43246b;
    }

    public int d() {
        return this.f43251g ? this.f43246b : this.f43245a;
    }

    public void e(int i9, int i10) {
        this.f43252h = false;
        if (i9 != Integer.MIN_VALUE) {
            this.f43249e = i9;
            this.f43245a = i9;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f43250f = i10;
            this.f43246b = i10;
        }
    }

    public void f(boolean z9) {
        int i9;
        if (z9 == this.f43251g) {
            return;
        }
        this.f43251g = z9;
        if (this.f43252h) {
            if (z9) {
                int i10 = this.f43248d;
                if (i10 == Integer.MIN_VALUE) {
                    i10 = this.f43249e;
                }
                this.f43245a = i10;
                i9 = this.f43247c;
                if (i9 == Integer.MIN_VALUE) {
                }
            } else {
                int i11 = this.f43247c;
                if (i11 == Integer.MIN_VALUE) {
                    i11 = this.f43249e;
                }
                this.f43245a = i11;
                i9 = this.f43248d;
                if (i9 == Integer.MIN_VALUE) {
                }
            }
            this.f43246b = i9;
        }
        this.f43245a = this.f43249e;
        i9 = this.f43250f;
        this.f43246b = i9;
    }

    public void g(int i9, int i10) {
        this.f43247c = i9;
        this.f43248d = i10;
        this.f43252h = true;
        if (this.f43251g) {
            if (i10 != Integer.MIN_VALUE) {
                this.f43245a = i10;
            }
            if (i9 != Integer.MIN_VALUE) {
                this.f43246b = i9;
                return;
            }
            return;
        }
        if (i9 != Integer.MIN_VALUE) {
            this.f43245a = i9;
        }
        if (i10 != Integer.MIN_VALUE) {
            this.f43246b = i10;
        }
    }
}
