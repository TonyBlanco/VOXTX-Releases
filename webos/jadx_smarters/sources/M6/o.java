package M6;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f5204c = {1, 1, 2};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f5205a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f5206b = new n();

    public x6.o a(int i9, D6.a aVar, int i10) {
        int[] iArrN = p.n(aVar, i10, false, f5204c);
        try {
            return this.f5206b.b(i9, aVar, iArrN);
        } catch (x6.n unused) {
            return this.f5205a.b(i9, aVar, iArrN);
        }
    }
}
