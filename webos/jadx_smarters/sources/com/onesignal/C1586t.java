package com.onesignal;

import W.d;
import android.content.Context;
import android.content.res.Resources;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import org.apache.http.protocol.HttpRequestExecutor;

/* JADX INFO: renamed from: com.onesignal.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1586t extends RelativeLayout {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f38841f = C1.b(28);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f38842g = C1.b(64);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f38843a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public W.d f38844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f38845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public c f38846e;

    /* JADX INFO: renamed from: com.onesignal.t$a */
    public class a extends d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38847a;

        public a() {
        }

        @Override // W.d.c
        public int a(View view, int i9, int i10) {
            return C1586t.this.f38846e.f38852d;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
        
            if (r2 < r0.f38848b.f38846e.f38850b) goto L4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0069, code lost:
        
            if (r2 > r0.f38848b.f38846e.f38850b) goto L4;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x006c, code lost:
        
            return r2;
         */
        @Override // W.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int b(android.view.View r1, int r2, int r3) {
            /*
                r0 = this;
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                boolean r1 = r1.f38856h
                if (r1 == 0) goto L13
            La:
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = r1.f38850b
                return r1
            L13:
                r0.f38847a = r2
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = r1.f38855g
                r3 = 1
                if (r1 != r3) goto L46
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = r1.f38851c
                if (r2 < r1) goto L3b
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$b r1 = com.onesignal.C1586t.b(r1)
                if (r1 == 0) goto L3b
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$b r1 = com.onesignal.C1586t.b(r1)
                r1.b()
            L3b:
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = r1.f38850b
                if (r2 >= r1) goto L6c
                goto La
            L46:
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = r1.f38851c
                if (r2 > r1) goto L61
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$b r1 = com.onesignal.C1586t.b(r1)
                if (r1 == 0) goto L61
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$b r1 = com.onesignal.C1586t.b(r1)
                r1.b()
            L61:
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = r1.f38850b
                if (r2 <= r1) goto L6c
                goto La
            L6c:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C1586t.a.b(android.view.View, int, int):int");
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x004f A[PHI: r3
          0x004f: PHI (r3v10 int) = (r3v9 int), (r3v13 int) binds: [B:18:0x008b, B:11:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
        @Override // W.d.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void l(android.view.View r3, float r4, float r5) {
            /*
                r2 = this;
                com.onesignal.t r3 = com.onesignal.C1586t.this
                com.onesignal.t$c r3 = com.onesignal.C1586t.a(r3)
                int r3 = r3.f38850b
                com.onesignal.t r4 = com.onesignal.C1586t.this
                boolean r4 = com.onesignal.C1586t.c(r4)
                if (r4 != 0) goto L8e
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.t$c r4 = com.onesignal.C1586t.a(r4)
                int r4 = r4.f38855g
                r0 = 1
                if (r4 != r0) goto L59
                int r4 = r2.f38847a
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = com.onesignal.C1586t.c.e(r1)
                if (r4 > r1) goto L38
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.t$c r4 = com.onesignal.C1586t.a(r4)
                int r4 = com.onesignal.C1586t.c.c(r4)
                float r4 = (float) r4
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 <= 0) goto L8e
            L38:
                com.onesignal.t r3 = com.onesignal.C1586t.this
                com.onesignal.t$c r3 = com.onesignal.C1586t.a(r3)
                int r3 = com.onesignal.C1586t.c.a(r3)
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.C1586t.d(r4, r0)
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.t$b r4 = com.onesignal.C1586t.b(r4)
                if (r4 == 0) goto L8e
            L4f:
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.t$b r4 = com.onesignal.C1586t.b(r4)
                r4.onDismiss()
                goto L8e
            L59:
                int r4 = r2.f38847a
                com.onesignal.t r1 = com.onesignal.C1586t.this
                com.onesignal.t$c r1 = com.onesignal.C1586t.a(r1)
                int r1 = com.onesignal.C1586t.c.e(r1)
                if (r4 < r1) goto L76
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.t$c r4 = com.onesignal.C1586t.a(r4)
                int r4 = com.onesignal.C1586t.c.c(r4)
                float r4 = (float) r4
                int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
                if (r4 >= 0) goto L8e
            L76:
                com.onesignal.t r3 = com.onesignal.C1586t.this
                com.onesignal.t$c r3 = com.onesignal.C1586t.a(r3)
                int r3 = com.onesignal.C1586t.c.a(r3)
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.C1586t.d(r4, r0)
                com.onesignal.t r4 = com.onesignal.C1586t.this
                com.onesignal.t$b r4 = com.onesignal.C1586t.b(r4)
                if (r4 == 0) goto L8e
                goto L4f
            L8e:
                com.onesignal.t r4 = com.onesignal.C1586t.this
                W.d r4 = com.onesignal.C1586t.e(r4)
                com.onesignal.t r5 = com.onesignal.C1586t.this
                com.onesignal.t$c r5 = com.onesignal.C1586t.a(r5)
                int r5 = r5.f38852d
                boolean r3 = r4.F(r5, r3)
                if (r3 == 0) goto La7
                com.onesignal.t r3 = com.onesignal.C1586t.this
                P.L.j0(r3)
            La7:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.onesignal.C1586t.a.l(android.view.View, float, float):void");
        }

        @Override // W.d.c
        public boolean m(View view, int i9) {
            return true;
        }
    }

    /* JADX INFO: renamed from: com.onesignal.t$b */
    public interface b {
        void a();

        void b();

        void onDismiss();
    }

    /* JADX INFO: renamed from: com.onesignal.t$c */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f38849a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f38850b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38851c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f38852d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f38853e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f38854f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f38855g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f38856h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f38857i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f38858j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f38859k;
    }

    public C1586t(Context context) {
        super(context);
        setClipChildren(false);
        f();
    }

    @Override // android.view.View
    public void computeScroll() {
        super.computeScroll();
        if (this.f38844c.k(true)) {
            P.L.j0(this);
        }
    }

    public final void f() {
        this.f38844c = W.d.l(this, 1.0f, new a());
    }

    public void g() {
        this.f38845d = true;
        this.f38844c.H(this, getLeft(), this.f38846e.f38858j);
        P.L.j0(this);
    }

    public void h(b bVar) {
        this.f38843a = bVar;
    }

    public void i(c cVar) {
        int i9;
        this.f38846e = cVar;
        cVar.f38858j = cVar.f38854f + cVar.f38849a + ((Resources.getSystem().getDisplayMetrics().heightPixels - cVar.f38854f) - cVar.f38849a) + f38842g;
        cVar.f38857i = C1.b(HttpRequestExecutor.DEFAULT_WAIT_FOR_CONTINUE);
        if (cVar.f38855g == 0) {
            cVar.f38858j = (-cVar.f38854f) - f38841f;
            cVar.f38857i = -cVar.f38857i;
            i9 = cVar.f38858j / 3;
        } else {
            i9 = (cVar.f38854f / 3) + (cVar.f38850b * 2);
        }
        cVar.f38859k = i9;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        b bVar;
        if (this.f38845d) {
            return true;
        }
        int action = motionEvent.getAction();
        if ((action == 0 || action == 5) && (bVar = this.f38843a) != null) {
            bVar.a();
        }
        this.f38844c.z(motionEvent);
        return false;
    }
}
