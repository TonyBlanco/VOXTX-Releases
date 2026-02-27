package j$.util;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1923g implements DoubleConsumer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f42371a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f42372b;
    private long count;
    private double sum;
    private double min = Double.POSITIVE_INFINITY;
    private double max = Double.NEGATIVE_INFINITY;

    private void c(double d9) {
        double d10 = d9 - this.f42371a;
        double d11 = this.sum;
        double d12 = d11 + d10;
        this.f42371a = (d12 - d11) - d10;
        this.sum = d12;
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d9) {
        this.count++;
        this.f42372b += d9;
        c(d9);
        this.min = Math.min(this.min, d9);
        this.max = Math.max(this.max, d9);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    public final void b(C1923g c1923g) {
        this.count += c1923g.count;
        this.f42372b += c1923g.f42372b;
        c(c1923g.sum);
        c(c1923g.f42371a);
        this.min = Math.min(this.min, c1923g.min);
        this.max = Math.max(this.max, c1923g.max);
    }

    public final String toString() {
        double d9;
        String simpleName = C1923g.class.getSimpleName();
        Long lValueOf = Long.valueOf(this.count);
        double d10 = this.sum + this.f42371a;
        if (Double.isNaN(d10) && Double.isInfinite(this.f42372b)) {
            d10 = this.f42372b;
        }
        Double dValueOf = Double.valueOf(d10);
        Double dValueOf2 = Double.valueOf(this.min);
        if (this.count > 0) {
            double d11 = this.sum + this.f42371a;
            if (Double.isNaN(d11) && Double.isInfinite(this.f42372b)) {
                d11 = this.f42372b;
            }
            d9 = d11 / this.count;
        } else {
            d9 = 0.0d;
        }
        return String.format("%s{count=%d, sum=%f, min=%f, average=%f, max=%f}", simpleName, lValueOf, dValueOf, dValueOf2, Double.valueOf(d9), Double.valueOf(this.max));
    }
}
