package x2;

import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import v2.AbstractC2870a;

/* JADX INFO: loaded from: classes.dex */
public abstract class g extends f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public f[] f51912F = O();

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public int f51913G;

    public g() {
        M();
        N(this.f51912F);
    }

    public void J(Canvas canvas) {
        f[] fVarArr = this.f51912F;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                int iSave = canvas.save();
                fVar.draw(canvas);
                canvas.restoreToCount(iSave);
            }
        }
    }

    public f K(int i9) {
        f[] fVarArr = this.f51912F;
        if (fVarArr == null) {
            return null;
        }
        return fVarArr[i9];
    }

    public int L() {
        f[] fVarArr = this.f51912F;
        if (fVarArr == null) {
            return 0;
        }
        return fVarArr.length;
    }

    public final void M() {
        f[] fVarArr = this.f51912F;
        if (fVarArr != null) {
            for (f fVar : fVarArr) {
                fVar.setCallback(this);
            }
        }
    }

    public void N(f... fVarArr) {
    }

    public abstract f[] O();

    @Override // x2.f
    public void b(Canvas canvas) {
    }

    @Override // x2.f
    public int c() {
        return this.f51913G;
    }

    @Override // x2.f, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        super.draw(canvas);
        J(canvas);
    }

    @Override // x2.f, android.graphics.drawable.Animatable
    public boolean isRunning() {
        return AbstractC2870a.b(this.f51912F) || super.isRunning();
    }

    @Override // x2.f, android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        for (f fVar : this.f51912F) {
            fVar.setBounds(rect);
        }
    }

    @Override // x2.f
    public ValueAnimator r() {
        return null;
    }

    @Override // x2.f, android.graphics.drawable.Animatable
    public void start() {
        super.start();
        AbstractC2870a.e(this.f51912F);
    }

    @Override // x2.f, android.graphics.drawable.Animatable
    public void stop() {
        super.stop();
        AbstractC2870a.f(this.f51912F);
    }

    @Override // x2.f
    public void u(int i9) {
        this.f51913G = i9;
        for (int i10 = 0; i10 < L(); i10++) {
            K(i10).u(i9);
        }
    }
}
