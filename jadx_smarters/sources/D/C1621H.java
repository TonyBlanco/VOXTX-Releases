package d;

import P.L;
import P.S;
import P.T;
import P.U;
import P.V;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import c.AbstractC1238a;
import com.amazonaws.services.s3.internal.Constants;
import i.AbstractC1872b;
import i.C1871a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: renamed from: d.H, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C1621H extends AbstractC1622a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Interpolator f39268D = new AccelerateInterpolator();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Interpolator f39269E = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f39273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f39274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f39275c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f39276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f39277e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public k.H f39278f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f39279g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f39280h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39283k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d f39284l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AbstractC1872b f39285m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public AbstractC1872b.a f39286n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39287o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f39289q;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f39292t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f39293u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f39294v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.h f39296x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f39297y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f39298z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ArrayList f39281i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f39282j = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ArrayList f39288p = new ArrayList();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f39290r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f39291s = true;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f39295w = true;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final T f39270A = new a();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final T f39271B = new b();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final V f39272C = new c();

    /* JADX INFO: renamed from: d.H$a */
    public class a extends U {
        public a() {
        }

        @Override // P.T
        public void b(View view) {
            View view2;
            C1621H c1621h = C1621H.this;
            if (c1621h.f39291s && (view2 = c1621h.f39280h) != null) {
                view2.setTranslationY(0.0f);
                C1621H.this.f39277e.setTranslationY(0.0f);
            }
            C1621H.this.f39277e.setVisibility(8);
            C1621H.this.f39277e.setTransitioning(false);
            C1621H c1621h2 = C1621H.this;
            c1621h2.f39296x = null;
            c1621h2.C();
            ActionBarOverlayLayout actionBarOverlayLayout = C1621H.this.f39276d;
            if (actionBarOverlayLayout != null) {
                L.p0(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: renamed from: d.H$b */
    public class b extends U {
        public b() {
        }

        @Override // P.T
        public void b(View view) {
            C1621H c1621h = C1621H.this;
            c1621h.f39296x = null;
            c1621h.f39277e.requestLayout();
        }
    }

    /* JADX INFO: renamed from: d.H$c */
    public class c implements V {
        public c() {
        }

        @Override // P.V
        public void a(View view) {
            ((View) C1621H.this.f39277e.getParent()).invalidate();
        }
    }

    /* JADX INFO: renamed from: d.H$d */
    public class d extends AbstractC1872b implements e.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Context f39302d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final androidx.appcompat.view.menu.e f39303e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public AbstractC1872b.a f39304f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public WeakReference f39305g;

        public d(Context context, AbstractC1872b.a aVar) {
            this.f39302d = context;
            this.f39304f = aVar;
            androidx.appcompat.view.menu.e eVarS = new androidx.appcompat.view.menu.e(context).S(1);
            this.f39303e = eVarS;
            eVarS.R(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            AbstractC1872b.a aVar = this.f39304f;
            if (aVar != null) {
                return aVar.a(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (this.f39304f == null) {
                return;
            }
            k();
            C1621H.this.f39279g.l();
        }

        @Override // i.AbstractC1872b
        public void c() {
            C1621H c1621h = C1621H.this;
            if (c1621h.f39284l != this) {
                return;
            }
            if (C1621H.B(c1621h.f39292t, c1621h.f39293u, false)) {
                this.f39304f.b(this);
            } else {
                C1621H c1621h2 = C1621H.this;
                c1621h2.f39285m = this;
                c1621h2.f39286n = this.f39304f;
            }
            this.f39304f = null;
            C1621H.this.A(false);
            C1621H.this.f39279g.g();
            C1621H c1621h3 = C1621H.this;
            c1621h3.f39276d.setHideOnContentScrollEnabled(c1621h3.f39298z);
            C1621H.this.f39284l = null;
        }

        @Override // i.AbstractC1872b
        public View d() {
            WeakReference weakReference = this.f39305g;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // i.AbstractC1872b
        public Menu e() {
            return this.f39303e;
        }

        @Override // i.AbstractC1872b
        public MenuInflater f() {
            return new i.g(this.f39302d);
        }

        @Override // i.AbstractC1872b
        public CharSequence g() {
            return C1621H.this.f39279g.getSubtitle();
        }

        @Override // i.AbstractC1872b
        public CharSequence i() {
            return C1621H.this.f39279g.getTitle();
        }

        @Override // i.AbstractC1872b
        public void k() {
            if (C1621H.this.f39284l != this) {
                return;
            }
            this.f39303e.d0();
            try {
                this.f39304f.c(this, this.f39303e);
            } finally {
                this.f39303e.c0();
            }
        }

        @Override // i.AbstractC1872b
        public boolean l() {
            return C1621H.this.f39279g.j();
        }

        @Override // i.AbstractC1872b
        public void m(View view) {
            C1621H.this.f39279g.setCustomView(view);
            this.f39305g = new WeakReference(view);
        }

        @Override // i.AbstractC1872b
        public void n(int i9) {
            o(C1621H.this.f39273a.getResources().getString(i9));
        }

        @Override // i.AbstractC1872b
        public void o(CharSequence charSequence) {
            C1621H.this.f39279g.setSubtitle(charSequence);
        }

        @Override // i.AbstractC1872b
        public void q(int i9) {
            r(C1621H.this.f39273a.getResources().getString(i9));
        }

        @Override // i.AbstractC1872b
        public void r(CharSequence charSequence) {
            C1621H.this.f39279g.setTitle(charSequence);
        }

        @Override // i.AbstractC1872b
        public void s(boolean z9) {
            super.s(z9);
            C1621H.this.f39279g.setTitleOptional(z9);
        }

        public boolean t() {
            this.f39303e.d0();
            try {
                return this.f39304f.d(this, this.f39303e);
            } finally {
                this.f39303e.c0();
            }
        }
    }

    public C1621H(Activity activity, boolean z9) {
        this.f39275c = activity;
        View decorView = activity.getWindow().getDecorView();
        I(decorView);
        if (z9) {
            return;
        }
        this.f39280h = decorView.findViewById(R.id.content);
    }

    public C1621H(Dialog dialog) {
        I(dialog.getWindow().getDecorView());
    }

    public static boolean B(boolean z9, boolean z10, boolean z11) {
        if (z11) {
            return true;
        }
        return (z9 || z10) ? false : true;
    }

    public void A(boolean z9) {
        S sM;
        S sF;
        if (z9) {
            P();
        } else {
            H();
        }
        if (!O()) {
            if (z9) {
                this.f39278f.w(4);
                this.f39279g.setVisibility(0);
                return;
            } else {
                this.f39278f.w(0);
                this.f39279g.setVisibility(8);
                return;
            }
        }
        if (z9) {
            sF = this.f39278f.m(4, 100L);
            sM = this.f39279g.f(0, 200L);
        } else {
            sM = this.f39278f.m(0, 200L);
            sF = this.f39279g.f(8, 100L);
        }
        i.h hVar = new i.h();
        hVar.d(sF, sM);
        hVar.h();
    }

    public void C() {
        AbstractC1872b.a aVar = this.f39286n;
        if (aVar != null) {
            aVar.b(this.f39285m);
            this.f39285m = null;
            this.f39286n = null;
        }
    }

    public void D(boolean z9) {
        View view;
        i.h hVar = this.f39296x;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f39290r != 0 || (!this.f39297y && !z9)) {
            this.f39270A.b(null);
            return;
        }
        this.f39277e.setAlpha(1.0f);
        this.f39277e.setTransitioning(true);
        i.h hVar2 = new i.h();
        float f9 = -this.f39277e.getHeight();
        if (z9) {
            this.f39277e.getLocationInWindow(new int[]{0, 0});
            f9 -= r5[1];
        }
        S sO = L.e(this.f39277e).o(f9);
        sO.m(this.f39272C);
        hVar2.c(sO);
        if (this.f39291s && (view = this.f39280h) != null) {
            hVar2.c(L.e(view).o(f9));
        }
        hVar2.f(f39268D);
        hVar2.e(250L);
        hVar2.g(this.f39270A);
        this.f39296x = hVar2;
        hVar2.h();
    }

    public void E(boolean z9) {
        View view;
        View view2;
        i.h hVar = this.f39296x;
        if (hVar != null) {
            hVar.a();
        }
        this.f39277e.setVisibility(0);
        if (this.f39290r == 0 && (this.f39297y || z9)) {
            this.f39277e.setTranslationY(0.0f);
            float f9 = -this.f39277e.getHeight();
            if (z9) {
                this.f39277e.getLocationInWindow(new int[]{0, 0});
                f9 -= r5[1];
            }
            this.f39277e.setTranslationY(f9);
            i.h hVar2 = new i.h();
            S sO = L.e(this.f39277e).o(0.0f);
            sO.m(this.f39272C);
            hVar2.c(sO);
            if (this.f39291s && (view2 = this.f39280h) != null) {
                view2.setTranslationY(f9);
                hVar2.c(L.e(this.f39280h).o(0.0f));
            }
            hVar2.f(f39269E);
            hVar2.e(250L);
            hVar2.g(this.f39271B);
            this.f39296x = hVar2;
            hVar2.h();
        } else {
            this.f39277e.setAlpha(1.0f);
            this.f39277e.setTranslationY(0.0f);
            if (this.f39291s && (view = this.f39280h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f39271B.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f39276d;
        if (actionBarOverlayLayout != null) {
            L.p0(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final k.H F(View view) {
        if (view instanceof k.H) {
            return (k.H) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : Constants.NULL_VERSION_ID);
        throw new IllegalStateException(sb.toString());
    }

    public int G() {
        return this.f39278f.l();
    }

    public final void H() {
        if (this.f39294v) {
            this.f39294v = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f39276d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            Q(false);
        }
    }

    public final void I(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(c.f.f17866p);
        this.f39276d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f39278f = F(view.findViewById(c.f.f17851a));
        this.f39279g = (ActionBarContextView) view.findViewById(c.f.f17856f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(c.f.f17853c);
        this.f39277e = actionBarContainer;
        k.H h9 = this.f39278f;
        if (h9 == null || this.f39279g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f39273a = h9.getContext();
        boolean z9 = (this.f39278f.x() & 4) != 0;
        if (z9) {
            this.f39283k = true;
        }
        C1871a c1871aB = C1871a.b(this.f39273a);
        N(c1871aB.a() || z9);
        L(c1871aB.e());
        TypedArray typedArrayObtainStyledAttributes = this.f39273a.obtainStyledAttributes(null, c.j.f18046a, AbstractC1238a.f17744c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(c.j.f18098k, false)) {
            M(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(c.j.f18088i, 0);
        if (dimensionPixelSize != 0) {
            K(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void J(int i9, int i10) {
        int iX = this.f39278f.x();
        if ((i10 & 4) != 0) {
            this.f39283k = true;
        }
        this.f39278f.i((i9 & i10) | ((~i10) & iX));
    }

    public void K(float f9) {
        L.A0(this.f39277e, f9);
    }

    public final void L(boolean z9) {
        this.f39289q = z9;
        if (z9) {
            this.f39277e.setTabContainer(null);
            this.f39278f.s(null);
        } else {
            this.f39278f.s(null);
            this.f39277e.setTabContainer(null);
        }
        boolean z10 = false;
        boolean z11 = G() == 2;
        this.f39278f.q(!this.f39289q && z11);
        ActionBarOverlayLayout actionBarOverlayLayout = this.f39276d;
        if (!this.f39289q && z11) {
            z10 = true;
        }
        actionBarOverlayLayout.setHasNonEmbeddedTabs(z10);
    }

    public void M(boolean z9) {
        if (z9 && !this.f39276d.w()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f39298z = z9;
        this.f39276d.setHideOnContentScrollEnabled(z9);
    }

    public void N(boolean z9) {
        this.f39278f.o(z9);
    }

    public final boolean O() {
        return L.W(this.f39277e);
    }

    public final void P() {
        if (this.f39294v) {
            return;
        }
        this.f39294v = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f39276d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        Q(false);
    }

    public final void Q(boolean z9) {
        if (B(this.f39292t, this.f39293u, this.f39294v)) {
            if (this.f39295w) {
                return;
            }
            this.f39295w = true;
            E(z9);
            return;
        }
        if (this.f39295w) {
            this.f39295w = false;
            D(z9);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f39293u) {
            this.f39293u = false;
            Q(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b(int i9) {
        this.f39290r = i9;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c() {
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d(boolean z9) {
        this.f39291s = z9;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        if (this.f39293u) {
            return;
        }
        this.f39293u = true;
        Q(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void f() {
        i.h hVar = this.f39296x;
        if (hVar != null) {
            hVar.a();
            this.f39296x = null;
        }
    }

    @Override // d.AbstractC1622a
    public boolean h() {
        k.H h9 = this.f39278f;
        if (h9 == null || !h9.h()) {
            return false;
        }
        this.f39278f.collapseActionView();
        return true;
    }

    @Override // d.AbstractC1622a
    public void i(boolean z9) {
        if (z9 == this.f39287o) {
            return;
        }
        this.f39287o = z9;
        if (this.f39288p.size() <= 0) {
            return;
        }
        AbstractC1617D.a(this.f39288p.get(0));
        throw null;
    }

    @Override // d.AbstractC1622a
    public int j() {
        return this.f39278f.x();
    }

    @Override // d.AbstractC1622a
    public Context k() {
        if (this.f39274b == null) {
            TypedValue typedValue = new TypedValue();
            this.f39273a.getTheme().resolveAttribute(AbstractC1238a.f17746e, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                this.f39274b = new ContextThemeWrapper(this.f39273a, i9);
            } else {
                this.f39274b = this.f39273a;
            }
        }
        return this.f39274b;
    }

    @Override // d.AbstractC1622a
    public void l() {
        if (this.f39292t) {
            return;
        }
        this.f39292t = true;
        Q(false);
    }

    @Override // d.AbstractC1622a
    public void n(Configuration configuration) {
        L(C1871a.b(this.f39273a).e());
    }

    @Override // d.AbstractC1622a
    public boolean p(int i9, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f39284l;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i9, keyEvent, 0);
    }

    @Override // d.AbstractC1622a
    public void s(boolean z9) {
        if (this.f39283k) {
            return;
        }
        t(z9);
    }

    @Override // d.AbstractC1622a
    public void t(boolean z9) {
        J(z9 ? 4 : 0, 4);
    }

    @Override // d.AbstractC1622a
    public void u(int i9) {
        this.f39278f.u(i9);
    }

    @Override // d.AbstractC1622a
    public void v(boolean z9) {
        i.h hVar;
        this.f39297y = z9;
        if (z9 || (hVar = this.f39296x) == null) {
            return;
        }
        hVar.a();
    }

    @Override // d.AbstractC1622a
    public void w(CharSequence charSequence) {
        this.f39278f.j(charSequence);
    }

    @Override // d.AbstractC1622a
    public void x(CharSequence charSequence) {
        this.f39278f.setTitle(charSequence);
    }

    @Override // d.AbstractC1622a
    public void y(CharSequence charSequence) {
        this.f39278f.setWindowTitle(charSequence);
    }

    @Override // d.AbstractC1622a
    public AbstractC1872b z(AbstractC1872b.a aVar) {
        d dVar = this.f39284l;
        if (dVar != null) {
            dVar.c();
        }
        this.f39276d.setHideOnContentScrollEnabled(false);
        this.f39279g.k();
        d dVar2 = new d(this.f39279g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f39284l = dVar2;
        dVar2.k();
        this.f39279g.h(dVar2);
        A(true);
        return dVar2;
    }
}
