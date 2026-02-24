package W6;

import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class a extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10313c;

    public a(float f9, float f10, float f11) {
        super(f9, f10);
        this.f10313c = f11;
    }

    public boolean f(float f9, float f10, float f11) {
        if (Math.abs(f10 - d()) > f9 || Math.abs(f11 - c()) > f9) {
            return false;
        }
        float fAbs = Math.abs(f9 - this.f10313c);
        return fAbs <= 1.0f || fAbs <= this.f10313c;
    }

    public a g(float f9, float f10, float f11) {
        return new a((c() + f10) / 2.0f, (d() + f9) / 2.0f, (this.f10313c + f11) / 2.0f);
    }
}
