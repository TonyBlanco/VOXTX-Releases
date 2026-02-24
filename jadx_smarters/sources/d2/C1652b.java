package d2;

import android.graphics.Bitmap;
import android.util.Log;
import java.io.OutputStream;
import q2.AbstractC2535d;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: d2.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1652b implements S1.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Bitmap.CompressFormat f39518a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f39519b;

    public C1652b() {
        this(null, 90);
    }

    public C1652b(Bitmap.CompressFormat compressFormat, int i9) {
        this.f39518a = compressFormat;
        this.f39519b = i9;
    }

    @Override // S1.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean a(U1.l lVar, OutputStream outputStream) {
        Bitmap bitmap = (Bitmap) lVar.get();
        long jB = AbstractC2535d.b();
        Bitmap.CompressFormat compressFormatC = c(bitmap);
        bitmap.compress(compressFormatC, this.f39519b, outputStream);
        if (!Log.isLoggable("BitmapEncoder", 2)) {
            return true;
        }
        Log.v("BitmapEncoder", "Compressed with type: " + compressFormatC + " of size " + AbstractC2539h.e(bitmap) + " in " + AbstractC2535d.a(jB));
        return true;
    }

    public final Bitmap.CompressFormat c(Bitmap bitmap) {
        Bitmap.CompressFormat compressFormat = this.f39518a;
        return compressFormat != null ? compressFormat : bitmap.hasAlpha() ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG;
    }

    @Override // S1.b
    public String getId() {
        return "BitmapEncoder.com.bumptech.glide.load.resource.bitmap";
    }
}
