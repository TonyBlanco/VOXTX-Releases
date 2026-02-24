package j$.util.stream;

/* JADX INFO: loaded from: classes2.dex */
abstract class M0 implements K0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final K0 f42475a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final K0 f42476b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f42477c;

    M0(K0 k02, K0 k03) {
        this.f42475a = k02;
        this.f42476b = k03;
        this.f42477c = k02.count() + k03.count();
    }

    @Override // j$.util.stream.K0
    public /* bridge */ /* synthetic */ J0 b(int i9) {
        return (J0) b(i9);
    }

    @Override // j$.util.stream.K0
    public final K0 b(int i9) {
        if (i9 == 0) {
            return this.f42475a;
        }
        if (i9 == 1) {
            return this.f42476b;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // j$.util.stream.K0
    public final long count() {
        return this.f42477c;
    }

    @Override // j$.util.stream.K0
    public final int r() {
        return 2;
    }
}
