package j$.util;

import java.util.function.IntConsumer;
import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1926j implements LongConsumer, IntConsumer {
    private long count;
    private long sum;
    private long min = Long.MAX_VALUE;
    private long max = Long.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        accept(i9);
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j9) {
        this.count++;
        this.sum += j9;
        this.min = Math.min(this.min, j9);
        this.max = Math.max(this.max, j9);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    public final void b(C1926j c1926j) {
        this.count += c1926j.count;
        this.sum += c1926j.sum;
        this.min = Math.min(this.min, c1926j.min);
        this.max = Math.max(this.max, c1926j.max);
    }

    public final String toString() {
        String simpleName = C1926j.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Long lValueOf3 = Long.valueOf(this.min);
        long j9 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, lValueOf3, Double.valueOf(j9 > 0 ? this.sum / j9 : 0.0d), Long.valueOf(this.max));
    }
}
