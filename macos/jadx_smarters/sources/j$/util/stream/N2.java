package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class N2 extends B2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double[] f42488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f42489d;

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        double[] dArr = this.f42488c;
        int i9 = this.f42489d;
        this.f42489d = i9 + 1;
        dArr[i9] = d9;
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        int i9 = 0;
        Arrays.sort(this.f42488c, 0, this.f42489d);
        long j9 = this.f42489d;
        InterfaceC2018q2 interfaceC2018q2 = this.f42686a;
        interfaceC2018q2.m(j9);
        if (this.f42400b) {
            while (i9 < this.f42489d && !interfaceC2018q2.o()) {
                interfaceC2018q2.accept(this.f42488c[i9]);
                i9++;
            }
        } else {
            while (i9 < this.f42489d) {
                interfaceC2018q2.accept(this.f42488c[i9]);
                i9++;
            }
        }
        interfaceC2018q2.l();
        this.f42488c = null;
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42488c = new double[(int) j9];
    }
}
