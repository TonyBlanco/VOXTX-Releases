package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class O2 extends C2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f42496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42497d;

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        int[] iArr = this.f42496c;
        int i10 = this.f42497d;
        this.f42497d = i10 + 1;
        iArr[i10] = i9;
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        int i9 = 0;
        Arrays.sort(this.f42496c, 0, this.f42497d);
        long j9 = this.f42497d;
        InterfaceC2018q2 interfaceC2018q2 = this.f42690a;
        interfaceC2018q2.m(j9);
        if (this.f42404b) {
            while (i9 < this.f42497d && !interfaceC2018q2.o()) {
                interfaceC2018q2.accept(this.f42496c[i9]);
                i9++;
            }
        } else {
            while (i9 < this.f42497d) {
                interfaceC2018q2.accept(this.f42496c[i9]);
                i9++;
            }
        }
        interfaceC2018q2.l();
        this.f42496c = null;
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42496c = new int[(int) j9];
    }
}
