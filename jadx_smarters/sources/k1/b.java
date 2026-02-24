package K1;

import d.AbstractC1617D;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import u1.InterfaceC2843b;
import v1.InterfaceC2868f;
import v1.k;
import v1.n;

/* JADX INFO: loaded from: classes.dex */
public final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2868f.b f3585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f3586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f3587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H1.b f3588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f3589e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f3590f;

    public class a implements n.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f3591a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f3592b;

        public a(k kVar, Object obj) {
            this.f3591a = kVar;
            this.f3592b = obj;
        }

        @Override // v1.n.a
        public Object a(n.c cVar) {
            Object obj = this.f3592b;
            b.this.f3589e.b(this.f3591a, x1.d.d(obj));
            Object obj2 = cVar.read(new b(b.this.f3585a, obj, b.this.f3588d, b.this.f3587c, b.this.f3589e));
            b.this.f3589e.d(this.f3591a, x1.d.d(obj));
            return obj2;
        }
    }

    public b(InterfaceC2868f.b bVar, Object obj, H1.b bVar2, d dVar, c cVar) {
        this.f3585a = bVar;
        this.f3586b = obj;
        this.f3588d = bVar2;
        this.f3587c = dVar;
        this.f3589e = cVar;
        this.f3590f = bVar.valueMap();
    }

    @Override // v1.n
    public List a(k kVar, n.b bVar) {
        ArrayList arrayList;
        if (k(kVar)) {
            return null;
        }
        l(kVar);
        List list = (List) this.f3588d.a(this.f3586b, kVar);
        i(kVar, list);
        if (list == null) {
            this.f3589e.g();
            arrayList = null;
        } else {
            arrayList = new ArrayList();
            for (int i9 = 0; i9 < list.size(); i9++) {
                this.f3589e.f(i9);
                Object obj = list.get(i9);
                if (obj == null) {
                    arrayList.add(null);
                    this.f3589e.g();
                } else {
                    arrayList.add(bVar.read(new a(kVar, obj)));
                }
                this.f3589e.e(i9);
            }
            this.f3589e.a(list);
        }
        j(kVar);
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return null;
    }

    @Override // v1.n
    public Object b(k kVar, n.c cVar) {
        Object obj = null;
        if (k(kVar)) {
            return null;
        }
        l(kVar);
        Object objA = this.f3588d.a(this.f3586b, kVar);
        i(kVar, objA);
        this.f3589e.b(kVar, x1.d.d(objA));
        if (objA == null) {
            this.f3589e.g();
        } else {
            obj = cVar.read(new b(this.f3585a, objA, this.f3588d, this.f3587c, this.f3589e));
        }
        this.f3589e.d(kVar, x1.d.d(objA));
        j(kVar);
        return obj;
    }

    @Override // v1.n
    public String c(k kVar) {
        if (k(kVar)) {
            return null;
        }
        l(kVar);
        String str = (String) this.f3588d.a(this.f3586b, kVar);
        i(kVar, str);
        c cVar = this.f3589e;
        if (str == null) {
            cVar.g();
        } else {
            cVar.c(str);
        }
        j(kVar);
        return str;
    }

    @Override // v1.n
    public Object d(k.a aVar) {
        Object objDecode = null;
        if (k(aVar)) {
            return null;
        }
        l(aVar);
        Object objA = this.f3588d.a(this.f3586b, aVar);
        i(aVar, objA);
        if (objA == null) {
            this.f3589e.g();
        } else {
            InterfaceC2843b interfaceC2843bA = this.f3587c.a(aVar.m());
            this.f3589e.c(objA);
            objDecode = interfaceC2843bA.decode(objA.toString());
        }
        j(aVar);
        return objDecode;
    }

    public final void i(k kVar, Object obj) {
        if (kVar.i() || obj != null) {
            return;
        }
        throw new NullPointerException("corrupted response reader, expected non null value for " + kVar.c());
    }

    public final void j(k kVar) {
        this.f3589e.i(kVar, this.f3585a);
    }

    public final boolean k(k kVar) {
        Iterator it = kVar.b().iterator();
        while (it.hasNext()) {
            AbstractC1617D.a(it.next());
        }
        return false;
    }

    public final void l(k kVar) {
        this.f3589e.h(kVar, this.f3585a);
    }
}
