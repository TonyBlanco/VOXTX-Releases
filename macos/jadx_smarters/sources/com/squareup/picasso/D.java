package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.t;

/* JADX INFO: loaded from: classes4.dex */
public final class D extends AbstractC1607a {
    public D(t tVar, C c9, w wVar, int i9, int i10, Drawable drawable, String str, Object obj, int i11) {
        super(tVar, c9, wVar, i9, i10, i11, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.AbstractC1607a
    public void b(Bitmap bitmap, t.e eVar) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        C c9 = (C) k();
        if (c9 != null) {
            c9.b(bitmap, eVar);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.AbstractC1607a
    public void c() {
        C c9 = (C) k();
        if (c9 != null) {
            c9.a(this.f39043g != 0 ? this.f39037a.f39131e.getResources().getDrawable(this.f39043g) : this.f39044h);
        }
    }
}
