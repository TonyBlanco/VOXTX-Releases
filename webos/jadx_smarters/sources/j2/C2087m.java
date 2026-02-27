package j2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import m2.InterfaceC2221b;
import q2.AbstractC2539h;

/* JADX INFO: renamed from: j2.m, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2087m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f42902a = Collections.newSetFromMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f42903b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f42904c;

    public void a() {
        Iterator it = AbstractC2539h.g(this.f42902a).iterator();
        while (it.hasNext()) {
            ((InterfaceC2221b) it.next()).clear();
        }
        this.f42903b.clear();
    }

    public void b() {
        this.f42904c = true;
        for (InterfaceC2221b interfaceC2221b : AbstractC2539h.g(this.f42902a)) {
            if (interfaceC2221b.isRunning()) {
                interfaceC2221b.pause();
                this.f42903b.add(interfaceC2221b);
            }
        }
    }

    public void c(InterfaceC2221b interfaceC2221b) {
        this.f42902a.remove(interfaceC2221b);
        this.f42903b.remove(interfaceC2221b);
    }

    public void d() {
        for (InterfaceC2221b interfaceC2221b : AbstractC2539h.g(this.f42902a)) {
            if (!interfaceC2221b.isComplete() && !interfaceC2221b.isCancelled()) {
                interfaceC2221b.pause();
                if (this.f42904c) {
                    this.f42903b.add(interfaceC2221b);
                } else {
                    interfaceC2221b.g();
                }
            }
        }
    }

    public void e() {
        this.f42904c = false;
        for (InterfaceC2221b interfaceC2221b : AbstractC2539h.g(this.f42902a)) {
            if (!interfaceC2221b.isComplete() && !interfaceC2221b.isCancelled() && !interfaceC2221b.isRunning()) {
                interfaceC2221b.g();
            }
        }
        this.f42903b.clear();
    }

    public void f(InterfaceC2221b interfaceC2221b) {
        this.f42902a.add(interfaceC2221b);
        if (this.f42904c) {
            this.f42903b.add(interfaceC2221b);
        } else {
            interfaceC2221b.g();
        }
    }
}
