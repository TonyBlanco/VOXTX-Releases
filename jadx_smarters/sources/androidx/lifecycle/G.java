package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f15855a = l8.k.h(Application.class, B.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15856b = l8.j.b(B.class);

    public static final Constructor c(Class modelClass, List signature) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        kotlin.jvm.internal.l.e(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.l.d(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.l.d(parameterTypes, "constructor.parameterTypes");
            List listT = l8.h.T(parameterTypes);
            if (kotlin.jvm.internal.l.a(signature, listT)) {
                return constructor;
            }
            if (signature.size() == listT.size() && listT.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final I d(Class modelClass, Constructor constructor, Object... params) {
        kotlin.jvm.internal.l.e(modelClass, "modelClass");
        kotlin.jvm.internal.l.e(constructor, "constructor");
        kotlin.jvm.internal.l.e(params, "params");
        try {
            return (I) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e9) {
            throw new RuntimeException("Failed to access " + modelClass, e9);
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e11.getCause());
        }
    }
}
