package d;

import D.AbstractC0527j;
import F.h;
import P.AbstractC0975q;
import P.L;
import P.S;
import P.U;
import P.X;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.AbstractC1180j;
import androidx.lifecycle.InterfaceC1186p;
import c.AbstractC1238a;
import c.AbstractC1240c;
import e.AbstractC1726a;
import i.AbstractC1872b;
import i.f;
import j$.util.Objects;
import java.util.List;
import java.util.Locale;
import k.C2114i;
import k.d0;
import k.l0;
import k.m0;
import okio.Segment;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: renamed from: d.e, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C1626e extends AbstractC1625d implements e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public static final s.i f39318o0 = new s.i();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final boolean f39319p0 = false;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public static final int[] f39320q0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final boolean f39321r0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final boolean f39322s0 = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f39323A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f39324B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public ViewGroup f39325C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public TextView f39326D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public View f39327E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f39328F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f39329G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f39330H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f39331I;

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public boolean f39332J;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f39333K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f39334L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f39335M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public t[] f39336N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public t f39337O;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public boolean f39338P;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f39339Q;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public boolean f39340R;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f39341S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public Configuration f39342T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f39343U;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public int f39344V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public int f39345W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f39346X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public p f39347Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public p f39348Z;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public boolean f39349e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f39350f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public final Runnable f39351g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f39352h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public Rect f39353i0;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public Rect f39354j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Object f39355k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public C1644w f39356k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Context f39357l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public C1614A f39358l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Window f39359m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public OnBackInvokedDispatcher f39360m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n f39361n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public OnBackInvokedCallback f39362n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC1623b f39363o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AbstractC1622a f39364p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuInflater f39365q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f39366r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public k.G f39367s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public g f39368t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public u f39369u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AbstractC1872b f39370v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ActionBarContextView f39371w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public PopupWindow f39372x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Runnable f39373y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public S f39374z;

    /* JADX INFO: renamed from: d.e$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e = LayoutInflaterFactory2C1626e.this;
            if ((layoutInflaterFactory2C1626e.f39350f0 & 1) != 0) {
                layoutInflaterFactory2C1626e.g0(0);
            }
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e2 = LayoutInflaterFactory2C1626e.this;
            if ((layoutInflaterFactory2C1626e2.f39350f0 & 4096) != 0) {
                layoutInflaterFactory2C1626e2.g0(108);
            }
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e3 = LayoutInflaterFactory2C1626e.this;
            layoutInflaterFactory2C1626e3.f39349e0 = false;
            layoutInflaterFactory2C1626e3.f39350f0 = 0;
        }
    }

    /* JADX INFO: renamed from: d.e$b */
    public class b implements P.E {
        public b() {
        }

        @Override // P.E
        public X a(View view, X x9) {
            int iK = x9.k();
            int iD1 = LayoutInflaterFactory2C1626e.this.d1(x9, null);
            if (iK != iD1) {
                x9 = x9.o(x9.i(), iD1, x9.j(), x9.h());
            }
            return L.e0(view, x9);
        }
    }

    /* JADX INFO: renamed from: d.e$c */
    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            LayoutInflaterFactory2C1626e.this.e0();
        }
    }

    /* JADX INFO: renamed from: d.e$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: d.e$d$a */
        public class a extends U {
            public a() {
            }

            @Override // P.T
            public void b(View view) {
                LayoutInflaterFactory2C1626e.this.f39371w.setAlpha(1.0f);
                LayoutInflaterFactory2C1626e.this.f39374z.j(null);
                LayoutInflaterFactory2C1626e.this.f39374z = null;
            }

            @Override // P.U, P.T
            public void c(View view) {
                LayoutInflaterFactory2C1626e.this.f39371w.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e = LayoutInflaterFactory2C1626e.this;
            layoutInflaterFactory2C1626e.f39372x.showAtLocation(layoutInflaterFactory2C1626e.f39371w, 55, 0, 0);
            LayoutInflaterFactory2C1626e.this.h0();
            if (!LayoutInflaterFactory2C1626e.this.S0()) {
                LayoutInflaterFactory2C1626e.this.f39371w.setAlpha(1.0f);
                LayoutInflaterFactory2C1626e.this.f39371w.setVisibility(0);
            } else {
                LayoutInflaterFactory2C1626e.this.f39371w.setAlpha(0.0f);
                LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e2 = LayoutInflaterFactory2C1626e.this;
                layoutInflaterFactory2C1626e2.f39374z = L.e(layoutInflaterFactory2C1626e2.f39371w).b(1.0f);
                LayoutInflaterFactory2C1626e.this.f39374z.j(new a());
            }
        }
    }

    /* JADX INFO: renamed from: d.e$e, reason: collision with other inner class name */
    public class C0310e extends U {
        public C0310e() {
        }

        @Override // P.T
        public void b(View view) {
            LayoutInflaterFactory2C1626e.this.f39371w.setAlpha(1.0f);
            LayoutInflaterFactory2C1626e.this.f39374z.j(null);
            LayoutInflaterFactory2C1626e.this.f39374z = null;
        }

        @Override // P.U, P.T
        public void c(View view) {
            LayoutInflaterFactory2C1626e.this.f39371w.setVisibility(0);
            if (LayoutInflaterFactory2C1626e.this.f39371w.getParent() instanceof View) {
                L.p0((View) LayoutInflaterFactory2C1626e.this.f39371w.getParent());
            }
        }
    }

    /* JADX INFO: renamed from: d.e$f */
    public interface f {
        boolean a(int i9);

        View onCreatePanelView(int i9);
    }

    /* JADX INFO: renamed from: d.e$g */
    public final class g implements i.a {
        public g() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            LayoutInflaterFactory2C1626e.this.X(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackT0 = LayoutInflaterFactory2C1626e.this.t0();
            if (callbackT0 == null) {
                return true;
            }
            callbackT0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: d.e$h */
    public class h implements AbstractC1872b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC1872b.a f39382a;

        /* JADX INFO: renamed from: d.e$h$a */
        public class a extends U {
            public a() {
            }

            @Override // P.T
            public void b(View view) {
                LayoutInflaterFactory2C1626e.this.f39371w.setVisibility(8);
                LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e = LayoutInflaterFactory2C1626e.this;
                PopupWindow popupWindow = layoutInflaterFactory2C1626e.f39372x;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (layoutInflaterFactory2C1626e.f39371w.getParent() instanceof View) {
                    L.p0((View) LayoutInflaterFactory2C1626e.this.f39371w.getParent());
                }
                LayoutInflaterFactory2C1626e.this.f39371w.k();
                LayoutInflaterFactory2C1626e.this.f39374z.j(null);
                LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e2 = LayoutInflaterFactory2C1626e.this;
                layoutInflaterFactory2C1626e2.f39374z = null;
                L.p0(layoutInflaterFactory2C1626e2.f39325C);
            }
        }

        public h(AbstractC1872b.a aVar) {
            this.f39382a = aVar;
        }

        @Override // i.AbstractC1872b.a
        public boolean a(AbstractC1872b abstractC1872b, MenuItem menuItem) {
            return this.f39382a.a(abstractC1872b, menuItem);
        }

        @Override // i.AbstractC1872b.a
        public void b(AbstractC1872b abstractC1872b) {
            this.f39382a.b(abstractC1872b);
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e = LayoutInflaterFactory2C1626e.this;
            if (layoutInflaterFactory2C1626e.f39372x != null) {
                layoutInflaterFactory2C1626e.f39359m.getDecorView().removeCallbacks(LayoutInflaterFactory2C1626e.this.f39373y);
            }
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e2 = LayoutInflaterFactory2C1626e.this;
            if (layoutInflaterFactory2C1626e2.f39371w != null) {
                layoutInflaterFactory2C1626e2.h0();
                LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e3 = LayoutInflaterFactory2C1626e.this;
                layoutInflaterFactory2C1626e3.f39374z = L.e(layoutInflaterFactory2C1626e3.f39371w).b(0.0f);
                LayoutInflaterFactory2C1626e.this.f39374z.j(new a());
            }
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e4 = LayoutInflaterFactory2C1626e.this;
            InterfaceC1623b interfaceC1623b = layoutInflaterFactory2C1626e4.f39363o;
            if (interfaceC1623b != null) {
                interfaceC1623b.onSupportActionModeFinished(layoutInflaterFactory2C1626e4.f39370v);
            }
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e5 = LayoutInflaterFactory2C1626e.this;
            layoutInflaterFactory2C1626e5.f39370v = null;
            L.p0(layoutInflaterFactory2C1626e5.f39325C);
            LayoutInflaterFactory2C1626e.this.b1();
        }

        @Override // i.AbstractC1872b.a
        public boolean c(AbstractC1872b abstractC1872b, Menu menu) {
            L.p0(LayoutInflaterFactory2C1626e.this.f39325C);
            return this.f39382a.c(abstractC1872b, menu);
        }

        @Override // i.AbstractC1872b.a
        public boolean d(AbstractC1872b abstractC1872b, Menu menu) {
            return this.f39382a.d(abstractC1872b, menu);
        }
    }

    /* JADX INFO: renamed from: d.e$i */
    public static class i {
        public static Context a(Context context, Configuration configuration) {
            return context.createConfigurationContext(configuration);
        }

        public static void b(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i9 = configuration.densityDpi;
            int i10 = configuration2.densityDpi;
            if (i9 != i10) {
                configuration3.densityDpi = i10;
            }
        }

        public static void c(Configuration configuration, Locale locale) {
            configuration.setLayoutDirection(locale);
        }

        public static void d(Configuration configuration, Locale locale) {
            configuration.setLocale(locale);
        }
    }

    /* JADX INFO: renamed from: d.e$j */
    public static class j {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: renamed from: d.e$k */
    public static class k {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static L.i b(Configuration configuration) {
            return L.i.c(configuration.getLocales().toLanguageTags());
        }

        public static void c(L.i iVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(iVar.h()));
        }

        public static void d(Configuration configuration, L.i iVar) {
            configuration.setLocales(LocaleList.forLanguageTags(iVar.h()));
        }
    }

    /* JADX INFO: renamed from: d.e$l */
    public static class l {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            if ((configuration.colorMode & 3) != (configuration2.colorMode & 3)) {
                configuration3.colorMode |= configuration2.colorMode & 3;
            }
            if ((configuration.colorMode & 12) != (configuration2.colorMode & 12)) {
                configuration3.colorMode |= configuration2.colorMode & 12;
            }
        }
    }

    /* JADX INFO: renamed from: d.e$m */
    public static class m {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e) {
            Objects.requireNonNull(layoutInflaterFactory2C1626e);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: d.s
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    layoutInflaterFactory2C1626e.B0();
                }
            };
            AbstractC1636o.a(obj).registerOnBackInvokedCallback(1000000, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            AbstractC1636o.a(obj).unregisterOnBackInvokedCallback(AbstractC1635n.a(obj2));
        }
    }

    /* JADX INFO: renamed from: d.e$n */
    public class n extends i.i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public f f39385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f39386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f39388f;

        public n(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f39387e = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f39387e = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f39386d = true;
                callback.onContentChanged();
            } finally {
                this.f39386d = false;
            }
        }

        public void d(Window.Callback callback, int i9, Menu menu) {
            try {
                this.f39388f = true;
                callback.onPanelClosed(i9, menu);
            } finally {
                this.f39388f = false;
            }
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return this.f39387e ? a().dispatchKeyEvent(keyEvent) : LayoutInflaterFactory2C1626e.this.f0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // i.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || LayoutInflaterFactory2C1626e.this.E0(keyEvent.getKeyCode(), keyEvent);
        }

        public void e(f fVar) {
            this.f39385c = fVar;
        }

        public final ActionMode f(ActionMode.Callback callback) {
            f.a aVar = new f.a(LayoutInflaterFactory2C1626e.this.f39357l, callback);
            AbstractC1872b abstractC1872bV0 = LayoutInflaterFactory2C1626e.this.V0(aVar);
            if (abstractC1872bV0 != null) {
                return aVar.e(abstractC1872bV0);
            }
            return null;
        }

        @Override // android.view.Window.Callback
        public void onContentChanged() {
            if (this.f39386d) {
                a().onContentChanged();
            }
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i9, Menu menu) {
            if (i9 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i9, menu);
            }
            return false;
        }

        @Override // i.i, android.view.Window.Callback
        public View onCreatePanelView(int i9) {
            View viewOnCreatePanelView;
            f fVar = this.f39385c;
            return (fVar == null || (viewOnCreatePanelView = fVar.onCreatePanelView(i9)) == null) ? super.onCreatePanelView(i9) : viewOnCreatePanelView;
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onMenuOpened(int i9, Menu menu) {
            super.onMenuOpened(i9, menu);
            LayoutInflaterFactory2C1626e.this.H0(i9);
            return true;
        }

        @Override // i.i, android.view.Window.Callback
        public void onPanelClosed(int i9, Menu menu) {
            if (this.f39388f) {
                a().onPanelClosed(i9, menu);
            } else {
                super.onPanelClosed(i9, menu);
                LayoutInflaterFactory2C1626e.this.I0(i9);
            }
        }

        @Override // i.i, android.view.Window.Callback
        public boolean onPreparePanel(int i9, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i9 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.a0(true);
            }
            f fVar = this.f39385c;
            boolean zOnPreparePanel = fVar != null && fVar.a(i9);
            if (!zOnPreparePanel) {
                zOnPreparePanel = super.onPreparePanel(i9, view, menu);
            }
            if (eVar != null) {
                eVar.a0(false);
            }
            return zOnPreparePanel;
        }

        @Override // i.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i9) {
            androidx.appcompat.view.menu.e eVar;
            t tVarR0 = LayoutInflaterFactory2C1626e.this.r0(0, true);
            if (tVarR0 == null || (eVar = tVarR0.f39407j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i9);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i9);
            }
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            if (Build.VERSION.SDK_INT >= 23) {
                return null;
            }
            return LayoutInflaterFactory2C1626e.this.z0() ? f(callback) : super.onWindowStartingActionMode(callback);
        }

        @Override // i.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i9) {
            return (LayoutInflaterFactory2C1626e.this.z0() && i9 == 0) ? f(callback) : super.onWindowStartingActionMode(callback, i9);
        }
    }

    /* JADX INFO: renamed from: d.e$o */
    public class o extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f39390c;

        public o(Context context) {
            super();
            this.f39390c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // d.LayoutInflaterFactory2C1626e.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // d.LayoutInflaterFactory2C1626e.p
        public int c() {
            return j.a(this.f39390c) ? 2 : 1;
        }

        @Override // d.LayoutInflaterFactory2C1626e.p
        public void d() {
            LayoutInflaterFactory2C1626e.this.R();
        }
    }

    /* JADX INFO: renamed from: d.e$p */
    public abstract class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f39392a;

        /* JADX INFO: renamed from: d.e$p$a */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                p.this.d();
            }
        }

        public p() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f39392a;
            if (broadcastReceiver != null) {
                try {
                    LayoutInflaterFactory2C1626e.this.f39357l.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f39392a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f39392a == null) {
                this.f39392a = new a();
            }
            LayoutInflaterFactory2C1626e.this.f39357l.registerReceiver(this.f39392a, intentFilterB);
        }
    }

    /* JADX INFO: renamed from: d.e$q */
    public class q extends p {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1620G f39395c;

        public q(C1620G c1620g) {
            super();
            this.f39395c = c1620g;
        }

        @Override // d.LayoutInflaterFactory2C1626e.p
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // d.LayoutInflaterFactory2C1626e.p
        public int c() {
            return this.f39395c.d() ? 2 : 1;
        }

        @Override // d.LayoutInflaterFactory2C1626e.p
        public void d() {
            LayoutInflaterFactory2C1626e.this.R();
        }
    }

    /* JADX INFO: renamed from: d.e$r */
    public static class r {
        public static void a(ContextThemeWrapper contextThemeWrapper, Configuration configuration) {
            contextThemeWrapper.applyOverrideConfiguration(configuration);
        }
    }

    /* JADX INFO: renamed from: d.e$s */
    public class s extends ContentFrameLayout {
        public s(Context context) {
            super(context);
        }

        public final boolean b(int i9, int i10) {
            return i9 < -5 || i10 < -5 || i9 > getWidth() + 5 || i10 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return LayoutInflaterFactory2C1626e.this.f0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            LayoutInflaterFactory2C1626e.this.Z(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i9) {
            setBackgroundDrawable(AbstractC1726a.b(getContext(), i9));
        }
    }

    /* JADX INFO: renamed from: d.e$t */
    public static final class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39398a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39399b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f39400c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f39401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f39402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f39403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ViewGroup f39404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public View f39405h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public View f39406i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f39407j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f39408k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Context f39409l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f39410m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f39411n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f39412o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f39413p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f39414q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f39415r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Bundle f39416s;

        public t(int i9) {
            this.f39398a = i9;
        }

        public androidx.appcompat.view.menu.j a(i.a aVar) {
            if (this.f39407j == null) {
                return null;
            }
            if (this.f39408k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f39409l, c.g.f17886j);
                this.f39408k = cVar;
                cVar.d(aVar);
                this.f39407j.b(this.f39408k);
            }
            return this.f39408k.j(this.f39404g);
        }

        public boolean b() {
            if (this.f39405h == null) {
                return false;
            }
            return this.f39406i != null || this.f39408k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f39407j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.O(this.f39408k);
            }
            this.f39407j = eVar;
            if (eVar == null || (cVar = this.f39408k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(AbstractC1238a.f17742a, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                themeNewTheme.applyStyle(i9, true);
            }
            themeNewTheme.resolveAttribute(AbstractC1238a.f17730G, typedValue, true);
            int i10 = typedValue.resourceId;
            if (i10 == 0) {
                i10 = c.i.f17913c;
            }
            themeNewTheme.applyStyle(i10, true);
            i.d dVar = new i.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f39409l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(c.j.f18169y0);
            this.f39399b = typedArrayObtainStyledAttributes.getResourceId(c.j.f17922B0, 0);
            this.f39403f = typedArrayObtainStyledAttributes.getResourceId(c.j.f17917A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: d.e$u */
    public final class u implements i.a {
        public u() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z10 = eVarD != eVar;
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e = LayoutInflaterFactory2C1626e.this;
            if (z10) {
                eVar = eVarD;
            }
            t tVarK0 = layoutInflaterFactory2C1626e.k0(eVar);
            if (tVarK0 != null) {
                if (!z10) {
                    LayoutInflaterFactory2C1626e.this.a0(tVarK0, z9);
                } else {
                    LayoutInflaterFactory2C1626e.this.W(tVarK0.f39398a, tVarK0, eVarD);
                    LayoutInflaterFactory2C1626e.this.a0(tVarK0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackT0;
            if (eVar != eVar.D()) {
                return true;
            }
            LayoutInflaterFactory2C1626e layoutInflaterFactory2C1626e = LayoutInflaterFactory2C1626e.this;
            if (!layoutInflaterFactory2C1626e.f39330H || (callbackT0 = layoutInflaterFactory2C1626e.t0()) == null || LayoutInflaterFactory2C1626e.this.f39341S) {
                return true;
            }
            callbackT0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public LayoutInflaterFactory2C1626e(Activity activity, InterfaceC1623b interfaceC1623b) {
        this(activity, null, interfaceC1623b, activity);
    }

    public LayoutInflaterFactory2C1626e(Dialog dialog, InterfaceC1623b interfaceC1623b) {
        this(dialog.getContext(), dialog.getWindow(), interfaceC1623b, dialog);
    }

    public LayoutInflaterFactory2C1626e(Context context, Window window, InterfaceC1623b interfaceC1623b, Object obj) {
        androidx.appcompat.app.b bVarY0;
        this.f39374z = null;
        this.f39323A = true;
        this.f39343U = -100;
        this.f39351g0 = new a();
        this.f39357l = context;
        this.f39363o = interfaceC1623b;
        this.f39355k = obj;
        if (this.f39343U == -100 && (obj instanceof Dialog) && (bVarY0 = Y0()) != null) {
            this.f39343U = bVarY0.h1().n();
        }
        if (this.f39343U == -100) {
            s.i iVar = f39318o0;
            Integer num = (Integer) iVar.get(obj.getClass().getName());
            if (num != null) {
                this.f39343U = num.intValue();
                iVar.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            T(window);
        }
        C2114i.h();
    }

    public static Configuration l0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f9 = configuration.fontScale;
            float f10 = configuration2.fontScale;
            if (f9 != f10) {
                configuration3.fontScale = f10;
            }
            int i9 = configuration.mcc;
            int i10 = configuration2.mcc;
            if (i9 != i10) {
                configuration3.mcc = i10;
            }
            int i11 = configuration.mnc;
            int i12 = configuration2.mnc;
            if (i11 != i12) {
                configuration3.mnc = i12;
            }
            int i13 = Build.VERSION.SDK_INT;
            if (i13 >= 24) {
                k.a(configuration, configuration2, configuration3);
            } else if (!O.c.a(configuration.locale, configuration2.locale)) {
                configuration3.locale = configuration2.locale;
            }
            int i14 = configuration.touchscreen;
            int i15 = configuration2.touchscreen;
            if (i14 != i15) {
                configuration3.touchscreen = i15;
            }
            int i16 = configuration.keyboard;
            int i17 = configuration2.keyboard;
            if (i16 != i17) {
                configuration3.keyboard = i17;
            }
            int i18 = configuration.keyboardHidden;
            int i19 = configuration2.keyboardHidden;
            if (i18 != i19) {
                configuration3.keyboardHidden = i19;
            }
            int i20 = configuration.navigation;
            int i21 = configuration2.navigation;
            if (i20 != i21) {
                configuration3.navigation = i21;
            }
            int i22 = configuration.navigationHidden;
            int i23 = configuration2.navigationHidden;
            if (i22 != i23) {
                configuration3.navigationHidden = i23;
            }
            int i24 = configuration.orientation;
            int i25 = configuration2.orientation;
            if (i24 != i25) {
                configuration3.orientation = i25;
            }
            int i26 = configuration.screenLayout & 15;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 15)) {
                configuration3.screenLayout |= i27 & 15;
            }
            int i28 = configuration.screenLayout & 192;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 192)) {
                configuration3.screenLayout |= i29 & 192;
            }
            int i30 = configuration.screenLayout & 48;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 48)) {
                configuration3.screenLayout |= i31 & 48;
            }
            int i32 = configuration.screenLayout & 768;
            int i33 = configuration2.screenLayout;
            if (i32 != (i33 & 768)) {
                configuration3.screenLayout |= i33 & 768;
            }
            if (i13 >= 26) {
                l.a(configuration, configuration2, configuration3);
            }
            int i34 = configuration.uiMode & 15;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 15)) {
                configuration3.uiMode |= i35 & 15;
            }
            int i36 = configuration.uiMode & 48;
            int i37 = configuration2.uiMode;
            if (i36 != (i37 & 48)) {
                configuration3.uiMode |= i37 & 48;
            }
            int i38 = configuration.screenWidthDp;
            int i39 = configuration2.screenWidthDp;
            if (i38 != i39) {
                configuration3.screenWidthDp = i39;
            }
            int i40 = configuration.screenHeightDp;
            int i41 = configuration2.screenHeightDp;
            if (i40 != i41) {
                configuration3.screenHeightDp = i41;
            }
            int i42 = configuration.smallestScreenWidthDp;
            int i43 = configuration2.smallestScreenWidthDp;
            if (i42 != i43) {
                configuration3.smallestScreenWidthDp = i43;
            }
            i.b(configuration, configuration2, configuration3);
        }
        return configuration3;
    }

    @Override // d.AbstractC1625d
    public void A() {
        AbstractC1622a abstractC1622aR = r();
        if (abstractC1622aR != null) {
            abstractC1622aR.v(true);
        }
    }

    public int A0(Context context, int i9) {
        p pVarP0;
        if (i9 == -100) {
            return -1;
        }
        if (i9 != -1) {
            if (i9 != 0) {
                if (i9 != 1 && i9 != 2) {
                    if (i9 != 3) {
                        throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                    }
                    pVarP0 = o0(context);
                }
            } else {
                if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                pVarP0 = p0(context);
            }
            return pVarP0.c();
        }
        return i9;
    }

    @Override // d.AbstractC1625d
    public void B(Bundle bundle) {
    }

    public boolean B0() {
        boolean z9 = this.f39338P;
        this.f39338P = false;
        t tVarR0 = r0(0, false);
        if (tVarR0 != null && tVarR0.f39412o) {
            if (!z9) {
                a0(tVarR0, true);
            }
            return true;
        }
        AbstractC1872b abstractC1872b = this.f39370v;
        if (abstractC1872b != null) {
            abstractC1872b.c();
            return true;
        }
        AbstractC1622a abstractC1622aR = r();
        return abstractC1622aR != null && abstractC1622aR.h();
    }

    @Override // d.AbstractC1625d
    public void C() {
        Q(true, false);
    }

    public boolean C0(int i9, KeyEvent keyEvent) {
        if (i9 == 4) {
            this.f39338P = (keyEvent.getFlags() & 128) != 0;
        } else if (i9 == 82) {
            D0(0, keyEvent);
            return true;
        }
        return false;
    }

    @Override // d.AbstractC1625d
    public void D() {
        AbstractC1622a abstractC1622aR = r();
        if (abstractC1622aR != null) {
            abstractC1622aR.v(false);
        }
    }

    public final boolean D0(int i9, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        t tVarR0 = r0(i9, true);
        if (tVarR0.f39412o) {
            return false;
        }
        return N0(tVarR0, keyEvent);
    }

    public boolean E0(int i9, KeyEvent keyEvent) {
        AbstractC1622a abstractC1622aR = r();
        if (abstractC1622aR != null && abstractC1622aR.p(i9, keyEvent)) {
            return true;
        }
        t tVar = this.f39337O;
        if (tVar != null && M0(tVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            t tVar2 = this.f39337O;
            if (tVar2 != null) {
                tVar2.f39411n = true;
            }
            return true;
        }
        if (this.f39337O == null) {
            t tVarR0 = r0(0, true);
            N0(tVarR0, keyEvent);
            boolean zM0 = M0(tVarR0, keyEvent.getKeyCode(), keyEvent, 1);
            tVarR0.f39410m = false;
            if (zM0) {
                return true;
            }
        }
        return false;
    }

    public boolean F0(int i9, KeyEvent keyEvent) {
        if (i9 != 4) {
            if (i9 == 82) {
                G0(0, keyEvent);
                return true;
            }
        } else if (B0()) {
            return true;
        }
        return false;
    }

    @Override // d.AbstractC1625d
    public boolean G(int i9) {
        int iP0 = P0(i9);
        if (this.f39334L && iP0 == 108) {
            return false;
        }
        if (this.f39330H && iP0 == 1) {
            this.f39330H = false;
        }
        if (iP0 == 1) {
            X0();
            this.f39334L = true;
            return true;
        }
        if (iP0 == 2) {
            X0();
            this.f39328F = true;
            return true;
        }
        if (iP0 == 5) {
            X0();
            this.f39329G = true;
            return true;
        }
        if (iP0 == 10) {
            X0();
            this.f39332J = true;
            return true;
        }
        if (iP0 == 108) {
            X0();
            this.f39330H = true;
            return true;
        }
        if (iP0 != 109) {
            return this.f39359m.requestFeature(iP0);
        }
        X0();
        this.f39331I = true;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean G0(int r5, android.view.KeyEvent r6) {
        /*
            r4 = this;
            i.b r0 = r4.f39370v
            r1 = 0
            if (r0 == 0) goto L6
            return r1
        L6:
            r0 = 1
            d.e$t r2 = r4.r0(r5, r0)
            if (r5 != 0) goto L43
            k.G r5 = r4.f39367s
            if (r5 == 0) goto L43
            boolean r5 = r5.a()
            if (r5 == 0) goto L43
            android.content.Context r5 = r4.f39357l
            android.view.ViewConfiguration r5 = android.view.ViewConfiguration.get(r5)
            boolean r5 = r5.hasPermanentMenuKey()
            if (r5 != 0) goto L43
            k.G r5 = r4.f39367s
            boolean r5 = r5.e()
            if (r5 != 0) goto L3c
            boolean r5 = r4.f39341S
            if (r5 != 0) goto L62
            boolean r5 = r4.N0(r2, r6)
            if (r5 == 0) goto L62
            k.G r5 = r4.f39367s
            boolean r0 = r5.c()
            goto L68
        L3c:
            k.G r5 = r4.f39367s
            boolean r0 = r5.b()
            goto L68
        L43:
            boolean r5 = r2.f39412o
            if (r5 != 0) goto L64
            boolean r3 = r2.f39411n
            if (r3 == 0) goto L4c
            goto L64
        L4c:
            boolean r5 = r2.f39410m
            if (r5 == 0) goto L62
            boolean r5 = r2.f39415r
            if (r5 == 0) goto L5b
            r2.f39410m = r1
            boolean r5 = r4.N0(r2, r6)
            goto L5c
        L5b:
            r5 = 1
        L5c:
            if (r5 == 0) goto L62
            r4.K0(r2, r6)
            goto L68
        L62:
            r0 = 0
            goto L68
        L64:
            r4.a0(r2, r0)
            r0 = r5
        L68:
            if (r0 == 0) goto L85
            android.content.Context r5 = r4.f39357l
            android.content.Context r5 = r5.getApplicationContext()
            java.lang.String r6 = "audio"
            java.lang.Object r5 = r5.getSystemService(r6)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            if (r5 == 0) goto L7e
            r5.playSoundEffect(r1)
            goto L85
        L7e:
            java.lang.String r5 = "AppCompatDelegate"
            java.lang.String r6 = "Couldn't get audio manager"
            android.util.Log.w(r5, r6)
        L85:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: d.LayoutInflaterFactory2C1626e.G0(int, android.view.KeyEvent):boolean");
    }

    @Override // d.AbstractC1625d
    public void H(int i9) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.f39325C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f39357l).inflate(i9, viewGroup);
        this.f39361n.c(this.f39359m.getCallback());
    }

    public void H0(int i9) {
        AbstractC1622a abstractC1622aR;
        if (i9 != 108 || (abstractC1622aR = r()) == null) {
            return;
        }
        abstractC1622aR.i(true);
    }

    @Override // d.AbstractC1625d
    public void I(View view) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.f39325C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f39361n.c(this.f39359m.getCallback());
    }

    public void I0(int i9) {
        if (i9 == 108) {
            AbstractC1622a abstractC1622aR = r();
            if (abstractC1622aR != null) {
                abstractC1622aR.i(false);
                return;
            }
            return;
        }
        if (i9 == 0) {
            t tVarR0 = r0(i9, true);
            if (tVarR0.f39412o) {
                a0(tVarR0, false);
            }
        }
    }

    @Override // d.AbstractC1625d
    public void J(View view, ViewGroup.LayoutParams layoutParams) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.f39325C.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f39361n.c(this.f39359m.getCallback());
    }

    public void J0(ViewGroup viewGroup) {
    }

    @Override // d.AbstractC1625d
    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.K(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f39360m0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f39362n0) != null) {
            m.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f39362n0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f39355k;
            if ((obj instanceof Activity) && ((Activity) obj).getWindow() != null) {
                onBackInvokedDispatcher = m.a((Activity) this.f39355k);
            }
        }
        this.f39360m0 = onBackInvokedDispatcher;
        b1();
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:69:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void K0(d.LayoutInflaterFactory2C1626e.t r12, android.view.KeyEvent r13) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d.LayoutInflaterFactory2C1626e.K0(d.e$t, android.view.KeyEvent):void");
    }

    @Override // d.AbstractC1625d
    public void L(Toolbar toolbar) {
        if (this.f39355k instanceof Activity) {
            AbstractC1622a abstractC1622aR = r();
            if (abstractC1622aR instanceof C1621H) {
                throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
            }
            this.f39365q = null;
            if (abstractC1622aR != null) {
                abstractC1622aR.o();
            }
            this.f39364p = null;
            if (toolbar != null) {
                C1618E c1618e = new C1618E(toolbar, s0(), this.f39361n);
                this.f39364p = c1618e;
                this.f39361n.e(c1618e.f39245c);
                toolbar.setBackInvokedCallbackEnabled(true);
            } else {
                this.f39361n.e(null);
            }
            t();
        }
    }

    public final AbstractC1622a L0() {
        return this.f39364p;
    }

    @Override // d.AbstractC1625d
    public void M(int i9) {
        this.f39344V = i9;
    }

    public final boolean M0(t tVar, int i9, KeyEvent keyEvent, int i10) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((tVar.f39410m || N0(tVar, keyEvent)) && (eVar = tVar.f39407j) != null) {
            zPerformShortcut = eVar.performShortcut(i9, keyEvent, i10);
        }
        if (zPerformShortcut && (i10 & 1) == 0 && this.f39367s == null) {
            a0(tVar, true);
        }
        return zPerformShortcut;
    }

    @Override // d.AbstractC1625d
    public final void N(CharSequence charSequence) {
        this.f39366r = charSequence;
        k.G g9 = this.f39367s;
        if (g9 != null) {
            g9.setWindowTitle(charSequence);
            return;
        }
        if (L0() != null) {
            L0().y(charSequence);
            return;
        }
        TextView textView = this.f39326D;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean N0(t tVar, KeyEvent keyEvent) {
        k.G g9;
        k.G g10;
        k.G g11;
        if (this.f39341S) {
            return false;
        }
        if (tVar.f39410m) {
            return true;
        }
        t tVar2 = this.f39337O;
        if (tVar2 != null && tVar2 != tVar) {
            a0(tVar2, false);
        }
        Window.Callback callbackT0 = t0();
        if (callbackT0 != null) {
            tVar.f39406i = callbackT0.onCreatePanelView(tVar.f39398a);
        }
        int i9 = tVar.f39398a;
        boolean z9 = i9 == 0 || i9 == 108;
        if (z9 && (g11 = this.f39367s) != null) {
            g11.f();
        }
        if (tVar.f39406i == null && (!z9 || !(L0() instanceof C1618E))) {
            androidx.appcompat.view.menu.e eVar = tVar.f39407j;
            if (eVar == null || tVar.f39415r) {
                if (eVar == null && (!x0(tVar) || tVar.f39407j == null)) {
                    return false;
                }
                if (z9 && this.f39367s != null) {
                    if (this.f39368t == null) {
                        this.f39368t = new g();
                    }
                    this.f39367s.d(tVar.f39407j, this.f39368t);
                }
                tVar.f39407j.d0();
                if (!callbackT0.onCreatePanelMenu(tVar.f39398a, tVar.f39407j)) {
                    tVar.c(null);
                    if (z9 && (g9 = this.f39367s) != null) {
                        g9.d(null, this.f39368t);
                    }
                    return false;
                }
                tVar.f39415r = false;
            }
            tVar.f39407j.d0();
            Bundle bundle = tVar.f39416s;
            if (bundle != null) {
                tVar.f39407j.P(bundle);
                tVar.f39416s = null;
            }
            if (!callbackT0.onPreparePanel(0, tVar.f39406i, tVar.f39407j)) {
                if (z9 && (g10 = this.f39367s) != null) {
                    g10.d(null, this.f39368t);
                }
                tVar.f39407j.c0();
                return false;
            }
            boolean z10 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            tVar.f39413p = z10;
            tVar.f39407j.setQwertyMode(z10);
            tVar.f39407j.c0();
        }
        tVar.f39410m = true;
        tVar.f39411n = false;
        this.f39337O = tVar;
        return true;
    }

    public final void O0(boolean z9) {
        k.G g9 = this.f39367s;
        if (g9 == null || !g9.a() || (ViewConfiguration.get(this.f39357l).hasPermanentMenuKey() && !this.f39367s.g())) {
            t tVarR0 = r0(0, true);
            tVarR0.f39414q = true;
            a0(tVarR0, false);
            K0(tVarR0, null);
            return;
        }
        Window.Callback callbackT0 = t0();
        if (this.f39367s.e() && z9) {
            this.f39367s.b();
            if (this.f39341S) {
                return;
            }
            callbackT0.onPanelClosed(108, r0(0, true).f39407j);
            return;
        }
        if (callbackT0 == null || this.f39341S) {
            return;
        }
        if (this.f39349e0 && (this.f39350f0 & 1) != 0) {
            this.f39359m.getDecorView().removeCallbacks(this.f39351g0);
            this.f39351g0.run();
        }
        t tVarR02 = r0(0, true);
        androidx.appcompat.view.menu.e eVar = tVarR02.f39407j;
        if (eVar == null || tVarR02.f39415r || !callbackT0.onPreparePanel(0, tVarR02.f39406i, eVar)) {
            return;
        }
        callbackT0.onMenuOpened(108, tVarR02.f39407j);
        this.f39367s.c();
    }

    public final boolean P(boolean z9) {
        return Q(z9, true);
    }

    public final int P0(int i9) {
        if (i9 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i9 != 9) {
            return i9;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    public final boolean Q(boolean z9, boolean z10) {
        if (this.f39341S) {
            return false;
        }
        int iV = V();
        int iA0 = A0(this.f39357l, iV);
        L.i iVarU = Build.VERSION.SDK_INT < 33 ? U(this.f39357l) : null;
        if (!z10 && iVarU != null) {
            iVarU = q0(this.f39357l.getResources().getConfiguration());
        }
        boolean zA1 = a1(iA0, iVarU, z9);
        if (iV == 0) {
            p0(this.f39357l).e();
        } else {
            p pVar = this.f39347Y;
            if (pVar != null) {
                pVar.a();
            }
        }
        if (iV == 3) {
            o0(this.f39357l).e();
        } else {
            p pVar2 = this.f39348Z;
            if (pVar2 != null) {
                pVar2.a();
            }
        }
        return zA1;
    }

    public void Q0(Configuration configuration, L.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.d(configuration, iVar);
        } else {
            i.d(configuration, iVar.d(0));
            i.c(configuration, iVar.d(0));
        }
    }

    public boolean R() {
        return P(true);
    }

    public void R0(L.i iVar) {
        if (Build.VERSION.SDK_INT >= 24) {
            k.c(iVar);
        } else {
            Locale.setDefault(iVar.d(0));
        }
    }

    public final void S() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f39325C.findViewById(R.id.content);
        View decorView = this.f39359m.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f39357l.obtainStyledAttributes(c.j.f18169y0);
        typedArrayObtainStyledAttributes.getValue(c.j.f17967K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(c.j.f17972L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(c.j.f17957I0)) {
            typedArrayObtainStyledAttributes.getValue(c.j.f17957I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(c.j.f17962J0)) {
            typedArrayObtainStyledAttributes.getValue(c.j.f17962J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(c.j.f17947G0)) {
            typedArrayObtainStyledAttributes.getValue(c.j.f17947G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(c.j.f17952H0)) {
            typedArrayObtainStyledAttributes.getValue(c.j.f17952H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean S0() {
        ViewGroup viewGroup;
        return this.f39324B && (viewGroup = this.f39325C) != null && L.W(viewGroup);
    }

    public final void T(Window window) {
        if (this.f39359m != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof n) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        n nVar = new n(callback);
        this.f39361n = nVar;
        window.setCallback(nVar);
        d0 d0VarU = d0.u(this.f39357l, null, f39320q0);
        Drawable drawableH = d0VarU.h(0);
        if (drawableH != null) {
            window.setBackgroundDrawable(drawableH);
        }
        d0VarU.w();
        this.f39359m = window;
        if (Build.VERSION.SDK_INT < 33 || this.f39360m0 != null) {
            return;
        }
        K(null);
    }

    public final boolean T0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f39359m.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || L.V((View) viewParent)) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public L.i U(Context context) {
        L.i iVarQ;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33 || (iVarQ = AbstractC1625d.q()) == null) {
            return null;
        }
        L.i iVarQ0 = q0(context.getApplicationContext().getResources().getConfiguration());
        L.i iVarB = i9 >= 24 ? AbstractC1615B.b(iVarQ, iVarQ0) : iVarQ.f() ? L.i.e() : L.i.c(iVarQ.d(0).toString());
        return iVarB.f() ? iVarQ0 : iVarB;
    }

    public boolean U0() {
        if (this.f39360m0 == null) {
            return false;
        }
        t tVarR0 = r0(0, false);
        return (tVarR0 != null && tVarR0.f39412o) || this.f39370v != null;
    }

    public final int V() {
        int i9 = this.f39343U;
        return i9 != -100 ? i9 : AbstractC1625d.m();
    }

    public AbstractC1872b V0(AbstractC1872b.a aVar) {
        InterfaceC1623b interfaceC1623b;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        AbstractC1872b abstractC1872b = this.f39370v;
        if (abstractC1872b != null) {
            abstractC1872b.c();
        }
        h hVar = new h(aVar);
        AbstractC1622a abstractC1622aR = r();
        if (abstractC1622aR != null) {
            AbstractC1872b abstractC1872bZ = abstractC1622aR.z(hVar);
            this.f39370v = abstractC1872bZ;
            if (abstractC1872bZ != null && (interfaceC1623b = this.f39363o) != null) {
                interfaceC1623b.onSupportActionModeStarted(abstractC1872bZ);
            }
        }
        if (this.f39370v == null) {
            this.f39370v = W0(hVar);
        }
        b1();
        return this.f39370v;
    }

    public void W(int i9, t tVar, Menu menu) {
        if (menu == null) {
            if (tVar == null && i9 >= 0) {
                t[] tVarArr = this.f39336N;
                if (i9 < tVarArr.length) {
                    tVar = tVarArr[i9];
                }
            }
            if (tVar != null) {
                menu = tVar.f39407j;
            }
        }
        if ((tVar == null || tVar.f39412o) && !this.f39341S) {
            this.f39361n.d(this.f39359m.getCallback(), i9, menu);
        }
    }

    public AbstractC1872b W0(AbstractC1872b.a aVar) {
        AbstractC1872b abstractC1872bOnWindowStartingSupportActionMode;
        Context dVar;
        InterfaceC1623b interfaceC1623b;
        h0();
        AbstractC1872b abstractC1872b = this.f39370v;
        if (abstractC1872b != null) {
            abstractC1872b.c();
        }
        if (!(aVar instanceof h)) {
            aVar = new h(aVar);
        }
        InterfaceC1623b interfaceC1623b2 = this.f39363o;
        if (interfaceC1623b2 == null || this.f39341S) {
            abstractC1872bOnWindowStartingSupportActionMode = null;
        } else {
            try {
                abstractC1872bOnWindowStartingSupportActionMode = interfaceC1623b2.onWindowStartingSupportActionMode(aVar);
            } catch (AbstractMethodError unused) {
                abstractC1872bOnWindowStartingSupportActionMode = null;
            }
        }
        if (abstractC1872bOnWindowStartingSupportActionMode != null) {
            this.f39370v = abstractC1872bOnWindowStartingSupportActionMode;
        } else {
            if (this.f39371w == null) {
                if (this.f39333K) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f39357l.getTheme();
                    theme.resolveAttribute(AbstractC1238a.f17745d, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f39357l.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new i.d(this.f39357l, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f39357l;
                    }
                    this.f39371w = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, AbstractC1238a.f17747f);
                    this.f39372x = popupWindow;
                    T.h.b(popupWindow, 2);
                    this.f39372x.setContentView(this.f39371w);
                    this.f39372x.setWidth(-1);
                    dVar.getTheme().resolveAttribute(AbstractC1238a.f17743b, typedValue, true);
                    this.f39371w.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f39372x.setHeight(-2);
                    this.f39373y = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f39325C.findViewById(c.f.f17858h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m0()));
                        this.f39371w = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f39371w != null) {
                h0();
                this.f39371w.k();
                i.e eVar = new i.e(this.f39371w.getContext(), this.f39371w, aVar, this.f39372x == null);
                if (aVar.d(eVar, eVar.e())) {
                    eVar.k();
                    this.f39371w.h(eVar);
                    this.f39370v = eVar;
                    if (S0()) {
                        this.f39371w.setAlpha(0.0f);
                        S sB = L.e(this.f39371w).b(1.0f);
                        this.f39374z = sB;
                        sB.j(new C0310e());
                    } else {
                        this.f39371w.setAlpha(1.0f);
                        this.f39371w.setVisibility(0);
                        if (this.f39371w.getParent() instanceof View) {
                            L.p0((View) this.f39371w.getParent());
                        }
                    }
                    if (this.f39372x != null) {
                        this.f39359m.getDecorView().post(this.f39373y);
                    }
                } else {
                    this.f39370v = null;
                }
            }
        }
        AbstractC1872b abstractC1872b2 = this.f39370v;
        if (abstractC1872b2 != null && (interfaceC1623b = this.f39363o) != null) {
            interfaceC1623b.onSupportActionModeStarted(abstractC1872b2);
        }
        b1();
        return this.f39370v;
    }

    public void X(androidx.appcompat.view.menu.e eVar) {
        if (this.f39335M) {
            return;
        }
        this.f39335M = true;
        this.f39367s.l();
        Window.Callback callbackT0 = t0();
        if (callbackT0 != null && !this.f39341S) {
            callbackT0.onPanelClosed(108, eVar);
        }
        this.f39335M = false;
    }

    public final void X0() {
        if (this.f39324B) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Y() {
        p pVar = this.f39347Y;
        if (pVar != null) {
            pVar.a();
        }
        p pVar2 = this.f39348Z;
        if (pVar2 != null) {
            pVar2.a();
        }
    }

    public final androidx.appcompat.app.b Y0() {
        for (Context baseContext = this.f39357l; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof androidx.appcompat.app.b) {
                return (androidx.appcompat.app.b) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public void Z(int i9) {
        a0(r0(i9, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z0(Configuration configuration) {
        Activity activity = (Activity) this.f39355k;
        if (activity instanceof InterfaceC1186p) {
            if (!((InterfaceC1186p) activity).getLifecycle().b().isAtLeast(AbstractC1180j.c.CREATED)) {
                return;
            }
        } else if (!this.f39340R || this.f39341S) {
            return;
        }
        activity.onConfigurationChanged(configuration);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        t tVarK0;
        Window.Callback callbackT0 = t0();
        if (callbackT0 == null || this.f39341S || (tVarK0 = k0(eVar.D())) == null) {
            return false;
        }
        return callbackT0.onMenuItemSelected(tVarK0.f39398a, menuItem);
    }

    public void a0(t tVar, boolean z9) {
        ViewGroup viewGroup;
        k.G g9;
        if (z9 && tVar.f39398a == 0 && (g9 = this.f39367s) != null && g9.e()) {
            X(tVar.f39407j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f39357l.getSystemService("window");
        if (windowManager != null && tVar.f39412o && (viewGroup = tVar.f39404g) != null) {
            windowManager.removeView(viewGroup);
            if (z9) {
                W(tVar.f39398a, tVar, null);
            }
        }
        tVar.f39410m = false;
        tVar.f39411n = false;
        tVar.f39412o = false;
        tVar.f39405h = null;
        tVar.f39414q = true;
        if (this.f39337O == tVar) {
            this.f39337O = null;
        }
        if (tVar.f39398a == 0) {
            b1();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a1(int r9, L.i r10, boolean r11) {
        /*
            r8 = this;
            android.content.Context r1 = r8.f39357l
            r4 = 0
            r5 = 0
            r0 = r8
            r2 = r9
            r3 = r10
            android.content.res.Configuration r0 = r0.b0(r1, r2, r3, r4, r5)
            android.content.Context r1 = r8.f39357l
            int r1 = r8.n0(r1)
            android.content.res.Configuration r2 = r8.f39342T
            if (r2 != 0) goto L1f
            android.content.Context r2 = r8.f39357l
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
        L1f:
            int r3 = r2.uiMode
            r3 = r3 & 48
            int r4 = r0.uiMode
            r4 = r4 & 48
            L.i r2 = r8.q0(r2)
            r5 = 0
            if (r10 != 0) goto L30
            r0 = r5
            goto L34
        L30:
            L.i r0 = r8.q0(r0)
        L34:
            r6 = 0
            if (r3 == r4) goto L3a
            r3 = 512(0x200, float:7.17E-43)
            goto L3b
        L3a:
            r3 = 0
        L3b:
            if (r0 == 0) goto L45
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            r3 = r3 | 8196(0x2004, float:1.1485E-41)
        L45:
            int r2 = ~r1
            r2 = r2 & r3
            r7 = 1
            if (r2 == 0) goto L6f
            if (r11 == 0) goto L6f
            boolean r11 = r8.f39339Q
            if (r11 == 0) goto L6f
            boolean r11 = d.LayoutInflaterFactory2C1626e.f39321r0
            if (r11 != 0) goto L58
            boolean r11 = r8.f39340R
            if (r11 == 0) goto L6f
        L58:
            java.lang.Object r11 = r8.f39355k
            boolean r2 = r11 instanceof android.app.Activity
            if (r2 == 0) goto L6f
            android.app.Activity r11 = (android.app.Activity) r11
            boolean r11 = r11.isChild()
            if (r11 != 0) goto L6f
            java.lang.Object r11 = r8.f39355k
            android.app.Activity r11 = (android.app.Activity) r11
            D.AbstractC0519b.g(r11)
            r11 = 1
            goto L70
        L6f:
            r11 = 0
        L70:
            if (r11 != 0) goto L7d
            if (r3 == 0) goto L7d
            r11 = r3 & r1
            if (r11 != r3) goto L79
            r6 = 1
        L79:
            r8.c1(r4, r0, r6, r5)
            goto L7e
        L7d:
            r7 = r11
        L7e:
            if (r7 == 0) goto L9a
            java.lang.Object r11 = r8.f39355k
            boolean r1 = r11 instanceof androidx.appcompat.app.b
            if (r1 == 0) goto L9a
            r1 = r3 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L8f
            androidx.appcompat.app.b r11 = (androidx.appcompat.app.b) r11
            r11.m1(r9)
        L8f:
            r9 = r3 & 4
            if (r9 == 0) goto L9a
            java.lang.Object r9 = r8.f39355k
            androidx.appcompat.app.b r9 = (androidx.appcompat.app.b) r9
            r9.l1(r10)
        L9a:
            if (r7 == 0) goto Laf
            if (r0 == 0) goto Laf
            android.content.Context r9 = r8.f39357l
            android.content.res.Resources r9 = r9.getResources()
            android.content.res.Configuration r9 = r9.getConfiguration()
            L.i r9 = r8.q0(r9)
            r8.R0(r9)
        Laf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: d.LayoutInflaterFactory2C1626e.a1(int, L.i, boolean):boolean");
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        O0(true);
    }

    public final Configuration b0(Context context, int i9, L.i iVar, Configuration configuration, boolean z9) {
        int i10 = i9 != 1 ? i9 != 2 ? z9 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48 : 32 : 16;
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i10 | (configuration2.uiMode & (-49));
        if (iVar != null) {
            Q0(configuration2, iVar);
        }
        return configuration2;
    }

    public void b1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zU0 = U0();
            if (zU0 && this.f39362n0 == null) {
                this.f39362n0 = m.b(this.f39360m0, this);
            } else {
                if (zU0 || (onBackInvokedCallback = this.f39362n0) == null) {
                    return;
                }
                m.c(this.f39360m0, onBackInvokedCallback);
            }
        }
    }

    public final ViewGroup c0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f39357l.obtainStyledAttributes(c.j.f18169y0);
        if (!typedArrayObtainStyledAttributes.hasValue(c.j.f17932D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.f17977M0, false)) {
            G(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(c.j.f17932D0, false)) {
            G(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.f17937E0, false)) {
            G(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.f17942F0, false)) {
            G(10);
        }
        this.f39333K = typedArrayObtainStyledAttributes.getBoolean(c.j.f18174z0, false);
        typedArrayObtainStyledAttributes.recycle();
        j0();
        this.f39359m.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f39357l);
        if (this.f39334L) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(this.f39332J ? c.g.f17891o : c.g.f17890n, (ViewGroup) null);
        } else if (this.f39333K) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(c.g.f17882f, (ViewGroup) null);
            this.f39331I = false;
            this.f39330H = false;
        } else if (this.f39330H) {
            TypedValue typedValue = new TypedValue();
            this.f39357l.getTheme().resolveAttribute(AbstractC1238a.f17745d, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new i.d(this.f39357l, typedValue.resourceId) : this.f39357l).inflate(c.g.f17892p, (ViewGroup) null);
            k.G g9 = (k.G) viewGroup.findViewById(c.f.f17866p);
            this.f39367s = g9;
            g9.setWindowCallback(t0());
            if (this.f39331I) {
                this.f39367s.h(109);
            }
            if (this.f39328F) {
                this.f39367s.h(2);
            }
            if (this.f39329G) {
                this.f39367s.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f39330H + ", windowActionBarOverlay: " + this.f39331I + ", android:windowIsFloating: " + this.f39333K + ", windowActionModeOverlay: " + this.f39332J + ", windowNoTitle: " + this.f39334L + " }");
        }
        L.E0(viewGroup, new b());
        if (this.f39367s == null) {
            this.f39326D = (TextView) viewGroup.findViewById(c.f.f17847M);
        }
        m0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(c.f.f17852b);
        ViewGroup viewGroup2 = (ViewGroup) this.f39359m.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f39359m.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final void c1(int i9, L.i iVar, boolean z9, Configuration configuration) {
        Resources resources = this.f39357l.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i9 | (resources.getConfiguration().uiMode & (-49));
        if (iVar != null) {
            Q0(configuration2, iVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 26) {
            AbstractC1616C.a(resources);
        }
        int i11 = this.f39344V;
        if (i11 != 0) {
            this.f39357l.setTheme(i11);
            if (i10 >= 23) {
                this.f39357l.getTheme().applyStyle(this.f39344V, true);
            }
        }
        if (z9 && (this.f39355k instanceof Activity)) {
            Z0(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View d0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z9;
        C1644w c1644w;
        if (this.f39356k0 == null) {
            String string = this.f39357l.obtainStyledAttributes(c.j.f18169y0).getString(c.j.f17927C0);
            if (string == null) {
                c1644w = new C1644w();
            } else {
                try {
                    this.f39356k0 = (C1644w) this.f39357l.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    c1644w = new C1644w();
                    this.f39356k0 = c1644w;
                }
            }
            this.f39356k0 = c1644w;
        }
        boolean z10 = f39319p0;
        boolean zT0 = false;
        if (z10) {
            if (this.f39358l0 == null) {
                this.f39358l0 = new C1614A();
            }
            if (this.f39358l0.a(attributeSet)) {
                z9 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zT0 = T0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zT0 = true;
                }
                z9 = zT0;
            }
        } else {
            z9 = false;
        }
        return this.f39356k0.r(view, str, context, attributeSet, z9, z10, true, l0.c());
    }

    public final int d1(X x9, Rect rect) {
        boolean z9;
        boolean z10;
        int iK = x9 != null ? x9.k() : rect != null ? rect.top : 0;
        ActionBarContextView actionBarContextView = this.f39371w;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z9 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f39371w.getLayoutParams();
            if (this.f39371w.isShown()) {
                if (this.f39353i0 == null) {
                    this.f39353i0 = new Rect();
                    this.f39354j0 = new Rect();
                }
                Rect rect2 = this.f39353i0;
                Rect rect3 = this.f39354j0;
                if (x9 == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(x9.i(), x9.k(), x9.j(), x9.h());
                }
                m0.a(this.f39325C, rect2, rect3);
                int i9 = rect2.top;
                int i10 = rect2.left;
                int i11 = rect2.right;
                X xK = L.K(this.f39325C);
                int i12 = xK == null ? 0 : xK.i();
                int iJ = xK == null ? 0 : xK.j();
                if (marginLayoutParams.topMargin == i9 && marginLayoutParams.leftMargin == i10 && marginLayoutParams.rightMargin == i11) {
                    z10 = false;
                } else {
                    marginLayoutParams.topMargin = i9;
                    marginLayoutParams.leftMargin = i10;
                    marginLayoutParams.rightMargin = i11;
                    z10 = true;
                }
                if (i9 <= 0 || this.f39327E != null) {
                    View view = this.f39327E;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i13 = marginLayoutParams2.height;
                        int i14 = marginLayoutParams.topMargin;
                        if (i13 != i14 || marginLayoutParams2.leftMargin != i12 || marginLayoutParams2.rightMargin != iJ) {
                            marginLayoutParams2.height = i14;
                            marginLayoutParams2.leftMargin = i12;
                            marginLayoutParams2.rightMargin = iJ;
                            this.f39327E.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f39357l);
                    this.f39327E = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = i12;
                    layoutParams.rightMargin = iJ;
                    this.f39325C.addView(this.f39327E, -1, layoutParams);
                }
                View view3 = this.f39327E;
                z = view3 != null;
                if (z && view3.getVisibility() != 0) {
                    e1(this.f39327E);
                }
                if (!this.f39332J && z) {
                    iK = 0;
                }
                z9 = z;
                z = z10;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z9 = false;
            } else {
                z9 = false;
                z = false;
            }
            if (z) {
                this.f39371w.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f39327E;
        if (view4 != null) {
            view4.setVisibility(z9 ? 0 : 8);
        }
        return iK;
    }

    @Override // d.AbstractC1625d
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        i0();
        ((ViewGroup) this.f39325C.findViewById(R.id.content)).addView(view, layoutParams);
        this.f39361n.c(this.f39359m.getCallback());
    }

    public void e0() {
        androidx.appcompat.view.menu.e eVar;
        k.G g9 = this.f39367s;
        if (g9 != null) {
            g9.l();
        }
        if (this.f39372x != null) {
            this.f39359m.getDecorView().removeCallbacks(this.f39373y);
            if (this.f39372x.isShowing()) {
                try {
                    this.f39372x.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f39372x = null;
        }
        h0();
        t tVarR0 = r0(0, false);
        if (tVarR0 == null || (eVar = tVarR0.f39407j) == null) {
            return;
        }
        eVar.close();
    }

    public final void e1(View view) {
        Context context;
        int i9;
        if ((L.O(view) & Segment.SIZE) != 0) {
            context = this.f39357l;
            i9 = AbstractC1240c.f17770b;
        } else {
            context = this.f39357l;
            i9 = AbstractC1240c.f17769a;
        }
        view.setBackgroundColor(E.b.getColor(context, i9));
    }

    public boolean f0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f39355k;
        if (((obj instanceof AbstractC0975q.a) || (obj instanceof DialogC1642u)) && (decorView = this.f39359m.getDecorView()) != null && AbstractC0975q.d(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f39361n.b(this.f39359m.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? C0(keyCode, keyEvent) : F0(keyCode, keyEvent);
    }

    @Override // d.AbstractC1625d
    public Context g(Context context) {
        this.f39339Q = true;
        int iA0 = A0(context, V());
        if (AbstractC1625d.u(context)) {
            AbstractC1625d.O(context);
        }
        L.i iVarU = U(context);
        if (f39322s0 && (context instanceof ContextThemeWrapper)) {
            try {
                r.a((ContextThemeWrapper) context, b0(context, iA0, iVarU, null, false));
                return context;
            } catch (IllegalStateException unused) {
            }
        }
        if (context instanceof i.d) {
            try {
                ((i.d) context).a(b0(context, iA0, iVarU, null, false));
                return context;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f39321r0) {
            return super.g(context);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = i.a(context, configuration).getResources().getConfiguration();
        Configuration configuration3 = context.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationB0 = b0(context, iA0, iVarU, !configuration2.equals(configuration3) ? l0(configuration2, configuration3) : null, true);
        i.d dVar = new i.d(context, c.i.f17914d);
        dVar.a(configurationB0);
        try {
            if (context.getTheme() != null) {
                h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    public void g0(int i9) {
        t tVarR0;
        t tVarR02 = r0(i9, true);
        if (tVarR02.f39407j != null) {
            Bundle bundle = new Bundle();
            tVarR02.f39407j.Q(bundle);
            if (bundle.size() > 0) {
                tVarR02.f39416s = bundle;
            }
            tVarR02.f39407j.d0();
            tVarR02.f39407j.clear();
        }
        tVarR02.f39415r = true;
        tVarR02.f39414q = true;
        if ((i9 != 108 && i9 != 0) || this.f39367s == null || (tVarR0 = r0(0, false)) == null) {
            return;
        }
        tVarR0.f39410m = false;
        N0(tVarR0, null);
    }

    public void h0() {
        S s9 = this.f39374z;
        if (s9 != null) {
            s9.c();
        }
    }

    public final void i0() {
        if (this.f39324B) {
            return;
        }
        this.f39325C = c0();
        CharSequence charSequenceS0 = s0();
        if (!TextUtils.isEmpty(charSequenceS0)) {
            k.G g9 = this.f39367s;
            if (g9 != null) {
                g9.setWindowTitle(charSequenceS0);
            } else if (L0() != null) {
                L0().y(charSequenceS0);
            } else {
                TextView textView = this.f39326D;
                if (textView != null) {
                    textView.setText(charSequenceS0);
                }
            }
        }
        S();
        J0(this.f39325C);
        this.f39324B = true;
        t tVarR0 = r0(0, false);
        if (this.f39341S) {
            return;
        }
        if (tVarR0 == null || tVarR0.f39407j == null) {
            y0(108);
        }
    }

    @Override // d.AbstractC1625d
    public View j(int i9) {
        i0();
        return this.f39359m.findViewById(i9);
    }

    public final void j0() {
        if (this.f39359m == null) {
            Object obj = this.f39355k;
            if (obj instanceof Activity) {
                T(((Activity) obj).getWindow());
            }
        }
        if (this.f39359m == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public t k0(Menu menu) {
        t[] tVarArr = this.f39336N;
        int length = tVarArr != null ? tVarArr.length : 0;
        for (int i9 = 0; i9 < length; i9++) {
            t tVar = tVarArr[i9];
            if (tVar != null && tVar.f39407j == menu) {
                return tVar;
            }
        }
        return null;
    }

    @Override // d.AbstractC1625d
    public Context l() {
        return this.f39357l;
    }

    public final Context m0() {
        AbstractC1622a abstractC1622aR = r();
        Context contextK = abstractC1622aR != null ? abstractC1622aR.k() : null;
        return contextK == null ? this.f39357l : contextK;
    }

    @Override // d.AbstractC1625d
    public int n() {
        return this.f39343U;
    }

    public final int n0(Context context) {
        if (!this.f39346X && (this.f39355k instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                int i9 = Build.VERSION.SDK_INT;
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f39355k.getClass()), i9 >= 29 ? 269221888 : i9 >= 24 ? 786432 : 0);
                if (activityInfo != null) {
                    this.f39345W = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e9) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e9);
                this.f39345W = 0;
            }
        }
        this.f39346X = true;
        return this.f39345W;
    }

    public final p o0(Context context) {
        if (this.f39348Z == null) {
            this.f39348Z = new o(context);
        }
        return this.f39348Z;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return d0(view, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // d.AbstractC1625d
    public MenuInflater p() {
        if (this.f39365q == null) {
            u0();
            AbstractC1622a abstractC1622a = this.f39364p;
            this.f39365q = new i.g(abstractC1622a != null ? abstractC1622a.k() : this.f39357l);
        }
        return this.f39365q;
    }

    public final p p0(Context context) {
        if (this.f39347Y == null) {
            this.f39347Y = new q(C1620G.a(context));
        }
        return this.f39347Y;
    }

    public L.i q0(Configuration configuration) {
        return Build.VERSION.SDK_INT >= 24 ? k.b(configuration) : L.i.c(j.b(configuration.locale));
    }

    @Override // d.AbstractC1625d
    public AbstractC1622a r() {
        u0();
        return this.f39364p;
    }

    public t r0(int i9, boolean z9) {
        t[] tVarArr = this.f39336N;
        if (tVarArr == null || tVarArr.length <= i9) {
            t[] tVarArr2 = new t[i9 + 1];
            if (tVarArr != null) {
                System.arraycopy(tVarArr, 0, tVarArr2, 0, tVarArr.length);
            }
            this.f39336N = tVarArr2;
            tVarArr = tVarArr2;
        }
        t tVar = tVarArr[i9];
        if (tVar != null) {
            return tVar;
        }
        t tVar2 = new t(i9);
        tVarArr[i9] = tVar2;
        return tVar2;
    }

    @Override // d.AbstractC1625d
    public void s() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f39357l);
        if (layoutInflaterFrom.getFactory() == null) {
            P.r.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof LayoutInflaterFactory2C1626e) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final CharSequence s0() {
        Object obj = this.f39355k;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f39366r;
    }

    @Override // d.AbstractC1625d
    public void t() {
        if (L0() == null || r().m()) {
            return;
        }
        y0(0);
    }

    public final Window.Callback t0() {
        return this.f39359m.getCallback();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u0() {
        /*
            r3 = this;
            r3.i0()
            boolean r0 = r3.f39330H
            if (r0 == 0) goto L37
            d.a r0 = r3.f39364p
            if (r0 == 0) goto Lc
            goto L37
        Lc:
            java.lang.Object r0 = r3.f39355k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L20
            d.H r0 = new d.H
            java.lang.Object r1 = r3.f39355k
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r2 = r3.f39331I
            r0.<init>(r1, r2)
        L1d:
            r3.f39364p = r0
            goto L2e
        L20:
            boolean r0 = r0 instanceof android.app.Dialog
            if (r0 == 0) goto L2e
            d.H r0 = new d.H
            java.lang.Object r1 = r3.f39355k
            android.app.Dialog r1 = (android.app.Dialog) r1
            r0.<init>(r1)
            goto L1d
        L2e:
            d.a r0 = r3.f39364p
            if (r0 == 0) goto L37
            boolean r1 = r3.f39352h0
            r0.s(r1)
        L37:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.LayoutInflaterFactory2C1626e.u0():void");
    }

    public final boolean v0(t tVar) {
        View view = tVar.f39406i;
        if (view != null) {
            tVar.f39405h = view;
            return true;
        }
        if (tVar.f39407j == null) {
            return false;
        }
        if (this.f39369u == null) {
            this.f39369u = new u();
        }
        View view2 = (View) tVar.a(this.f39369u);
        tVar.f39405h = view2;
        return view2 != null;
    }

    @Override // d.AbstractC1625d
    public void w(Configuration configuration) {
        AbstractC1622a abstractC1622aR;
        if (this.f39330H && this.f39324B && (abstractC1622aR = r()) != null) {
            abstractC1622aR.n(configuration);
        }
        C2114i.b().g(this.f39357l);
        this.f39342T = new Configuration(this.f39357l.getResources().getConfiguration());
        Q(false, false);
    }

    public final boolean w0(t tVar) {
        tVar.d(m0());
        tVar.f39404g = new s(tVar.f39409l);
        tVar.f39400c = 81;
        return true;
    }

    @Override // d.AbstractC1625d
    public void x(Bundle bundle) {
        String strC;
        this.f39339Q = true;
        P(false);
        j0();
        Object obj = this.f39355k;
        if (obj instanceof Activity) {
            try {
                strC = AbstractC0527j.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                AbstractC1622a abstractC1622aL0 = L0();
                if (abstractC1622aL0 == null) {
                    this.f39352h0 = true;
                } else {
                    abstractC1622aL0.s(true);
                }
            }
            AbstractC1625d.d(this);
        }
        this.f39342T = new Configuration(this.f39357l.getResources().getConfiguration());
        this.f39340R = true;
    }

    public final boolean x0(t tVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f39357l;
        int i9 = tVar.f39398a;
        if ((i9 == 0 || i9 == 108) && this.f39367s != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(AbstractC1238a.f17745d, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(AbstractC1238a.f17746e, typedValue, true);
            } else {
                theme.resolveAttribute(AbstractC1238a.f17746e, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                i.d dVar = new i.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.R(this);
        tVar.c(eVar);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // d.AbstractC1625d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void y() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f39355k
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L9
            d.AbstractC1625d.E(r3)
        L9:
            boolean r0 = r3.f39349e0
            if (r0 == 0) goto L18
            android.view.Window r0 = r3.f39359m
            android.view.View r0 = r0.getDecorView()
            java.lang.Runnable r1 = r3.f39351g0
            r0.removeCallbacks(r1)
        L18:
            r0 = 1
            r3.f39341S = r0
            int r0 = r3.f39343U
            r1 = -100
            if (r0 == r1) goto L45
            java.lang.Object r0 = r3.f39355k
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L45
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L45
            s.i r0 = d.LayoutInflaterFactory2C1626e.f39318o0
            java.lang.Object r1 = r3.f39355k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.f39343U
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L54
        L45:
            s.i r0 = d.LayoutInflaterFactory2C1626e.f39318o0
            java.lang.Object r1 = r3.f39355k
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L54:
            d.a r0 = r3.f39364p
            if (r0 == 0) goto L5b
            r0.o()
        L5b:
            r3.Y()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: d.LayoutInflaterFactory2C1626e.y():void");
    }

    public final void y0(int i9) {
        this.f39350f0 = (1 << i9) | this.f39350f0;
        if (this.f39349e0) {
            return;
        }
        L.k0(this.f39359m.getDecorView(), this.f39351g0);
        this.f39349e0 = true;
    }

    @Override // d.AbstractC1625d
    public void z(Bundle bundle) {
        i0();
    }

    public boolean z0() {
        return this.f39323A;
    }
}
