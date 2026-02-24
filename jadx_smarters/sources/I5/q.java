package I5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q {

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C0637c f2903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f2904b = new HashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f2905c = new HashSet();

        public b(C0637c c0637c) {
            this.f2903a = c0637c;
        }

        public void a(b bVar) {
            this.f2904b.add(bVar);
        }

        public void b(b bVar) {
            this.f2905c.add(bVar);
        }

        public C0637c c() {
            return this.f2903a;
        }

        public Set d() {
            return this.f2904b;
        }

        public boolean e() {
            return this.f2904b.isEmpty();
        }

        public boolean f() {
            return this.f2905c.isEmpty();
        }

        public void g(b bVar) {
            this.f2905c.remove(bVar);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final F f2906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f2907b;

        public c(F f9, boolean z9) {
            this.f2906a = f9;
            this.f2907b = z9;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return cVar.f2906a.equals(this.f2906a) && cVar.f2907b == this.f2907b;
        }

        public int hashCode() {
            return ((this.f2906a.hashCode() ^ 1000003) * 1000003) ^ Boolean.valueOf(this.f2907b).hashCode();
        }
    }

    public static void a(List list) {
        Set<b> setC = c(list);
        Set setB = b(setC);
        int i9 = 0;
        while (!setB.isEmpty()) {
            b bVar = (b) setB.iterator().next();
            setB.remove(bVar);
            i9++;
            for (b bVar2 : bVar.d()) {
                bVar2.g(bVar);
                if (bVar2.f()) {
                    setB.add(bVar2);
                }
            }
        }
        if (i9 == list.size()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 : setC) {
            if (!bVar3.f() && !bVar3.e()) {
                arrayList.add(bVar3.c());
            }
        }
        throw new s(arrayList);
    }

    public static Set b(Set set) {
        HashSet hashSet = new HashSet();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.f()) {
                hashSet.add(bVar);
            }
        }
        return hashSet;
    }

    public static Set c(List list) {
        Set<b> set;
        HashMap map = new HashMap(list.size());
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                Iterator it2 = map.values().iterator();
                while (it2.hasNext()) {
                    for (b bVar : (Set) it2.next()) {
                        for (r rVar : bVar.c().g()) {
                            if (rVar.e() && (set = (Set) map.get(new c(rVar.c(), rVar.g()))) != null) {
                                for (b bVar2 : set) {
                                    bVar.a(bVar2);
                                    bVar2.b(bVar);
                                }
                            }
                        }
                    }
                }
                HashSet hashSet = new HashSet();
                Iterator it3 = map.values().iterator();
                while (it3.hasNext()) {
                    hashSet.addAll((Set) it3.next());
                }
                return hashSet;
            }
            C0637c c0637c = (C0637c) it.next();
            b bVar3 = new b(c0637c);
            for (F f9 : c0637c.j()) {
                c cVar = new c(f9, !c0637c.p());
                if (!map.containsKey(cVar)) {
                    map.put(cVar, new HashSet());
                }
                Set set2 = (Set) map.get(cVar);
                if (!set2.isEmpty() && !cVar.f2907b) {
                    throw new IllegalArgumentException(String.format("Multiple components provide %s.", f9));
                }
                set2.add(bVar3);
            }
        }
    }
}
