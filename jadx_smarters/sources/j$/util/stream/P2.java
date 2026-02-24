package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class P2 extends D2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f42503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42504d;

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        long[] jArr = this.f42503c;
        int i9 = this.f42504d;
        this.f42504d = i9 + 1;
        jArr[i9] = j9;
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        int i9 = 0;
        Arrays.sort(this.f42503c, 0, this.f42504d);
        long j9 = this.f42504d;
        InterfaceC2018q2 interfaceC2018q2 = this.f42697a;
        interfaceC2018q2.m(j9);
        if (this.f42411b) {
            while (i9 < this.f42504d && !interfaceC2018q2.o()) {
                interfaceC2018q2.accept(this.f42503c[i9]);
                i9++;
            }
        } else {
            while (i9 < this.f42504d) {
                interfaceC2018q2.accept(this.f42503c[i9]);
                i9++;
            }
        }
        interfaceC2018q2.l();
        this.f42503c = null;
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42503c = new long[(int) j9];
    }
}
