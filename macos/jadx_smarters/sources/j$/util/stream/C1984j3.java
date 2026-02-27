package j$.util.stream;

import java.util.function.LongConsumer;

/* JADX INFO: renamed from: j$.util.stream.j3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1984j3 extends AbstractC1989k3 implements LongConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long[] f42687c;

    C1984j3(int i9) {
        this.f42687c = new long[i9];
    }

    @Override // java.util.function.LongConsumer
    public final void accept(long j9) {
        int i9 = this.f42691b;
        this.f42691b = i9 + 1;
        this.f42687c[i9] = j9;
    }

    public final /* synthetic */ LongConsumer andThen(LongConsumer longConsumer) {
        return j$.com.android.tools.r8.a.g(this, longConsumer);
    }

    @Override // j$.util.stream.AbstractC1989k3
    public final void b(Object obj, long j9) {
        LongConsumer longConsumer = (LongConsumer) obj;
        for (int i9 = 0; i9 < j9; i9++) {
            longConsumer.accept(this.f42687c[i9]);
        }
    }
}
