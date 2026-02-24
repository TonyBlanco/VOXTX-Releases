package g2;

import U1.l;
import android.graphics.Bitmap;
import d2.C1653c;

/* JADX INFO: loaded from: classes.dex */
public class e implements S1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S1.g f41284a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f41285b;

    public e(S1.g gVar, V1.b bVar) {
        this.f41284a = gVar;
        this.f41285b = bVar;
    }

    @Override // S1.g
    public l a(l lVar, int i9, int i10) {
        b bVar = (b) lVar.get();
        Bitmap bitmapE = ((b) lVar.get()).e();
        Bitmap bitmap = (Bitmap) this.f41284a.a(new C1653c(bitmapE, this.f41285b), i9, i10).get();
        return !bitmap.equals(bitmapE) ? new d(new b(bVar, bitmap, this.f41284a)) : lVar;
    }

    @Override // S1.g
    public String getId() {
        return this.f41284a.getId();
    }
}
