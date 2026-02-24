package androidx.appcompat.view.menu;

import P.AbstractC0960b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.j;
import e.AbstractC1726a;

/* JADX INFO: loaded from: classes.dex */
public final class g implements I.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f13806A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AbstractC0960b f13807B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f13808C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f13810E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13813c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13814d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f13815e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f13816f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f13817g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f13818h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f13820j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f13822l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f13824n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f13825o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f13826p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f13827q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f13828r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f13829s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13836z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13819i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13821k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13823m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f13830t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f13831u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13832v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13833w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13834x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13835y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13809D = false;

    public class a implements AbstractC0960b.InterfaceC0079b {
        public a() {
        }

        @Override // P.AbstractC0960b.InterfaceC0079b
        public void onActionProviderVisibilityChanged(boolean z9) {
            g gVar = g.this;
            gVar.f13824n.J(gVar);
        }
    }

    public g(e eVar, int i9, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f13824n = eVar;
        this.f13811a = i10;
        this.f13812b = i9;
        this.f13813c = i11;
        this.f13814d = i12;
        this.f13815e = charSequence;
        this.f13836z = i13;
    }

    public static void d(StringBuilder sb, int i9, int i10, String str) {
        if ((i9 & i10) == i10) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.f13824n.H() && g() != 0;
    }

    public boolean B() {
        return (this.f13836z & 4) == 4;
    }

    @Override // I.b
    public I.b a(AbstractC0960b abstractC0960b) {
        AbstractC0960b abstractC0960b2 = this.f13807B;
        if (abstractC0960b2 != null) {
            abstractC0960b2.j();
        }
        this.f13806A = null;
        this.f13807B = abstractC0960b;
        this.f13824n.K(true);
        AbstractC0960b abstractC0960b3 = this.f13807B;
        if (abstractC0960b3 != null) {
            abstractC0960b3.l(new a());
        }
        return this;
    }

    @Override // I.b
    public AbstractC0960b b() {
        return this.f13807B;
    }

    public void c() {
        this.f13824n.I(this);
    }

    @Override // I.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f13836z & 8) == 0) {
            return false;
        }
        if (this.f13806A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13808C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f13824n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f13834x && (this.f13832v || this.f13833w)) {
            drawable = H.a.r(drawable).mutate();
            if (this.f13832v) {
                H.a.o(drawable, this.f13830t);
            }
            if (this.f13833w) {
                H.a.p(drawable, this.f13831u);
            }
            this.f13834x = false;
        }
        return drawable;
    }

    @Override // I.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13808C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f13824n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f13814d;
    }

    public char g() {
        return this.f13824n.G() ? this.f13820j : this.f13818h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // I.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f13806A;
        if (view != null) {
            return view;
        }
        AbstractC0960b abstractC0960b = this.f13807B;
        if (abstractC0960b == null) {
            return null;
        }
        View viewE = abstractC0960b.e(this);
        this.f13806A = viewE;
        return viewE;
    }

    @Override // I.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f13821k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f13820j;
    }

    @Override // I.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f13828r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f13812b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f13822l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f13823m == 0) {
            return null;
        }
        Drawable drawableB = AbstractC1726a.b(this.f13824n.u(), this.f13823m);
        this.f13823m = 0;
        this.f13822l = drawableB;
        return e(drawableB);
    }

    @Override // I.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f13830t;
    }

    @Override // I.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f13831u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f13817g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f13811a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f13810E;
    }

    @Override // I.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f13819i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f13818h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f13813c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f13825o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f13815e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13816f;
        return charSequence != null ? charSequence : this.f13815e;
    }

    @Override // I.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f13829s;
    }

    public String h() {
        int i9;
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f13824n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f13824n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(c.h.f17909m));
        }
        int i10 = this.f13824n.G() ? this.f13821k : this.f13819i;
        d(sb, i10, 65536, resources.getString(c.h.f17905i));
        d(sb, i10, 4096, resources.getString(c.h.f17901e));
        d(sb, i10, 2, resources.getString(c.h.f17900d));
        d(sb, i10, 1, resources.getString(c.h.f17906j));
        d(sb, i10, 4, resources.getString(c.h.f17908l));
        d(sb, i10, 8, resources.getString(c.h.f17904h));
        if (cG == '\b') {
            i9 = c.h.f17902f;
        } else if (cG == '\n') {
            i9 = c.h.f17903g;
        } else {
            if (cG != ' ') {
                sb.append(cG);
                return sb.toString();
            }
            i9 = c.h.f17907k;
        }
        sb.append(resources.getString(i9));
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f13825o != null;
    }

    public CharSequence i(j.a aVar) {
        return (aVar == null || !aVar.e()) ? getTitle() : getTitleCondensed();
    }

    @Override // I.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f13809D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f13835y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f13835y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f13835y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC0960b abstractC0960b = this.f13807B;
        return (abstractC0960b == null || !abstractC0960b.h()) ? (this.f13835y & 8) == 0 : (this.f13835y & 8) == 0 && this.f13807B.c();
    }

    public boolean j() {
        AbstractC0960b abstractC0960b;
        if ((this.f13836z & 8) == 0) {
            return false;
        }
        if (this.f13806A == null && (abstractC0960b = this.f13807B) != null) {
            this.f13806A = abstractC0960b.e(this);
        }
        return this.f13806A != null;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f13827q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f13824n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f13826p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f13817g != null) {
            try {
                this.f13824n.u().startActivity(this.f13817g);
                return true;
            } catch (ActivityNotFoundException e9) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e9);
            }
        }
        AbstractC0960b abstractC0960b = this.f13807B;
        return abstractC0960b != null && abstractC0960b.f();
    }

    public boolean l() {
        return (this.f13835y & 32) == 32;
    }

    public boolean m() {
        return (this.f13835y & 4) != 0;
    }

    public boolean n() {
        return (this.f13836z & 1) == 1;
    }

    public boolean o() {
        return (this.f13836z & 2) == 2;
    }

    @Override // I.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public I.b setActionView(int i9) {
        Context contextU = this.f13824n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i9, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // I.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public I.b setActionView(View view) {
        int i9;
        this.f13806A = view;
        this.f13807B = null;
        if (view != null && view.getId() == -1 && (i9 = this.f13811a) > 0) {
            view.setId(i9);
        }
        this.f13824n.I(this);
        return this;
    }

    public void r(boolean z9) {
        this.f13809D = z9;
        this.f13824n.K(false);
    }

    public void s(boolean z9) {
        int i9 = this.f13835y;
        int i10 = (z9 ? 2 : 0) | (i9 & (-3));
        this.f13835y = i10;
        if (i9 != i10) {
            this.f13824n.K(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9) {
        if (this.f13820j == c9) {
            return this;
        }
        this.f13820j = Character.toLowerCase(c9);
        this.f13824n.K(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9, int i9) {
        if (this.f13820j == c9 && this.f13821k == i9) {
            return this;
        }
        this.f13820j = Character.toLowerCase(c9);
        this.f13821k = KeyEvent.normalizeMetaState(i9);
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        int i9 = this.f13835y;
        int i10 = (z9 ? 1 : 0) | (i9 & (-2));
        this.f13835y = i10;
        if (i9 != i10) {
            this.f13824n.K(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        if ((this.f13835y & 4) != 0) {
            this.f13824n.T(this);
        } else {
            s(z9);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public I.b setContentDescription(CharSequence charSequence) {
        this.f13828r = charSequence;
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        this.f13835y = z9 ? this.f13835y | 16 : this.f13835y & (-17);
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i9) {
        this.f13822l = null;
        this.f13823m = i9;
        this.f13834x = true;
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f13823m = 0;
        this.f13822l = drawable;
        this.f13834x = true;
        this.f13824n.K(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13830t = colorStateList;
        this.f13832v = true;
        this.f13834x = true;
        this.f13824n.K(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13831u = mode;
        this.f13833w = true;
        this.f13834x = true;
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f13817g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9) {
        if (this.f13818h == c9) {
            return this;
        }
        this.f13818h = c9;
        this.f13824n.K(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c9, int i9) {
        if (this.f13818h == c9 && this.f13819i == i9) {
            return this;
        }
        this.f13818h = c9;
        this.f13819i = KeyEvent.normalizeMetaState(i9);
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13808C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13827q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10) {
        this.f13818h = c9;
        this.f13820j = Character.toLowerCase(c10);
        this.f13824n.K(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10, int i9, int i10) {
        this.f13818h = c9;
        this.f13819i = KeyEvent.normalizeMetaState(i9);
        this.f13820j = Character.toLowerCase(c10);
        this.f13821k = KeyEvent.normalizeMetaState(i10);
        this.f13824n.K(false);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public void setShowAsAction(int i9) {
        int i10 = i9 & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13836z = i9;
        this.f13824n.I(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i9) {
        return setTitle(this.f13824n.u().getString(i9));
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f13815e = charSequence;
        this.f13824n.K(false);
        l lVar = this.f13825o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13816f = charSequence;
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public I.b setTooltipText(CharSequence charSequence) {
        this.f13829s = charSequence;
        this.f13824n.K(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        if (y(z9)) {
            this.f13824n.J(this);
        }
        return this;
    }

    public void t(boolean z9) {
        this.f13835y = (z9 ? 4 : 0) | (this.f13835y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f13815e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z9) {
        this.f13835y = z9 ? this.f13835y | 32 : this.f13835y & (-33);
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f13810E = contextMenuInfo;
    }

    @Override // I.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public I.b setShowAsActionFlags(int i9) {
        setShowAsAction(i9);
        return this;
    }

    public void x(l lVar) {
        this.f13825o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z9) {
        int i9 = this.f13835y;
        int i10 = (z9 ? 0 : 8) | (i9 & (-9));
        this.f13835y = i10;
        return i9 != i10;
    }

    public boolean z() {
        return this.f13824n.A();
    }
}
