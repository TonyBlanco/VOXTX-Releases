package o2;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import e2.AbstractC1732b;

/* JADX INFO: renamed from: o2.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2311f {
    public InterfaceC2315j a(ImageView imageView, Class cls) {
        if (AbstractC1732b.class.isAssignableFrom(cls)) {
            return new C2309d(imageView);
        }
        if (Bitmap.class.equals(cls)) {
            return new C2307b(imageView);
        }
        if (Drawable.class.isAssignableFrom(cls)) {
            return new C2308c(imageView);
        }
        throw new IllegalArgumentException("Unhandled class: " + cls + ", try .as*(Class).transcode(ResourceTranscoder)");
    }
}
