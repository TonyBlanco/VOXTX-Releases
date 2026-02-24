package k;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class c0 extends W {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WeakReference f43306b;

    public c0(Context context, Resources resources) {
        super(resources);
        this.f43306b = new WeakReference(context);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i9) {
        Drawable drawableA = a(i9);
        Context context = (Context) this.f43306b.get();
        if (drawableA != null && context != null) {
            V.h().x(context, i9, drawableA);
        }
        return drawableA;
    }
}
