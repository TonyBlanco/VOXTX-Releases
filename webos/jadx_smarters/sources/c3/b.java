package C3;

import C3.b;
import O2.InterfaceC0901n;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import d4.AbstractC1684a;
import d4.k0;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements InterfaceC0901n {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f1036h = new b(null, new C0010b[0], 0, -9223372036854775807L, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C0010b f1037i = new C0010b(0).l(0);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f1038j = k0.A0(1);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f1039k = k0.A0(2);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f1040l = k0.A0(3);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f1041m = k0.A0(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final InterfaceC0901n.a f1042n = new InterfaceC0901n.a() { // from class: C3.a
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return b.d(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1043a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f1044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f1045d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f1046e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f1047f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C0010b[] f1048g;

    /* JADX INFO: renamed from: C3.b$b, reason: collision with other inner class name */
    public static final class C0010b implements InterfaceC0901n {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f1049j = k0.A0(0);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f1050k = k0.A0(1);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f1051l = k0.A0(2);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f1052m = k0.A0(3);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f1053n = k0.A0(4);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f1054o = k0.A0(5);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f1055p = k0.A0(6);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f1056q = k0.A0(7);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final InterfaceC0901n.a f1057r = new InterfaceC0901n.a() { // from class: C3.c
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return b.C0010b.e(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1058a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f1059c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f1060d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Uri[] f1061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f1062f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final long[] f1063g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final long f1064h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f1065i;

        public C0010b(long j9) {
            this(j9, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        public C0010b(long j9, int i9, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j10, boolean z9) {
            AbstractC1684a.a(iArr.length == uriArr.length);
            this.f1058a = j9;
            this.f1059c = i9;
            this.f1060d = i10;
            this.f1062f = iArr;
            this.f1061e = uriArr;
            this.f1063g = jArr;
            this.f1064h = j10;
            this.f1065i = z9;
        }

        public static long[] c(long[] jArr, int i9) {
            int length = jArr.length;
            int iMax = Math.max(i9, length);
            long[] jArrCopyOf = Arrays.copyOf(jArr, iMax);
            Arrays.fill(jArrCopyOf, length, iMax, -9223372036854775807L);
            return jArrCopyOf;
        }

        public static int[] d(int[] iArr, int i9) {
            int length = iArr.length;
            int iMax = Math.max(i9, length);
            int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
            Arrays.fill(iArrCopyOf, length, iMax, 0);
            return iArrCopyOf;
        }

        public static C0010b e(Bundle bundle) {
            long j9 = bundle.getLong(f1049j);
            int i9 = bundle.getInt(f1050k);
            int i10 = bundle.getInt(f1056q);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1051l);
            int[] intArray = bundle.getIntArray(f1052m);
            long[] longArray = bundle.getLongArray(f1053n);
            long j10 = bundle.getLong(f1054o);
            boolean z9 = bundle.getBoolean(f1055p);
            if (intArray == null) {
                intArray = new int[0];
            }
            return new C0010b(j9, i9, i10, intArray, parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]), longArray == null ? new long[0] : longArray, j10, z9);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0010b.class != obj.getClass()) {
                return false;
            }
            C0010b c0010b = (C0010b) obj;
            return this.f1058a == c0010b.f1058a && this.f1059c == c0010b.f1059c && this.f1060d == c0010b.f1060d && Arrays.equals(this.f1061e, c0010b.f1061e) && Arrays.equals(this.f1062f, c0010b.f1062f) && Arrays.equals(this.f1063g, c0010b.f1063g) && this.f1064h == c0010b.f1064h && this.f1065i == c0010b.f1065i;
        }

        public int f() {
            return g(-1);
        }

        public int g(int i9) {
            int i10;
            int i11 = i9 + 1;
            while (true) {
                int[] iArr = this.f1062f;
                if (i11 >= iArr.length || this.f1065i || (i10 = iArr[i11]) == 0 || i10 == 1) {
                    break;
                }
                i11++;
            }
            return i11;
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putLong(f1049j, this.f1058a);
            bundle.putInt(f1050k, this.f1059c);
            bundle.putInt(f1056q, this.f1060d);
            bundle.putParcelableArrayList(f1051l, new ArrayList<>(Arrays.asList(this.f1061e)));
            bundle.putIntArray(f1052m, this.f1062f);
            bundle.putLongArray(f1053n, this.f1063g);
            bundle.putLong(f1054o, this.f1064h);
            bundle.putBoolean(f1055p, this.f1065i);
            return bundle;
        }

        public int hashCode() {
            int i9 = ((this.f1059c * 31) + this.f1060d) * 31;
            long j9 = this.f1058a;
            int iHashCode = (((((((i9 + ((int) (j9 ^ (j9 >>> 32)))) * 31) + Arrays.hashCode(this.f1061e)) * 31) + Arrays.hashCode(this.f1062f)) * 31) + Arrays.hashCode(this.f1063g)) * 31;
            long j10 = this.f1064h;
            return ((iHashCode + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f1065i ? 1 : 0);
        }

        public boolean i() {
            if (this.f1059c == -1) {
                return true;
            }
            for (int i9 = 0; i9 < this.f1059c; i9++) {
                int i10 = this.f1062f[i9];
                if (i10 == 0 || i10 == 1) {
                    return true;
                }
            }
            return false;
        }

        public final boolean j() {
            return this.f1065i && this.f1058a == Long.MIN_VALUE && this.f1059c == -1;
        }

        public boolean k() {
            return this.f1059c == -1 || f() < this.f1059c;
        }

        public C0010b l(int i9) {
            int[] iArrD = d(this.f1062f, i9);
            long[] jArrC = c(this.f1063g, i9);
            return new C0010b(this.f1058a, i9, this.f1060d, iArrD, (Uri[]) Arrays.copyOf(this.f1061e, i9), jArrC, this.f1064h, this.f1065i);
        }

        public C0010b m(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.f1061e;
            if (length < uriArr.length) {
                jArr = c(jArr, uriArr.length);
            } else if (this.f1059c != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new C0010b(this.f1058a, this.f1059c, this.f1060d, this.f1062f, this.f1061e, jArr, this.f1064h, this.f1065i);
        }

        public C0010b n(int i9, int i10) {
            int i11 = this.f1059c;
            AbstractC1684a.a(i11 == -1 || i10 < i11);
            int[] iArrD = d(this.f1062f, i10 + 1);
            int i12 = iArrD[i10];
            AbstractC1684a.a(i12 == 0 || i12 == 1 || i12 == i9);
            long[] jArrC = this.f1063g;
            if (jArrC.length != iArrD.length) {
                jArrC = c(jArrC, iArrD.length);
            }
            long[] jArr = jArrC;
            Uri[] uriArr = this.f1061e;
            if (uriArr.length != iArrD.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, iArrD.length);
            }
            Uri[] uriArr2 = uriArr;
            iArrD[i10] = i9;
            return new C0010b(this.f1058a, this.f1059c, this.f1060d, iArrD, uriArr2, jArr, this.f1064h, this.f1065i);
        }

        public C0010b o(Uri uri, int i9) {
            int[] iArrD = d(this.f1062f, i9 + 1);
            long[] jArrC = this.f1063g;
            if (jArrC.length != iArrD.length) {
                jArrC = c(jArrC, iArrD.length);
            }
            long[] jArr = jArrC;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f1061e, iArrD.length);
            uriArr[i9] = uri;
            iArrD[i9] = 1;
            return new C0010b(this.f1058a, this.f1059c, this.f1060d, iArrD, uriArr, jArr, this.f1064h, this.f1065i);
        }

        public C0010b p() {
            if (this.f1059c == -1) {
                return new C0010b(this.f1058a, 0, this.f1060d, new int[0], new Uri[0], new long[0], this.f1064h, this.f1065i);
            }
            int[] iArr = this.f1062f;
            int length = iArr.length;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            for (int i9 = 0; i9 < length; i9++) {
                int i10 = iArrCopyOf[i9];
                if (i10 == 1 || i10 == 0) {
                    iArrCopyOf[i9] = 2;
                }
            }
            return new C0010b(this.f1058a, length, this.f1060d, iArrCopyOf, this.f1061e, this.f1063g, this.f1064h, this.f1065i);
        }

        public C0010b q(long j9) {
            return new C0010b(this.f1058a, this.f1059c, this.f1060d, this.f1062f, this.f1061e, this.f1063g, j9, this.f1065i);
        }

        public C0010b r(boolean z9) {
            return new C0010b(this.f1058a, this.f1059c, this.f1060d, this.f1062f, this.f1061e, this.f1063g, this.f1064h, z9);
        }

        public C0010b s() {
            int[] iArr = this.f1062f;
            int length = iArr.length - 1;
            int[] iArrCopyOf = Arrays.copyOf(iArr, length);
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.f1061e, length);
            long[] jArrCopyOf = this.f1063g;
            if (jArrCopyOf.length > length) {
                jArrCopyOf = Arrays.copyOf(jArrCopyOf, length);
            }
            long[] jArr = jArrCopyOf;
            return new C0010b(this.f1058a, length, this.f1060d, iArrCopyOf, uriArr, jArr, k0.n1(jArr), this.f1065i);
        }

        public C0010b t(int i9) {
            return new C0010b(this.f1058a, this.f1059c, i9, this.f1062f, this.f1061e, this.f1063g, this.f1064h, this.f1065i);
        }

        public C0010b u(long j9) {
            return new C0010b(j9, this.f1059c, this.f1060d, this.f1062f, this.f1061e, this.f1063g, this.f1064h, this.f1065i);
        }
    }

    public b(Object obj, long... jArr) {
        this(obj, b(jArr), 0L, -9223372036854775807L, 0);
    }

    public b(Object obj, C0010b[] c0010bArr, long j9, long j10, int i9) {
        this.f1043a = obj;
        this.f1045d = j9;
        this.f1046e = j10;
        this.f1044c = c0010bArr.length + i9;
        this.f1048g = c0010bArr;
        this.f1047f = i9;
    }

    public static C0010b[] b(long[] jArr) {
        int length = jArr.length;
        C0010b[] c0010bArr = new C0010b[length];
        for (int i9 = 0; i9 < length; i9++) {
            c0010bArr[i9] = new C0010b(jArr[i9]);
        }
        return c0010bArr;
    }

    public static b c(Object obj, b bVar) {
        int i9 = bVar.f1044c - bVar.f1047f;
        C0010b[] c0010bArr = new C0010b[i9];
        for (int i10 = 0; i10 < i9; i10++) {
            C0010b c0010b = bVar.f1048g[i10];
            long j9 = c0010b.f1058a;
            int i11 = c0010b.f1059c;
            int i12 = c0010b.f1060d;
            int[] iArr = c0010b.f1062f;
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            Uri[] uriArr = c0010b.f1061e;
            Uri[] uriArr2 = (Uri[]) Arrays.copyOf(uriArr, uriArr.length);
            long[] jArr = c0010b.f1063g;
            c0010bArr[i10] = new C0010b(j9, i11, i12, iArrCopyOf, uriArr2, Arrays.copyOf(jArr, jArr.length), c0010b.f1064h, c0010b.f1065i);
        }
        return new b(obj, c0010bArr, bVar.f1045d, bVar.f1046e, bVar.f1047f);
    }

    public static b d(Bundle bundle) {
        C0010b[] c0010bArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f1038j);
        if (parcelableArrayList == null) {
            c0010bArr = new C0010b[0];
        } else {
            C0010b[] c0010bArr2 = new C0010b[parcelableArrayList.size()];
            for (int i9 = 0; i9 < parcelableArrayList.size(); i9++) {
                c0010bArr2[i9] = (C0010b) C0010b.f1057r.a((Bundle) parcelableArrayList.get(i9));
            }
            c0010bArr = c0010bArr2;
        }
        String str = f1039k;
        b bVar = f1036h;
        return new b(null, c0010bArr, bundle.getLong(str, bVar.f1045d), bundle.getLong(f1040l, bVar.f1046e), bundle.getInt(f1041m, bVar.f1047f));
    }

    public b A(int i9, int i10) {
        int i11 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i11] = c0010bArr2[i11].n(3, i10);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b B(int i9, int i10) {
        int i11 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i11] = c0010bArr2[i11].n(2, i10);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b C(int i9) {
        int i10 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i10] = c0010bArr2[i10].p();
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public C0010b e(int i9) {
        int i10 = this.f1047f;
        return i9 < i10 ? f1037i : this.f1048g[i9 - i10];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return k0.c(this.f1043a, bVar.f1043a) && this.f1044c == bVar.f1044c && this.f1045d == bVar.f1045d && this.f1046e == bVar.f1046e && this.f1047f == bVar.f1047f && Arrays.equals(this.f1048g, bVar.f1048g);
    }

    public int f(long j9, long j10) {
        if (j9 == Long.MIN_VALUE) {
            return -1;
        }
        if (j10 != -9223372036854775807L && j9 >= j10) {
            return -1;
        }
        int i9 = this.f1047f;
        while (i9 < this.f1044c && ((e(i9).f1058a != Long.MIN_VALUE && e(i9).f1058a <= j9) || !e(i9).k())) {
            i9++;
        }
        if (i9 < this.f1044c) {
            return i9;
        }
        return -1;
    }

    public int g(long j9, long j10) {
        int i9 = this.f1044c - 1;
        int i10 = i9 - (j(i9) ? 1 : 0);
        while (i10 >= 0 && k(j9, j10, i10)) {
            i10--;
        }
        if (i10 < 0 || !e(i10).i()) {
            return -1;
        }
        return i10;
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (C0010b c0010b : this.f1048g) {
            arrayList.add(c0010b.h());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f1038j, arrayList);
        }
        long j9 = this.f1045d;
        b bVar = f1036h;
        if (j9 != bVar.f1045d) {
            bundle.putLong(f1039k, j9);
        }
        long j10 = this.f1046e;
        if (j10 != bVar.f1046e) {
            bundle.putLong(f1040l, j10);
        }
        int i9 = this.f1047f;
        if (i9 != bVar.f1047f) {
            bundle.putInt(f1041m, i9);
        }
        return bundle;
    }

    public int hashCode() {
        int i9 = this.f1044c * 31;
        Object obj = this.f1043a;
        return ((((((((i9 + (obj == null ? 0 : obj.hashCode())) * 31) + ((int) this.f1045d)) * 31) + ((int) this.f1046e)) * 31) + this.f1047f) * 31) + Arrays.hashCode(this.f1048g);
    }

    public boolean i(int i9, int i10) {
        C0010b c0010bE;
        int i11;
        return i9 < this.f1044c && (i11 = (c0010bE = e(i9)).f1059c) != -1 && i10 < i11 && c0010bE.f1062f[i10] == 4;
    }

    public boolean j(int i9) {
        return i9 == this.f1044c - 1 && e(i9).j();
    }

    public final boolean k(long j9, long j10, int i9) {
        if (j9 == Long.MIN_VALUE) {
            return false;
        }
        C0010b c0010bE = e(i9);
        long j11 = c0010bE.f1058a;
        return j11 == Long.MIN_VALUE ? j10 == -9223372036854775807L || (c0010bE.f1065i && c0010bE.f1059c == -1) || j9 < j10 : j9 < j11;
    }

    public b l(int i9, int i10) {
        AbstractC1684a.a(i10 > 0);
        int i11 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        if (c0010bArr[i11].f1059c == i10) {
            return this;
        }
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i11] = this.f1048g[i11].l(i10);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b m(int i9, long... jArr) {
        int i10 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i10] = c0010bArr2[i10].m(jArr);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b n(long[][] jArr) {
        AbstractC1684a.g(this.f1047f == 0);
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        for (int i9 = 0; i9 < this.f1044c; i9++) {
            c0010bArr2[i9] = c0010bArr2[i9].m(jArr[i9]);
        }
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b o(int i9, long j9) {
        int i10 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i10] = this.f1048g[i10].u(j9);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b p(int i9, int i10) {
        int i11 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i11] = c0010bArr2[i11].n(4, i10);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b q(long j9) {
        return this.f1045d == j9 ? this : new b(this.f1043a, this.f1048g, j9, this.f1046e, this.f1047f);
    }

    public b r(int i9, int i10) {
        return s(i9, i10, Uri.EMPTY);
    }

    public b s(int i9, int i10, Uri uri) {
        int i11 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        AbstractC1684a.g(!Uri.EMPTY.equals(uri) || c0010bArr2[i11].f1065i);
        c0010bArr2[i11] = c0010bArr2[i11].o(uri, i10);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b t(long j9) {
        return this.f1046e == j9 ? this : new b(this.f1043a, this.f1048g, this.f1045d, j9, this.f1047f);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("AdPlaybackState(adsId=");
        sb.append(this.f1043a);
        sb.append(", adResumePositionUs=");
        sb.append(this.f1045d);
        sb.append(", adGroups=[");
        for (int i9 = 0; i9 < this.f1048g.length; i9++) {
            sb.append("adGroup(timeUs=");
            sb.append(this.f1048g[i9].f1058a);
            sb.append(", ads=[");
            for (int i10 = 0; i10 < this.f1048g[i9].f1062f.length; i10++) {
                sb.append("ad(state=");
                int i11 = this.f1048g[i9].f1062f[i10];
                sb.append(i11 != 0 ? i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? '?' : '!' : 'P' : 'S' : 'R' : '_');
                sb.append(", durationUs=");
                sb.append(this.f1048g[i9].f1063g[i10]);
                sb.append(')');
                if (i10 < this.f1048g[i9].f1062f.length - 1) {
                    sb.append(", ");
                }
            }
            sb.append("])");
            if (i9 < this.f1048g.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("])");
        return sb.toString();
    }

    public b u(int i9, long j9) {
        int i10 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        if (c0010bArr[i10].f1064h == j9) {
            return this;
        }
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i10] = c0010bArr2[i10].q(j9);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b v(int i9, boolean z9) {
        int i10 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        if (c0010bArr[i10].f1065i == z9) {
            return this;
        }
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i10] = c0010bArr2[i10].r(z9);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b w(int i9) {
        int i10 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i10] = c0010bArr2[i10].s();
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }

    public b x() {
        return y(this.f1044c, Long.MIN_VALUE).v(this.f1044c, true);
    }

    public b y(int i9, long j9) {
        int i10 = i9 - this.f1047f;
        C0010b c0010b = new C0010b(j9);
        C0010b[] c0010bArr = (C0010b[]) k0.S0(this.f1048g, c0010b);
        System.arraycopy(c0010bArr, i10, c0010bArr, i10 + 1, this.f1048g.length - i10);
        c0010bArr[i10] = c0010b;
        return new b(this.f1043a, c0010bArr, this.f1045d, this.f1046e, this.f1047f);
    }

    public b z(int i9, int i10) {
        int i11 = i9 - this.f1047f;
        C0010b[] c0010bArr = this.f1048g;
        if (c0010bArr[i11].f1060d == i10) {
            return this;
        }
        C0010b[] c0010bArr2 = (C0010b[]) k0.U0(c0010bArr, c0010bArr.length);
        c0010bArr2[i11] = c0010bArr2[i11].t(i10);
        return new b(this.f1043a, c0010bArr2, this.f1045d, this.f1046e, this.f1047f);
    }
}
