package C2;

import C2.o;
import z2.AbstractC3015c;
import z2.C3014b;
import z2.InterfaceC3017e;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f982a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AbstractC3015c f984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3017e f985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3014b f986e;

    public static final class b extends o.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p f987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f988b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC3015c f989c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public InterfaceC3017e f990d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public C3014b f991e;

        @Override // C2.o.a
        public o a() {
            String str = "";
            if (this.f987a == null) {
                str = " transportContext";
            }
            if (this.f988b == null) {
                str = str + " transportName";
            }
            if (this.f989c == null) {
                str = str + " event";
            }
            if (this.f990d == null) {
                str = str + " transformer";
            }
            if (this.f991e == null) {
                str = str + " encoding";
            }
            if (str.isEmpty()) {
                return new c(this.f987a, this.f988b, this.f989c, this.f990d, this.f991e);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // C2.o.a
        public o.a b(C3014b c3014b) {
            if (c3014b == null) {
                throw new NullPointerException("Null encoding");
            }
            this.f991e = c3014b;
            return this;
        }

        @Override // C2.o.a
        public o.a c(AbstractC3015c abstractC3015c) {
            if (abstractC3015c == null) {
                throw new NullPointerException("Null event");
            }
            this.f989c = abstractC3015c;
            return this;
        }

        @Override // C2.o.a
        public o.a d(InterfaceC3017e interfaceC3017e) {
            if (interfaceC3017e == null) {
                throw new NullPointerException("Null transformer");
            }
            this.f990d = interfaceC3017e;
            return this;
        }

        @Override // C2.o.a
        public o.a e(p pVar) {
            if (pVar == null) {
                throw new NullPointerException("Null transportContext");
            }
            this.f987a = pVar;
            return this;
        }

        @Override // C2.o.a
        public o.a f(String str) {
            if (str == null) {
                throw new NullPointerException("Null transportName");
            }
            this.f988b = str;
            return this;
        }
    }

    public c(p pVar, String str, AbstractC3015c abstractC3015c, InterfaceC3017e interfaceC3017e, C3014b c3014b) {
        this.f982a = pVar;
        this.f983b = str;
        this.f984c = abstractC3015c;
        this.f985d = interfaceC3017e;
        this.f986e = c3014b;
    }

    @Override // C2.o
    public C3014b b() {
        return this.f986e;
    }

    @Override // C2.o
    public AbstractC3015c c() {
        return this.f984c;
    }

    @Override // C2.o
    public InterfaceC3017e e() {
        return this.f985d;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f982a.equals(oVar.f()) && this.f983b.equals(oVar.g()) && this.f984c.equals(oVar.c()) && this.f985d.equals(oVar.e()) && this.f986e.equals(oVar.b());
    }

    @Override // C2.o
    public p f() {
        return this.f982a;
    }

    @Override // C2.o
    public String g() {
        return this.f983b;
    }

    public int hashCode() {
        return ((((((((this.f982a.hashCode() ^ 1000003) * 1000003) ^ this.f983b.hashCode()) * 1000003) ^ this.f984c.hashCode()) * 1000003) ^ this.f985d.hashCode()) * 1000003) ^ this.f986e.hashCode();
    }

    public String toString() {
        return "SendRequest{transportContext=" + this.f982a + ", transportName=" + this.f983b + ", event=" + this.f984c + ", transformer=" + this.f985d + ", encoding=" + this.f986e + "}";
    }
}
