package j$.util.concurrent;

import j$.util.A;
import j$.util.Spliterator;
import java.util.Comparator;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
final class j extends p implements Spliterator {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f42304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    long f42305j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l[] lVarArr, int i9, int i10, int i11, long j9, int i12) {
        super(lVarArr, i9, i10, i11);
        this.f42304i = i12;
        this.f42305j = j9;
    }

    @Override // j$.util.Spliterator
    public final int characteristics() {
        switch (this.f42304i) {
            case 0:
                return 4353;
            default:
                return 4352;
        }
    }

    @Override // j$.util.Spliterator
    public final long estimateSize() {
        switch (this.f42304i) {
        }
        return this.f42305j;
    }

    @Override // j$.util.Spliterator
    public final void forEachRemaining(Consumer consumer) {
        switch (this.f42304i) {
            case 0:
                consumer.getClass();
                while (true) {
                    l lVarA = a();
                    if (lVarA != null) {
                        consumer.accept(lVarA.f42310b);
                    }
                    break;
                }
                break;
            default:
                consumer.getClass();
                while (true) {
                    l lVarA2 = a();
                    if (lVarA2 != null) {
                        consumer.accept(lVarA2.f42311c);
                    }
                    break;
                }
                break;
        }
    }

    @Override // j$.util.Spliterator
    public final Comparator getComparator() {
        switch (this.f42304i) {
            case 0:
                throw new IllegalStateException();
            default:
                throw new IllegalStateException();
        }
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ long getExactSizeIfKnown() {
        switch (this.f42304i) {
        }
        return A.d(this);
    }

    @Override // j$.util.Spliterator
    public final /* synthetic */ boolean hasCharacteristics(int i9) {
        switch (this.f42304i) {
        }
        return A.e(this, i9);
    }

    @Override // j$.util.Spliterator
    public final boolean tryAdvance(Consumer consumer) {
        switch (this.f42304i) {
            case 0:
                consumer.getClass();
                l lVarA = a();
                if (lVarA != null) {
                    consumer.accept(lVarA.f42310b);
                    break;
                }
                break;
            default:
                consumer.getClass();
                l lVarA2 = a();
                if (lVarA2 != null) {
                    consumer.accept(lVarA2.f42311c);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // j$.util.Spliterator
    public final Spliterator trySplit() {
        switch (this.f42304i) {
            case 0:
                int i9 = this.f42322f;
                int i10 = this.f42323g;
                int i11 = (i9 + i10) >>> 1;
                if (i11 <= i9) {
                    return null;
                }
                l[] lVarArr = this.f42317a;
                this.f42323g = i11;
                long j9 = this.f42305j >>> 1;
                this.f42305j = j9;
                return new j(lVarArr, this.f42324h, i11, i10, j9, 0);
            default:
                int i12 = this.f42322f;
                int i13 = this.f42323g;
                int i14 = (i12 + i13) >>> 1;
                if (i14 <= i12) {
                    return null;
                }
                l[] lVarArr2 = this.f42317a;
                this.f42323g = i14;
                long j10 = this.f42305j >>> 1;
                this.f42305j = j10;
                return new j(lVarArr2, this.f42324h, i14, i13, j10, 1);
        }
    }
}
