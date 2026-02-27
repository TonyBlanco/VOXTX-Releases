package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.FileNotFoundException;

/* JADX INFO: loaded from: classes4.dex */
public class z extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39217a;

    public z(Context context) {
        this.f39217a = context;
    }

    public static Bitmap j(Resources resources, int i9, w wVar) {
        BitmapFactory.Options optionsD = y.d(wVar);
        if (y.g(optionsD)) {
            BitmapFactory.decodeResource(resources, i9, optionsD);
            y.b(wVar.f39174h, wVar.f39175i, optionsD, wVar);
        }
        return BitmapFactory.decodeResource(resources, i9, optionsD);
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        if (wVar.f39171e != 0) {
            return true;
        }
        return "android.resource".equals(wVar.f39170d.getScheme());
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i9) throws FileNotFoundException {
        Resources resourcesO = G.o(this.f39217a, wVar);
        return new y.a(j(resourcesO, G.n(resourcesO, wVar), wVar), t.e.DISK);
    }
}
