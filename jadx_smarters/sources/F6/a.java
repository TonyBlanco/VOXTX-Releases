package F6;

import com.amazonaws.services.s3.internal.crypto.JceEncryptionConstants;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f2026h = new a(4201, 4096, 1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f2027i = new a(1033, 1024, 1);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f2028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f2029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final a f2030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final a f2031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final a f2032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f2033o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f2034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f2035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f2036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f2037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f2039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2040g;

    static {
        a aVar = new a(67, 64, 1);
        f2028j = aVar;
        f2029k = new a(19, 16, 1);
        f2030l = new a(285, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 0);
        a aVar2 = new a(301, JceEncryptionConstants.SYMMETRIC_KEY_LENGTH, 1);
        f2031m = aVar2;
        f2032n = aVar2;
        f2033o = aVar;
    }

    public a(int i9, int i10, int i11) {
        this.f2039f = i9;
        this.f2038e = i10;
        this.f2040g = i11;
        this.f2034a = new int[i10];
        this.f2035b = new int[i10];
        int i12 = 1;
        for (int i13 = 0; i13 < i10; i13++) {
            this.f2034a[i13] = i12;
            i12 <<= 1;
            if (i12 >= i10) {
                i12 = (i12 ^ i9) & (i10 - 1);
            }
        }
        for (int i14 = 0; i14 < i10 - 1; i14++) {
            this.f2035b[this.f2034a[i14]] = i14;
        }
        this.f2036c = new b(this, new int[]{0});
        this.f2037d = new b(this, new int[]{1});
    }

    public static int a(int i9, int i10) {
        return i9 ^ i10;
    }

    public b b(int i9, int i10) {
        if (i9 < 0) {
            throw new IllegalArgumentException();
        }
        if (i10 == 0) {
            return this.f2036c;
        }
        int[] iArr = new int[i9 + 1];
        iArr[0] = i10;
        return new b(this, iArr);
    }

    public int c(int i9) {
        return this.f2034a[i9];
    }

    public int d() {
        return this.f2040g;
    }

    public b e() {
        return this.f2037d;
    }

    public int f() {
        return this.f2038e;
    }

    public b g() {
        return this.f2036c;
    }

    public int h(int i9) {
        if (i9 != 0) {
            return this.f2034a[(this.f2038e - this.f2035b[i9]) - 1];
        }
        throw new ArithmeticException();
    }

    public int i(int i9) {
        if (i9 != 0) {
            return this.f2035b[i9];
        }
        throw new IllegalArgumentException();
    }

    public int j(int i9, int i10) {
        if (i9 == 0 || i10 == 0) {
            return 0;
        }
        int[] iArr = this.f2034a;
        int[] iArr2 = this.f2035b;
        return iArr[(iArr2[i9] + iArr2[i10]) % (this.f2038e - 1)];
    }

    public String toString() {
        return "GF(0x" + Integer.toHexString(this.f2039f) + ',' + this.f2038e + ')';
    }
}
