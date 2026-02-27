package L0;

import F.k;
import G.e;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.cookie.ClientCookie;
import org.chromium.net.UrlRequest;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import s.C2695a;

/* JADX INFO: loaded from: classes.dex */
public class g extends L0.f {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final PorterDuff.Mode f3901l = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h f3902c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuffColorFilter f3903d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ColorFilter f3904e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f3905f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f3906g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Drawable.ConstantState f3907h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final float[] f3908i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Matrix f3909j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Rect f3910k;

    public static class b extends f {
        public b() {
        }

        public b(b bVar) {
            super(bVar);
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3937b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f3936a = G.e.d(string2);
            }
            this.f3938c = k.k(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // L0.g.f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.r(xmlPullParser, "pathData")) {
                TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3876d);
                f(typedArrayS, xmlPullParser);
                typedArrayS.recycle();
            }
        }
    }

    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int[] f3911e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public F.d f3912f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f3913g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public F.d f3914h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f3915i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f3916j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f3917k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f3918l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f3919m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public Paint.Cap f3920n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Paint.Join f3921o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f3922p;

        public c() {
            this.f3913g = 0.0f;
            this.f3915i = 1.0f;
            this.f3916j = 1.0f;
            this.f3917k = 0.0f;
            this.f3918l = 1.0f;
            this.f3919m = 0.0f;
            this.f3920n = Paint.Cap.BUTT;
            this.f3921o = Paint.Join.MITER;
            this.f3922p = 4.0f;
        }

        public c(c cVar) {
            super(cVar);
            this.f3913g = 0.0f;
            this.f3915i = 1.0f;
            this.f3916j = 1.0f;
            this.f3917k = 0.0f;
            this.f3918l = 1.0f;
            this.f3919m = 0.0f;
            this.f3920n = Paint.Cap.BUTT;
            this.f3921o = Paint.Join.MITER;
            this.f3922p = 4.0f;
            this.f3911e = cVar.f3911e;
            this.f3912f = cVar.f3912f;
            this.f3913g = cVar.f3913g;
            this.f3915i = cVar.f3915i;
            this.f3914h = cVar.f3914h;
            this.f3938c = cVar.f3938c;
            this.f3916j = cVar.f3916j;
            this.f3917k = cVar.f3917k;
            this.f3918l = cVar.f3918l;
            this.f3919m = cVar.f3919m;
            this.f3920n = cVar.f3920n;
            this.f3921o = cVar.f3921o;
            this.f3922p = cVar.f3922p;
        }

        @Override // L0.g.e
        public boolean a() {
            return this.f3914h.i() || this.f3912f.i();
        }

        @Override // L0.g.e
        public boolean b(int[] iArr) {
            return this.f3912f.j(iArr) | this.f3914h.j(iArr);
        }

        public final Paint.Cap e(int i9, Paint.Cap cap) {
            return i9 != 0 ? i9 != 1 ? i9 != 2 ? cap : Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }

        public final Paint.Join f(int i9, Paint.Join join) {
            return i9 != 0 ? i9 != 1 ? i9 != 2 ? join : Paint.Join.BEVEL : Paint.Join.ROUND : Paint.Join.MITER;
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3875c);
            h(typedArrayS, xmlPullParser, theme);
            typedArrayS.recycle();
        }

        public float getFillAlpha() {
            return this.f3916j;
        }

        public int getFillColor() {
            return this.f3914h.e();
        }

        public float getStrokeAlpha() {
            return this.f3915i;
        }

        public int getStrokeColor() {
            return this.f3912f.e();
        }

        public float getStrokeWidth() {
            return this.f3913g;
        }

        public float getTrimPathEnd() {
            return this.f3918l;
        }

        public float getTrimPathOffset() {
            return this.f3919m;
        }

        public float getTrimPathStart() {
            return this.f3917k;
        }

        public final void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f3911e = null;
            if (k.r(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f3937b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f3936a = G.e.d(string2);
                }
                this.f3914h = k.i(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f3916j = k.j(typedArray, xmlPullParser, "fillAlpha", 12, this.f3916j);
                this.f3920n = e(k.k(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f3920n);
                this.f3921o = f(k.k(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f3921o);
                this.f3922p = k.j(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f3922p);
                this.f3912f = k.i(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f3915i = k.j(typedArray, xmlPullParser, "strokeAlpha", 11, this.f3915i);
                this.f3913g = k.j(typedArray, xmlPullParser, "strokeWidth", 4, this.f3913g);
                this.f3918l = k.j(typedArray, xmlPullParser, "trimPathEnd", 6, this.f3918l);
                this.f3919m = k.j(typedArray, xmlPullParser, "trimPathOffset", 7, this.f3919m);
                this.f3917k = k.j(typedArray, xmlPullParser, "trimPathStart", 5, this.f3917k);
                this.f3938c = k.k(typedArray, xmlPullParser, "fillType", 13, this.f3938c);
            }
        }

        public void setFillAlpha(float f9) {
            this.f3916j = f9;
        }

        public void setFillColor(int i9) {
            this.f3914h.k(i9);
        }

        public void setStrokeAlpha(float f9) {
            this.f3915i = f9;
        }

        public void setStrokeColor(int i9) {
            this.f3912f.k(i9);
        }

        public void setStrokeWidth(float f9) {
            this.f3913g = f9;
        }

        public void setTrimPathEnd(float f9) {
            this.f3918l = f9;
        }

        public void setTrimPathOffset(float f9) {
            this.f3919m = f9;
        }

        public void setTrimPathStart(float f9) {
            this.f3917k = f9;
        }
    }

    public static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Matrix f3923a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f3924b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f3925c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f3926d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f3927e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f3928f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f3929g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f3930h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f3931i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Matrix f3932j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f3933k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int[] f3934l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public String f3935m;

        public d() {
            super();
            this.f3923a = new Matrix();
            this.f3924b = new ArrayList();
            this.f3925c = 0.0f;
            this.f3926d = 0.0f;
            this.f3927e = 0.0f;
            this.f3928f = 1.0f;
            this.f3929g = 1.0f;
            this.f3930h = 0.0f;
            this.f3931i = 0.0f;
            this.f3932j = new Matrix();
            this.f3935m = null;
        }

        public d(d dVar, C2695a c2695a) {
            f bVar;
            super();
            this.f3923a = new Matrix();
            this.f3924b = new ArrayList();
            this.f3925c = 0.0f;
            this.f3926d = 0.0f;
            this.f3927e = 0.0f;
            this.f3928f = 1.0f;
            this.f3929g = 1.0f;
            this.f3930h = 0.0f;
            this.f3931i = 0.0f;
            Matrix matrix = new Matrix();
            this.f3932j = matrix;
            this.f3935m = null;
            this.f3925c = dVar.f3925c;
            this.f3926d = dVar.f3926d;
            this.f3927e = dVar.f3927e;
            this.f3928f = dVar.f3928f;
            this.f3929g = dVar.f3929g;
            this.f3930h = dVar.f3930h;
            this.f3931i = dVar.f3931i;
            this.f3934l = dVar.f3934l;
            String str = dVar.f3935m;
            this.f3935m = str;
            this.f3933k = dVar.f3933k;
            if (str != null) {
                c2695a.put(str, this);
            }
            matrix.set(dVar.f3932j);
            ArrayList arrayList = dVar.f3924b;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                Object obj = arrayList.get(i9);
                if (obj instanceof d) {
                    this.f3924b.add(new d((d) obj, c2695a));
                } else {
                    if (obj instanceof c) {
                        bVar = new c((c) obj);
                    } else {
                        if (!(obj instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) obj);
                    }
                    this.f3924b.add(bVar);
                    Object obj2 = bVar.f3937b;
                    if (obj2 != null) {
                        c2695a.put(obj2, bVar);
                    }
                }
            }
        }

        @Override // L0.g.e
        public boolean a() {
            for (int i9 = 0; i9 < this.f3924b.size(); i9++) {
                if (((e) this.f3924b.get(i9)).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // L0.g.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i9 = 0; i9 < this.f3924b.size(); i9++) {
                zB |= ((e) this.f3924b.get(i9)).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3874b);
            e(typedArrayS, xmlPullParser);
            typedArrayS.recycle();
        }

        public final void d() {
            this.f3932j.reset();
            this.f3932j.postTranslate(-this.f3926d, -this.f3927e);
            this.f3932j.postScale(this.f3928f, this.f3929g);
            this.f3932j.postRotate(this.f3925c, 0.0f, 0.0f);
            this.f3932j.postTranslate(this.f3930h + this.f3926d, this.f3931i + this.f3927e);
        }

        public final void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f3934l = null;
            this.f3925c = k.j(typedArray, xmlPullParser, "rotation", 5, this.f3925c);
            this.f3926d = typedArray.getFloat(1, this.f3926d);
            this.f3927e = typedArray.getFloat(2, this.f3927e);
            this.f3928f = k.j(typedArray, xmlPullParser, "scaleX", 3, this.f3928f);
            this.f3929g = k.j(typedArray, xmlPullParser, "scaleY", 4, this.f3929g);
            this.f3930h = k.j(typedArray, xmlPullParser, "translateX", 6, this.f3930h);
            this.f3931i = k.j(typedArray, xmlPullParser, "translateY", 7, this.f3931i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f3935m = string;
            }
            d();
        }

        public String getGroupName() {
            return this.f3935m;
        }

        public Matrix getLocalMatrix() {
            return this.f3932j;
        }

        public float getPivotX() {
            return this.f3926d;
        }

        public float getPivotY() {
            return this.f3927e;
        }

        public float getRotation() {
            return this.f3925c;
        }

        public float getScaleX() {
            return this.f3928f;
        }

        public float getScaleY() {
            return this.f3929g;
        }

        public float getTranslateX() {
            return this.f3930h;
        }

        public float getTranslateY() {
            return this.f3931i;
        }

        public void setPivotX(float f9) {
            if (f9 != this.f3926d) {
                this.f3926d = f9;
                d();
            }
        }

        public void setPivotY(float f9) {
            if (f9 != this.f3927e) {
                this.f3927e = f9;
                d();
            }
        }

        public void setRotation(float f9) {
            if (f9 != this.f3925c) {
                this.f3925c = f9;
                d();
            }
        }

        public void setScaleX(float f9) {
            if (f9 != this.f3928f) {
                this.f3928f = f9;
                d();
            }
        }

        public void setScaleY(float f9) {
            if (f9 != this.f3929g) {
                this.f3929g = f9;
                d();
            }
        }

        public void setTranslateX(float f9) {
            if (f9 != this.f3930h) {
                this.f3930h = f9;
                d();
            }
        }

        public void setTranslateY(float f9) {
            if (f9 != this.f3931i) {
                this.f3931i = f9;
                d();
            }
        }
    }

    public static abstract class e {
        public e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    public static abstract class f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e.b[] f3936a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f3937b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f3938c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f3939d;

        public f() {
            super();
            this.f3936a = null;
            this.f3938c = 0;
        }

        public f(f fVar) {
            super();
            this.f3936a = null;
            this.f3938c = 0;
            this.f3937b = fVar.f3937b;
            this.f3939d = fVar.f3939d;
            this.f3936a = G.e.f(fVar.f3936a);
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            e.b[] bVarArr = this.f3936a;
            if (bVarArr != null) {
                e.b.e(bVarArr, path);
            }
        }

        public e.b[] getPathData() {
            return this.f3936a;
        }

        public String getPathName() {
            return this.f3937b;
        }

        public void setPathData(e.b[] bVarArr) {
            if (G.e.b(this.f3936a, bVarArr)) {
                G.e.j(this.f3936a, bVarArr);
            } else {
                this.f3936a = G.e.f(bVarArr);
            }
        }
    }

    /* JADX INFO: renamed from: L0.g$g, reason: collision with other inner class name */
    public static class C0064g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final Matrix f3940q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Path f3941a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Path f3942b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Matrix f3943c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Paint f3944d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Paint f3945e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public PathMeasure f3946f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f3947g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final d f3948h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f3949i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f3950j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f3951k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f3952l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f3953m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f3954n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public Boolean f3955o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final C2695a f3956p;

        public C0064g() {
            this.f3943c = new Matrix();
            this.f3949i = 0.0f;
            this.f3950j = 0.0f;
            this.f3951k = 0.0f;
            this.f3952l = 0.0f;
            this.f3953m = 255;
            this.f3954n = null;
            this.f3955o = null;
            this.f3956p = new C2695a();
            this.f3948h = new d();
            this.f3941a = new Path();
            this.f3942b = new Path();
        }

        public C0064g(C0064g c0064g) {
            this.f3943c = new Matrix();
            this.f3949i = 0.0f;
            this.f3950j = 0.0f;
            this.f3951k = 0.0f;
            this.f3952l = 0.0f;
            this.f3953m = 255;
            this.f3954n = null;
            this.f3955o = null;
            C2695a c2695a = new C2695a();
            this.f3956p = c2695a;
            this.f3948h = new d(c0064g.f3948h, c2695a);
            this.f3941a = new Path(c0064g.f3941a);
            this.f3942b = new Path(c0064g.f3942b);
            this.f3949i = c0064g.f3949i;
            this.f3950j = c0064g.f3950j;
            this.f3951k = c0064g.f3951k;
            this.f3952l = c0064g.f3952l;
            this.f3947g = c0064g.f3947g;
            this.f3953m = c0064g.f3953m;
            this.f3954n = c0064g.f3954n;
            String str = c0064g.f3954n;
            if (str != null) {
                c2695a.put(str, this);
            }
            this.f3955o = c0064g.f3955o;
        }

        public static float a(float f9, float f10, float f11, float f12) {
            return (f9 * f12) - (f10 * f11);
        }

        public void b(Canvas canvas, int i9, int i10, ColorFilter colorFilter) {
            c(this.f3948h, f3940q, canvas, i9, i10, colorFilter);
        }

        public final void c(d dVar, Matrix matrix, Canvas canvas, int i9, int i10, ColorFilter colorFilter) {
            dVar.f3923a.set(matrix);
            dVar.f3923a.preConcat(dVar.f3932j);
            canvas.save();
            for (int i11 = 0; i11 < dVar.f3924b.size(); i11++) {
                e eVar = (e) dVar.f3924b.get(i11);
                if (eVar instanceof d) {
                    c((d) eVar, dVar.f3923a, canvas, i9, i10, colorFilter);
                } else if (eVar instanceof f) {
                    d(dVar, (f) eVar, canvas, i9, i10, colorFilter);
                }
            }
            canvas.restore();
        }

        public final void d(d dVar, f fVar, Canvas canvas, int i9, int i10, ColorFilter colorFilter) {
            float f9 = i9 / this.f3951k;
            float f10 = i10 / this.f3952l;
            float fMin = Math.min(f9, f10);
            Matrix matrix = dVar.f3923a;
            this.f3943c.set(matrix);
            this.f3943c.postScale(f9, f10);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            fVar.d(this.f3941a);
            Path path = this.f3941a;
            this.f3942b.reset();
            if (fVar.c()) {
                this.f3942b.setFillType(fVar.f3938c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f3942b.addPath(path, this.f3943c);
                canvas.clipPath(this.f3942b);
                return;
            }
            c cVar = (c) fVar;
            float f11 = cVar.f3917k;
            if (f11 != 0.0f || cVar.f3918l != 1.0f) {
                float f12 = cVar.f3919m;
                float f13 = (f11 + f12) % 1.0f;
                float f14 = (cVar.f3918l + f12) % 1.0f;
                if (this.f3946f == null) {
                    this.f3946f = new PathMeasure();
                }
                this.f3946f.setPath(this.f3941a, false);
                float length = this.f3946f.getLength();
                float f15 = f13 * length;
                float f16 = f14 * length;
                path.reset();
                if (f15 > f16) {
                    this.f3946f.getSegment(f15, length, path, true);
                    this.f3946f.getSegment(0.0f, f16, path, true);
                } else {
                    this.f3946f.getSegment(f15, f16, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f3942b.addPath(path, this.f3943c);
            if (cVar.f3914h.l()) {
                F.d dVar2 = cVar.f3914h;
                if (this.f3945e == null) {
                    Paint paint = new Paint(1);
                    this.f3945e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f3945e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f3943c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f3916j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(g.a(dVar2.e(), cVar.f3916j));
                }
                paint2.setColorFilter(colorFilter);
                this.f3942b.setFillType(cVar.f3938c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f3942b, paint2);
            }
            if (cVar.f3912f.l()) {
                F.d dVar3 = cVar.f3912f;
                if (this.f3944d == null) {
                    Paint paint3 = new Paint(1);
                    this.f3944d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f3944d;
                Paint.Join join = cVar.f3921o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f3920n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f3922p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f3943c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f3915i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(g.a(dVar3.e(), cVar.f3915i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f3913g * fMin * fE);
                canvas.drawPath(this.f3942b, paint4);
            }
        }

        public final float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public boolean f() {
            if (this.f3955o == null) {
                this.f3955o = Boolean.valueOf(this.f3948h.a());
            }
            return this.f3955o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f3948h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f3953m;
        }

        public void setAlpha(float f9) {
            setRootAlpha((int) (f9 * 255.0f));
        }

        public void setRootAlpha(int i9) {
            this.f3953m = i9;
        }
    }

    public static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f3957a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public C0064g f3958b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public ColorStateList f3959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public PorterDuff.Mode f3960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f3961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Bitmap f3962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ColorStateList f3963g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public PorterDuff.Mode f3964h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f3965i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f3966j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f3967k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Paint f3968l;

        public h() {
            this.f3959c = null;
            this.f3960d = g.f3901l;
            this.f3958b = new C0064g();
        }

        public h(h hVar) {
            this.f3959c = null;
            this.f3960d = g.f3901l;
            if (hVar != null) {
                this.f3957a = hVar.f3957a;
                C0064g c0064g = new C0064g(hVar.f3958b);
                this.f3958b = c0064g;
                if (hVar.f3958b.f3945e != null) {
                    c0064g.f3945e = new Paint(hVar.f3958b.f3945e);
                }
                if (hVar.f3958b.f3944d != null) {
                    this.f3958b.f3944d = new Paint(hVar.f3958b.f3944d);
                }
                this.f3959c = hVar.f3959c;
                this.f3960d = hVar.f3960d;
                this.f3961e = hVar.f3961e;
            }
        }

        public boolean a(int i9, int i10) {
            return i9 == this.f3962f.getWidth() && i10 == this.f3962f.getHeight();
        }

        public boolean b() {
            return !this.f3967k && this.f3963g == this.f3959c && this.f3964h == this.f3960d && this.f3966j == this.f3961e && this.f3965i == this.f3958b.getRootAlpha();
        }

        public void c(int i9, int i10) {
            if (this.f3962f == null || !a(i9, i10)) {
                this.f3962f = Bitmap.createBitmap(i9, i10, Bitmap.Config.ARGB_8888);
                this.f3967k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f3962f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f3968l == null) {
                Paint paint = new Paint();
                this.f3968l = paint;
                paint.setFilterBitmap(true);
            }
            this.f3968l.setAlpha(this.f3958b.getRootAlpha());
            this.f3968l.setColorFilter(colorFilter);
            return this.f3968l;
        }

        public boolean f() {
            return this.f3958b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f3958b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3957a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f3958b.g(iArr);
            this.f3967k |= zG;
            return zG;
        }

        public void i() {
            this.f3963g = this.f3959c;
            this.f3964h = this.f3960d;
            this.f3965i = this.f3958b.getRootAlpha();
            this.f3966j = this.f3961e;
            this.f3967k = false;
        }

        public void j(int i9, int i10) {
            this.f3962f.eraseColor(0);
            this.f3958b.b(new Canvas(this.f3962f), i9, i10, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new g(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new g(this);
        }
    }

    public static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Drawable.ConstantState f3969a;

        public i(Drawable.ConstantState constantState) {
            this.f3969a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f3969a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f3969a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            g gVar = new g();
            gVar.f3900a = (VectorDrawable) this.f3969a.newDrawable();
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            g gVar = new g();
            gVar.f3900a = (VectorDrawable) this.f3969a.newDrawable(resources);
            return gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            g gVar = new g();
            gVar.f3900a = (VectorDrawable) this.f3969a.newDrawable(resources, theme);
            return gVar;
        }
    }

    public g() {
        this.f3906g = true;
        this.f3908i = new float[9];
        this.f3909j = new Matrix();
        this.f3910k = new Rect();
        this.f3902c = new h();
    }

    public g(h hVar) {
        this.f3906g = true;
        this.f3908i = new float[9];
        this.f3909j = new Matrix();
        this.f3910k = new Rect();
        this.f3902c = hVar;
        this.f3903d = j(this.f3903d, hVar.f3959c, hVar.f3960d);
    }

    public static int a(int i9, float f9) {
        return (i9 & 16777215) | (((int) (Color.alpha(i9) * f9)) << 24);
    }

    public static g b(Resources resources, int i9, Resources.Theme theme) {
        int next;
        if (Build.VERSION.SDK_INT >= 24) {
            g gVar = new g();
            gVar.f3900a = F.h.f(resources, i9, theme);
            gVar.f3907h = new i(gVar.f3900a.getConstantState());
            return gVar;
        }
        try {
            XmlResourceParser xml = resources.getXml(i9);
            AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next == 2) {
                return c(resources, xml, attributeSetAsAttributeSet, theme);
            }
            throw new XmlPullParserException("No start tag found");
        } catch (IOException e9) {
            e = e9;
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        } catch (XmlPullParserException e10) {
            e = e10;
            Log.e("VectorDrawableCompat", "parser error", e);
            return null;
        }
    }

    public static g c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        g gVar = new g();
        gVar.inflate(resources, xmlPullParser, attributeSet, theme);
        return gVar;
    }

    public static PorterDuff.Mode g(int i9, PorterDuff.Mode mode) {
        if (i9 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i9 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i9 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i9) {
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                return PorterDuff.Mode.MULTIPLY;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f3900a;
        if (drawable == null) {
            return false;
        }
        H.a.b(drawable);
        return false;
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    public Object d(String str) {
        return this.f3902c.f3958b.f3956p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        copyBounds(this.f3910k);
        if (this.f3910k.width() <= 0 || this.f3910k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f3904e;
        if (colorFilter == null) {
            colorFilter = this.f3903d;
        }
        canvas.getMatrix(this.f3909j);
        this.f3909j.getValues(this.f3908i);
        float fAbs = Math.abs(this.f3908i[0]);
        float fAbs2 = Math.abs(this.f3908i[4]);
        float fAbs3 = Math.abs(this.f3908i[1]);
        float fAbs4 = Math.abs(this.f3908i[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iMin = Math.min(2048, (int) (this.f3910k.width() * fAbs));
        int iMin2 = Math.min(2048, (int) (this.f3910k.height() * fAbs2));
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f3910k;
        canvas.translate(rect.left, rect.top);
        if (f()) {
            canvas.translate(this.f3910k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f3910k.offsetTo(0, 0);
        this.f3902c.c(iMin, iMin2);
        if (!this.f3906g) {
            this.f3902c.j(iMin, iMin2);
        } else if (!this.f3902c.b()) {
            this.f3902c.j(iMin, iMin2);
            this.f3902c.i();
        }
        this.f3902c.d(canvas, colorFilter, this.f3910k);
        canvas.restoreToCount(iSave);
    }

    public final void e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int i9;
        int i10;
        h hVar = this.f3902c;
        C0064g c0064g = hVar.f3958b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(c0064g.f3948h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z9 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if (ClientCookie.PATH_ATTR.equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f3924b.add(cVar);
                    if (cVar.getPathName() != null) {
                        c0064g.f3956p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f3957a = cVar.f3939d | hVar.f3957a;
                    z9 = false;
                } else {
                    if ("clip-path".equals(name)) {
                        b bVar = new b();
                        bVar.e(resources, attributeSet, theme, xmlPullParser);
                        dVar.f3924b.add(bVar);
                        if (bVar.getPathName() != null) {
                            c0064g.f3956p.put(bVar.getPathName(), bVar);
                        }
                        i9 = hVar.f3957a;
                        i10 = bVar.f3939d;
                    } else if ("group".equals(name)) {
                        d dVar2 = new d();
                        dVar2.c(resources, attributeSet, theme, xmlPullParser);
                        dVar.f3924b.add(dVar2);
                        arrayDeque.push(dVar2);
                        if (dVar2.getGroupName() != null) {
                            c0064g.f3956p.put(dVar2.getGroupName(), dVar2);
                        }
                        i9 = hVar.f3957a;
                        i10 = dVar2.f3933k;
                    }
                    hVar.f3957a = i10 | i9;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z9) {
            throw new XmlPullParserException("no path defined");
        }
    }

    public final boolean f() {
        return isAutoMirrored() && H.a.f(this) == 1;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f3900a;
        return drawable != null ? H.a.d(drawable) : this.f3902c.f3958b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f3902c.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f3900a;
        return drawable != null ? H.a.e(drawable) : this.f3904e;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f3900a != null && Build.VERSION.SDK_INT >= 24) {
            return new i(this.f3900a.getConstantState());
        }
        this.f3902c.f3957a = getChangingConfigurations();
        return this.f3902c;
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f3902c.f3958b.f3950j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f3902c.f3958b.f3949i;
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    public void h(boolean z9) {
        this.f3906g = z9;
    }

    public final void i(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f3902c;
        C0064g c0064g = hVar.f3958b;
        hVar.f3960d = g(k.k(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListG = k.g(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListG != null) {
            hVar.f3959c = colorStateListG;
        }
        hVar.f3961e = k.e(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f3961e);
        c0064g.f3951k = k.j(typedArray, xmlPullParser, "viewportWidth", 7, c0064g.f3951k);
        float fJ = k.j(typedArray, xmlPullParser, "viewportHeight", 8, c0064g.f3952l);
        c0064g.f3952l = fJ;
        if (c0064g.f3951k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (fJ <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        c0064g.f3949i = typedArray.getDimension(3, c0064g.f3949i);
        float dimension = typedArray.getDimension(2, c0064g.f3950j);
        c0064g.f3950j = dimension;
        if (c0064g.f3949i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        c0064g.setAlpha(k.j(typedArray, xmlPullParser, "alpha", 4, c0064g.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            c0064g.f3954n = string;
            c0064g.f3956p.put(string, c0064g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f3902c;
        hVar.f3958b = new C0064g();
        TypedArray typedArrayS = k.s(resources, theme, attributeSet, L0.a.f3873a);
        i(typedArrayS, xmlPullParser, theme);
        typedArrayS.recycle();
        hVar.f3957a = getChangingConfigurations();
        hVar.f3967k = true;
        e(resources, xmlPullParser, attributeSet, theme);
        this.f3903d = j(this.f3903d, hVar.f3959c, hVar.f3960d);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f3900a;
        return drawable != null ? H.a.h(drawable) : this.f3902c.f3961e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        h hVar;
        ColorStateList colorStateList;
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.isStateful() : super.isStateful() || ((hVar = this.f3902c) != null && (hVar.g() || ((colorStateList = this.f3902c.f3959c) != null && colorStateList.isStateful())));
    }

    public PorterDuffColorFilter j(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.mutate();
            return this;
        }
        if (!this.f3905f && super.mutate() == this) {
            this.f3902c = new h(this.f3902c);
            this.f3905f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z9;
        PorterDuff.Mode mode;
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f3902c;
        ColorStateList colorStateList = hVar.f3959c;
        if (colorStateList == null || (mode = hVar.f3960d) == null) {
            z9 = false;
        } else {
            this.f3903d = j(this.f3903d, colorStateList, mode);
            invalidateSelf();
            z9 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z9;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j9);
        } else {
            super.scheduleSelf(runnable, j9);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setAlpha(i9);
        } else if (this.f3902c.f3958b.getRootAlpha() != i9) {
            this.f3902c.f3958b.setRootAlpha(i9);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.j(drawable, z9);
        } else {
            this.f3902c.f3961e = z9;
        }
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i9) {
        super.setChangingConfigurations(i9);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i9, PorterDuff.Mode mode) {
        super.setColorFilter(i9, mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f3904e = colorFilter;
            invalidateSelf();
        }
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z9) {
        super.setFilterBitmap(z9);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f9, float f10) {
        super.setHotspot(f9, f10);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i9, int i10, int i11, int i12) {
        super.setHotspotBounds(i9, i10, i11, i12);
    }

    @Override // L0.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i9) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.n(drawable, i9);
        } else {
            setTintList(ColorStateList.valueOf(i9));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f3902c;
        if (hVar.f3959c != colorStateList) {
            hVar.f3959c = colorStateList;
            this.f3903d = j(this.f3903d, colorStateList, hVar.f3960d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            H.a.p(drawable, mode);
            return;
        }
        h hVar = this.f3902c;
        if (hVar.f3960d != mode) {
            hVar.f3960d = mode;
            this.f3903d = j(this.f3903d, hVar.f3959c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z9, boolean z10) {
        Drawable drawable = this.f3900a;
        return drawable != null ? drawable.setVisible(z9, z10) : super.setVisible(z9, z10);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f3900a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }
}
