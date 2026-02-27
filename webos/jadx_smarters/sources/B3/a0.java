package B3;

import java.util.Arrays;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public interface a0 {

    public static class a implements a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Random f481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f483c;

        public a(int i9) {
            this(i9, new Random());
        }

        public a(int i9, Random random) {
            this(h(i9, random), random);
        }

        public a(int[] iArr, Random random) {
            this.f482b = iArr;
            this.f481a = random;
            this.f483c = new int[iArr.length];
            for (int i9 = 0; i9 < iArr.length; i9++) {
                this.f483c[iArr[i9]] = i9;
            }
        }

        public static int[] h(int i9, Random random) {
            int[] iArr = new int[i9];
            int i10 = 0;
            while (i10 < i9) {
                int i11 = i10 + 1;
                int iNextInt = random.nextInt(i11);
                iArr[i10] = iArr[iNextInt];
                iArr[iNextInt] = i10;
                i10 = i11;
            }
            return iArr;
        }

        @Override // B3.a0
        public a0 a(int i9, int i10) {
            int i11 = i10 - i9;
            int[] iArr = new int[this.f482b.length - i11];
            int i12 = 0;
            int i13 = 0;
            while (true) {
                int[] iArr2 = this.f482b;
                if (i12 >= iArr2.length) {
                    return new a(iArr, new Random(this.f481a.nextLong()));
                }
                int i14 = iArr2[i12];
                if (i14 < i9 || i14 >= i10) {
                    int i15 = i12 - i13;
                    if (i14 >= i9) {
                        i14 -= i11;
                    }
                    iArr[i15] = i14;
                } else {
                    i13++;
                }
                i12++;
            }
        }

        @Override // B3.a0
        public int b(int i9) {
            int i10 = this.f483c[i9] - 1;
            if (i10 >= 0) {
                return this.f482b[i10];
            }
            return -1;
        }

        @Override // B3.a0
        public int c(int i9) {
            int i10 = this.f483c[i9] + 1;
            int[] iArr = this.f482b;
            if (i10 < iArr.length) {
                return iArr[i10];
            }
            return -1;
        }

        @Override // B3.a0
        public int d() {
            int[] iArr = this.f482b;
            if (iArr.length > 0) {
                return iArr[iArr.length - 1];
            }
            return -1;
        }

        @Override // B3.a0
        public a0 e() {
            return new a(0, new Random(this.f481a.nextLong()));
        }

        @Override // B3.a0
        public int f() {
            int[] iArr = this.f482b;
            if (iArr.length > 0) {
                return iArr[0];
            }
            return -1;
        }

        @Override // B3.a0
        public a0 g(int i9, int i10) {
            int[] iArr = new int[i10];
            int[] iArr2 = new int[i10];
            int i11 = 0;
            int i12 = 0;
            while (i12 < i10) {
                iArr[i12] = this.f481a.nextInt(this.f482b.length + 1);
                int i13 = i12 + 1;
                int iNextInt = this.f481a.nextInt(i13);
                iArr2[i12] = iArr2[iNextInt];
                iArr2[iNextInt] = i12 + i9;
                i12 = i13;
            }
            Arrays.sort(iArr);
            int[] iArr3 = new int[this.f482b.length + i10];
            int i14 = 0;
            int i15 = 0;
            while (true) {
                int[] iArr4 = this.f482b;
                if (i11 >= iArr4.length + i10) {
                    return new a(iArr3, new Random(this.f481a.nextLong()));
                }
                if (i14 >= i10 || i15 != iArr[i14]) {
                    int i16 = i15 + 1;
                    int i17 = iArr4[i15];
                    iArr3[i11] = i17;
                    if (i17 >= i9) {
                        iArr3[i11] = i17 + i10;
                    }
                    i15 = i16;
                } else {
                    iArr3[i11] = iArr2[i14];
                    i14++;
                }
                i11++;
            }
        }

        @Override // B3.a0
        public int getLength() {
            return this.f482b.length;
        }
    }

    a0 a(int i9, int i10);

    int b(int i9);

    int c(int i9);

    int d();

    a0 e();

    int f();

    a0 g(int i9, int i10);

    int getLength();
}
