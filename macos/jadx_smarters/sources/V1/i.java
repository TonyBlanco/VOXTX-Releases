package v1;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2868f f51259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f51260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f51261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Set f51262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f51263e;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC2868f f51264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f51265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public List f51266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Set f51267d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f51268e;

        public a(InterfaceC2868f interfaceC2868f) {
            this.f51264a = (InterfaceC2868f) x1.g.c(interfaceC2868f, "operation == null");
        }

        public i f() {
            return new i(this);
        }

        public a g(Object obj) {
            this.f51265b = obj;
            return this;
        }

        public a h(Set set) {
            this.f51267d = set;
            return this;
        }

        public a i(List list) {
            this.f51266c = list;
            return this;
        }

        public a j(boolean z9) {
            this.f51268e = z9;
            return this;
        }
    }

    public i(a aVar) {
        this.f51259a = (InterfaceC2868f) x1.g.c(aVar.f51264a, "operation == null");
        this.f51260b = aVar.f51265b;
        this.f51261c = aVar.f51266c != null ? Collections.unmodifiableList(aVar.f51266c) : Collections.emptyList();
        this.f51262d = aVar.f51267d != null ? Collections.unmodifiableSet(aVar.f51267d) : Collections.emptySet();
        this.f51263e = aVar.f51268e;
    }

    public static a a(InterfaceC2868f interfaceC2868f) {
        return new a(interfaceC2868f);
    }

    public Object b() {
        return this.f51260b;
    }

    public Set c() {
        return this.f51262d;
    }

    public List d() {
        return this.f51261c;
    }

    public boolean e() {
        return !this.f51261c.isEmpty();
    }

    public a f() {
        return new a(this.f51259a).g(this.f51260b).i(this.f51261c).h(this.f51262d).j(this.f51263e);
    }
}
