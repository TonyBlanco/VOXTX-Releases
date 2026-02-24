package o8;

import java.io.Serializable;
import kotlin.jvm.internal.l;
import kotlin.jvm.internal.m;
import o8.g;
import w8.p;

/* JADX INFO: renamed from: o8.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2371c implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f46138a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g.b f46139c;

    /* JADX INFO: renamed from: o8.c$a */
    public static final class a extends m implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f46140a = new a();

        public a() {
            super(2);
        }

        @Override // w8.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke(String acc, g.b element) {
            l.e(acc, "acc");
            l.e(element, "element");
            if (acc.length() == 0) {
                return element.toString();
            }
            return acc + ", " + element;
        }
    }

    public C2371c(g left, g.b element) {
        l.e(left, "left");
        l.e(element, "element");
        this.f46138a = left;
        this.f46139c = element;
    }

    private final int t() {
        int i9 = 2;
        C2371c c2371c = this;
        while (true) {
            g gVar = c2371c.f46138a;
            c2371c = gVar instanceof C2371c ? (C2371c) gVar : null;
            if (c2371c == null) {
                return i9;
            }
            i9++;
        }
    }

    @Override // o8.g
    public g V(g gVar) {
        return g.a.a(this, gVar);
    }

    @Override // o8.g
    public g.b a(g.c key) {
        l.e(key, "key");
        C2371c c2371c = this;
        while (true) {
            g.b bVarA = c2371c.f46139c.a(key);
            if (bVarA != null) {
                return bVarA;
            }
            g gVar = c2371c.f46138a;
            if (!(gVar instanceof C2371c)) {
                return gVar.a(key);
            }
            c2371c = (C2371c) gVar;
        }
    }

    public final boolean b(g.b bVar) {
        return l.a(a(bVar.getKey()), bVar);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C2371c) {
                C2371c c2371c = (C2371c) obj;
                if (c2371c.t() != t() || !c2371c.f(this)) {
                }
            }
            return false;
        }
        return true;
    }

    public final boolean f(C2371c c2371c) {
        while (b(c2371c.f46139c)) {
            g gVar = c2371c.f46138a;
            if (!(gVar instanceof C2371c)) {
                l.c(gVar, "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element");
                return b((g.b) gVar);
            }
            c2371c = (C2371c) gVar;
        }
        return false;
    }

    public int hashCode() {
        return this.f46138a.hashCode() + this.f46139c.hashCode();
    }

    @Override // o8.g
    public Object l(Object obj, p operation) {
        l.e(operation, "operation");
        return operation.invoke(this.f46138a.l(obj, operation), this.f46139c);
    }

    public String toString() {
        return '[' + ((String) l("", a.f46140a)) + ']';
    }

    @Override // o8.g
    public g w(g.c key) {
        l.e(key, "key");
        if (this.f46139c.a(key) != null) {
            return this.f46138a;
        }
        g gVarW = this.f46138a.w(key);
        return gVarW == this.f46138a ? this : gVarW == h.f46144a ? this.f46139c : new C2371c(gVarW, this.f46139c);
    }
}
