package com.google.ads.interactivemedia.v3.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class zb implements zi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC1310k f25239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f25240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f25241d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f25243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f25244g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private byte[] f25242e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[] f25238a = new byte[4096];

    static {
        aj.b("media3.extractor");
    }

    public zb(InterfaceC1310k interfaceC1310k, long j9, long j10) {
        this.f25239b = interfaceC1310k;
        this.f25241d = j9;
        this.f25240c = j10;
    }

    private final int m(byte[] bArr, int i9, int i10) {
        int i11 = this.f25244g;
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.f25242e, 0, bArr, i9, iMin);
        r(iMin);
        return iMin;
    }

    private final int n(byte[] bArr, int i9, int i10, int i11, boolean z9) throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int iA = this.f25239b.a(bArr, i9 + i11, i10 - i11);
        if (iA != -1) {
            return i11 + iA;
        }
        if (i11 == 0 && z9) {
            return -1;
        }
        throw new EOFException();
    }

    private final int o(int i9) {
        int iMin = Math.min(this.f25244g, i9);
        r(iMin);
        return iMin;
    }

    private final void p(int i9) {
        if (i9 != -1) {
            this.f25241d += (long) i9;
        }
    }

    private final void q(int i9) {
        int i10 = this.f25243f + i9;
        int length = this.f25242e.length;
        if (i10 > length) {
            this.f25242e = Arrays.copyOf(this.f25242e, cq.d(length + length, 65536 + i10, i10 + 524288));
        }
    }

    private final void r(int i9) {
        int i10 = this.f25244g - i9;
        this.f25244g = i10;
        this.f25243f = 0;
        byte[] bArr = this.f25242e;
        byte[] bArr2 = i10 < bArr.length + (-524288) ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        this.f25242e = bArr2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi, com.google.ads.interactivemedia.v3.internal.InterfaceC1310k
    public final int a(byte[] bArr, int i9, int i10) throws IOException {
        int iM = m(bArr, i9, i10);
        if (iM == 0) {
            iM = n(bArr, i9, i10, 0, true);
        }
        p(iM);
        return iM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final long b() {
        return this.f25240c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final long c() {
        return this.f25241d + ((long) this.f25243f);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final long d() {
        return this.f25241d;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final void e(int i9) throws IOException {
        j(i9, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final void f(byte[] bArr, int i9, int i10) throws IOException {
        k(bArr, i9, i10, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final void g(byte[] bArr, int i9, int i10) throws IOException {
        l(bArr, i9, i10, false);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final void h() {
        this.f25243f = 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final void i(int i9) throws IOException {
        int iO = o(i9);
        while (iO < i9 && iO != -1) {
            iO = n(this.f25238a, -iO, Math.min(i9, iO + 4096), iO, false);
        }
        p(iO);
    }

    public final boolean j(int i9, boolean z9) throws IOException {
        q(i9);
        int iN = this.f25244g - this.f25243f;
        while (iN < i9) {
            iN = n(this.f25242e, this.f25243f, i9, iN, z9);
            if (iN == -1) {
                return false;
            }
            this.f25244g = this.f25243f + iN;
        }
        this.f25243f += i9;
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final boolean k(byte[] bArr, int i9, int i10, boolean z9) throws IOException {
        if (!j(i10, z9)) {
            return false;
        }
        System.arraycopy(this.f25242e, this.f25243f - i10, bArr, i9, i10);
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zi
    public final boolean l(byte[] bArr, int i9, int i10, boolean z9) throws IOException {
        int iM = m(bArr, i9, i10);
        while (iM < i10 && iM != -1) {
            iM = n(bArr, i9, i10, iM, z9);
        }
        p(iM);
        return iM != -1;
    }
}
