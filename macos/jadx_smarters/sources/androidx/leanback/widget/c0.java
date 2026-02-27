package androidx.leanback.widget;

import com.google.android.gms.common.api.a;

/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15633a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f15634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f15635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public a f15636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f15637e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15638a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15639b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f15640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f15641d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f15642e = 2;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f15643f = 3;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f15644g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f15645h = 50.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f15646i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f15647j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f15648k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f15649l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f15650m;

        public a(String str) {
            s();
            this.f15650m = str;
        }

        public final void A(float f9) {
            if ((f9 < 0.0f || f9 > 100.0f) && f9 != -1.0f) {
                throw new IllegalArgumentException();
            }
            this.f15645h = f9;
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x0027, code lost:
        
            r2 = r4.f15639b - r4.f15647j;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0047, code lost:
        
            r4.f15640c = (r4.f15638a - r4.f15647j) - r5;
         */
        /* JADX WARN: Removed duplicated region for block: B:32:0x006a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void B(int r5, int r6, int r7, int r8) {
            /*
                r4 = this;
                r4.f15639b = r5
                r4.f15638a = r6
                int r5 = r4.c()
                int r6 = r4.a()
                boolean r0 = r4.p()
                boolean r1 = r4.o()
                if (r0 != 0) goto L34
                boolean r2 = r4.f15649l
                if (r2 != 0) goto L21
                int r2 = r4.f15643f
                r2 = r2 & 1
                if (r2 == 0) goto L2f
                goto L27
            L21:
                int r2 = r4.f15643f
                r2 = r2 & 2
                if (r2 == 0) goto L2f
            L27:
                int r2 = r4.f15639b
                int r3 = r4.f15647j
                int r2 = r2 - r3
            L2c:
                r4.f15641d = r2
                goto L34
            L2f:
                int r2 = r4.b(r7, r6)
                goto L2c
            L34:
                if (r1 != 0) goto L56
                boolean r2 = r4.f15649l
                if (r2 != 0) goto L41
                int r2 = r4.f15643f
                r2 = r2 & 2
                if (r2 == 0) goto L50
                goto L47
            L41:
                int r2 = r4.f15643f
                r2 = r2 & 1
                if (r2 == 0) goto L50
            L47:
                int r2 = r4.f15638a
                int r3 = r4.f15647j
                int r2 = r2 - r3
                int r2 = r2 - r5
                r4.f15640c = r2
                goto L56
            L50:
                int r5 = r4.b(r8, r6)
                r4.f15640c = r5
            L56:
                if (r1 != 0) goto Lba
                if (r0 != 0) goto Lba
                boolean r5 = r4.f15649l
                if (r5 != 0) goto La2
                int r5 = r4.f15643f
                r0 = r5 & 1
                if (r0 == 0) goto L81
                boolean r5 = r4.r()
                if (r5 == 0) goto L76
            L6a:
                int r5 = r4.f15641d
                int r6 = r4.b(r8, r6)
                int r5 = java.lang.Math.min(r5, r6)
                r4.f15641d = r5
            L76:
                int r5 = r4.f15641d
                int r6 = r4.f15640c
                int r5 = java.lang.Math.max(r5, r6)
                r4.f15640c = r5
                goto Lba
            L81:
                r5 = r5 & 2
                if (r5 == 0) goto Lba
                boolean r5 = r4.q()
                if (r5 == 0) goto L97
            L8b:
                int r5 = r4.f15640c
                int r6 = r4.b(r7, r6)
                int r5 = java.lang.Math.max(r5, r6)
                r4.f15640c = r5
            L97:
                int r5 = r4.f15641d
                int r6 = r4.f15640c
                int r5 = java.lang.Math.min(r5, r6)
                r4.f15641d = r5
                goto Lba
            La2:
                int r5 = r4.f15643f
                r0 = r5 & 1
                if (r0 == 0) goto Laf
                boolean r5 = r4.r()
                if (r5 == 0) goto L97
                goto L8b
            Laf:
                r5 = r5 & 2
                if (r5 == 0) goto Lba
                boolean r5 = r4.q()
                if (r5 == 0) goto L76
                goto L6a
            Lba:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.c0.a.B(int, int, int, int):void");
        }

        public final int a() {
            if (this.f15649l) {
                int i9 = this.f15644g;
                int i10 = i9 >= 0 ? this.f15646i - i9 : -i9;
                float f9 = this.f15645h;
                return f9 != -1.0f ? i10 - ((int) ((this.f15646i * f9) / 100.0f)) : i10;
            }
            int i11 = this.f15644g;
            if (i11 < 0) {
                i11 += this.f15646i;
            }
            float f10 = this.f15645h;
            return f10 != -1.0f ? i11 + ((int) ((this.f15646i * f10) / 100.0f)) : i11;
        }

        public final int b(int i9, int i10) {
            return i9 - i10;
        }

        public final int c() {
            return (this.f15646i - this.f15647j) - this.f15648k;
        }

        public final int d() {
            return this.f15640c;
        }

        public final int e() {
            return this.f15641d;
        }

        public final int f() {
            return this.f15648k;
        }

        public final int g() {
            return this.f15647j;
        }

        public final int h(int i9) {
            int i10;
            int i11;
            int i12 = i();
            int iA = a();
            boolean zP = p();
            boolean zO = o();
            if (!zP) {
                int i13 = this.f15647j;
                int i14 = iA - i13;
                if (this.f15649l ? (this.f15643f & 2) != 0 : (this.f15643f & 1) != 0) {
                    int i15 = this.f15639b;
                    if (i9 - i15 <= i14) {
                        int i16 = i15 - i13;
                        return (zO || i16 <= (i11 = this.f15640c)) ? i16 : i11;
                    }
                }
            }
            if (!zO) {
                int i17 = this.f15648k;
                int i18 = (i12 - iA) - i17;
                if (this.f15649l ? (this.f15643f & 1) != 0 : (this.f15643f & 2) != 0) {
                    int i19 = this.f15638a;
                    if (i19 - i9 <= i18) {
                        int i20 = i19 - (i12 - i17);
                        return (zP || i20 >= (i10 = this.f15641d)) ? i20 : i10;
                    }
                }
            }
            return b(i9, iA);
        }

        public final int i() {
            return this.f15646i;
        }

        public final int j() {
            return this.f15643f;
        }

        public final int k() {
            return this.f15644g;
        }

        public final float l() {
            return this.f15645h;
        }

        public final void m() {
            this.f15638a = a.e.API_PRIORITY_OTHER;
            this.f15640c = a.e.API_PRIORITY_OTHER;
        }

        public final void n() {
            this.f15639b = Integer.MIN_VALUE;
            this.f15641d = Integer.MIN_VALUE;
        }

        public final boolean o() {
            return this.f15638a == Integer.MAX_VALUE;
        }

        public final boolean p() {
            return this.f15639b == Integer.MIN_VALUE;
        }

        public final boolean q() {
            return (this.f15642e & 2) != 0;
        }

        public final boolean r() {
            return (this.f15642e & 1) != 0;
        }

        public void s() {
            this.f15639b = Integer.MIN_VALUE;
            this.f15638a = a.e.API_PRIORITY_OTHER;
        }

        public final void t(int i9, int i10) {
            this.f15647j = i9;
            this.f15648k = i10;
        }

        public String toString() {
            return " min:" + this.f15639b + " " + this.f15641d + " max:" + this.f15638a + " " + this.f15640c;
        }

        public final void u(boolean z9) {
            this.f15642e = z9 ? this.f15642e | 2 : this.f15642e & (-3);
        }

        public final void v(boolean z9) {
            this.f15642e = z9 ? this.f15642e | 1 : this.f15642e & (-2);
        }

        public final void w(boolean z9) {
            this.f15649l = z9;
        }

        public final void x(int i9) {
            this.f15646i = i9;
        }

        public final void y(int i9) {
            this.f15643f = i9;
        }

        public final void z(int i9) {
            this.f15644g = i9;
        }
    }

    public c0() {
        a aVar = new a("vertical");
        this.f15634b = aVar;
        a aVar2 = new a("horizontal");
        this.f15635c = aVar2;
        this.f15636d = aVar2;
        this.f15637e = aVar;
    }

    public final a a() {
        return this.f15636d;
    }

    public final void b() {
        a().s();
    }

    public final a c() {
        return this.f15637e;
    }

    public final void d(int i9) {
        a aVar;
        this.f15633a = i9;
        if (i9 == 0) {
            this.f15636d = this.f15635c;
            aVar = this.f15634b;
        } else {
            this.f15636d = this.f15634b;
            aVar = this.f15635c;
        }
        this.f15637e = aVar;
    }

    public String toString() {
        return "horizontal=" + this.f15635c + "; vertical=" + this.f15634b;
    }
}
