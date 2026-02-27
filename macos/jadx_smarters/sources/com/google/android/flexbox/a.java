package com.google.android.flexbox;

import T.c;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.CompoundButton;
import g4.C1836c;
import g4.InterfaceC1834a;
import g4.InterfaceC1835b;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1834a f26213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean[] f26214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f26215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long[] f26216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long[] f26217e;

    /* JADX INFO: renamed from: com.google.android.flexbox.a$a, reason: collision with other inner class name */
    public static class C0251a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public List f26218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f26219b;

        public void a() {
            this.f26218a = null;
            this.f26219b = 0;
        }
    }

    public a(InterfaceC1834a interfaceC1834a) {
        this.f26213a = interfaceC1834a;
    }

    public final int A(boolean z9) {
        return z9 ? this.f26213a.b() : this.f26213a.c();
    }

    public final int B(boolean z9) {
        return z9 ? this.f26213a.c() : this.f26213a.b();
    }

    public final int C(boolean z9) {
        return z9 ? this.f26213a.n() : this.f26213a.w();
    }

    public final int D(boolean z9) {
        return z9 ? this.f26213a.w() : this.f26213a.n();
    }

    public final int E(View view, boolean z9) {
        return z9 ? view.getMeasuredHeight() : view.getMeasuredWidth();
    }

    public final int F(View view, boolean z9) {
        return z9 ? view.getMeasuredWidth() : view.getMeasuredHeight();
    }

    public final boolean G(int i9, int i10, C1836c c1836c) {
        return i9 == i10 - 1 && c1836c.c() != 0;
    }

    public final boolean H(View view, int i9, int i10, int i11, int i12, InterfaceC1835b interfaceC1835b, int i13, int i14, int i15) {
        if (this.f26213a.r() == 0) {
            return false;
        }
        if (interfaceC1835b.s()) {
            return true;
        }
        if (i9 == 0) {
            return false;
        }
        int iG = this.f26213a.g();
        if (iG != -1 && iG <= i15 + 1) {
            return false;
        }
        int iV = this.f26213a.v(view, i13, i14);
        if (iV > 0) {
            i12 += iV;
        }
        return i10 < i11 + i12;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void I(android.view.View r6, g4.C1836c r7, int r8, int r9, int r10, int r11) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.a.I(android.view.View, g4.c, int, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J(android.view.View r5, g4.C1836c r6, boolean r7, int r8, int r9, int r10, int r11) {
        /*
            r4 = this;
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            g4.b r0 = (g4.InterfaceC1835b) r0
            g4.a r1 = r4.f26213a
            int r1 = r1.t()
            int r2 = r0.i()
            r3 = -1
            if (r2 == r3) goto L17
            int r1 = r0.i()
        L17:
            int r6 = r6.f41339g
            if (r1 == 0) goto L77
            r2 = 1
            if (r1 == r2) goto L49
            r2 = 2
            if (r1 == r2) goto L28
            r6 = 3
            if (r1 == r6) goto L77
            r6 = 4
            if (r1 == r6) goto L77
            goto L85
        L28:
            android.view.ViewGroup$LayoutParams r0 = r5.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            int r1 = r5.getMeasuredWidth()
            int r6 = r6 - r1
            int r1 = P.AbstractC0976s.b(r0)
            int r6 = r6 + r1
            int r0 = P.AbstractC0976s.a(r0)
            int r6 = r6 - r0
            int r6 = r6 / r2
            if (r7 != 0) goto L46
            int r8 = r8 + r6
        L41:
            int r10 = r10 + r6
        L42:
            r5.layout(r8, r9, r10, r11)
            goto L85
        L46:
            int r8 = r8 - r6
        L47:
            int r10 = r10 - r6
            goto L42
        L49:
            if (r7 != 0) goto L61
            int r8 = r8 + r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r8 - r7
            int r7 = r0.D()
            int r8 = r8 - r7
            int r10 = r10 + r6
            int r6 = r5.getMeasuredWidth()
            int r10 = r10 - r6
        L5c:
            int r6 = r0.D()
            goto L47
        L61:
            int r8 = r8 - r6
            int r7 = r5.getMeasuredWidth()
            int r8 = r8 + r7
            int r7 = r0.z()
            int r8 = r8 + r7
            int r10 = r10 - r6
            int r6 = r5.getMeasuredWidth()
            int r10 = r10 + r6
        L72:
            int r6 = r0.z()
            goto L41
        L77:
            if (r7 != 0) goto L7f
            int r6 = r0.z()
            int r8 = r8 + r6
            goto L72
        L7f:
            int r6 = r0.D()
            int r8 = r8 - r6
            goto L5c
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.a.J(android.view.View, g4.c, boolean, int, int, int, int):void");
    }

    public long K(int i9, int i10) {
        return (((long) i9) & 4294967295L) | (((long) i10) << 32);
    }

    public final void L(int i9, int i10, C1836c c1836c, int i11, int i12, boolean z9) {
        int i13;
        int i14;
        int iMax;
        int i15 = c1836c.f41337e;
        float f9 = c1836c.f41343k;
        float f10 = 0.0f;
        if (f9 <= 0.0f || i11 > i15) {
            return;
        }
        float f11 = (i15 - i11) / f9;
        c1836c.f41337e = i12 + c1836c.f41338f;
        if (!z9) {
            c1836c.f41339g = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z10 = false;
        int i17 = 0;
        float f12 = 0.0f;
        while (i16 < c1836c.f41340h) {
            int i18 = c1836c.f41347o + i16;
            View viewS = this.f26213a.s(i18);
            if (viewS == null || viewS.getVisibility() == 8) {
                i13 = i15;
                i14 = i16;
            } else {
                InterfaceC1835b interfaceC1835b = (InterfaceC1835b) viewS.getLayoutParams();
                int iF = this.f26213a.f();
                if (iF == 0 || iF == 1) {
                    i13 = i15;
                    int i19 = i16;
                    int measuredWidth = viewS.getMeasuredWidth();
                    long[] jArr = this.f26217e;
                    if (jArr != null) {
                        measuredWidth = r(jArr[i18]);
                    }
                    int measuredHeight = viewS.getMeasuredHeight();
                    long[] jArr2 = this.f26217e;
                    if (jArr2 != null) {
                        measuredHeight = q(jArr2[i18]);
                    }
                    if (this.f26214b[i18] || interfaceC1835b.j() <= 0.0f) {
                        i14 = i19;
                    } else {
                        float fJ = measuredWidth - (interfaceC1835b.j() * f11);
                        i14 = i19;
                        if (i14 == c1836c.f41340h - 1) {
                            fJ += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(fJ);
                        if (iRound < interfaceC1835b.l()) {
                            iRound = interfaceC1835b.l();
                            this.f26214b[i18] = true;
                            c1836c.f41343k -= interfaceC1835b.j();
                            z10 = true;
                        } else {
                            f12 += fJ - iRound;
                            double d9 = f12;
                            if (d9 > 1.0d) {
                                iRound++;
                                f12 -= 1.0f;
                            } else if (d9 < -1.0d) {
                                iRound--;
                                f12 += 1.0f;
                            }
                        }
                        int iS = s(i10, interfaceC1835b, c1836c.f41345m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewS.measure(iMakeMeasureSpec, iS);
                        int measuredWidth2 = viewS.getMeasuredWidth();
                        int measuredHeight2 = viewS.getMeasuredHeight();
                        Q(i18, iMakeMeasureSpec, iS, viewS);
                        this.f26213a.u(i18, viewS);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i17, measuredHeight + interfaceC1835b.n() + interfaceC1835b.y() + this.f26213a.p(viewS));
                    c1836c.f41337e += measuredWidth + interfaceC1835b.z() + interfaceC1835b.D();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewS.getMeasuredHeight();
                    long[] jArr3 = this.f26217e;
                    if (jArr3 != null) {
                        measuredHeight3 = q(jArr3[i18]);
                    }
                    int measuredWidth3 = viewS.getMeasuredWidth();
                    long[] jArr4 = this.f26217e;
                    if (jArr4 != null) {
                        measuredWidth3 = r(jArr4[i18]);
                    }
                    if (this.f26214b[i18] || interfaceC1835b.j() <= f10) {
                        i13 = i15;
                        i14 = i16;
                    } else {
                        float fJ2 = measuredHeight3 - (interfaceC1835b.j() * f11);
                        if (i16 == c1836c.f41340h - 1) {
                            fJ2 += f12;
                            f12 = 0.0f;
                        }
                        int iRound2 = Math.round(fJ2);
                        if (iRound2 < interfaceC1835b.E()) {
                            iRound2 = interfaceC1835b.E();
                            this.f26214b[i18] = true;
                            c1836c.f41343k -= interfaceC1835b.j();
                            i13 = i15;
                            i14 = i16;
                            z10 = true;
                        } else {
                            f12 += fJ2 - iRound2;
                            i13 = i15;
                            i14 = i16;
                            double d10 = f12;
                            if (d10 > 1.0d) {
                                iRound2++;
                                f12 -= 1.0f;
                            } else if (d10 < -1.0d) {
                                iRound2--;
                                f12 += 1.0f;
                            }
                        }
                        int iT = t(i9, interfaceC1835b, c1836c.f41345m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewS.measure(iT, iMakeMeasureSpec2);
                        measuredWidth3 = viewS.getMeasuredWidth();
                        int measuredHeight4 = viewS.getMeasuredHeight();
                        Q(i18, iT, iMakeMeasureSpec2, viewS);
                        this.f26213a.u(i18, viewS);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i17, measuredWidth3 + interfaceC1835b.z() + interfaceC1835b.D() + this.f26213a.p(viewS));
                    c1836c.f41337e += measuredHeight3 + interfaceC1835b.n() + interfaceC1835b.y();
                }
                c1836c.f41339g = Math.max(c1836c.f41339g, iMax);
                i17 = iMax;
            }
            i16 = i14 + 1;
            i15 = i13;
            f10 = 0.0f;
        }
        int i20 = i15;
        if (!z10 || i20 == c1836c.f41337e) {
            return;
        }
        L(i9, i10, c1836c, i11, i12, true);
    }

    public final void M(View view, int i9, int i10) {
        InterfaceC1835b interfaceC1835b = (InterfaceC1835b) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i9 - interfaceC1835b.z()) - interfaceC1835b.D()) - this.f26213a.p(view), interfaceC1835b.l()), interfaceC1835b.u());
        long[] jArr = this.f26217e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? q(jArr[i10]) : view.getMeasuredHeight(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec2, iMakeMeasureSpec);
        Q(i10, iMakeMeasureSpec2, iMakeMeasureSpec, view);
        this.f26213a.u(i10, view);
    }

    public final void N(View view, int i9, int i10) {
        InterfaceC1835b interfaceC1835b = (InterfaceC1835b) view.getLayoutParams();
        int iMin = Math.min(Math.max(((i9 - interfaceC1835b.n()) - interfaceC1835b.y()) - this.f26213a.p(view), interfaceC1835b.E()), interfaceC1835b.F());
        long[] jArr = this.f26217e;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(jArr != null ? r(jArr[i10]) : view.getMeasuredWidth(), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iMin, 1073741824);
        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        Q(i10, iMakeMeasureSpec, iMakeMeasureSpec2, view);
        this.f26213a.u(i10, view);
    }

    public void O() {
        P(0);
    }

    public void P(int i9) {
        View viewS;
        if (i9 >= this.f26213a.d()) {
            return;
        }
        int iF = this.f26213a.f();
        if (this.f26213a.t() != 4) {
            for (C1836c c1836c : this.f26213a.l()) {
                for (Integer num : c1836c.f41346n) {
                    View viewS2 = this.f26213a.s(num.intValue());
                    if (iF == 0 || iF == 1) {
                        N(viewS2, c1836c.f41339g, num.intValue());
                    } else {
                        if (iF != 2 && iF != 3) {
                            throw new IllegalArgumentException("Invalid flex direction: " + iF);
                        }
                        M(viewS2, c1836c.f41339g, num.intValue());
                    }
                }
            }
            return;
        }
        int[] iArr = this.f26215c;
        List listL = this.f26213a.l();
        int size = listL.size();
        for (int i10 = iArr != null ? iArr[i9] : 0; i10 < size; i10++) {
            C1836c c1836c2 = (C1836c) listL.get(i10);
            int i11 = c1836c2.f41340h;
            for (int i12 = 0; i12 < i11; i12++) {
                int i13 = c1836c2.f41347o + i12;
                if (i12 < this.f26213a.d() && (viewS = this.f26213a.s(i13)) != null && viewS.getVisibility() != 8) {
                    InterfaceC1835b interfaceC1835b = (InterfaceC1835b) viewS.getLayoutParams();
                    if (interfaceC1835b.i() == -1 || interfaceC1835b.i() == 4) {
                        if (iF == 0 || iF == 1) {
                            N(viewS, c1836c2.f41339g, i13);
                        } else {
                            if (iF != 2 && iF != 3) {
                                throw new IllegalArgumentException("Invalid flex direction: " + iF);
                            }
                            M(viewS, c1836c2.f41339g, i13);
                        }
                    }
                }
            }
        }
    }

    public final void Q(int i9, int i10, int i11, View view) {
        long[] jArr = this.f26216d;
        if (jArr != null) {
            jArr[i9] = K(i10, i11);
        }
        long[] jArr2 = this.f26217e;
        if (jArr2 != null) {
            jArr2[i9] = K(view.getMeasuredWidth(), view.getMeasuredHeight());
        }
    }

    public final void a(List list, C1836c c1836c, int i9, int i10) {
        c1836c.f41345m = i10;
        this.f26213a.a(c1836c);
        c1836c.f41348p = i9;
        list.add(c1836c);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(com.google.android.flexbox.a.C0251a r32, int r33, int r34, int r35, int r36, int r37, java.util.List r38) {
        /*
            Method dump skipped, instruction units count: 850
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.a.b(com.google.android.flexbox.a$a, int, int, int, int, int, java.util.List):void");
    }

    public void c(C0251a c0251a, int i9, int i10, int i11, int i12, List list) {
        b(c0251a, i9, i10, i11, i12, -1, list);
    }

    public void d(C0251a c0251a, int i9, int i10, int i11, int i12, List list) {
        b(c0251a, i9, i10, i11, 0, i12, list);
    }

    public void e(C0251a c0251a, int i9, int i10, int i11, int i12, List list) {
        b(c0251a, i10, i9, i11, i12, -1, list);
    }

    public void f(C0251a c0251a, int i9, int i10, int i11, int i12, List list) {
        b(c0251a, i10, i9, i11, 0, i12, list);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.view.View r7, int r8) {
        /*
            r6 = this;
            android.view.ViewGroup$LayoutParams r0 = r7.getLayoutParams()
            g4.b r0 = (g4.InterfaceC1835b) r0
            int r1 = r7.getMeasuredWidth()
            int r2 = r7.getMeasuredHeight()
            int r3 = r0.l()
            r4 = 1
            if (r1 >= r3) goto L1b
            int r1 = r0.l()
        L19:
            r3 = 1
            goto L27
        L1b:
            int r3 = r0.u()
            if (r1 <= r3) goto L26
            int r1 = r0.u()
            goto L19
        L26:
            r3 = 0
        L27:
            int r5 = r0.E()
            if (r2 >= r5) goto L32
            int r2 = r0.E()
            goto L3e
        L32:
            int r5 = r0.F()
            if (r2 <= r5) goto L3d
            int r2 = r0.F()
            goto L3e
        L3d:
            r4 = r3
        L3e:
            if (r4 == 0) goto L55
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r0)
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r0)
            r7.measure(r1, r0)
            r6.Q(r8, r1, r0, r7)
            g4.a r0 = r6.f26213a
            r0.u(r8, r7)
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.a.g(android.view.View, int):void");
    }

    public void h(List list, int i9) {
        int i10 = this.f26215c[i9];
        if (i10 == -1) {
            i10 = 0;
        }
        if (list.size() > i10) {
            list.subList(i10, list.size()).clear();
        }
        int[] iArr = this.f26215c;
        int length = iArr.length - 1;
        if (i9 > length) {
            Arrays.fill(iArr, -1);
        } else {
            Arrays.fill(iArr, i9, length, -1);
        }
        long[] jArr = this.f26216d;
        int length2 = jArr.length - 1;
        if (i9 > length2) {
            Arrays.fill(jArr, 0L);
        } else {
            Arrays.fill(jArr, i9, length2, 0L);
        }
    }

    public void i(int i9, int i10) {
        j(i9, i10, 0);
    }

    public void j(int i9, int i10, int i11) {
        int size;
        int iO;
        int iK;
        k(this.f26213a.d());
        if (i11 >= this.f26213a.d()) {
            return;
        }
        int iF = this.f26213a.f();
        int iF2 = this.f26213a.f();
        if (iF2 == 0 || iF2 == 1) {
            int mode = View.MeasureSpec.getMode(i9);
            size = View.MeasureSpec.getSize(i9);
            int iH = this.f26213a.h();
            if (mode != 1073741824) {
                size = Math.min(iH, size);
            }
            iO = this.f26213a.o();
            iK = this.f26213a.k();
        } else {
            if (iF2 != 2 && iF2 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + iF);
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            size = View.MeasureSpec.getSize(i10);
            if (mode2 != 1073741824) {
                size = this.f26213a.h();
            }
            iO = this.f26213a.n();
            iK = this.f26213a.b();
        }
        int i12 = iO + iK;
        int[] iArr = this.f26215c;
        List listL = this.f26213a.l();
        int size2 = listL.size();
        for (int i13 = iArr != null ? iArr[i11] : 0; i13 < size2; i13++) {
            C1836c c1836c = (C1836c) listL.get(i13);
            int i14 = c1836c.f41337e;
            if (i14 < size && c1836c.f41349q) {
                p(i9, i10, c1836c, size, i12, false);
            } else if (i14 > size && c1836c.f41350r) {
                L(i9, i10, c1836c, size, i12, false);
            }
        }
    }

    public final void k(int i9) {
        boolean[] zArr = this.f26214b;
        if (zArr == null) {
            this.f26214b = new boolean[Math.max(i9, 10)];
        } else if (zArr.length < i9) {
            this.f26214b = new boolean[Math.max(zArr.length * 2, i9)];
        } else {
            Arrays.fill(zArr, false);
        }
    }

    public void l(int i9) {
        int[] iArr = this.f26215c;
        if (iArr == null) {
            this.f26215c = new int[Math.max(i9, 10)];
        } else if (iArr.length < i9) {
            this.f26215c = Arrays.copyOf(this.f26215c, Math.max(iArr.length * 2, i9));
        }
    }

    public void m(int i9) {
        long[] jArr = this.f26216d;
        if (jArr == null) {
            this.f26216d = new long[Math.max(i9, 10)];
        } else if (jArr.length < i9) {
            this.f26216d = Arrays.copyOf(this.f26216d, Math.max(jArr.length * 2, i9));
        }
    }

    public void n(int i9) {
        long[] jArr = this.f26217e;
        if (jArr == null) {
            this.f26217e = new long[Math.max(i9, 10)];
        } else if (jArr.length < i9) {
            this.f26217e = Arrays.copyOf(this.f26217e, Math.max(jArr.length * 2, i9));
        }
    }

    public final void o(CompoundButton compoundButton) {
        InterfaceC1835b interfaceC1835b = (InterfaceC1835b) compoundButton.getLayoutParams();
        int iL = interfaceC1835b.l();
        int iE = interfaceC1835b.E();
        Drawable drawableA = c.a(compoundButton);
        int minimumWidth = drawableA == null ? 0 : drawableA.getMinimumWidth();
        int minimumHeight = drawableA != null ? drawableA.getMinimumHeight() : 0;
        if (iL == -1) {
            iL = minimumWidth;
        }
        interfaceC1835b.setMinWidth(iL);
        if (iE == -1) {
            iE = minimumHeight;
        }
        interfaceC1835b.o(iE);
    }

    public final void p(int i9, int i10, C1836c c1836c, int i11, int i12, boolean z9) {
        int i13;
        int i14;
        int iMax;
        double d9;
        int i15;
        double d10;
        float f9 = c1836c.f41342j;
        float f10 = 0.0f;
        if (f9 <= 0.0f || i11 < (i13 = c1836c.f41337e)) {
            return;
        }
        float f11 = (i11 - i13) / f9;
        c1836c.f41337e = i12 + c1836c.f41338f;
        if (!z9) {
            c1836c.f41339g = Integer.MIN_VALUE;
        }
        int i16 = 0;
        boolean z10 = false;
        int i17 = 0;
        float f12 = 0.0f;
        while (i16 < c1836c.f41340h) {
            int i18 = c1836c.f41347o + i16;
            View viewS = this.f26213a.s(i18);
            if (viewS == null || viewS.getVisibility() == 8) {
                i14 = i13;
            } else {
                InterfaceC1835b interfaceC1835b = (InterfaceC1835b) viewS.getLayoutParams();
                int iF = this.f26213a.f();
                if (iF == 0 || iF == 1) {
                    int i19 = i13;
                    int measuredWidth = viewS.getMeasuredWidth();
                    long[] jArr = this.f26217e;
                    if (jArr != null) {
                        measuredWidth = r(jArr[i18]);
                    }
                    int measuredHeight = viewS.getMeasuredHeight();
                    long[] jArr2 = this.f26217e;
                    i14 = i19;
                    if (jArr2 != null) {
                        measuredHeight = q(jArr2[i18]);
                    }
                    if (!this.f26214b[i18] && interfaceC1835b.p() > 0.0f) {
                        float fP = measuredWidth + (interfaceC1835b.p() * f11);
                        if (i16 == c1836c.f41340h - 1) {
                            fP += f12;
                            f12 = 0.0f;
                        }
                        int iRound = Math.round(fP);
                        if (iRound > interfaceC1835b.u()) {
                            iRound = interfaceC1835b.u();
                            this.f26214b[i18] = true;
                            c1836c.f41342j -= interfaceC1835b.p();
                            z10 = true;
                        } else {
                            f12 += fP - iRound;
                            double d11 = f12;
                            if (d11 > 1.0d) {
                                iRound++;
                                d9 = d11 - 1.0d;
                            } else if (d11 < -1.0d) {
                                iRound--;
                                d9 = d11 + 1.0d;
                            }
                            f12 = (float) d9;
                        }
                        int iS = s(i10, interfaceC1835b, c1836c.f41345m);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iRound, 1073741824);
                        viewS.measure(iMakeMeasureSpec, iS);
                        int measuredWidth2 = viewS.getMeasuredWidth();
                        int measuredHeight2 = viewS.getMeasuredHeight();
                        Q(i18, iMakeMeasureSpec, iS, viewS);
                        this.f26213a.u(i18, viewS);
                        measuredWidth = measuredWidth2;
                        measuredHeight = measuredHeight2;
                    }
                    int iMax2 = Math.max(i17, measuredHeight + interfaceC1835b.n() + interfaceC1835b.y() + this.f26213a.p(viewS));
                    c1836c.f41337e += measuredWidth + interfaceC1835b.z() + interfaceC1835b.D();
                    iMax = iMax2;
                } else {
                    int measuredHeight3 = viewS.getMeasuredHeight();
                    long[] jArr3 = this.f26217e;
                    if (jArr3 != null) {
                        measuredHeight3 = q(jArr3[i18]);
                    }
                    int measuredWidth3 = viewS.getMeasuredWidth();
                    long[] jArr4 = this.f26217e;
                    if (jArr4 != null) {
                        measuredWidth3 = r(jArr4[i18]);
                    }
                    if (this.f26214b[i18] || interfaceC1835b.p() <= f10) {
                        i15 = i13;
                    } else {
                        float fP2 = measuredHeight3 + (interfaceC1835b.p() * f11);
                        if (i16 == c1836c.f41340h - 1) {
                            fP2 += f12;
                            f12 = 0.0f;
                        }
                        int iRound2 = Math.round(fP2);
                        if (iRound2 > interfaceC1835b.F()) {
                            iRound2 = interfaceC1835b.F();
                            this.f26214b[i18] = true;
                            c1836c.f41342j -= interfaceC1835b.p();
                            i15 = i13;
                            z10 = true;
                        } else {
                            f12 += fP2 - iRound2;
                            i15 = i13;
                            double d12 = f12;
                            if (d12 > 1.0d) {
                                iRound2++;
                                d10 = d12 - 1.0d;
                            } else if (d12 < -1.0d) {
                                iRound2--;
                                d10 = d12 + 1.0d;
                            }
                            f12 = (float) d10;
                        }
                        int iT = t(i9, interfaceC1835b, c1836c.f41345m);
                        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(iRound2, 1073741824);
                        viewS.measure(iT, iMakeMeasureSpec2);
                        measuredWidth3 = viewS.getMeasuredWidth();
                        int measuredHeight4 = viewS.getMeasuredHeight();
                        Q(i18, iT, iMakeMeasureSpec2, viewS);
                        this.f26213a.u(i18, viewS);
                        measuredHeight3 = measuredHeight4;
                    }
                    iMax = Math.max(i17, measuredWidth3 + interfaceC1835b.z() + interfaceC1835b.D() + this.f26213a.p(viewS));
                    c1836c.f41337e += measuredHeight3 + interfaceC1835b.n() + interfaceC1835b.y();
                    i14 = i15;
                }
                c1836c.f41339g = Math.max(c1836c.f41339g, iMax);
                i17 = iMax;
            }
            i16++;
            i13 = i14;
            f10 = 0.0f;
        }
        int i20 = i13;
        if (!z10 || i20 == c1836c.f41337e) {
            return;
        }
        p(i9, i10, c1836c, i11, i12, true);
    }

    public int q(long j9) {
        return (int) (j9 >> 32);
    }

    public int r(long j9) {
        return (int) j9;
    }

    public final int s(int i9, InterfaceC1835b interfaceC1835b, int i10) {
        int iE;
        InterfaceC1834a interfaceC1834a = this.f26213a;
        int iM = interfaceC1834a.m(i9, interfaceC1834a.n() + this.f26213a.b() + interfaceC1835b.n() + interfaceC1835b.y() + i10, interfaceC1835b.getHeight());
        int size = View.MeasureSpec.getSize(iM);
        if (size > interfaceC1835b.F()) {
            iE = interfaceC1835b.F();
        } else {
            if (size >= interfaceC1835b.E()) {
                return iM;
            }
            iE = interfaceC1835b.E();
        }
        return View.MeasureSpec.makeMeasureSpec(iE, View.MeasureSpec.getMode(iM));
    }

    public final int t(int i9, InterfaceC1835b interfaceC1835b, int i10) {
        int iL;
        InterfaceC1834a interfaceC1834a = this.f26213a;
        int i11 = interfaceC1834a.i(i9, interfaceC1834a.o() + this.f26213a.k() + interfaceC1835b.z() + interfaceC1835b.D() + i10, interfaceC1835b.getWidth());
        int size = View.MeasureSpec.getSize(i11);
        if (size > interfaceC1835b.u()) {
            iL = interfaceC1835b.u();
        } else {
            if (size >= interfaceC1835b.l()) {
                return i11;
            }
            iL = interfaceC1835b.l();
        }
        return View.MeasureSpec.makeMeasureSpec(iL, View.MeasureSpec.getMode(i11));
    }

    public final int u(InterfaceC1835b interfaceC1835b, boolean z9) {
        return z9 ? interfaceC1835b.y() : interfaceC1835b.D();
    }

    public final int v(InterfaceC1835b interfaceC1835b, boolean z9) {
        return z9 ? interfaceC1835b.D() : interfaceC1835b.y();
    }

    public final int w(InterfaceC1835b interfaceC1835b, boolean z9) {
        return z9 ? interfaceC1835b.n() : interfaceC1835b.z();
    }

    public final int x(InterfaceC1835b interfaceC1835b, boolean z9) {
        return z9 ? interfaceC1835b.z() : interfaceC1835b.n();
    }

    public final int y(InterfaceC1835b interfaceC1835b, boolean z9) {
        return z9 ? interfaceC1835b.getHeight() : interfaceC1835b.getWidth();
    }

    public final int z(InterfaceC1835b interfaceC1835b, boolean z9) {
        return z9 ? interfaceC1835b.getWidth() : interfaceC1835b.getHeight();
    }
}
