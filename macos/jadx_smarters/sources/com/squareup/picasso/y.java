package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import com.squareup.picasso.t;
import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final t.e f39213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Bitmap f39214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InputStream f39215c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f39216d;

        public a(Bitmap bitmap, t.e eVar) {
            this((Bitmap) G.d(bitmap, "bitmap == null"), null, eVar, 0);
        }

        public a(Bitmap bitmap, InputStream inputStream, t.e eVar, int i9) {
            if (!((inputStream != null) ^ (bitmap != null))) {
                throw new AssertionError();
            }
            this.f39214b = bitmap;
            this.f39215c = inputStream;
            this.f39213a = (t.e) G.d(eVar, "loadedFrom == null");
            this.f39216d = i9;
        }

        public a(InputStream inputStream, t.e eVar) {
            this(null, (InputStream) G.d(inputStream, "stream == null"), eVar, 0);
        }

        public Bitmap a() {
            return this.f39214b;
        }

        public int b() {
            return this.f39216d;
        }

        public t.e c() {
            return this.f39213a;
        }

        public InputStream d() {
            return this.f39215c;
        }
    }

    public static void a(int i9, int i10, int i11, int i12, BitmapFactory.Options options, w wVar) {
        int iMax;
        double d9;
        if (i12 > i10 || i11 > i9) {
            if (i10 == 0) {
                d9 = i11 / i9;
            } else if (i9 == 0) {
                d9 = i12 / i10;
            } else {
                int iFloor = (int) Math.floor(i12 / i10);
                int iFloor2 = (int) Math.floor(i11 / i9);
                iMax = wVar.f39177k ? Math.max(iFloor, iFloor2) : Math.min(iFloor, iFloor2);
            }
            iMax = (int) Math.floor(d9);
        } else {
            iMax = 1;
        }
        options.inSampleSize = iMax;
        options.inJustDecodeBounds = false;
    }

    public static void b(int i9, int i10, BitmapFactory.Options options, w wVar) {
        a(i9, i10, options.outWidth, options.outHeight, options, wVar);
    }

    public static BitmapFactory.Options d(w wVar) {
        boolean zC = wVar.c();
        boolean z9 = wVar.f39183q != null;
        if (!zC && !z9) {
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = zC;
        if (z9) {
            options.inPreferredConfig = wVar.f39183q;
        }
        return options;
    }

    public static boolean g(BitmapFactory.Options options) {
        return options != null && options.inJustDecodeBounds;
    }

    public abstract boolean c(w wVar);

    public int e() {
        return 0;
    }

    public abstract a f(w wVar, int i9);

    public boolean h(boolean z9, NetworkInfo networkInfo) {
        return false;
    }

    public boolean i() {
        return false;
    }
}
