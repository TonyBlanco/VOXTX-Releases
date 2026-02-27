package i2;

import U1.l;
import android.content.res.Resources;
import android.graphics.Bitmap;
import d2.C1660j;
import d2.C1661k;

/* JADX INFO: renamed from: i2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1880b implements InterfaceC1881c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f41829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f41830b;

    public C1880b(Resources resources, V1.b bVar) {
        this.f41829a = resources;
        this.f41830b = bVar;
    }

    @Override // i2.InterfaceC1881c
    public l a(l lVar) {
        return new C1661k(new C1660j(this.f41829a, (Bitmap) lVar.get()), this.f41830b);
    }

    @Override // i2.InterfaceC1881c
    public String getId() {
        return "GlideBitmapDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
