package com.squareup.picasso;

import android.content.Context;
import com.squareup.picasso.t;
import com.squareup.picasso.y;
import java.io.InputStream;

/* JADX INFO: renamed from: com.squareup.picasso.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public class C1613g extends y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f39078a;

    public C1613g(Context context) {
        this.f39078a = context;
    }

    @Override // com.squareup.picasso.y
    public boolean c(w wVar) {
        return "content".equals(wVar.f39170d.getScheme());
    }

    @Override // com.squareup.picasso.y
    public y.a f(w wVar, int i9) {
        return new y.a(j(wVar), t.e.DISK);
    }

    public InputStream j(w wVar) {
        return this.f39078a.getContentResolver().openInputStream(wVar.f39170d);
    }
}
