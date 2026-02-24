package P6;

/* JADX INFO: loaded from: classes.dex */
public final class o extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f7343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f7344d;

    public o(int i9, String str) {
        super(i9);
        this.f7342b = str;
        this.f7344d = false;
        this.f7343c = 0;
    }

    public o(int i9, String str, int i10) {
        super(i9);
        this.f7344d = true;
        this.f7343c = i10;
        this.f7342b = str;
    }

    public String b() {
        return this.f7342b;
    }

    public int c() {
        return this.f7343c;
    }

    public boolean d() {
        return this.f7344d;
    }
}
