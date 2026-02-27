package j$.util.stream;

/* JADX INFO: renamed from: j$.util.stream.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1950d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final int f42603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f42604b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f42605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected long[] f42606d;

    protected AbstractC1950d() {
        this.f42603a = 4;
    }

    protected AbstractC1950d(int i9) {
        if (i9 >= 0) {
            this.f42603a = Math.max(4, 32 - Integer.numberOfLeadingZeros(i9 - 1));
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + i9);
        }
    }

    public abstract void clear();

    public final long count() {
        int i9 = this.f42605c;
        return i9 == 0 ? this.f42604b : this.f42606d[i9] + ((long) this.f42604b);
    }
}
