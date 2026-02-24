package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
final class ayy {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final awy f20956a = awy.c().d(new ayu()).a();

    public static ayv a() {
        return ayw.f20952a;
    }

    public static Object b(Future future, Class cls) throws Exception {
        ayx.f20955a.a(cls);
        try {
            return future.get();
        } catch (InterruptedException e9) {
            Thread.currentThread().interrupt();
            throw d(cls, e9);
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause instanceof Error) {
                throw new ayo((Error) cause);
            }
            if (cause instanceof RuntimeException) {
                throw new azl(cause);
            }
            throw d(cls, cause);
        }
    }

    public static void c(Class cls) {
        atp.g(!RuntimeException.class.isAssignableFrom(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        atp.g(f(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    private static Exception d(Class cls, Throwable th) {
        Iterator it = f20956a.e(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            Exception exc = (Exception) e((Constructor) it.next(), th);
            if (exc != null) {
                if (exc.getCause() == null) {
                    exc.initCause(th);
                }
                return exc;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th);
    }

    private static Object e(Constructor constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i9 = 0; i9 < parameterTypes.length; i9++) {
            Class<?> cls = parameterTypes[i9];
            if (cls.equals(String.class)) {
                objArr[i9] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i9] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    private static boolean f(Class cls) {
        try {
            d(cls, new Exception());
            return true;
        } catch (Error | RuntimeException unused) {
            return false;
        }
    }
}
