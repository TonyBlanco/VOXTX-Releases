package j$.util.stream;

import java.util.function.DoubleConsumer;

/* JADX INFO: renamed from: j$.util.stream.h3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1974h3 extends AbstractC1989k3 implements DoubleConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final double[] f42677c;

    C1974h3(int i9) {
        this.f42677c = new double[i9];
    }

    @Override // java.util.function.DoubleConsumer
    public final void accept(double d9) {
        int i9 = this.f42691b;
        this.f42691b = i9 + 1;
        this.f42677c[i9] = d9;
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return j$.com.android.tools.r8.a.e(this, doubleConsumer);
    }

    @Override // j$.util.stream.AbstractC1989k3
    final void b(Object obj, long j9) {
        DoubleConsumer doubleConsumer = (DoubleConsumer) obj;
        for (int i9 = 0; i9 < j9; i9++) {
            doubleConsumer.accept(this.f42677c[i9]);
        }
    }
}
