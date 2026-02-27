package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import i.AbstractC1872b;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class f extends ActionMode {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f41725a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC1872b f41726b;

    public static class a implements AbstractC1872b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ActionMode.Callback f41727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f41728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f41729c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final s.i f41730d = new s.i();

        public a(Context context, ActionMode.Callback callback) {
            this.f41728b = context;
            this.f41727a = callback;
        }

        @Override // i.AbstractC1872b.a
        public boolean a(AbstractC1872b abstractC1872b, MenuItem menuItem) {
            return this.f41727a.onActionItemClicked(e(abstractC1872b), new j.c(this.f41728b, (I.b) menuItem));
        }

        @Override // i.AbstractC1872b.a
        public void b(AbstractC1872b abstractC1872b) {
            this.f41727a.onDestroyActionMode(e(abstractC1872b));
        }

        @Override // i.AbstractC1872b.a
        public boolean c(AbstractC1872b abstractC1872b, Menu menu) {
            return this.f41727a.onPrepareActionMode(e(abstractC1872b), f(menu));
        }

        @Override // i.AbstractC1872b.a
        public boolean d(AbstractC1872b abstractC1872b, Menu menu) {
            return this.f41727a.onCreateActionMode(e(abstractC1872b), f(menu));
        }

        public ActionMode e(AbstractC1872b abstractC1872b) {
            int size = this.f41729c.size();
            for (int i9 = 0; i9 < size; i9++) {
                f fVar = (f) this.f41729c.get(i9);
                if (fVar != null && fVar.f41726b == abstractC1872b) {
                    return fVar;
                }
            }
            f fVar2 = new f(this.f41728b, abstractC1872b);
            this.f41729c.add(fVar2);
            return fVar2;
        }

        public final Menu f(Menu menu) {
            Menu menu2 = (Menu) this.f41730d.get(menu);
            if (menu2 != null) {
                return menu2;
            }
            j.e eVar = new j.e(this.f41728b, (I.a) menu);
            this.f41730d.put(menu, eVar);
            return eVar;
        }
    }

    public f(Context context, AbstractC1872b abstractC1872b) {
        this.f41725a = context;
        this.f41726b = abstractC1872b;
    }

    @Override // android.view.ActionMode
    public void finish() {
        this.f41726b.c();
    }

    @Override // android.view.ActionMode
    public View getCustomView() {
        return this.f41726b.d();
    }

    @Override // android.view.ActionMode
    public Menu getMenu() {
        return new j.e(this.f41725a, (I.a) this.f41726b.e());
    }

    @Override // android.view.ActionMode
    public MenuInflater getMenuInflater() {
        return this.f41726b.f();
    }

    @Override // android.view.ActionMode
    public CharSequence getSubtitle() {
        return this.f41726b.g();
    }

    @Override // android.view.ActionMode
    public Object getTag() {
        return this.f41726b.h();
    }

    @Override // android.view.ActionMode
    public CharSequence getTitle() {
        return this.f41726b.i();
    }

    @Override // android.view.ActionMode
    public boolean getTitleOptionalHint() {
        return this.f41726b.j();
    }

    @Override // android.view.ActionMode
    public void invalidate() {
        this.f41726b.k();
    }

    @Override // android.view.ActionMode
    public boolean isTitleOptional() {
        return this.f41726b.l();
    }

    @Override // android.view.ActionMode
    public void setCustomView(View view) {
        this.f41726b.m(view);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(int i9) {
        this.f41726b.n(i9);
    }

    @Override // android.view.ActionMode
    public void setSubtitle(CharSequence charSequence) {
        this.f41726b.o(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTag(Object obj) {
        this.f41726b.p(obj);
    }

    @Override // android.view.ActionMode
    public void setTitle(int i9) {
        this.f41726b.q(i9);
    }

    @Override // android.view.ActionMode
    public void setTitle(CharSequence charSequence) {
        this.f41726b.r(charSequence);
    }

    @Override // android.view.ActionMode
    public void setTitleOptionalHint(boolean z9) {
        this.f41726b.s(z9);
    }
}
