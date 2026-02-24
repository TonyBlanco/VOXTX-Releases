package Z6;

import Y6.v;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class o extends q {
    public static float e(float f9) {
        return f9 < 1.0f ? 1.0f / f9 : f9;
    }

    @Override // Z6.q
    public float c(v vVar, v vVar2) {
        int i9 = vVar.f10736a;
        if (i9 <= 0 || vVar.f10737c <= 0) {
            return 0.0f;
        }
        float fE = (1.0f / e((i9 * 1.0f) / vVar2.f10736a)) / e((vVar.f10737c * 1.0f) / vVar2.f10737c);
        float fE2 = e(((vVar.f10736a * 1.0f) / vVar.f10737c) / ((vVar2.f10736a * 1.0f) / vVar2.f10737c));
        return fE * (((1.0f / fE2) / fE2) / fE2);
    }

    @Override // Z6.q
    public Rect d(v vVar, v vVar2) {
        return new Rect(0, 0, vVar2.f10736a, vVar2.f10737c);
    }
}
