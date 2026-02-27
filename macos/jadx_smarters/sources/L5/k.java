package l5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* JADX INFO: loaded from: classes3.dex */
public class k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final InterfaceC2194c f44133m = new i(0.5f);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public AbstractC2195d f44134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AbstractC2195d f44135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public AbstractC2195d f44136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AbstractC2195d f44137d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public InterfaceC2194c f44138e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC2194c f44139f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public InterfaceC2194c f44140g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC2194c f44141h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public C2197f f44142i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C2197f f44143j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public C2197f f44144k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public C2197f f44145l;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC2195d f44146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC2195d f44147b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC2195d f44148c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC2195d f44149d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC2194c f44150e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public InterfaceC2194c f44151f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public InterfaceC2194c f44152g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public InterfaceC2194c f44153h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public C2197f f44154i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public C2197f f44155j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public C2197f f44156k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public C2197f f44157l;

        public b() {
            this.f44146a = h.b();
            this.f44147b = h.b();
            this.f44148c = h.b();
            this.f44149d = h.b();
            this.f44150e = new C2192a(0.0f);
            this.f44151f = new C2192a(0.0f);
            this.f44152g = new C2192a(0.0f);
            this.f44153h = new C2192a(0.0f);
            this.f44154i = h.c();
            this.f44155j = h.c();
            this.f44156k = h.c();
            this.f44157l = h.c();
        }

        public b(k kVar) {
            this.f44146a = h.b();
            this.f44147b = h.b();
            this.f44148c = h.b();
            this.f44149d = h.b();
            this.f44150e = new C2192a(0.0f);
            this.f44151f = new C2192a(0.0f);
            this.f44152g = new C2192a(0.0f);
            this.f44153h = new C2192a(0.0f);
            this.f44154i = h.c();
            this.f44155j = h.c();
            this.f44156k = h.c();
            this.f44157l = h.c();
            this.f44146a = kVar.f44134a;
            this.f44147b = kVar.f44135b;
            this.f44148c = kVar.f44136c;
            this.f44149d = kVar.f44137d;
            this.f44150e = kVar.f44138e;
            this.f44151f = kVar.f44139f;
            this.f44152g = kVar.f44140g;
            this.f44153h = kVar.f44141h;
            this.f44154i = kVar.f44142i;
            this.f44155j = kVar.f44143j;
            this.f44156k = kVar.f44144k;
            this.f44157l = kVar.f44145l;
        }

        public static float n(AbstractC2195d abstractC2195d) {
            if (abstractC2195d instanceof j) {
                return ((j) abstractC2195d).f44132a;
            }
            if (abstractC2195d instanceof C2196e) {
                return ((C2196e) abstractC2195d).f44080a;
            }
            return -1.0f;
        }

        public b A(float f9) {
            this.f44150e = new C2192a(f9);
            return this;
        }

        public b B(InterfaceC2194c interfaceC2194c) {
            this.f44150e = interfaceC2194c;
            return this;
        }

        public b C(int i9, InterfaceC2194c interfaceC2194c) {
            return D(h.a(i9)).F(interfaceC2194c);
        }

        public b D(AbstractC2195d abstractC2195d) {
            this.f44147b = abstractC2195d;
            float fN = n(abstractC2195d);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f9) {
            this.f44151f = new C2192a(f9);
            return this;
        }

        public b F(InterfaceC2194c interfaceC2194c) {
            this.f44151f = interfaceC2194c;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f9) {
            return A(f9).E(f9).w(f9).s(f9);
        }

        public b p(InterfaceC2194c interfaceC2194c) {
            return B(interfaceC2194c).F(interfaceC2194c).x(interfaceC2194c).t(interfaceC2194c);
        }

        public b q(int i9, InterfaceC2194c interfaceC2194c) {
            return r(h.a(i9)).t(interfaceC2194c);
        }

        public b r(AbstractC2195d abstractC2195d) {
            this.f44149d = abstractC2195d;
            float fN = n(abstractC2195d);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f9) {
            this.f44153h = new C2192a(f9);
            return this;
        }

        public b t(InterfaceC2194c interfaceC2194c) {
            this.f44153h = interfaceC2194c;
            return this;
        }

        public b u(int i9, InterfaceC2194c interfaceC2194c) {
            return v(h.a(i9)).x(interfaceC2194c);
        }

        public b v(AbstractC2195d abstractC2195d) {
            this.f44148c = abstractC2195d;
            float fN = n(abstractC2195d);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f9) {
            this.f44152g = new C2192a(f9);
            return this;
        }

        public b x(InterfaceC2194c interfaceC2194c) {
            this.f44152g = interfaceC2194c;
            return this;
        }

        public b y(int i9, InterfaceC2194c interfaceC2194c) {
            return z(h.a(i9)).B(interfaceC2194c);
        }

        public b z(AbstractC2195d abstractC2195d) {
            this.f44146a = abstractC2195d;
            float fN = n(abstractC2195d);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }
    }

    public interface c {
        InterfaceC2194c a(InterfaceC2194c interfaceC2194c);
    }

    public k() {
        this.f44134a = h.b();
        this.f44135b = h.b();
        this.f44136c = h.b();
        this.f44137d = h.b();
        this.f44138e = new C2192a(0.0f);
        this.f44139f = new C2192a(0.0f);
        this.f44140g = new C2192a(0.0f);
        this.f44141h = new C2192a(0.0f);
        this.f44142i = h.c();
        this.f44143j = h.c();
        this.f44144k = h.c();
        this.f44145l = h.c();
    }

    public k(b bVar) {
        this.f44134a = bVar.f44146a;
        this.f44135b = bVar.f44147b;
        this.f44136c = bVar.f44148c;
        this.f44137d = bVar.f44149d;
        this.f44138e = bVar.f44150e;
        this.f44139f = bVar.f44151f;
        this.f44140g = bVar.f44152g;
        this.f44141h = bVar.f44153h;
        this.f44142i = bVar.f44154i;
        this.f44143j = bVar.f44155j;
        this.f44144k = bVar.f44156k;
        this.f44145l = bVar.f44157l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i9, int i10) {
        return c(context, i9, i10, 0);
    }

    public static b c(Context context, int i9, int i10, int i11) {
        return d(context, i9, i10, new C2192a(i11));
    }

    public static b d(Context context, int i9, int i10, InterfaceC2194c interfaceC2194c) {
        if (i10 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i9);
            i9 = i10;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i9, R4.l.f8916F4);
        try {
            int i11 = typedArrayObtainStyledAttributes.getInt(R4.l.f8924G4, 0);
            int i12 = typedArrayObtainStyledAttributes.getInt(R4.l.f8948J4, i11);
            int i13 = typedArrayObtainStyledAttributes.getInt(R4.l.f8956K4, i11);
            int i14 = typedArrayObtainStyledAttributes.getInt(R4.l.f8940I4, i11);
            int i15 = typedArrayObtainStyledAttributes.getInt(R4.l.f8932H4, i11);
            InterfaceC2194c interfaceC2194cM = m(typedArrayObtainStyledAttributes, R4.l.f8964L4, interfaceC2194c);
            InterfaceC2194c interfaceC2194cM2 = m(typedArrayObtainStyledAttributes, R4.l.f8988O4, interfaceC2194cM);
            InterfaceC2194c interfaceC2194cM3 = m(typedArrayObtainStyledAttributes, R4.l.f8996P4, interfaceC2194cM);
            InterfaceC2194c interfaceC2194cM4 = m(typedArrayObtainStyledAttributes, R4.l.f8980N4, interfaceC2194cM);
            return new b().y(i12, interfaceC2194cM2).C(i13, interfaceC2194cM3).u(i14, interfaceC2194cM4).q(i15, m(typedArrayObtainStyledAttributes, R4.l.f8972M4, interfaceC2194cM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i9, int i10) {
        return f(context, attributeSet, i9, i10, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i9, int i10, int i11) {
        return g(context, attributeSet, i9, i10, new C2192a(i11));
    }

    public static b g(Context context, AttributeSet attributeSet, int i9, int i10, InterfaceC2194c interfaceC2194c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R4.l.f8971M3, i9, i10);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R4.l.f8979N3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R4.l.f8987O3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, interfaceC2194c);
    }

    public static InterfaceC2194c m(TypedArray typedArray, int i9, InterfaceC2194c interfaceC2194c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i9);
        if (typedValuePeekValue == null) {
            return interfaceC2194c;
        }
        int i10 = typedValuePeekValue.type;
        return i10 == 5 ? new C2192a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i10 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC2194c;
    }

    public C2197f h() {
        return this.f44144k;
    }

    public AbstractC2195d i() {
        return this.f44137d;
    }

    public InterfaceC2194c j() {
        return this.f44141h;
    }

    public AbstractC2195d k() {
        return this.f44136c;
    }

    public InterfaceC2194c l() {
        return this.f44140g;
    }

    public C2197f n() {
        return this.f44145l;
    }

    public C2197f o() {
        return this.f44143j;
    }

    public C2197f p() {
        return this.f44142i;
    }

    public AbstractC2195d q() {
        return this.f44134a;
    }

    public InterfaceC2194c r() {
        return this.f44138e;
    }

    public AbstractC2195d s() {
        return this.f44135b;
    }

    public InterfaceC2194c t() {
        return this.f44139f;
    }

    public boolean u(RectF rectF) {
        boolean z9 = this.f44145l.getClass().equals(C2197f.class) && this.f44143j.getClass().equals(C2197f.class) && this.f44142i.getClass().equals(C2197f.class) && this.f44144k.getClass().equals(C2197f.class);
        float fA = this.f44138e.a(rectF);
        return z9 && ((this.f44139f.a(rectF) > fA ? 1 : (this.f44139f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f44141h.a(rectF) > fA ? 1 : (this.f44141h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f44140g.a(rectF) > fA ? 1 : (this.f44140g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f44135b instanceof j) && (this.f44134a instanceof j) && (this.f44136c instanceof j) && (this.f44137d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f9) {
        return v().o(f9).m();
    }

    public k x(InterfaceC2194c interfaceC2194c) {
        return v().p(interfaceC2194c).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}
