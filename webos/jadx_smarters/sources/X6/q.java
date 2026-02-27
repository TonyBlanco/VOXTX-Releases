package x6;

/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f51984a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f51985b;

    public q(float f9, float f10) {
        this.f51984a = f9;
        this.f51985b = f10;
    }

    public static float a(q qVar, q qVar2, q qVar3) {
        float f9 = qVar2.f51984a;
        float f10 = qVar2.f51985b;
        return ((qVar3.f51984a - f9) * (qVar.f51985b - f10)) - ((qVar3.f51985b - f10) * (qVar.f51984a - f9));
    }

    public static float b(q qVar, q qVar2) {
        return E6.a.a(qVar.f51984a, qVar.f51985b, qVar2.f51984a, qVar2.f51985b);
    }

    public static void e(q[] qVarArr) {
        q qVar;
        q qVar2;
        q qVar3;
        float fB = b(qVarArr[0], qVarArr[1]);
        float fB2 = b(qVarArr[1], qVarArr[2]);
        float fB3 = b(qVarArr[0], qVarArr[2]);
        if (fB2 >= fB && fB2 >= fB3) {
            qVar = qVarArr[0];
            qVar2 = qVarArr[1];
            qVar3 = qVarArr[2];
        } else if (fB3 < fB2 || fB3 < fB) {
            qVar = qVarArr[2];
            qVar2 = qVarArr[0];
            qVar3 = qVarArr[1];
        } else {
            qVar = qVarArr[1];
            qVar2 = qVarArr[0];
            qVar3 = qVarArr[2];
        }
        if (a(qVar2, qVar, qVar3) < 0.0f) {
            q qVar4 = qVar3;
            qVar3 = qVar2;
            qVar2 = qVar4;
        }
        qVarArr[0] = qVar2;
        qVarArr[1] = qVar;
        qVarArr[2] = qVar3;
    }

    public final float c() {
        return this.f51984a;
    }

    public final float d() {
        return this.f51985b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q) {
            q qVar = (q) obj;
            if (this.f51984a == qVar.f51984a && this.f51985b == qVar.f51985b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (Float.floatToIntBits(this.f51984a) * 31) + Float.floatToIntBits(this.f51985b);
    }

    public final String toString() {
        return "(" + this.f51984a + ',' + this.f51985b + ')';
    }
}
