package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1184n;
import androidx.lifecycle.InterfaceC1186p;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC1184n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f13498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Field f13499d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Field f13500e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Field f13501f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Activity f13502a;

    public ImmLeaksCleaner(Activity activity) {
        this.f13502a = activity;
    }

    public static void c() {
        try {
            f13498c = 2;
            Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
            f13500e = declaredField;
            declaredField.setAccessible(true);
            Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
            f13501f = declaredField2;
            declaredField2.setAccessible(true);
            Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
            f13499d = declaredField3;
            declaredField3.setAccessible(true);
            f13498c = 1;
        } catch (NoSuchFieldException unused) {
        }
    }

    @Override // androidx.lifecycle.InterfaceC1184n
    public void b(InterfaceC1186p interfaceC1186p, AbstractC1180j.b bVar) {
        if (bVar != AbstractC1180j.b.ON_DESTROY) {
            return;
        }
        if (f13498c == 0) {
            c();
        }
        if (f13498c == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.f13502a.getSystemService("input_method");
            try {
                Object obj = f13499d.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            try {
                                View view = (View) f13500e.get(inputMethodManager);
                                if (view == null) {
                                    return;
                                }
                                if (view.isAttachedToWindow()) {
                                    return;
                                }
                                try {
                                    f13501f.set(inputMethodManager, null);
                                    inputMethodManager.isActive();
                                } catch (IllegalAccessException unused) {
                                }
                            } catch (ClassCastException unused2) {
                            }
                        } catch (IllegalAccessException unused3) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused4) {
            }
        }
    }
}
