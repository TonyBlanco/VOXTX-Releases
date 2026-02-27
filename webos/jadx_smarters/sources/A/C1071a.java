package a;

import android.content.Context;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: a.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1071a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f11429a = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile Context f11430b;

    public void a(InterfaceC1072b interfaceC1072b) {
        if (this.f11430b != null) {
            interfaceC1072b.a(this.f11430b);
        }
        this.f11429a.add(interfaceC1072b);
    }

    public void b() {
        this.f11430b = null;
    }

    public void c(Context context) {
        this.f11430b = context;
        Iterator it = this.f11429a.iterator();
        while (it.hasNext()) {
            ((InterfaceC1072b) it.next()).a(context);
        }
    }

    public Context d() {
        return this.f11430b;
    }

    public void e(InterfaceC1072b interfaceC1072b) {
        this.f11429a.remove(interfaceC1072b);
    }
}
