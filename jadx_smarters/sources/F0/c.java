package F0;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import androidx.savedstate.Recreator;
import java.util.Map;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;
import m.C2214b;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f1799g = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f1801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Bundle f1802c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f1803d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Recreator.b f1804e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2214b f1800a = new C2214b();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f1805f = true;

    public interface a {
        void a(e eVar);
    }

    public static final class b {
        public b() {
        }

        public /* synthetic */ b(g gVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: F0.c$c, reason: collision with other inner class name */
    public interface InterfaceC0023c {
        Bundle a();
    }

    public static final void d(c this$0, InterfaceC1186p interfaceC1186p, AbstractC1180j.b event) {
        boolean z9;
        l.e(this$0, "this$0");
        l.e(interfaceC1186p, "<anonymous parameter 0>");
        l.e(event, "event");
        if (event == AbstractC1180j.b.ON_START) {
            z9 = true;
        } else if (event != AbstractC1180j.b.ON_STOP) {
            return;
        } else {
            z9 = false;
        }
        this$0.f1805f = z9;
    }

    public final Bundle b(String key) {
        l.e(key, "key");
        if (!this.f1803d) {
            throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
        }
        Bundle bundle = this.f1802c;
        if (bundle == null) {
            return null;
        }
        Bundle bundle2 = bundle != null ? bundle.getBundle(key) : null;
        Bundle bundle3 = this.f1802c;
        if (bundle3 != null) {
            bundle3.remove(key);
        }
        Bundle bundle4 = this.f1802c;
        if (bundle4 == null || bundle4.isEmpty()) {
            this.f1802c = null;
        }
        return bundle2;
    }

    public final InterfaceC0023c c(String key) {
        l.e(key, "key");
        for (Map.Entry components : this.f1800a) {
            l.d(components, "components");
            String str = (String) components.getKey();
            InterfaceC0023c interfaceC0023c = (InterfaceC0023c) components.getValue();
            if (l.a(str, key)) {
                return interfaceC0023c;
            }
        }
        return null;
    }

    public final void e(AbstractC1180j lifecycle) {
        l.e(lifecycle, "lifecycle");
        if (!(!this.f1801b)) {
            throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
        }
        lifecycle.a(new InterfaceC1184n() { // from class: F0.b
            @Override // androidx.lifecycle.InterfaceC1184n
            public final void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
                c.d(this.f1798a, interfaceC1186p, bVar);
            }
        });
        this.f1801b = true;
    }

    public final void f(Bundle bundle) {
        if (!this.f1801b) {
            throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
        }
        if (!(!this.f1803d)) {
            throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
        }
        this.f1802c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
        this.f1803d = true;
    }

    public final void g(Bundle outBundle) {
        l.e(outBundle, "outBundle");
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1802c;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        C2214b.d dVarF = this.f1800a.f();
        l.d(dVarF, "this.components.iteratorWithAdditions()");
        while (dVarF.hasNext()) {
            Map.Entry entry = (Map.Entry) dVarF.next();
            bundle.putBundle((String) entry.getKey(), ((InterfaceC0023c) entry.getValue()).a());
        }
        if (bundle.isEmpty()) {
            return;
        }
        outBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle);
    }

    public final void h(String key, InterfaceC0023c provider) {
        l.e(key, "key");
        l.e(provider, "provider");
        if (((InterfaceC0023c) this.f1800a.i(key, provider)) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
        }
    }

    public final void i(Class clazz) {
        l.e(clazz, "clazz");
        if (!this.f1805f) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
        }
        Recreator.b bVar = this.f1804e;
        if (bVar == null) {
            bVar = new Recreator.b(this);
        }
        this.f1804e = bVar;
        try {
            clazz.getDeclaredConstructor(null);
            Recreator.b bVar2 = this.f1804e;
            if (bVar2 != null) {
                String name = clazz.getName();
                l.d(name, "clazz.name");
                bVar2.b(name);
            }
        } catch (NoSuchMethodException e9) {
            throw new IllegalArgumentException("Class " + clazz.getSimpleName() + " must have default constructor in order to be automatically recreated", e9);
        }
    }
}
