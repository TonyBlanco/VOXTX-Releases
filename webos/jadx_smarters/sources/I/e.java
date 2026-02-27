package i;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContextView;
import i.AbstractC1872b;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public class e extends AbstractC1872b implements e.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Context f41718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContextView f41719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public AbstractC1872b.a f41720f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public WeakReference f41721g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f41722h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f41723i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f41724j;

    public e(Context context, ActionBarContextView actionBarContextView, AbstractC1872b.a aVar, boolean z9) {
        this.f41718d = context;
        this.f41719e = actionBarContextView;
        this.f41720f = aVar;
        androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(actionBarContextView.getContext()).S(1);
        this.f41724j = eVarS;
        eVarS.R(this);
        this.f41723i = z9;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        return this.f41720f.a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        k();
        this.f41719e.l();
    }

    @Override // i.AbstractC1872b
    public void c() {
        if (this.f41722h) {
            return;
        }
        this.f41722h = true;
        this.f41720f.b(this);
    }

    @Override // i.AbstractC1872b
    public View d() {
        WeakReference weakReference = this.f41721g;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // i.AbstractC1872b
    public Menu e() {
        return this.f41724j;
    }

    @Override // i.AbstractC1872b
    public MenuInflater f() {
        return new g(this.f41719e.getContext());
    }

    @Override // i.AbstractC1872b
    public CharSequence g() {
        return this.f41719e.getSubtitle();
    }

    @Override // i.AbstractC1872b
    public CharSequence i() {
        return this.f41719e.getTitle();
    }

    @Override // i.AbstractC1872b
    public void k() {
        this.f41720f.c(this, this.f41724j);
    }

    @Override // i.AbstractC1872b
    public boolean l() {
        return this.f41719e.j();
    }

    @Override // i.AbstractC1872b
    public void m(View view) {
        this.f41719e.setCustomView(view);
        this.f41721g = view != null ? new WeakReference(view) : null;
    }

    @Override // i.AbstractC1872b
    public void n(int i9) {
        o(this.f41718d.getString(i9));
    }

    @Override // i.AbstractC1872b
    public void o(CharSequence charSequence) {
        this.f41719e.setSubtitle(charSequence);
    }

    @Override // i.AbstractC1872b
    public void q(int i9) {
        r(this.f41718d.getString(i9));
    }

    @Override // i.AbstractC1872b
    public void r(CharSequence charSequence) {
        this.f41719e.setTitle(charSequence);
    }

    @Override // i.AbstractC1872b
    public void s(boolean z9) {
        super.s(z9);
        this.f41719e.setTitleOptional(z9);
    }
}
