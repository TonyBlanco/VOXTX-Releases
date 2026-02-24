package d;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.Toolbar;
import d.AbstractC1647z;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import s.C2696b;

/* JADX INFO: renamed from: d.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1625d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AbstractC1647z.a f39309a = new AbstractC1647z.a(new AbstractC1647z.b());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f39310c = -100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static L.i f39311d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static L.i f39312e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static Boolean f39313f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static boolean f39314g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2696b f39315h = new C2696b();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Object f39316i = new Object();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Object f39317j = new Object();

    /* JADX INFO: renamed from: d.d$a */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: d.d$b */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    public static void E(AbstractC1625d abstractC1625d) {
        synchronized (f39316i) {
            F(abstractC1625d);
        }
    }

    public static void F(AbstractC1625d abstractC1625d) {
        synchronized (f39316i) {
            try {
                Iterator it = f39315h.iterator();
                while (it.hasNext()) {
                    AbstractC1625d abstractC1625d2 = (AbstractC1625d) ((WeakReference) it.next()).get();
                    if (abstractC1625d2 == abstractC1625d || abstractC1625d2 == null) {
                        it.remove();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void O(final Context context) {
        if (u(context)) {
            if (L.a.d()) {
                if (f39314g) {
                    return;
                }
                f39309a.execute(new Runnable() { // from class: d.c
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC1625d.v(context);
                    }
                });
                return;
            }
            synchronized (f39317j) {
                try {
                    L.i iVar = f39311d;
                    if (iVar == null) {
                        if (f39312e == null) {
                            f39312e = L.i.c(AbstractC1647z.b(context));
                        }
                        if (f39312e.f()) {
                        } else {
                            f39311d = f39312e;
                        }
                    } else if (!iVar.equals(f39312e)) {
                        L.i iVar2 = f39311d;
                        f39312e = iVar2;
                        AbstractC1647z.a(context, iVar2.h());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void d(AbstractC1625d abstractC1625d) {
        synchronized (f39316i) {
            F(abstractC1625d);
            f39315h.add(new WeakReference(abstractC1625d));
        }
    }

    public static AbstractC1625d h(Activity activity, InterfaceC1623b interfaceC1623b) {
        return new LayoutInflaterFactory2C1626e(activity, interfaceC1623b);
    }

    public static AbstractC1625d i(Dialog dialog, InterfaceC1623b interfaceC1623b) {
        return new LayoutInflaterFactory2C1626e(dialog, interfaceC1623b);
    }

    public static L.i k() {
        if (L.a.d()) {
            Object objO = o();
            if (objO != null) {
                return L.i.i(b.a(objO));
            }
        } else {
            L.i iVar = f39311d;
            if (iVar != null) {
                return iVar;
            }
        }
        return L.i.e();
    }

    public static int m() {
        return f39310c;
    }

    public static Object o() {
        Context contextL;
        Iterator it = f39315h.iterator();
        while (it.hasNext()) {
            AbstractC1625d abstractC1625d = (AbstractC1625d) ((WeakReference) it.next()).get();
            if (abstractC1625d != null && (contextL = abstractC1625d.l()) != null) {
                return contextL.getSystemService("locale");
            }
        }
        return null;
    }

    public static L.i q() {
        return f39311d;
    }

    public static boolean u(Context context) {
        if (f39313f == null) {
            try {
                Bundle bundle = AbstractServiceC1645x.a(context).metaData;
                if (bundle != null) {
                    f39313f = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                f39313f = Boolean.FALSE;
            }
        }
        return f39313f.booleanValue();
    }

    public static /* synthetic */ void v(Context context) {
        AbstractC1647z.c(context);
        f39314g = true;
    }

    public abstract void A();

    public abstract void B(Bundle bundle);

    public abstract void C();

    public abstract void D();

    public abstract boolean G(int i9);

    public abstract void H(int i9);

    public abstract void I(View view);

    public abstract void J(View view, ViewGroup.LayoutParams layoutParams);

    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
    }

    public abstract void L(Toolbar toolbar);

    public abstract void M(int i9);

    public abstract void N(CharSequence charSequence);

    public abstract void e(View view, ViewGroup.LayoutParams layoutParams);

    public void f(Context context) {
    }

    public Context g(Context context) {
        f(context);
        return context;
    }

    public abstract View j(int i9);

    public abstract Context l();

    public abstract int n();

    public abstract MenuInflater p();

    public abstract AbstractC1622a r();

    public abstract void s();

    public abstract void t();

    public abstract void w(Configuration configuration);

    public abstract void x(Bundle bundle);

    public abstract void y();

    public abstract void z(Bundle bundle);
}
