package j$.util;

import j$.util.Collection;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.function.Predicate;

/* JADX INFO: loaded from: classes2.dex */
public class DesugarCollections {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class f42209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Field f42210b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Field f42211c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Constructor f42212d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Constructor f42213e;

    static {
        Field declaredField;
        Field declaredField2;
        Constructor<?> declaredConstructor;
        Class<?> cls = Collections.synchronizedCollection(new ArrayList()).getClass();
        f42209a = cls;
        Collections.synchronizedList(new LinkedList()).getClass();
        Constructor<?> declaredConstructor2 = null;
        try {
            declaredField = cls.getDeclaredField("mutex");
        } catch (NoSuchFieldException unused) {
            declaredField = null;
        }
        f42210b = declaredField;
        if (declaredField != null) {
            declaredField.setAccessible(true);
        }
        try {
            declaredField2 = cls.getDeclaredField("c");
        } catch (NoSuchFieldException unused2) {
            declaredField2 = null;
        }
        f42211c = declaredField2;
        if (declaredField2 != null) {
            declaredField2.setAccessible(true);
        }
        try {
            declaredConstructor = Collections.synchronizedSet(new HashSet()).getClass().getDeclaredConstructor(java.util.Set.class, Object.class);
        } catch (NoSuchMethodException unused3) {
            declaredConstructor = null;
        }
        f42213e = declaredConstructor;
        if (declaredConstructor != null) {
            declaredConstructor.setAccessible(true);
        }
        try {
            declaredConstructor2 = cls.getDeclaredConstructor(java.util.Collection.class, Object.class);
        } catch (NoSuchMethodException unused4) {
        }
        f42212d = declaredConstructor2;
        if (declaredConstructor2 != null) {
            declaredConstructor2.setAccessible(true);
        }
    }

    static boolean c(java.util.Collection collection, Predicate predicate) {
        boolean zRemoveIf;
        Field field = f42210b;
        if (field == null) {
            try {
                java.util.Collection collection2 = (java.util.Collection) f42211c.get(collection);
                return collection2 instanceof Collection ? ((Collection) collection2).removeIf(predicate) : Collection.CC.$default$removeIf(collection2, predicate);
            } catch (IllegalAccessException e9) {
                throw new Error("Runtime illegal access in synchronized collection removeIf fall-back.", e9);
            }
        }
        try {
            synchronized (field.get(collection)) {
                java.util.Collection collection3 = (java.util.Collection) f42211c.get(collection);
                zRemoveIf = collection3 instanceof Collection ? ((Collection) collection3).removeIf(predicate) : Collection.CC.$default$removeIf(collection3, predicate);
            }
            return zRemoveIf;
        } catch (IllegalAccessException e10) {
            throw new Error("Runtime illegal access in synchronized collection removeIf.", e10);
        }
    }

    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V> map) {
        return new C1922f(map);
    }
}
