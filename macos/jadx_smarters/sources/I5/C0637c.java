package I5;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: I5.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0637c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f2864a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Set f2866c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f2867d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f2868e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h f2869f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Set f2870g;

    /* JADX INFO: renamed from: I5.c$b */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f2871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Set f2872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Set f2873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f2874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f2875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public h f2876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Set f2877g;

        public b(F f9, F... fArr) {
            this.f2871a = null;
            HashSet hashSet = new HashSet();
            this.f2872b = hashSet;
            this.f2873c = new HashSet();
            this.f2874d = 0;
            this.f2875e = 0;
            this.f2877g = new HashSet();
            E.c(f9, "Null interface");
            hashSet.add(f9);
            for (F f10 : fArr) {
                E.c(f10, "Null interface");
            }
            Collections.addAll(this.f2872b, fArr);
        }

        public b(Class cls, Class... clsArr) {
            this.f2871a = null;
            HashSet hashSet = new HashSet();
            this.f2872b = hashSet;
            this.f2873c = new HashSet();
            this.f2874d = 0;
            this.f2875e = 0;
            this.f2877g = new HashSet();
            E.c(cls, "Null interface");
            hashSet.add(F.b(cls));
            for (Class cls2 : clsArr) {
                E.c(cls2, "Null interface");
                this.f2872b.add(F.b(cls2));
            }
        }

        public b b(r rVar) {
            E.c(rVar, "Null dependency");
            j(rVar.c());
            this.f2873c.add(rVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C0637c d() {
            E.d(this.f2876f != null, "Missing required property: factory.");
            return new C0637c(this.f2871a, new HashSet(this.f2872b), new HashSet(this.f2873c), this.f2874d, this.f2875e, this.f2876f, this.f2877g);
        }

        public b e() {
            return i(2);
        }

        public b f(h hVar) {
            this.f2876f = (h) E.c(hVar, "Null factory");
            return this;
        }

        public final b g() {
            this.f2875e = 1;
            return this;
        }

        public b h(String str) {
            this.f2871a = str;
            return this;
        }

        public final b i(int i9) {
            E.d(this.f2874d == 0, "Instantiation type has already been set.");
            this.f2874d = i9;
            return this;
        }

        public final void j(F f9) {
            E.a(!this.f2872b.contains(f9), "Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public C0637c(String str, Set set, Set set2, int i9, int i10, h hVar, Set set3) {
        this.f2864a = str;
        this.f2865b = Collections.unmodifiableSet(set);
        this.f2866c = Collections.unmodifiableSet(set2);
        this.f2867d = i9;
        this.f2868e = i10;
        this.f2869f = hVar;
        this.f2870g = Collections.unmodifiableSet(set3);
    }

    public static b c(F f9) {
        return new b(f9, new F[0]);
    }

    public static b d(F f9, F... fArr) {
        return new b(f9, fArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C0637c l(final Object obj, Class cls) {
        return m(cls).f(new h() { // from class: I5.a
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return C0637c.q(obj, interfaceC0639e);
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static /* synthetic */ Object q(Object obj, InterfaceC0639e interfaceC0639e) {
        return obj;
    }

    public static /* synthetic */ Object r(Object obj, InterfaceC0639e interfaceC0639e) {
        return obj;
    }

    public static C0637c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new h() { // from class: I5.b
            @Override // I5.h
            public final Object a(InterfaceC0639e interfaceC0639e) {
                return C0637c.r(obj, interfaceC0639e);
            }
        }).d();
    }

    public Set g() {
        return this.f2866c;
    }

    public h h() {
        return this.f2869f;
    }

    public String i() {
        return this.f2864a;
    }

    public Set j() {
        return this.f2865b;
    }

    public Set k() {
        return this.f2870g;
    }

    public boolean n() {
        return this.f2867d == 1;
    }

    public boolean o() {
        return this.f2867d == 2;
    }

    public boolean p() {
        return this.f2868e == 0;
    }

    public C0637c t(h hVar) {
        return new C0637c(this.f2864a, this.f2865b, this.f2866c, this.f2867d, this.f2868e, hVar, this.f2870g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f2865b.toArray()) + ">{" + this.f2867d + ", type=" + this.f2868e + ", deps=" + Arrays.toString(this.f2866c.toArray()) + "}";
    }
}
