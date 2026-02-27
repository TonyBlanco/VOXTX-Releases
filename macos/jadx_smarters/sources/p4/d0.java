package p4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import n4.C2284p;
import p4.C2434i;
import t4.AbstractC2774a;

/* JADX INFO: loaded from: classes3.dex */
public final class d0 extends C2434i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2429d f46457a;

    public d0(C2429d c2429d) {
        this.f46457a = c2429d;
    }

    @Override // p4.C2434i.a
    public final void g() {
        long jR = this.f46457a.r();
        C2429d c2429d = this.f46457a;
        if (jR != c2429d.f46444b) {
            c2429d.f46444b = jR;
            c2429d.n();
            C2429d c2429d2 = this.f46457a;
            if (c2429d2.f46444b != 0) {
                c2429d2.q();
            }
        }
    }

    @Override // p4.C2434i.a
    public final void h(int[] iArr) {
        List listJ = AbstractC2774a.j(iArr);
        if (this.f46457a.f46446d.equals(listJ)) {
            return;
        }
        this.f46457a.z();
        this.f46457a.f46448f.evictAll();
        this.f46457a.f46449g.clear();
        C2429d c2429d = this.f46457a;
        c2429d.f46446d = listJ;
        C2429d.m(c2429d);
        this.f46457a.x();
        this.f46457a.w();
    }

    @Override // p4.C2434i.a
    public final void i(int[] iArr, int i9) {
        int size;
        if (i9 == 0) {
            size = this.f46457a.f46446d.size();
        } else {
            size = this.f46457a.f46447e.get(i9, -1);
            if (size == -1) {
                this.f46457a.q();
                return;
            }
        }
        int length = iArr.length;
        this.f46457a.z();
        this.f46457a.f46446d.addAll(size, AbstractC2774a.j(iArr));
        C2429d.m(this.f46457a);
        C2429d.g(this.f46457a, size, length);
        this.f46457a.w();
    }

    @Override // p4.C2434i.a
    public final void j(C2284p[] c2284pArr) {
        HashSet hashSet = new HashSet();
        this.f46457a.f46449g.clear();
        for (C2284p c2284p : c2284pArr) {
            int iK = c2284p.K();
            this.f46457a.f46448f.put(Integer.valueOf(iK), c2284p);
            int i9 = this.f46457a.f46447e.get(iK, -1);
            if (i9 == -1) {
                this.f46457a.q();
                return;
            }
            hashSet.add(Integer.valueOf(i9));
        }
        Iterator it = this.f46457a.f46449g.iterator();
        while (it.hasNext()) {
            int i10 = this.f46457a.f46447e.get(((Integer) it.next()).intValue(), -1);
            if (i10 != -1) {
                hashSet.add(Integer.valueOf(i10));
            }
        }
        this.f46457a.f46449g.clear();
        ArrayList arrayList = new ArrayList(hashSet);
        Collections.sort(arrayList);
        this.f46457a.z();
        this.f46457a.y(AbstractC2774a.l(arrayList));
        this.f46457a.w();
    }

    @Override // p4.C2434i.a
    public final void k(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i9 : iArr) {
            this.f46457a.f46448f.remove(Integer.valueOf(i9));
            int i10 = this.f46457a.f46447e.get(i9, -1);
            if (i10 == -1) {
                this.f46457a.q();
                return;
            } else {
                this.f46457a.f46447e.delete(i9);
                arrayList.add(Integer.valueOf(i10));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Collections.sort(arrayList);
        this.f46457a.z();
        this.f46457a.f46446d.removeAll(AbstractC2774a.j(iArr));
        C2429d.m(this.f46457a);
        C2429d.h(this.f46457a, AbstractC2774a.l(arrayList));
        this.f46457a.w();
    }

    @Override // p4.C2434i.a
    public final void l(List list, List list2, int i9) {
        int size;
        ArrayList arrayList = new ArrayList();
        if (i9 == 0) {
            size = this.f46457a.f46446d.size();
        } else if (list2.isEmpty()) {
            this.f46457a.f46443a.f("Received a Queue Reordered message with an empty reordered items IDs list.", new Object[0]);
            size = -1;
        } else {
            size = this.f46457a.f46447e.get(i9, -1);
            if (size == -1) {
                size = this.f46457a.f46447e.get(((Integer) list2.get(0)).intValue(), -1);
            }
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            int i10 = this.f46457a.f46447e.get(((Integer) it.next()).intValue(), -1);
            if (i10 == -1) {
                this.f46457a.q();
                return;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        this.f46457a.z();
        C2429d c2429d = this.f46457a;
        c2429d.f46446d = list;
        C2429d.m(c2429d);
        C2429d.i(this.f46457a, arrayList, size);
        this.f46457a.w();
    }

    @Override // p4.C2434i.a
    public final void m(int[] iArr) {
        ArrayList arrayList = new ArrayList();
        for (int i9 : iArr) {
            this.f46457a.f46448f.remove(Integer.valueOf(i9));
            int i10 = this.f46457a.f46447e.get(i9, -1);
            if (i10 == -1) {
                this.f46457a.q();
                return;
            }
            arrayList.add(Integer.valueOf(i10));
        }
        Collections.sort(arrayList);
        this.f46457a.z();
        this.f46457a.y(AbstractC2774a.l(arrayList));
        this.f46457a.w();
    }

    @Override // p4.C2434i.a
    public final void n() {
        this.f46457a.q();
    }
}
