package s1;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import k1.C2132a;
import k1.C2133b;
import l1.C2173b;
import m1.C2219a;
import okhttp3.Response;
import okio.Okio;
import p1.InterfaceC2387a;

/* JADX INFO: renamed from: s1.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2705c {

    /* JADX INFO: renamed from: s1.c$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f49859a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f49860c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f49861d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f49862e;

        public a(InterfaceC2387a interfaceC2387a, long j9, long j10, long j11, boolean z9) {
            this.f49859a = j9;
            this.f49860c = j10;
            this.f49861d = j11;
            this.f49862e = z9;
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public static C2133b a(Response response, int i9, int i10, Bitmap.Config config, BitmapFactory.Options options, ImageView.ScaleType scaleType) {
        Bitmap bitmapCreateScaledBitmap;
        byte[] byteArray = new byte[0];
        try {
            byteArray = Okio.buffer(response.body().source()).readByteArray();
        } catch (IOException e9) {
            e9.printStackTrace();
        }
        if (i9 == 0 && i10 == 0) {
            options.inPreferredConfig = config;
            bitmapCreateScaledBitmap = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            int i11 = options.outWidth;
            int i12 = options.outHeight;
            int iG = g(i9, i10, i11, i12, scaleType);
            int iG2 = g(i10, i9, i12, i11, scaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = c(i11, i12, iG, iG2);
            Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length, options);
            if (bitmapDecodeByteArray == null || (bitmapDecodeByteArray.getWidth() <= iG && bitmapDecodeByteArray.getHeight() <= iG2)) {
                bitmapCreateScaledBitmap = bitmapDecodeByteArray;
            } else {
                bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapDecodeByteArray, iG, iG2, true);
                bitmapDecodeByteArray.recycle();
            }
        }
        return bitmapCreateScaledBitmap == null ? C2133b.a(e(new C2219a(response))) : C2133b.f(bitmapCreateScaledBitmap);
    }

    public static C2133b b(Response response, int i9, int i10, Bitmap.Config config, ImageView.ScaleType scaleType) {
        return a(response, i9, i10, config, new BitmapFactory.Options(), scaleType);
    }

    public static int c(int i9, int i10, int i11, int i12) {
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

    public static C2219a d(C2219a c2219a) {
        c2219a.e("connectionError");
        c2219a.d(0);
        return c2219a;
    }

    public static C2219a e(C2219a c2219a) {
        c2219a.d(0);
        c2219a.e("parseError");
        return c2219a;
    }

    public static C2219a f(C2219a c2219a, C2132a c2132a, int i9) {
        C2219a c2219aG = c2132a.G(c2219a);
        c2219aG.d(i9);
        c2219aG.e("responseFromServerError");
        return c2219aG;
    }

    public static int g(int i9, int i10, int i11, int i12, ImageView.ScaleType scaleType) {
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

    public static void h(Response response, String str, String str2) throws Throwable {
        FileOutputStream fileOutputStream;
        byte[] bArr = new byte[2048];
        InputStream inputStream = null;
        try {
            InputStream inputStreamByteStream = response.body().byteStream();
            try {
                File file = new File(str);
                if (!file.exists()) {
                    file.mkdirs();
                }
                fileOutputStream = new FileOutputStream(new File(file, str2));
                while (true) {
                    try {
                        int i9 = inputStreamByteStream.read(bArr);
                        if (i9 == -1) {
                            break;
                        } else {
                            fileOutputStream.write(bArr, 0, i9);
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamByteStream;
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e9) {
                                e9.printStackTrace();
                            }
                        }
                        if (fileOutputStream == null) {
                            throw th;
                        }
                        try {
                            fileOutputStream.close();
                            throw th;
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            throw th;
                        }
                    }
                }
                fileOutputStream.flush();
                try {
                    inputStreamByteStream.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
                try {
                    fileOutputStream.close();
                } catch (IOException e12) {
                    e12.printStackTrace();
                }
            } catch (Throwable th2) {
                th = th2;
                fileOutputStream = null;
            }
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream = null;
        }
    }

    public static void i(InterfaceC2387a interfaceC2387a, long j9, long j10, long j11, boolean z9) {
        C2173b.b().a().a().execute(new a(interfaceC2387a, j9, j10, j11, z9));
    }
}
