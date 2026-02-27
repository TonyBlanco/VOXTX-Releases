package F1;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import z1.C3005d;

/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static int a(Object obj, Object obj2) {
        return b(obj) - b(obj2);
    }

    public static int b(Object obj) {
        int iB = 16;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                iB += b(it.next());
            }
            return iB;
        }
        if (obj instanceof String) {
            return ((String) obj).getBytes().length;
        }
        if (obj instanceof Boolean) {
            return 16;
        }
        if (obj instanceof BigDecimal) {
            return 32;
        }
        if (obj instanceof C3005d) {
            return ((C3005d) obj).c().getBytes().length + 16;
        }
        if (obj == null) {
            return 4;
        }
        throw new IllegalStateException("Unknown field type in Record. " + obj.getClass().getName());
    }
}
