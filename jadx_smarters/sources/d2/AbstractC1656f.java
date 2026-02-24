package d2;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Log;
import d2.C1662l;
import java.io.IOException;
import java.io.InputStream;
import java.util.EnumSet;
import java.util.Queue;
import java.util.Set;
import q2.AbstractC2539h;
import q2.C2532a;
import q2.C2534c;
import q2.C2537f;

/* JADX INFO: renamed from: d2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1656f implements InterfaceC1651a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set f39523a = EnumSet.of(C1662l.a.JPEG, C1662l.a.PNG_A, C1662l.a.PNG);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Queue f39524b = AbstractC2539h.c(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AbstractC1656f f39525c = new a();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final AbstractC1656f f39526d = new b();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final AbstractC1656f f39527e = new c();

    /* JADX INFO: renamed from: d2.f$a */
    public static class a extends AbstractC1656f {
        @Override // d2.InterfaceC1651a
        public String getId() {
            return "AT_LEAST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // d2.AbstractC1656f
        public int h(int i9, int i10, int i11, int i12) {
            return Math.min(i10 / i12, i9 / i11);
        }
    }

    /* JADX INFO: renamed from: d2.f$b */
    public static class b extends AbstractC1656f {
        @Override // d2.InterfaceC1651a
        public String getId() {
            return "AT_MOST.com.bumptech.glide.load.data.bitmap";
        }

        @Override // d2.AbstractC1656f
        public int h(int i9, int i10, int i11, int i12) {
            int iCeil = (int) Math.ceil(Math.max(i10 / i12, i9 / i11));
            int iMax = Math.max(1, Integer.highestOneBit(iCeil));
            return iMax << (iMax >= iCeil ? 0 : 1);
        }
    }

    /* JADX INFO: renamed from: d2.f$c */
    public static class c extends AbstractC1656f {
        @Override // d2.InterfaceC1651a
        public String getId() {
            return "NONE.com.bumptech.glide.load.data.bitmap";
        }

        @Override // d2.AbstractC1656f
        public int h(int i9, int i10, int i11, int i12) {
            return 0;
        }
    }

    public static Bitmap b(C2537f c2537f, o oVar, BitmapFactory.Options options) {
        if (options.inJustDecodeBounds) {
            c2537f.mark(5242880);
        } else {
            oVar.c();
        }
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(c2537f, null, options);
        try {
            if (options.inJustDecodeBounds) {
                c2537f.reset();
            }
        } catch (IOException e9) {
            if (Log.isLoggable("Downsampler", 6)) {
                Log.e("Downsampler", "Exception loading inDecodeBounds=" + options.inJustDecodeBounds + " sample=" + options.inSampleSize, e9);
            }
        }
        return bitmapDecodeStream;
    }

    public static Bitmap.Config d(InputStream inputStream, S1.a aVar) {
        boolean zF;
        if (aVar == S1.a.ALWAYS_ARGB_8888 || aVar == S1.a.PREFER_ARGB_8888) {
            return Bitmap.Config.ARGB_8888;
        }
        inputStream.mark(1024);
        try {
            try {
                zF = new C1662l(inputStream).f();
            } finally {
                try {
                    inputStream.reset();
                } catch (IOException e9) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e9);
                    }
                }
            }
        } catch (IOException e10) {
            if (Log.isLoggable("Downsampler", 5)) {
                Log.w("Downsampler", "Cannot determine whether the image has alpha or not from header for format " + aVar, e10);
            }
            try {
                inputStream.reset();
            } catch (IOException e11) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot reset the input stream", e11);
                }
            }
            zF = false;
        }
        return zF ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
    }

    public static synchronized BitmapFactory.Options e() {
        BitmapFactory.Options options;
        Queue queue = f39524b;
        synchronized (queue) {
            options = (BitmapFactory.Options) queue.poll();
        }
        if (options == null) {
            options = new BitmapFactory.Options();
            j(options);
        }
        return options;
    }

    public static void i(BitmapFactory.Options options) {
        j(options);
        Queue queue = f39524b;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    public static void j(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    public static void k(BitmapFactory.Options options, Bitmap bitmap) {
        options.inBitmap = bitmap;
    }

    public static boolean l(InputStream inputStream) {
        return true;
    }

    public Bitmap a(InputStream inputStream, V1.b bVar, int i9, int i10, S1.a aVar) {
        int i11;
        Bitmap bitmapF;
        C2532a c2532aA = C2532a.a();
        byte[] bArrB = c2532aA.b();
        byte[] bArrB2 = c2532aA.b();
        BitmapFactory.Options optionsE = e();
        o oVar = new o(inputStream, bArrB2);
        C2534c c2534cC = C2534c.c(oVar);
        C2537f c2537f = new C2537f(c2534cC);
        try {
            c2534cC.mark(5242880);
            try {
                try {
                    int iC = new C1662l(c2534cC).c();
                    try {
                        c2534cC.reset();
                    } catch (IOException e9) {
                        if (Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Cannot reset the input stream", e9);
                        }
                    }
                    i11 = iC;
                } finally {
                }
            } catch (IOException e10) {
                if (Log.isLoggable("Downsampler", 5)) {
                    Log.w("Downsampler", "Cannot determine the image orientation from header", e10);
                }
                try {
                    c2534cC.reset();
                } catch (IOException e11) {
                    if (Log.isLoggable("Downsampler", 5)) {
                        Log.w("Downsampler", "Cannot reset the input stream", e11);
                    }
                }
                i11 = 0;
            }
            optionsE.inTempStorage = bArrB;
            int[] iArrF = f(c2537f, oVar, optionsE);
            int i12 = iArrF[0];
            int i13 = iArrF[1];
            Bitmap bitmapC = c(c2537f, oVar, optionsE, bVar, i12, i13, g(r.c(i11), i12, i13, i9, i10), aVar);
            IOException iOExceptionA = c2534cC.a();
            if (iOExceptionA != null) {
                throw new RuntimeException(iOExceptionA);
            }
            if (bitmapC != null) {
                bitmapF = r.f(bitmapC, bVar, i11);
                if (!bitmapC.equals(bitmapF) && !bVar.a(bitmapC)) {
                    bitmapC.recycle();
                }
            } else {
                bitmapF = null;
            }
            return bitmapF;
        } finally {
            c2532aA.c(bArrB);
            c2532aA.c(bArrB2);
            c2534cC.d();
            i(optionsE);
        }
    }

    public final Bitmap c(C2537f c2537f, o oVar, BitmapFactory.Options options, V1.b bVar, int i9, int i10, int i11, S1.a aVar) {
        Bitmap.Config configD = d(c2537f, aVar);
        options.inSampleSize = i11;
        options.inPreferredConfig = configD;
        if (l(c2537f)) {
            double d9 = i11;
            k(options, bVar.e((int) Math.ceil(((double) i9) / d9), (int) Math.ceil(((double) i10) / d9), configD));
        }
        return b(c2537f, oVar, options);
    }

    public int[] f(C2537f c2537f, o oVar, BitmapFactory.Options options) {
        options.inJustDecodeBounds = true;
        b(c2537f, oVar, options);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    public final int g(int i9, int i10, int i11, int i12, int i13) {
        if (i13 == Integer.MIN_VALUE) {
            i13 = i11;
        }
        if (i12 == Integer.MIN_VALUE) {
            i12 = i10;
        }
        int iH = (i9 == 90 || i9 == 270) ? h(i11, i10, i12, i13) : h(i10, i11, i12, i13);
        return Math.max(1, iH == 0 ? 0 : Integer.highestOneBit(iH));
    }

    public abstract int h(int i9, int i10, int i11, int i12);
}
