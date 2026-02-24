package h5;

import R4.b;
import R4.k;
import R4.l;
import T.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatRadioButton;
import f5.u;
import i5.AbstractC1893c;
import p5.AbstractC2451a;

/* JADX INFO: renamed from: h5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1861a extends AppCompatRadioButton {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f41662h = k.f8863q;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[][] f41663i = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f41664f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f41665g;

    public C1861a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.f8656B);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1861a(Context context, AttributeSet attributeSet, int i9) {
        int i10 = f41662h;
        super(AbstractC2451a.c(context, attributeSet, i9, i10), attributeSet, i9);
        Context context2 = getContext();
        TypedArray typedArrayH = u.h(context2, attributeSet, l.f8947J3, i9, i10, new int[0]);
        if (typedArrayH.hasValue(l.f8955K3)) {
            c.c(this, AbstractC1893c.a(context2, typedArrayH, l.f8955K3));
        }
        this.f41665g = typedArrayH.getBoolean(l.f8963L3, false);
        typedArrayH.recycle();
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f41664f == null) {
            int iD = Z4.a.d(this, b.f8673h);
            int iD2 = Z4.a.d(this, b.f8675j);
            int iD3 = Z4.a.d(this, b.f8678m);
            int[][] iArr = f41663i;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = Z4.a.h(iD3, iD, 1.0f);
            iArr2[1] = Z4.a.h(iD3, iD2, 0.54f);
            iArr2[2] = Z4.a.h(iD3, iD2, 0.38f);
            iArr2[3] = Z4.a.h(iD3, iD2, 0.38f);
            this.f41664f = new ColorStateList(iArr, iArr2);
        }
        return this.f41664f;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f41665g && c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z9) {
        this.f41665g = z9;
        c.c(this, z9 ? getMaterialThemeColorsTintList() : null);
    }
}
