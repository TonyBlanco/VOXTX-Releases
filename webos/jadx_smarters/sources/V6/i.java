package V6;

import x6.q;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10118a;

    public i(boolean z9) {
        this.f10118a = z9;
    }

    public void a(q[] qVarArr) {
        if (!this.f10118a || qVarArr == null || qVarArr.length < 3) {
            return;
        }
        q qVar = qVarArr[0];
        qVarArr[0] = qVarArr[2];
        qVarArr[2] = qVar;
    }
}
