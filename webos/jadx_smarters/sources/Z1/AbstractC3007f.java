package z1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import y1.C2982a;

/* JADX INFO: renamed from: z1.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3007f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public x1.d f52630a = x1.d.a();

    public final AbstractC3007f a(AbstractC3007f abstractC3007f) {
        x1.g.c(abstractC3007f, "cache == null");
        AbstractC3007f abstractC3007f2 = this;
        while (abstractC3007f2.f52630a.f()) {
            abstractC3007f2 = (AbstractC3007f) abstractC3007f2.f52630a.e();
        }
        abstractC3007f2.f52630a = x1.d.h(abstractC3007f);
        return this;
    }

    public abstract void b();

    public abstract C3010i c(String str, C2982a c2982a);

    public Collection d(Collection collection, C2982a c2982a) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C3010i c3010iC = c((String) it.next(), c2982a);
            if (c3010iC != null) {
                arrayList.add(c3010iC);
            }
        }
        return arrayList;
    }

    public Set e(Collection collection, C2982a c2982a) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(f((C3010i) it.next(), c2982a));
        }
        return linkedHashSet;
    }

    public abstract Set f(C3010i c3010i, C2982a c2982a);

    public final x1.d g() {
        return this.f52630a;
    }

    public abstract boolean h(C3003b c3003b);
}
