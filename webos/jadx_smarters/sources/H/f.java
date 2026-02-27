package H;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public final class f extends Drawable.ConstantState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f2381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Drawable.ConstantState f2382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ColorStateList f2383c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public PorterDuff.Mode f2384d;

    public f(f fVar) {
        this.f2383c = null;
        this.f2384d = d.f2373h;
        if (fVar != null) {
            this.f2381a = fVar.f2381a;
            this.f2382b = fVar.f2382b;
            this.f2383c = fVar.f2383c;
            this.f2384d = fVar.f2384d;
        }
    }

    public boolean a() {
        return this.f2382b != null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public int getChangingConfigurations() {
        int i9 = this.f2381a;
        Drawable.ConstantState constantState = this.f2382b;
        return i9 | (constantState != null ? constantState.getChangingConfigurations() : 0);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        return newDrawable(null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
