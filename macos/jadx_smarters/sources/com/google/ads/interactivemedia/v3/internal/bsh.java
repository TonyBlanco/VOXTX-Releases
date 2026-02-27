package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: classes3.dex */
final class bsh extends bpb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final int[] f22213a = {1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, IjkMediaMeta.FF_PROFILE_H264_HIGH_444, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, 17711, 28657, 46368, 75025, 121393, 196418, 317811, 514229, 832040, 1346269, 2178309, 3524578, 5702887, 9227465, 14930352, 24157817, 39088169, 63245986, 102334155, 165580141, 267914296, 433494437, 701408733, 1134903170, 1836311903, a.e.API_PRIORITY_OTHER};
    private static final long serialVersionUID = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f22214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final bpb f22215d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final bpb f22216e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f22217f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f22218g;

    private bsh(bpb bpbVar, bpb bpbVar2) {
        this.f22215d = bpbVar;
        this.f22216e = bpbVar2;
        int iD = bpbVar.d();
        this.f22217f = iD;
        this.f22214c = iD + bpbVar2.d();
        this.f22218g = Math.max(bpbVar.f(), bpbVar2.f()) + 1;
    }

    public /* synthetic */ bsh(bpb bpbVar, bpb bpbVar2, byte[] bArr) {
        this(bpbVar, bpbVar2);
    }

    public static bpb E(bpb bpbVar, bpb bpbVar2) {
        if (bpbVar2.d() == 0) {
            return bpbVar;
        }
        if (bpbVar.d() == 0) {
            return bpbVar2;
        }
        int iD = bpbVar.d() + bpbVar2.d();
        if (iD < 128) {
            return F(bpbVar, bpbVar2);
        }
        if (bpbVar instanceof bsh) {
            bsh bshVar = (bsh) bpbVar;
            if (bshVar.f22216e.d() + bpbVar2.d() < 128) {
                return new bsh(bshVar.f22215d, F(bshVar.f22216e, bpbVar2));
            }
            if (bshVar.f22215d.f() > bshVar.f22216e.f() && bshVar.f22218g > bpbVar2.f()) {
                return new bsh(bshVar.f22215d, new bsh(bshVar.f22216e, bpbVar2));
            }
        }
        return iD >= c(Math.max(bpbVar.f(), bpbVar2.f()) + 1) ? new bsh(bpbVar, bpbVar2) : bsf.a(new bsf(null), bpbVar, bpbVar2);
    }

    private static bpb F(bpb bpbVar, bpb bpbVar2) {
        int iD = bpbVar.d();
        int iD2 = bpbVar2.d();
        byte[] bArr = new byte[iD + iD2];
        bpbVar.C(bArr, 0, iD);
        bpbVar2.C(bArr, iD, iD2);
        return bpb.x(bArr);
    }

    public static int c(int i9) {
        int[] iArr = f22213a;
        int length = iArr.length;
        return i9 >= 47 ? a.e.API_PRIORITY_OTHER : iArr[i9];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("RopeByteStream instances are not to be serialized directly");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final byte a(int i9) {
        bpb.z(i9, this.f22214c);
        return b(i9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final byte b(int i9) {
        int i10 = this.f22217f;
        return i9 < i10 ? this.f22215d.b(i9) : this.f22216e.b(i9 - i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final int d() {
        return this.f22214c;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final void e(byte[] bArr, int i9, int i10, int i11) {
        int i12 = this.f22217f;
        if (i9 + i11 <= i12) {
            this.f22215d.e(bArr, i9, i10, i11);
        } else {
            if (i9 >= i12) {
                this.f22216e.e(bArr, i9 - i12, i10, i11);
                return;
            }
            int i13 = i12 - i9;
            this.f22215d.e(bArr, i9, i10, i13);
            this.f22216e.e(bArr, 0, i10 + i13, i11 - i13);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof bpb)) {
            return false;
        }
        bpb bpbVar = (bpb) obj;
        if (this.f22214c != bpbVar.d()) {
            return false;
        }
        if (this.f22214c == 0) {
            return true;
        }
        int iR = r();
        int iR2 = bpbVar.r();
        if (iR != 0 && iR2 != 0 && iR != iR2) {
            return false;
        }
        bsg bsgVar = new bsg(this);
        boy boyVarA = bsgVar.next();
        bsg bsgVar2 = new bsg(bpbVar);
        boy boyVarA2 = bsgVar2.next();
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        while (true) {
            int iD = boyVarA.d() - i9;
            int iD2 = boyVarA2.d() - i10;
            int iMin = Math.min(iD, iD2);
            if (!(i9 == 0 ? boyVarA.g(boyVarA2, i10, iMin) : boyVarA2.g(boyVarA, i9, iMin))) {
                return false;
            }
            i11 += iMin;
            int i12 = this.f22214c;
            if (i11 >= i12) {
                if (i11 == i12) {
                    return true;
                }
                throw new IllegalStateException();
            }
            if (iMin == iD) {
                i9 = 0;
                boyVarA = bsgVar.next();
            } else {
                i9 += iMin;
                boyVarA = boyVarA;
            }
            if (iMin == iD2) {
                boyVarA2 = bsgVar2.next();
                i10 = 0;
            } else {
                i10 += iMin;
            }
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final int f() {
        return this.f22218g;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final boolean h() {
        return this.f22214c >= c(this.f22218g);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final int i(int i9, int i10, int i11) {
        int i12 = this.f22217f;
        if (i10 + i11 <= i12) {
            return this.f22215d.i(i9, i10, i11);
        }
        if (i10 >= i12) {
            return this.f22216e.i(i9, i10 - i12, i11);
        }
        int i13 = i12 - i10;
        return this.f22216e.i(this.f22215d.i(i9, i10, i13), 0, i11 - i13);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb, java.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final int j(int i9, int i10, int i11) {
        int i12 = this.f22217f;
        if (i10 + i11 <= i12) {
            return this.f22215d.j(i9, i10, i11);
        }
        if (i10 >= i12) {
            return this.f22216e.j(i9, i10 - i12, i11);
        }
        int i13 = i12 - i10;
        return this.f22216e.j(this.f22215d.j(i9, i10, i13), 0, i11 - i13);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final bpb k(int i9, int i10) {
        int iQ = bpb.q(i9, i10, this.f22214c);
        if (iQ == 0) {
            return bpb.f21870b;
        }
        if (iQ == this.f22214c) {
            return this;
        }
        int i11 = this.f22217f;
        if (i10 <= i11) {
            return this.f22215d.k(i9, i10);
        }
        if (i9 >= i11) {
            return this.f22216e.k(i9 - i11, i10 - i11);
        }
        bpb bpbVar = this.f22215d;
        return new bsh(bpbVar.k(i9, bpbVar.d()), this.f22216e.k(0, i10 - this.f22217f));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final bpg l() {
        ArrayList<ByteBuffer> arrayList = new ArrayList();
        bsg bsgVar = new bsg(this);
        while (bsgVar.hasNext()) {
            arrayList.add(bsgVar.next().n());
        }
        int i9 = bpg.f21899e;
        int i10 = 0;
        int iRemaining = 0;
        for (ByteBuffer byteBuffer : arrayList) {
            iRemaining += byteBuffer.remaining();
            i10 = byteBuffer.hasArray() ? i10 | 1 : byteBuffer.isDirect() ? i10 | 2 : i10 | 4;
        }
        return i10 == 2 ? new bpe(arrayList, iRemaining) : new bpf(new bqx(arrayList));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final String m(Charset charset) {
        return new String(B(), charset);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final ByteBuffer n() {
        throw null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final boolean o() {
        int iJ = this.f22215d.j(0, 0, this.f22217f);
        bpb bpbVar = this.f22216e;
        return bpbVar.j(iJ, 0, bpbVar.d()) == 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    public final void p(bpd bpdVar) throws IOException {
        this.f22215d.p(bpdVar);
        this.f22216e.p(bpdVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bpb
    /* JADX INFO: renamed from: s */
    public final box iterator() {
        return new bse(this);
    }

    public Object writeReplace() {
        return bpb.x(B());
    }
}
