package j2;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.WeakHashMap;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: j2.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2075a implements InterfaceC2081g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f42882a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f42883b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42884c;

    @Override // j2.InterfaceC2081g
    public void a(InterfaceC2082h interfaceC2082h) {
        this.f42882a.add(interfaceC2082h);
        if (this.f42884c) {
            interfaceC2082h.onDestroy();
        } else if (this.f42883b) {
            interfaceC2082h.onStart();
        } else {
            interfaceC2082h.onStop();
        }
    }

    public void b() {
        this.f42884c = true;
        Iterator it = AbstractC2539h.g(this.f42882a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2082h) it.next()).onDestroy();
        }
    }

    public void c() {
        this.f42883b = true;
        Iterator it = AbstractC2539h.g(this.f42882a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2082h) it.next()).onStart();
        }
    }

    public void d() {
        this.f42883b = false;
        Iterator it = AbstractC2539h.g(this.f42882a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2082h) it.next()).onStop();
        }
    }
}
