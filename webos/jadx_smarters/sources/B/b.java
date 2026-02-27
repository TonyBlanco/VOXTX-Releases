package B;

import O.e;
import O.f;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import s.i;

/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f161a = new f(10);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final i f162b = new i();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f163c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final HashSet f164d = new HashSet();

    public void a(Object obj, Object obj2) {
        if (!this.f162b.containsKey(obj) || !this.f162b.containsKey(obj2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayListF = (ArrayList) this.f162b.get(obj);
        if (arrayListF == null) {
            arrayListF = f();
            this.f162b.put(obj, arrayListF);
        }
        arrayListF.add(obj2);
    }

    public void b(Object obj) {
        if (this.f162b.containsKey(obj)) {
            return;
        }
        this.f162b.put(obj, null);
    }

    public void c() {
        int size = this.f162b.size();
        for (int i9 = 0; i9 < size; i9++) {
            ArrayList arrayList = (ArrayList) this.f162b.o(i9);
            if (arrayList != null) {
                k(arrayList);
            }
        }
        this.f162b.clear();
    }

    public boolean d(Object obj) {
        return this.f162b.containsKey(obj);
    }

    public final void e(Object obj, ArrayList arrayList, HashSet hashSet) {
        if (arrayList.contains(obj)) {
            return;
        }
        if (hashSet.contains(obj)) {
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
        hashSet.add(obj);
        ArrayList arrayList2 = (ArrayList) this.f162b.get(obj);
        if (arrayList2 != null) {
            int size = arrayList2.size();
            for (int i9 = 0; i9 < size; i9++) {
                e(arrayList2.get(i9), arrayList, hashSet);
            }
        }
        hashSet.remove(obj);
        arrayList.add(obj);
    }

    public final ArrayList f() {
        ArrayList arrayList = (ArrayList) this.f161a.b();
        return arrayList == null ? new ArrayList() : arrayList;
    }

    public List g(Object obj) {
        return (List) this.f162b.get(obj);
    }

    public List h(Object obj) {
        int size = this.f162b.size();
        ArrayList arrayList = null;
        for (int i9 = 0; i9 < size; i9++) {
            ArrayList arrayList2 = (ArrayList) this.f162b.o(i9);
            if (arrayList2 != null && arrayList2.contains(obj)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f162b.j(i9));
            }
        }
        return arrayList;
    }

    public ArrayList i() {
        this.f163c.clear();
        this.f164d.clear();
        int size = this.f162b.size();
        for (int i9 = 0; i9 < size; i9++) {
            e(this.f162b.j(i9), this.f163c, this.f164d);
        }
        return this.f163c;
    }

    public boolean j(Object obj) {
        int size = this.f162b.size();
        for (int i9 = 0; i9 < size; i9++) {
            ArrayList arrayList = (ArrayList) this.f162b.o(i9);
            if (arrayList != null && arrayList.contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        arrayList.clear();
        this.f161a.a(arrayList);
    }
}
