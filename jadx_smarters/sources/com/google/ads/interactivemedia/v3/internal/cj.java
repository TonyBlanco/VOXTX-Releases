package com.google.ads.interactivemedia.v3.internal;

import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class cj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte[] f22625a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f22626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f22627c;

    public cj() {
        this.f22625a = cq.f22645f;
    }

    public cj(int i9) {
        this.f22625a = new byte[i9];
        this.f22627c = i9;
    }

    public cj(byte[] bArr) {
        this.f22625a = bArr;
        this.f22627c = bArr.length;
    }

    public cj(byte[] bArr, int i9) {
        this.f22625a = bArr;
        this.f22627c = i9;
    }

    public final void A(byte[] bArr, int i9, int i10) {
        System.arraycopy(this.f22625a, this.f22626b, bArr, i9, i10);
        this.f22626b += i10;
    }

    public final void B(int i9) {
        D(b() < i9 ? new byte[i9] : this.f22625a, i9);
    }

    public final void C(byte[] bArr) {
        D(bArr, bArr.length);
    }

    public final void D(byte[] bArr, int i9) {
        this.f22625a = bArr;
        this.f22627c = i9;
        this.f22626b = 0;
    }

    public final void E(int i9) {
        boolean z9 = false;
        if (i9 >= 0 && i9 <= this.f22625a.length) {
            z9 = true;
        }
        af.u(z9);
        this.f22627c = i9;
    }

    public final void F(int i9) {
        boolean z9 = false;
        if (i9 >= 0 && i9 <= this.f22627c) {
            z9 = true;
        }
        af.u(z9);
        this.f22626b = i9;
    }

    public final void G(int i9) {
        F(this.f22626b + i9);
    }

    public final byte[] H() {
        return this.f22625a;
    }

    public final int a() {
        return this.f22627c - this.f22626b;
    }

    public final int b() {
        return this.f22625a.length;
    }

    public final int c() {
        return this.f22626b;
    }

    public final int d() {
        return this.f22627c;
    }

    public final int e() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        byte b10 = bArr[i9 + 1];
        byte b11 = bArr[i9 + 2];
        this.f22626b = i9 + 4;
        return (bArr[i9 + 3] & 255) | ((b9 & 255) << 24) | ((b10 & 255) << 16) | ((b11 & 255) << 8);
    }

    public final int f() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        byte b10 = bArr[i9 + 1];
        byte b11 = bArr[i9 + 2];
        this.f22626b = i9 + 4;
        return ((bArr[i9 + 3] & 255) << 24) | (b9 & 255) | ((b10 & 255) << 8) | ((b11 & 255) << 16);
    }

    public final int g() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        this.f22626b = i9 + 2;
        return ((bArr[i9 + 1] & 255) << 8) | (b9 & 255);
    }

    public final int h() {
        return (i() << 21) | (i() << 14) | (i() << 7) | i();
    }

    public final int i() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        this.f22626b = i9 + 1;
        return bArr[i9] & 255;
    }

    public final int j() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        byte b10 = bArr[i9 + 1];
        this.f22626b = i9 + 4;
        return (b10 & 255) | ((b9 & 255) << 8);
    }

    public final int k() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        byte b10 = bArr[i9 + 1];
        this.f22626b = i9 + 3;
        return (bArr[i9 + 2] & 255) | ((b9 & 255) << 16) | ((b10 & 255) << 8);
    }

    public final int l() {
        int iE = e();
        if (iE >= 0) {
            return iE;
        }
        throw new IllegalStateException("Top bit not zero: " + iE);
    }

    public final int m() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        this.f22626b = i9 + 2;
        return (bArr[i9 + 1] & 255) | ((b9 & 255) << 8);
    }

    public final long n() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        byte b10 = bArr[i9 + 1];
        int i10 = i9 + 3;
        byte b11 = bArr[i9 + 2];
        this.f22626b = i9 + 4;
        return ((((long) b10) & 255) << 8) | (((long) b9) & 255) | ((((long) b11) & 255) << 16) | ((((long) bArr[i10]) & 255) << 24);
    }

    public final long o() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        byte b10 = bArr[i9 + 1];
        byte b11 = bArr[i9 + 2];
        byte b12 = bArr[i9 + 3];
        byte b13 = bArr[i9 + 4];
        byte b14 = bArr[i9 + 5];
        int i10 = i9 + 7;
        byte b15 = bArr[i9 + 6];
        this.f22626b = i9 + 8;
        return ((((long) b10) & 255) << 48) | ((((long) b9) & 255) << 56) | ((((long) b11) & 255) << 40) | ((((long) b12) & 255) << 32) | ((((long) b13) & 255) << 24) | ((((long) b14) & 255) << 16) | ((((long) b15) & 255) << 8) | (((long) bArr[i10]) & 255);
    }

    public final long p() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        byte b10 = bArr[i9 + 1];
        int i10 = i9 + 3;
        byte b11 = bArr[i9 + 2];
        this.f22626b = i9 + 4;
        return ((((long) b10) & 255) << 16) | ((((long) b9) & 255) << 24) | ((((long) b11) & 255) << 8) | (((long) bArr[i10]) & 255);
    }

    public final long q() {
        long jO = o();
        if (jO >= 0) {
            return jO;
        }
        throw new IllegalStateException("Top bit not zero: " + jO);
    }

    public final String r() {
        if (a() == 0) {
            return null;
        }
        int i9 = this.f22626b;
        while (i9 < this.f22627c && !cq.Z(this.f22625a[i9])) {
            i9++;
        }
        int i10 = this.f22626b;
        if (i9 - i10 >= 3) {
            byte[] bArr = this.f22625a;
            if (bArr[i10] == -17 && bArr[i10 + 1] == -69 && bArr[i10 + 2] == -65) {
                i10 += 3;
                this.f22626b = i10;
            }
        }
        String strJ = cq.J(this.f22625a, i10, i9 - i10);
        this.f22626b = i9;
        int i11 = this.f22627c;
        if (i9 == i11) {
            return strJ;
        }
        byte[] bArr2 = this.f22625a;
        if (bArr2[i9] == 13) {
            i9++;
            this.f22626b = i9;
            if (i9 == i11) {
                return strJ;
            }
        }
        if (bArr2[i9] == 10) {
            this.f22626b = i9 + 1;
        }
        return strJ;
    }

    public final String s() {
        if (a() == 0) {
            return null;
        }
        int i9 = this.f22626b;
        while (i9 < this.f22627c && this.f22625a[i9] != 0) {
            i9++;
        }
        byte[] bArr = this.f22625a;
        int i10 = this.f22626b;
        String strJ = cq.J(bArr, i10, i9 - i10);
        this.f22626b = i9;
        if (i9 >= this.f22627c) {
            return strJ;
        }
        this.f22626b = i9 + 1;
        return strJ;
    }

    public final String t(int i9) {
        if (i9 == 0) {
            return "";
        }
        int i10 = this.f22626b;
        int i11 = (i10 + i9) - 1;
        String strJ = cq.J(this.f22625a, i10, (i11 >= this.f22627c || this.f22625a[i11] != 0) ? i9 : i9 - 1);
        this.f22626b += i9;
        return strJ;
    }

    public final String u(int i9) {
        return v(i9, ath.f20681b);
    }

    public final String v(int i9, Charset charset) {
        byte[] bArr = this.f22625a;
        int i10 = this.f22626b;
        String str = new String(bArr, i10, i9, charset);
        this.f22626b = i10 + i9;
        return str;
    }

    public final short w() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        this.f22626b = i9 + 2;
        return (short) (((bArr[i9 + 1] & 255) << 8) | (b9 & 255));
    }

    public final short x() {
        byte[] bArr = this.f22625a;
        int i9 = this.f22626b;
        byte b9 = bArr[i9];
        this.f22626b = i9 + 2;
        return (short) ((bArr[i9 + 1] & 255) | ((b9 & 255) << 8));
    }

    public final void y(int i9) {
        if (i9 > b()) {
            this.f22625a = Arrays.copyOf(this.f22625a, i9);
        }
    }

    public final void z(ci ciVar, int i9) {
        A(ciVar.f22621a, 0, i9);
        ciVar.g(0);
    }
}
