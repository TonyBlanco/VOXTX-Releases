package j$.util.stream;

import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
final class Q2 extends E2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object[] f42514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42515e;

    @Override // java.util.function.Consumer
    public final void accept(Object obj) {
        Object[] objArr = this.f42514d;
        int i9 = this.f42515e;
        this.f42515e = i9 + 1;
        objArr[i9] = obj;
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final void l() {
        int i9 = 0;
        Arrays.sort(this.f42514d, 0, this.f42515e, this.f42417b);
        long j9 = this.f42515e;
        InterfaceC2018q2 interfaceC2018q2 = this.f42708a;
        interfaceC2018q2.m(j9);
        if (this.f42418c) {
            while (i9 < this.f42515e && !interfaceC2018q2.o()) {
                interfaceC2018q2.accept(this.f42514d[i9]);
                i9++;
            }
        } else {
            while (i9 < this.f42515e) {
                interfaceC2018q2.accept(this.f42514d[i9]);
                i9++;
            }
        }
        interfaceC2018q2.l();
        this.f42514d = null;
    }

    @Override // j$.util.stream.AbstractC1998m2, j$.util.stream.InterfaceC2018q2
    public final void m(long j9) {
        if (j9 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        this.f42514d = new Object[(int) j9];
    }
}
