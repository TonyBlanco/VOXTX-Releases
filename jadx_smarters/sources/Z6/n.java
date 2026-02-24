package Z6;

import Y6.v;
import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class n extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f11425b = "n";

    @Override // Z6.q
    public float c(v vVar, v vVar2) {
        if (vVar.f10736a <= 0 || vVar.f10737c <= 0) {
            return 0.0f;
        }
        v vVarD = vVar.d(vVar2);
        float fPow = (vVarD.f10736a * 1.0f) / vVar.f10736a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f9 = ((vVar2.f10736a * 1.0f) / vVarD.f10736a) * ((vVar2.f10737c * 1.0f) / vVarD.f10737c);
        return fPow * (((1.0f / f9) / f9) / f9);
    }

    @Override // Z6.q
    public Rect d(v vVar, v vVar2) {
        v vVarD = vVar.d(vVar2);
        Log.i(f11425b, "Preview: " + vVar + "; Scaled: " + vVarD + "; Want: " + vVar2);
        int i9 = (vVarD.f10736a - vVar2.f10736a) / 2;
        int i10 = (vVarD.f10737c - vVar2.f10737c) / 2;
        return new Rect(-i9, -i10, vVarD.f10736a - i9, vVarD.f10737c - i10);
    }
}
