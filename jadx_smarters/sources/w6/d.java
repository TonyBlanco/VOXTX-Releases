package W6;

import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class d extends q {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f10325c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10326d;

    public d(float f9, float f10, float f11) {
        this(f9, f10, f11, 1);
    }

    public d(float f9, float f10, float f11, int i9) {
        super(f9, f10);
        this.f10325c = f11;
        this.f10326d = i9;
    }

    public boolean f(float f9, float f10, float f11) {
        if (Math.abs(f10 - d()) > f9 || Math.abs(f11 - c()) > f9) {
            return false;
        }
        float fAbs = Math.abs(f9 - this.f10325c);
        return fAbs <= 1.0f || fAbs <= this.f10325c;
    }

    public d g(float f9, float f10, float f11) {
        int i9 = this.f10326d;
        int i10 = i9 + 1;
        float fC = (i9 * c()) + f10;
        float f12 = i10;
        return new d(fC / f12, ((this.f10326d * d()) + f9) / f12, ((this.f10326d * this.f10325c) + f11) / f12, i10);
    }

    public int h() {
        return this.f10326d;
    }

    public float i() {
        return this.f10325c;
    }
}
