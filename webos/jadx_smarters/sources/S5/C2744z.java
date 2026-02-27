package s5;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import s5.AbstractC2717A;
import s5.AbstractC2718B;

/* JADX INFO: renamed from: s5.z, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C2744z extends AbstractC2718B implements F {

    /* JADX INFO: renamed from: s5.z$a */
    public static final class a extends AbstractC2718B.c {
        public C2744z d() {
            return (C2744z) super.a();
        }

        public a e(Object obj, Object obj2) {
            super.c(obj, obj2);
            return this;
        }
    }

    public C2744z(AbstractC2717A abstractC2717A, int i9) {
        super(abstractC2717A, i9);
    }

    public static C2744z s(Collection collection, Comparator comparator) {
        if (collection.isEmpty()) {
            return u();
        }
        AbstractC2717A.a aVar = new AbstractC2717A.a(collection.size());
        Iterator it = collection.iterator();
        int size = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Collection collection2 = (Collection) entry.getValue();
            AbstractC2743y abstractC2743yR = comparator == null ? AbstractC2743y.r(collection2) : AbstractC2743y.F(comparator, collection2);
            if (!abstractC2743yR.isEmpty()) {
                aVar.f(key, abstractC2743yR);
                size += abstractC2743yR.size();
            }
        }
        return new C2744z(aVar.c(), size);
    }

    public static C2744z u() {
        return r.f50120h;
    }

    @Override // s5.J
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public AbstractC2743y get(Object obj) {
        AbstractC2743y abstractC2743y = (AbstractC2743y) this.f49977f.get(obj);
        return abstractC2743y == null ? AbstractC2743y.z() : abstractC2743y;
    }
}
