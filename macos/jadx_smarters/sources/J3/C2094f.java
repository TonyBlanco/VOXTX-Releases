package j3;

import d3.InterfaceC1673j;
import d4.M;

/* JADX INFO: renamed from: j3.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2094f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final M f43033a = new M(8);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43034b;

    public final long a(InterfaceC1673j interfaceC1673j) {
        int i9 = 0;
        interfaceC1673j.s(this.f43033a.e(), 0, 1);
        int i10 = this.f43033a.e()[0] & 255;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int i11 = 128;
        int i12 = 0;
        while ((i10 & i11) == 0) {
            i11 >>= 1;
            i12++;
        }
        int i13 = i10 & (~i11);
        interfaceC1673j.s(this.f43033a.e(), 1, i12);
        while (i9 < i12) {
            i9++;
            i13 = (this.f43033a.e()[i9] & 255) + (i13 << 8);
        }
        this.f43034b += i12 + 1;
        return i13;
    }

    public boolean b(InterfaceC1673j interfaceC1673j) {
        long length = interfaceC1673j.getLength();
        long j9 = 1024;
        if (length != -1 && length <= 1024) {
            j9 = length;
        }
        int i9 = (int) j9;
        interfaceC1673j.s(this.f43033a.e(), 0, 4);
        long J9 = this.f43033a.J();
        this.f43034b = 4;
        while (J9 != 440786851) {
            int i10 = this.f43034b + 1;
            this.f43034b = i10;
            if (i10 == i9) {
                return false;
            }
            interfaceC1673j.s(this.f43033a.e(), 0, 1);
            J9 = ((J9 << 8) & (-256)) | ((long) (this.f43033a.e()[0] & 255));
        }
        long jA = a(interfaceC1673j);
        long j10 = this.f43034b;
        if (jA == Long.MIN_VALUE) {
            return false;
        }
        if (length != -1 && j10 + jA >= length) {
            return false;
        }
        while (true) {
            int i11 = this.f43034b;
            long j11 = j10 + jA;
            if (i11 >= j11) {
                return ((long) i11) == j11;
            }
            if (a(interfaceC1673j) == Long.MIN_VALUE) {
                return false;
            }
            long jA2 = a(interfaceC1673j);
            if (jA2 < 0 || jA2 > 2147483647L) {
                break;
            }
            if (jA2 != 0) {
                int i12 = (int) jA2;
                interfaceC1673j.n(i12);
                this.f43034b += i12;
            }
        }
        return false;
    }
}
