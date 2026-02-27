package j;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: loaded from: classes.dex */
public class e extends b implements Menu {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final I.a f42850d;

    public e(Context context, I.a aVar) {
        super(context);
        if (aVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f42850d = aVar;
    }

    @Override // android.view.Menu
    public MenuItem add(int i9) {
        return c(this.f42850d.add(i9));
    }

    @Override // android.view.Menu
    public MenuItem add(int i9, int i10, int i11, int i12) {
        return c(this.f42850d.add(i9, i10, i11, i12));
    }

    @Override // android.view.Menu
    public MenuItem add(int i9, int i10, int i11, CharSequence charSequence) {
        return c(this.f42850d.add(i9, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return c(this.f42850d.add(charSequence));
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i9, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f42850d.addIntentOptions(i9, i10, i11, componentName, intentArr, intent, i12, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i13 = 0; i13 < length; i13++) {
                menuItemArr[i13] = c(menuItemArr2[i13]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i9) {
        return d(this.f42850d.addSubMenu(i9));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i9, int i10, int i11, int i12) {
        return d(this.f42850d.addSubMenu(i9, i10, i11, i12));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i9, int i10, int i11, CharSequence charSequence) {
        return d(this.f42850d.addSubMenu(i9, i10, i11, charSequence));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return d(this.f42850d.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public void clear() {
        e();
        this.f42850d.clear();
    }

    @Override // android.view.Menu
    public void close() {
        this.f42850d.close();
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i9) {
        return c(this.f42850d.findItem(i9));
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i9) {
        return c(this.f42850d.getItem(i9));
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        return this.f42850d.hasVisibleItems();
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i9, KeyEvent keyEvent) {
        return this.f42850d.isShortcutKey(i9, keyEvent);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i9, int i10) {
        return this.f42850d.performIdentifierAction(i9, i10);
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i9, KeyEvent keyEvent, int i10) {
        return this.f42850d.performShortcut(i9, keyEvent, i10);
    }

    @Override // android.view.Menu
    public void removeGroup(int i9) {
        f(i9);
        this.f42850d.removeGroup(i9);
    }

    @Override // android.view.Menu
    public void removeItem(int i9) {
        g(i9);
        this.f42850d.removeItem(i9);
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i9, boolean z9, boolean z10) {
        this.f42850d.setGroupCheckable(i9, z9, z10);
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i9, boolean z9) {
        this.f42850d.setGroupEnabled(i9, z9);
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i9, boolean z9) {
        this.f42850d.setGroupVisible(i9, z9);
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z9) {
        this.f42850d.setQwertyMode(z9);
    }

    @Override // android.view.Menu
    public int size() {
        return this.f42850d.size();
    }
}
