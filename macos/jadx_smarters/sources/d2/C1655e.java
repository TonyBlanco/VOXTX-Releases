package d2;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: d2.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1655e extends AbstractC1654d {
    public C1655e(V1.b bVar) {
        super(bVar);
    }

    @Override // d2.AbstractC1654d
    public Bitmap b(V1.b bVar, Bitmap bitmap, int i9, int i10) {
        Bitmap bitmapD = bVar.d(i9, i10, bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888);
        Bitmap bitmapA = r.a(bitmapD, bitmap, i9, i10);
        if (bitmapD != null && bitmapD != bitmapA && !bVar.a(bitmapD)) {
            bitmapD.recycle();
        }
        return bitmapA;
    }

    @Override // S1.g
    public String getId() {
        return "CenterCrop.com.bumptech.glide.load.resource.bitmap";
    }
}
