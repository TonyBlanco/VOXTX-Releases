package d2;

import android.graphics.Bitmap;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: d2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1654d implements S1.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public V1.b f39522a;

    public AbstractC1654d(V1.b bVar) {
        this.f39522a = bVar;
    }

    @Override // S1.g
    public final U1.l a(U1.l lVar, int i9, int i10) {
        if (AbstractC2539h.k(i9, i10)) {
            Bitmap bitmap = (Bitmap) lVar.get();
            if (i9 == Integer.MIN_VALUE) {
                i9 = bitmap.getWidth();
            }
            if (i10 == Integer.MIN_VALUE) {
                i10 = bitmap.getHeight();
            }
            Bitmap bitmapB = b(this.f39522a, bitmap, i9, i10);
            return bitmap.equals(bitmapB) ? lVar : C1653c.c(bitmapB, this.f39522a);
        }
        throw new IllegalArgumentException("Cannot apply transformation on width: " + i9 + " or height: " + i10 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
    }

    public abstract Bitmap b(V1.b bVar, Bitmap bitmap, int i9, int i10);
}
