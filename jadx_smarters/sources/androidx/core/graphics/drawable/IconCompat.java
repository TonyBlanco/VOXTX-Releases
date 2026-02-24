package androidx.core.graphics.drawable;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import android.graphics.drawable.AdaptiveIconDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.os.Build;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.amazonaws.mobileconnectors.s3.transferutility.TransferTable;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import org.achartengine.renderer.DefaultRenderer;

/* JADX INFO: loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final PorterDuff.Mode f14528k = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f14529a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f14530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public byte[] f14531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Parcelable f14532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ColorStateList f14535g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public PorterDuff.Mode f14536h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f14537i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f14538j;

    public static class a {
        public static int a(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.a(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e9) {
                Log.e("IconCompat", "Unable to get icon resource", e9);
                return 0;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon resource", e10);
                return 0;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon resource", e11);
                return 0;
            }
        }

        public static String b(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.b(obj);
            }
            try {
                return (String) obj.getClass().getMethod("getResPackage", null).invoke(obj, null);
            } catch (IllegalAccessException e9) {
                Log.e("IconCompat", "Unable to get icon package", e9);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon package", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon package", e11);
                return null;
            }
        }

        public static int c(Object obj) {
            StringBuilder sb;
            if (Build.VERSION.SDK_INT >= 28) {
                return c.c(obj);
            }
            try {
                return ((Integer) obj.getClass().getMethod("getType", null).invoke(obj, null)).intValue();
            } catch (IllegalAccessException e9) {
                e = e9;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (NoSuchMethodException e10) {
                e = e10;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            } catch (InvocationTargetException e11) {
                e = e11;
                sb = new StringBuilder();
                sb.append("Unable to get icon type ");
                sb.append(obj);
                Log.e("IconCompat", sb.toString(), e);
                return -1;
            }
        }

        public static Uri d(Object obj) {
            if (Build.VERSION.SDK_INT >= 28) {
                return c.d(obj);
            }
            try {
                return (Uri) obj.getClass().getMethod("getUri", null).invoke(obj, null);
            } catch (IllegalAccessException e9) {
                Log.e("IconCompat", "Unable to get icon uri", e9);
                return null;
            } catch (NoSuchMethodException e10) {
                Log.e("IconCompat", "Unable to get icon uri", e10);
                return null;
            } catch (InvocationTargetException e11) {
                Log.e("IconCompat", "Unable to get icon uri", e11);
                return null;
            }
        }

        public static Drawable e(Icon icon, Context context) {
            return icon.loadDrawable(context);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
        
            if (r0 >= 26) goto L14;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x00b4  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static android.graphics.drawable.Icon f(androidx.core.graphics.drawable.IconCompat r4, android.content.Context r5) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.drawable.IconCompat.a.f(androidx.core.graphics.drawable.IconCompat, android.content.Context):android.graphics.drawable.Icon");
        }
    }

    public static class b {
        public static Drawable a(Drawable drawable, Drawable drawable2) {
            return new AdaptiveIconDrawable(drawable, drawable2);
        }

        public static Icon b(Bitmap bitmap) {
            return Icon.createWithAdaptiveBitmap(bitmap);
        }
    }

    public static class c {
        public static int a(Object obj) {
            return ((Icon) obj).getResId();
        }

        public static String b(Object obj) {
            return ((Icon) obj).getResPackage();
        }

        public static int c(Object obj) {
            return ((Icon) obj).getType();
        }

        public static Uri d(Object obj) {
            return ((Icon) obj).getUri();
        }
    }

    public static class d {
        public static Icon a(Uri uri) {
            return Icon.createWithAdaptiveBitmapContentUri(uri);
        }
    }

    public IconCompat() {
        this.f14529a = -1;
        this.f14531c = null;
        this.f14532d = null;
        this.f14533e = 0;
        this.f14534f = 0;
        this.f14535g = null;
        this.f14536h = f14528k;
        this.f14537i = null;
    }

    public IconCompat(int i9) {
        this.f14531c = null;
        this.f14532d = null;
        this.f14533e = 0;
        this.f14534f = 0;
        this.f14535g = null;
        this.f14536h = f14528k;
        this.f14537i = null;
        this.f14529a = i9;
    }

    public static Bitmap b(Bitmap bitmap, boolean z9) {
        int iMin = (int) (Math.min(bitmap.getWidth(), bitmap.getHeight()) * 0.6666667f);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iMin, iMin, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Paint paint = new Paint(3);
        float f9 = iMin;
        float f10 = 0.5f * f9;
        float f11 = 0.9166667f * f10;
        if (z9) {
            float f12 = 0.010416667f * f9;
            paint.setColor(0);
            paint.setShadowLayer(f12, 0.0f, f9 * 0.020833334f, 1023410176);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.setShadowLayer(f12, 0.0f, 0.0f, 503316480);
            canvas.drawCircle(f10, f10, f11, paint);
            paint.clearShadowLayer();
        }
        paint.setColor(DefaultRenderer.BACKGROUND_COLOR);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setTranslate((-(bitmap.getWidth() - iMin)) / 2.0f, (-(bitmap.getHeight() - iMin)) / 2.0f);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        canvas.drawCircle(f10, f10, f11, paint);
        canvas.setBitmap(null);
        return bitmapCreateBitmap;
    }

    public static IconCompat c(Bitmap bitmap) {
        O.c.c(bitmap);
        IconCompat iconCompat = new IconCompat(1);
        iconCompat.f14530b = bitmap;
        return iconCompat;
    }

    public static IconCompat d(Resources resources, String str, int i9) {
        O.c.c(str);
        if (i9 == 0) {
            throw new IllegalArgumentException("Drawable resource ID must not be 0");
        }
        IconCompat iconCompat = new IconCompat(2);
        iconCompat.f14533e = i9;
        if (resources != null) {
            try {
                iconCompat.f14530b = resources.getResourceName(i9);
            } catch (Resources.NotFoundException unused) {
                throw new IllegalArgumentException("Icon resource cannot be found");
            }
        } else {
            iconCompat.f14530b = str;
        }
        iconCompat.f14538j = str;
        return iconCompat;
    }

    public static String o(int i9) {
        switch (i9) {
            case 1:
                return "BITMAP";
            case 2:
                return "RESOURCE";
            case 3:
                return "DATA";
            case 4:
                return "URI";
            case 5:
                return "BITMAP_MASKABLE";
            case 6:
                return "URI_MASKABLE";
            default:
                return "UNKNOWN";
        }
    }

    public Bitmap e() {
        int i9 = this.f14529a;
        if (i9 == -1 && Build.VERSION.SDK_INT >= 23) {
            Object obj = this.f14530b;
            if (obj instanceof Bitmap) {
                return (Bitmap) obj;
            }
            return null;
        }
        if (i9 == 1) {
            return (Bitmap) this.f14530b;
        }
        if (i9 == 5) {
            return b((Bitmap) this.f14530b, true);
        }
        throw new IllegalStateException("called getBitmap() on " + this);
    }

    public int f() {
        int i9 = this.f14529a;
        if (i9 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.a(this.f14530b);
        }
        if (i9 == 2) {
            return this.f14533e;
        }
        throw new IllegalStateException("called getResId() on " + this);
    }

    public String g() {
        int i9 = this.f14529a;
        if (i9 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.b(this.f14530b);
        }
        if (i9 == 2) {
            String str = this.f14538j;
            return (str == null || TextUtils.isEmpty(str)) ? ((String) this.f14530b).split(":", -1)[0] : this.f14538j;
        }
        throw new IllegalStateException("called getResPackage() on " + this);
    }

    public int h() {
        int i9 = this.f14529a;
        return (i9 != -1 || Build.VERSION.SDK_INT < 23) ? i9 : a.c(this.f14530b);
    }

    public Uri i() {
        int i9 = this.f14529a;
        if (i9 == -1 && Build.VERSION.SDK_INT >= 23) {
            return a.d(this.f14530b);
        }
        if (i9 == 4 || i9 == 6) {
            return Uri.parse((String) this.f14530b);
        }
        throw new IllegalStateException("called getUri() on " + this);
    }

    public InputStream j(Context context) {
        StringBuilder sb;
        String str;
        Uri uriI = i();
        String scheme = uriI.getScheme();
        if ("content".equals(scheme) || TransferTable.COLUMN_FILE.equals(scheme)) {
            try {
                return context.getContentResolver().openInputStream(uriI);
            } catch (Exception e9) {
                e = e9;
                sb = new StringBuilder();
                str = "Unable to load image from URI: ";
            }
        } else {
            try {
                return new FileInputStream(new File((String) this.f14530b));
            } catch (FileNotFoundException e10) {
                e = e10;
                sb = new StringBuilder();
                str = "Unable to load image from path: ";
            }
        }
        sb.append(str);
        sb.append(uriI);
        Log.w("IconCompat", sb.toString(), e);
        return null;
    }

    public void k() {
        Parcelable parcelable;
        this.f14536h = PorterDuff.Mode.valueOf(this.f14537i);
        switch (this.f14529a) {
            case -1:
                parcelable = this.f14532d;
                if (parcelable == null) {
                    throw new IllegalArgumentException("Invalid icon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                parcelable = this.f14532d;
                if (parcelable == null) {
                    byte[] bArr = this.f14531c;
                    this.f14530b = bArr;
                    this.f14529a = 3;
                    this.f14533e = 0;
                    this.f14534f = bArr.length;
                    return;
                }
                break;
            case 2:
            case 4:
            case 6:
                String str = new String(this.f14531c, Charset.forName("UTF-16"));
                this.f14530b = str;
                if (this.f14529a == 2 && this.f14538j == null) {
                    this.f14538j = str.split(":", -1)[0];
                    return;
                }
                return;
            case 3:
                this.f14530b = this.f14531c;
                return;
        }
        this.f14530b = parcelable;
    }

    public void l(boolean z9) {
        this.f14537i = this.f14536h.name();
        switch (this.f14529a) {
            case -1:
                if (z9) {
                    throw new IllegalArgumentException("Can't serialize Icon created with IconCompat#createFromIcon");
                }
                break;
            case 0:
            default:
                return;
            case 1:
            case 5:
                if (z9) {
                    Bitmap bitmap = (Bitmap) this.f14530b;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    bitmap.compress(Bitmap.CompressFormat.PNG, 90, byteArrayOutputStream);
                    this.f14531c = byteArrayOutputStream.toByteArray();
                    return;
                }
                break;
            case 2:
                this.f14531c = ((String) this.f14530b).getBytes(Charset.forName("UTF-16"));
                return;
            case 3:
                this.f14531c = (byte[]) this.f14530b;
                return;
            case 4:
            case 6:
                this.f14531c = this.f14530b.toString().getBytes(Charset.forName("UTF-16"));
                return;
        }
        this.f14532d = (Parcelable) this.f14530b;
    }

    public Icon m() {
        return n(null);
    }

    public Icon n(Context context) {
        if (Build.VERSION.SDK_INT >= 23) {
            return a.f(this, context);
        }
        throw new UnsupportedOperationException("This method is only supported on API level 23+");
    }

    public String toString() {
        int height;
        if (this.f14529a == -1) {
            return String.valueOf(this.f14530b);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        sb.append(o(this.f14529a));
        switch (this.f14529a) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.f14530b).getWidth());
                sb.append("x");
                height = ((Bitmap) this.f14530b).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.f14538j);
                sb.append(" id=");
                sb.append(String.format("0x%08x", Integer.valueOf(f())));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.f14533e);
                if (this.f14534f != 0) {
                    sb.append(" off=");
                    height = this.f14534f;
                    sb.append(height);
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.f14530b);
                break;
        }
        if (this.f14535g != null) {
            sb.append(" tint=");
            sb.append(this.f14535g);
        }
        if (this.f14536h != f14528k) {
            sb.append(" mode=");
            sb.append(this.f14536h);
        }
        sb.append(")");
        return sb.toString();
    }
}
