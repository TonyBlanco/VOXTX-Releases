package i1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import h1.m;
import h1.n;
import h1.p;
import h1.v;

/* JADX INFO: loaded from: classes.dex */
public class i extends n {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final Object f41818x = new Object();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f41819r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public p.b f41820s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Bitmap.Config f41821t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f41822u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f41823v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final ImageView.ScaleType f41824w;

    public i(String str, p.b bVar, int i9, int i10, ImageView.ScaleType scaleType, Bitmap.Config config, p.a aVar) {
        super(0, str, aVar);
        this.f41819r = new Object();
        R(new h1.e(1000, 2, 2.0f));
        this.f41820s = bVar;
        this.f41821t = config;
        this.f41822u = i9;
        this.f41823v = i10;
        this.f41824w = scaleType;
    }

    public static int Y(int i9, int i10, int i11, int i12) {
        double dMin = Math.min(((double) i9) / ((double) i11), ((double) i10) / ((double) i12));
        float f9 = 1.0f;
        while (true) {
            float f10 = 2.0f * f9;
            if (f10 > dMin) {
                return (int) f9;
            }
            f9 = f10;
        }
    }

    public static int Z(int i9, int i10, int i11, int i12, ImageView.ScaleType scaleType) {
        if (i9 == 0 && i10 == 0) {
            return i11;
        }
        if (scaleType == ImageView.ScaleType.FIT_XY) {
            return i9 == 0 ? i11 : i9;
        }
        if (i9 == 0) {
            return (int) (((double) i11) * (((double) i10) / ((double) i12)));
        }
        if (i10 == 0) {
            return i9;
        }
        double d9 = ((double) i12) / ((double) i11);
        if (scaleType == ImageView.ScaleType.CENTER_CROP) {
            double d10 = i10;
            return ((double) i9) * d9 < d10 ? (int) (d10 / d9) : i9;
        }
        double d11 = i10;
        return ((double) i9) * d9 > d11 ? (int) (d11 / d9) : i9;
    }

    @Override // h1.n
    public n.c B() {
        return n.c.LOW;
    }

    @Override // h1.n
    public p M(h1.k kVar) {
        p pVarX;
        synchronized (f41818x) {
            try {
                try {
                    pVarX = X(kVar);
                } catch (OutOfMemoryError e9) {
                    v.c("Caught OOM for %d byte image, url=%s", Integer.valueOf(kVar.f41541b.length), F());
                    return p.a(new m(e9));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVarX;
    }

    @Override // h1.n
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public void l(Bitmap bitmap) {
        p.b bVar;
        synchronized (this.f41819r) {
            bVar = this.f41820s;
        }
        if (bVar != null) {
            bVar.a(bitmap);
        }
    }

    public final p X(h1.k kVar) {
        Bitmap bitmapDecodeByteArray;
        byte[] bArr = kVar.f41541b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.f41822u == 0 && this.f41823v == 0) {
            options.inPreferredConfig = this.f41821t;
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i9 = options.outWidth;
            int i10 = options.outHeight;
            int iZ = Z(this.f41822u, this.f41823v, i9, i10, this.f41824w);
            int iZ2 = Z(this.f41823v, this.f41822u, i10, i9, this.f41824w);
            options.inJustDecodeBounds = false;
            options.inSampleSize = Y(i9, i10, iZ, iZ2);
            bitmapDecodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (bitmapDecodeByteArray != null && (bitmapDecodeByteArray.getWidth() > iZ || bitmapDecodeByteArray.getHeight() > iZ2)) {
                Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iZ, iZ2, true);
                bitmapDecodeByteArray.recycle();
                bitmapDecodeByteArray = bitmapCreateScaledBitmap;
            }
        }
        return bitmapDecodeByteArray == null ? p.a(new m(kVar)) : p.c(bitmapDecodeByteArray, AbstractC1878e.e(kVar));
    }

    @Override // h1.n
    public void h() {
        super.h();
        synchronized (this.f41819r) {
            this.f41820s = null;
        }
    }
}
