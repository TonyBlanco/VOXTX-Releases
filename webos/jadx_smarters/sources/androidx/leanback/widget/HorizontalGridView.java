package androidx.leanback.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.Shader;
import android.util.AttributeSet;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class HorizontalGridView extends AbstractC1147b {

    /* JADX INFO: renamed from: T0, reason: collision with root package name */
    public boolean f15356T0;

    /* JADX INFO: renamed from: U0, reason: collision with root package name */
    public boolean f15357U0;

    /* JADX INFO: renamed from: V0, reason: collision with root package name */
    public Paint f15358V0;

    /* JADX INFO: renamed from: W0, reason: collision with root package name */
    public Bitmap f15359W0;

    /* JADX INFO: renamed from: X0, reason: collision with root package name */
    public LinearGradient f15360X0;

    /* JADX INFO: renamed from: Y0, reason: collision with root package name */
    public int f15361Y0;

    /* JADX INFO: renamed from: Z0, reason: collision with root package name */
    public int f15362Z0;

    /* JADX INFO: renamed from: a1, reason: collision with root package name */
    public Bitmap f15363a1;

    /* JADX INFO: renamed from: b1, reason: collision with root package name */
    public LinearGradient f15364b1;

    /* JADX INFO: renamed from: c1, reason: collision with root package name */
    public int f15365c1;

    /* JADX INFO: renamed from: d1, reason: collision with root package name */
    public int f15366d1;

    /* JADX INFO: renamed from: e1, reason: collision with root package name */
    public Rect f15367e1;

    public HorizontalGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HorizontalGridView(Context context, AttributeSet attributeSet, int i9) {
        super(context, attributeSet, i9);
        this.f15358V0 = new Paint();
        this.f15367e1 = new Rect();
        this.f15622M0.q4(0);
        F1(context, attributeSet);
    }

    private Bitmap getTempBitmapHigh() {
        Bitmap bitmap = this.f15363a1;
        if (bitmap == null || bitmap.getWidth() != this.f15365c1 || this.f15363a1.getHeight() != getHeight()) {
            this.f15363a1 = Bitmap.createBitmap(this.f15365c1, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f15363a1;
    }

    private Bitmap getTempBitmapLow() {
        Bitmap bitmap = this.f15359W0;
        if (bitmap == null || bitmap.getWidth() != this.f15361Y0 || this.f15359W0.getHeight() != getHeight()) {
            this.f15359W0 = Bitmap.createBitmap(this.f15361Y0, getHeight(), Bitmap.Config.ARGB_8888);
        }
        return this.f15359W0;
    }

    public void F1(Context context, AttributeSet attributeSet) {
        D1(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.l.f41085O);
        setRowHeight(typedArrayObtainStyledAttributes);
        setNumRows(typedArrayObtainStyledAttributes.getInt(g0.l.f41086P, 1));
        typedArrayObtainStyledAttributes.recycle();
        I1();
        Paint paint = new Paint();
        this.f15358V0 = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
    }

    public final boolean G1() {
        if (!this.f15357U0) {
            return false;
        }
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (this.f15622M0.O2(getChildAt(childCount)) > (getWidth() - getPaddingRight()) + this.f15366d1) {
                return true;
            }
        }
        return false;
    }

    public final boolean H1() {
        if (!this.f15356T0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i9 = 0; i9 < childCount; i9++) {
            if (this.f15622M0.N2(getChildAt(i9)) < getPaddingLeft() - this.f15362Z0) {
                return true;
            }
        }
        return false;
    }

    public final void I1() {
        if (this.f15356T0 || this.f15357U0) {
            setLayerType(2, null);
            setWillNotDraw(false);
        } else {
            setLayerType(0, null);
            setWillNotDraw(true);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public void draw(Canvas canvas) {
        boolean zH1 = H1();
        boolean zG1 = G1();
        if (!zH1) {
            this.f15359W0 = null;
        }
        if (!zG1) {
            this.f15363a1 = null;
        }
        if (!zH1 && !zG1) {
            super.draw(canvas);
            return;
        }
        int paddingLeft = this.f15356T0 ? (getPaddingLeft() - this.f15362Z0) - this.f15361Y0 : 0;
        int width = this.f15357U0 ? (getWidth() - getPaddingRight()) + this.f15366d1 + this.f15365c1 : getWidth();
        int iSave = canvas.save();
        canvas.clipRect((this.f15356T0 ? this.f15361Y0 : 0) + paddingLeft, 0, width - (this.f15357U0 ? this.f15365c1 : 0), getHeight());
        super.draw(canvas);
        canvas.restoreToCount(iSave);
        Canvas canvas2 = new Canvas();
        Rect rect = this.f15367e1;
        rect.top = 0;
        rect.bottom = getHeight();
        if (zH1 && this.f15361Y0 > 0) {
            Bitmap tempBitmapLow = getTempBitmapLow();
            tempBitmapLow.eraseColor(0);
            canvas2.setBitmap(tempBitmapLow);
            int iSave2 = canvas2.save();
            canvas2.clipRect(0, 0, this.f15361Y0, getHeight());
            float f9 = -paddingLeft;
            canvas2.translate(f9, 0.0f);
            super.draw(canvas2);
            canvas2.restoreToCount(iSave2);
            this.f15358V0.setShader(this.f15360X0);
            canvas2.drawRect(0.0f, 0.0f, this.f15361Y0, getHeight(), this.f15358V0);
            Rect rect2 = this.f15367e1;
            rect2.left = 0;
            rect2.right = this.f15361Y0;
            canvas.translate(paddingLeft, 0.0f);
            Rect rect3 = this.f15367e1;
            canvas.drawBitmap(tempBitmapLow, rect3, rect3, (Paint) null);
            canvas.translate(f9, 0.0f);
        }
        if (!zG1 || this.f15365c1 <= 0) {
            return;
        }
        Bitmap tempBitmapHigh = getTempBitmapHigh();
        tempBitmapHigh.eraseColor(0);
        canvas2.setBitmap(tempBitmapHigh);
        int iSave3 = canvas2.save();
        canvas2.clipRect(0, 0, this.f15365c1, getHeight());
        canvas2.translate(-(width - this.f15365c1), 0.0f);
        super.draw(canvas2);
        canvas2.restoreToCount(iSave3);
        this.f15358V0.setShader(this.f15364b1);
        canvas2.drawRect(0.0f, 0.0f, this.f15365c1, getHeight(), this.f15358V0);
        Rect rect4 = this.f15367e1;
        rect4.left = 0;
        rect4.right = this.f15365c1;
        canvas.translate(width - r5, 0.0f);
        Rect rect5 = this.f15367e1;
        canvas.drawBitmap(tempBitmapHigh, rect5, rect5, (Paint) null);
        canvas.translate(-(width - this.f15365c1), 0.0f);
    }

    public final boolean getFadingLeftEdge() {
        return this.f15356T0;
    }

    public final int getFadingLeftEdgeLength() {
        return this.f15361Y0;
    }

    public final int getFadingLeftEdgeOffset() {
        return this.f15362Z0;
    }

    public final boolean getFadingRightEdge() {
        return this.f15357U0;
    }

    public final int getFadingRightEdgeLength() {
        return this.f15365c1;
    }

    public final int getFadingRightEdgeOffset() {
        return this.f15366d1;
    }

    public final void setFadingLeftEdge(boolean z9) {
        if (this.f15356T0 != z9) {
            this.f15356T0 = z9;
            if (!z9) {
                this.f15359W0 = null;
            }
            invalidate();
            I1();
        }
    }

    public final void setFadingLeftEdgeLength(int i9) {
        if (this.f15361Y0 != i9) {
            this.f15361Y0 = i9;
            this.f15360X0 = i9 != 0 ? new LinearGradient(0.0f, 0.0f, this.f15361Y0, 0.0f, 0, DefaultRenderer.BACKGROUND_COLOR, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingLeftEdgeOffset(int i9) {
        if (this.f15362Z0 != i9) {
            this.f15362Z0 = i9;
            invalidate();
        }
    }

    public final void setFadingRightEdge(boolean z9) {
        if (this.f15357U0 != z9) {
            this.f15357U0 = z9;
            if (!z9) {
                this.f15363a1 = null;
            }
            invalidate();
            I1();
        }
    }

    public final void setFadingRightEdgeLength(int i9) {
        if (this.f15365c1 != i9) {
            this.f15365c1 = i9;
            this.f15364b1 = i9 != 0 ? new LinearGradient(0.0f, 0.0f, this.f15365c1, 0.0f, DefaultRenderer.BACKGROUND_COLOR, 0, Shader.TileMode.CLAMP) : null;
            invalidate();
        }
    }

    public final void setFadingRightEdgeOffset(int i9) {
        if (this.f15366d1 != i9) {
            this.f15366d1 = i9;
            invalidate();
        }
    }

    public void setNumRows(int i9) {
        this.f15622M0.m4(i9);
        requestLayout();
    }

    public void setRowHeight(int i9) {
        this.f15622M0.s4(i9);
        requestLayout();
    }

    public void setRowHeight(TypedArray typedArray) {
        if (typedArray.peekValue(g0.l.f41087Q) != null) {
            setRowHeight(typedArray.getLayoutDimension(g0.l.f41087Q, 0));
        }
    }
}
