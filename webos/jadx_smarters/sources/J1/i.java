package J1;

import J1.e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f3024a;

    public class a implements d {
        public a() {
        }

        @Override // J1.i.d
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map a(i iVar) {
            return iVar.u();
        }
    }

    public class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f3026a;

        public b(i iVar) {
            this.f3026a = iVar;
        }

        @Override // J1.i.c
        public Object a(i iVar) {
            return this.f3026a.h() ? i.this.r(iVar) : this.f3026a.k() ? i.this.s(iVar) : iVar.p(true);
        }
    }

    public interface c {
        Object a(i iVar);
    }

    public interface d {
        Object a(i iVar);
    }

    public i(e eVar) {
        this.f3024a = eVar;
    }

    public final void e(boolean z9) {
        if (!z9 && this.f3024a.k() == e.a.NULL) {
            throw new NullPointerException("corrupted response reader, expected non null value");
        }
    }

    public boolean f() {
        return this.f3024a.g();
    }

    public final boolean g() {
        return this.f3024a.k() == e.a.BOOLEAN;
    }

    public final boolean h() {
        return this.f3024a.k() == e.a.BEGIN_ARRAY;
    }

    public final boolean i() {
        return this.f3024a.k() == e.a.NULL;
    }

    public final boolean j() {
        return this.f3024a.k() == e.a.NUMBER;
    }

    public final boolean k() {
        return this.f3024a.k() == e.a.BEGIN_OBJECT;
    }

    public Boolean l(boolean z9) {
        e(z9);
        if (this.f3024a.k() != e.a.NULL) {
            return Boolean.valueOf(this.f3024a.h());
        }
        this.f3024a.l();
        return null;
    }

    public List m(boolean z9, c cVar) {
        e(z9);
        if (this.f3024a.k() == e.a.NULL) {
            this.f3024a.l();
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f3024a.a();
        while (this.f3024a.g()) {
            arrayList.add(cVar.a(this));
        }
        this.f3024a.d();
        return arrayList;
    }

    public String n() {
        return this.f3024a.i();
    }

    public Object o(boolean z9, d dVar) {
        e(z9);
        if (this.f3024a.k() == e.a.NULL) {
            this.f3024a.l();
            return null;
        }
        this.f3024a.c();
        Object objA = dVar.a(this);
        this.f3024a.e();
        return objA;
    }

    public Object p(boolean z9) {
        e(z9);
        if (!i()) {
            return g() ? l(false) : j() ? new BigDecimal(q(false)) : q(false);
        }
        t();
        return null;
    }

    public String q(boolean z9) {
        e(z9);
        if (this.f3024a.k() != e.a.NULL) {
            return this.f3024a.j();
        }
        this.f3024a.l();
        return null;
    }

    public final List r(i iVar) {
        return iVar.m(false, new b(iVar));
    }

    public final Map s(i iVar) {
        return (Map) iVar.o(false, new a());
    }

    public void t() {
        this.f3024a.l();
    }

    public Map u() {
        Object objS;
        if (k()) {
            return s(this);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        while (f()) {
            String strN = n();
            if (i()) {
                t();
                objS = null;
            } else {
                objS = k() ? s(this) : h() ? r(this) : p(true);
            }
            linkedHashMap.put(strN, objS);
        }
        return linkedHashMap;
    }
}
