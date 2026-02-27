package com.google.ads.interactivemedia.v3.internal;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;
import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import okio.Segment;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bpb implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21871c = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final bpb f21870b = new boz(bqu.f22115b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final bow f21869a = new bpa(null);

    private static bpb c(Iterator it, int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", Integer.valueOf(i9)));
        }
        if (i9 == 1) {
            return (bpb) it.next();
        }
        int i10 = i9 >>> 1;
        bpb bpbVarC = c(it, i10);
        bpb bpbVarC2 = c(it, i9 - i10);
        if (a.e.API_PRIORITY_OTHER - bpbVarC.d() >= bpbVarC2.d()) {
            return bsh.E(bpbVarC, bpbVarC2);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + bpbVarC.d() + "+" + bpbVarC2.d());
    }

    public static int q(int i9, int i10, int i11) {
        int i12 = i10 - i9;
        if ((i9 | i10 | i12 | (i11 - i10)) >= 0) {
            return i12;
        }
        if (i9 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i9 + " < 0");
        }
        if (i10 < i9) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i9 + ", " + i10);
        }
        throw new IndexOutOfBoundsException("End index: " + i10 + " >= " + i11);
    }

    public static bpb t(byte[] bArr) {
        return u(bArr, 0, bArr.length);
    }

    public static bpb u(byte[] bArr, int i9, int i10) {
        q(i9, i9 + i10, bArr.length);
        return new boz(f21869a.a(bArr, i9, i10));
    }

    public static bpb v(String str) {
        return new boz(str.getBytes(bqu.f22114a));
    }

    public static bpb w(InputStream inputStream) throws IOException {
        ArrayList arrayList = new ArrayList();
        int iMin = JceEncryptionConstants.SYMMETRIC_KEY_LENGTH;
        while (true) {
            byte[] bArr = new byte[iMin];
            int i9 = 0;
            while (i9 < iMin) {
                int i10 = inputStream.read(bArr, i9, iMin - i9);
                if (i10 == -1) {
                    break;
                }
                i9 += i10;
            }
            bpb bpbVarU = i9 == 0 ? null : u(bArr, 0, i9);
            if (bpbVarU == null) {
                break;
            }
            arrayList.add(bpbVarU);
            iMin = Math.min(iMin + iMin, Segment.SIZE);
        }
        int size = arrayList.size();
        return size == 0 ? f21870b : c(arrayList.iterator(), size);
    }

    public static bpb x(byte[] bArr) {
        return new boz(bArr);
    }

    public static void z(int i9, int i10) {
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i9);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i9 + ", " + i10);
        }
    }

    public final boolean A() {
        return d() == 0;
    }

    public final byte[] B() {
        int iD = d();
        if (iD == 0) {
            return bqu.f22115b;
        }
        byte[] bArr = new byte[iD];
        e(bArr, 0, 0, iD);
        return bArr;
    }

    @Deprecated
    public final void C(byte[] bArr, int i9, int i10) {
        q(0, i10, d());
        q(i9, i9 + i10, bArr.length);
        if (i10 > 0) {
            e(bArr, 0, i9, i10);
        }
    }

    public abstract byte a(int i9);

    public abstract byte b(int i9);

    public abstract int d();

    public abstract void e(byte[] bArr, int i9, int i10, int i11);

    public abstract boolean equals(Object obj);

    public abstract int f();

    public abstract boolean h();

    public final int hashCode() {
        int i9 = this.f21871c;
        if (i9 == 0) {
            int iD = d();
            i9 = i(iD, 0, iD);
            if (i9 == 0) {
                i9 = 1;
            }
            this.f21871c = i9;
        }
        return i9;
    }

    public abstract int i(int i9, int i10, int i11);

    public abstract int j(int i9, int i10, int i11);

    public abstract bpb k(int i9, int i10);

    public abstract bpg l();

    public abstract String m(Charset charset);

    public abstract ByteBuffer n();

    public abstract boolean o();

    public abstract void p(bpd bpdVar) throws IOException;

    public final int r() {
        return this.f21871c;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public box iterator() {
        return new bot(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(d()), d() <= 50 ? bto.B(this) : String.valueOf(bto.B(k(0, 47))).concat("..."));
    }

    public final String y() {
        return d() == 0 ? "" : m(bqu.f22114a);
    }
}
