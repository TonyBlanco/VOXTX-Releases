package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class H2 extends D2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private X2 f42443c;

    @Override // j$.util.stream.InterfaceC2013p2, java.util.function.LongConsumer
    public final void accept(long j9) {
        this.f42443c.accept(j9);
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        long[] jArr = (long[]) this.f42443c.e();
        Arrays.sort(jArr);
        long length = jArr.length;
        InterfaceC2018q2 interfaceC2018q2 = this.f42697a;
        interfaceC2018q2.m(length);
        int i9 = 0;
        if (this.f42411b) {
            int length2 = jArr.length;
            while (i9 < length2) {
                long j9 = jArr[i9];
                if (interfaceC2018q2.o()) {
                    break;
                }
                interfaceC2018q2.accept(j9);
                i9++;
            }
        } else {
            int length3 = jArr.length;
            while (i9 < length3) {
                interfaceC2018q2.accept(jArr[i9]);
                i9++;
            }
        }
        interfaceC2018q2.l();
    }

    @Override // j$.util.stream.AbstractC1993l2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42443c = j9 > 0 ? new X2((int) j9) : new X2();
    }
}
