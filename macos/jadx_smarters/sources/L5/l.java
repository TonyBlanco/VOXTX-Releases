package l5;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes3.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m[] f44158a = new m[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix[] f44159b = new Matrix[4];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Matrix[] f44160c = new Matrix[4];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final PointF f44161d = new PointF();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Path f44162e = new Path();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Path f44163f = new Path();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f44164g = new m();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f44165h = new float[2];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f44166i = new float[2];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Path f44167j = new Path();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Path f44168k = new Path();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f44169l = true;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f44170a = new l();
    }

    public interface b {
        void a(m mVar, Matrix matrix, int i9);

        void b(m mVar, Matrix matrix, int i9);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f44171a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f44172b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final RectF f44173c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f44174d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f44175e;

        public c(k kVar, float f9, RectF rectF, b bVar, Path path) {
            this.f44174d = bVar;
            this.f44171a = kVar;
            this.f44175e = f9;
            this.f44173c = rectF;
            this.f44172b = path;
        }
    }

    public l() {
        for (int i9 = 0; i9 < 4; i9++) {
            this.f44158a[i9] = new m();
            this.f44159b[i9] = new Matrix();
            this.f44160c[i9] = new Matrix();
        }
    }

    public static l k() {
        return a.f44170a;
    }

    public final float a(int i9) {
        return (i9 + 1) * 90;
    }

    public final void b(c cVar, int i9) {
        this.f44165h[0] = this.f44158a[i9].k();
        this.f44165h[1] = this.f44158a[i9].l();
        this.f44159b[i9].mapPoints(this.f44165h);
        Path path = cVar.f44172b;
        float[] fArr = this.f44165h;
        if (i9 == 0) {
            path.moveTo(fArr[0], fArr[1]);
        } else {
            path.lineTo(fArr[0], fArr[1]);
        }
        this.f44158a[i9].d(this.f44159b[i9], cVar.f44172b);
        b bVar = cVar.f44174d;
        if (bVar != null) {
            bVar.a(this.f44158a[i9], this.f44159b[i9], i9);
        }
    }

    public final void c(c cVar, int i9) {
        m mVar;
        Matrix matrix;
        Path path;
        int i10 = (i9 + 1) % 4;
        this.f44165h[0] = this.f44158a[i9].i();
        this.f44165h[1] = this.f44158a[i9].j();
        this.f44159b[i9].mapPoints(this.f44165h);
        this.f44166i[0] = this.f44158a[i10].k();
        this.f44166i[1] = this.f44158a[i10].l();
        this.f44159b[i10].mapPoints(this.f44166i);
        float f9 = this.f44165h[0];
        float[] fArr = this.f44166i;
        float fMax = Math.max(((float) Math.hypot(f9 - fArr[0], r1[1] - fArr[1])) - 0.001f, 0.0f);
        float fI = i(cVar.f44173c, i9);
        this.f44164g.n(0.0f, 0.0f);
        C2197f c2197fJ = j(i9, cVar.f44171a);
        c2197fJ.b(fMax, fI, cVar.f44175e, this.f44164g);
        this.f44167j.reset();
        this.f44164g.d(this.f44160c[i9], this.f44167j);
        if (this.f44169l && (c2197fJ.a() || l(this.f44167j, i9) || l(this.f44167j, i10))) {
            Path path2 = this.f44167j;
            path2.op(path2, this.f44163f, Path.Op.DIFFERENCE);
            this.f44165h[0] = this.f44164g.k();
            this.f44165h[1] = this.f44164g.l();
            this.f44160c[i9].mapPoints(this.f44165h);
            Path path3 = this.f44162e;
            float[] fArr2 = this.f44165h;
            path3.moveTo(fArr2[0], fArr2[1]);
            mVar = this.f44164g;
            matrix = this.f44160c[i9];
            path = this.f44162e;
        } else {
            mVar = this.f44164g;
            matrix = this.f44160c[i9];
            path = cVar.f44172b;
        }
        mVar.d(matrix, path);
        b bVar = cVar.f44174d;
        if (bVar != null) {
            bVar.b(this.f44164g, this.f44160c[i9], i9);
        }
    }

    public void d(k kVar, float f9, RectF rectF, Path path) {
        e(kVar, f9, rectF, null, path);
    }

    public void e(k kVar, float f9, RectF rectF, b bVar, Path path) {
        path.rewind();
        this.f44162e.rewind();
        this.f44163f.rewind();
        this.f44163f.addRect(rectF, Path.Direction.CW);
        c cVar = new c(kVar, f9, rectF, bVar, path);
        for (int i9 = 0; i9 < 4; i9++) {
            m(cVar, i9);
            n(i9);
        }
        for (int i10 = 0; i10 < 4; i10++) {
            b(cVar, i10);
            c(cVar, i10);
        }
        path.close();
        this.f44162e.close();
        if (this.f44162e.isEmpty()) {
            return;
        }
        path.op(this.f44162e, Path.Op.UNION);
    }

    public final void f(int i9, RectF rectF, PointF pointF) {
        float f9;
        float f10;
        if (i9 == 1) {
            f9 = rectF.right;
        } else {
            if (i9 != 2) {
                f9 = i9 != 3 ? rectF.right : rectF.left;
                f10 = rectF.top;
                pointF.set(f9, f10);
            }
            f9 = rectF.left;
        }
        f10 = rectF.bottom;
        pointF.set(f9, f10);
    }

    public final InterfaceC2194c g(int i9, k kVar) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.t() : kVar.r() : kVar.j() : kVar.l();
    }

    public final AbstractC2195d h(int i9, k kVar) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.s() : kVar.q() : kVar.i() : kVar.k();
    }

    public final float i(RectF rectF, int i9) {
        float fCenterX;
        float f9;
        float[] fArr = this.f44165h;
        m mVar = this.f44158a[i9];
        fArr[0] = mVar.f44178c;
        fArr[1] = mVar.f44179d;
        this.f44159b[i9].mapPoints(fArr);
        if (i9 == 1 || i9 == 3) {
            fCenterX = rectF.centerX();
            f9 = this.f44165h[0];
        } else {
            fCenterX = rectF.centerY();
            f9 = this.f44165h[1];
        }
        return Math.abs(fCenterX - f9);
    }

    public final C2197f j(int i9, k kVar) {
        return i9 != 1 ? i9 != 2 ? i9 != 3 ? kVar.o() : kVar.p() : kVar.n() : kVar.h();
    }

    public final boolean l(Path path, int i9) {
        this.f44168k.reset();
        this.f44158a[i9].d(this.f44159b[i9], this.f44168k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.f44168k.computeBounds(rectF, true);
        path.op(this.f44168k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (rectF.isEmpty()) {
            return rectF.width() > 1.0f && rectF.height() > 1.0f;
        }
        return true;
    }

    public final void m(c cVar, int i9) {
        h(i9, cVar.f44171a).b(this.f44158a[i9], 90.0f, cVar.f44175e, cVar.f44173c, g(i9, cVar.f44171a));
        float fA = a(i9);
        this.f44159b[i9].reset();
        f(i9, cVar.f44173c, this.f44161d);
        Matrix matrix = this.f44159b[i9];
        PointF pointF = this.f44161d;
        matrix.setTranslate(pointF.x, pointF.y);
        this.f44159b[i9].preRotate(fA);
    }

    public final void n(int i9) {
        this.f44165h[0] = this.f44158a[i9].i();
        this.f44165h[1] = this.f44158a[i9].j();
        this.f44159b[i9].mapPoints(this.f44165h);
        float fA = a(i9);
        this.f44160c[i9].reset();
        Matrix matrix = this.f44160c[i9];
        float[] fArr = this.f44165h;
        matrix.setTranslate(fArr[0], fArr[1]);
        this.f44160c[i9].preRotate(fA);
    }
}
