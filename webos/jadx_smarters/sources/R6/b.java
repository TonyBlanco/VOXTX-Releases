package R6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f9319a = new HashMap();

    public int[] a() {
        ArrayList arrayList = new ArrayList();
        int iIntValue = -1;
        for (Map.Entry entry : this.f9319a.entrySet()) {
            if (((Integer) entry.getValue()).intValue() > iIntValue) {
                iIntValue = ((Integer) entry.getValue()).intValue();
                arrayList.clear();
            } else if (((Integer) entry.getValue()).intValue() == iIntValue) {
            }
            arrayList.add(entry.getKey());
        }
        return Q6.a.b(arrayList);
    }

    public void b(int i9) {
        Integer num = (Integer) this.f9319a.get(Integer.valueOf(i9));
        if (num == null) {
            num = 0;
        }
        this.f9319a.put(Integer.valueOf(i9), Integer.valueOf(num.intValue() + 1));
    }
}
