package k;

import F.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import e.AbstractC1726a;

/* JADX INFO: loaded from: classes.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43313a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f43314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f43315c;

    public d0(Context context, TypedArray typedArray) {
        this.f43313a = context;
        this.f43314b = typedArray;
    }

    public static d0 t(Context context, int i9, int[] iArr) {
        return new d0(context, context.obtainStyledAttributes(i9, iArr));
    }

    public static d0 u(Context context, AttributeSet attributeSet, int[] iArr) {
        return new d0(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static d0 v(Context context, AttributeSet attributeSet, int[] iArr, int i9, int i10) {
        return new d0(context, context.obtainStyledAttributes(attributeSet, iArr, i9, i10));
    }

    public boolean a(int i9, boolean z9) {
        return this.f43314b.getBoolean(i9, z9);
    }

    public int b(int i9, int i10) {
        return this.f43314b.getColor(i9, i10);
    }

    public ColorStateList c(int i9) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f43314b.hasValue(i9) || (resourceId = this.f43314b.getResourceId(i9, 0)) == 0 || (colorStateListA = AbstractC1726a.a(this.f43313a, resourceId)) == null) ? this.f43314b.getColorStateList(i9) : colorStateListA;
    }

    public float d(int i9, float f9) {
        return this.f43314b.getDimension(i9, f9);
    }

    public int e(int i9, int i10) {
        return this.f43314b.getDimensionPixelOffset(i9, i10);
    }

    public int f(int i9, int i10) {
        return this.f43314b.getDimensionPixelSize(i9, i10);
    }

    public Drawable g(int i9) {
        int resourceId;
        return (!this.f43314b.hasValue(i9) || (resourceId = this.f43314b.getResourceId(i9, 0)) == 0) ? this.f43314b.getDrawable(i9) : AbstractC1726a.b(this.f43313a, resourceId);
    }

    public Drawable h(int i9) {
        int resourceId;
        if (!this.f43314b.hasValue(i9) || (resourceId = this.f43314b.getResourceId(i9, 0)) == 0) {
            return null;
        }
        return C2114i.b().d(this.f43313a, resourceId, true);
    }

    public float i(int i9, float f9) {
        return this.f43314b.getFloat(i9, f9);
    }

    public Typeface j(int i9, int i10, h.e eVar) {
        int resourceId = this.f43314b.getResourceId(i9, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f43315c == null) {
            this.f43315c = new TypedValue();
        }
        return F.h.i(this.f43313a, resourceId, this.f43315c, i10, eVar);
    }

    public int k(int i9, int i10) {
        return this.f43314b.getInt(i9, i10);
    }

    public int l(int i9, int i10) {
        return this.f43314b.getInteger(i9, i10);
    }

    public int m(int i9, int i10) {
        return this.f43314b.getLayoutDimension(i9, i10);
    }

    public int n(int i9, int i10) {
        return this.f43314b.getResourceId(i9, i10);
    }

    public String o(int i9) {
        return this.f43314b.getString(i9);
    }

    public CharSequence p(int i9) {
        return this.f43314b.getText(i9);
    }

    public CharSequence[] q(int i9) {
        return this.f43314b.getTextArray(i9);
    }

    public TypedArray r() {
        return this.f43314b;
    }

    public boolean s(int i9) {
        return this.f43314b.hasValue(i9);
    }

    public void w() {
        this.f43314b.recycle();
    }
}
