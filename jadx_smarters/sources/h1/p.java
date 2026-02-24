package h1;

import h1.InterfaceC1847b;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f41576a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC1847b.a f41577b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f41578c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f41579d;

    public interface a {
        void a(u uVar);
    }

    public interface b {
        void a(Object obj);
    }

    public p(u uVar) {
        this.f41579d = false;
        this.f41576a = null;
        this.f41577b = null;
        this.f41578c = uVar;
    }

    public p(Object obj, InterfaceC1847b.a aVar) {
        this.f41579d = false;
        this.f41576a = obj;
        this.f41577b = aVar;
        this.f41578c = null;
    }

    public static p a(u uVar) {
        return new p(uVar);
    }

    public static p c(Object obj, InterfaceC1847b.a aVar) {
        return new p(obj, aVar);
    }

    public boolean b() {
        return this.f41578c == null;
    }
}
