package l7;

import java.util.List;
import n4.C2284p;

/* JADX INFO: renamed from: l7.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2203b {
    public static C2284p[] a(List list) {
        if (list == null || list.isEmpty()) {
            return null;
        }
        C2284p[] c2284pArr = new C2284p[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            c2284pArr[i9] = b((C2284p) list.get(i9));
        }
        return c2284pArr;
    }

    public static C2284p b(C2284p c2284p) {
        return new C2284p.a(c2284p).b().a();
    }
}
