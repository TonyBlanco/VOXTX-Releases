package q4;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public final class l implements InterfaceC2546a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ n f46845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f46846b;

    public l(p pVar, n nVar) {
        this.f46846b = pVar;
        this.f46845a = nVar;
    }

    @Override // q4.InterfaceC2546a
    public final void zza(Bitmap bitmap) {
        n nVar = this.f46845a;
        nVar.f46855b = bitmap;
        this.f46846b.f46870n = nVar;
        this.f46846b.g();
    }
}
