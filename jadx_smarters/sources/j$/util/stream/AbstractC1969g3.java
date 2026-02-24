package j$.util.stream;

import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.BooleanSupplier;
import java.util.function.Supplier;

/* JADX INFO: renamed from: j$.util.stream.g3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC1969g3 implements Spliterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final boolean f42659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final AbstractC1940b f42660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Supplier f42661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Spliterator f42662d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    InterfaceC2018q2 f42663e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    BooleanSupplier f42664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    long f42665g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    AbstractC1950d f42666h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f42667i;

    AbstractC1969g3(AbstractC1940b abstractC1940b, Spliterator spliterator, boolean z9) {
        this.f42660b = abstractC1940b;
        this.f42661c = null;
        this.f42662d = spliterator;
        this.f42659a = z9;
    }

    AbstractC1969g3(AbstractC1940b abstractC1940b, Supplier supplier, boolean z9) {
        this.f42660b = abstractC1940b;
        this.f42661c = supplier;
        this.f42662d = null;
        this.f42659a = z9;
    }

    private boolean b() {
        while (this.f42666h.count() == 0) {
            if (this.f42663e.o() || !this.f42664f.getAsBoolean()) {
                if (this.f42667i) {
                    return false;
                }
                this.f42663e.l();
                this.f42667i = true;
            }
        }
        return true;
    }

    final boolean a() {
        AbstractC1950d abstractC1950d = this.f42666h;
        if (abstractC1950d == null) {
            if (this.f42667i) {
                return false;
            }
            c();
            d();
            this.f42665g = 0L;
            this.f42663e.m(this.f42662d.getExactSizeIfKnown());
            return b();
        }
        long j9 = this.f42665g + 1;
        this.f42665g = j9;
        boolean z9 = j9 < abstractC1950d.count();
        if (z9) {
            return z9;
        }
        this.f42665g = 0L;
        this.f42666h.clear();
        return b();
    }

    final void c() {
        if (this.f42662d == null) {
            this.f42662d = (Spliterator) this.f42661c.get();
            this.f42661c = null;
        }
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        c();
        int iY = EnumC1959e3.y(this.f42660b.K()) & EnumC1959e3.f42622f;
        return (iY & 64) != 0 ? (iY & (-16449)) | (this.f42662d.characteristics() & 16448) : iY;
    }

    abstract void d();

    abstract AbstractC1969g3 e(Spliterator spliterator);

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        c();
        return this.f42662d.estimateSize();
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        if (j$.util.A.e(this, 4)) {
            return null;
        }
        throw new IllegalStateException();
    }

    @Override // j$.util.Spliterator
    public final long getExactSizeIfKnown() {
        c();
        if (EnumC1959e3.SIZED.q(this.f42660b.K())) {
            return this.f42662d.getExactSizeIfKnown();
        }
        return -1L;
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        return j$.util.A.e(this, i9);
    }

    public final String toString() {
        return String.format("%s[%s]", getClass().getName(), this.f42662d);
    }

    @Override // j$.util.Spliterator
    public Spliterator trySplit() {
        if (!this.f42659a || this.f42666h != null || this.f42667i) {
            return null;
        }
        c();
        Spliterator spliteratorTrySplit = this.f42662d.trySplit();
        if (spliteratorTrySplit == null) {
            return null;
        }
        return e(spliteratorTrySplit);
    }
}
