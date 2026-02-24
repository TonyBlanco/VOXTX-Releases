package F1;

import com.amazonaws.services.s3.model.InstructionFileId;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import v1.InterfaceC2868f;
import v1.k;
import z1.AbstractC3004c;
import z1.C3003b;
import z1.C3005d;
import z1.C3010i;
import z1.C3012k;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements K1.c {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final h f1882h = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public M1.b f1883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public M1.b f1884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public M1.b f1885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f1886d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C3010i.a f1887e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3012k f1888f = new C3012k();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set f1889g = Collections.emptySet();

    public static class a extends h {

        /* JADX INFO: renamed from: F1.h$a$a, reason: collision with other inner class name */
        public class C0026a implements F1.a {
            public C0026a() {
            }

            @Override // F1.a
            public String a(k kVar, InterfaceC2868f.b bVar) {
                return C3003b.f52622b.b();
            }
        }

        @Override // F1.h, K1.c
        public void a(List list) {
        }

        @Override // F1.h, K1.c
        public void b(k kVar, x1.d dVar) {
        }

        @Override // F1.h, K1.c
        public void c(Object obj) {
        }

        @Override // F1.h, K1.c
        public void d(k kVar, x1.d dVar) {
        }

        @Override // F1.h, K1.c
        public void e(int i9) {
        }

        @Override // F1.h, K1.c
        public void f(int i9) {
        }

        @Override // F1.h, K1.c
        public void g() {
        }

        @Override // F1.h, K1.c
        public void h(k kVar, InterfaceC2868f.b bVar) {
        }

        @Override // F1.h, K1.c
        public void i(k kVar, InterfaceC2868f.b bVar) {
        }

        @Override // F1.h
        public F1.a j() {
            return new C0026a();
        }

        @Override // F1.h
        public Set k() {
            return Collections.emptySet();
        }

        @Override // F1.h
        public Collection m() {
            return Collections.emptyList();
        }

        @Override // F1.h
        public C3003b n(k kVar, Object obj) {
            return C3003b.f52622b;
        }

        @Override // F1.h
        public void p(InterfaceC2868f interfaceC2868f) {
        }
    }

    @Override // K1.c
    public void a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            arrayList.add(0, this.f1885c.b());
        }
        this.f1885c.c(arrayList);
    }

    @Override // K1.c
    public void b(k kVar, x1.d dVar) {
        this.f1883a.c(this.f1886d);
        C3003b c3003bN = dVar.f() ? n(kVar, dVar.e()) : C3003b.f52622b;
        String strB = c3003bN.b();
        if (c3003bN == C3003b.f52622b) {
            strB = l();
        } else {
            ArrayList arrayList = new ArrayList();
            this.f1886d = arrayList;
            arrayList.add(strB);
        }
        this.f1884b.c(this.f1887e.c());
        this.f1887e = C3010i.b(strB);
    }

    @Override // K1.c
    public void c(Object obj) {
        this.f1885c.c(obj);
    }

    @Override // K1.c
    public void d(k kVar, x1.d dVar) {
        this.f1886d = (List) this.f1883a.b();
        if (dVar.f()) {
            C3010i c3010iC = this.f1887e.c();
            this.f1885c.c(new C3005d(c3010iC.g()));
            this.f1889g.add(c3010iC.g());
            this.f1888f.b(c3010iC);
        }
        this.f1887e = ((C3010i) this.f1884b.b()).i();
    }

    @Override // K1.c
    public void e(int i9) {
        this.f1886d.remove(r2.size() - 1);
    }

    @Override // K1.c
    public void f(int i9) {
        this.f1886d.add(Integer.toString(i9));
    }

    @Override // K1.c
    public void g() {
        this.f1885c.c(null);
    }

    @Override // K1.c
    public void h(k kVar, InterfaceC2868f.b bVar) {
        this.f1886d.add(j().a(kVar, bVar));
    }

    @Override // K1.c
    public void i(k kVar, InterfaceC2868f.b bVar) {
        this.f1886d.remove(r0.size() - 1);
        Object objB = this.f1885c.b();
        String strA = j().a(kVar, bVar);
        this.f1889g.add(this.f1887e.d() + InstructionFileId.DOT + strA);
        this.f1887e.a(strA, objB);
        if (this.f1884b.a()) {
            this.f1888f.b(this.f1887e.c());
        }
    }

    public abstract F1.a j();

    public Set k() {
        return this.f1889g;
    }

    public final String l() {
        StringBuilder sb = new StringBuilder();
        int size = this.f1886d.size();
        for (int i9 = 0; i9 < size; i9++) {
            sb.append((String) this.f1886d.get(i9));
            if (i9 < size - 1) {
                sb.append(InstructionFileId.DOT);
            }
        }
        return sb.toString();
    }

    public Collection m() {
        return this.f1888f.a();
    }

    public abstract C3003b n(k kVar, Object obj);

    public void o(C3003b c3003b) {
        this.f1883a = new M1.b();
        this.f1884b = new M1.b();
        this.f1885c = new M1.b();
        this.f1889g = new HashSet();
        this.f1886d = new ArrayList();
        this.f1887e = C3010i.b(c3003b.b());
        this.f1888f = new C3012k();
    }

    public void p(InterfaceC2868f interfaceC2868f) {
        o(AbstractC3004c.rootKeyForOperation(interfaceC2868f));
    }
}
