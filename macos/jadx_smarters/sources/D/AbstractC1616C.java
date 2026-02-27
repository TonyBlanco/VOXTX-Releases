package d;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;
import java.util.Map;

/* JADX INFO: renamed from: d.C, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1616C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Field f39235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f39236b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Class f39237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f39238d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f39239e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f39240f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static Field f39241g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static boolean f39242h;

    /* JADX INFO: renamed from: d.C$a */
    public static class a {
        public static void a(LongSparseArray longSparseArray) {
            longSparseArray.clear();
        }
    }

    public static void a(Resources resources) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 28) {
            return;
        }
        if (i9 >= 24) {
            d(resources);
        } else if (i9 >= 23) {
            c(resources);
        } else {
            b(resources);
        }
    }

    public static void b(Resources resources) {
        Map map;
        if (!f39236b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f39235a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e9);
            }
            f39236b = true;
        }
        Field field = f39235a;
        if (field != null) {
            try {
                map = (Map) field.get(resources);
            } catch (IllegalAccessException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
                map = null;
            }
            if (map != null) {
                map.clear();
            }
        }
    }

    public static void c(Resources resources) {
        Object obj;
        if (!f39236b) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mDrawableCache");
                f39235a = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mDrawableCache field", e9);
            }
            f39236b = true;
        }
        Field field = f39235a;
        if (field != null) {
            try {
                obj = field.get(resources);
            } catch (IllegalAccessException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mDrawableCache", e10);
                obj = null;
            }
        } else {
            obj = null;
        }
        if (obj == null) {
            return;
        }
        e(obj);
    }

    public static void d(Resources resources) {
        Object obj;
        if (!f39242h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f39241g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e9) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e9);
            }
            f39242h = true;
        }
        Field field = f39241g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e10) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e10);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f39236b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f39235a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e11);
            }
            f39236b = true;
        }
        Field field2 = f39235a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e12);
            }
        }
        if (obj2 != null) {
            e(obj2);
        }
    }

    public static void e(Object obj) {
        LongSparseArray longSparseArray;
        if (!f39238d) {
            try {
                f39237c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e9) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e9);
            }
            f39238d = true;
        }
        Class cls = f39237c;
        if (cls == null) {
            return;
        }
        if (!f39240f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f39239e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e10);
            }
            f39240f = true;
        }
        Field field = f39239e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e11);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            a.a(longSparseArray);
        }
    }
}
