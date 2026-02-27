package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.e;

/* JADX INFO: loaded from: classes.dex */
public class l extends e implements SubMenu {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f13874B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g f13875C;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f13874B = eVar;
        this.f13875C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e D() {
        return this.f13874B.D();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean F() {
        return this.f13874B.F();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean G() {
        return this.f13874B.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.f13874B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public void R(e.a aVar) {
        this.f13874B.R(aVar);
    }

    public Menu e0() {
        return this.f13874B;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f13874B.f(gVar);
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f13875C;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f13874B.h(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean k(g gVar) {
        return this.f13874B.k(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z9) {
        this.f13874B.setGroupDividerEnabled(z9);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i9) {
        return (SubMenu) super.U(i9);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.V(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i9) {
        return (SubMenu) super.X(i9);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Y(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.Z(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i9) {
        this.f13875C.setIcon(i9);
        return this;
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f13875C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f13874B.setQwertyMode(z9);
    }

    @Override // androidx.appcompat.view.menu.e
    public String t() {
        g gVar = this.f13875C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + ":" + itemId;
    }
}
