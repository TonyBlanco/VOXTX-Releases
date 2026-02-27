package K1;

import F1.h;
import J1.i;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okio.BufferedSource;
import v1.C2863a;
import v1.InterfaceC2868f;
import v1.l;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2868f f3578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l f3579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f3580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f3581d;

    /* JADX INFO: renamed from: K1.a$a, reason: collision with other inner class name */
    public class C0057a implements i.d {
        public C0057a() {
        }

        @Override // J1.i.d
        public Object a(i iVar) {
            return a.this.f3579b.map(new K1.b(a.this.f3578a.variables(), iVar.u(), new H1.c(), a.this.f3580c, a.this.f3581d));
        }
    }

    public class b implements i.c {

        /* JADX INFO: renamed from: K1.a$b$a, reason: collision with other inner class name */
        public class C0058a implements i.d {
            public C0058a() {
            }

            @Override // J1.i.d
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public C2863a a(i iVar) {
                return a.this.g(iVar.u());
            }
        }

        public b() {
        }

        @Override // J1.i.c
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2863a a(i iVar) {
            return (C2863a) iVar.o(true, new C0058a());
        }
    }

    public a(InterfaceC2868f interfaceC2868f, l lVar, d dVar, h hVar) {
        this.f3578a = interfaceC2868f;
        this.f3579b = lVar;
        this.f3580c = dVar;
        this.f3581d = hVar;
    }

    public v1.i f(BufferedSource bufferedSource) throws Throwable {
        J1.b bVar;
        this.f3581d.p(this.f3578a);
        J1.b bVar2 = null;
        InterfaceC2868f.a aVar = null;
        try {
            bVar = new J1.b(bufferedSource);
        } catch (Throwable th) {
            th = th;
        }
        try {
            bVar.c();
            i iVarC = J1.a.c(bVar);
            List listI = null;
            while (iVarC.f()) {
                String strN = iVarC.n();
                if ("data".equals(strN)) {
                    aVar = (InterfaceC2868f.a) iVarC.o(true, new C0057a());
                } else if ("errors".equals(strN)) {
                    listI = i(iVarC);
                } else {
                    iVarC.t();
                }
            }
            bVar.e();
            v1.i iVarF = v1.i.a(this.f3578a).g(this.f3578a.wrapData(aVar)).i(listI).h(this.f3581d.k()).f();
            bVar.close();
            return iVarF;
        } catch (Throwable th2) {
            th = th2;
            bVar2 = bVar;
            if (bVar2 != null) {
                bVar2.close();
            }
            throw th;
        }
    }

    public final C2863a g(Map map) {
        ArrayList arrayList = new ArrayList();
        HashMap map2 = new HashMap();
        while (true) {
            String string = null;
            for (Map.Entry entry : map.entrySet()) {
                if ("message".equals(entry.getKey())) {
                    Object value = entry.getValue();
                    if (value != null) {
                        string = value.toString();
                    }
                } else if ("locations".equals(entry.getKey())) {
                    List list = (List) entry.getValue();
                    if (list != null) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(h((Map) it.next()));
                        }
                    }
                } else if (entry.getValue() != null) {
                    map2.put(entry.getKey(), entry.getValue());
                }
            }
            return new C2863a(string, arrayList, map2);
        }
    }

    public final C2863a.C0472a h(Map map) {
        long jLongValue;
        long jLongValue2 = -1;
        if (map != null) {
            jLongValue = -1;
            for (Map.Entry entry : map.entrySet()) {
                if ("line".equals(entry.getKey())) {
                    jLongValue2 = ((BigDecimal) entry.getValue()).longValue();
                } else if ("column".equals(entry.getKey())) {
                    jLongValue = ((BigDecimal) entry.getValue()).longValue();
                }
            }
        } else {
            jLongValue = -1;
        }
        return new C2863a.C0472a(jLongValue2, jLongValue);
    }

    public final List i(i iVar) {
        return iVar.m(true, new b());
    }
}
