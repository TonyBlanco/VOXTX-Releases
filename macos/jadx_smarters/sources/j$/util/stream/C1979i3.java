package j$.util.stream;

import java.util.function.IntConsumer;

/* JADX INFO: renamed from: j$.util.stream.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
final class C1979i3 extends AbstractC1989k3 implements IntConsumer {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int[] f42681c;

    C1979i3(int i9) {
        this.f42681c = new int[i9];
    }

    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        int i10 = this.f42691b;
        this.f42691b = i10 + 1;
        this.f42681c[i10] = i9;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return j$.com.android.tools.r8.a.f(this, intConsumer);
    }

    @Override // j$.util.stream.AbstractC1989k3
    public final void b(Object obj, long j9) {
        IntConsumer intConsumer = (IntConsumer) obj;
        for (int i9 = 0; i9 < j9; i9++) {
            intConsumer.accept(this.f42681c[i9]);
        }
    }
}
