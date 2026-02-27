package S1;

import U1.l;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class d implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f9385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f9386b;

    public d(g... gVarArr) {
        if (gVarArr.length < 1) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f9385a = Arrays.asList(gVarArr);
    }

    @Override // S1.g
    public l a(l lVar, int i9, int i10) {
        Iterator it = this.f9385a.iterator();
        l lVar2 = lVar;
        while (it.hasNext()) {
            l lVarA = ((g) it.next()).a(lVar2, i9, i10);
            if (lVar2 != null && !lVar2.equals(lVar) && !lVar2.equals(lVarA)) {
                lVar2.b();
            }
            lVar2 = lVarA;
        }
        return lVar2;
    }

    @Override // S1.g
    public String getId() {
        if (this.f9386b == null) {
            StringBuilder sb = new StringBuilder();
            Iterator it = this.f9385a.iterator();
            while (it.hasNext()) {
                sb.append(((g) it.next()).getId());
            }
            this.f9386b = sb.toString();
        }
        return this.f9386b;
    }
}
