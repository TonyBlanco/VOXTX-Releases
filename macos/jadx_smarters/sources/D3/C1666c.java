package d3;

import O2.AbstractC0928w0;
import b4.InterfaceC1220k;
import d4.AbstractC1684a;
import d4.k0;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* JADX INFO: renamed from: d3.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1666c implements InterfaceC1673j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1220k f39574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f39575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f39576d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f39578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39579g;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public byte[] f39577e = new byte[65536];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f39573a = new byte[4096];

    static {
        AbstractC0928w0.a("goog.exo.extractor");
    }

    public C1666c(InterfaceC1220k interfaceC1220k, long j9, long j10) {
        this.f39574b = interfaceC1220k;
        this.f39576d = j9;
        this.f39575c = j10;
    }

    @Override // d3.InterfaceC1673j
    public int b(int i9) throws EOFException, InterruptedIOException {
        int iW = w(i9);
        if (iW == 0) {
            byte[] bArr = this.f39573a;
            iW = v(bArr, 0, Math.min(i9, bArr.length), 0, true);
        }
        j(iW);
        return iW;
    }

    @Override // d3.InterfaceC1673j
    public boolean d(byte[] bArr, int i9, int i10, boolean z9) {
        if (!r(i10, z9)) {
            return false;
        }
        System.arraycopy(this.f39577e, this.f39578f - i10, bArr, i9, i10);
        return true;
    }

    @Override // d3.InterfaceC1673j
    public void f() {
        this.f39578f = 0;
    }

    @Override // d3.InterfaceC1673j
    public long getLength() {
        return this.f39575c;
    }

    @Override // d3.InterfaceC1673j
    public long getPosition() {
        return this.f39576d;
    }

    @Override // d3.InterfaceC1673j
    public boolean h(byte[] bArr, int i9, int i10, boolean z9) throws EOFException, InterruptedIOException {
        int iU = u(bArr, i9, i10);
        while (iU < i10 && iU != -1) {
            iU = v(bArr, i9, i10, iU, z9);
        }
        j(iU);
        return iU != -1;
    }

    public final void j(int i9) {
        if (i9 != -1) {
            this.f39576d += (long) i9;
        }
    }

    @Override // d3.InterfaceC1673j
    public long k() {
        return this.f39576d + ((long) this.f39578f);
    }

    @Override // d3.InterfaceC1673j
    public void m(byte[] bArr, int i9, int i10) throws EOFException, InterruptedIOException {
        h(bArr, i9, i10, false);
    }

    @Override // d3.InterfaceC1673j
    public void n(int i9) throws EOFException, InterruptedIOException {
        r(i9, false);
    }

    @Override // d3.InterfaceC1673j
    public void o(long j9, Throwable th) throws Throwable {
        AbstractC1684a.a(j9 >= 0);
        this.f39576d = j9;
        throw th;
    }

    @Override // d3.InterfaceC1673j
    public int p(byte[] bArr, int i9, int i10) throws EOFException, InterruptedIOException {
        int iMin;
        t(i10);
        int i11 = this.f39579g;
        int i12 = this.f39578f;
        int i13 = i11 - i12;
        if (i13 == 0) {
            iMin = v(this.f39577e, i12, i10, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.f39579g += iMin;
        } else {
            iMin = Math.min(i10, i13);
        }
        System.arraycopy(this.f39577e, this.f39578f, bArr, i9, iMin);
        this.f39578f += iMin;
        return iMin;
    }

    @Override // d3.InterfaceC1673j
    public void q(int i9) throws EOFException, InterruptedIOException {
        x(i9, false);
    }

    @Override // d3.InterfaceC1673j
    public boolean r(int i9, boolean z9) throws EOFException, InterruptedIOException {
        t(i9);
        int iV = this.f39579g - this.f39578f;
        while (iV < i9) {
            iV = v(this.f39577e, this.f39578f, i9, iV, z9);
            if (iV == -1) {
                return false;
            }
            this.f39579g = this.f39578f + iV;
        }
        this.f39578f += i9;
        return true;
    }

    @Override // d3.InterfaceC1673j, b4.InterfaceC1220k
    public int read(byte[] bArr, int i9, int i10) throws EOFException, InterruptedIOException {
        int iU = u(bArr, i9, i10);
        if (iU == 0) {
            iU = v(bArr, i9, i10, 0, true);
        }
        j(iU);
        return iU;
    }

    @Override // d3.InterfaceC1673j
    public void s(byte[] bArr, int i9, int i10) {
        d(bArr, i9, i10, false);
    }

    public final void t(int i9) {
        int i10 = this.f39578f + i9;
        byte[] bArr = this.f39577e;
        if (i10 > bArr.length) {
            this.f39577e = Arrays.copyOf(this.f39577e, k0.r(bArr.length * 2, 65536 + i10, i10 + 524288));
        }
    }

    public final int u(byte[] bArr, int i9, int i10) {
        int i11 = this.f39579g;
        if (i11 == 0) {
            return 0;
        }
        int iMin = Math.min(i11, i10);
        System.arraycopy(this.f39577e, 0, bArr, i9, iMin);
        y(iMin);
        return iMin;
    }

    public final int v(byte[] bArr, int i9, int i10, int i11, boolean z9) throws EOFException, InterruptedIOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int i12 = this.f39574b.read(bArr, i9 + i11, i10 - i11);
        if (i12 != -1) {
            return i11 + i12;
        }
        if (i11 == 0 && z9) {
            return -1;
        }
        throw new EOFException();
    }

    public final int w(int i9) {
        int iMin = Math.min(this.f39579g, i9);
        y(iMin);
        return iMin;
    }

    public boolean x(int i9, boolean z9) throws EOFException, InterruptedIOException {
        int iW = w(i9);
        while (iW < i9 && iW != -1) {
            iW = v(this.f39573a, -iW, Math.min(i9, this.f39573a.length + iW), iW, z9);
        }
        j(iW);
        return iW != -1;
    }

    public final void y(int i9) {
        int i10 = this.f39579g - i9;
        this.f39579g = i10;
        this.f39578f = 0;
        byte[] bArr = this.f39577e;
        byte[] bArr2 = i10 < bArr.length - 524288 ? new byte[65536 + i10] : bArr;
        System.arraycopy(bArr, i9, bArr2, 0, i10);
        this.f39577e = bArr2;
    }
}
