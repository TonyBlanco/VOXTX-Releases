package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import k.C2109d;
import k.C2120o;
import k.Z;
import k.a0;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageView extends ImageView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2109d f13959a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2120o f13960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13961d;

    public AppCompatImageView(Context context) {
        this(context, null);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(Context context, AttributeSet attributeSet, int i9) {
        super(a0.b(context), attributeSet, i9);
        this.f13961d = false;
        Z.a(this, getContext());
        C2109d c2109d = new C2109d(this);
        this.f13959a = c2109d;
        c2109d.e(attributeSet, i9);
        C2120o c2120o = new C2120o(this);
        this.f13960c = c2120o;
        c2120o.g(attributeSet, i9);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2109d c2109d = this.f13959a;
        if (c2109d != null) {
            c2109d.b();
        }
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            c2120o.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2109d c2109d = this.f13959a;
        if (c2109d != null) {
            return c2109d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2109d c2109d = this.f13959a;
        if (c2109d != null) {
            return c2109d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            return c2120o.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            return c2120o.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f13960c.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2109d c2109d = this.f13959a;
        if (c2109d != null) {
            c2109d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i9) {
        super.setBackgroundResource(i9);
        C2109d c2109d = this.f13959a;
        if (c2109d != null) {
            c2109d.g(i9);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            c2120o.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2120o c2120o = this.f13960c;
        if (c2120o != null && drawable != null && !this.f13961d) {
            c2120o.h(drawable);
        }
        super.setImageDrawable(drawable);
        C2120o c2120o2 = this.f13960c;
        if (c2120o2 != null) {
            c2120o2.c();
            if (this.f13961d) {
                return;
            }
            this.f13960c.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i9) {
        super.setImageLevel(i9);
        this.f13961d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i9) {
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            c2120o.i(i9);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            c2120o.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2109d c2109d = this.f13959a;
        if (c2109d != null) {
            c2109d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2109d c2109d = this.f13959a;
        if (c2109d != null) {
            c2109d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            c2120o.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2120o c2120o = this.f13960c;
        if (c2120o != null) {
            c2120o.k(mode);
        }
    }
}
