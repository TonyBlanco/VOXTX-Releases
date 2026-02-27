package H2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b {
    public static Object a(int i9, Object obj, a aVar, c cVar) {
        Object objApply;
        if (i9 < 1) {
            return aVar.apply(obj);
        }
        do {
            objApply = aVar.apply(obj);
            obj = cVar.a(obj, objApply);
            if (obj == null) {
                break;
            }
            i9--;
        } while (i9 >= 1);
        return objApply;
    }
}
