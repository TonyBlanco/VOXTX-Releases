package d;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.ViewGroup;
import i.AbstractC1872b;

/* JADX INFO: renamed from: d.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1622a {

    /* JADX INFO: renamed from: d.a$a, reason: collision with other inner class name */
    public static class C0309a extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39307a;

        public C0309a(int i9, int i10) {
            super(i9, i10);
            this.f39307a = 8388627;
        }

        public C0309a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f39307a = 0;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, c.j.f18143t);
            this.f39307a = typedArrayObtainStyledAttributes.getInt(c.j.f18148u, 0);
            typedArrayObtainStyledAttributes.recycle();
        }

        public C0309a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f39307a = 0;
        }

        public C0309a(C0309a c0309a) {
            super((ViewGroup.MarginLayoutParams) c0309a);
            this.f39307a = 0;
            this.f39307a = c0309a.f39307a;
        }
    }

    public boolean g() {
        return false;
    }

    public abstract boolean h();

    public abstract void i(boolean z9);

    public abstract int j();

    public abstract Context k();

    public abstract void l();

    public boolean m() {
        return false;
    }

    public void n(Configuration configuration) {
    }

    public void o() {
    }

    public abstract boolean p(int i9, KeyEvent keyEvent);

    public boolean q(KeyEvent keyEvent) {
        return false;
    }

    public boolean r() {
        return false;
    }

    public abstract void s(boolean z9);

    public abstract void t(boolean z9);

    public abstract void u(int i9);

    public abstract void v(boolean z9);

    public abstract void w(CharSequence charSequence);

    public abstract void x(CharSequence charSequence);

    public abstract void y(CharSequence charSequence);

    public AbstractC1872b z(AbstractC1872b.a aVar) {
        return null;
    }
}
