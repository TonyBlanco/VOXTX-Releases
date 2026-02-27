package k;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import c.AbstractC1238a;
import c.AbstractC1240c;
import c.AbstractC1241d;
import e.AbstractC1726a;
import k.V;

/* JADX INFO: renamed from: k.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2114i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f43338b = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C2114i f43339c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V f43340a;

    /* JADX INFO: renamed from: k.i$a */
    public class a implements V.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f43341a = {c.e.f17807R, c.e.f17805P, c.e.f17809a};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int[] f43342b = {c.e.f17823o, c.e.f17791B, c.e.f17828t, c.e.f17824p, c.e.f17825q, c.e.f17827s, c.e.f17826r};

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int[] f43343c = {c.e.f17804O, c.e.f17806Q, c.e.f17819k, c.e.f17800K, c.e.f17801L, c.e.f17802M, c.e.f17803N};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int[] f43344d = {c.e.f17831w, c.e.f17817i, c.e.f17830v};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int[] f43345e = {c.e.f17799J, c.e.f17808S};

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int[] f43346f = {c.e.f17811c, c.e.f17815g, c.e.f17812d, c.e.f17816h};

        @Override // k.V.f
        public ColorStateList a(Context context, int i9) {
            if (i9 == c.e.f17821m) {
                return AbstractC1726a.a(context, AbstractC1240c.f17773e);
            }
            if (i9 == c.e.f17798I) {
                return AbstractC1726a.a(context, AbstractC1240c.f17776h);
            }
            if (i9 == c.e.f17797H) {
                return k(context);
            }
            if (i9 == c.e.f17814f) {
                return j(context);
            }
            if (i9 == c.e.f17810b) {
                return g(context);
            }
            if (i9 == c.e.f17813e) {
                return i(context);
            }
            if (i9 == c.e.f17793D || i9 == c.e.f17794E) {
                return AbstractC1726a.a(context, AbstractC1240c.f17775g);
            }
            if (f(this.f43342b, i9)) {
                return Z.e(context, AbstractC1238a.f17762u);
            }
            if (f(this.f43345e, i9)) {
                return AbstractC1726a.a(context, AbstractC1240c.f17772d);
            }
            if (f(this.f43346f, i9)) {
                return AbstractC1726a.a(context, AbstractC1240c.f17771c);
            }
            if (i9 == c.e.f17790A) {
                return AbstractC1726a.a(context, AbstractC1240c.f17774f);
            }
            return null;
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[RETURN] */
        @Override // k.V.f
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public boolean b(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
            /*
                r6 = this;
                android.graphics.PorterDuff$Mode r0 = k.C2114i.a()
                int[] r1 = r6.f43341a
                boolean r1 = r6.f(r1, r8)
                r2 = 1
                r3 = 0
                r4 = -1
                if (r1 == 0) goto L15
                int r8 = c.AbstractC1238a.f17762u
            L11:
                r1 = r0
            L12:
                r0 = -1
                r5 = 1
                goto L50
            L15:
                int[] r1 = r6.f43343c
                boolean r1 = r6.f(r1, r8)
                if (r1 == 0) goto L20
                int r8 = c.AbstractC1238a.f17760s
                goto L11
            L20:
                int[] r1 = r6.f43344d
                boolean r1 = r6.f(r1, r8)
                r5 = 16842801(0x1010031, float:2.3693695E-38)
                if (r1 == 0) goto L32
                android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.MULTIPLY
            L2d:
                r1 = r0
                r8 = 16842801(0x1010031, float:2.3693695E-38)
                goto L12
            L32:
                int r1 = c.e.f17829u
                if (r8 != r1) goto L47
                r8 = 1109603123(0x42233333, float:40.8)
                int r8 = java.lang.Math.round(r8)
                r1 = 16842800(0x1010030, float:2.3693693E-38)
                r1 = r0
                r5 = 1
                r0 = r8
                r8 = 16842800(0x1010030, float:2.3693693E-38)
                goto L50
            L47:
                int r1 = c.e.f17820l
                if (r8 != r1) goto L4c
                goto L2d
            L4c:
                r1 = r0
                r8 = 0
                r0 = -1
                r5 = 0
            L50:
                if (r5 == 0) goto L6d
                boolean r3 = k.M.a(r9)
                if (r3 == 0) goto L5c
                android.graphics.drawable.Drawable r9 = r9.mutate()
            L5c:
                int r7 = k.Z.c(r7, r8)
                android.graphics.PorterDuffColorFilter r7 = k.C2114i.e(r7, r1)
                r9.setColorFilter(r7)
                if (r0 == r4) goto L6c
                r9.setAlpha(r0)
            L6c:
                return r2
            L6d:
                return r3
            */
            throw new UnsupportedOperationException("Method not decompiled: k.C2114i.a.b(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
        }

        @Override // k.V.f
        public PorterDuff.Mode c(int i9) {
            if (i9 == c.e.f17797H) {
                return PorterDuff.Mode.MULTIPLY;
            }
            return null;
        }

        @Override // k.V.f
        public Drawable d(V v9, Context context, int i9) {
            int i10;
            if (i9 == c.e.f17818j) {
                return new LayerDrawable(new Drawable[]{v9.j(context, c.e.f17817i), v9.j(context, c.e.f17819k)});
            }
            if (i9 == c.e.f17833y) {
                i10 = AbstractC1241d.f17783g;
            } else if (i9 == c.e.f17832x) {
                i10 = AbstractC1241d.f17784h;
            } else {
                if (i9 != c.e.f17834z) {
                    return null;
                }
                i10 = AbstractC1241d.f17785i;
            }
            return l(v9, context, i10);
        }

        @Override // k.V.f
        public boolean e(Context context, int i9, Drawable drawable) {
            LayerDrawable layerDrawable;
            Drawable drawableFindDrawableByLayerId;
            int i10;
            if (i9 == c.e.f17792C) {
                layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), Z.c(context, AbstractC1238a.f17762u), C2114i.f43338b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i10 = AbstractC1238a.f17762u;
            } else {
                if (i9 != c.e.f17833y && i9 != c.e.f17832x && i9 != c.e.f17834z) {
                    return false;
                }
                layerDrawable = (LayerDrawable) drawable;
                m(layerDrawable.findDrawableByLayerId(R.id.background), Z.b(context, AbstractC1238a.f17762u), C2114i.f43338b);
                drawableFindDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.secondaryProgress);
                i10 = AbstractC1238a.f17760s;
            }
            m(drawableFindDrawableByLayerId, Z.c(context, i10), C2114i.f43338b);
            m(layerDrawable.findDrawableByLayerId(R.id.progress), Z.c(context, AbstractC1238a.f17760s), C2114i.f43338b);
            return true;
        }

        public final boolean f(int[] iArr, int i9) {
            for (int i10 : iArr) {
                if (i10 == i9) {
                    return true;
                }
            }
            return false;
        }

        public final ColorStateList g(Context context) {
            return h(context, 0);
        }

        public final ColorStateList h(Context context, int i9) {
            int iC = Z.c(context, AbstractC1238a.f17761t);
            return new ColorStateList(new int[][]{Z.f43273b, Z.f43276e, Z.f43274c, Z.f43280i}, new int[]{Z.b(context, AbstractC1238a.f17759r), G.a.j(iC, i9), G.a.j(iC, i9), i9});
        }

        public final ColorStateList i(Context context) {
            return h(context, Z.c(context, AbstractC1238a.f17758q));
        }

        public final ColorStateList j(Context context) {
            return h(context, Z.c(context, AbstractC1238a.f17759r));
        }

        public final ColorStateList k(Context context) {
            int[][] iArr = new int[3][];
            int[] iArr2 = new int[3];
            ColorStateList colorStateListE = Z.e(context, AbstractC1238a.f17765x);
            if (colorStateListE == null || !colorStateListE.isStateful()) {
                iArr[0] = Z.f43273b;
                iArr2[0] = Z.b(context, AbstractC1238a.f17765x);
                iArr[1] = Z.f43277f;
                iArr2[1] = Z.c(context, AbstractC1238a.f17760s);
                iArr[2] = Z.f43280i;
                iArr2[2] = Z.c(context, AbstractC1238a.f17765x);
            } else {
                int[] iArr3 = Z.f43273b;
                iArr[0] = iArr3;
                iArr2[0] = colorStateListE.getColorForState(iArr3, 0);
                iArr[1] = Z.f43277f;
                iArr2[1] = Z.c(context, AbstractC1238a.f17760s);
                iArr[2] = Z.f43280i;
                iArr2[2] = colorStateListE.getDefaultColor();
            }
            return new ColorStateList(iArr, iArr2);
        }

        public final LayerDrawable l(V v9, Context context, int i9) {
            BitmapDrawable bitmapDrawable;
            BitmapDrawable bitmapDrawable2;
            BitmapDrawable bitmapDrawable3;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(i9);
            Drawable drawableJ = v9.j(context, c.e.f17795F);
            Drawable drawableJ2 = v9.j(context, c.e.f17796G);
            if ((drawableJ instanceof BitmapDrawable) && drawableJ.getIntrinsicWidth() == dimensionPixelSize && drawableJ.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable = (BitmapDrawable) drawableJ;
                bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
            } else {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(bitmapCreateBitmap);
                drawableJ.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ.draw(canvas);
                bitmapDrawable = new BitmapDrawable(bitmapCreateBitmap);
                bitmapDrawable2 = new BitmapDrawable(bitmapCreateBitmap);
            }
            bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
            if ((drawableJ2 instanceof BitmapDrawable) && drawableJ2.getIntrinsicWidth() == dimensionPixelSize && drawableJ2.getIntrinsicHeight() == dimensionPixelSize) {
                bitmapDrawable3 = (BitmapDrawable) drawableJ2;
            } else {
                Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(bitmapCreateBitmap2);
                drawableJ2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                drawableJ2.draw(canvas2);
                bitmapDrawable3 = new BitmapDrawable(bitmapCreateBitmap2);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
            layerDrawable.setId(0, R.id.background);
            layerDrawable.setId(1, R.id.secondaryProgress);
            layerDrawable.setId(2, R.id.progress);
            return layerDrawable;
        }

        public final void m(Drawable drawable, int i9, PorterDuff.Mode mode) {
            if (M.a(drawable)) {
                drawable = drawable.mutate();
            }
            if (mode == null) {
                mode = C2114i.f43338b;
            }
            drawable.setColorFilter(C2114i.e(i9, mode));
        }
    }

    public static synchronized C2114i b() {
        try {
            if (f43339c == null) {
                h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return f43339c;
    }

    public static synchronized PorterDuffColorFilter e(int i9, PorterDuff.Mode mode) {
        return V.l(i9, mode);
    }

    public static synchronized void h() {
        if (f43339c == null) {
            C2114i c2114i = new C2114i();
            f43339c = c2114i;
            c2114i.f43340a = V.h();
            f43339c.f43340a.u(new a());
        }
    }

    public static void i(Drawable drawable, b0 b0Var, int[] iArr) {
        V.w(drawable, b0Var, iArr);
    }

    public synchronized Drawable c(Context context, int i9) {
        return this.f43340a.j(context, i9);
    }

    public synchronized Drawable d(Context context, int i9, boolean z9) {
        return this.f43340a.k(context, i9, z9);
    }

    public synchronized ColorStateList f(Context context, int i9) {
        return this.f43340a.m(context, i9);
    }

    public synchronized void g(Context context) {
        this.f43340a.s(context);
    }
}
