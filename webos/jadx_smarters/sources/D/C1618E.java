package d;

import P.L;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.Toolbar;
import d.LayoutInflaterFactory2C1626e;
import java.util.ArrayList;

/* JADX INFO: renamed from: d.E, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1618E extends AbstractC1622a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k.H f39243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f39244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LayoutInflaterFactory2C1626e.f f39245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f39246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f39249g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Runnable f39250h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Toolbar.h f39251i;

    /* JADX INFO: renamed from: d.E$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C1618E.this.B();
        }
    }

    /* JADX INFO: renamed from: d.E$b */
    public class b implements Toolbar.h {
        public b() {
        }

        @Override // androidx.appcompat.widget.Toolbar.h
        public boolean onMenuItemClick(MenuItem menuItem) {
            return C1618E.this.f39244b.onMenuItemSelected(0, menuItem);
        }
    }

    /* JADX INFO: renamed from: d.E$c */
    public final class c implements i.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f39254a;

        public c() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z9) {
            if (this.f39254a) {
                return;
            }
            this.f39254a = true;
            C1618E.this.f39243a.r();
            C1618E.this.f39244b.onPanelClosed(108, eVar);
            this.f39254a = false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            C1618E.this.f39244b.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: d.E$d */
    public final class d implements e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (C1618E.this.f39243a.e()) {
                C1618E.this.f39244b.onPanelClosed(108, eVar);
            } else if (C1618E.this.f39244b.onPreparePanel(0, null, eVar)) {
                C1618E.this.f39244b.onMenuOpened(108, eVar);
            }
        }
    }

    /* JADX INFO: renamed from: d.E$e */
    public class e implements LayoutInflaterFactory2C1626e.f {
        public e() {
        }

        @Override // d.LayoutInflaterFactory2C1626e.f
        public boolean a(int i9) {
            if (i9 != 0) {
                return false;
            }
            C1618E c1618e = C1618E.this;
            if (c1618e.f39246d) {
                return false;
            }
            c1618e.f39243a.f();
            C1618E.this.f39246d = true;
            return false;
        }

        @Override // d.LayoutInflaterFactory2C1626e.f
        public View onCreatePanelView(int i9) {
            if (i9 == 0) {
                return new View(C1618E.this.f39243a.getContext());
            }
            return null;
        }
    }

    public C1618E(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        b bVar = new b();
        this.f39251i = bVar;
        O.h.f(toolbar);
        androidx.appcompat.widget.d dVar = new androidx.appcompat.widget.d(toolbar, false);
        this.f39243a = dVar;
        this.f39244b = (Window.Callback) O.h.f(callback);
        dVar.setWindowCallback(callback);
        toolbar.setOnMenuItemClickListener(bVar);
        dVar.setWindowTitle(charSequence);
        this.f39245c = new e();
    }

    public final Menu A() {
        if (!this.f39247e) {
            this.f39243a.v(new c(), new d());
            this.f39247e = true;
        }
        return this.f39243a.k();
    }

    public void B() {
        Menu menuA = A();
        androidx.appcompat.view.menu.e eVar = menuA instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menuA : null;
        if (eVar != null) {
            eVar.d0();
        }
        try {
            menuA.clear();
            if (!this.f39244b.onCreatePanelMenu(0, menuA) || !this.f39244b.onPreparePanel(0, null, menuA)) {
                menuA.clear();
            }
            if (eVar != null) {
                eVar.c0();
            }
        } catch (Throwable th) {
            if (eVar != null) {
                eVar.c0();
            }
            throw th;
        }
    }

    public void C(int i9, int i10) {
        this.f39243a.i((i9 & i10) | ((~i10) & this.f39243a.x()));
    }

    @Override // d.AbstractC1622a
    public boolean g() {
        return this.f39243a.b();
    }

    @Override // d.AbstractC1622a
    public boolean h() {
        if (!this.f39243a.h()) {
            return false;
        }
        this.f39243a.collapseActionView();
        return true;
    }

    @Override // d.AbstractC1622a
    public void i(boolean z9) {
        if (z9 == this.f39248f) {
            return;
        }
        this.f39248f = z9;
        if (this.f39249g.size() <= 0) {
            return;
        }
        AbstractC1617D.a(this.f39249g.get(0));
        throw null;
    }

    @Override // d.AbstractC1622a
    public int j() {
        return this.f39243a.x();
    }

    @Override // d.AbstractC1622a
    public Context k() {
        return this.f39243a.getContext();
    }

    @Override // d.AbstractC1622a
    public void l() {
        this.f39243a.w(8);
    }

    @Override // d.AbstractC1622a
    public boolean m() {
        this.f39243a.n().removeCallbacks(this.f39250h);
        L.k0(this.f39243a.n(), this.f39250h);
        return true;
    }

    @Override // d.AbstractC1622a
    public void n(Configuration configuration) {
        super.n(configuration);
    }

    @Override // d.AbstractC1622a
    public void o() {
        this.f39243a.n().removeCallbacks(this.f39250h);
    }

    @Override // d.AbstractC1622a
    public boolean p(int i9, KeyEvent keyEvent) {
        Menu menuA = A();
        if (menuA == null) {
            return false;
        }
        menuA.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuA.performShortcut(i9, keyEvent, 0);
    }

    @Override // d.AbstractC1622a
    public boolean q(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            r();
        }
        return true;
    }

    @Override // d.AbstractC1622a
    public boolean r() {
        return this.f39243a.c();
    }

    @Override // d.AbstractC1622a
    public void s(boolean z9) {
    }

    @Override // d.AbstractC1622a
    public void t(boolean z9) {
        C(z9 ? 4 : 0, 4);
    }

    @Override // d.AbstractC1622a
    public void u(int i9) {
        this.f39243a.u(i9);
    }

    @Override // d.AbstractC1622a
    public void v(boolean z9) {
    }

    @Override // d.AbstractC1622a
    public void w(CharSequence charSequence) {
        this.f39243a.j(charSequence);
    }

    @Override // d.AbstractC1622a
    public void x(CharSequence charSequence) {
        this.f39243a.setTitle(charSequence);
    }

    @Override // d.AbstractC1622a
    public void y(CharSequence charSequence) {
        this.f39243a.setWindowTitle(charSequence);
    }
}
