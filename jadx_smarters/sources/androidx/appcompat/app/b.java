package androidx.appcompat.app;

import D.AbstractC0519b;
import D.AbstractC0527j;
import D.P;
import F0.c;
import F0.f;
import L.i;
import a.InterfaceC1072b;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.activity.n;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.AbstractActivityC1145e;
import androidx.lifecycle.O;
import d.AbstractC1622a;
import d.AbstractC1625d;
import d.InterfaceC1623b;
import i.AbstractC1872b;
import k.l0;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends AbstractActivityC1145e implements InterfaceC1623b, P.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC1625d f13675a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Resources f13676c;

    public class a implements c.InterfaceC0023c {
        public a() {
        }

        @Override // F0.c.InterfaceC0023c
        public Bundle a() {
            Bundle bundle = new Bundle();
            b.this.h1().B(bundle);
            return bundle;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.b$b, reason: collision with other inner class name */
    public class C0159b implements InterfaceC1072b {
        public C0159b() {
        }

        @Override // a.InterfaceC1072b
        public void a(Context context) {
            AbstractC1625d abstractC1625dH1 = b.this.h1();
            abstractC1625dH1.s();
            abstractC1625dH1.x(b.this.getSavedStateRegistry().b("androidx:appcompat"));
        }
    }

    public b() {
        j1();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c1();
        h1().e(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        super.attachBaseContext(h1().g(context));
    }

    public final void c1() {
        O.a(getWindow().getDecorView(), this);
        androidx.lifecycle.P.a(getWindow().getDecorView(), this);
        f.a(getWindow().getDecorView(), this);
        n.a(getWindow().getDecorView(), this);
    }

    @Override // android.app.Activity
    public void closeOptionsMenu() {
        AbstractC1622a abstractC1622aI1 = i1();
        if (getWindow().hasFeature(0)) {
            if (abstractC1622aI1 == null || !abstractC1622aI1.g()) {
                super.closeOptionsMenu();
            }
        }
    }

    @Override // D.AbstractActivityC0525h, android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        AbstractC1622a abstractC1622aI1 = i1();
        if (keyCode == 82 && abstractC1622aI1 != null && abstractC1622aI1.q(keyEvent)) {
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.app.Activity
    public View findViewById(int i9) {
        return h1().j(i9);
    }

    @Override // android.app.Activity
    public MenuInflater getMenuInflater() {
        return h1().p();
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        if (this.f13676c == null && l0.c()) {
            this.f13676c = new l0(this, super.getResources());
        }
        Resources resources = this.f13676c;
        return resources == null ? super.getResources() : resources;
    }

    public AbstractC1625d h1() {
        if (this.f13675a == null) {
            this.f13675a = AbstractC1625d.h(this, this);
        }
        return this.f13675a;
    }

    public AbstractC1622a i1() {
        return h1().r();
    }

    @Override // android.app.Activity
    public void invalidateOptionsMenu() {
        h1().t();
    }

    public final void j1() {
        getSavedStateRegistry().h("androidx:appcompat", new a());
        addOnContextAvailableListener(new C0159b());
    }

    public void k1(P p9) {
        p9.c(this);
    }

    public void l1(i iVar) {
    }

    public void m1(int i9) {
    }

    public void n1(P p9) {
    }

    public void o1() {
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        h1().w(configuration);
        if (this.f13676c != null) {
            this.f13676c.updateConfiguration(super.getResources().getConfiguration(), super.getResources().getDisplayMetrics());
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onContentChanged() {
        o1();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        h1().y();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i9, KeyEvent keyEvent) {
        if (q1(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i9, keyEvent);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i9, MenuItem menuItem) {
        if (super.onMenuItemSelected(i9, menuItem)) {
            return true;
        }
        AbstractC1622a abstractC1622aI1 = i1();
        if (menuItem.getItemId() != 16908332 || abstractC1622aI1 == null || (abstractC1622aI1.j() & 4) == 0) {
            return false;
        }
        return p1();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuOpened(int i9, Menu menu) {
        return super.onMenuOpened(i9, menu);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, androidx.activity.ComponentActivity, android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int i9, Menu menu) {
        super.onPanelClosed(i9, menu);
    }

    @Override // android.app.Activity
    public void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        h1().z(bundle);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onPostResume() {
        super.onPostResume();
        h1().A();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStart() {
        super.onStart();
        h1().C();
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e, android.app.Activity
    public void onStop() {
        super.onStop();
        h1().D();
    }

    @Override // d.InterfaceC1623b
    public void onSupportActionModeFinished(AbstractC1872b abstractC1872b) {
    }

    @Override // d.InterfaceC1623b
    public void onSupportActionModeStarted(AbstractC1872b abstractC1872b) {
    }

    @Override // android.app.Activity
    public void onTitleChanged(CharSequence charSequence, int i9) {
        super.onTitleChanged(charSequence, i9);
        h1().N(charSequence);
    }

    @Override // d.InterfaceC1623b
    public AbstractC1872b onWindowStartingSupportActionMode(AbstractC1872b.a aVar) {
        return null;
    }

    @Override // android.app.Activity
    public void openOptionsMenu() {
        AbstractC1622a abstractC1622aI1 = i1();
        if (getWindow().hasFeature(0)) {
            if (abstractC1622aI1 == null || !abstractC1622aI1.r()) {
                super.openOptionsMenu();
            }
        }
    }

    public boolean p1() {
        Intent intentV = v();
        if (intentV == null) {
            return false;
        }
        if (!t1(intentV)) {
            s1(intentV);
            return true;
        }
        P pE = P.e(this);
        k1(pE);
        n1(pE);
        pE.n();
        try {
            AbstractC0519b.b(this);
            return true;
        } catch (IllegalStateException unused) {
            finish();
            return true;
        }
    }

    public final boolean q1(KeyEvent keyEvent) {
        Window window;
        return (Build.VERSION.SDK_INT >= 26 || keyEvent.isCtrlPressed() || KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) || keyEvent.getRepeatCount() != 0 || KeyEvent.isModifierKey(keyEvent.getKeyCode()) || (window = getWindow()) == null || window.getDecorView() == null || !window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) ? false : true;
    }

    public void r1(Toolbar toolbar) {
        h1().L(toolbar);
    }

    public void s1(Intent intent) {
        AbstractC0527j.e(this, intent);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(int i9) {
        c1();
        h1().H(i9);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view) {
        c1();
        h1().I(view);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        c1();
        h1().J(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public void setTheme(int i9) {
        super.setTheme(i9);
        h1().M(i9);
    }

    @Override // androidx.fragment.app.AbstractActivityC1145e
    public void supportInvalidateOptionsMenu() {
        h1().t();
    }

    public boolean t1(Intent intent) {
        return AbstractC0527j.f(this, intent);
    }

    @Override // D.P.b
    public Intent v() {
        return AbstractC0527j.a(this);
    }
}
