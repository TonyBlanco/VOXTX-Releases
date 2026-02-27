package org.apache.commons.logging.impl;

import java.io.PrintStream;
import java.lang.reflect.InvocationTargetException;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import org.apache.commons.logging.LogFactory;

/* JADX INFO: loaded from: classes4.dex */
public class ServletContextCleaner implements ServletContextListener {
    private static final Class[] RELEASE_SIGNATURE;
    static /* synthetic */ Class class$java$lang$ClassLoader;

    static {
        Class clsClass$ = class$java$lang$ClassLoader;
        if (clsClass$ == null) {
            clsClass$ = class$("java.lang.ClassLoader");
            class$java$lang$ClassLoader = clsClass$;
        }
        RELEASE_SIGNATURE = new Class[]{clsClass$};
    }

    public static /* synthetic */ Class class$(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e9) {
            throw new NoClassDefFoundError(e9.getMessage());
        }
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        PrintStream printStream;
        String str;
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        Object[] objArr = {contextClassLoader};
        ClassLoader parent = contextClassLoader;
        while (parent != null) {
            try {
                Class<?> clsLoadClass = parent.loadClass(LogFactory.FACTORY_PROPERTY);
                clsLoadClass.getMethod("release", RELEASE_SIGNATURE).invoke(null, objArr);
                parent = clsLoadClass.getClassLoader().getParent();
            } catch (ClassNotFoundException unused) {
                parent = null;
            } catch (IllegalAccessException unused2) {
                printStream = System.err;
                str = "LogFactory instance found which is not accessable!";
                printStream.println(str);
                parent = null;
            } catch (NoSuchMethodException unused3) {
                printStream = System.err;
                str = "LogFactory instance found which does not support release method!";
                printStream.println(str);
                parent = null;
            } catch (InvocationTargetException unused4) {
                printStream = System.err;
                str = "LogFactory instance release method failed!";
                printStream.println(str);
                parent = null;
            }
        }
        LogFactory.release(contextClassLoader);
    }

    public void contextInitialized(ServletContextEvent servletContextEvent) {
    }
}
