package P;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: renamed from: P.w, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0980w {

    /* JADX INFO: renamed from: P.w$a */
    public static class a {
        public static int a(MenuItem menuItem) {
            return menuItem.getAlphabeticModifiers();
        }

        public static CharSequence b(MenuItem menuItem) {
            return menuItem.getContentDescription();
        }

        public static ColorStateList c(MenuItem menuItem) {
            return menuItem.getIconTintList();
        }

        public static PorterDuff.Mode d(MenuItem menuItem) {
            return menuItem.getIconTintMode();
        }

        public static int e(MenuItem menuItem) {
            return menuItem.getNumericModifiers();
        }

        public static CharSequence f(MenuItem menuItem) {
            return menuItem.getTooltipText();
        }

        public static MenuItem g(MenuItem menuItem, char c9, int i9) {
            return menuItem.setAlphabeticShortcut(c9, i9);
        }

        public static MenuItem h(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setContentDescription(charSequence);
        }

        public static MenuItem i(MenuItem menuItem, ColorStateList colorStateList) {
            return menuItem.setIconTintList(colorStateList);
        }

        public static MenuItem j(MenuItem menuItem, PorterDuff.Mode mode) {
            return menuItem.setIconTintMode(mode);
        }

        public static MenuItem k(MenuItem menuItem, char c9, int i9) {
            return menuItem.setNumericShortcut(c9, i9);
        }

        public static MenuItem l(MenuItem menuItem, char c9, char c10, int i9, int i10) {
            return menuItem.setShortcut(c9, c10, i9, i10);
        }

        public static MenuItem m(MenuItem menuItem, CharSequence charSequence) {
            return menuItem.setTooltipText(charSequence);
        }
    }

    public static AbstractC0960b a(MenuItem menuItem) {
        if (menuItem instanceof I.b) {
            return ((I.b) menuItem).b();
        }
        Log.w("MenuItemCompat", "getActionProvider: item does not implement SupportMenuItem; returning null");
        return null;
    }

    public static View b(MenuItem menuItem) {
        return menuItem.getActionView();
    }

    public static MenuItem c(MenuItem menuItem, AbstractC0960b abstractC0960b) {
        if (menuItem instanceof I.b) {
            return ((I.b) menuItem).a(abstractC0960b);
        }
        Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
        return menuItem;
    }

    public static void d(MenuItem menuItem, char c9, int i9) {
        if (menuItem instanceof I.b) {
            ((I.b) menuItem).setAlphabeticShortcut(c9, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.g(menuItem, c9, i9);
        }
    }

    public static void e(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof I.b) {
            ((I.b) menuItem).setContentDescription(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.h(menuItem, charSequence);
        }
    }

    public static void f(MenuItem menuItem, ColorStateList colorStateList) {
        if (menuItem instanceof I.b) {
            ((I.b) menuItem).setIconTintList(colorStateList);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.i(menuItem, colorStateList);
        }
    }

    public static void g(MenuItem menuItem, PorterDuff.Mode mode) {
        if (menuItem instanceof I.b) {
            ((I.b) menuItem).setIconTintMode(mode);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.j(menuItem, mode);
        }
    }

    public static void h(MenuItem menuItem, char c9, int i9) {
        if (menuItem instanceof I.b) {
            ((I.b) menuItem).setNumericShortcut(c9, i9);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.k(menuItem, c9, i9);
        }
    }

    public static void i(MenuItem menuItem, CharSequence charSequence) {
        if (menuItem instanceof I.b) {
            ((I.b) menuItem).setTooltipText(charSequence);
        } else if (Build.VERSION.SDK_INT >= 26) {
            a.m(menuItem, charSequence);
        }
    }
}
