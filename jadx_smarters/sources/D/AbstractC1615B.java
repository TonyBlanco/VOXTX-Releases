package d;

import java.util.LinkedHashSet;
import java.util.Locale;

/* JADX INFO: renamed from: d.B, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1615B {
    public static L.i a(L.i iVar, L.i iVar2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i9 = 0;
        while (i9 < iVar.g() + iVar2.g()) {
            Locale localeD = i9 < iVar.g() ? iVar.d(i9) : iVar2.d(i9 - iVar.g());
            if (localeD != null) {
                linkedHashSet.add(localeD);
            }
            i9++;
        }
        return L.i.a((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
    }

    public static L.i b(L.i iVar, L.i iVar2) {
        return (iVar == null || iVar.f()) ? L.i.e() : a(iVar, iVar2);
    }
}
