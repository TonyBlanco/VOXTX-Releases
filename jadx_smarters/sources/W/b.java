package W;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    public interface a {
        void a(Object obj, Rect rect);
    }

    /* JADX INFO: renamed from: W.b$b, reason: collision with other inner class name */
    public interface InterfaceC0131b {
        Object a(Object obj, int i9);

        int b(Object obj);
    }

    public static class c implements Comparator {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Rect f10169a = new Rect();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Rect f10170c = new Rect();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f10171d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f10172e;

        public c(boolean z9, a aVar) {
            this.f10171d = z9;
            this.f10172e = aVar;
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            Rect rect = this.f10169a;
            Rect rect2 = this.f10170c;
            this.f10172e.a(obj, rect);
            this.f10172e.a(obj2, rect2);
            int i9 = rect.top;
            int i10 = rect2.top;
            if (i9 < i10) {
                return -1;
            }
            if (i9 > i10) {
                return 1;
            }
            int i11 = rect.left;
            int i12 = rect2.left;
            if (i11 < i12) {
                return this.f10171d ? 1 : -1;
            }
            if (i11 > i12) {
                return this.f10171d ? -1 : 1;
            }
            int i13 = rect.bottom;
            int i14 = rect2.bottom;
            if (i13 < i14) {
                return -1;
            }
            if (i13 > i14) {
                return 1;
            }
            int i15 = rect.right;
            int i16 = rect2.right;
            if (i15 < i16) {
                return this.f10171d ? 1 : -1;
            }
            if (i15 > i16) {
                return this.f10171d ? -1 : 1;
            }
            return 0;
        }
    }

    public static boolean a(int i9, Rect rect, Rect rect2, Rect rect3) {
        boolean zB = b(i9, rect, rect2);
        if (b(i9, rect, rect3) || !zB) {
            return false;
        }
        return !j(i9, rect, rect3) || i9 == 17 || i9 == 66 || k(i9, rect, rect2) < m(i9, rect, rect3);
    }

    public static boolean b(int i9, Rect rect, Rect rect2) {
        if (i9 != 17) {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object c(java.lang.Object r7, W.b.InterfaceC0131b r8, W.b.a r9, java.lang.Object r10, android.graphics.Rect r11, int r12) {
        /*
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>(r11)
            r1 = 17
            r2 = 0
            if (r12 == r1) goto L3b
            r1 = 33
            if (r12 == r1) goto L34
            r1 = 66
            if (r12 == r1) goto L29
            r1 = 130(0x82, float:1.82E-43)
            if (r12 != r1) goto L21
            int r1 = r11.height()
            int r1 = r1 + 1
            int r1 = -r1
        L1d:
            r0.offset(r2, r1)
            goto L42
        L21:
            java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
            java.lang.String r8 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r7.<init>(r8)
            throw r7
        L29:
            int r1 = r11.width()
            int r1 = r1 + 1
            int r1 = -r1
        L30:
            r0.offset(r1, r2)
            goto L42
        L34:
            int r1 = r11.height()
            int r1 = r1 + 1
            goto L1d
        L3b:
            int r1 = r11.width()
            int r1 = r1 + 1
            goto L30
        L42:
            int r1 = r8.b(r7)
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4 = 0
        L4c:
            if (r2 >= r1) goto L65
            java.lang.Object r5 = r8.a(r7, r2)
            if (r5 != r10) goto L55
            goto L62
        L55:
            r9.a(r5, r3)
            boolean r6 = h(r12, r11, r3, r0)
            if (r6 == 0) goto L62
            r0.set(r3)
            r4 = r5
        L62:
            int r2 = r2 + 1
            goto L4c
        L65:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: W.b.c(java.lang.Object, W.b$b, W.b$a, java.lang.Object, android.graphics.Rect, int):java.lang.Object");
    }

    public static Object d(Object obj, InterfaceC0131b interfaceC0131b, a aVar, Object obj2, int i9, boolean z9, boolean z10) {
        int iB = interfaceC0131b.b(obj);
        ArrayList arrayList = new ArrayList(iB);
        for (int i10 = 0; i10 < iB; i10++) {
            arrayList.add(interfaceC0131b.a(obj, i10));
        }
        Collections.sort(arrayList, new c(z9, aVar));
        if (i9 == 1) {
            return f(obj2, arrayList, z10);
        }
        if (i9 == 2) {
            return e(obj2, arrayList, z10);
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
    }

    public static Object e(Object obj, ArrayList arrayList, boolean z9) {
        int size = arrayList.size();
        int iLastIndexOf = (obj == null ? -1 : arrayList.lastIndexOf(obj)) + 1;
        if (iLastIndexOf < size) {
            return arrayList.get(iLastIndexOf);
        }
        if (!z9 || size <= 0) {
            return null;
        }
        return arrayList.get(0);
    }

    public static Object f(Object obj, ArrayList arrayList, boolean z9) {
        int size = arrayList.size();
        int iIndexOf = (obj == null ? size : arrayList.indexOf(obj)) - 1;
        if (iIndexOf >= 0) {
            return arrayList.get(iIndexOf);
        }
        if (!z9 || size <= 0) {
            return null;
        }
        return arrayList.get(size - 1);
    }

    public static int g(int i9, int i10) {
        return (i9 * 13 * i9) + (i10 * i10);
    }

    public static boolean h(int i9, Rect rect, Rect rect2, Rect rect3) {
        if (!i(rect, rect2, i9)) {
            return false;
        }
        if (i(rect, rect3, i9) && !a(i9, rect, rect2, rect3)) {
            return !a(i9, rect, rect3, rect2) && g(k(i9, rect, rect2), o(i9, rect, rect2)) < g(k(i9, rect, rect3), o(i9, rect, rect3));
        }
        return true;
    }

    public static boolean i(Rect rect, Rect rect2, int i9) {
        if (i9 == 17) {
            int i10 = rect.right;
            int i11 = rect2.right;
            return (i10 > i11 || rect.left >= i11) && rect.left > rect2.left;
        }
        if (i9 == 33) {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            return (i12 > i13 || rect.top >= i13) && rect.top > rect2.top;
        }
        if (i9 == 66) {
            int i14 = rect.left;
            int i15 = rect2.left;
            return (i14 < i15 || rect.right <= i15) && rect.right < rect2.right;
        }
        if (i9 != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i16 = rect.top;
        int i17 = rect2.top;
        return (i16 < i17 || rect.bottom <= i17) && rect.bottom < rect2.bottom;
    }

    public static boolean j(int i9, Rect rect, Rect rect2) {
        if (i9 == 17) {
            return rect.left >= rect2.right;
        }
        if (i9 == 33) {
            return rect.top >= rect2.bottom;
        }
        if (i9 == 66) {
            return rect.right <= rect2.left;
        }
        if (i9 == 130) {
            return rect.bottom <= rect2.top;
        }
        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
    }

    public static int k(int i9, Rect rect, Rect rect2) {
        return Math.max(0, l(i9, rect, rect2));
    }

    public static int l(int i9, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i9 == 17) {
            i10 = rect.left;
            i11 = rect2.right;
        } else if (i9 == 33) {
            i10 = rect.top;
            i11 = rect2.bottom;
        } else if (i9 == 66) {
            i10 = rect2.left;
            i11 = rect.right;
        } else {
            if (i9 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.top;
            i11 = rect.bottom;
        }
        return i10 - i11;
    }

    public static int m(int i9, Rect rect, Rect rect2) {
        return Math.max(1, n(i9, rect, rect2));
    }

    public static int n(int i9, Rect rect, Rect rect2) {
        int i10;
        int i11;
        if (i9 == 17) {
            i10 = rect.left;
            i11 = rect2.left;
        } else if (i9 == 33) {
            i10 = rect.top;
            i11 = rect2.top;
        } else if (i9 == 66) {
            i10 = rect2.right;
            i11 = rect.right;
        } else {
            if (i9 != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i10 = rect2.bottom;
            i11 = rect.bottom;
        }
        return i10 - i11;
    }

    public static int o(int i9, Rect rect, Rect rect2) {
        int iHeight;
        int i10;
        int iHeight2;
        if (i9 == 17) {
            iHeight = rect.top + (rect.height() / 2);
            i10 = rect2.top;
            iHeight2 = rect2.height();
        } else {
            if (i9 != 33) {
                if (i9 != 66) {
                    if (i9 != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
                iHeight = rect.top + (rect.height() / 2);
                i10 = rect2.top;
                iHeight2 = rect2.height();
            }
            iHeight = rect.left + (rect.width() / 2);
            i10 = rect2.left;
            iHeight2 = rect2.width();
        }
        return Math.abs(iHeight - (i10 + (iHeight2 / 2)));
    }
}
