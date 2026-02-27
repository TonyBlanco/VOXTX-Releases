package androidx.appcompat.view.menu;

import P.L;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import c.AbstractC1241d;
import k.T;

/* JADX INFO: loaded from: classes.dex */
public final class k extends j.d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f13851w = c.g.f17889m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f13852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f13853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d f13854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13857h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f13858i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final T f13859j;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13862m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f13863n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f13864o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public i.a f13865p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ViewTreeObserver f13866q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13867r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13868s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13869t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13871v;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f13860k = new a();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f13861l = new b();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13870u = 0;

    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.f13859j.A()) {
                return;
            }
            View view = k.this.f13864o;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.f13859j.show();
            }
        }
    }

    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f13866q;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f13866q = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f13866q.removeGlobalOnLayoutListener(kVar.f13860k);
            }
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(Context context, e eVar, View view, int i9, int i10, boolean z9) {
        this.f13852c = context;
        this.f13853d = eVar;
        this.f13855f = z9;
        this.f13854e = new d(eVar, LayoutInflater.from(context), z9, f13851w);
        this.f13857h = i9;
        this.f13858i = i10;
        Resources resources = context.getResources();
        this.f13856g = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(AbstractC1241d.f17778b));
        this.f13863n = view;
        this.f13859j = new T(context, null, i9, i10);
        eVar.c(this, context);
    }

    @Override // j.f
    public boolean a() {
        return !this.f13867r && this.f13859j.a();
    }

    @Override // androidx.appcompat.view.menu.i
    public void b(e eVar, boolean z9) {
        if (eVar != this.f13853d) {
            return;
        }
        dismiss();
        i.a aVar = this.f13865p;
        if (aVar != null) {
            aVar.b(eVar, z9);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(i.a aVar) {
        this.f13865p = aVar;
    }

    @Override // j.f
    public void dismiss() {
        if (a()) {
            this.f13859j.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.f13852c, lVar, this.f13864o, this.f13855f, this.f13857h, this.f13858i);
            hVar.j(this.f13865p);
            hVar.g(j.d.w(lVar));
            hVar.i(this.f13862m);
            this.f13862m = null;
            this.f13853d.e(false);
            int iC = this.f13859j.c();
            int iL = this.f13859j.l();
            if ((Gravity.getAbsoluteGravity(this.f13870u, L.E(this.f13863n)) & 7) == 5) {
                iC += this.f13863n.getWidth();
            }
            if (hVar.n(iC, iL)) {
                i.a aVar = this.f13865p;
                if (aVar == null) {
                    return true;
                }
                aVar.c(lVar);
                return true;
            }
        }
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void f(boolean z9) {
        this.f13868s = false;
        d dVar = this.f13854e;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean g() {
        return false;
    }

    @Override // j.d
    public void j(e eVar) {
    }

    @Override // j.d
    public void n(View view) {
        this.f13863n = view;
    }

    @Override // j.f
    public ListView o() {
        return this.f13859j.o();
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f13867r = true;
        this.f13853d.close();
        ViewTreeObserver viewTreeObserver = this.f13866q;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f13866q = this.f13864o.getViewTreeObserver();
            }
            this.f13866q.removeGlobalOnLayoutListener(this.f13860k);
            this.f13866q = null;
        }
        this.f13864o.removeOnAttachStateChangeListener(this.f13861l);
        PopupWindow.OnDismissListener onDismissListener = this.f13862m;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f13854e.d(z9);
    }

    @Override // j.d
    public void r(int i9) {
        this.f13870u = i9;
    }

    @Override // j.d
    public void s(int i9) {
        this.f13859j.e(i9);
    }

    @Override // j.f
    public void show() {
        if (!y()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // j.d
    public void t(PopupWindow.OnDismissListener onDismissListener) {
        this.f13862m = onDismissListener;
    }

    @Override // j.d
    public void u(boolean z9) {
        this.f13871v = z9;
    }

    @Override // j.d
    public void v(int i9) {
        this.f13859j.i(i9);
    }

    public final boolean y() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f13867r || (view = this.f13863n) == null) {
            return false;
        }
        this.f13864o = view;
        this.f13859j.J(this);
        this.f13859j.K(this);
        this.f13859j.I(true);
        View view2 = this.f13864o;
        boolean z9 = this.f13866q == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f13866q = viewTreeObserver;
        if (z9) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f13860k);
        }
        view2.addOnAttachStateChangeListener(this.f13861l);
        this.f13859j.C(view2);
        this.f13859j.F(this.f13870u);
        if (!this.f13868s) {
            this.f13869t = j.d.m(this.f13854e, null, this.f13852c, this.f13856g);
            this.f13868s = true;
        }
        this.f13859j.E(this.f13869t);
        this.f13859j.H(2);
        this.f13859j.G(l());
        this.f13859j.show();
        ListView listViewO = this.f13859j.o();
        listViewO.setOnKeyListener(this);
        if (this.f13871v && this.f13853d.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f13852c).inflate(c.g.f17888l, (ViewGroup) listViewO, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f13853d.x());
            }
            frameLayout.setEnabled(false);
            listViewO.addHeaderView(frameLayout, null, false);
        }
        this.f13859j.m(this.f13854e);
        this.f13859j.show();
        return true;
    }
}
