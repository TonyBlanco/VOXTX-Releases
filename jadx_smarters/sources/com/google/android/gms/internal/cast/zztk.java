package com.google.android.gms.internal.cast;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class zztk {
    public static final int zza(int i9, Object obj, Object obj2) {
        zztj zztjVar = (zztj) obj;
        if (zztjVar.isEmpty()) {
            return 0;
        }
        Iterator it = zztjVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }
}
