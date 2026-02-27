package X4;

import R4.b;
import R4.k;
import R4.l;
import T.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatCheckBox;
import f5.u;
import f5.w;
import i5.AbstractC1893c;
import p5.AbstractC2451a;

/* JADX INFO: loaded from: classes3.dex */
public class a extends AppCompatCheckBox {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f10455i = k.f8862p;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[][] f10456j = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f10457f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f10458g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f10459h;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f8670e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f10455i;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        Context context2 = getContext();
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f8907E3, i9, i10, new int[0]);
        if (typedArrayH.hasValue(l.f8915F3)) {
            c.c(this, AbstractC1893c.a(context2, typedArrayH, l.f8915F3));
        }
        this.f10458g = typedArrayH.getBoolean(l.f8931H3, false);
        this.f10459h = typedArrayH.getBoolean(l.f8923G3, true);
        typedArrayH.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f10457f == null) {
            int[][] iArr = f10456j;
            int[] iArr2 = new int[iArr.length];
            int iD = Z4.a.d(this, b.f8673h);
            int iD2 = Z4.a.d(this, b.f8678m);
            int iD3 = Z4.a.d(this, b.f8675j);
            iArr2[0] = Z4.a.h(iD2, iD, 1.0f);
            iArr2[1] = Z4.a.h(iD2, iD3, 0.54f);
            iArr2[2] = Z4.a.h(iD2, iD3, 0.38f);
            iArr2[3] = Z4.a.h(iD2, iD3, 0.38f);
            this.f10457f = new ColorStateList(iArr, iArr2);
        }
        return this.f10457f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f10458g && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        Drawable drawableA;
        if (!this.f10459h || !TextUtils.isEmpty(getText()) || (drawableA = c.a(this)) == null) {
            super.onDraw(canvas);
            return;
        }
        int width = ((getWidth() - drawableA.getIntrinsicWidth()) / 2) * (w.e(this) ? -1 : 1);
        int iSave = canvas.save();
        canvas.translate(width, 0.0f);
        super.onDraw(canvas);
        canvas.restoreToCount(iSave);
        if (getBackground() != null) {
            Rect bounds = drawableA.getBounds();
            H.a.l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
        }
    }

    public void setCenterIfNoTextEnabled(boolean z9) {
        this.f10459h = z9;
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f10458g = z9;
        c.c(this, z9 ? getMaterialThemeColorsTintList() : null);
    }
}
