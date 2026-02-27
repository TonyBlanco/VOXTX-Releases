package androidx.work;

import Q0.h;
import androidx.work.b;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class OverwritingInputMerger extends h {
    @Override // Q0.h
    public b b(List list) {
        b.a aVar = new b.a();
        HashMap map = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            map.putAll(((b) it.next()).j());
        }
        aVar.d(map);
        return aVar.a();
    }
}
