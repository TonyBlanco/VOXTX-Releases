package o2;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* JADX INFO: renamed from: o2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2307b extends AbstractC2310e {
    public C2307b(ImageView imageView) {
        super(imageView);
    }

    @Override // o2.AbstractC2310e
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void l(Bitmap bitmap) {
        ((ImageView) this.f45762b).setImageBitmap(bitmap);
    }
}
