package I5;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.util.Log;
import com.google.firebase.components.ComponentRegistrar;
import j6.InterfaceC2102b;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: I5.g, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0641g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f2879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f2880b;

    /* JADX INFO: renamed from: I5.g$b */
    public static class b implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class f2881a;

        public b(Class cls) {
            this.f2881a = cls;
        }

        public final Bundle b(Context context) {
            try {
                PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    Log.w("ComponentDiscovery", "Context has no PackageManager.");
                    return null;
                }
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) this.f2881a), 128);
                if (serviceInfo != null) {
                    return serviceInfo.metaData;
                }
                Log.w("ComponentDiscovery", this.f2881a + " has no service info.");
                return null;
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w("ComponentDiscovery", "Application info not found.");
                return null;
            }
        }

        @Override // I5.C0641g.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public List a(Context context) {
            Bundle bundleB = b(context);
            if (bundleB == null) {
                Log.w("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
                return Collections.emptyList();
            }
            ArrayList arrayList = new ArrayList();
            for (String str : bundleB.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundleB.get(str)) && str.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }
    }

    /* JADX INFO: renamed from: I5.g$c */
    public interface c {
        List a(Object obj);
    }

    public C0641g(Object obj, c cVar) {
        this.f2879a = obj;
        this.f2880b = cVar;
    }

    public static C0641g c(Context context, Class cls) {
        return new C0641g(context, new b(cls));
    }

    public static ComponentRegistrar d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                return (ComponentRegistrar) cls.getDeclaredConstructor(null).newInstance(null);
            }
            throw new w(String.format("Class %s is not an instance of %s", str, "com.google.firebase.components.ComponentRegistrar"));
        } catch (ClassNotFoundException unused) {
            Log.w("ComponentDiscovery", String.format("Class %s is not an found.", str));
            return null;
        } catch (IllegalAccessException e9) {
            throw new w(String.format("Could not instantiate %s.", str), e9);
        } catch (InstantiationException e10) {
            throw new w(String.format("Could not instantiate %s.", str), e10);
        } catch (NoSuchMethodException e11) {
            throw new w(String.format("Could not instantiate %s", str), e11);
        } catch (InvocationTargetException e12) {
            throw new w(String.format("Could not instantiate %s", str), e12);
        }
    }

    public List b() {
        ArrayList arrayList = new ArrayList();
        for (final String str : this.f2880b.a(this.f2879a)) {
            arrayList.add(new InterfaceC2102b() { // from class: I5.f
                @Override // j6.InterfaceC2102b
                public final Object get() {
                    return C0641g.d(str);
                }
            });
        }
        return arrayList;
    }
}
