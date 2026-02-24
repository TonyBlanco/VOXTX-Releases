package j;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import s.i;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f42835a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public i f42836b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public i f42837c;

    public b(Context context) {
        this.f42835a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof I.b)) {
            return menuItem;
        }
        I.b bVar = (I.b) menuItem;
        if (this.f42836b == null) {
            this.f42836b = new i();
        }
        MenuItem menuItem2 = (MenuItem) this.f42836b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f42835a, bVar);
        this.f42836b.put(bVar, cVar);
        return cVar;
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }

    public final void e() {
        i iVar = this.f42836b;
        if (iVar != null) {
            iVar.clear();
        }
        i iVar2 = this.f42837c;
        if (iVar2 != null) {
            iVar2.clear();
        }
    }

    public final void f(int i9) {
        if (this.f42836b == null) {
            return;
        }
        int i10 = 0;
        while (i10 < this.f42836b.size()) {
            if (((I.b) this.f42836b.j(i10)).getGroupId() == i9) {
                this.f42836b.m(i10);
                i10--;
            }
            i10++;
        }
    }

    public final void g(int i9) {
        if (this.f42836b == null) {
            return;
        }
        for (int i10 = 0; i10 < this.f42836b.size(); i10++) {
            if (((I.b) this.f42836b.j(i10)).getItemId() == i9) {
                this.f42836b.m(i10);
                return;
            }
        }
    }
}
