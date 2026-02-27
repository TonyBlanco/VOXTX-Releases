package I0;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.startup.InitializationProvider;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static volatile a f2752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final Object f2753e = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f2756c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f2755b = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f2754a = new HashMap();

    public a(Context context) {
        this.f2756c = context.getApplicationContext();
    }

    public static a e(Context context) {
        if (f2752d == null) {
            synchronized (f2753e) {
                try {
                    if (f2752d == null) {
                        f2752d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f2752d;
    }

    public void a() {
        try {
            try {
                J0.b.a("Startup");
                b(this.f2756c.getPackageManager().getProviderInfo(new ComponentName(this.f2756c.getPackageName(), InitializationProvider.class.getName()), 128).metaData);
            } catch (PackageManager.NameNotFoundException e9) {
                throw new d(e9);
            }
        } finally {
            J0.b.b();
        }
    }

    public void b(Bundle bundle) {
        String string = this.f2756c.getString(c.f2757a);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (b.class.isAssignableFrom(cls)) {
                            this.f2755b.add(cls);
                        }
                    }
                }
                Iterator it = this.f2755b.iterator();
                while (it.hasNext()) {
                    d((Class) it.next(), hashSet);
                }
            } catch (ClassNotFoundException e9) {
                throw new d(e9);
            }
        }
    }

    public Object c(Class cls) {
        Object objD;
        synchronized (f2753e) {
            try {
                objD = this.f2754a.get(cls);
                if (objD == null) {
                    objD = d(cls, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return objD;
    }

    public final Object d(Class cls, Set set) {
        Object objB;
        if (J0.b.d()) {
            try {
                J0.b.a(cls.getSimpleName());
            } catch (Throwable th) {
                J0.b.b();
                throw th;
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f2754a.containsKey(cls)) {
            objB = this.f2754a.get(cls);
        } else {
            set.add(cls);
            try {
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> listA = bVar.a();
                if (!listA.isEmpty()) {
                    for (Class cls2 : listA) {
                        if (!this.f2754a.containsKey(cls2)) {
                            d(cls2, set);
                        }
                    }
                }
                objB = bVar.b(this.f2756c);
                set.remove(cls);
                this.f2754a.put(cls, objB);
            } catch (Throwable th2) {
                throw new d(th2);
            }
        }
        J0.b.b();
        return objB;
    }

    public Object f(Class cls) {
        return c(cls);
    }

    public boolean g(Class cls) {
        return this.f2755b.contains(cls);
    }
}
