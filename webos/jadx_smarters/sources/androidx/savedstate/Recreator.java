package androidx.savedstate;

import F0.c;
import F0.e;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.g;
import kotlin.jvm.internal.l;

/* JADX INFO: loaded from: classes.dex */
public final class Recreator implements InterfaceC1184n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f17161c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f17162a;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(g gVar) {
            this();
        }
    }

    public static final class b implements c.InterfaceC0023c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f17163a;

        public b(c registry) {
            l.e(registry, "registry");
            this.f17163a = new LinkedHashSet();
            registry.h("androidx.savedstate.Restarter", this);
        }

        @Override // F0.c.InterfaceC0023c
        public Bundle a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f17163a));
            return bundle;
        }

        public final void b(String className) {
            l.e(className, "className");
            this.f17163a.add(className);
        }
    }

    public Recreator(e owner) {
        l.e(owner, "owner");
        this.f17162a = owner;
    }

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p source, AbstractC1180j.b event) {
        l.e(source, "source");
        l.e(event, "event");
        if (event != AbstractC1180j.b.ON_CREATE) {
            throw new AssertionError("Next event must be ON_CREATE");
        }
        source.getLifecycle().c(this);
        Bundle bundleB = this.f17162a.getSavedStateRegistry().b("androidx.savedstate.Restarter");
        if (bundleB == null) {
            return;
        }
        ArrayList<String> stringArrayList = bundleB.getStringArrayList("classes_to_restore");
        if (stringArrayList == null) {
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        Iterator<String> it = stringArrayList.iterator();
        while (it.hasNext()) {
            c(it.next());
        }
    }

    public final void c(String str) {
        try {
            Class<? extends U> clsAsSubclass = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(c.a.class);
            l.d(clsAsSubclass, "{\n                Class.…class.java)\n            }");
            try {
                Constructor declaredConstructor = clsAsSubclass.getDeclaredConstructor(null);
                declaredConstructor.setAccessible(true);
                try {
                    Object objNewInstance = declaredConstructor.newInstance(null);
                    l.d(objNewInstance, "{\n                constr…wInstance()\n            }");
                    ((c.a) objNewInstance).a(this.f17162a);
                } catch (Exception e9) {
                    throw new RuntimeException("Failed to instantiate " + str, e9);
                }
            } catch (NoSuchMethodException e10) {
                throw new IllegalStateException("Class " + clsAsSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        } catch (ClassNotFoundException e11) {
            throw new RuntimeException("Class " + str + " wasn't found", e11);
        }
    }
}
