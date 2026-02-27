package H8;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.lang.reflect.InvocationTargetException;
import k8.j;
import k8.k;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f2751a;

    @Nullable
    private static volatile Choreographer choreographer;

    static {
        Object objB;
        try {
            j.a aVar = j.f43666c;
            objB = j.b(new d(a(Looper.getMainLooper(), true), null, 2, null));
        } catch (Throwable th) {
            j.a aVar2 = j.f43666c;
            objB = j.b(k.a(th));
        }
        f2751a = (e) (j.f(objB) ? null : objB);
    }

    public static final Handler a(Looper looper, boolean z9) throws IllegalAccessException, InvocationTargetException {
        if (!z9) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT < 28) {
            try {
                return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
            } catch (NoSuchMethodException unused) {
                return new Handler(looper);
            }
        }
        Object objInvoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        if (objInvoke != null) {
            return (Handler) objInvoke;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.os.Handler");
    }
}
