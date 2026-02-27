package I5;

import I5.o;
import android.util.Log;
import b6.InterfaceC1230a;
import com.google.ads.interactivemedia.v3.internal.z1;
import com.google.firebase.components.ComponentRegistrar;
import j6.InterfaceC2101a;
import j6.InterfaceC2102b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes3.dex */
public class o implements InterfaceC0639e, InterfaceC1230a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final InterfaceC2102b f2889i = new InterfaceC2102b() { // from class: I5.k
        @Override // j6.InterfaceC2102b
        public final Object get() {
            return Collections.emptySet();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2890a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f2891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f2892c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2893d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Set f2894e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v f2895f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f2896g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j f2897h;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f2898a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f2899b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f2900c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public j f2901d = j.f2882a;

        public b(Executor executor) {
            this.f2898a = executor;
        }

        public static /* synthetic */ ComponentRegistrar f(ComponentRegistrar componentRegistrar) {
            return componentRegistrar;
        }

        public b b(C0637c c0637c) {
            this.f2900c.add(c0637c);
            return this;
        }

        public b c(final ComponentRegistrar componentRegistrar) {
            this.f2899b.add(new InterfaceC2102b() { // from class: I5.p
                @Override // j6.InterfaceC2102b
                public final Object get() {
                    return o.b.f(componentRegistrar);
                }
            });
            return this;
        }

        public b d(Collection collection) {
            this.f2899b.addAll(collection);
            return this;
        }

        public o e() {
            return new o(this.f2898a, this.f2899b, this.f2900c, this.f2901d);
        }

        public b g(j jVar) {
            this.f2901d = jVar;
            return this;
        }
    }

    public o(Executor executor, Iterable iterable, Collection collection, j jVar) {
        this.f2890a = new HashMap();
        this.f2891b = new HashMap();
        this.f2892c = new HashMap();
        this.f2894e = new HashSet();
        this.f2896g = new AtomicReference();
        v vVar = new v(executor);
        this.f2895f = vVar;
        this.f2897h = jVar;
        ArrayList arrayList = new ArrayList();
        arrayList.add(C0637c.s(vVar, v.class, g6.d.class, g6.c.class));
        arrayList.add(C0637c.s(this, InterfaceC1230a.class, new Class[0]));
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C0637c c0637c = (C0637c) it.next();
            if (c0637c != null) {
                arrayList.add(c0637c);
            }
        }
        this.f2893d = q(iterable);
        n(arrayList);
    }

    public static b m(Executor executor) {
        return new b(executor);
    }

    public static List q(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // I5.InterfaceC0639e
    public /* synthetic */ Object a(Class cls) {
        return AbstractC0638d.b(this, cls);
    }

    @Override // I5.InterfaceC0639e
    public /* synthetic */ Object b(F f9) {
        return AbstractC0638d.a(this, f9);
    }

    @Override // I5.InterfaceC0639e
    public /* synthetic */ Set c(Class cls) {
        return AbstractC0638d.f(this, cls);
    }

    @Override // I5.InterfaceC0639e
    public /* synthetic */ Set d(F f9) {
        return AbstractC0638d.e(this, f9);
    }

    @Override // I5.InterfaceC0639e
    public synchronized InterfaceC2102b e(F f9) {
        E.c(f9, "Null interface requested.");
        return (InterfaceC2102b) this.f2891b.get(f9);
    }

    @Override // I5.InterfaceC0639e
    public synchronized InterfaceC2102b f(F f9) {
        y yVar = (y) this.f2892c.get(f9);
        if (yVar != null) {
            return yVar;
        }
        return f2889i;
    }

    @Override // I5.InterfaceC0639e
    public /* synthetic */ InterfaceC2102b g(Class cls) {
        return AbstractC0638d.d(this, cls);
    }

    @Override // I5.InterfaceC0639e
    public InterfaceC2101a h(F f9) {
        InterfaceC2102b interfaceC2102bE = e(f9);
        return interfaceC2102bE == null ? D.e() : interfaceC2102bE instanceof D ? (D) interfaceC2102bE : D.i(interfaceC2102bE);
    }

    @Override // I5.InterfaceC0639e
    public /* synthetic */ InterfaceC2101a i(Class cls) {
        return AbstractC0638d.c(this, cls);
    }

    public final void n(List list) {
        ArrayList arrayList = new ArrayList();
        synchronized (this) {
            Iterator it = this.f2893d.iterator();
            while (it.hasNext()) {
                try {
                    ComponentRegistrar componentRegistrar = (ComponentRegistrar) ((InterfaceC2102b) it.next()).get();
                    if (componentRegistrar != null) {
                        list.addAll(this.f2897h.a(componentRegistrar));
                        it.remove();
                    }
                } catch (w e9) {
                    it.remove();
                    Log.w("ComponentDiscovery", "Invalid component registrar.", e9);
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                Object[] array = ((C0637c) it2.next()).j().toArray();
                int length = array.length;
                int i9 = 0;
                while (true) {
                    if (i9 < length) {
                        Object obj = array[i9];
                        if (obj.toString().contains("kotlinx.coroutines.CoroutineDispatcher")) {
                            if (this.f2894e.contains(obj.toString())) {
                                it2.remove();
                                break;
                            }
                            this.f2894e.add(obj.toString());
                        }
                        i9++;
                    }
                }
            }
            if (this.f2890a.isEmpty()) {
                q.a(list);
            } else {
                ArrayList arrayList2 = new ArrayList(this.f2890a.keySet());
                arrayList2.addAll(list);
                q.a(arrayList2);
            }
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                final C0637c c0637c = (C0637c) it3.next();
                this.f2890a.put(c0637c, new x(new InterfaceC2102b() { // from class: I5.l
                    @Override // j6.InterfaceC2102b
                    public final Object get() {
                        return this.f2883a.r(c0637c);
                    }
                }));
            }
            arrayList.addAll(w(list));
            arrayList.addAll(x());
            v();
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            ((Runnable) it4.next()).run();
        }
        u();
    }

    public final void o(Map map, boolean z9) {
        for (Map.Entry entry : map.entrySet()) {
            C0637c c0637c = (C0637c) entry.getKey();
            InterfaceC2102b interfaceC2102b = (InterfaceC2102b) entry.getValue();
            if (c0637c.n() || (c0637c.o() && z9)) {
                interfaceC2102b.get();
            }
        }
        this.f2895f.d();
    }

    public void p(boolean z9) {
        HashMap map;
        if (z1.a(this.f2896g, null, Boolean.valueOf(z9))) {
            synchronized (this) {
                map = new HashMap(this.f2890a);
            }
            o(map, z9);
        }
    }

    public final /* synthetic */ Object r(C0637c c0637c) {
        return c0637c.h().a(new G(c0637c, this));
    }

    public final void u() {
        Boolean bool = (Boolean) this.f2896g.get();
        if (bool != null) {
            o(this.f2890a, bool.booleanValue());
        }
    }

    public final void v() {
        Map map;
        F fC;
        InterfaceC2102b interfaceC2102bE;
        for (C0637c c0637c : this.f2890a.keySet()) {
            for (r rVar : c0637c.g()) {
                if (rVar.g() && !this.f2892c.containsKey(rVar.c())) {
                    map = this.f2892c;
                    fC = rVar.c();
                    interfaceC2102bE = y.b(Collections.emptySet());
                } else if (this.f2891b.containsKey(rVar.c())) {
                    continue;
                } else {
                    if (rVar.f()) {
                        throw new z(String.format("Unsatisfied dependency for component %s: %s", c0637c, rVar.c()));
                    }
                    if (!rVar.g()) {
                        map = this.f2891b;
                        fC = rVar.c();
                        interfaceC2102bE = D.e();
                    }
                }
                map.put(fC, interfaceC2102bE);
            }
        }
    }

    public final List w(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0637c c0637c = (C0637c) it.next();
            if (c0637c.p()) {
                final InterfaceC2102b interfaceC2102b = (InterfaceC2102b) this.f2890a.get(c0637c);
                for (F f9 : c0637c.j()) {
                    if (this.f2891b.containsKey(f9)) {
                        final D d9 = (D) ((InterfaceC2102b) this.f2891b.get(f9));
                        arrayList.add(new Runnable() { // from class: I5.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                d9.j(interfaceC2102b);
                            }
                        });
                    } else {
                        this.f2891b.put(f9, interfaceC2102b);
                    }
                }
            }
        }
        return arrayList;
    }

    public final List x() {
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        for (Map.Entry entry : this.f2890a.entrySet()) {
            C0637c c0637c = (C0637c) entry.getKey();
            if (!c0637c.p()) {
                InterfaceC2102b interfaceC2102b = (InterfaceC2102b) entry.getValue();
                for (F f9 : c0637c.j()) {
                    if (!map.containsKey(f9)) {
                        map.put(f9, new HashSet());
                    }
                    ((Set) map.get(f9)).add(interfaceC2102b);
                }
            }
        }
        for (Map.Entry entry2 : map.entrySet()) {
            if (this.f2892c.containsKey(entry2.getKey())) {
                final y yVar = (y) this.f2892c.get(entry2.getKey());
                for (final InterfaceC2102b interfaceC2102b2 : (Set) entry2.getValue()) {
                    arrayList.add(new Runnable() { // from class: I5.n
                        @Override // java.lang.Runnable
                        public final void run() {
                            yVar.a(interfaceC2102b2);
                        }
                    });
                }
            } else {
                this.f2892c.put((F) entry2.getKey(), y.b((Collection) entry2.getValue()));
            }
        }
        return arrayList;
    }
}
