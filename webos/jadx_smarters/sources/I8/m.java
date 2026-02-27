package I8;

import kotlinx.coroutines.internal.y;

/* JADX INFO: loaded from: classes4.dex */
public class m extends a {
    public m(w8.l lVar) {
        super(lVar);
    }

    @Override // I8.c
    public Object m(Object obj) {
        p pVarO;
        do {
            Object objM = super.m(obj);
            y yVar = b.f2967b;
            if (objM == yVar) {
                return yVar;
            }
            if (objM != b.f2968c) {
                if (objM instanceof i) {
                    return objM;
                }
                throw new IllegalStateException(("Invalid offerInternal result " + objM).toString());
            }
            pVarO = o(obj);
            if (pVarO == null) {
                return yVar;
            }
        } while (!(pVarO instanceof i));
        return pVarO;
    }

    @Override // I8.a
    public final boolean v() {
        return true;
    }

    @Override // I8.a
    public final boolean w() {
        return true;
    }
}
