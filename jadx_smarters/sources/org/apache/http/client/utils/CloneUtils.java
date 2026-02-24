package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes4.dex */
public class CloneUtils {
    private CloneUtils() {
    }

    public static Object clone(Object obj) throws CloneNotSupportedException {
        return cloneObject(obj);
    }

    public static <T> T cloneObject(T t9) throws CloneNotSupportedException {
        if (t9 == null) {
            return null;
        }
        if (!(t9 instanceof Cloneable)) {
            throw new CloneNotSupportedException();
        }
        try {
            try {
                return (T) t9.getClass().getMethod("clone", null).invoke(t9, null);
            } catch (IllegalAccessException e9) {
                throw new IllegalAccessError(e9.getMessage());
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (cause instanceof CloneNotSupportedException) {
                    throw ((CloneNotSupportedException) cause);
                }
                throw new Error("Unexpected exception", cause);
            }
        } catch (NoSuchMethodException e11) {
            throw new NoSuchMethodError(e11.getMessage());
        }
    }
}
