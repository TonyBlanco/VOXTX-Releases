package s4;

import android.graphics.Bitmap;
import q4.InterfaceC2546a;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements InterfaceC2546a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AbstractActivityC2709a f49955a;

    public i(AbstractActivityC2709a abstractActivityC2709a) {
        this.f49955a = abstractActivityC2709a;
    }

    @Override // q4.InterfaceC2546a
    public final void zza(Bitmap bitmap) {
        if (bitmap != null) {
            AbstractActivityC2709a abstractActivityC2709a = this.f49955a;
            if (abstractActivityC2709a.f49907H != null) {
                abstractActivityC2709a.f49907H.setVisibility(8);
            }
            AbstractActivityC2709a abstractActivityC2709a2 = this.f49955a;
            if (abstractActivityC2709a2.f49906G != null) {
                abstractActivityC2709a2.f49906G.setVisibility(0);
                this.f49955a.f49906G.setImageBitmap(bitmap);
            }
        }
    }
}
