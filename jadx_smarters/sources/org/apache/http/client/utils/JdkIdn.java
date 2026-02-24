package org.apache.http.client.utils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.apache.http.annotation.Contract;
import org.apache.http.annotation.ThreadingBehavior;

/* JADX INFO: loaded from: classes4.dex */
@Contract(threading = ThreadingBehavior.IMMUTABLE)
@Deprecated
public class JdkIdn implements Idn {
    private final Method toUnicode;

    public JdkIdn() throws ClassNotFoundException {
        try {
            this.toUnicode = Class.forName("java.net.IDN").getMethod("toUnicode", String.class);
        } catch (NoSuchMethodException e9) {
            throw new IllegalStateException(e9.getMessage(), e9);
        } catch (SecurityException e10) {
            throw new IllegalStateException(e10.getMessage(), e10);
        }
    }

    @Override // org.apache.http.client.utils.Idn
    public String toUnicode(String str) {
        try {
            return (String) this.toUnicode.invoke(null, str);
        } catch (IllegalAccessException e9) {
            throw new IllegalStateException(e9.getMessage(), e9);
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            throw new RuntimeException(cause.getMessage(), cause);
        }
    }
}
