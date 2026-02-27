package androidx.fragment.app;

import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final s.i f15030a = new s.i();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return Fragment.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        s.i iVar = f15030a;
        s.i iVar2 = (s.i) iVar.get(classLoader);
        if (iVar2 == null) {
            iVar2 = new s.i();
            iVar.put(classLoader, iVar2);
        }
        Class cls = (Class) iVar2.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        iVar2.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e9) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e9);
        } catch (ClassNotFoundException e10) {
            throw new Fragment.j("Unable to instantiate fragment " + str + ": make sure class name exists", e10);
        }
    }

    public abstract Fragment a(ClassLoader classLoader, String str);
}
