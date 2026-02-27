package H8;

import G8.I;
import android.os.Build;
import java.lang.Thread;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import o8.AbstractC2369a;
import o8.g;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends AbstractC2369a implements I {

    @Nullable
    private volatile Object _preHandler;

    public b() {
        super(I.f2294a0);
        this._preHandler = this;
    }

    public final Method c0() {
        Object obj = this._preHandler;
        if (obj != this) {
            return (Method) obj;
        }
        Method method = null;
        try {
            Method declaredMethod = Thread.class.getDeclaredMethod("getUncaughtExceptionPreHandler", null);
            if (Modifier.isPublic(declaredMethod.getModifiers())) {
                if (Modifier.isStatic(declaredMethod.getModifiers())) {
                    method = declaredMethod;
                }
            }
        } catch (Throwable unused) {
        }
        this._preHandler = method;
        return method;
    }

    @Override // G8.I
    public void j(g gVar, Throwable th) {
        int i9 = Build.VERSION.SDK_INT;
        if (26 > i9 || i9 >= 28) {
            return;
        }
        Method methodC0 = c0();
        Object objInvoke = methodC0 != null ? methodC0.invoke(null, null) : null;
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = objInvoke instanceof Thread.UncaughtExceptionHandler ? (Thread.UncaughtExceptionHandler) objInvoke : null;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
    }
}
