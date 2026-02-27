package d2;

import android.graphics.Bitmap;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: d2.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1653c implements U1.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Bitmap f39520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final V1.b f39521b;

    public C1653c(Bitmap bitmap, V1.b bVar) {
        if (bitmap == null) {
            throw new NullPointerException("Bitmap must not be null");
        }
        if (bVar == null) {
            throw new NullPointerException("BitmapPool must not be null");
        }
        this.f39520a = bitmap;
        this.f39521b = bVar;
    }

    public static C1653c c(Bitmap bitmap, V1.b bVar) {
        if (bitmap == null) {
            return null;
        }
        return new C1653c(bitmap, bVar);
    }

    @Override // U1.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f39520a;
    }

    @Override // U1.l
    public void b() {
        if (this.f39521b.a(this.f39520a)) {
            return;
        }
        this.f39520a.recycle();
    }

    @Override // U1.l
    public int getSize() {
        return AbstractC2539h.e(this.f39520a);
    }
}
