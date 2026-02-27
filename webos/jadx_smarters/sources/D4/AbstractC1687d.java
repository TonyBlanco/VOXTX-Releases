package d4;

import O2.InterfaceC0901n;
import android.os.Bundle;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import s5.AbstractC2717A;
import s5.AbstractC2743y;

/* JADX INFO: renamed from: d4.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1687d {
    public static HashMap a(Bundle bundle) {
        HashMap map = new HashMap();
        if (bundle == Bundle.EMPTY) {
            return map;
        }
        for (String str : bundle.keySet()) {
            String string = bundle.getString(str);
            if (string != null) {
                map.put(str, string);
            }
        }
        return map;
    }

    public static AbstractC2717A b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? AbstractC2717A.k() : AbstractC2717A.d(a(bundle));
    }

    public static void c(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) k0.j(AbstractC1687d.class.getClassLoader()));
        }
    }

    public static AbstractC2743y d(InterfaceC0901n.a aVar, List list) {
        AbstractC2743y.a aVarP = AbstractC2743y.p();
        for (int i9 = 0; i9 < list.size(); i9++) {
            aVarP.a(aVar.a((Bundle) AbstractC1684a.e((Bundle) list.get(i9))));
        }
        return aVarP.k();
    }

    public static SparseArray e(InterfaceC0901n.a aVar, SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            sparseArray2.put(sparseArray.keyAt(i9), aVar.a((Bundle) sparseArray.valueAt(i9)));
        }
        return sparseArray2;
    }

    public static Bundle f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    public static ArrayList g(Bundle bundle, String str, ArrayList arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    public static Bundle h(Map map) {
        Bundle bundle = new Bundle();
        for (Map.Entry entry : map.entrySet()) {
            bundle.putString((String) entry.getKey(), (String) entry.getValue());
        }
        return bundle;
    }

    public static ArrayList i(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(((InterfaceC0901n) it.next()).h());
        }
        return arrayList;
    }

    public static SparseArray j(SparseArray sparseArray) {
        SparseArray sparseArray2 = new SparseArray(sparseArray.size());
        for (int i9 = 0; i9 < sparseArray.size(); i9++) {
            sparseArray2.put(sparseArray.keyAt(i9), ((InterfaceC0901n) sparseArray.valueAt(i9)).h());
        }
        return sparseArray2;
    }
}
