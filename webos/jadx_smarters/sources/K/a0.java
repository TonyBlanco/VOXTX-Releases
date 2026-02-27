package k;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class a0 extends ContextWrapper {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f43293c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static ArrayList f43294d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f43295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Resources.Theme f43296b;

    public a0(Context context) {
        super(context);
        if (!l0.c()) {
            this.f43295a = new c0(this, context.getResources());
            this.f43296b = null;
            return;
        }
        l0 l0Var = new l0(this, context.getResources());
        this.f43295a = l0Var;
        Resources.Theme themeNewTheme = l0Var.newTheme();
        this.f43296b = themeNewTheme;
        themeNewTheme.setTo(context.getTheme());
    }

    public static boolean a(Context context) {
        if ((context instanceof a0) || (context.getResources() instanceof c0) || (context.getResources() instanceof l0)) {
            return false;
        }
        return l0.c();
    }

    public static Context b(Context context) {
        if (!a(context)) {
            return context;
        }
        synchronized (f43293c) {
            try {
                ArrayList arrayList = f43294d;
                if (arrayList == null) {
                    f43294d = new ArrayList();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference weakReference = (WeakReference) f43294d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f43294d.remove(size);
                        }
                    }
                    for (int size2 = f43294d.size() - 1; size2 >= 0; size2--) {
                        WeakReference weakReference2 = (WeakReference) f43294d.get(size2);
                        a0 a0Var = weakReference2 != null ? (a0) weakReference2.get() : null;
                        if (a0Var != null && a0Var.getBaseContext() == context) {
                            return a0Var;
                        }
                    }
                }
                a0 a0Var2 = new a0(context);
                f43294d.add(new WeakReference(a0Var2));
                return a0Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f43295a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f43295a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f43296b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i9) {
        Resources.Theme theme = this.f43296b;
        if (theme == null) {
            super.setTheme(i9);
        } else {
            theme.applyStyle(i9, true);
        }
    }
}
