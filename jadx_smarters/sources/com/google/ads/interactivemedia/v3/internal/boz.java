package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes3.dex */
class boz extends boy {
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final byte[] f21868a;

    public boz(byte[] bArr) {
        bArr.getClass();
        this.f21868a = bArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public byte a(int i9) {
        return this.f21868a[i9];
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public byte b(int i9) {
        return this.f21868a[i9];
    }

    public int c() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public int d() {
        return this.f21868a.length;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public void e(byte[] bArr, int i9, int i10, int i11) {
        System.arraycopy(this.f21868a, i9, bArr, i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpb) || d() != ((bpb) obj).d()) {
            return false;
        }
        if (d() == 0) {
            return true;
        }
        if (!(obj instanceof boz)) {
            return obj.equals(this);
        }
        boz bozVar = (boz) obj;
        int iR = r();
        int iR2 = bozVar.r();
        if (iR == 0 || iR2 == 0 || iR == iR2) {
            return g(bozVar, 0, d());
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.boy
    public final boolean g(bpb bpbVar, int i9, int i10) {
        if (i10 > bpbVar.d()) {
            throw new IllegalArgumentException("Length too large: " + i10 + d());
        }
        int i11 = i9 + i10;
        if (i11 > bpbVar.d()) {
            throw new IllegalArgumentException("Ran off end of other: " + i9 + ", " + i10 + ", " + bpbVar.d());
        }
        if (!(bpbVar instanceof boz)) {
            return bpbVar.k(i9, i11).equals(k(0, i10));
        }
        boz bozVar = (boz) bpbVar;
        byte[] bArr = this.f21868a;
        byte[] bArr2 = bozVar.f21868a;
        int iC = c() + i10;
        int iC2 = c();
        int iC3 = bozVar.c() + i9;
        while (iC2 < iC) {
            if (bArr[iC2] != bArr2[iC3]) {
                return false;
            }
            iC2++;
            iC3++;
        }
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final int i(int i9, int i10, int i11) {
        return bqu.d(i9, this.f21868a, c() + i10, i11);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final int j(int i9, int i10, int i11) {
        int iC = c() + i10;
        return btj.f(i9, this.f21868a, iC, i11 + iC);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final bpb k(int i9, int i10) {
        int iQ = bpb.q(i9, i10, d());
        return iQ == 0 ? bpb.f21870b : new bov(this.f21868a, c() + i9, iQ);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final bpg l() {
        return bpg.H(this.f21868a, c(), d(), true);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final String m(Charset charset) {
        return new String(this.f21868a, c(), d(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final ByteBuffer n() {
        return ByteBuffer.wrap(this.f21868a, c(), d()).asReadOnlyBuffer();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final boolean o() {
        int iC = c();
        return btj.j(this.f21868a, iC, d() + iC);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final void p(bpd bpdVar) throws IOException {
        ((bpk) bpdVar).ai(this.f21868a, c(), d());
    }
}
