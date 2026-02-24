package pl.droidsonroids.gif;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f46727a = Arrays.asList("raw", "drawable", "mipmap");

    public static class a extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f46728c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f46729d;

        public a() {
            this.f46728c = 0;
            this.f46729d = 0;
        }

        public a(ImageView imageView, AttributeSet attributeSet, int i9, int i10) {
            super(imageView, attributeSet, i9, i10);
            this.f46728c = a(imageView, attributeSet, true);
            this.f46729d = a(imageView, attributeSet, false);
        }

        public static int a(ImageView imageView, AttributeSet attributeSet, boolean z9) {
            int attributeResourceValue = attributeSet.getAttributeResourceValue("http://schemas.android.com/apk/res/android", z9 ? "src" : "background", 0);
            if (attributeResourceValue > 0) {
                if (e.f46727a.contains(imageView.getResources().getResourceTypeName(attributeResourceValue)) && !e.e(imageView, z9, attributeResourceValue)) {
                    return attributeResourceValue;
                }
            }
            return 0;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f46730a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f46731b;

        public b() {
            this.f46730a = false;
            this.f46731b = -1;
        }

        public b(View view, AttributeSet attributeSet, int i9, int i10) {
            TypedArray typedArrayObtainStyledAttributes = view.getContext().obtainStyledAttributes(attributeSet, h.f46735b, i9, i10);
            this.f46730a = typedArrayObtainStyledAttributes.getBoolean(h.f46736c, false);
            this.f46731b = typedArrayObtainStyledAttributes.getInt(h.f46737d, -1);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static void a(int i9, Drawable drawable) {
        if (drawable instanceof pl.droidsonroids.gif.a) {
            ((pl.droidsonroids.gif.a) drawable).h(i9);
        }
    }

    public static float b(Resources resources, int i9) {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i9, typedValue, true);
        int i10 = typedValue.density;
        if (i10 == 0) {
            i10 = 160;
        } else if (i10 == 65535) {
            i10 = 0;
        }
        int i11 = resources.getDisplayMetrics().densityDpi;
        if (i10 <= 0 || i11 <= 0) {
            return 1.0f;
        }
        return i11 / i10;
    }

    public static a c(ImageView imageView, AttributeSet attributeSet, int i9, int i10) {
        if (attributeSet == null || imageView.isInEditMode()) {
            return new a();
        }
        a aVar = new a(imageView, attributeSet, i9, i10);
        int i11 = aVar.f46731b;
        if (i11 >= 0) {
            a(i11, imageView.getDrawable());
            a(i11, imageView.getBackground());
        }
        return aVar;
    }

    public static boolean d(ImageView imageView, Uri uri) {
        if (uri == null) {
            return false;
        }
        try {
            imageView.setImageDrawable(new pl.droidsonroids.gif.a(imageView.getContext().getContentResolver(), uri));
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean e(ImageView imageView, boolean z9, int i9) {
        Resources resources = imageView.getResources();
        if (resources != null) {
            try {
                if (!f46727a.contains(resources.getResourceTypeName(i9))) {
                    return false;
                }
                pl.droidsonroids.gif.a aVar = new pl.droidsonroids.gif.a(resources, i9);
                if (z9) {
                    imageView.setImageDrawable(aVar);
                    return true;
                }
                imageView.setBackground(aVar);
                return true;
            } catch (Resources.NotFoundException | IOException unused) {
            }
        }
        return false;
    }
}
