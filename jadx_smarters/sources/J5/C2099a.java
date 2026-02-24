package j5;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import l5.C2198g;
import l5.k;
import l5.n;

/* JADX INFO: renamed from: j5.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2099a extends Drawable implements n, H.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public b f43039a;

    /* JADX INFO: renamed from: j5.a$b */
    public static final class b extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C2198g f43040a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f43041b;

        public b(b bVar) {
            this.f43040a = (C2198g) bVar.f43040a.getConstantState().newDrawable();
            this.f43041b = bVar.f43041b;
        }

        public b(C2198g c2198g) {
            this.f43040a = c2198g;
            this.f43041b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2099a newDrawable() {
            return new C2099a(new b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }
    }

    public C2099a(b bVar) {
        this.f43039a = bVar;
    }

    public C2099a(k kVar) {
        this(new b(new C2198g(kVar)));
    }

    @Override // android.graphics.drawable.Drawable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C2099a mutate() {
        this.f43039a = new b(this.f43039a);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        b bVar = this.f43039a;
        if (bVar.f43041b) {
            bVar.f43040a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f43039a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f43039a.f43040a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f43039a.f43040a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        if (this.f43039a.f43040a.setState(iArr)) {
            zOnStateChange = true;
        }
        boolean zE = AbstractC2100b.e(iArr);
        b bVar = this.f43039a;
        if (bVar.f43041b == zE) {
            return zOnStateChange;
        }
        bVar.f43041b = zE;
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i9) {
        this.f43039a.f43040a.setAlpha(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f43039a.f43040a.setColorFilter(colorFilter);
    }

    @Override // l5.n
    public void setShapeAppearanceModel(k kVar) {
        this.f43039a.f43040a.setShapeAppearanceModel(kVar);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i9) {
        this.f43039a.f43040a.setTint(i9);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f43039a.f43040a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f43039a.f43040a.setTintMode(mode);
    }
}
