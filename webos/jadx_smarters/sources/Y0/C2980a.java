package y0;

import android.graphics.Color;
import android.util.TimingLogger;
import com.google.android.gms.common.api.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import y0.C2981b;

/* JADX INFO: renamed from: y0.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2980a {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Comparator f52078g = new C0482a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f52079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f52080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f52081c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2981b.c[] f52083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f52084f = new float[3];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final TimingLogger f52082d = null;

    /* JADX INFO: renamed from: y0.a$a, reason: collision with other inner class name */
    public static class C0482a implements Comparator {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(b bVar, b bVar2) {
            return bVar2.g() - bVar.g();
        }
    }

    /* JADX INFO: renamed from: y0.a$b */
    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f52085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f52086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f52087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f52088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f52089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f52090f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f52091g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f52092h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f52093i;

        public b(int i9, int i10) {
            this.f52085a = i9;
            this.f52086b = i10;
            c();
        }

        public final boolean a() {
            return e() > 1;
        }

        public final int b() {
            int iF = f();
            C2980a c2980a = C2980a.this;
            int[] iArr = c2980a.f52079a;
            int[] iArr2 = c2980a.f52080b;
            C2980a.e(iArr, iF, this.f52085a, this.f52086b);
            Arrays.sort(iArr, this.f52085a, this.f52086b + 1);
            C2980a.e(iArr, iF, this.f52085a, this.f52086b);
            int i9 = this.f52087c / 2;
            int i10 = this.f52085a;
            int i11 = 0;
            while (true) {
                int i12 = this.f52086b;
                if (i10 > i12) {
                    return this.f52085a;
                }
                i11 += iArr2[iArr[i10]];
                if (i11 >= i9) {
                    return Math.min(i12 - 1, i10);
                }
                i10++;
            }
        }

        public final void c() {
            C2980a c2980a = C2980a.this;
            int[] iArr = c2980a.f52079a;
            int[] iArr2 = c2980a.f52080b;
            int i9 = a.e.API_PRIORITY_OTHER;
            int i10 = a.e.API_PRIORITY_OTHER;
            int i11 = a.e.API_PRIORITY_OTHER;
            int i12 = Integer.MIN_VALUE;
            int i13 = Integer.MIN_VALUE;
            int i14 = Integer.MIN_VALUE;
            int i15 = 0;
            for (int i16 = this.f52085a; i16 <= this.f52086b; i16++) {
                int i17 = iArr[i16];
                i15 += iArr2[i17];
                int iK = C2980a.k(i17);
                int iJ = C2980a.j(i17);
                int i18 = C2980a.i(i17);
                if (iK > i12) {
                    i12 = iK;
                }
                if (iK < i9) {
                    i9 = iK;
                }
                if (iJ > i13) {
                    i13 = iJ;
                }
                if (iJ < i10) {
                    i10 = iJ;
                }
                if (i18 > i14) {
                    i14 = i18;
                }
                if (i18 < i11) {
                    i11 = i18;
                }
            }
            this.f52088d = i9;
            this.f52089e = i12;
            this.f52090f = i10;
            this.f52091g = i13;
            this.f52092h = i11;
            this.f52093i = i14;
            this.f52087c = i15;
        }

        public final C2981b.e d() {
            C2980a c2980a = C2980a.this;
            int[] iArr = c2980a.f52079a;
            int[] iArr2 = c2980a.f52080b;
            int iK = 0;
            int i9 = 0;
            int iJ = 0;
            int i10 = 0;
            for (int i11 = this.f52085a; i11 <= this.f52086b; i11++) {
                int i12 = iArr[i11];
                int i13 = iArr2[i12];
                i9 += i13;
                iK += C2980a.k(i12) * i13;
                iJ += C2980a.j(i12) * i13;
                i10 += i13 * C2980a.i(i12);
            }
            float f9 = i9;
            return new C2981b.e(C2980a.b(Math.round(iK / f9), Math.round(iJ / f9), Math.round(i10 / f9)), i9);
        }

        public final int e() {
            return (this.f52086b + 1) - this.f52085a;
        }

        public final int f() {
            int i9 = this.f52089e - this.f52088d;
            int i10 = this.f52091g - this.f52090f;
            int i11 = this.f52093i - this.f52092h;
            if (i9 < i10 || i9 < i11) {
                return (i10 < i9 || i10 < i11) ? -1 : -2;
            }
            return -3;
        }

        public final int g() {
            return ((this.f52089e - this.f52088d) + 1) * ((this.f52091g - this.f52090f) + 1) * ((this.f52093i - this.f52092h) + 1);
        }

        public final b h() {
            if (!a()) {
                throw new IllegalStateException("Can not split a box with only 1 color");
            }
            int iB = b();
            b bVar = C2980a.this.new b(iB + 1, this.f52086b);
            this.f52086b = iB;
            c();
            return bVar;
        }
    }

    public C2980a(int[] iArr, int i9, C2981b.c[] cVarArr) {
        this.f52083e = cVarArr;
        int[] iArr2 = new int[32768];
        this.f52080b = iArr2;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            int iG = g(iArr[i10]);
            iArr[i10] = iG;
            iArr2[iG] = iArr2[iG] + 1;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < 32768; i12++) {
            if (iArr2[i12] > 0 && l(i12)) {
                iArr2[i12] = 0;
            }
            if (iArr2[i12] > 0) {
                i11++;
            }
        }
        int[] iArr3 = new int[i11];
        this.f52079a = iArr3;
        int i13 = 0;
        for (int i14 = 0; i14 < 32768; i14++) {
            if (iArr2[i14] > 0) {
                iArr3[i13] = i14;
                i13++;
            }
        }
        if (i11 > i9) {
            this.f52081c = h(i9);
            return;
        }
        this.f52081c = new ArrayList();
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = iArr3[i15];
            this.f52081c.add(new C2981b.e(a(i16), iArr2[i16]));
        }
    }

    public static int a(int i9) {
        return b(k(i9), j(i9), i(i9));
    }

    public static int b(int i9, int i10, int i11) {
        return Color.rgb(f(i9, 5, 8), f(i10, 5, 8), f(i11, 5, 8));
    }

    public static void e(int[] iArr, int i9, int i10, int i11) {
        if (i9 == -2) {
            while (i10 <= i11) {
                int i12 = iArr[i10];
                iArr[i10] = i(i12) | (j(i12) << 10) | (k(i12) << 5);
                i10++;
            }
            return;
        }
        if (i9 != -1) {
            return;
        }
        while (i10 <= i11) {
            int i13 = iArr[i10];
            iArr[i10] = k(i13) | (i(i13) << 10) | (j(i13) << 5);
            i10++;
        }
    }

    public static int f(int i9, int i10, int i11) {
        return (i11 > i10 ? i9 << (i11 - i10) : i9 >> (i10 - i11)) & ((1 << i11) - 1);
    }

    public static int g(int i9) {
        return f(Color.blue(i9), 8, 5) | (f(Color.red(i9), 8, 5) << 10) | (f(Color.green(i9), 8, 5) << 5);
    }

    public static int i(int i9) {
        return i9 & 31;
    }

    public static int j(int i9) {
        return (i9 >> 5) & 31;
    }

    public static int k(int i9) {
        return (i9 >> 10) & 31;
    }

    public final List c(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C2981b.e eVarD = ((b) it.next()).d();
            if (!n(eVarD)) {
                arrayList.add(eVarD);
            }
        }
        return arrayList;
    }

    public List d() {
        return this.f52081c;
    }

    public final List h(int i9) {
        PriorityQueue priorityQueue = new PriorityQueue(i9, f52078g);
        priorityQueue.offer(new b(0, this.f52079a.length - 1));
        o(priorityQueue, i9);
        return c(priorityQueue);
    }

    public final boolean l(int i9) {
        int iA = a(i9);
        G.a.g(iA, this.f52084f);
        return m(iA, this.f52084f);
    }

    public final boolean m(int i9, float[] fArr) {
        C2981b.c[] cVarArr = this.f52083e;
        if (cVarArr != null && cVarArr.length > 0) {
            int length = cVarArr.length;
            for (int i10 = 0; i10 < length; i10++) {
                if (!this.f52083e[i10].a(i9, fArr)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean n(C2981b.e eVar) {
        return m(eVar.e(), eVar.c());
    }

    public final void o(PriorityQueue priorityQueue, int i9) {
        b bVar;
        while (priorityQueue.size() < i9 && (bVar = (b) priorityQueue.poll()) != null && bVar.a()) {
            priorityQueue.offer(bVar.h());
            priorityQueue.offer(bVar);
        }
    }
}
