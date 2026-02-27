package P6;

/* JADX INFO: loaded from: classes.dex */
public final class p extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f7345b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7346c;

    public p(int i9, int i10, int i11) throws x6.g {
        super(i9);
        if (i10 < 0 || i10 > 10 || i11 < 0 || i11 > 10) {
            throw x6.g.a();
        }
        this.f7345b = i10;
        this.f7346c = i11;
    }

    public int b() {
        return this.f7345b;
    }

    public int c() {
        return this.f7346c;
    }

    public boolean d() {
        return this.f7345b == 10;
    }

    public boolean e() {
        return this.f7346c == 10;
    }
}
