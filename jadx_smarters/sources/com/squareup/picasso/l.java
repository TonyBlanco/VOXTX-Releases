package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.squareup.picasso.t;

/* JADX INFO: loaded from: classes4.dex */
public class l extends AbstractC1607a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC1611e f39108m;

    public l(t tVar, ImageView imageView, w wVar, int i9, int i10, int i11, Drawable drawable, String str, Object obj, InterfaceC1611e interfaceC1611e, boolean z9) {
        super(tVar, imageView, wVar, i9, i10, i11, drawable, str, obj, z9);
        this.f39108m = interfaceC1611e;
    }

    @Override // com.squareup.picasso.AbstractC1607a
    public void a() {
        super.a();
        if (this.f39108m != null) {
            this.f39108m = null;
        }
    }

    @Override // com.squareup.picasso.AbstractC1607a
    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.f39039c.get();
        if (imageView == null) {
            return;
        }
        t tVar = this.f39037a;
        u.c(imageView, tVar.f39131e, bitmap, eVar, this.f39040d, tVar.f39139m);
        InterfaceC1611e interfaceC1611e = this.f39108m;
        if (interfaceC1611e != null) {
            interfaceC1611e.onSuccess();
        }
    }

    @Override // com.squareup.picasso.AbstractC1607a
    public void c() {
        ImageView imageView = (ImageView) this.f39039c.get();
        if (imageView == null) {
            return;
        }
        int i9 = this.f39043g;
        if (i9 != 0) {
            imageView.setImageResource(i9);
        } else {
            Drawable drawable = this.f39044h;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        InterfaceC1611e interfaceC1611e = this.f39108m;
        if (interfaceC1611e != null) {
            interfaceC1611e.a();
        }
    }
}
