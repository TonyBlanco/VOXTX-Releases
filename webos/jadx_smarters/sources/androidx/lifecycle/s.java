package androidx.lifecycle;

import com.amazonaws.services.s3.model.InstructionFileId;
import d.AbstractC1617D;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Map f15947a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Map f15948b = new HashMap();

    public static InterfaceC1177g a(Constructor constructor, Object obj) {
        try {
            AbstractC1617D.a(constructor.newInstance(obj));
            return null;
        } catch (IllegalAccessException e9) {
            throw new RuntimeException(e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException(e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(e11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Constructor b(Class cls) {
        try {
            Package r12 = cls.getPackage();
            String canonicalName = cls.getCanonicalName();
            String name = r12 != null ? r12.getName() : "";
            if (!name.isEmpty()) {
                canonicalName = canonicalName.substring(name.length() + 1);
            }
            String strC = c(canonicalName);
            if (!name.isEmpty()) {
                strC = name + InstructionFileId.DOT + strC;
            }
            Constructor declaredConstructor = Class.forName(strC).getDeclaredConstructor(cls);
            if (!declaredConstructor.isAccessible()) {
                declaredConstructor.setAccessible(true);
            }
            return declaredConstructor;
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (NoSuchMethodException e9) {
            throw new RuntimeException(e9);
        }
    }

    public static String c(String str) {
        return str.replace(InstructionFileId.DOT, "_") + "_LifecycleAdapter";
    }

    public static int d(Class cls) {
        Integer num = (Integer) f15947a.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int iG = g(cls);
        f15947a.put(cls, Integer.valueOf(iG));
        return iG;
    }

    public static boolean e(Class cls) {
        return cls != null && InterfaceC1185o.class.isAssignableFrom(cls);
    }

    public static InterfaceC1184n f(Object obj) {
        boolean z9 = obj instanceof InterfaceC1184n;
        boolean z10 = obj instanceof InterfaceC1176f;
        if (z9 && z10) {
            return new FullLifecycleObserverAdapter((InterfaceC1176f) obj, (InterfaceC1184n) obj);
        }
        if (z10) {
            return new FullLifecycleObserverAdapter((InterfaceC1176f) obj, null);
        }
        if (z9) {
            return (InterfaceC1184n) obj;
        }
        Class<?> cls = obj.getClass();
        if (d(cls) != 2) {
            return new ReflectiveGenericLifecycleObserver(obj);
        }
        List list = (List) f15948b.get(cls);
        if (list.size() == 1) {
            a((Constructor) list.get(0), obj);
            return new SingleGeneratedAdapterObserver(null);
        }
        InterfaceC1177g[] interfaceC1177gArr = new InterfaceC1177g[list.size()];
        for (int i9 = 0; i9 < list.size(); i9++) {
            a((Constructor) list.get(i9), obj);
            interfaceC1177gArr[i9] = null;
        }
        return new CompositeGeneratedAdaptersObserver(interfaceC1177gArr);
    }

    public static int g(Class cls) {
        ArrayList arrayList;
        if (cls.getCanonicalName() == null) {
            return 1;
        }
        Constructor constructorB = b(cls);
        if (constructorB != null) {
            f15948b.put(cls, Collections.singletonList(constructorB));
            return 2;
        }
        if (C1172b.f15925c.d(cls)) {
            return 1;
        }
        Class superclass = cls.getSuperclass();
        if (!e(superclass)) {
            arrayList = null;
        } else {
            if (d(superclass) == 1) {
                return 1;
            }
            arrayList = new ArrayList((Collection) f15948b.get(superclass));
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            if (e(cls2)) {
                if (d(cls2) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.addAll((Collection) f15948b.get(cls2));
            }
        }
        if (arrayList == null) {
            return 1;
        }
        f15948b.put(cls, arrayList);
        return 2;
    }
}
