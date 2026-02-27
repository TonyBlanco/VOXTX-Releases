package J1;

import z1.C3005d;

/* JADX INFO: loaded from: classes.dex */
public final class c extends i {
    public c(e eVar) {
        super(eVar);
    }

    @Override // J1.i
    public Object p(boolean z9) {
        Object objP = super.p(z9);
        if (!(objP instanceof String)) {
            return objP;
        }
        String str = (String) objP;
        return C3005d.a(str) ? C3005d.b(str) : objP;
    }
}
