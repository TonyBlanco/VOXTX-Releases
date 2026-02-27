package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC1139y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final E f14572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final E f14573b;

    public static final class b extends E {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Class f14574c = Collections.unmodifiableList(Collections.emptyList()).getClass();

        public b() {
            super();
        }

        public static List f(Object obj, long j9) {
            return (List) p0.A(obj, j9);
        }

        public static List g(Object obj, long j9, int i9) {
            List listW;
            List list;
            List listF = f(obj, j9);
            if (!listF.isEmpty()) {
                if (f14574c.isAssignableFrom(listF.getClass())) {
                    ArrayList arrayList = new ArrayList(listF.size() + i9);
                    arrayList.addAll(listF);
                    list = arrayList;
                } else if (listF instanceof o0) {
                    C c9 = new C(listF.size() + i9);
                    c9.addAll((o0) listF);
                    list = c9;
                } else {
                    if (!(listF instanceof Y) || !(listF instanceof AbstractC1139y.b)) {
                        return listF;
                    }
                    AbstractC1139y.b bVar = (AbstractC1139y.b) listF;
                    if (bVar.t()) {
                        return listF;
                    }
                    listW = bVar.w(listF.size() + i9);
                }
                p0.O(obj, j9, list);
                return list;
            }
            listW = listF instanceof D ? new C(i9) : ((listF instanceof Y) && (listF instanceof AbstractC1139y.b)) ? ((AbstractC1139y.b) listF).w(i9) : new ArrayList(i9);
            p0.O(obj, j9, listW);
            return listW;
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void c(Object obj, long j9) {
            Object objUnmodifiableList;
            List list = (List) p0.A(obj, j9);
            if (list instanceof D) {
                objUnmodifiableList = ((D) list).C();
            } else {
                if (f14574c.isAssignableFrom(list.getClass())) {
                    return;
                }
                if ((list instanceof Y) && (list instanceof AbstractC1139y.b)) {
                    AbstractC1139y.b bVar = (AbstractC1139y.b) list;
                    if (bVar.t()) {
                        bVar.k();
                        return;
                    }
                    return;
                }
                objUnmodifiableList = Collections.unmodifiableList(list);
            }
            p0.O(obj, j9, objUnmodifiableList);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void d(Object obj, Object obj2, long j9) {
            List listF = f(obj2, j9);
            List listG = g(obj, j9, listF.size());
            int size = listG.size();
            int size2 = listF.size();
            if (size > 0 && size2 > 0) {
                listG.addAll(listF);
            }
            if (size > 0) {
                listF = listG;
            }
            p0.O(obj, j9, listF);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public List e(Object obj, long j9) {
            return g(obj, j9, 10);
        }
    }

    public static final class c extends E {
        public c() {
            super();
        }

        public static AbstractC1139y.b f(Object obj, long j9) {
            return (AbstractC1139y.b) p0.A(obj, j9);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void c(Object obj, long j9) {
            f(obj, j9).k();
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public void d(Object obj, Object obj2, long j9) {
            AbstractC1139y.b bVarF = f(obj, j9);
            AbstractC1139y.b bVarF2 = f(obj2, j9);
            int size = bVarF.size();
            int size2 = bVarF2.size();
            if (size > 0 && size2 > 0) {
                if (!bVarF.t()) {
                    bVarF = bVarF.w(size2 + size);
                }
                bVarF.addAll(bVarF2);
            }
            if (size > 0) {
                bVarF2 = bVarF;
            }
            p0.O(obj, j9, bVarF2);
        }

        @Override // androidx.datastore.preferences.protobuf.E
        public List e(Object obj, long j9) {
            AbstractC1139y.b bVarF = f(obj, j9);
            if (bVarF.t()) {
                return bVarF;
            }
            int size = bVarF.size();
            AbstractC1139y.b bVarW = bVarF.w(size == 0 ? 10 : size * 2);
            p0.O(obj, j9, bVarW);
            return bVarW;
        }
    }

    static {
        f14572a = new b();
        f14573b = new c();
    }

    public E() {
    }

    public static E a() {
        return f14572a;
    }

    public static E b() {
        return f14573b;
    }

    public abstract void c(Object obj, long j9);

    public abstract void d(Object obj, Object obj2, long j9);

    public abstract List e(Object obj, long j9);
}
