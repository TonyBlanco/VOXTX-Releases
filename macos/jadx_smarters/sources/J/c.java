package j;

import P.AbstractC0960b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class c extends j.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I.b f42838d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f42839e;

    public class a extends AbstractC0960b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ActionProvider f42840d;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f42840d = actionProvider;
        }

        @Override // P.AbstractC0960b
        public boolean b() {
            return this.f42840d.hasSubMenu();
        }

        @Override // P.AbstractC0960b
        public View d() {
            return this.f42840d.onCreateActionView();
        }

        @Override // P.AbstractC0960b
        public boolean f() {
            return this.f42840d.onPerformDefaultAction();
        }

        @Override // P.AbstractC0960b
        public void g(SubMenu subMenu) {
            this.f42840d.onPrepareSubMenu(c.this.d(subMenu));
        }
    }

    public class b extends a implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AbstractC0960b.InterfaceC0079b f42842f;

        public b(Context context, ActionProvider actionProvider) {
            super(context, actionProvider);
        }

        @Override // P.AbstractC0960b
        public boolean c() {
            return this.f42840d.isVisible();
        }

        @Override // P.AbstractC0960b
        public View e(MenuItem menuItem) {
            return this.f42840d.onCreateActionView(menuItem);
        }

        @Override // P.AbstractC0960b
        public boolean h() {
            return this.f42840d.overridesItemVisibility();
        }

        @Override // P.AbstractC0960b
        public void l(AbstractC0960b.InterfaceC0079b interfaceC0079b) {
            this.f42842f = interfaceC0079b;
            this.f42840d.setVisibilityListener(interfaceC0079b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z9) {
            AbstractC0960b.InterfaceC0079b interfaceC0079b = this.f42842f;
            if (interfaceC0079b != null) {
                interfaceC0079b.onActionProviderVisibilityChanged(z9);
            }
        }
    }

    /* JADX INFO: renamed from: j.c$c, reason: collision with other inner class name */
    public static class C0352c extends FrameLayout implements i.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f42844a;

        /* JADX WARN: Multi-variable type inference failed */
        public C0352c(View view) {
            super(view.getContext());
            this.f42844a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f42844a;
        }

        @Override // i.c
        public void b() {
            this.f42844a.onActionViewExpanded();
        }

        @Override // i.c
        public void f() {
            this.f42844a.onActionViewCollapsed();
        }
    }

    public class d implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f42845a;

        public d(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f42845a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f42845a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f42845a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    public class e implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f42847a;

        public e(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f42847a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f42847a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, I.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f42838d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f42838d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f42838d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC0960b abstractC0960bB = this.f42838d.b();
        if (abstractC0960bB instanceof a) {
            return ((a) abstractC0960bB).f42840d;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f42838d.getActionView();
        return actionView instanceof C0352c ? ((C0352c) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f42838d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f42838d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f42838d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f42838d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f42838d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f42838d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f42838d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f42838d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f42838d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f42838d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f42838d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f42838d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f42838d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f42838d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f42838d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f42838d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f42838d.getTooltipText();
    }

    public void h(boolean z9) {
        try {
            if (this.f42839e == null) {
                this.f42839e = this.f42838d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f42839e.invoke(this.f42838d, Boolean.valueOf(z9));
        } catch (Exception e9) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e9);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f42838d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f42838d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f42838d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f42838d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f42838d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f42838d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        b bVar = new b(this.f42835a, actionProvider);
        I.b bVar2 = this.f42838d;
        if (actionProvider == null) {
            bVar = null;
        }
        bVar2.a(bVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i9) {
        this.f42838d.setActionView(i9);
        View actionView = this.f42838d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f42838d.setActionView(new C0352c(actionView));
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new C0352c(view);
        }
        this.f42838d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9) {
        this.f42838d.setAlphabeticShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c9, int i9) {
        this.f42838d.setAlphabeticShortcut(c9, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z9) {
        this.f42838d.setCheckable(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z9) {
        this.f42838d.setChecked(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f42838d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z9) {
        this.f42838d.setEnabled(z9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i9) {
        this.f42838d.setIcon(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f42838d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f42838d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f42838d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f42838d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9) {
        this.f42838d.setNumericShortcut(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c9, int i9) {
        this.f42838d.setNumericShortcut(c9, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f42838d.setOnActionExpandListener(onActionExpandListener != null ? new d(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f42838d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new e(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10) {
        this.f42838d.setShortcut(c9, c10);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c9, char c10, int i9, int i10) {
        this.f42838d.setShortcut(c9, c10, i9, i10);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i9) {
        this.f42838d.setShowAsAction(i9);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i9) {
        this.f42838d.setShowAsActionFlags(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i9) {
        this.f42838d.setTitle(i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f42838d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f42838d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f42838d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z9) {
        return this.f42838d.setVisible(z9);
    }
}
