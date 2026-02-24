package k;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;

/* JADX INFO: renamed from: k.q, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2122q extends PopupWindow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f43394b = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f43395a;

    public C2122q(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
        a(context, attributeSet, i9, i10);
    }

    public final void a(Context context, AttributeSet attributeSet, int i9, int i10) {
        d0 d0VarV = d0.v(context, attributeSet, c.j.f18081g2, i9, i10);
        if (d0VarV.s(c.j.f18091i2)) {
            b(d0VarV.a(c.j.f18091i2, false));
        }
        setBackgroundDrawable(d0VarV.g(c.j.f18086h2));
        d0VarV.w();
    }

    public final void b(boolean z9) {
        if (f43394b) {
            this.f43395a = z9;
        } else {
            T.h.a(this, z9);
        }
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i9, int i10) {
        if (f43394b && this.f43395a) {
            i10 -= view.getHeight();
        }
        super.showAsDropDown(view, i9, i10);
    }

    @Override // android.widget.PopupWindow
    public void showAsDropDown(View view, int i9, int i10, int i11) {
        if (f43394b && this.f43395a) {
            i10 -= view.getHeight();
        }
        super.showAsDropDown(view, i9, i10, i11);
    }

    @Override // android.widget.PopupWindow
    public void update(View view, int i9, int i10, int i11, int i12) {
        if (f43394b && this.f43395a) {
            i10 -= view.getHeight();
        }
        super.update(view, i9, i10, i11, i12);
    }
}
