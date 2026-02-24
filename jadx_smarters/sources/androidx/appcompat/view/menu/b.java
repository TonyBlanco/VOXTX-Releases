package androidx.appcompat.view.menu;

import P.AbstractC0974p;
import P.L;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import c.AbstractC1241d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k.S;
import k.T;

/* JADX INFO: loaded from: classes.dex */
public final class b extends j.d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f13721C = c.g.f17881e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13722A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13723B;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f13728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Handler f13729h;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f13737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f13738q;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f13741t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13743v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13745x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public i.a f13746y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ViewTreeObserver f13747z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13730i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f13731j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f13732k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f13733l = new ViewOnAttachStateChangeListenerC0160b();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final S f13734m = new c();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13735n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13736o = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13744w = false;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13739r = C();

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f13731j.size() <= 0 || ((d) b.this.f13731j.get(0)).f13755a.A()) {
                return;
            }
            View view = b.this.f13738q;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f13731j.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f13755a.show();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    public class ViewOnAttachStateChangeListenerC0160b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0160b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f13747z;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f13747z = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f13747z.removeGlobalOnLayoutListener(bVar.f13732k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public class c implements S {

        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f13751a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ MenuItem f13752c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ e f13753d;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f13751a = dVar;
                this.f13752c = menuItem;
                this.f13753d = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f13751a;
                if (dVar != null) {
                    b.this.f13723B = true;
                    dVar.f13756b.e(false);
                    b.this.f13723B = false;
                }
                if (this.f13752c.isEnabled() && this.f13752c.hasSubMenu()) {
                    this.f13753d.L(this.f13752c, 4);
                }
            }
        }

        public c() {
        }

        @Override // k.S
        public void d(e eVar, MenuItem menuItem) {
            b.this.f13729h.removeCallbacksAndMessages(null);
            int size = b.this.f13731j.size();
            int i9 = 0;
            while (true) {
                if (i9 >= size) {
                    i9 = -1;
                    break;
                } else if (eVar == ((d) b.this.f13731j.get(i9)).f13756b) {
                    break;
                } else {
                    i9++;
                }
            }
            if (i9 == -1) {
                return;
            }
            int i10 = i9 + 1;
            b.this.f13729h.postAtTime(new a(i10 < b.this.f13731j.size() ? (d) b.this.f13731j.get(i10) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // k.S
        public void n(e eVar, MenuItem menuItem) {
            b.this.f13729h.removeCallbacksAndMessages(eVar);
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f13755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f13756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13757c;

        public d(T t9, e eVar, int i9) {
            this.f13755a = t9;
            this.f13756b = eVar;
            this.f13757c = i9;
        }

        public ListView a() {
            return this.f13755a.o();
        }
    }

    public b(Context context, View view, int i9, int i10, boolean z9) {
        this.f13724c = context;
        this.f13737p = view;
        this.f13726e = i9;
        this.f13727f = i10;
        this.f13728g = z9;
        Resources resources = context.getResources();
        this.f13725d = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1241d.f17778b));
        this.f13729h = new Handler();
    }

    public final MenuItem A(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i9 = 0; i9 < size; i9++) {
            MenuItem item = eVar.getItem(i9);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View B(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemA = A(dVar.f13756b, eVar);
        if (menuItemA == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i9 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i9 >= count) {
                i9 = -1;
                break;
            }
            if (menuItemA == dVar2.getItem(i9)) {
                break;
            }
            i9++;
        }
        if (i9 != -1 && (firstVisiblePosition = (i9 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int C() {
        return L.E(this.f13737p) == 1 ? 0 : 1;
    }

    public final int D(int i9) {
        List list = this.f13731j;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f13738q.getWindowVisibleDisplayFrame(rect);
        return this.f13739r == 1 ? (iArr[0] + listViewA.getWidth()) + i9 > rect.right ? 0 : 1 : iArr[0] - i9 < 0 ? 1 : 0;
    }

    public final void E(e eVar) {
        d dVar;
        View viewB;
        int i9;
        int i10;
        int i11;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13724c);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f13728g, f13721C);
        if (!a() && this.f13744w) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(j.d.w(eVar));
        }
        int iM = j.d.m(dVar2, null, this.f13724c, this.f13725d);
        T tY = y();
        tY.m(dVar2);
        tY.E(iM);
        tY.F(this.f13736o);
        if (this.f13731j.size() > 0) {
            List list = this.f13731j;
            dVar = (d) list.get(list.size() - 1);
            viewB = B(dVar, eVar);
        } else {
            dVar = null;
            viewB = null;
        }
        if (viewB != null) {
            tY.T(false);
            tY.Q(null);
            int iD = D(iM);
            boolean z9 = iD == 1;
            this.f13739r = iD;
            if (Build.VERSION.SDK_INT >= 26) {
                tY.C(viewB);
                i10 = 0;
                i9 = 0;
            } else {
                int[] iArr = new int[2];
                this.f13737p.getLocationOnScreen(iArr);
                int[] iArr2 = new int[2];
                viewB.getLocationOnScreen(iArr2);
                if ((this.f13736o & 7) == 5) {
                    iArr[0] = iArr[0] + this.f13737p.getWidth();
                    iArr2[0] = iArr2[0] + viewB.getWidth();
                }
                i9 = iArr2[0] - iArr[0];
                i10 = iArr2[1] - iArr[1];
            }
            if ((this.f13736o & 5) == 5) {
                if (!z9) {
                    iM = viewB.getWidth();
                    i11 = i9 - iM;
                }
                i11 = i9 + iM;
            } else {
                if (z9) {
                    iM = viewB.getWidth();
                    i11 = i9 + iM;
                }
                i11 = i9 - iM;
            }
            tY.e(i11);
            tY.L(true);
            tY.i(i10);
        } else {
            if (this.f13740s) {
                tY.e(this.f13742u);
            }
            if (this.f13741t) {
                tY.i(this.f13743v);
            }
            tY.G(l());
        }
        this.f13731j.add(new d(tY, eVar, this.f13739r));
        tY.show();
        ListView listViewO = tY.o();
        listViewO.setOnKeyListener(this);
        if (dVar == null && this.f13745x && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(c.g.f17888l, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewO.addHeaderView(frameLayout, null, false);
            tY.show();
        }
    }

    @Override // j.f
    public boolean a() {
        return this.f13731j.size() > 0 && ((d) this.f13731j.get(0)).f13755a.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z9) {
        int iZ = z(eVar);
        if (iZ < 0) {
            return;
        }
        int i9 = iZ + 1;
        if (i9 < this.f13731j.size()) {
            ((d) this.f13731j.get(i9)).f13756b.e(false);
        }
        d dVar = (d) this.f13731j.remove(iZ);
        dVar.f13756b.O(this);
        if (this.f13723B) {
            dVar.f13755a.R(null);
            dVar.f13755a.D(0);
        }
        dVar.f13755a.dismiss();
        int size = this.f13731j.size();
        this.f13739r = size > 0 ? ((d) this.f13731j.get(size - 1)).f13757c : C();
        if (size != 0) {
            if (z9) {
                ((d) this.f13731j.get(0)).f13756b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f13746y;
        if (aVar != null) {
            aVar.b(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f13747z;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f13747z.removeGlobalOnLayoutListener(this.f13732k);
            }
            this.f13747z = null;
        }
        this.f13738q.removeOnAttachStateChangeListener(this.f13733l);
        this.f13722A.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f13746y = aVar;
    }

    @Override // j.f
    public void dismiss() {
        int size = this.f13731j.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f13731j.toArray(new d[size]);
            for (int i9 = size - 1; i9 >= 0; i9--) {
                d dVar = dVarArr[i9];
                if (dVar.f13755a.a()) {
                    dVar.f13755a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        for (d dVar : this.f13731j) {
            if (lVar == dVar.f13756b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        j(lVar);
        i.a aVar = this.f13746y;
        if (aVar != null) {
            aVar.c(lVar);
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z9) {
        Iterator it = this.f13731j.iterator();
        while (it.hasNext()) {
            j.d.x(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // j.d
    public void j(e eVar) {
        eVar.c(this, this.f13724c);
        if (a()) {
            E(eVar);
        } else {
            this.f13730i.add(eVar);
        }
    }

    @Override // j.d
    public boolean k() {
        return false;
    }

    @Override // j.d
    public void n(View view) {
        if (this.f13737p != view) {
            this.f13737p = view;
            this.f13736o = AbstractC0974p.b(this.f13735n, L.E(view));
        }
    }

    @Override // j.f
    public ListView o() {
        if (this.f13731j.isEmpty()) {
            return null;
        }
        return ((d) this.f13731j.get(r0.size() - 1)).a();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f13731j.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f13731j.get(i9);
            if (!dVar.f13755a.a()) {
                break;
            } else {
                i9++;
            }
        }
        if (dVar != null) {
            dVar.f13756b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i9, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i9 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // j.d
    public void q(boolean z9) {
        this.f13744w = z9;
    }

    @Override // j.d
    public void r(int i9) {
        if (this.f13735n != i9) {
            this.f13735n = i9;
            this.f13736o = AbstractC0974p.b(i9, L.E(this.f13737p));
        }
    }

    @Override // j.d
    public void s(int i9) {
        this.f13740s = true;
        this.f13742u = i9;
    }

    @Override // j.f
    public void show() {
        if (a()) {
            return;
        }
        Iterator it = this.f13730i.iterator();
        while (it.hasNext()) {
            E((e) it.next());
        }
        this.f13730i.clear();
        View view = this.f13737p;
        this.f13738q = view;
        if (view != null) {
            boolean z9 = this.f13747z == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f13747z = viewTreeObserver;
            if (z9) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13732k);
            }
            this.f13738q.addOnAttachStateChangeListener(this.f13733l);
        }
    }

    @Override // j.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f13722A = onDismissListener;
    }

    @Override // j.d
    public void u(boolean z9) {
        this.f13745x = z9;
    }

    @Override // j.d
    public void v(int i9) {
        this.f13741t = true;
        this.f13743v = i9;
    }

    public final T y() {
        T t9 = new T(this.f13724c, null, this.f13726e, this.f13727f);
        t9.S(this.f13734m);
        t9.K(this);
        t9.J(this);
        t9.C(this.f13737p);
        t9.F(this.f13736o);
        t9.I(true);
        t9.H(2);
        return t9;
    }

    public final int z(e eVar) {
        int size = this.f13731j.size();
        for (int i9 = 0; i9 < size; i9++) {
            if (eVar == ((d) this.f13731j.get(i9)).f13756b) {
                return i9;
            }
        }
        return -1;
    }
}
