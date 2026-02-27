package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class a implements i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public O.e f16884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f16885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f16886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC0190a f16887d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f16888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f16889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f16890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f16891h;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.a$a, reason: collision with other inner class name */
    public interface InterfaceC0190a {
        void a(int i9, int i10);

        void b(b bVar);

        void c(b bVar);

        void d(int i9, int i10);

        void e(int i9, int i10, Object obj);

        RecyclerView.D f(int i9);

        void g(int i9, int i10);

        void h(int i9, int i10);
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f16892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f16893b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f16894c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f16895d;

        public b(int i9, int i10, int i11, Object obj) {
            this.f16892a = i9;
            this.f16893b = i10;
            this.f16895d = i11;
            this.f16894c = obj;
        }

        public String a() {
            int i9 = this.f16892a;
            return i9 != 1 ? i9 != 2 ? i9 != 4 ? i9 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i9 = this.f16892a;
            if (i9 != bVar.f16892a) {
                return false;
            }
            if (i9 == 8 && Math.abs(this.f16895d - this.f16893b) == 1 && this.f16895d == bVar.f16893b && this.f16893b == bVar.f16895d) {
                return true;
            }
            if (this.f16895d != bVar.f16895d || this.f16893b != bVar.f16893b) {
                return false;
            }
            Object obj2 = this.f16894c;
            Object obj3 = bVar.f16894c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f16892a * 31) + this.f16893b) * 31) + this.f16895d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f16893b + "c:" + this.f16895d + ",p:" + this.f16894c + "]";
        }
    }

    public a(InterfaceC0190a interfaceC0190a) {
        this(interfaceC0190a, false);
    }

    public a(InterfaceC0190a interfaceC0190a, boolean z9) {
        this.f16884a = new O.f(30);
        this.f16885b = new ArrayList();
        this.f16886c = new ArrayList();
        this.f16891h = 0;
        this.f16887d = interfaceC0190a;
        this.f16889f = z9;
        this.f16890g = new i(this);
    }

    @Override // androidx.recyclerview.widget.i.a
    public b a(int i9, int i10, int i11, Object obj) {
        b bVar = (b) this.f16884a.b();
        if (bVar == null) {
            return new b(i9, i10, i11, obj);
        }
        bVar.f16892a = i9;
        bVar.f16893b = i10;
        bVar.f16895d = i11;
        bVar.f16894c = obj;
        return bVar;
    }

    @Override // androidx.recyclerview.widget.i.a
    public void b(b bVar) {
        if (this.f16889f) {
            return;
        }
        bVar.f16894c = null;
        this.f16884a.a(bVar);
    }

    public final void c(b bVar) {
        u(bVar);
    }

    public final void d(b bVar) {
        u(bVar);
    }

    public int e(int i9) {
        int size = this.f16885b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f16885b.get(i10);
            int i11 = bVar.f16892a;
            if (i11 != 1) {
                if (i11 == 2) {
                    int i12 = bVar.f16893b;
                    if (i12 <= i9) {
                        int i13 = bVar.f16895d;
                        if (i12 + i13 > i9) {
                            return -1;
                        }
                        i9 -= i13;
                    } else {
                        continue;
                    }
                } else if (i11 == 8) {
                    int i14 = bVar.f16893b;
                    if (i14 == i9) {
                        i9 = bVar.f16895d;
                    } else {
                        if (i14 < i9) {
                            i9--;
                        }
                        if (bVar.f16895d <= i9) {
                            i9++;
                        }
                    }
                }
            } else if (bVar.f16893b <= i9) {
                i9 += bVar.f16895d;
            }
        }
        return i9;
    }

    public final void f(b bVar) {
        boolean z9;
        byte b9;
        int i9 = bVar.f16893b;
        int i10 = bVar.f16895d + i9;
        byte b10 = -1;
        int i11 = i9;
        int i12 = 0;
        while (i11 < i10) {
            if (this.f16887d.f(i11) != null || h(i11)) {
                if (b10 == 0) {
                    k(a(2, i9, i12, null));
                    z9 = true;
                } else {
                    z9 = false;
                }
                b9 = 1;
            } else {
                if (b10 == 1) {
                    u(a(2, i9, i12, null));
                    z9 = true;
                } else {
                    z9 = false;
                }
                b9 = 0;
            }
            if (z9) {
                i11 -= i12;
                i10 -= i12;
                i12 = 1;
            } else {
                i12++;
            }
            i11++;
            b10 = b9;
        }
        if (i12 != bVar.f16895d) {
            b(bVar);
            bVar = a(2, i9, i12, null);
        }
        if (b10 == 0) {
            k(bVar);
        } else {
            u(bVar);
        }
    }

    public final void g(b bVar) {
        int i9 = bVar.f16893b;
        int i10 = bVar.f16895d + i9;
        int i11 = i9;
        byte b9 = -1;
        int i12 = 0;
        while (i9 < i10) {
            if (this.f16887d.f(i9) != null || h(i9)) {
                if (b9 == 0) {
                    k(a(4, i11, i12, bVar.f16894c));
                    i11 = i9;
                    i12 = 0;
                }
                b9 = 1;
            } else {
                if (b9 == 1) {
                    u(a(4, i11, i12, bVar.f16894c));
                    i11 = i9;
                    i12 = 0;
                }
                b9 = 0;
            }
            i12++;
            i9++;
        }
        if (i12 != bVar.f16895d) {
            Object obj = bVar.f16894c;
            b(bVar);
            bVar = a(4, i11, i12, obj);
        }
        if (b9 == 0) {
            k(bVar);
        } else {
            u(bVar);
        }
    }

    public final boolean h(int i9) {
        int size = this.f16886c.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = (b) this.f16886c.get(i10);
            int i11 = bVar.f16892a;
            if (i11 == 8) {
                if (n(bVar.f16895d, i10 + 1) == i9) {
                    return true;
                }
            } else if (i11 == 1) {
                int i12 = bVar.f16893b;
                int i13 = bVar.f16895d + i12;
                while (i12 < i13) {
                    if (n(i12, i10 + 1) == i9) {
                        return true;
                    }
                    i12++;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    public void i() {
        int size = this.f16886c.size();
        for (int i9 = 0; i9 < size; i9++) {
            this.f16887d.c((b) this.f16886c.get(i9));
        }
        w(this.f16886c);
        this.f16891h = 0;
    }

    public void j() {
        i();
        int size = this.f16885b.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) this.f16885b.get(i9);
            int i10 = bVar.f16892a;
            if (i10 == 1) {
                this.f16887d.c(bVar);
                this.f16887d.g(bVar.f16893b, bVar.f16895d);
            } else if (i10 == 2) {
                this.f16887d.c(bVar);
                this.f16887d.h(bVar.f16893b, bVar.f16895d);
            } else if (i10 == 4) {
                this.f16887d.c(bVar);
                this.f16887d.e(bVar.f16893b, bVar.f16895d, bVar.f16894c);
            } else if (i10 == 8) {
                this.f16887d.c(bVar);
                this.f16887d.a(bVar.f16893b, bVar.f16895d);
            }
            Runnable runnable = this.f16888e;
            if (runnable != null) {
                runnable.run();
            }
        }
        w(this.f16885b);
        this.f16891h = 0;
    }

    public final void k(b bVar) {
        int i9;
        int i10 = bVar.f16892a;
        if (i10 == 1 || i10 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int iY = y(bVar.f16893b, i10);
        int i11 = bVar.f16893b;
        int i12 = bVar.f16892a;
        if (i12 == 2) {
            i9 = 0;
        } else {
            if (i12 != 4) {
                throw new IllegalArgumentException("op should be remove or update." + bVar);
            }
            i9 = 1;
        }
        int i13 = 1;
        for (int i14 = 1; i14 < bVar.f16895d; i14++) {
            int iY2 = y(bVar.f16893b + (i9 * i14), bVar.f16892a);
            int i15 = bVar.f16892a;
            if (i15 == 2 ? iY2 != iY : !(i15 == 4 && iY2 == iY + 1)) {
                b bVarA = a(i15, iY, i13, bVar.f16894c);
                l(bVarA, i11);
                b(bVarA);
                if (bVar.f16892a == 4) {
                    i11 += i13;
                }
                iY = iY2;
                i13 = 1;
            } else {
                i13++;
            }
        }
        Object obj = bVar.f16894c;
        b(bVar);
        if (i13 > 0) {
            b bVarA2 = a(bVar.f16892a, iY, i13, obj);
            l(bVarA2, i11);
            b(bVarA2);
        }
    }

    public void l(b bVar, int i9) {
        this.f16887d.b(bVar);
        int i10 = bVar.f16892a;
        if (i10 == 2) {
            this.f16887d.h(i9, bVar.f16895d);
        } else {
            if (i10 != 4) {
                throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
            }
            this.f16887d.e(i9, bVar.f16895d, bVar.f16894c);
        }
    }

    public int m(int i9) {
        return n(i9, 0);
    }

    public int n(int i9, int i10) {
        int size = this.f16886c.size();
        while (i10 < size) {
            b bVar = (b) this.f16886c.get(i10);
            int i11 = bVar.f16892a;
            if (i11 == 8) {
                int i12 = bVar.f16893b;
                if (i12 == i9) {
                    i9 = bVar.f16895d;
                } else {
                    if (i12 < i9) {
                        i9--;
                    }
                    if (bVar.f16895d <= i9) {
                        i9++;
                    }
                }
            } else {
                int i13 = bVar.f16893b;
                if (i13 > i9) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = bVar.f16895d;
                    if (i9 < i13 + i14) {
                        return -1;
                    }
                    i9 -= i14;
                } else if (i11 == 1) {
                    i9 += bVar.f16895d;
                }
            }
            i10++;
        }
        return i9;
    }

    public boolean o(int i9) {
        return (i9 & this.f16891h) != 0;
    }

    public boolean p() {
        return this.f16885b.size() > 0;
    }

    public boolean q() {
        return (this.f16886c.isEmpty() || this.f16885b.isEmpty()) ? false : true;
    }

    public boolean r(int i9, int i10, Object obj) {
        if (i10 < 1) {
            return false;
        }
        this.f16885b.add(a(4, i9, i10, obj));
        this.f16891h |= 4;
        return this.f16885b.size() == 1;
    }

    public boolean s(int i9, int i10, int i11) {
        if (i9 == i10) {
            return false;
        }
        if (i11 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f16885b.add(a(8, i9, i10, null));
        this.f16891h |= 8;
        return this.f16885b.size() == 1;
    }

    public boolean t(int i9, int i10) {
        if (i10 < 1) {
            return false;
        }
        this.f16885b.add(a(2, i9, i10, null));
        this.f16891h |= 2;
        return this.f16885b.size() == 1;
    }

    public final void u(b bVar) {
        this.f16886c.add(bVar);
        int i9 = bVar.f16892a;
        if (i9 == 1) {
            this.f16887d.g(bVar.f16893b, bVar.f16895d);
            return;
        }
        if (i9 == 2) {
            this.f16887d.d(bVar.f16893b, bVar.f16895d);
            return;
        }
        if (i9 == 4) {
            this.f16887d.e(bVar.f16893b, bVar.f16895d, bVar.f16894c);
        } else {
            if (i9 == 8) {
                this.f16887d.a(bVar.f16893b, bVar.f16895d);
                return;
            }
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public void v() {
        this.f16890g.b(this.f16885b);
        int size = this.f16885b.size();
        for (int i9 = 0; i9 < size; i9++) {
            b bVar = (b) this.f16885b.get(i9);
            int i10 = bVar.f16892a;
            if (i10 == 1) {
                c(bVar);
            } else if (i10 == 2) {
                f(bVar);
            } else if (i10 == 4) {
                g(bVar);
            } else if (i10 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f16888e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f16885b.clear();
    }

    public void w(List list) {
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            b((b) list.get(i9));
        }
        list.clear();
    }

    public void x() {
        w(this.f16885b);
        w(this.f16886c);
        this.f16891h = 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int y(int r9, int r10) {
        /*
            r8 = this;
            java.util.ArrayList r0 = r8.f16886c
            int r0 = r0.size()
            r1 = 1
            int r0 = r0 - r1
        L8:
            r2 = 8
            if (r0 < 0) goto L7d
            java.util.ArrayList r3 = r8.f16886c
            java.lang.Object r3 = r3.get(r0)
            androidx.recyclerview.widget.a$b r3 = (androidx.recyclerview.widget.a.b) r3
            int r4 = r3.f16892a
            r5 = 2
            if (r4 != r2) goto L5e
            int r2 = r3.f16893b
            int r4 = r3.f16895d
            if (r2 >= r4) goto L22
            r6 = r2
            r7 = r4
            goto L24
        L22:
            r7 = r2
            r6 = r4
        L24:
            if (r9 < r6) goto L48
            if (r9 > r7) goto L48
            if (r6 != r2) goto L39
            if (r10 != r1) goto L31
            int r4 = r4 + 1
        L2e:
            r3.f16895d = r4
            goto L36
        L31:
            if (r10 != r5) goto L36
            int r4 = r4 + (-1)
            goto L2e
        L36:
            int r9 = r9 + 1
            goto L7a
        L39:
            if (r10 != r1) goto L40
            int r2 = r2 + 1
        L3d:
            r3.f16893b = r2
            goto L45
        L40:
            if (r10 != r5) goto L45
            int r2 = r2 + (-1)
            goto L3d
        L45:
            int r9 = r9 + (-1)
            goto L7a
        L48:
            if (r9 >= r2) goto L7a
            if (r10 != r1) goto L55
            int r2 = r2 + 1
            r3.f16893b = r2
            int r4 = r4 + 1
        L52:
            r3.f16895d = r4
            goto L7a
        L55:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            r3.f16893b = r2
            int r4 = r4 + (-1)
            goto L52
        L5e:
            int r2 = r3.f16893b
            if (r2 > r9) goto L6e
            if (r4 != r1) goto L68
            int r2 = r3.f16895d
            int r9 = r9 - r2
            goto L7a
        L68:
            if (r4 != r5) goto L7a
            int r2 = r3.f16895d
            int r9 = r9 + r2
            goto L7a
        L6e:
            if (r10 != r1) goto L75
            int r2 = r2 + 1
        L72:
            r3.f16893b = r2
            goto L7a
        L75:
            if (r10 != r5) goto L7a
            int r2 = r2 + (-1)
            goto L72
        L7a:
            int r0 = r0 + (-1)
            goto L8
        L7d:
            java.util.ArrayList r10 = r8.f16886c
            int r10 = r10.size()
            int r10 = r10 - r1
        L84:
            if (r10 < 0) goto Lab
            java.util.ArrayList r0 = r8.f16886c
            java.lang.Object r0 = r0.get(r10)
            androidx.recyclerview.widget.a$b r0 = (androidx.recyclerview.widget.a.b) r0
            int r1 = r0.f16892a
            if (r1 != r2) goto La3
            int r1 = r0.f16895d
            int r3 = r0.f16893b
            if (r1 == r3) goto L9a
            if (r1 >= 0) goto La8
        L9a:
            java.util.ArrayList r1 = r8.f16886c
            r1.remove(r10)
            r8.b(r0)
            goto La8
        La3:
            int r1 = r0.f16895d
            if (r1 > 0) goto La8
            goto L9a
        La8:
            int r10 = r10 + (-1)
            goto L84
        Lab:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.a.y(int, int):int");
    }
}
