package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class G2 extends C2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private V2 f42431c;

    @Override // j$.util.stream.InterfaceC2008o2, j$.util.stream.InterfaceC2018q2
    public final void accept(int i9) {
        this.f42431c.accept(i9);
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        int[] iArr = (int[]) this.f42431c.e();
        Arrays.sort(iArr);
        long length = iArr.length;
        InterfaceC2018q2 interfaceC2018q2 = this.f42690a;
        interfaceC2018q2.m(length);
        int i9 = 0;
        if (this.f42404b) {
            int length2 = iArr.length;
            while (i9 < length2) {
                int i10 = iArr[i9];
                if (interfaceC2018q2.o()) {
                    break;
                }
                interfaceC2018q2.accept(i10);
                i9++;
            }
        } else {
            int length3 = iArr.length;
            while (i9 < length3) {
                interfaceC2018q2.accept(iArr[i9]);
                i9++;
            }
        }
        interfaceC2018q2.l();
    }

    @Override // j$.util.stream.AbstractC1988k2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42431c = j9 > 0 ? new V2((int) j9) : new V2();
    }
}
