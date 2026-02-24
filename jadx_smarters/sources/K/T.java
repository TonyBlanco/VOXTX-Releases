package k;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.Transition;
import android.util.AttributeSet;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class T extends Q implements S {

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public static Method f43220L;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public S f43221K;

    public static class a {
        public static void a(PopupWindow popupWindow, Transition transition) {
            popupWindow.setEnterTransition(transition);
        }

        public static void b(PopupWindow popupWindow, Transition transition) {
            popupWindow.setExitTransition(transition);
        }
    }

    public static class b {
        public static void a(PopupWindow popupWindow, boolean z9) {
            popupWindow.setTouchModal(z9);
        }
    }

    public static class c extends N {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final int f43222o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final int f43223p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public S f43224q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public MenuItem f43225r;

        public static class a {
            public static int a(Configuration configuration) {
                return configuration.getLayoutDirection();
            }
        }

        public c(Context context, boolean z9) {
            super(context, z9);
            if (1 == a.a(context.getResources().getConfiguration())) {
                this.f43222o = 21;
                this.f43223p = 22;
            } else {
                this.f43222o = 22;
                this.f43223p = 21;
            }
        }

        @Override // k.N
        public /* bridge */ /* synthetic */ int d(int i9, int i10, int i11, int i12, int i13) {
            return super.d(i9, i10, i11, i12, i13);
        }

        @Override // k.N
        public /* bridge */ /* synthetic */ boolean e(MotionEvent motionEvent, int i9) {
            return super.e(motionEvent, i9);
        }

        @Override // k.N, android.view.ViewGroup, android.view.View
        public /* bridge */ /* synthetic */ boolean hasFocus() {
            return super.hasFocus();
        }

        @Override // k.N, android.view.View
        public /* bridge */ /* synthetic */ boolean hasWindowFocus() {
            return super.hasWindowFocus();
        }

        @Override // k.N, android.view.View
        public /* bridge */ /* synthetic */ boolean isFocused() {
            return super.isFocused();
        }

        @Override // k.N, android.view.View
        public /* bridge */ /* synthetic */ boolean isInTouchMode() {
            return super.isInTouchMode();
        }

        @Override // k.N, android.view.View
        public boolean onHoverEvent(MotionEvent motionEvent) {
            androidx.appcompat.view.menu.d dVar;
            int headersCount;
            int iPointToPosition;
            int i9;
            if (this.f43224q != null) {
                ListAdapter adapter = getAdapter();
                if (adapter instanceof HeaderViewListAdapter) {
                    HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                    headersCount = headerViewListAdapter.getHeadersCount();
                    dVar = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
                } else {
                    dVar = (androidx.appcompat.view.menu.d) adapter;
                    headersCount = 0;
                }
                androidx.appcompat.view.menu.g item = (motionEvent.getAction() == 10 || (iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY())) == -1 || (i9 = iPointToPosition - headersCount) < 0 || i9 >= dVar.getCount()) ? null : dVar.getItem(i9);
                MenuItem menuItem = this.f43225r;
                if (menuItem != item) {
                    androidx.appcompat.view.menu.e eVarB = dVar.b();
                    if (menuItem != null) {
                        this.f43224q.n(eVarB, menuItem);
                    }
                    this.f43225r = item;
                    if (item != null) {
                        this.f43224q.d(eVarB, item);
                    }
                }
            }
            return super.onHoverEvent(motionEvent);
        }

        @Override // android.widget.ListView, android.widget.AbsListView, android.view.View, android.view.KeyEvent.Callback
        public boolean onKeyDown(int i9, KeyEvent keyEvent) {
            ListMenuItemView listMenuItemView = (ListMenuItemView) getSelectedView();
            if (listMenuItemView != null && i9 == this.f43222o) {
                if (listMenuItemView.isEnabled() && listMenuItemView.getItemData().hasSubMenu()) {
                    performItemClick(listMenuItemView, getSelectedItemPosition(), getSelectedItemId());
                }
                return true;
            }
            if (listMenuItemView == null || i9 != this.f43223p) {
                return super.onKeyDown(i9, keyEvent);
            }
            setSelection(-1);
            ListAdapter adapter = getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            ((androidx.appcompat.view.menu.d) adapter).b().e(false);
            return true;
        }

        @Override // k.N, android.widget.AbsListView, android.view.View
        public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
            return super.onTouchEvent(motionEvent);
        }

        public void setHoverListener(S s9) {
            this.f43224q = s9;
        }

        @Override // k.N, android.widget.AbsListView
        public /* bridge */ /* synthetic */ void setSelector(Drawable drawable) {
            super.setSelector(drawable);
        }
    }

    static {
        try {
            if (Build.VERSION.SDK_INT <= 28) {
                f43220L = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
            }
        } catch (NoSuchMethodException unused) {
            Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
        }
    }

    public T(Context context, AttributeSet attributeSet, int i9, int i10) {
        super(context, attributeSet, i9, i10);
    }

    public void Q(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a(this.f43187G, (Transition) obj);
        }
    }

    public void R(Object obj) {
        if (Build.VERSION.SDK_INT >= 23) {
            a.b(this.f43187G, (Transition) obj);
        }
    }

    public void S(S s9) {
        this.f43221K = s9;
    }

    public void T(boolean z9) {
        if (Build.VERSION.SDK_INT > 28) {
            b.a(this.f43187G, z9);
            return;
        }
        Method method = f43220L;
        if (method != null) {
            try {
                method.invoke(this.f43187G, Boolean.valueOf(z9));
            } catch (Exception unused) {
                Log.i("MenuPopupWindow", "Could not invoke setTouchModal() on PopupWindow. Oh well.");
            }
        }
    }

    @Override // k.S
    public void d(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        S s9 = this.f43221K;
        if (s9 != null) {
            s9.d(eVar, menuItem);
        }
    }

    @Override // k.S
    public void n(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        S s9 = this.f43221K;
        if (s9 != null) {
            s9.n(eVar, menuItem);
        }
    }

    @Override // k.Q
    public N r(Context context, boolean z9) {
        c cVar = new c(context, z9);
        cVar.setHoverListener(this);
        return cVar;
    }
}
