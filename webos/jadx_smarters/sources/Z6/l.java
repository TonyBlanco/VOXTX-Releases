package Z6;

import Y6.v;
import android.graphics.Rect;
import android.util.Log;

/* JADX INFO: loaded from: classes.dex */
public class l extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f11420b = "l";

    @Override // Z6.q
    public float c(v vVar, v vVar2) {
        if (vVar.f10736a <= 0 || vVar.f10737c <= 0) {
            return 0.0f;
        }
        v vVarC = vVar.c(vVar2);
        float fPow = (vVarC.f10736a * 1.0f) / vVar.f10736a;
        if (fPow > 1.0f) {
            fPow = (float) Math.pow(1.0f / fPow, 1.1d);
        }
        float f9 = ((vVarC.f10736a * 1.0f) / vVar2.f10736a) + ((vVarC.f10737c * 1.0f) / vVar2.f10737c);
        return fPow * ((1.0f / f9) / f9);
    }

    @Override // Z6.q
    public Rect d(v vVar, v vVar2) {
        v vVarC = vVar.c(vVar2);
        Log.i(f11420b, "Preview: " + vVar + "; Scaled: " + vVarC + "; Want: " + vVar2);
        int i9 = (vVarC.f10736a - vVar2.f10736a) / 2;
        int i10 = (vVarC.f10737c - vVar2.f10737c) / 2;
        return new Rect(-i9, -i10, vVarC.f10736a - i9, vVarC.f10737c - i10);
    }
}
