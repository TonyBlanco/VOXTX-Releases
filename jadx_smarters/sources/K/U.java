package k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.e;
import c.AbstractC1238a;

/* JADX INFO: loaded from: classes.dex */
public class U {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f43226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.appcompat.view.menu.e f43227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final View f43228c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.appcompat.view.menu.h f43229d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public d f43230e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f43231f;

    public class a implements e.a {
        public a() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            d dVar = U.this.f43230e;
            if (dVar != null) {
                return dVar.onMenuItemClick(menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
        }
    }

    public class b implements PopupWindow.OnDismissListener {
        public b() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            U u9 = U.this;
            c cVar = u9.f43231f;
            if (cVar != null) {
                cVar.a(u9);
            }
        }
    }

    public interface c {
        void a(U u9);
    }

    public interface d {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public U(Context context, View view) {
        this(context, view, 0);
    }

    public U(Context context, View view, int i9) {
        this(context, view, i9, AbstractC1238a.f17731H, 0);
    }

    public U(Context context, View view, int i9, int i10, int i11) {
        this.f43226a = context;
        this.f43228c = view;
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        this.f43227b = eVar;
        eVar.R(new a());
        androidx.appcompat.view.menu.h hVar = new androidx.appcompat.view.menu.h(context, eVar, view, false, i10, i11);
        this.f43229d = hVar;
        hVar.h(i9);
        hVar.i(new b());
    }

    public void a() {
        this.f43229d.b();
    }

    public Menu b() {
        return this.f43227b;
    }

    public MenuInflater c() {
        return new i.g(this.f43226a);
    }

    public void d(int i9) {
        c().inflate(i9, this.f43227b);
    }

    public void e(c cVar) {
        this.f43231f = cVar;
    }

    public void f(d dVar) {
        this.f43230e = dVar;
    }

    public void g() {
        this.f43229d.k();
    }
}
