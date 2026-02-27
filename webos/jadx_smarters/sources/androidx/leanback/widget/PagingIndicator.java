package androidx.leanback.widget;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import g0.AbstractC1797b;
import g0.AbstractC1798c;
import g0.AbstractC1799d;

/* JADX INFO: loaded from: classes.dex */
public class PagingIndicator extends View {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final TimeInterpolator f15426B = new DecelerateInterpolator();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final Property f15427C = new a(Float.class, "alpha");

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Property f15428D = new b(Float.class, "diameter");

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Property f15429E = new c(Float.class, "translation_x");

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final float f15430A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15431a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f15432c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f15433d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f15434e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f15435f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f15436g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f15437h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f15438i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public d[] f15439j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int[] f15440k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int[] f15441l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int[] f15442m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f15443n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15444o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15445p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15446q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15447r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Paint f15448s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Paint f15449t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final AnimatorSet f15450u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final AnimatorSet f15451v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AnimatorSet f15452w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Bitmap f15453x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Paint f15454y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Rect f15455z;

    public static class a extends Property {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.d());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f9) {
            dVar.i(f9.floatValue());
        }
    }

    public static class b extends Property {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.e());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f9) {
            dVar.j(f9.floatValue());
        }
    }

    public static class c extends Property {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.f());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f9) {
            dVar.k(f9.floatValue());
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f15456a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f15457b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f15458c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f15459d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f15460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f15461f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f15462g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f15463h = 1.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f15464i;

        public d() {
            this.f15464i = PagingIndicator.this.f15431a ? 1.0f : -1.0f;
        }

        public void a() {
            this.f15457b = Color.argb(Math.round(this.f15456a * 255.0f), Color.red(PagingIndicator.this.f15447r), Color.green(PagingIndicator.this.f15447r), Color.blue(PagingIndicator.this.f15447r));
        }

        public void b() {
            this.f15458c = 0.0f;
            this.f15459d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f15460e = pagingIndicator.f15432c;
            float f9 = pagingIndicator.f15433d;
            this.f15461f = f9;
            this.f15462g = f9 * pagingIndicator.f15430A;
            this.f15456a = 0.0f;
            a();
        }

        public void c(Canvas canvas) {
            float f9 = this.f15459d + this.f15458c;
            canvas.drawCircle(f9, r1.f15443n, this.f15461f, PagingIndicator.this.f15448s);
            if (this.f15456a > 0.0f) {
                PagingIndicator.this.f15449t.setColor(this.f15457b);
                canvas.drawCircle(f9, r1.f15443n, this.f15461f, PagingIndicator.this.f15449t);
                PagingIndicator pagingIndicator = PagingIndicator.this;
                Bitmap bitmap = pagingIndicator.f15453x;
                Rect rect = pagingIndicator.f15455z;
                float f10 = this.f15462g;
                int i9 = PagingIndicator.this.f15443n;
                canvas.drawBitmap(bitmap, rect, new Rect((int) (f9 - f10), (int) (i9 - f10), (int) (f9 + f10), (int) (i9 + f10)), PagingIndicator.this.f15454y);
            }
        }

        public float d() {
            return this.f15456a;
        }

        public float e() {
            return this.f15460e;
        }

        public float f() {
            return this.f15458c;
        }

        public void g() {
            this.f15464i = PagingIndicator.this.f15431a ? 1.0f : -1.0f;
        }

        public void h() {
            this.f15458c = 0.0f;
            this.f15459d = 0.0f;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f15460e = pagingIndicator.f15435f;
            float f9 = pagingIndicator.f15436g;
            this.f15461f = f9;
            this.f15462g = f9 * pagingIndicator.f15430A;
            this.f15456a = 1.0f;
            a();
        }

        public void i(float f9) {
            this.f15456a = f9;
            a();
            PagingIndicator.this.invalidate();
        }

        public void j(float f9) {
            this.f15460e = f9;
            float f10 = f9 / 2.0f;
            this.f15461f = f10;
            PagingIndicator pagingIndicator = PagingIndicator.this;
            this.f15462g = f10 * pagingIndicator.f15430A;
            pagingIndicator.invalidate();
        }

        public void k(float f9) {
            this.f15458c = f9 * this.f15463h * this.f15464i;
            PagingIndicator.this.invalidate();
        }
    }

    public PagingIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PagingIndicator(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f15452w = animatorSet;
        Resources resources = getResources();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.l.f41125p, i9, 0);
        int iG = g(typedArrayObtainStyledAttributes, g0.l.f41132w, AbstractC1798c.f40983k);
        this.f15433d = iG;
        this.f15432c = iG * 2;
        int iG2 = g(typedArrayObtainStyledAttributes, g0.l.f41128s, AbstractC1798c.f40979g);
        this.f15436g = iG2;
        int i10 = iG2 * 2;
        this.f15435f = i10;
        this.f15434e = g(typedArrayObtainStyledAttributes, g0.l.f41131v, AbstractC1798c.f40982j);
        this.f15437h = g(typedArrayObtainStyledAttributes, g0.l.f41130u, AbstractC1798c.f40978f);
        int iF = f(typedArrayObtainStyledAttributes, g0.l.f41129t, AbstractC1797b.f40962d);
        Paint paint = new Paint(1);
        this.f15448s = paint;
        paint.setColor(iF);
        this.f15447r = f(typedArrayObtainStyledAttributes, g0.l.f41126q, AbstractC1797b.f40960b);
        if (this.f15454y == null && typedArrayObtainStyledAttributes.hasValue(g0.l.f41127r)) {
            setArrowColor(typedArrayObtainStyledAttributes.getColor(g0.l.f41127r, 0));
        }
        typedArrayObtainStyledAttributes.recycle();
        this.f15431a = resources.getConfiguration().getLayoutDirection() == 0;
        int color = resources.getColor(AbstractC1797b.f40961c);
        int dimensionPixelSize = resources.getDimensionPixelSize(AbstractC1798c.f40981i);
        this.f15438i = dimensionPixelSize;
        Paint paint2 = new Paint(1);
        this.f15449t = paint2;
        float dimensionPixelSize2 = resources.getDimensionPixelSize(AbstractC1798c.f40980h);
        paint2.setShadowLayer(dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize2, color);
        this.f15453x = h();
        this.f15455z = new Rect(0, 0, this.f15453x.getWidth(), this.f15453x.getHeight());
        this.f15430A = this.f15453x.getWidth() / i10;
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f15450u = animatorSet2;
        animatorSet2.playTogether(c(0.0f, 1.0f), d(iG * 2, iG2 * 2), e());
        AnimatorSet animatorSet3 = new AnimatorSet();
        this.f15451v = animatorSet3;
        animatorSet3.playTogether(c(1.0f, 0.0f), d(iG2 * 2, iG * 2), e());
        animatorSet.playTogether(animatorSet2, animatorSet3);
        setLayerType(1, null);
    }

    private int getDesiredHeight() {
        return getPaddingTop() + this.f15435f + getPaddingBottom() + this.f15438i;
    }

    private int getDesiredWidth() {
        return getPaddingLeft() + getRequiredWidth() + getPaddingRight();
    }

    private int getRequiredWidth() {
        return (this.f15433d * 2) + (this.f15437h * 2) + ((this.f15444o - 3) * this.f15434e);
    }

    private void setSelectedPage(int i9) {
        if (i9 == this.f15445p) {
            return;
        }
        this.f15445p = i9;
        a();
    }

    public final void a() {
        int i9;
        int i10 = 0;
        while (true) {
            i9 = this.f15445p;
            if (i10 >= i9) {
                break;
            }
            this.f15439j[i10].b();
            d dVar = this.f15439j[i10];
            if (i10 != this.f15446q) {
                f = 1.0f;
            }
            dVar.f15463h = f;
            dVar.f15459d = this.f15441l[i10];
            i10++;
        }
        this.f15439j[i9].h();
        d[] dVarArr = this.f15439j;
        int i11 = this.f15445p;
        d dVar2 = dVarArr[i11];
        dVar2.f15463h = this.f15446q >= i11 ? 1.0f : -1.0f;
        int i12 = this.f15440k[i11];
        while (true) {
            dVar2.f15459d = i12;
            i11++;
            if (i11 >= this.f15444o) {
                return;
            }
            this.f15439j[i11].b();
            dVar2 = this.f15439j[i11];
            dVar2.f15463h = 1.0f;
            i12 = this.f15442m[i11];
        }
    }

    public final void b() {
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int requiredWidth = getRequiredWidth();
        int i9 = (paddingLeft + width) / 2;
        int i10 = this.f15444o;
        int[] iArr = new int[i10];
        this.f15440k = iArr;
        int[] iArr2 = new int[i10];
        this.f15441l = iArr2;
        int[] iArr3 = new int[i10];
        this.f15442m = iArr3;
        int i11 = 1;
        int i12 = requiredWidth / 2;
        if (this.f15431a) {
            int i13 = i9 - i12;
            int i14 = this.f15433d;
            int i15 = this.f15434e;
            int i16 = this.f15437h;
            iArr[0] = ((i13 + i14) - i15) + i16;
            iArr2[0] = i13 + i14;
            iArr3[0] = ((i13 + i14) - (i15 * 2)) + (i16 * 2);
            while (i11 < this.f15444o) {
                int[] iArr4 = this.f15440k;
                int[] iArr5 = this.f15441l;
                int i17 = i11 - 1;
                int i18 = iArr5[i17];
                int i19 = this.f15437h;
                iArr4[i11] = i18 + i19;
                iArr5[i11] = iArr5[i17] + this.f15434e;
                this.f15442m[i11] = iArr4[i17] + i19;
                i11++;
            }
        } else {
            int i20 = i9 + i12;
            int i21 = this.f15433d;
            int i22 = this.f15434e;
            int i23 = this.f15437h;
            iArr[0] = ((i20 - i21) + i22) - i23;
            iArr2[0] = i20 - i21;
            iArr3[0] = ((i20 - i21) + (i22 * 2)) - (i23 * 2);
            while (i11 < this.f15444o) {
                int[] iArr6 = this.f15440k;
                int[] iArr7 = this.f15441l;
                int i24 = i11 - 1;
                int i25 = iArr7[i24];
                int i26 = this.f15437h;
                iArr6[i11] = i25 - i26;
                iArr7[i11] = iArr7[i24] - this.f15434e;
                this.f15442m[i11] = iArr6[i24] - i26;
                i11++;
            }
        }
        this.f15443n = paddingTop + this.f15436g;
        a();
    }

    public final Animator c(float f9, float f10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) f15427C, f9, f10);
        objectAnimatorOfFloat.setDuration(167L);
        objectAnimatorOfFloat.setInterpolator(f15426B);
        return objectAnimatorOfFloat;
    }

    public final Animator d(float f9, float f10) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) f15428D, f9, f10);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(f15426B);
        return objectAnimatorOfFloat;
    }

    public final Animator e() {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat((Object) null, (Property<Object, Float>) f15429E, (-this.f15437h) + this.f15434e, 0.0f);
        objectAnimatorOfFloat.setDuration(417L);
        objectAnimatorOfFloat.setInterpolator(f15426B);
        return objectAnimatorOfFloat;
    }

    public final int f(TypedArray typedArray, int i9, int i10) {
        return typedArray.getColor(i9, getResources().getColor(i10));
    }

    public final int g(TypedArray typedArray, int i9, int i10) {
        return typedArray.getDimensionPixelOffset(i9, getResources().getDimensionPixelOffset(i10));
    }

    public int[] getDotSelectedLeftX() {
        return this.f15441l;
    }

    public int[] getDotSelectedRightX() {
        return this.f15442m;
    }

    public int[] getDotSelectedX() {
        return this.f15440k;
    }

    public int getPageCount() {
        return this.f15444o;
    }

    public final Bitmap h() {
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), AbstractC1799d.f40998b);
        if (this.f15431a) {
            return bitmapDecodeResource;
        }
        Matrix matrix = new Matrix();
        matrix.preScale(-1.0f, 1.0f);
        return Bitmap.createBitmap(bitmapDecodeResource, 0, 0, bitmapDecodeResource.getWidth(), bitmapDecodeResource.getHeight(), matrix, false);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        for (int i9 = 0; i9 < this.f15444o; i9++) {
            this.f15439j[i9].c(canvas);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i9, int i10) {
        int desiredHeight = getDesiredHeight();
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            desiredHeight = Math.min(desiredHeight, View.MeasureSpec.getSize(i10));
        } else if (mode == 1073741824) {
            desiredHeight = View.MeasureSpec.getSize(i10);
        }
        int desiredWidth = getDesiredWidth();
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode2 == Integer.MIN_VALUE) {
            desiredWidth = Math.min(desiredWidth, View.MeasureSpec.getSize(i9));
        } else if (mode2 == 1073741824) {
            desiredWidth = View.MeasureSpec.getSize(i9);
        }
        setMeasuredDimension(desiredWidth, desiredHeight);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i9) {
        super.onRtlPropertiesChanged(i9);
        boolean z9 = i9 == 0;
        if (this.f15431a != z9) {
            this.f15431a = z9;
            this.f15453x = h();
            d[] dVarArr = this.f15439j;
            if (dVarArr != null) {
                for (d dVar : dVarArr) {
                    dVar.g();
                }
            }
            b();
            invalidate();
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        setMeasuredDimension(i9, i10);
        b();
    }

    public void setArrowBackgroundColor(int i9) {
        this.f15447r = i9;
    }

    public void setArrowColor(int i9) {
        if (this.f15454y == null) {
            this.f15454y = new Paint();
        }
        this.f15454y.setColorFilter(new PorterDuffColorFilter(i9, PorterDuff.Mode.SRC_IN));
    }

    public void setDotBackgroundColor(int i9) {
        this.f15448s.setColor(i9);
    }

    public void setPageCount(int i9) {
        if (i9 <= 0) {
            throw new IllegalArgumentException("The page count should be a positive integer");
        }
        this.f15444o = i9;
        this.f15439j = new d[i9];
        for (int i10 = 0; i10 < this.f15444o; i10++) {
            this.f15439j[i10] = new d();
        }
        b();
        setSelectedPage(0);
    }
}
