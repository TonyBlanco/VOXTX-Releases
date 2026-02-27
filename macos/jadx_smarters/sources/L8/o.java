package l8;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o extends n {
    public static void p(List list) {
        kotlin.jvm.internal.l.e(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
