package androidx.lifecycle;

import androidx.lifecycle.AbstractC1180j;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.lifecycle.b, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1172b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static C1172b f15925c = new C1172b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f15926a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f15927b = new HashMap();

    /* JADX INFO: renamed from: androidx.lifecycle.b$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map f15928a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Map f15929b;

        public a(Map map) {
            this.f15929b = map;
            for (Map.Entry entry : map.entrySet()) {
                AbstractC1180j.b bVar = (AbstractC1180j.b) entry.getValue();
                List arrayList = (List) this.f15928a.get(bVar);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f15928a.put(bVar, arrayList);
                }
                arrayList.add((C0182b) entry.getKey());
            }
        }

        public static void b(List list, InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar, Object obj) {
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    ((C0182b) list.get(size)).a(interfaceC1186p, bVar, obj);
                }
            }
        }

        public void a(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar, Object obj) {
            b((List) this.f15928a.get(bVar), interfaceC1186p, bVar, obj);
            b((List) this.f15928a.get(AbstractC1180j.b.ON_ANY), interfaceC1186p, bVar, obj);
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.b$b, reason: collision with other inner class name */
    public static final class C0182b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f15930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f15931b;

        public C0182b(int i9, Method method) {
            this.f15930a = i9;
            this.f15931b = method;
            method.setAccessible(true);
        }

        public void a(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar, Object obj) {
            try {
                int i9 = this.f15930a;
                if (i9 == 0) {
                    this.f15931b.invoke(obj, null);
                } else if (i9 == 1) {
                    this.f15931b.invoke(obj, interfaceC1186p);
                } else {
                    if (i9 != 2) {
                        return;
                    }
                    this.f15931b.invoke(obj, interfaceC1186p, bVar);
                }
            } catch (IllegalAccessException e9) {
                throw new RuntimeException(e9);
            } catch (InvocationTargetException e10) {
                throw new RuntimeException("Failed to call observer method", e10.getCause());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0182b)) {
                return false;
            }
            C0182b c0182b = (C0182b) obj;
            return this.f15930a == c0182b.f15930a && this.f15931b.getName().equals(c0182b.f15931b.getName());
        }

        public int hashCode() {
            return (this.f15930a * 31) + this.f15931b.getName().hashCode();
        }
    }

    public final a a(Class cls, Method[] methodArr) {
        int i9;
        a aVarC;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        if (superclass != null && (aVarC = c(superclass)) != null) {
            map.putAll(aVarC.f15929b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            for (Map.Entry entry : c(cls2).f15929b.entrySet()) {
                e(map, (C0182b) entry.getKey(), (AbstractC1180j.b) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            methodArr = b(cls);
        }
        boolean z9 = false;
        for (Method method : methodArr) {
            w wVar = (w) method.getAnnotation(w.class);
            if (wVar != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i9 = 0;
                } else {
                    if (!parameterTypes[0].isAssignableFrom(InterfaceC1186p.class)) {
                        throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
                    }
                    i9 = 1;
                }
                AbstractC1180j.b bVarValue = wVar.value();
                if (parameterTypes.length > 1) {
                    if (!parameterTypes[1].isAssignableFrom(AbstractC1180j.b.class)) {
                        throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
                    }
                    if (bVarValue != AbstractC1180j.b.ON_ANY) {
                        throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
                    }
                    i9 = 2;
                }
                if (parameterTypes.length > 2) {
                    throw new IllegalArgumentException("cannot have more than 2 params");
                }
                e(map, new C0182b(i9, method), bVarValue, cls);
                z9 = true;
            }
        }
        a aVar = new a(map);
        this.f15926a.put(cls, aVar);
        this.f15927b.put(cls, Boolean.valueOf(z9));
        return aVar;
    }

    public final Method[] b(Class cls) {
        try {
            return cls.getDeclaredMethods();
        } catch (NoClassDefFoundError e9) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e9);
        }
    }

    public a c(Class cls) {
        a aVar = (a) this.f15926a.get(cls);
        return aVar != null ? aVar : a(cls, null);
    }

    public boolean d(Class cls) {
        Boolean bool = (Boolean) this.f15927b.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        Method[] methodArrB = b(cls);
        for (Method method : methodArrB) {
            if (((w) method.getAnnotation(w.class)) != null) {
                a(cls, methodArrB);
                return true;
            }
        }
        this.f15927b.put(cls, Boolean.FALSE);
        return false;
    }

    public final void e(Map map, C0182b c0182b, AbstractC1180j.b bVar, Class cls) {
        AbstractC1180j.b bVar2 = (AbstractC1180j.b) map.get(c0182b);
        if (bVar2 == null || bVar == bVar2) {
            if (bVar2 == null) {
                map.put(c0182b, bVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Method " + c0182b.f15931b.getName() + " in " + cls.getName() + " already declared with different @OnLifecycleEvent value: previous value " + bVar2 + ", new value " + bVar);
    }
}
