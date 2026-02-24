package q2;

import android.graphics.Bitmap;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/* JADX INFO: renamed from: q2.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2539h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final char[] f46814a = "0123456789abcdef".toCharArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final char[] f46815b = new char[64];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final char[] f46816c = new char[40];

    /* JADX INFO: renamed from: q2.h$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f46817a;

        static {
            int[] iArr = new int[Bitmap.Config.values().length];
            f46817a = iArr;
            try {
                iArr[Bitmap.Config.ALPHA_8.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f46817a[Bitmap.Config.RGB_565.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f46817a[Bitmap.Config.ARGB_4444.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f46817a[Bitmap.Config.ARGB_8888.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static void a() {
        if (!i()) {
            throw new IllegalArgumentException("You must call this method on the main thread");
        }
    }

    public static String b(byte[] bArr, char[] cArr) {
        for (int i9 = 0; i9 < bArr.length; i9++) {
            byte b9 = bArr[i9];
            int i10 = i9 * 2;
            char[] cArr2 = f46814a;
            cArr[i10] = cArr2[(b9 & 255) >>> 4];
            cArr[i10 + 1] = cArr2[b9 & 15];
        }
        return new String(cArr);
    }

    public static Queue c(int i9) {
        return new ArrayDeque(i9);
    }

    public static int d(int i9, int i10, Bitmap.Config config) {
        return i9 * i10 * f(config);
    }

    public static int e(Bitmap bitmap) {
        try {
            return bitmap.getAllocationByteCount();
        } catch (NullPointerException unused) {
            return bitmap.getHeight() * bitmap.getRowBytes();
        }
    }

    public static int f(Bitmap.Config config) {
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        int i9 = a.f46817a[config.ordinal()];
        if (i9 != 1) {
            return (i9 == 2 || i9 == 3) ? 2 : 4;
        }
        return 1;
    }

    public static List g(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static boolean h() {
        return !i();
    }

    public static boolean i() {
        return Looper.myLooper() == Looper.getMainLooper();
    }

    public static boolean j(int i9) {
        return i9 > 0 || i9 == Integer.MIN_VALUE;
    }

    public static boolean k(int i9, int i10) {
        return j(i9) && j(i10);
    }

    public static String l(byte[] bArr) {
        String strB;
        char[] cArr = f46815b;
        synchronized (cArr) {
            strB = b(bArr, cArr);
        }
        return strB;
    }
}
