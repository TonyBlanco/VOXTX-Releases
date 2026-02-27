package O1;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import c2.C1251d;
import j2.C2087m;
import j2.InterfaceC2081g;
import l2.C2174a;
import m2.C2220a;
import m2.C2225f;
import m2.InterfaceC2221b;
import m2.InterfaceC2222c;
import m2.InterfaceC2223d;
import o2.InterfaceC2315j;
import p2.C2390a;
import q2.AbstractC2539h;

/* JADX INFO: loaded from: classes.dex */
public abstract class e implements Cloneable {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f5423A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f5424B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public Drawable f5425C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f5426D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f5427a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f5428c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f5429d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Class f5430e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final C2087m f5431f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC2081g f5432g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public C2174a f5433h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Object f5434i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public S1.c f5435j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f5436k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f5437l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f5438m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public InterfaceC2223d f5439n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Float f5440o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e f5441p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Float f5442q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Drawable f5443r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Drawable f5444s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i f5445t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f5446u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n2.d f5447v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f5448w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f5449x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public U1.b f5450y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public S1.g f5451z;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5452a;

        static {
            int[] iArr = new int[ImageView.ScaleType.values().length];
            f5452a = iArr;
            try {
                iArr[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f5452a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f5452a[ImageView.ScaleType.FIT_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f5452a[ImageView.ScaleType.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public e(Context context, Class cls, l2.f fVar, Class cls2, g gVar, C2087m c2087m, InterfaceC2081g interfaceC2081g) {
        this.f5435j = C2390a.b();
        this.f5442q = Float.valueOf(1.0f);
        this.f5445t = null;
        this.f5446u = true;
        this.f5447v = n2.e.d();
        this.f5448w = -1;
        this.f5449x = -1;
        this.f5450y = U1.b.RESULT;
        this.f5451z = C1251d.b();
        this.f5428c = context;
        this.f5427a = cls;
        this.f5430e = cls2;
        this.f5429d = gVar;
        this.f5431f = c2087m;
        this.f5432g = interfaceC2081g;
        this.f5433h = fVar != null ? new C2174a(fVar) : null;
        if (context == null) {
            throw new NullPointerException("Context can't be null");
        }
        if (cls != null && fVar == null) {
            throw new NullPointerException("LoadProvider must not be null");
        }
    }

    public e(l2.f fVar, Class cls, e eVar) {
        this(eVar.f5428c, eVar.f5427a, fVar, cls, eVar.f5429d, eVar.f5431f, eVar.f5432g);
        this.f5434i = eVar.f5434i;
        this.f5436k = eVar.f5436k;
        this.f5435j = eVar.f5435j;
        this.f5450y = eVar.f5450y;
        this.f5446u = eVar.f5446u;
    }

    public e b(n2.d dVar) {
        if (dVar == null) {
            throw new NullPointerException("Animation factory must not be null!");
        }
        this.f5447v = dVar;
        return this;
    }

    public void d() {
    }

    public void e() {
    }

    public final InterfaceC2221b f(InterfaceC2315j interfaceC2315j) {
        if (this.f5445t == null) {
            this.f5445t = i.NORMAL;
        }
        return g(interfaceC2315j, null);
    }

    public final InterfaceC2221b g(InterfaceC2315j interfaceC2315j, C2225f c2225f) {
        C2225f c2225f2;
        InterfaceC2221b interfaceC2221bP;
        InterfaceC2221b interfaceC2221bP2;
        e eVar = this.f5441p;
        if (eVar != null) {
            if (this.f5424B) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            if (eVar.f5447v.equals(n2.e.d())) {
                this.f5441p.f5447v = this.f5447v;
            }
            e eVar2 = this.f5441p;
            if (eVar2.f5445t == null) {
                eVar2.f5445t = k();
            }
            if (AbstractC2539h.k(this.f5449x, this.f5448w)) {
                e eVar3 = this.f5441p;
                if (!AbstractC2539h.k(eVar3.f5449x, eVar3.f5448w)) {
                    this.f5441p.q(this.f5449x, this.f5448w);
                }
            }
            c2225f2 = new C2225f(c2225f);
            interfaceC2221bP = p(interfaceC2315j, this.f5442q.floatValue(), this.f5445t, c2225f2);
            this.f5424B = true;
            interfaceC2221bP2 = this.f5441p.g(interfaceC2315j, c2225f2);
            this.f5424B = false;
        } else {
            if (this.f5440o == null) {
                return p(interfaceC2315j, this.f5442q.floatValue(), this.f5445t, c2225f);
            }
            c2225f2 = new C2225f(c2225f);
            interfaceC2221bP = p(interfaceC2315j, this.f5442q.floatValue(), this.f5445t, c2225f2);
            interfaceC2221bP2 = p(interfaceC2315j, this.f5440o.floatValue(), k(), c2225f2);
        }
        c2225f2.k(interfaceC2221bP, interfaceC2221bP2);
        return c2225f2;
    }

    @Override // 
    public e h() {
        try {
            e eVar = (e) super.clone();
            C2174a c2174a = this.f5433h;
            eVar.f5433h = c2174a != null ? c2174a.clone() : null;
            return eVar;
        } catch (CloneNotSupportedException e9) {
            throw new RuntimeException(e9);
        }
    }

    public e i(S1.e eVar) {
        C2174a c2174a = this.f5433h;
        if (c2174a != null) {
            c2174a.j(eVar);
        }
        return this;
    }

    public e j(U1.b bVar) {
        this.f5450y = bVar;
        return this;
    }

    public final i k() {
        i iVar = this.f5445t;
        return iVar == i.LOW ? i.NORMAL : iVar == i.NORMAL ? i.HIGH : i.IMMEDIATE;
    }

    public InterfaceC2315j l(ImageView imageView) {
        AbstractC2539h.a();
        if (imageView == null) {
            throw new IllegalArgumentException("You must pass in a non null View");
        }
        if (!this.f5423A && imageView.getScaleType() != null) {
            int i9 = a.f5452a[imageView.getScaleType().ordinal()];
            if (i9 == 1) {
                d();
            } else if (i9 == 2 || i9 == 3 || i9 == 4) {
                e();
            }
        }
        return m(this.f5429d.c(imageView, this.f5430e));
    }

    public InterfaceC2315j m(InterfaceC2315j interfaceC2315j) {
        AbstractC2539h.a();
        if (interfaceC2315j == null) {
            throw new IllegalArgumentException("You must pass in a non null Target");
        }
        if (!this.f5436k) {
            throw new IllegalArgumentException("You must first set a model (try #load())");
        }
        InterfaceC2221b interfaceC2221bE = interfaceC2315j.e();
        if (interfaceC2221bE != null) {
            interfaceC2221bE.clear();
            this.f5431f.c(interfaceC2221bE);
            interfaceC2221bE.b();
        }
        InterfaceC2221b interfaceC2221bF = f(interfaceC2315j);
        interfaceC2315j.h(interfaceC2221bF);
        this.f5432g.a(interfaceC2315j);
        this.f5431f.f(interfaceC2221bF);
        return interfaceC2315j;
    }

    public e n(InterfaceC2223d interfaceC2223d) {
        this.f5439n = interfaceC2223d;
        return this;
    }

    public e o(Object obj) {
        this.f5434i = obj;
        this.f5436k = true;
        return this;
    }

    public final InterfaceC2221b p(InterfaceC2315j interfaceC2315j, float f9, i iVar, InterfaceC2222c interfaceC2222c) {
        return C2220a.t(this.f5433h, this.f5434i, this.f5435j, this.f5428c, iVar, interfaceC2315j, f9, this.f5443r, this.f5437l, this.f5444s, this.f5438m, this.f5425C, this.f5426D, this.f5439n, interfaceC2222c, this.f5429d.p(), this.f5451z, this.f5430e, this.f5446u, this.f5447v, this.f5449x, this.f5448w, this.f5450y);
    }

    public e q(int i9, int i10) {
        if (!AbstractC2539h.k(i9, i10)) {
            throw new IllegalArgumentException("Width and height must be Target#SIZE_ORIGINAL or > 0");
        }
        this.f5449x = i9;
        this.f5448w = i10;
        return this;
    }

    public e s(S1.c cVar) {
        if (cVar == null) {
            throw new NullPointerException("Signature must not be null");
        }
        this.f5435j = cVar;
        return this;
    }

    public e t(boolean z9) {
        this.f5446u = !z9;
        return this;
    }

    public e u(S1.b bVar) {
        C2174a c2174a = this.f5433h;
        if (c2174a != null) {
            c2174a.k(bVar);
        }
        return this;
    }

    public e v(S1.g... gVarArr) {
        this.f5423A = true;
        if (gVarArr.length == 1) {
            this.f5451z = gVarArr[0];
        } else {
            this.f5451z = new S1.d(gVarArr);
        }
        return this;
    }
}
