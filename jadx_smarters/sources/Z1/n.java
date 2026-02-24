package Z1;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public abstract class n implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources f10897b;

    public n(Context context, l lVar) {
        this(context.getResources(), lVar);
    }

    public n(Resources resources, l lVar) {
        this.f10897b = resources;
        this.f10896a = lVar;
    }

    @Override // Z1.l
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T1.c a(Integer num, int i9, int i10) {
        Uri uri;
        try {
            uri = Uri.parse("android.resource://" + this.f10897b.getResourcePackageName(num.intValue()) + '/' + this.f10897b.getResourceTypeName(num.intValue()) + '/' + this.f10897b.getResourceEntryName(num.intValue()));
        } catch (Resources.NotFoundException e9) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num, e9);
            }
            uri = null;
        }
        if (uri != null) {
            return this.f10896a.a(uri, i9, i10);
        }
        return null;
    }
}
