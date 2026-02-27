package l2;

import java.util.HashMap;
import java.util.Map;
import q2.C2538g;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2538g f43880b = new C2538g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f43881a = new HashMap();

    public InterfaceC2175b a(Class cls, Class cls2) {
        InterfaceC2175b interfaceC2175b;
        C2538g c2538g = f43880b;
        synchronized (c2538g) {
            c2538g.a(cls, cls2);
            interfaceC2175b = (InterfaceC2175b) this.f43881a.get(c2538g);
        }
        return interfaceC2175b == null ? d.a() : interfaceC2175b;
    }

    public void b(Class cls, Class cls2, InterfaceC2175b interfaceC2175b) {
        this.f43881a.put(new C2538g(cls, cls2), interfaceC2175b);
    }
}
