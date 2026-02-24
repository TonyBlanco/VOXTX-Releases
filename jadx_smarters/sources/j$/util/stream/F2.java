package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class F2 extends B2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private T2 f42424c;

    @Override // j$.util.stream.InterfaceC2003n2, j$.util.stream.InterfaceC2018q2
    public final void accept(double d9) {
        this.f42424c.accept(d9);
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        double[] dArr = (double[]) this.f42424c.e();
        Arrays.sort(dArr);
        long length = dArr.length;
        InterfaceC2018q2 interfaceC2018q2 = this.f42686a;
        interfaceC2018q2.m(length);
        int i9 = 0;
        if (this.f42400b) {
            int length2 = dArr.length;
            while (i9 < length2) {
                double d9 = dArr[i9];
                if (interfaceC2018q2.o()) {
                    break;
                }
                interfaceC2018q2.accept(d9);
                i9++;
            }
        } else {
            int length3 = dArr.length;
            while (i9 < length3) {
                interfaceC2018q2.accept(dArr[i9]);
                i9++;
            }
        }
        interfaceC2018q2.l();
    }

    @Override // j$.util.stream.AbstractC1983j2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42424c = j9 > 0 ? new T2((int) j9) : new T2();
    }
}
