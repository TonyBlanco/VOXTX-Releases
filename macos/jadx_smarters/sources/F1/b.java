package F1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import v1.InterfaceC2868f;
import v1.k;
import v1.m;
import v1.o;

/* JADX INFO: loaded from: classes.dex */
public final class b implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2868f.b f1810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final K1.d f1811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f1812c = new LinkedHashMap();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1813a;

        static {
            int[] iArr = new int[k.b.values().length];
            f1813a = iArr;
            try {
                iArr[k.b.OBJECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1813a[k.b.LIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: F1.b$b, reason: collision with other inner class name */
    public static class C0024b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f1814a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f1815b;

        public C0024b(k kVar, Object obj) {
            this.f1814a = kVar;
            this.f1815b = obj;
        }
    }

    public static final class c implements o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2868f.b f1816a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K1.d f1817b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f1818c;

        public c(InterfaceC2868f.b bVar, K1.d dVar) {
            this.f1816a = bVar;
            this.f1817b = dVar;
        }

        @Override // v1.o.a
        public void a(m mVar) {
            b bVar = new b(this.f1816a, this.f1817b);
            mVar.marshal(bVar);
            this.f1818c = bVar.f1812c;
        }
    }

    public b(InterfaceC2868f.b bVar, K1.d dVar) {
        this.f1810a = bVar;
        this.f1811b = dVar;
    }

    public static void e(k kVar, Object obj) {
        if (!kVar.i() && obj == null) {
            throw new NullPointerException(String.format("Mandatory response field `%s` resolved with null value", kVar.k()));
        }
    }

    @Override // v1.o
    public void a(k kVar, List list, o.b bVar) {
        e(kVar, list);
        if (list == null) {
            this.f1812c.put(kVar.k(), new C0024b(kVar, null));
        } else {
            this.f1812c.put(kVar.k(), new C0024b(kVar, l(list, bVar)));
        }
    }

    @Override // v1.o
    public void b(k kVar, String str) {
        m(kVar, str);
    }

    @Override // v1.o
    public void c(k.a aVar, Object obj) {
        m(aVar, obj != null ? this.f1811b.a(aVar.m()).encode(obj) : null);
    }

    @Override // v1.o
    public void d(k kVar, m mVar) {
        e(kVar, mVar);
        if (mVar == null) {
            this.f1812c.put(kVar.k(), new C0024b(kVar, null));
            return;
        }
        b bVar = new b(this.f1810a, this.f1811b);
        mVar.marshal(bVar);
        this.f1812c.put(kVar.k(), new C0024b(kVar, bVar.f1812c));
    }

    public Collection f(h hVar) {
        g(this.f1810a, hVar, this.f1812c);
        return hVar.m();
    }

    public final void g(InterfaceC2868f.b bVar, h hVar, Map map) {
        Map mapJ = j(map);
        for (String str : map.keySet()) {
            C0024b c0024b = (C0024b) map.get(str);
            Object obj = mapJ.get(str);
            hVar.h(c0024b.f1814a, bVar);
            int i9 = a.f1813a[c0024b.f1814a.l().ordinal()];
            if (i9 == 1) {
                i(c0024b, (Map) obj, hVar);
            } else if (i9 == 2) {
                h(c0024b.f1814a, (List) c0024b.f1815b, (List) obj, hVar);
            } else if (obj == null) {
                hVar.g();
            } else {
                hVar.c(obj);
            }
            hVar.i(c0024b.f1814a, bVar);
        }
    }

    public final void h(k kVar, List list, List list2, h hVar) {
        if (list == null) {
            hVar.g();
            return;
        }
        for (int i9 = 0; i9 < list.size(); i9++) {
            hVar.f(i9);
            Object obj = list.get(i9);
            if (obj instanceof Map) {
                hVar.b(kVar, x1.d.d((Map) list2.get(i9)));
                g(this.f1810a, hVar, (Map) obj);
                hVar.d(kVar, x1.d.d((Map) list2.get(i9)));
            } else if (obj instanceof List) {
                h(kVar, (List) obj, (List) list2.get(i9), hVar);
            } else {
                hVar.c(list2.get(i9));
            }
            hVar.e(i9);
        }
        hVar.a(list2);
    }

    public final void i(C0024b c0024b, Map map, h hVar) {
        hVar.b(c0024b.f1814a, x1.d.d(map));
        Object obj = c0024b.f1815b;
        if (obj == null) {
            hVar.g();
        } else {
            g(this.f1810a, hVar, (Map) obj);
        }
        hVar.d(c0024b.f1814a, x1.d.d(map));
    }

    public final Map j(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            Object objK = ((C0024b) entry.getValue()).f1815b;
            if (objK == null) {
                objK = null;
            } else if (objK instanceof Map) {
                objK = j((Map) objK);
            } else if (objK instanceof List) {
                objK = k((List) objK);
            }
            linkedHashMap.put(str, objK);
        }
        return linkedHashMap;
    }

    public final List k(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object objK : list) {
            if (objK instanceof Map) {
                objK = j((Map) objK);
            } else if (objK instanceof List) {
                objK = k((List) objK);
            }
            arrayList.add(objK);
        }
        return arrayList;
    }

    public final List l(List list, o.b bVar) {
        Object objL;
        c cVar = new c(this.f1810a, this.f1811b);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof List) {
                objL = l((List) obj, bVar);
            } else {
                bVar.write(obj, cVar);
                objL = cVar.f1818c;
            }
            arrayList.add(objL);
        }
        return arrayList;
    }

    public final void m(k kVar, Object obj) {
        e(kVar, obj);
        this.f1812c.put(kVar.k(), new C0024b(kVar, obj));
    }
}
