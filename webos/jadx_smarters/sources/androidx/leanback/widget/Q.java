package androidx.leanback.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import g0.AbstractC1798c;
import g0.AbstractC1801f;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15466a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f15467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f15468c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15469d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f15470e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15471f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f15472g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f15473h;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15474a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f15475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f15476c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f15478e;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f15477d = true;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public b f15479f = b.f15480d;

        /* JADX WARN: Removed duplicated region for block: B:30:0x0057  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public androidx.leanback.widget.Q a(android.content.Context r5) {
            /*
                r4 = this;
                androidx.leanback.widget.Q r0 = new androidx.leanback.widget.Q
                r0.<init>()
                boolean r1 = r4.f15474a
                r0.f15467b = r1
                boolean r1 = r4.f15475b
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L17
                boolean r1 = androidx.leanback.widget.Q.p()
                if (r1 == 0) goto L17
                r1 = 1
                goto L18
            L17:
                r1 = 0
            L18:
                r0.f15468c = r1
                boolean r1 = r4.f15476c
                if (r1 == 0) goto L26
                boolean r1 = androidx.leanback.widget.Q.q()
                if (r1 == 0) goto L26
                r1 = 1
                goto L27
            L26:
                r1 = 0
            L27:
                r0.f15469d = r1
                boolean r1 = r0.f15468c
                if (r1 == 0) goto L32
                androidx.leanback.widget.Q$b r1 = r4.f15479f
                r0.m(r1, r5)
            L32:
                boolean r1 = r0.f15469d
                if (r1 == 0) goto L61
                boolean r1 = r4.f15477d
                if (r1 == 0) goto L5b
                boolean r1 = androidx.leanback.widget.Q.n()
                if (r1 != 0) goto L41
                goto L5b
            L41:
                r1 = 3
                r0.f15466a = r1
                androidx.leanback.widget.Q$b r1 = r4.f15479f
                r0.l(r1, r5)
                boolean r5 = androidx.leanback.widget.Q.o()
                if (r5 == 0) goto L53
                boolean r5 = r4.f15478e
                if (r5 == 0) goto L58
            L53:
                boolean r5 = r0.f15467b
                if (r5 == 0) goto L58
            L57:
                r2 = 1
            L58:
                r0.f15470e = r2
                goto L72
            L5b:
                r5 = 2
                r0.f15466a = r5
                r0.f15470e = r3
                goto L72
            L61:
                r0.f15466a = r3
                boolean r5 = androidx.leanback.widget.Q.o()
                if (r5 == 0) goto L6d
                boolean r5 = r4.f15478e
                if (r5 == 0) goto L58
            L6d:
                boolean r5 = r0.f15467b
                if (r5 == 0) goto L58
                goto L57
            L72:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.Q.a.a(android.content.Context):androidx.leanback.widget.Q");
        }

        public a b(boolean z9) {
            this.f15478e = z9;
            return this;
        }

        public a c(boolean z9) {
            this.f15474a = z9;
            return this;
        }

        public a d(boolean z9) {
            this.f15475b = z9;
            return this;
        }

        public a e(boolean z9) {
            this.f15476c = z9;
            return this;
        }

        public a f(b bVar) {
            this.f15479f = bVar;
            return this;
        }

        public a g(boolean z9) {
            this.f15477d = z9;
            return this;
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f15480d = new b();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15481a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f15482b = -1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15483c = -1.0f;

        public final float a() {
            return this.f15483c;
        }

        public final float b() {
            return this.f15482b;
        }

        public final int c() {
            return this.f15481a;
        }
    }

    public static Object b(View view) {
        return view.getTag(AbstractC1801f.f41035s);
    }

    public static void h(View view, int i9) {
        Drawable drawableA = AbstractC1156k.a(view);
        if (drawableA instanceof ColorDrawable) {
            ((ColorDrawable) drawableA).setColor(i9);
        } else {
            AbstractC1156k.b(view, new ColorDrawable(i9));
        }
    }

    public static void i(View view, float f9) {
        k(b(view), 3, f9);
    }

    public static void k(Object obj, int i9, float f9) {
        if (obj != null) {
            if (f9 < 0.0f) {
                f9 = 0.0f;
            } else if (f9 > 1.0f) {
                f9 = 1.0f;
            }
            if (i9 == 2) {
                X.c(obj, f9);
            } else {
                if (i9 != 3) {
                    return;
                }
                N.b(obj, f9);
            }
        }
    }

    public static boolean n() {
        return N.c();
    }

    public static boolean o() {
        return AbstractC1156k.c();
    }

    public static boolean p() {
        return H.c();
    }

    public static boolean q() {
        return X.d();
    }

    public P a(Context context) {
        if (e()) {
            return new P(context, this.f15466a, this.f15467b, this.f15472g, this.f15473h, this.f15471f);
        }
        throw new IllegalArgumentException();
    }

    public int c() {
        return this.f15466a;
    }

    public boolean d() {
        return this.f15467b;
    }

    public boolean e() {
        return this.f15470e;
    }

    public void f(View view) {
        if (e()) {
            return;
        }
        if (this.f15469d) {
            if (this.f15466a == 3) {
                view.setTag(AbstractC1801f.f41035s, N.a(view, this.f15472g, this.f15473h, this.f15471f));
                return;
            } else if (!this.f15468c) {
                return;
            }
        } else if (!this.f15468c) {
            return;
        }
        H.b(view, true, this.f15471f);
    }

    public void g(ViewGroup viewGroup) {
        if (this.f15466a == 2) {
            X.b(viewGroup);
        }
    }

    public void j(View view, int i9) {
        if (e()) {
            ((P) view).setOverlayColor(i9);
        } else {
            h(view, i9);
        }
    }

    public void l(b bVar, Context context) {
        float fB;
        if (bVar.b() < 0.0f) {
            Resources resources = context.getResources();
            this.f15473h = resources.getDimension(AbstractC1798c.f40976d);
            fB = resources.getDimension(AbstractC1798c.f40977e);
        } else {
            this.f15473h = bVar.a();
            fB = bVar.b();
        }
        this.f15472g = fB;
    }

    public void m(b bVar, Context context) {
        this.f15471f = bVar.c() == 0 ? context.getResources().getDimensionPixelSize(AbstractC1798c.f40992t) : bVar.c();
    }
}
