package i2;

import java.util.HashMap;
import java.util.Map;
import q2.C2538g;

/* JADX INFO: renamed from: i2.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1882d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2538g f41831b = new C2538g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f41832a = new HashMap();

    public InterfaceC1881c a(Class cls, Class cls2) {
        InterfaceC1881c interfaceC1881c;
        if (cls.equals(cls2)) {
            return C1883e.b();
        }
        C2538g c2538g = f41831b;
        synchronized (c2538g) {
            c2538g.a(cls, cls2);
            interfaceC1881c = (InterfaceC1881c) this.f41832a.get(c2538g);
        }
        if (interfaceC1881c != null) {
            return interfaceC1881c;
        }
        throw new IllegalArgumentException("No transcoder registered for " + cls + " and " + cls2);
    }

    public void b(Class cls, Class cls2, InterfaceC1881c interfaceC1881c) {
        this.f41832a.put(new C2538g(cls, cls2), interfaceC1881c);
    }
}
