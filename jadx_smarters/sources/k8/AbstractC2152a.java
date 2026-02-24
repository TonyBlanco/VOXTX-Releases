package k8;

import java.lang.reflect.InvocationTargetException;
import r8.AbstractC2693b;

/* JADX INFO: renamed from: k8.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC2152a {
    public static void a(Throwable th, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        kotlin.jvm.internal.l.e(th, "<this>");
        kotlin.jvm.internal.l.e(exception, "exception");
        if (th != exception) {
            AbstractC2693b.f49801a.a(th, exception);
        }
    }
}
