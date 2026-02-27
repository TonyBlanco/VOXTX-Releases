package j;

import P.AbstractC0960b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: j.a, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C2071a implements I.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f42815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f42816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f42817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f42818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f42819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f42820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f42821g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f42823i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f42825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f42826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f42827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f42828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f42829o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f42822h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f42824j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f42830p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f42831q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f42832r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f42833s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f42834t = 16;

    public C2071a(Context context, int i9, int i10, int i11, int i12, CharSequence charSequence) {
        this.f42826l = context;
        this.f42815a = i10;
        this.f42816b = i9;
        this.f42817c = i12;
        this.f42818d = charSequence;
    }

    @Override // I.b
    public I.b a(AbstractC0960b abstractC0960b) {
        throw new UnsupportedOperationException();
    }

    @Override // I.b
    public AbstractC0960b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f42825k;
        if (drawable != null) {
            if (this.f42832r || this.f42833s) {
                Drawable drawableR = H.a.r(drawable);
                this.f42825k = drawableR;
                Drawable drawableMutate = drawableR.mutate();
                this.f42825k = drawableMutate;
                if (this.f42832r) {
                    H.a.o(drawableMutate, this.f42830p);
                }
                if (this.f42833s) {
                    H.a.p(this.f42825k, this.f42831q);
                }
            }
        }
    }

    @Override // I.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // I.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public I.b setActionView(int i9) {
        throw new UnsupportedOperationException();
    }

    @Override // I.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public I.b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // I.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // I.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public I.b setShowAsActionFlags(int i9) {
        setShowAsAction(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // I.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // I.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f42824j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f42823i;
    }

    @Override // I.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f42828n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f42816b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f42825k;
    }

    @Override // I.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f42830p;
    }

    @Override // I.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f42831q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f42820f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f42815a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // I.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f42822h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f42821g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f42817c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f42818d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f42819e;
        return charSequence != null ? charSequence : this.f42818d;
    }

    @Override // I.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f42829o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // I.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f42834t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f42834t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f42834t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f42834t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9) {
        this.f42823i = Character.toLowerCase(c9);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9, int i9) {
        this.f42823i = Character.toLowerCase(c9);
        this.f42824j = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        this.f42834t = (z9 ? 1 : 0) | (this.f42834t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        this.f42834t = (z9 ? 2 : 0) | (this.f42834t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public I.b setContentDescription(CharSequence charSequence) {
        this.f42828n = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        this.f42834t = (z9 ? 16 : 0) | (this.f42834t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i9) {
        this.f42825k = E.b.getDrawable(this.f42826l, i9);
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f42825k = drawable;
        c();
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f42830p = colorStateList;
        this.f42832r = true;
        c();
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f42831q = mode;
        this.f42833s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f42820f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9) {
        this.f42821g = c9;
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c9, int i9) {
        this.f42821g = c9;
        this.f42822h = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f42827m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10) {
        this.f42821g = c9;
        this.f42823i = Character.toLowerCase(c10);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10, int i9, int i10) {
        this.f42821g = c9;
        this.f42822h = KeyEvent.normalizeMetaState(i9);
        this.f42823i = Character.toLowerCase(c10);
        this.f42824j = KeyEvent.normalizeMetaState(i10);
        return this;
    }

    @Override // I.b, android.view.MenuItem
    public void setShowAsAction(int i9) {
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i9) {
        this.f42818d = this.f42826l.getResources().getString(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f42818d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f42819e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public I.b setTooltipText(CharSequence charSequence) {
        this.f42829o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        this.f42834t = (this.f42834t & 8) | (z9 ? 0 : 8);
        return this;
    }
}
