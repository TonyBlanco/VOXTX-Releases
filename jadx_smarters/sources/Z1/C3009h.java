package z1;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import x1.InterfaceC2951b;
import y1.C2982a;

/* JADX INFO: renamed from: z1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3009h extends AbstractC3007f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.nytimes.android.external.cache.d f52634b = com.nytimes.android.external.cache.e.q().a();

    /* JADX INFO: renamed from: z1.h$a */
    public class a implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f52635a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2982a f52636b;

        public a(String str, C2982a c2982a) {
            this.f52635a = str;
            this.f52636b = c2982a;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public x1.d apply(AbstractC3007f abstractC3007f) {
            return x1.d.d(abstractC3007f.c(this.f52635a, this.f52636b));
        }
    }

    /* JADX INFO: renamed from: z1.h$b */
    public class b implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ f f52638a;

        public b(f fVar) {
            this.f52638a = fVar;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3010i apply(C3010i c3010i) {
            C3010i c3010iClone = c3010i.clone();
            c3010iClone.h(this.f52638a.f52646a);
            return c3010iClone;
        }
    }

    /* JADX INFO: renamed from: z1.h$c */
    public class c implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3010i f52640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2982a f52641b;

        public c(C3010i c3010i, C2982a c2982a) {
            this.f52640a = c3010i;
            this.f52641b = c2982a;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Set apply(AbstractC3007f abstractC3007f) {
            return abstractC3007f.f(this.f52640a, this.f52641b);
        }
    }

    /* JADX INFO: renamed from: z1.h$d */
    public class d implements InterfaceC2951b {
        public d() {
        }

        @Override // x1.InterfaceC2951b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void apply(AbstractC3007f abstractC3007f) {
            abstractC3007f.b();
        }
    }

    /* JADX INFO: renamed from: z1.h$e */
    public class e implements x1.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3003b f52644a;

        public e(C3003b c3003b) {
            this.f52644a = c3003b;
        }

        @Override // x1.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean apply(AbstractC3007f abstractC3007f) {
            return Boolean.valueOf(abstractC3007f.h(this.f52644a));
        }
    }

    /* JADX INFO: renamed from: z1.h$f */
    public final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public C3010i f52646a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final LinkedList f52647b;

        public f(C3010i c3010i) {
            LinkedList linkedList = new LinkedList();
            this.f52647b = linkedList;
            this.f52646a = c3010i.clone();
            linkedList.add(c3010i.clone());
        }

        public Set a(C3010i c3010i) {
            this.f52647b.addLast(c3010i.clone());
            return this.f52646a.h(c3010i);
        }
    }

    @Override // z1.AbstractC3007f
    public void b() {
        this.f52634b.c();
        g().b(new d());
    }

    @Override // z1.AbstractC3007f
    public C3010i c(String str, C2982a c2982a) {
        x1.g.c(str, "key == null");
        x1.g.c(c2982a, "cacheHeaders == null");
        try {
            x1.d dVarC = g().c(new a(str, c2982a));
            f fVar = (f) this.f52634b.b(str);
            return fVar != null ? (C3010i) dVarC.g(new b(fVar)).i(fVar.f52646a.clone()) : (C3010i) dVarC.k();
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // z1.AbstractC3007f
    public Set f(C3010i c3010i, C2982a c2982a) {
        x1.g.c(c3010i, "record == null");
        x1.g.c(c2982a, "cacheHeaders == null");
        return (Set) g().g(new c(c3010i, c2982a)).i(Collections.emptySet());
    }

    @Override // z1.AbstractC3007f
    public boolean h(C3003b c3003b) {
        x1.g.c(c3003b, "cacheKey == null");
        boolean zBooleanValue = ((Boolean) g().g(new e(c3003b)).i(Boolean.FALSE)).booleanValue();
        if (this.f52634b.b(c3003b.b()) == null) {
            return zBooleanValue;
        }
        this.f52634b.a(c3003b.b());
        return true;
    }

    public Set i(C3010i c3010i) {
        x1.g.c(c3010i, "record == null");
        f fVar = (f) this.f52634b.b(c3010i.g());
        if (fVar != null) {
            return fVar.a(c3010i);
        }
        this.f52634b.put(c3010i.g(), new f(c3010i));
        return Collections.singleton(c3010i.g());
    }

    public Set j(Collection collection) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(i((C3010i) it.next()));
        }
        return linkedHashSet;
    }
}
