package androidx.cardview.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import q.AbstractC2513a;
import q.AbstractC2514b;
import q.AbstractC2515c;
import q.AbstractC2516d;
import r.C2652a;
import r.b;
import r.c;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends FrameLayout {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f14237i = {R.attr.colorBackground};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f14238j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14239a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14241d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14242e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Rect f14243f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f14244g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b f14245h;

    public class a implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Drawable f14246a;

        public a() {
        }

        @Override // r.b
        public void a(int i9, int i10, int i11, int i12) {
            CardView.this.f14244g.set(i9, i10, i11, i12);
            CardView cardView = CardView.this;
            Rect rect = cardView.f14243f;
            CardView.super.setPadding(i9 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
        }

        @Override // r.b
        public void b(Drawable drawable) {
            this.f14246a = drawable;
            CardView.this.setBackgroundDrawable(drawable);
        }

        @Override // r.b
        public boolean c() {
            return CardView.this.getUseCompatPadding();
        }

        @Override // r.b
        public Drawable d() {
            return this.f14246a;
        }

        @Override // r.b
        public boolean e() {
            return CardView.this.getPreventCornerOverlap();
        }

        @Override // r.b
        public View f() {
            return CardView.this;
        }
    }

    static {
        C2652a c2652a = new C2652a();
        f14238j = c2652a;
        c2652a.l();
    }

    public CardView(Context context) {
        this(context, null);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC2513a.f46741a);
    }

    public CardView(Context context, AttributeSet attributeSet, int i9) {
        Resources resources;
        int i10;
        ColorStateList colorStateListValueOf;
        super(context, attributeSet, i9);
        Rect rect = new Rect();
        this.f14243f = rect;
        this.f14244g = new Rect();
        a aVar = new a();
        this.f14245h = aVar;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC2516d.f46745a, i9, AbstractC2515c.f46744a);
        if (typedArrayObtainStyledAttributes.hasValue(AbstractC2516d.f46748d)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(AbstractC2516d.f46748d);
        } else {
            TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(f14237i);
            int color = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color, fArr);
            if (fArr[2] > 0.5f) {
                resources = getResources();
                i10 = AbstractC2514b.f46743b;
            } else {
                resources = getResources();
                i10 = AbstractC2514b.f46742a;
            }
            colorStateListValueOf = ColorStateList.valueOf(resources.getColor(i10));
        }
        ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(AbstractC2516d.f46749e, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(AbstractC2516d.f46750f, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(AbstractC2516d.f46751g, 0.0f);
        this.f14239a = typedArrayObtainStyledAttributes.getBoolean(AbstractC2516d.f46753i, false);
        this.f14240c = typedArrayObtainStyledAttributes.getBoolean(AbstractC2516d.f46752h, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2516d.f46754j, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2516d.f46756l, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2516d.f46758n, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2516d.f46757m, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2516d.f46755k, dimensionPixelSize);
        float f9 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.f14241d = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2516d.f46746b, 0);
        this.f14242e = typedArrayObtainStyledAttributes.getDimensionPixelSize(AbstractC2516d.f46747c, 0);
        typedArrayObtainStyledAttributes.recycle();
        f14238j.a(aVar, context, colorStateList, dimension, dimension2, f9);
    }

    public ColorStateList getCardBackgroundColor() {
        return f14238j.g(this.f14245h);
    }

    public float getCardElevation() {
        return f14238j.h(this.f14245h);
    }

    public int getContentPaddingBottom() {
        return this.f14243f.bottom;
    }

    public int getContentPaddingLeft() {
        return this.f14243f.left;
    }

    public int getContentPaddingRight() {
        return this.f14243f.right;
    }

    public int getContentPaddingTop() {
        return this.f14243f.top;
    }

    public float getMaxCardElevation() {
        return f14238j.i(this.f14245h);
    }

    public boolean getPreventCornerOverlap() {
        return this.f14240c;
    }

    public float getRadius() {
        return f14238j.k(this.f14245h);
    }

    public boolean getUseCompatPadding() {
        return this.f14239a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        if (!(f14238j instanceof C2652a)) {
            int mode = View.MeasureSpec.getMode(i9);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i9 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.j(this.f14245h)), View.MeasureSpec.getSize(i9)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i10);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i10 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(r0.b(this.f14245h)), View.MeasureSpec.getSize(i10)), mode2);
            }
        }
        super.onMeasure(i9, i10);
    }

    public void setCardBackgroundColor(int i9) {
        f14238j.n(this.f14245h, ColorStateList.valueOf(i9));
    }

    public void setCardBackgroundColor(ColorStateList colorStateList) {
        f14238j.n(this.f14245h, colorStateList);
    }

    public void setCardElevation(float f9) {
        f14238j.c(this.f14245h, f9);
    }

    public void setMaxCardElevation(float f9) {
        f14238j.m(this.f14245h, f9);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i9) {
        this.f14242e = i9;
        super.setMinimumHeight(i9);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i9) {
        this.f14241d = i9;
        super.setMinimumWidth(i9);
    }

    @Override // android.view.View
    public void setPadding(int i9, int i10, int i11, int i12) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i9, int i10, int i11, int i12) {
    }

    public void setPreventCornerOverlap(boolean z9) {
        if (z9 != this.f14240c) {
            this.f14240c = z9;
            f14238j.d(this.f14245h);
        }
    }

    public void setRadius(float f9) {
        f14238j.f(this.f14245h, f9);
    }

    public void setUseCompatPadding(boolean z9) {
        if (this.f14239a != z9) {
            this.f14239a = z9;
            f14238j.e(this.f14245h);
        }
    }
}
