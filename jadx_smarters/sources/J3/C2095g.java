package j3;

import d3.InterfaceC1673j;

/* JADX INFO: renamed from: j3.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2095g {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long[] f43035d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f43036a = new byte[8];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f43037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f43038c;

    public static long a(byte[] bArr, int i9, boolean z9) {
        long j9 = ((long) bArr[0]) & 255;
        if (z9) {
            j9 &= ~f43035d[i9 - 1];
        }
        for (int i10 = 1; i10 < i9; i10++) {
            j9 = (j9 << 8) | (((long) bArr[i10]) & 255);
        }
        return j9;
    }

    public static int c(int i9) {
        long j9;
        int i10 = 0;
        do {
            long[] jArr = f43035d;
            if (i10 >= jArr.length) {
                return -1;
            }
            j9 = jArr[i10] & ((long) i9);
            i10++;
        } while (j9 == 0);
        return i10;
    }

    public int b() {
        return this.f43038c;
    }

    public long d(InterfaceC1673j interfaceC1673j, boolean z9, boolean z10, int i9) {
        if (this.f43037b == 0) {
            if (!interfaceC1673j.h(this.f43036a, 0, 1, z9)) {
                return -1L;
            }
            int iC = c(this.f43036a[0] & 255);
            this.f43038c = iC;
            if (iC == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f43037b = 1;
        }
        int i10 = this.f43038c;
        if (i10 > i9) {
            this.f43037b = 0;
            return -2L;
        }
        if (i10 != 1) {
            interfaceC1673j.m(this.f43036a, 1, i10 - 1);
        }
        this.f43037b = 0;
        return a(this.f43036a, this.f43038c, z10);
    }

    public void e() {
        this.f43037b = 0;
        this.f43038c = 0;
    }
}
