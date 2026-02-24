package androidx.leanback.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.widget.TextView;

/* JADX INFO: loaded from: classes.dex */
class ResizingTextView extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f15484a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f15486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f15489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f15491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f15492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f15493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f15494l;

    public ResizingTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i9) {
        this(context, attributeSet, i9, 0);
    }

    public ResizingTextView(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9);
        this.f15489g = false;
        this.f15490h = false;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g0.l.f41090T, i9, i10);
        try {
            this.f15484a = typedArrayObtainStyledAttributes.getInt(g0.l.f41092V, 1);
            this.f15485c = typedArrayObtainStyledAttributes.getDimensionPixelSize(g0.l.f41095Y, -1);
            this.f15486d = typedArrayObtainStyledAttributes.getBoolean(g0.l.f41091U, false);
            this.f15487e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g0.l.f41094X, 0);
            this.f15488f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(g0.l.f41093W, 0);
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final void a(int i9, int i10) {
        if (isPaddingRelative()) {
            setPaddingRelative(getPaddingStart(), i9, getPaddingEnd(), i10);
        } else {
            setPadding(getPaddingLeft(), i9, getPaddingRight(), i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d1 A[PHI: r2
      0x00d1: PHI (r2v7 boolean) = (r2v2 boolean), (r2v9 boolean) binds: [B:41:0x00ce, B:27:0x0099] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r7, int r8) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.ResizingTextView.onMeasure(int, int):void");
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(T.j.r(this, callback));
    }
}
