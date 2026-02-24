package j$.util;

import com.google.android.gms.common.api.a;
import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1924h implements IntConsumer {
    private long count;
    private long sum;
    private int min = a.e.API_PRIORITY_OTHER;
    private int max = Integer.MIN_VALUE;

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        this.count++;
        this.sum += (long) i9;
        this.min = Math.min(this.min, i9);
        this.max = Math.max(this.max, i9);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    public final void b(C1924h c1924h) {
        this.count += c1924h.count;
        this.sum += c1924h.sum;
        this.min = Math.min(this.min, c1924h.min);
        this.max = Math.max(this.max, c1924h.max);
    }

    public final String toString() {
        String simpleName = C1924h.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        Long lValueOf2 = Long.valueOf(this.sum);
        Integer numValueOf = Integer.valueOf(this.min);
        long j9 = this.count;
        return String.format("%s{count=%d, sum=%d, min=%d, average=%f, max=%d}", simpleName, lValueOf, lValueOf2, numValueOf, Double.valueOf(j9 > 0 ? this.sum / j9 : 0.0d), Integer.valueOf(this.max));
    }
}
