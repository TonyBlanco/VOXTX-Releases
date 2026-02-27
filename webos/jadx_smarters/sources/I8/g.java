package I8;

/* JADX INFO: loaded from: classes4.dex */
public abstract class g {
    public static final f a(int i9, e eVar, w8.l lVar) {
        if (i9 == -2) {
            return new d(eVar == e.SUSPEND ? f.f2982a.a() : 1, eVar, lVar);
        }
        if (i9 != -1) {
            return i9 != 0 ? i9 != Integer.MAX_VALUE ? (i9 == 1 && eVar == e.DROP_OLDEST) ? new l(lVar) : new d(i9, eVar, lVar) : new m(lVar) : eVar == e.SUSPEND ? new q(lVar) : new d(1, eVar, lVar);
        }
        if (eVar == e.SUSPEND) {
            return new l(lVar);
        }
        throw new IllegalArgumentException("CONFLATED capacity cannot be used with non-default onBufferOverflow".toString());
    }

    public static /* synthetic */ f b(int i9, e eVar, w8.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            i9 = 0;
        }
        if ((i10 & 2) != 0) {
            eVar = e.SUSPEND;
        }
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        return a(i9, eVar, lVar);
    }
}
