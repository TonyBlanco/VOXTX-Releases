package V4;

import P.L;
import R4.b;
import R4.l;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import com.google.android.material.button.MaterialButton;
import f5.w;
import i5.AbstractC1893c;
import j5.AbstractC2100b;
import j5.C2099a;
import l5.C2198g;
import l5.k;
import l5.n;

/* JADX INFO: loaded from: classes3.dex */
public class a {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final boolean f10044t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final boolean f10045u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MaterialButton f10046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f10047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10048c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f10049d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f10050e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f10051f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f10052g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f10053h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public PorterDuff.Mode f10054i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ColorStateList f10055j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ColorStateList f10056k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ColorStateList f10057l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Drawable f10058m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f10059n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f10060o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f10061p = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f10062q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public LayerDrawable f10063r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f10064s;

    static {
        int i9 = Build.VERSION.SDK_INT;
        f10044t = true;
        f10045u = i9 <= 22;
    }

    public a(MaterialButton materialButton, k kVar) {
        this.f10046a = materialButton;
        this.f10047b = kVar;
    }

    public void A(ColorStateList colorStateList) {
        if (this.f10056k != colorStateList) {
            this.f10056k = colorStateList;
            I();
        }
    }

    public void B(int i9) {
        if (this.f10053h != i9) {
            this.f10053h = i9;
            I();
        }
    }

    public void C(ColorStateList colorStateList) {
        if (this.f10055j != colorStateList) {
            this.f10055j = colorStateList;
            if (f() != null) {
                H.a.o(f(), this.f10055j);
            }
        }
    }

    public void D(PorterDuff.Mode mode) {
        if (this.f10054i != mode) {
            this.f10054i = mode;
            if (f() == null || this.f10054i == null) {
                return;
            }
            H.a.p(f(), this.f10054i);
        }
    }

    public final void E(int i9, int i10) {
        int iJ = L.J(this.f10046a);
        int paddingTop = this.f10046a.getPaddingTop();
        int I9 = L.I(this.f10046a);
        int paddingBottom = this.f10046a.getPaddingBottom();
        int i11 = this.f10050e;
        int i12 = this.f10051f;
        this.f10051f = i10;
        this.f10050e = i9;
        if (!this.f10060o) {
            F();
        }
        L.F0(this.f10046a, iJ, (paddingTop + i9) - i11, I9, (paddingBottom + i10) - i12);
    }

    public final void F() {
        this.f10046a.setInternalBackground(a());
        C2198g c2198gF = f();
        if (c2198gF != null) {
            c2198gF.V(this.f10064s);
        }
    }

    public final void G(k kVar) {
        if (f10045u && !this.f10060o) {
            int iJ = L.J(this.f10046a);
            int paddingTop = this.f10046a.getPaddingTop();
            int I9 = L.I(this.f10046a);
            int paddingBottom = this.f10046a.getPaddingBottom();
            F();
            L.F0(this.f10046a, iJ, paddingTop, I9, paddingBottom);
            return;
        }
        if (f() != null) {
            f().setShapeAppearanceModel(kVar);
        }
        if (n() != null) {
            n().setShapeAppearanceModel(kVar);
        }
        if (e() != null) {
            e().setShapeAppearanceModel(kVar);
        }
    }

    public void H(int i9, int i10) {
        Drawable drawable = this.f10058m;
        if (drawable != null) {
            drawable.setBounds(this.f10048c, this.f10050e, i10 - this.f10049d, i9 - this.f10051f);
        }
    }

    public final void I() {
        C2198g c2198gF = f();
        C2198g c2198gN = n();
        if (c2198gF != null) {
            c2198gF.b0(this.f10053h, this.f10056k);
            if (c2198gN != null) {
                c2198gN.a0(this.f10053h, this.f10059n ? Z4.a.d(this.f10046a, b.f8678m) : 0);
            }
        }
    }

    public final InsetDrawable J(Drawable drawable) {
        return new InsetDrawable(drawable, this.f10048c, this.f10050e, this.f10049d, this.f10051f);
    }

    public final Drawable a() {
        C2198g c2198g = new C2198g(this.f10047b);
        c2198g.L(this.f10046a.getContext());
        H.a.o(c2198g, this.f10055j);
        PorterDuff.Mode mode = this.f10054i;
        if (mode != null) {
            H.a.p(c2198g, mode);
        }
        c2198g.b0(this.f10053h, this.f10056k);
        C2198g c2198g2 = new C2198g(this.f10047b);
        c2198g2.setTint(0);
        c2198g2.a0(this.f10053h, this.f10059n ? Z4.a.d(this.f10046a, b.f8678m) : 0);
        if (f10044t) {
            C2198g c2198g3 = new C2198g(this.f10047b);
            this.f10058m = c2198g3;
            H.a.n(c2198g3, -1);
            RippleDrawable rippleDrawable = new RippleDrawable(AbstractC2100b.d(this.f10057l), J(new LayerDrawable(new Drawable[]{c2198g2, c2198g})), this.f10058m);
            this.f10063r = rippleDrawable;
            return rippleDrawable;
        }
        C2099a c2099a = new C2099a(this.f10047b);
        this.f10058m = c2099a;
        H.a.o(c2099a, AbstractC2100b.d(this.f10057l));
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{c2198g2, c2198g, this.f10058m});
        this.f10063r = layerDrawable;
        return J(layerDrawable);
    }

    public int b() {
        return this.f10052g;
    }

    public int c() {
        return this.f10051f;
    }

    public int d() {
        return this.f10050e;
    }

    public n e() {
        LayerDrawable layerDrawable = this.f10063r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 1) {
            return null;
        }
        return (n) (this.f10063r.getNumberOfLayers() > 2 ? this.f10063r.getDrawable(2) : this.f10063r.getDrawable(1));
    }

    public C2198g f() {
        return g(false);
    }

    public final C2198g g(boolean z9) {
        LayerDrawable layerDrawable = this.f10063r;
        if (layerDrawable == null || layerDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (C2198g) (f10044t ? (LayerDrawable) ((InsetDrawable) this.f10063r.getDrawable(0)).getDrawable() : this.f10063r).getDrawable(!z9 ? 1 : 0);
    }

    public ColorStateList h() {
        return this.f10057l;
    }

    public k i() {
        return this.f10047b;
    }

    public ColorStateList j() {
        return this.f10056k;
    }

    public int k() {
        return this.f10053h;
    }

    public ColorStateList l() {
        return this.f10055j;
    }

    public PorterDuff.Mode m() {
        return this.f10054i;
    }

    public final C2198g n() {
        return g(true);
    }

    public boolean o() {
        return this.f10060o;
    }

    public boolean p() {
        return this.f10062q;
    }

    public void q(TypedArray typedArray) {
        this.f10048c = typedArray.getDimensionPixelOffset(l.f8978N2, 0);
        this.f10049d = typedArray.getDimensionPixelOffset(l.f8986O2, 0);
        this.f10050e = typedArray.getDimensionPixelOffset(l.f8994P2, 0);
        this.f10051f = typedArray.getDimensionPixelOffset(l.f9002Q2, 0);
        if (typedArray.hasValue(l.f9034U2)) {
            int dimensionPixelSize = typedArray.getDimensionPixelSize(l.f9034U2, -1);
            this.f10052g = dimensionPixelSize;
            y(this.f10047b.w(dimensionPixelSize));
            this.f10061p = true;
        }
        this.f10053h = typedArray.getDimensionPixelSize(l.f9119e3, 0);
        this.f10054i = w.f(typedArray.getInt(l.f9026T2, -1), PorterDuff.Mode.SRC_IN);
        this.f10055j = AbstractC1893c.a(this.f10046a.getContext(), typedArray, l.f9018S2);
        this.f10056k = AbstractC1893c.a(this.f10046a.getContext(), typedArray, l.f9110d3);
        this.f10057l = AbstractC1893c.a(this.f10046a.getContext(), typedArray, l.f9101c3);
        this.f10062q = typedArray.getBoolean(l.f9010R2, false);
        this.f10064s = typedArray.getDimensionPixelSize(l.f9042V2, 0);
        int iJ = L.J(this.f10046a);
        int paddingTop = this.f10046a.getPaddingTop();
        int I9 = L.I(this.f10046a);
        int paddingBottom = this.f10046a.getPaddingBottom();
        if (typedArray.hasValue(l.f8970M2)) {
            s();
        } else {
            F();
        }
        L.F0(this.f10046a, iJ + this.f10048c, paddingTop + this.f10050e, I9 + this.f10049d, paddingBottom + this.f10051f);
    }

    public void r(int i9) {
        if (f() != null) {
            f().setTint(i9);
        }
    }

    public void s() {
        this.f10060o = true;
        this.f10046a.setSupportBackgroundTintList(this.f10055j);
        this.f10046a.setSupportBackgroundTintMode(this.f10054i);
    }

    public void t(boolean z9) {
        this.f10062q = z9;
    }

    public void u(int i9) {
        if (this.f10061p && this.f10052g == i9) {
            return;
        }
        this.f10052g = i9;
        this.f10061p = true;
        y(this.f10047b.w(i9));
    }

    public void v(int i9) {
        E(this.f10050e, i9);
    }

    public void w(int i9) {
        E(i9, this.f10051f);
    }

    public void x(ColorStateList colorStateList) {
        if (this.f10057l != colorStateList) {
            this.f10057l = colorStateList;
            boolean z9 = f10044t;
            if (z9 && (this.f10046a.getBackground() instanceof RippleDrawable)) {
                ((RippleDrawable) this.f10046a.getBackground()).setColor(AbstractC2100b.d(colorStateList));
            } else {
                if (z9 || !(this.f10046a.getBackground() instanceof C2099a)) {
                    return;
                }
                ((C2099a) this.f10046a.getBackground()).setTintList(AbstractC2100b.d(colorStateList));
            }
        }
    }

    public void y(k kVar) {
        this.f10047b = kVar;
        G(kVar);
    }

    public void z(boolean z9) {
        this.f10059n = z9;
        I();
    }
}
