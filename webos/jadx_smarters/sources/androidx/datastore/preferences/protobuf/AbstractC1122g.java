package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1122g implements Iterable, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1122g f14628c = new i(AbstractC1139y.f14770c);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final f f14629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Comparator f14630e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14631a = 0;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$a */
    public class a extends c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f14632a = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f14633c;

        public a() {
            this.f14633c = AbstractC1122g.this.size();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g.InterfaceC0166g
        public byte h() {
            int i9 = this.f14632a;
            if (i9 >= this.f14633c) {
                throw new NoSuchElementException();
            }
            this.f14632a = i9 + 1;
            return AbstractC1122g.this.h(i9);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f14632a < this.f14633c;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$b */
    public static class b implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AbstractC1122g abstractC1122g, AbstractC1122g abstractC1122g2) {
            InterfaceC0166g interfaceC0166gJ = abstractC1122g.j();
            InterfaceC0166g interfaceC0166gJ2 = abstractC1122g2.j();
            while (interfaceC0166gJ.hasNext() && interfaceC0166gJ2.hasNext()) {
                int iCompare = Integer.compare(AbstractC1122g.p(interfaceC0166gJ.h()), AbstractC1122g.p(interfaceC0166gJ2.h()));
                if (iCompare != 0) {
                    return iCompare;
                }
            }
            return Integer.compare(abstractC1122g.size(), abstractC1122g2.size());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$c */
    public static abstract class c implements InterfaceC0166g {
        @Override // java.util.Iterator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Byte next() {
            return Byte.valueOf(h());
        }

        @Override // java.util.Iterator
        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$d */
    public static final class d implements f {
        public d() {
        }

        public /* synthetic */ d(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g.f
        public byte[] a(byte[] bArr, int i9, int i10) {
            return Arrays.copyOfRange(bArr, i9, i10 + i9);
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$e */
    public static final class e extends i {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f14635g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f14636h;

        public e(byte[] bArr, int i9, int i10) {
            super(bArr);
            AbstractC1122g.d(i9, i9 + i10, bArr.length);
            this.f14635g = i9;
            this.f14636h = i10;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g.i
        public int B() {
            return this.f14635g;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g.i, androidx.datastore.preferences.protobuf.AbstractC1122g
        public byte b(int i9) {
            AbstractC1122g.c(i9, size());
            return this.f14637f[this.f14635g + i9];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g.i, androidx.datastore.preferences.protobuf.AbstractC1122g
        public byte h(int i9) {
            return this.f14637f[this.f14635g + i9];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g.i, androidx.datastore.preferences.protobuf.AbstractC1122g
        public int size() {
            return this.f14636h;
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$f */
    public interface f {
        byte[] a(byte[] bArr, int i9, int i10);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$g, reason: collision with other inner class name */
    public interface InterfaceC0166g extends Iterator {
        byte h();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$h */
    public static abstract class h extends AbstractC1122g {
        @Override // java.lang.Iterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.j();
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$i */
    public static class i extends h {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final byte[] f14637f;

        public i(byte[] bArr) {
            bArr.getClass();
            this.f14637f = bArr;
        }

        public final boolean A(AbstractC1122g abstractC1122g, int i9, int i10) {
            if (i10 > abstractC1122g.size()) {
                throw new IllegalArgumentException("Length too large: " + i10 + size());
            }
            int i11 = i9 + i10;
            if (i11 > abstractC1122g.size()) {
                throw new IllegalArgumentException("Ran off end of other: " + i9 + ", " + i10 + ", " + abstractC1122g.size());
            }
            if (!(abstractC1122g instanceof i)) {
                return abstractC1122g.o(i9, i11).equals(o(0, i10));
            }
            i iVar = (i) abstractC1122g;
            byte[] bArr = this.f14637f;
            byte[] bArr2 = iVar.f14637f;
            int iB = B() + i10;
            int iB2 = B();
            int iB3 = iVar.B() + i9;
            while (iB2 < iB) {
                if (bArr[iB2] != bArr2[iB3]) {
                    return false;
                }
                iB2++;
                iB3++;
            }
            return true;
        }

        public int B() {
            return 0;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public byte b(int i9) {
            return this.f14637f[i9];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof AbstractC1122g) || size() != ((AbstractC1122g) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof i)) {
                return obj.equals(this);
            }
            i iVar = (i) obj;
            int iN = n();
            int iN2 = iVar.n();
            if (iN == 0 || iN2 == 0 || iN == iN2) {
                return A(iVar, 0, size());
            }
            return false;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public byte h(int i9) {
            return this.f14637f[i9];
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public final boolean i() {
            int iB = B();
            return q0.n(this.f14637f, iB, size() + iB);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public final int l(int i9, int i10, int i11) {
            return AbstractC1139y.i(i9, this.f14637f, B() + i10, i11);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public final AbstractC1122g o(int i9, int i10) {
            int iD = AbstractC1122g.d(i9, i10, size());
            return iD == 0 ? AbstractC1122g.f14628c : new e(this.f14637f, B() + i9, iD);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public final String r(Charset charset) {
            return new String(this.f14637f, B(), size(), charset);
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public int size() {
            return this.f14637f.length;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g
        public final void z(AbstractC1121f abstractC1121f) {
            abstractC1121f.a(this.f14637f, B(), size());
        }
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.g$j */
    public static final class j implements f {
        public j() {
        }

        public /* synthetic */ j(a aVar) {
            this();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC1122g.f
        public byte[] a(byte[] bArr, int i9, int i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            return bArr2;
        }
    }

    static {
        a aVar = null;
        f14629d = AbstractC1119d.c() ? new j(aVar) : new d(aVar);
        f14630e = new b();
    }

    public static void c(int i9, int i10) {
        if (((i10 - (i9 + 1)) | i9) < 0) {
            if (i9 < 0) {
                throw new ArrayIndexOutOfBoundsException("Index < 0: " + i9);
            }
            throw new ArrayIndexOutOfBoundsException("Index > length: " + i9 + ", " + i10);
        }
    }

    public static int d(int i9, int i10, int i11) {
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

    public static AbstractC1122g e(byte[] bArr) {
        return f(bArr, 0, bArr.length);
    }

    public static AbstractC1122g f(byte[] bArr, int i9, int i10) {
        d(i9, i9 + i10, bArr.length);
        return new i(f14629d.a(bArr, i9, i10));
    }

    public static AbstractC1122g g(String str) {
        return new i(str.getBytes(AbstractC1139y.f14768a));
    }

    public static int p(byte b9) {
        return b9 & 255;
    }

    public static AbstractC1122g u(byte[] bArr) {
        return new i(bArr);
    }

    public static AbstractC1122g y(byte[] bArr, int i9, int i10) {
        return new e(bArr, i9, i10);
    }

    public abstract byte b(int i9);

    public abstract boolean equals(Object obj);

    public abstract byte h(int i9);

    public final int hashCode() {
        int iL = this.f14631a;
        if (iL == 0) {
            int size = size();
            iL = l(size, 0, size);
            if (iL == 0) {
                iL = 1;
            }
            this.f14631a = iL;
        }
        return iL;
    }

    public abstract boolean i();

    public InterfaceC0166g j() {
        return new a();
    }

    public abstract int l(int i9, int i10, int i11);

    public final int n() {
        return this.f14631a;
    }

    public abstract AbstractC1122g o(int i9, int i10);

    public final String q(Charset charset) {
        return size() == 0 ? "" : r(charset);
    }

    public abstract String r(Charset charset);

    public final String s() {
        return q(AbstractC1139y.f14768a);
    }

    public abstract int size();

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()));
    }

    public abstract void z(AbstractC1121f abstractC1121f);
}
