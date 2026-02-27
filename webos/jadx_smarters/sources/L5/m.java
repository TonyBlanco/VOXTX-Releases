package l5;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k5.C2148a;

/* JADX INFO: loaded from: classes3.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f44176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f44177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f44178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f44179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f44180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f44181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f44182g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f44183h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f44184i;

    public class a extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ List f44185b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Matrix f44186c;

        public a(List list, Matrix matrix) {
            this.f44185b = list;
            this.f44186c = matrix;
        }

        @Override // l5.m.g
        public void a(Matrix matrix, C2148a c2148a, int i9, Canvas canvas) {
            Iterator it = this.f44185b.iterator();
            while (it.hasNext()) {
                ((g) it.next()).a(this.f44186c, c2148a, i9, canvas);
            }
        }
    }

    public static class b extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f44188b;

        public b(d dVar) {
            this.f44188b = dVar;
        }

        @Override // l5.m.g
        public void a(Matrix matrix, C2148a c2148a, int i9, Canvas canvas) {
            c2148a.a(canvas, matrix, new RectF(this.f44188b.k(), this.f44188b.o(), this.f44188b.l(), this.f44188b.j()), i9, this.f44188b.m(), this.f44188b.n());
        }
    }

    public static class c extends g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f44189b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final float f44190c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final float f44191d;

        public c(e eVar, float f9, float f10) {
            this.f44189b = eVar;
            this.f44190c = f9;
            this.f44191d = f10;
        }

        @Override // l5.m.g
        public void a(Matrix matrix, C2148a c2148a, int i9, Canvas canvas) {
            RectF rectF = new RectF(0.0f, 0.0f, (float) Math.hypot(this.f44189b.f44200c - this.f44191d, this.f44189b.f44199b - this.f44190c), 0.0f);
            Matrix matrix2 = new Matrix(matrix);
            matrix2.preTranslate(this.f44190c, this.f44191d);
            matrix2.preRotate(c());
            c2148a.b(canvas, matrix2, rectF, i9);
        }

        public float c() {
            return (float) Math.toDegrees(Math.atan((this.f44189b.f44200c - this.f44191d) / (this.f44189b.f44199b - this.f44190c)));
        }
    }

    public static class d extends f {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final RectF f44192h = new RectF();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44193b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44194c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f44195d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f44196e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f44197f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f44198g;

        public d(float f9, float f10, float f11, float f12) {
            q(f9);
            u(f10);
            r(f11);
            p(f12);
        }

        @Override // l5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f44201a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            RectF rectF = f44192h;
            rectF.set(k(), o(), l(), j());
            path.arcTo(rectF, m(), n(), false);
            path.transform(matrix);
        }

        public final float j() {
            return this.f44196e;
        }

        public final float k() {
            return this.f44193b;
        }

        public final float l() {
            return this.f44195d;
        }

        public final float m() {
            return this.f44197f;
        }

        public final float n() {
            return this.f44198g;
        }

        public final float o() {
            return this.f44194c;
        }

        public final void p(float f9) {
            this.f44196e = f9;
        }

        public final void q(float f9) {
            this.f44193b = f9;
        }

        public final void r(float f9) {
            this.f44195d = f9;
        }

        public final void s(float f9) {
            this.f44197f = f9;
        }

        public final void t(float f9) {
            this.f44198g = f9;
        }

        public final void u(float f9) {
            this.f44194c = f9;
        }
    }

    public static class e extends f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f44199b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f44200c;

        @Override // l5.m.f
        public void a(Matrix matrix, Path path) {
            Matrix matrix2 = this.f44201a;
            matrix.invert(matrix2);
            path.transform(matrix2);
            path.lineTo(this.f44199b, this.f44200c);
            path.transform(matrix);
        }
    }

    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f44201a = new Matrix();

        public abstract void a(Matrix matrix, Path path);
    }

    public static abstract class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Matrix f44202a = new Matrix();

        public abstract void a(Matrix matrix, C2148a c2148a, int i9, Canvas canvas);

        public final void b(C2148a c2148a, int i9, Canvas canvas) {
            a(f44202a, c2148a, i9, canvas);
        }
    }

    public m() {
        n(0.0f, 0.0f);
    }

    public void a(float f9, float f10, float f11, float f12, float f13, float f14) {
        d dVar = new d(f9, f10, f11, f12);
        dVar.s(f13);
        dVar.t(f14);
        this.f44182g.add(dVar);
        b bVar = new b(dVar);
        float f15 = f13 + f14;
        boolean z9 = f14 < 0.0f;
        if (z9) {
            f13 = (f13 + 180.0f) % 360.0f;
        }
        c(bVar, f13, z9 ? (180.0f + f15) % 360.0f : f15);
        double d9 = f15;
        r(((f9 + f11) * 0.5f) + (((f11 - f9) / 2.0f) * ((float) Math.cos(Math.toRadians(d9)))));
        s(((f10 + f12) * 0.5f) + (((f12 - f10) / 2.0f) * ((float) Math.sin(Math.toRadians(d9)))));
    }

    public final void b(float f9) {
        if (g() == f9) {
            return;
        }
        float fG = ((f9 - g()) + 360.0f) % 360.0f;
        if (fG > 180.0f) {
            return;
        }
        d dVar = new d(i(), j(), i(), j());
        dVar.s(g());
        dVar.t(fG);
        this.f44183h.add(new b(dVar));
        p(f9);
    }

    public final void c(g gVar, float f9, float f10) {
        b(f9);
        this.f44183h.add(gVar);
        p(f10);
    }

    public void d(Matrix matrix, Path path) {
        int size = this.f44182g.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((f) this.f44182g.get(i9)).a(matrix, path);
        }
    }

    public boolean e() {
        return this.f44184i;
    }

    public g f(Matrix matrix) {
        b(h());
        return new a(new ArrayList(this.f44183h), new Matrix(matrix));
    }

    public final float g() {
        return this.f44180e;
    }

    public final float h() {
        return this.f44181f;
    }

    public float i() {
        return this.f44178c;
    }

    public float j() {
        return this.f44179d;
    }

    public float k() {
        return this.f44176a;
    }

    public float l() {
        return this.f44177b;
    }

    public void m(float f9, float f10) {
        e eVar = new e();
        eVar.f44199b = f9;
        eVar.f44200c = f10;
        this.f44182g.add(eVar);
        c cVar = new c(eVar, i(), j());
        c(cVar, cVar.c() + 270.0f, cVar.c() + 270.0f);
        r(f9);
        s(f10);
    }

    public void n(float f9, float f10) {
        o(f9, f10, 270.0f, 0.0f);
    }

    public void o(float f9, float f10, float f11, float f12) {
        t(f9);
        u(f10);
        r(f9);
        s(f10);
        p(f11);
        q((f11 + f12) % 360.0f);
        this.f44182g.clear();
        this.f44183h.clear();
        this.f44184i = false;
    }

    public final void p(float f9) {
        this.f44180e = f9;
    }

    public final void q(float f9) {
        this.f44181f = f9;
    }

    public final void r(float f9) {
        this.f44178c = f9;
    }

    public final void s(float f9) {
        this.f44179d = f9;
    }

    public final void t(float f9) {
        this.f44176a = f9;
    }

    public final void u(float f9) {
        this.f44177b = f9;
    }
}
