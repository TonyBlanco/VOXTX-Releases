package e2;

import U1.l;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: e2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1731a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Drawable f40148a;

    public AbstractC1731a(Drawable drawable) {
        if (drawable == null) {
            throw new NullPointerException("Drawable must not be null!");
        }
        this.f40148a = drawable;
    }

    @Override // U1.l
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Drawable get() {
        return this.f40148a.getConstantState().newDrawable();
    }
}
