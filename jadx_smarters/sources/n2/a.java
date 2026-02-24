package N2;

import android.util.SparseArray;
import java.util.HashMap;
import z2.EnumC3016d;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static SparseArray f5289a = new SparseArray();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static HashMap f5290b;

    static {
        HashMap map = new HashMap();
        f5290b = map;
        map.put(EnumC3016d.DEFAULT, 0);
        f5290b.put(EnumC3016d.VERY_LOW, 1);
        f5290b.put(EnumC3016d.HIGHEST, 2);
        for (EnumC3016d enumC3016d : f5290b.keySet()) {
            f5289a.append(((Integer) f5290b.get(enumC3016d)).intValue(), enumC3016d);
        }
    }

    public static int a(EnumC3016d enumC3016d) {
        Integer num = (Integer) f5290b.get(enumC3016d);
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalStateException("PriorityMapping is missing known Priority value " + enumC3016d);
    }

    public static EnumC3016d b(int i9) {
        EnumC3016d enumC3016d = (EnumC3016d) f5289a.get(i9);
        if (enumC3016d != null) {
            return enumC3016d;
        }
        throw new IllegalArgumentException("Unknown Priority for value " + i9);
    }
}
