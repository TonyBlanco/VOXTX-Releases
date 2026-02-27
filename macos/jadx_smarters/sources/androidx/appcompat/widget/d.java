package androidx.appcompat.widget;

import P.L;
import P.S;
import P.U;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.i;
import c.AbstractC1238a;
import c.e;
import c.f;
import c.h;
import c.j;
import e.AbstractC1726a;
import j.C2071a;
import k.H;
import k.d0;

/* JADX INFO: loaded from: classes.dex */
public class d implements H {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f14213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f14215c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f14216d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f14217e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f14218f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f14219g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14220h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f14221i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f14222j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f14223k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f14224l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14225m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.a f14226n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14227o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14228p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f14229q;

    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2071a f14230a;

        public a() {
            this.f14230a = new C2071a(d.this.f14213a.getContext(), 0, R.id.home, 0, 0, d.this.f14221i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f14224l;
            if (callback == null || !dVar.f14225m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f14230a);
        }
    }

    public class b extends U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14232a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f14233b;

        public b(int i9) {
            this.f14233b = i9;
        }

        @Override // P.U, P.T
        public void a(View view) {
            this.f14232a = true;
        }

        @Override // P.T
        public void b(View view) {
            if (this.f14232a) {
                return;
            }
            d.this.f14213a.setVisibility(this.f14233b);
        }

        @Override // P.U, P.T
        public void c(View view) {
            d.this.f14213a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z9) {
        this(toolbar, z9, h.f17897a, e.f17822n);
    }

    public d(Toolbar toolbar, boolean z9, int i9, int i10) {
        Drawable drawable;
        this.f14227o = 0;
        this.f14228p = 0;
        this.f14213a = toolbar;
        this.f14221i = toolbar.getTitle();
        this.f14222j = toolbar.getSubtitle();
        this.f14220h = this.f14221i != null;
        this.f14219g = toolbar.getNavigationIcon();
        d0 d0VarV = d0.v(toolbar.getContext(), null, j.f18046a, AbstractC1238a.f17744c, 0);
        this.f14229q = d0VarV.g(j.f18103l);
        if (z9) {
            CharSequence charSequenceP = d0VarV.p(j.f18133r);
            if (!TextUtils.isEmpty(charSequenceP)) {
                setTitle(charSequenceP);
            }
            CharSequence charSequenceP2 = d0VarV.p(j.f18123p);
            if (!TextUtils.isEmpty(charSequenceP2)) {
                j(charSequenceP2);
            }
            Drawable drawableG = d0VarV.g(j.f18113n);
            if (drawableG != null) {
                C(drawableG);
            }
            Drawable drawableG2 = d0VarV.g(j.f18108m);
            if (drawableG2 != null) {
                setIcon(drawableG2);
            }
            if (this.f14219g == null && (drawable = this.f14229q) != null) {
                F(drawable);
            }
            i(d0VarV.k(j.f18083h, 0));
            int iN = d0VarV.n(j.f18078g, 0);
            if (iN != 0) {
                A(LayoutInflater.from(this.f14213a.getContext()).inflate(iN, (ViewGroup) this.f14213a, false));
                i(this.f14214b | 16);
            }
            int iM = d0VarV.m(j.f18093j, 0);
            if (iM > 0) {
                ViewGroup.LayoutParams layoutParams = this.f14213a.getLayoutParams();
                layoutParams.height = iM;
                this.f14213a.setLayoutParams(layoutParams);
            }
            int iE = d0VarV.e(j.f18073f, -1);
            int iE2 = d0VarV.e(j.f18068e, -1);
            if (iE >= 0 || iE2 >= 0) {
                this.f14213a.J(Math.max(iE, 0), Math.max(iE2, 0));
            }
            int iN2 = d0VarV.n(j.f18138s, 0);
            if (iN2 != 0) {
                Toolbar toolbar2 = this.f14213a;
                toolbar2.N(toolbar2.getContext(), iN2);
            }
            int iN3 = d0VarV.n(j.f18128q, 0);
            if (iN3 != 0) {
                Toolbar toolbar3 = this.f14213a;
                toolbar3.M(toolbar3.getContext(), iN3);
            }
            int iN4 = d0VarV.n(j.f18118o, 0);
            if (iN4 != 0) {
                this.f14213a.setPopupTheme(iN4);
            }
        } else {
            this.f14214b = z();
        }
        d0VarV.w();
        B(i9);
        this.f14223k = this.f14213a.getNavigationContentDescription();
        this.f14213a.setNavigationOnClickListener(new a());
    }

    public void A(View view) {
        View view2 = this.f14216d;
        if (view2 != null && (this.f14214b & 16) != 0) {
            this.f14213a.removeView(view2);
        }
        this.f14216d = view;
        if (view == null || (this.f14214b & 16) == 0) {
            return;
        }
        this.f14213a.addView(view);
    }

    public void B(int i9) {
        if (i9 == this.f14228p) {
            return;
        }
        this.f14228p = i9;
        if (TextUtils.isEmpty(this.f14213a.getNavigationContentDescription())) {
            D(this.f14228p);
        }
    }

    public void C(Drawable drawable) {
        this.f14218f = drawable;
        J();
    }

    public void D(int i9) {
        E(i9 == 0 ? null : getContext().getString(i9));
    }

    public void E(CharSequence charSequence) {
        this.f14223k = charSequence;
        H();
    }

    public void F(Drawable drawable) {
        this.f14219g = drawable;
        I();
    }

    public final void G(CharSequence charSequence) {
        this.f14221i = charSequence;
        if ((this.f14214b & 8) != 0) {
            this.f14213a.setTitle(charSequence);
            if (this.f14220h) {
                L.v0(this.f14213a.getRootView(), charSequence);
            }
        }
    }

    public final void H() {
        if ((this.f14214b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14223k)) {
                this.f14213a.setNavigationContentDescription(this.f14228p);
            } else {
                this.f14213a.setNavigationContentDescription(this.f14223k);
            }
        }
    }

    public final void I() {
        Toolbar toolbar;
        Drawable drawable;
        if ((this.f14214b & 4) != 0) {
            toolbar = this.f14213a;
            drawable = this.f14219g;
            if (drawable == null) {
                drawable = this.f14229q;
            }
        } else {
            toolbar = this.f14213a;
            drawable = null;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void J() {
        Drawable drawable;
        int i9 = this.f14214b;
        if ((i9 & 2) == 0) {
            drawable = null;
        } else if ((i9 & 1) == 0 || (drawable = this.f14218f) == null) {
            drawable = this.f14217e;
        }
        this.f14213a.setLogo(drawable);
    }

    @Override // k.H
    public boolean a() {
        return this.f14213a.d();
    }

    @Override // k.H
    public boolean b() {
        return this.f14213a.w();
    }

    @Override // k.H
    public boolean c() {
        return this.f14213a.Q();
    }

    @Override // k.H
    public void collapseActionView() {
        this.f14213a.e();
    }

    @Override // k.H
    public void d(Menu menu, i.a aVar) {
        if (this.f14226n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.f14213a.getContext());
            this.f14226n = aVar2;
            aVar2.p(f.f17857g);
        }
        this.f14226n.d(aVar);
        this.f14213a.K((androidx.appcompat.view.menu.e) menu, this.f14226n);
    }

    @Override // k.H
    public boolean e() {
        return this.f14213a.B();
    }

    @Override // k.H
    public void f() {
        this.f14225m = true;
    }

    @Override // k.H
    public boolean g() {
        return this.f14213a.A();
    }

    @Override // k.H
    public Context getContext() {
        return this.f14213a.getContext();
    }

    @Override // k.H
    public CharSequence getTitle() {
        return this.f14213a.getTitle();
    }

    @Override // k.H
    public boolean h() {
        return this.f14213a.v();
    }

    @Override // k.H
    public void i(int i9) {
        View view;
        CharSequence charSequence;
        Toolbar toolbar;
        int i10 = this.f14214b ^ i9;
        this.f14214b = i9;
        if (i10 != 0) {
            if ((i10 & 4) != 0) {
                if ((i9 & 4) != 0) {
                    H();
                }
                I();
            }
            if ((i10 & 3) != 0) {
                J();
            }
            if ((i10 & 8) != 0) {
                if ((i9 & 8) != 0) {
                    this.f14213a.setTitle(this.f14221i);
                    toolbar = this.f14213a;
                    charSequence = this.f14222j;
                } else {
                    charSequence = null;
                    this.f14213a.setTitle((CharSequence) null);
                    toolbar = this.f14213a;
                }
                toolbar.setSubtitle(charSequence);
            }
            if ((i10 & 16) == 0 || (view = this.f14216d) == null) {
                return;
            }
            if ((i9 & 16) != 0) {
                this.f14213a.addView(view);
            } else {
                this.f14213a.removeView(view);
            }
        }
    }

    @Override // k.H
    public void j(CharSequence charSequence) {
        this.f14222j = charSequence;
        if ((this.f14214b & 8) != 0) {
            this.f14213a.setSubtitle(charSequence);
        }
    }

    @Override // k.H
    public Menu k() {
        return this.f14213a.getMenu();
    }

    @Override // k.H
    public int l() {
        return this.f14227o;
    }

    @Override // k.H
    public S m(int i9, long j9) {
        return L.e(this.f14213a).b(i9 == 0 ? 1.0f : 0.0f).h(j9).j(new b(i9));
    }

    @Override // k.H
    public ViewGroup n() {
        return this.f14213a;
    }

    @Override // k.H
    public void o(boolean z9) {
    }

    @Override // k.H
    public void p() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // k.H
    public void q(boolean z9) {
        this.f14213a.setCollapsible(z9);
    }

    @Override // k.H
    public void r() {
        this.f14213a.f();
    }

    @Override // k.H
    public void s(c cVar) {
        View view = this.f14215c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f14213a;
            if (parent == toolbar) {
                toolbar.removeView(this.f14215c);
            }
        }
        this.f14215c = cVar;
    }

    @Override // k.H
    public void setIcon(int i9) {
        setIcon(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    @Override // k.H
    public void setIcon(Drawable drawable) {
        this.f14217e = drawable;
        J();
    }

    @Override // k.H
    public void setTitle(CharSequence charSequence) {
        this.f14220h = true;
        G(charSequence);
    }

    @Override // k.H
    public void setWindowCallback(Window.Callback callback) {
        this.f14224l = callback;
    }

    @Override // k.H
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f14220h) {
            return;
        }
        G(charSequence);
    }

    @Override // k.H
    public void t(int i9) {
        C(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    @Override // k.H
    public void u(int i9) {
        F(i9 != 0 ? AbstractC1726a.b(getContext(), i9) : null);
    }

    @Override // k.H
    public void v(i.a aVar, e.a aVar2) {
        this.f14213a.L(aVar, aVar2);
    }

    @Override // k.H
    public void w(int i9) {
        this.f14213a.setVisibility(i9);
    }

    @Override // k.H
    public int x() {
        return this.f14214b;
    }

    @Override // k.H
    public void y() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    public final int z() {
        if (this.f14213a.getNavigationIcon() == null) {
            return 11;
        }
        this.f14229q = this.f14213a.getNavigationIcon();
        return 15;
    }
}
