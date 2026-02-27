package Q8;

import D.AbstractC0519b;
import Q8.d;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    public interface a extends AbstractC0519b.f {
        void F0(int i9, List list);

        void k(int i9, List list);
    }

    public interface b {
    }

    public static boolean a(Context context, String... strArr) {
        if (Build.VERSION.SDK_INT < 23) {
            Log.w("EasyPermissions", "hasPermissions: API version < M, returning true by default");
            return true;
        }
        if (context == null) {
            throw new IllegalArgumentException("Can't check permissions for null context");
        }
        for (String str : strArr) {
            if (E.b.checkSelfPermission(context, str) != 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean b(Object obj) {
        if (!obj.getClass().getSimpleName().endsWith("_")) {
            return false;
        }
        try {
            return Class.forName("org.androidannotations.api.view.HasViews").isInstance(obj);
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static void c(Object obj, int i9, String[] strArr) {
        int[] iArr = new int[strArr.length];
        for (int i10 = 0; i10 < strArr.length; i10++) {
            iArr[i10] = 0;
        }
        d(i9, strArr, iArr, obj);
    }

    public static void d(int i9, String[] strArr, int[] iArr, Object... objArr) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            String str = strArr[i10];
            if (iArr[i10] == 0) {
                arrayList.add(str);
            } else {
                arrayList2.add(str);
            }
        }
        for (Object obj : objArr) {
            if (!arrayList.isEmpty() && (obj instanceof a)) {
                ((a) obj).F0(i9, arrayList);
            }
            if (!arrayList2.isEmpty() && (obj instanceof a)) {
                ((a) obj).k(i9, arrayList2);
            }
            if (!arrayList.isEmpty() && arrayList2.isEmpty()) {
                g(obj, i9);
            }
        }
    }

    public static void e(d dVar) {
        if (a(dVar.a().b(), dVar.c())) {
            c(dVar.a().c(), dVar.f(), dVar.c());
        } else {
            dVar.a().g(dVar.e(), dVar.d(), dVar.b(), dVar.g(), dVar.f(), dVar.c());
        }
    }

    public static void f(Activity activity, String str, int i9, String... strArr) {
        e(new d.b(activity, i9, strArr).b(str).a());
    }

    public static void g(Object obj, int i9) {
        String str;
        Class<?> superclass = obj.getClass();
        if (b(obj)) {
            superclass = superclass.getSuperclass();
        }
        while (superclass != null) {
            for (Method method : superclass.getDeclaredMethods()) {
                Q8.a aVar = (Q8.a) method.getAnnotation(Q8.a.class);
                if (aVar != null && aVar.value() == i9) {
                    if (method.getParameterTypes().length > 0) {
                        throw new RuntimeException("Cannot execute method " + method.getName() + " because it is non-void method and/or has input parameters.");
                    }
                    try {
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(obj, null);
                    } catch (IllegalAccessException e9) {
                        e = e9;
                        str = "runDefaultMethod:IllegalAccessException";
                        Log.e("EasyPermissions", str, e);
                    } catch (InvocationTargetException e10) {
                        e = e10;
                        str = "runDefaultMethod:InvocationTargetException";
                        Log.e("EasyPermissions", str, e);
                    }
                }
            }
            superclass = superclass.getSuperclass();
        }
    }

    public static boolean h(Activity activity, List list) {
        return R8.e.d(activity).k(list);
    }
}
