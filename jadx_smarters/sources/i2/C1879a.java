package i2;

import U1.l;
import h2.C1849a;

/* JADX INFO: renamed from: i2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1879a implements InterfaceC1881c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1881c f41828a;

    public C1879a(InterfaceC1881c interfaceC1881c) {
        this.f41828a = interfaceC1881c;
    }

    @Override // i2.InterfaceC1881c
    public l a(l lVar) {
        C1849a c1849a = (C1849a) lVar.get();
        l lVarA = c1849a.a();
        return lVarA != null ? this.f41828a.a(lVarA) : c1849a.b();
    }

    @Override // i2.InterfaceC1881c
    public String getId() {
        return "GifBitmapWrapperDrawableTranscoder.com.bumptech.glide.load.resource.transcode";
    }
}
