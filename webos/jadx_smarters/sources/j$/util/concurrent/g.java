package j$.util.concurrent;

/* JADX INFO: loaded from: classes2.dex */
final class g extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final l[] f42302e;

    g(l[] lVarArr) {
        super(-1, null, null);
        this.f42302e = lVarArr;
    }

    @Override // j$.util.concurrent.l
    final l a(Object obj, int i9) {
        int length;
        l lVarK;
        Object obj2;
        l[] lVarArr = this.f42302e;
        loop0: while (obj != null && lVarArr != null && (length = lVarArr.length) != 0 && (lVarK = ConcurrentHashMap.k(lVarArr, (length - 1) & i9)) != null) {
            do {
                int i10 = lVarK.f42309a;
                if (i10 == i9 && ((obj2 = lVarK.f42310b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVarK;
                }
                if (i10 >= 0) {
                    lVarK = lVarK.f42312d;
                } else {
                    if (!(lVarK instanceof g)) {
                        return lVarK.a(obj, i9);
                    }
                    lVarArr = ((g) lVarK).f42302e;
                }
            } while (lVarK != null);
        }
        return null;
    }
}
