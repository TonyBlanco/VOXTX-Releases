package h1;

/* JADX INFO: loaded from: classes.dex */
public class e implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f41523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f41524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f41525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f41526d;

    public e() {
        this(2500, 1, 1.0f);
    }

    public e(int i9, int i10, float f9) {
        this.f41523a = i9;
        this.f41525c = i10;
        this.f41526d = f9;
    }

    @Override // h1.r
    public void a(u uVar) throws u {
        this.f41524b++;
        int i9 = this.f41523a;
        this.f41523a = i9 + ((int) (i9 * this.f41526d));
        if (!d()) {
            throw uVar;
        }
    }

    @Override // h1.r
    public int b() {
        return this.f41524b;
    }

    @Override // h1.r
    public int c() {
        return this.f41523a;
    }

    public boolean d() {
        return this.f41524b <= this.f41525c;
    }
}
