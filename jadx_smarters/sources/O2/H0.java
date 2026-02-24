package O2;

import O2.H0;
import O2.InterfaceC0901n;
import android.net.Uri;
import android.os.Bundle;
import d4.AbstractC1684a;
import d4.AbstractC1687d;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import s5.AbstractC2717A;
import s5.AbstractC2743y;
import z3.C3028H;

/* JADX INFO: loaded from: classes3.dex */
public final class H0 implements InterfaceC0901n {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final H0 f5519j = new c().a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final String f5520k = d4.k0.A0(0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final String f5521l = d4.k0.A0(1);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f5522m = d4.k0.A0(2);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final String f5523n = d4.k0.A0(3);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final String f5524o = d4.k0.A0(4);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final String f5525p = d4.k0.A0(5);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final InterfaceC0901n.a f5526q = new InterfaceC0901n.a() { // from class: O2.G0
        @Override // O2.InterfaceC0901n.a
        public final InterfaceC0901n a(Bundle bundle) {
            return H0.c(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5527a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f5528c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h f5529d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final g f5530e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final R0 f5531f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f5532g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final e f5533h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final i f5534i;

    public static final class b implements InterfaceC0901n {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final String f5535d = d4.k0.A0(0);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final InterfaceC0901n.a f5536e = new InterfaceC0901n.a() { // from class: O2.I0
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return H0.b.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f5537a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Object f5538c;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f5539a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f5540b;

            public a(Uri uri) {
                this.f5539a = uri;
            }

            public b c() {
                return new b(this);
            }
        }

        public b(a aVar) {
            this.f5537a = aVar.f5539a;
            this.f5538c = aVar.f5540b;
        }

        public static b b(Bundle bundle) {
            Uri uri = (Uri) bundle.getParcelable(f5535d);
            AbstractC1684a.e(uri);
            return new a(uri).c();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f5537a.equals(bVar.f5537a) && d4.k0.c(this.f5538c, bVar.f5538c);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f5535d, this.f5537a);
            return bundle;
        }

        public int hashCode() {
            int iHashCode = this.f5537a.hashCode() * 31;
            Object obj = this.f5538c;
            return iHashCode + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f5541a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Uri f5542b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f5543c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public d.a f5544d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public f.a f5545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f5546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public String f5547g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC2743y f5548h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public b f5549i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f5550j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public R0 f5551k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public g.a f5552l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public i f5553m;

        public c() {
            this.f5544d = new d.a();
            this.f5545e = new f.a();
            this.f5546f = Collections.emptyList();
            this.f5548h = AbstractC2743y.z();
            this.f5552l = new g.a();
            this.f5553m = i.f5634e;
        }

        public c(H0 h02) {
            this();
            this.f5544d = h02.f5532g.b();
            this.f5541a = h02.f5527a;
            this.f5551k = h02.f5531f;
            this.f5552l = h02.f5530e.b();
            this.f5553m = h02.f5534i;
            h hVar = h02.f5528c;
            if (hVar != null) {
                this.f5547g = hVar.f5630g;
                this.f5543c = hVar.f5626c;
                this.f5542b = hVar.f5625a;
                this.f5546f = hVar.f5629f;
                this.f5548h = hVar.f5631h;
                this.f5550j = hVar.f5633j;
                f fVar = hVar.f5627d;
                this.f5545e = fVar != null ? fVar.c() : new f.a();
                this.f5549i = hVar.f5628e;
            }
        }

        public H0 a() {
            h hVar;
            AbstractC1684a.g(this.f5545e.f5593b == null || this.f5545e.f5592a != null);
            Uri uri = this.f5542b;
            if (uri != null) {
                hVar = new h(uri, this.f5543c, this.f5545e.f5592a != null ? this.f5545e.i() : null, this.f5549i, this.f5546f, this.f5547g, this.f5548h, this.f5550j);
            } else {
                hVar = null;
            }
            String str = this.f5541a;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            e eVarG = this.f5544d.g();
            g gVarF = this.f5552l.f();
            R0 r02 = this.f5551k;
            if (r02 == null) {
                r02 = R0.f5761J;
            }
            return new H0(str2, eVarG, hVar, gVarF, r02, this.f5553m);
        }

        public c b(b bVar) {
            this.f5549i = bVar;
            return this;
        }

        public c c(d dVar) {
            this.f5544d = dVar.b();
            return this;
        }

        public c d(String str) {
            this.f5547g = str;
            return this;
        }

        public c e(f fVar) {
            this.f5545e = fVar != null ? fVar.c() : new f.a();
            return this;
        }

        public c f(g gVar) {
            this.f5552l = gVar.b();
            return this;
        }

        public c g(String str) {
            this.f5541a = (String) AbstractC1684a.e(str);
            return this;
        }

        public c h(R0 r02) {
            this.f5551k = r02;
            return this;
        }

        public c i(String str) {
            this.f5543c = str;
            return this;
        }

        public c j(List list) {
            this.f5546f = (list == null || list.isEmpty()) ? Collections.emptyList() : Collections.unmodifiableList(new ArrayList(list));
            return this;
        }

        public c k(List list) {
            this.f5548h = AbstractC2743y.r(list);
            return this;
        }

        public c l(Object obj) {
            this.f5550j = obj;
            return this;
        }

        public c m(Uri uri) {
            this.f5542b = uri;
            return this;
        }

        public c n(String str) {
            return m(str == null ? null : Uri.parse(str));
        }
    }

    public static class d implements InterfaceC0901n {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final d f5554g = new a().f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f5555h = d4.k0.A0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f5556i = d4.k0.A0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f5557j = d4.k0.A0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f5558k = d4.k0.A0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f5559l = d4.k0.A0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final InterfaceC0901n.a f5560m = new InterfaceC0901n.a() { // from class: O2.J0
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return H0.d.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5561a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5562c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f5563d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f5564e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f5565f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f5566a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f5567b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public boolean f5568c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f5569d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f5570e;

            public a() {
                this.f5567b = Long.MIN_VALUE;
            }

            public a(d dVar) {
                this.f5566a = dVar.f5561a;
                this.f5567b = dVar.f5562c;
                this.f5568c = dVar.f5563d;
                this.f5569d = dVar.f5564e;
                this.f5570e = dVar.f5565f;
            }

            public d f() {
                return g();
            }

            public e g() {
                return new e(this);
            }

            public a h(long j9) {
                AbstractC1684a.a(j9 == Long.MIN_VALUE || j9 >= 0);
                this.f5567b = j9;
                return this;
            }

            public a i(boolean z9) {
                this.f5569d = z9;
                return this;
            }

            public a j(boolean z9) {
                this.f5568c = z9;
                return this;
            }

            public a k(long j9) {
                AbstractC1684a.a(j9 >= 0);
                this.f5566a = j9;
                return this;
            }

            public a l(boolean z9) {
                this.f5570e = z9;
                return this;
            }
        }

        public d(a aVar) {
            this.f5561a = aVar.f5566a;
            this.f5562c = aVar.f5567b;
            this.f5563d = aVar.f5568c;
            this.f5564e = aVar.f5569d;
            this.f5565f = aVar.f5570e;
        }

        public static /* synthetic */ e c(Bundle bundle) {
            a aVar = new a();
            String str = f5555h;
            d dVar = f5554g;
            return aVar.k(bundle.getLong(str, dVar.f5561a)).h(bundle.getLong(f5556i, dVar.f5562c)).j(bundle.getBoolean(f5557j, dVar.f5563d)).i(bundle.getBoolean(f5558k, dVar.f5564e)).l(bundle.getBoolean(f5559l, dVar.f5565f)).g();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f5561a == dVar.f5561a && this.f5562c == dVar.f5562c && this.f5563d == dVar.f5563d && this.f5564e == dVar.f5564e && this.f5565f == dVar.f5565f;
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            long j9 = this.f5561a;
            d dVar = f5554g;
            if (j9 != dVar.f5561a) {
                bundle.putLong(f5555h, j9);
            }
            long j10 = this.f5562c;
            if (j10 != dVar.f5562c) {
                bundle.putLong(f5556i, j10);
            }
            boolean z9 = this.f5563d;
            if (z9 != dVar.f5563d) {
                bundle.putBoolean(f5557j, z9);
            }
            boolean z10 = this.f5564e;
            if (z10 != dVar.f5564e) {
                bundle.putBoolean(f5558k, z10);
            }
            boolean z11 = this.f5565f;
            if (z11 != dVar.f5565f) {
                bundle.putBoolean(f5559l, z11);
            }
            return bundle;
        }

        public int hashCode() {
            long j9 = this.f5561a;
            int i9 = ((int) (j9 ^ (j9 >>> 32))) * 31;
            long j10 = this.f5562c;
            return ((((((i9 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + (this.f5563d ? 1 : 0)) * 31) + (this.f5564e ? 1 : 0)) * 31) + (this.f5565f ? 1 : 0);
        }
    }

    public static final class e extends d {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final e f5571n = new d.a().g();

        public e(d.a aVar) {
            super(aVar);
        }
    }

    public static final class f implements InterfaceC0901n {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f5572m = d4.k0.A0(0);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f5573n = d4.k0.A0(1);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f5574o = d4.k0.A0(2);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f5575p = d4.k0.A0(3);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f5576q = d4.k0.A0(4);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final String f5577r = d4.k0.A0(5);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public static final String f5578s = d4.k0.A0(6);

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public static final String f5579t = d4.k0.A0(7);

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public static final InterfaceC0901n.a f5580u = new InterfaceC0901n.a() { // from class: O2.K0
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return H0.f.d(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final UUID f5581a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final UUID f5582c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Uri f5583d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final AbstractC2717A f5584e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AbstractC2717A f5585f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f5586g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final boolean f5587h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final boolean f5588i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final AbstractC2743y f5589j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final AbstractC2743y f5590k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final byte[] f5591l;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public UUID f5592a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Uri f5593b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public AbstractC2717A f5594c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public boolean f5595d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f5596e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public boolean f5597f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public AbstractC2743y f5598g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public byte[] f5599h;

            public a() {
                this.f5594c = AbstractC2717A.k();
                this.f5598g = AbstractC2743y.z();
            }

            public a(f fVar) {
                this.f5592a = fVar.f5581a;
                this.f5593b = fVar.f5583d;
                this.f5594c = fVar.f5585f;
                this.f5595d = fVar.f5586g;
                this.f5596e = fVar.f5587h;
                this.f5597f = fVar.f5588i;
                this.f5598g = fVar.f5590k;
                this.f5599h = fVar.f5591l;
            }

            public a(UUID uuid) {
                this.f5592a = uuid;
                this.f5594c = AbstractC2717A.k();
                this.f5598g = AbstractC2743y.z();
            }

            public f i() {
                return new f(this);
            }

            public a j(boolean z9) {
                this.f5597f = z9;
                return this;
            }

            public a k(boolean z9) {
                l(z9 ? AbstractC2743y.B(2, 1) : AbstractC2743y.z());
                return this;
            }

            public a l(List list) {
                this.f5598g = AbstractC2743y.r(list);
                return this;
            }

            public a m(byte[] bArr) {
                this.f5599h = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
                return this;
            }

            public a n(Map map) {
                this.f5594c = AbstractC2717A.d(map);
                return this;
            }

            public a o(Uri uri) {
                this.f5593b = uri;
                return this;
            }

            public a p(String str) {
                this.f5593b = str == null ? null : Uri.parse(str);
                return this;
            }

            public a q(boolean z9) {
                this.f5595d = z9;
                return this;
            }

            public a r(boolean z9) {
                this.f5596e = z9;
                return this;
            }
        }

        public f(a aVar) {
            AbstractC1684a.g((aVar.f5597f && aVar.f5593b == null) ? false : true);
            UUID uuid = (UUID) AbstractC1684a.e(aVar.f5592a);
            this.f5581a = uuid;
            this.f5582c = uuid;
            this.f5583d = aVar.f5593b;
            this.f5584e = aVar.f5594c;
            this.f5585f = aVar.f5594c;
            this.f5586g = aVar.f5595d;
            this.f5588i = aVar.f5597f;
            this.f5587h = aVar.f5596e;
            this.f5589j = aVar.f5598g;
            this.f5590k = aVar.f5598g;
            this.f5591l = aVar.f5599h != null ? Arrays.copyOf(aVar.f5599h, aVar.f5599h.length) : null;
        }

        public static f d(Bundle bundle) {
            UUID uuidFromString = UUID.fromString((String) AbstractC1684a.e(bundle.getString(f5572m)));
            Uri uri = (Uri) bundle.getParcelable(f5573n);
            AbstractC2717A abstractC2717AB = AbstractC1687d.b(AbstractC1687d.f(bundle, f5574o, Bundle.EMPTY));
            boolean z9 = bundle.getBoolean(f5575p, false);
            boolean z10 = bundle.getBoolean(f5576q, false);
            boolean z11 = bundle.getBoolean(f5577r, false);
            AbstractC2743y abstractC2743yR = AbstractC2743y.r(AbstractC1687d.g(bundle, f5578s, new ArrayList()));
            return new a(uuidFromString).o(uri).n(abstractC2717AB).q(z9).j(z11).r(z10).l(abstractC2743yR).m(bundle.getByteArray(f5579t)).i();
        }

        public a c() {
            return new a();
        }

        public byte[] e() {
            byte[] bArr = this.f5591l;
            if (bArr != null) {
                return Arrays.copyOf(bArr, bArr.length);
            }
            return null;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.f5581a.equals(fVar.f5581a) && d4.k0.c(this.f5583d, fVar.f5583d) && d4.k0.c(this.f5585f, fVar.f5585f) && this.f5586g == fVar.f5586g && this.f5588i == fVar.f5588i && this.f5587h == fVar.f5587h && this.f5590k.equals(fVar.f5590k) && Arrays.equals(this.f5591l, fVar.f5591l);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putString(f5572m, this.f5581a.toString());
            Uri uri = this.f5583d;
            if (uri != null) {
                bundle.putParcelable(f5573n, uri);
            }
            if (!this.f5585f.isEmpty()) {
                bundle.putBundle(f5574o, AbstractC1687d.h(this.f5585f));
            }
            boolean z9 = this.f5586g;
            if (z9) {
                bundle.putBoolean(f5575p, z9);
            }
            boolean z10 = this.f5587h;
            if (z10) {
                bundle.putBoolean(f5576q, z10);
            }
            boolean z11 = this.f5588i;
            if (z11) {
                bundle.putBoolean(f5577r, z11);
            }
            if (!this.f5590k.isEmpty()) {
                bundle.putIntegerArrayList(f5578s, new ArrayList<>(this.f5590k));
            }
            byte[] bArr = this.f5591l;
            if (bArr != null) {
                bundle.putByteArray(f5579t, bArr);
            }
            return bundle;
        }

        public int hashCode() {
            int iHashCode = this.f5581a.hashCode() * 31;
            Uri uri = this.f5583d;
            return ((((((((((((iHashCode + (uri != null ? uri.hashCode() : 0)) * 31) + this.f5585f.hashCode()) * 31) + (this.f5586g ? 1 : 0)) * 31) + (this.f5588i ? 1 : 0)) * 31) + (this.f5587h ? 1 : 0)) * 31) + this.f5590k.hashCode()) * 31) + Arrays.hashCode(this.f5591l);
        }
    }

    public static final class g implements InterfaceC0901n {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g f5600g = new a().f();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f5601h = d4.k0.A0(0);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f5602i = d4.k0.A0(1);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f5603j = d4.k0.A0(2);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f5604k = d4.k0.A0(3);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f5605l = d4.k0.A0(4);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final InterfaceC0901n.a f5606m = new InterfaceC0901n.a() { // from class: O2.L0
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return H0.g.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f5607a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f5608c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f5609d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final float f5610e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final float f5611f;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f5612a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f5613b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public long f5614c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public float f5615d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public float f5616e;

            public a() {
                this.f5612a = -9223372036854775807L;
                this.f5613b = -9223372036854775807L;
                this.f5614c = -9223372036854775807L;
                this.f5615d = -3.4028235E38f;
                this.f5616e = -3.4028235E38f;
            }

            public a(g gVar) {
                this.f5612a = gVar.f5607a;
                this.f5613b = gVar.f5608c;
                this.f5614c = gVar.f5609d;
                this.f5615d = gVar.f5610e;
                this.f5616e = gVar.f5611f;
            }

            public g f() {
                return new g(this);
            }

            public a g(long j9) {
                this.f5614c = j9;
                return this;
            }

            public a h(float f9) {
                this.f5616e = f9;
                return this;
            }

            public a i(long j9) {
                this.f5613b = j9;
                return this;
            }

            public a j(float f9) {
                this.f5615d = f9;
                return this;
            }

            public a k(long j9) {
                this.f5612a = j9;
                return this;
            }
        }

        public g(long j9, long j10, long j11, float f9, float f10) {
            this.f5607a = j9;
            this.f5608c = j10;
            this.f5609d = j11;
            this.f5610e = f9;
            this.f5611f = f10;
        }

        public g(a aVar) {
            this(aVar.f5612a, aVar.f5613b, aVar.f5614c, aVar.f5615d, aVar.f5616e);
        }

        public static /* synthetic */ g c(Bundle bundle) {
            String str = f5601h;
            g gVar = f5600g;
            return new g(bundle.getLong(str, gVar.f5607a), bundle.getLong(f5602i, gVar.f5608c), bundle.getLong(f5603j, gVar.f5609d), bundle.getFloat(f5604k, gVar.f5610e), bundle.getFloat(f5605l, gVar.f5611f));
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f5607a == gVar.f5607a && this.f5608c == gVar.f5608c && this.f5609d == gVar.f5609d && this.f5610e == gVar.f5610e && this.f5611f == gVar.f5611f;
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            long j9 = this.f5607a;
            g gVar = f5600g;
            if (j9 != gVar.f5607a) {
                bundle.putLong(f5601h, j9);
            }
            long j10 = this.f5608c;
            if (j10 != gVar.f5608c) {
                bundle.putLong(f5602i, j10);
            }
            long j11 = this.f5609d;
            if (j11 != gVar.f5609d) {
                bundle.putLong(f5603j, j11);
            }
            float f9 = this.f5610e;
            if (f9 != gVar.f5610e) {
                bundle.putFloat(f5604k, f9);
            }
            float f10 = this.f5611f;
            if (f10 != gVar.f5611f) {
                bundle.putFloat(f5605l, f10);
            }
            return bundle;
        }

        public int hashCode() {
            long j9 = this.f5607a;
            long j10 = this.f5608c;
            int i9 = ((((int) (j9 ^ (j9 >>> 32))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f5609d;
            int i10 = (i9 + ((int) (j11 ^ (j11 >>> 32)))) * 31;
            float f9 = this.f5610e;
            int iFloatToIntBits = (i10 + (f9 != 0.0f ? Float.floatToIntBits(f9) : 0)) * 31;
            float f10 = this.f5611f;
            return iFloatToIntBits + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        }
    }

    public static final class h implements InterfaceC0901n {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f5617k = d4.k0.A0(0);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f5618l = d4.k0.A0(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f5619m = d4.k0.A0(2);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f5620n = d4.k0.A0(3);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f5621o = d4.k0.A0(4);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final String f5622p = d4.k0.A0(5);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final String f5623q = d4.k0.A0(6);

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public static final InterfaceC0901n.a f5624r = new InterfaceC0901n.a() { // from class: O2.M0
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return H0.h.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f5625a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5626c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f5627d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final b f5628e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f5629f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5630g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final AbstractC2743y f5631h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final List f5632i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Object f5633j;

        public h(Uri uri, String str, f fVar, b bVar, List list, String str2, AbstractC2743y abstractC2743y, Object obj) {
            this.f5625a = uri;
            this.f5626c = str;
            this.f5627d = fVar;
            this.f5628e = bVar;
            this.f5629f = list;
            this.f5630g = str2;
            this.f5631h = abstractC2743y;
            AbstractC2743y.a aVarP = AbstractC2743y.p();
            for (int i9 = 0; i9 < abstractC2743y.size(); i9++) {
                aVarP.a(((k) abstractC2743y.get(i9)).b().j());
            }
            this.f5632i = aVarP.k();
            this.f5633j = obj;
        }

        public static h b(Bundle bundle) {
            Bundle bundle2 = bundle.getBundle(f5619m);
            f fVar = bundle2 == null ? null : (f) f.f5580u.a(bundle2);
            Bundle bundle3 = bundle.getBundle(f5620n);
            b bVar = bundle3 != null ? (b) b.f5536e.a(bundle3) : null;
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f5621o);
            AbstractC2743y abstractC2743yZ = parcelableArrayList == null ? AbstractC2743y.z() : AbstractC1687d.d(new InterfaceC0901n.a() { // from class: O2.N0
                @Override // O2.InterfaceC0901n.a
                public final InterfaceC0901n a(Bundle bundle4) {
                    return C3028H.c(bundle4);
                }
            }, parcelableArrayList);
            ArrayList parcelableArrayList2 = bundle.getParcelableArrayList(f5623q);
            return new h((Uri) AbstractC1684a.e((Uri) bundle.getParcelable(f5617k)), bundle.getString(f5618l), fVar, bVar, abstractC2743yZ, bundle.getString(f5622p), parcelableArrayList2 == null ? AbstractC2743y.z() : AbstractC1687d.d(k.f5652p, parcelableArrayList2), null);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.f5625a.equals(hVar.f5625a) && d4.k0.c(this.f5626c, hVar.f5626c) && d4.k0.c(this.f5627d, hVar.f5627d) && d4.k0.c(this.f5628e, hVar.f5628e) && this.f5629f.equals(hVar.f5629f) && d4.k0.c(this.f5630g, hVar.f5630g) && this.f5631h.equals(hVar.f5631h) && d4.k0.c(this.f5633j, hVar.f5633j);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f5617k, this.f5625a);
            String str = this.f5626c;
            if (str != null) {
                bundle.putString(f5618l, str);
            }
            f fVar = this.f5627d;
            if (fVar != null) {
                bundle.putBundle(f5619m, fVar.h());
            }
            b bVar = this.f5628e;
            if (bVar != null) {
                bundle.putBundle(f5620n, bVar.h());
            }
            if (!this.f5629f.isEmpty()) {
                bundle.putParcelableArrayList(f5621o, AbstractC1687d.i(this.f5629f));
            }
            String str2 = this.f5630g;
            if (str2 != null) {
                bundle.putString(f5622p, str2);
            }
            if (!this.f5631h.isEmpty()) {
                bundle.putParcelableArrayList(f5623q, AbstractC1687d.i(this.f5631h));
            }
            return bundle;
        }

        public int hashCode() {
            int iHashCode = this.f5625a.hashCode() * 31;
            String str = this.f5626c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            f fVar = this.f5627d;
            int iHashCode3 = (iHashCode2 + (fVar == null ? 0 : fVar.hashCode())) * 31;
            b bVar = this.f5628e;
            int iHashCode4 = (((iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.f5629f.hashCode()) * 31;
            String str2 = this.f5630g;
            int iHashCode5 = (((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f5631h.hashCode()) * 31;
            Object obj = this.f5633j;
            return iHashCode5 + (obj != null ? obj.hashCode() : 0);
        }
    }

    public static final class i implements InterfaceC0901n {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final i f5634e = new a().d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final String f5635f = d4.k0.A0(0);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final String f5636g = d4.k0.A0(1);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f5637h = d4.k0.A0(2);

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final InterfaceC0901n.a f5638i = new InterfaceC0901n.a() { // from class: O2.O0
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return H0.i.b(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f5639a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5640c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Bundle f5641d;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f5642a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f5643b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Bundle f5644c;

            public i d() {
                return new i(this);
            }

            public a e(Bundle bundle) {
                this.f5644c = bundle;
                return this;
            }

            public a f(Uri uri) {
                this.f5642a = uri;
                return this;
            }

            public a g(String str) {
                this.f5643b = str;
                return this;
            }
        }

        public i(a aVar) {
            this.f5639a = aVar.f5642a;
            this.f5640c = aVar.f5643b;
            this.f5641d = aVar.f5644c;
        }

        public static /* synthetic */ i b(Bundle bundle) {
            return new a().f((Uri) bundle.getParcelable(f5635f)).g(bundle.getString(f5636g)).e(bundle.getBundle(f5637h)).d();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return d4.k0.c(this.f5639a, iVar.f5639a) && d4.k0.c(this.f5640c, iVar.f5640c);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            Uri uri = this.f5639a;
            if (uri != null) {
                bundle.putParcelable(f5635f, uri);
            }
            String str = this.f5640c;
            if (str != null) {
                bundle.putString(f5636g, str);
            }
            Bundle bundle2 = this.f5641d;
            if (bundle2 != null) {
                bundle.putBundle(f5637h, bundle2);
            }
            return bundle;
        }

        public int hashCode() {
            Uri uri = this.f5639a;
            int iHashCode = (uri == null ? 0 : uri.hashCode()) * 31;
            String str = this.f5640c;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }
    }

    public static final class j extends k {
        public j(k.a aVar) {
            super(aVar);
        }
    }

    public static class k implements InterfaceC0901n {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final String f5645i = d4.k0.A0(0);

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final String f5646j = d4.k0.A0(1);

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final String f5647k = d4.k0.A0(2);

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final String f5648l = d4.k0.A0(3);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public static final String f5649m = d4.k0.A0(4);

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final String f5650n = d4.k0.A0(5);

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final String f5651o = d4.k0.A0(6);

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public static final InterfaceC0901n.a f5652p = new InterfaceC0901n.a() { // from class: O2.P0
            @Override // O2.InterfaceC0901n.a
            public final InterfaceC0901n a(Bundle bundle) {
                return H0.k.c(bundle);
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f5653a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f5654c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f5655d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f5656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f5657f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5658g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f5659h;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Uri f5660a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public String f5661b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f5662c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f5663d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f5664e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public String f5665f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public String f5666g;

            public a(k kVar) {
                this.f5660a = kVar.f5653a;
                this.f5661b = kVar.f5654c;
                this.f5662c = kVar.f5655d;
                this.f5663d = kVar.f5656e;
                this.f5664e = kVar.f5657f;
                this.f5665f = kVar.f5658g;
                this.f5666g = kVar.f5659h;
            }

            public a(Uri uri) {
                this.f5660a = uri;
            }

            public k i() {
                return new k(this);
            }

            public final j j() {
                return new j(this);
            }

            public a k(String str) {
                this.f5666g = str;
                return this;
            }

            public a l(String str) {
                this.f5665f = str;
                return this;
            }

            public a m(String str) {
                this.f5662c = str;
                return this;
            }

            public a n(String str) {
                this.f5661b = str;
                return this;
            }

            public a o(int i9) {
                this.f5664e = i9;
                return this;
            }

            public a p(int i9) {
                this.f5663d = i9;
                return this;
            }
        }

        public k(a aVar) {
            this.f5653a = aVar.f5660a;
            this.f5654c = aVar.f5661b;
            this.f5655d = aVar.f5662c;
            this.f5656e = aVar.f5663d;
            this.f5657f = aVar.f5664e;
            this.f5658g = aVar.f5665f;
            this.f5659h = aVar.f5666g;
        }

        public static k c(Bundle bundle) {
            Uri uri = (Uri) AbstractC1684a.e((Uri) bundle.getParcelable(f5645i));
            String string = bundle.getString(f5646j);
            String string2 = bundle.getString(f5647k);
            int i9 = bundle.getInt(f5648l, 0);
            int i10 = bundle.getInt(f5649m, 0);
            String string3 = bundle.getString(f5650n);
            return new a(uri).n(string).m(string2).p(i9).o(i10).l(string3).k(bundle.getString(f5651o)).i();
        }

        public a b() {
            return new a();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f5653a.equals(kVar.f5653a) && d4.k0.c(this.f5654c, kVar.f5654c) && d4.k0.c(this.f5655d, kVar.f5655d) && this.f5656e == kVar.f5656e && this.f5657f == kVar.f5657f && d4.k0.c(this.f5658g, kVar.f5658g) && d4.k0.c(this.f5659h, kVar.f5659h);
        }

        @Override // O2.InterfaceC0901n
        public Bundle h() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f5645i, this.f5653a);
            String str = this.f5654c;
            if (str != null) {
                bundle.putString(f5646j, str);
            }
            String str2 = this.f5655d;
            if (str2 != null) {
                bundle.putString(f5647k, str2);
            }
            int i9 = this.f5656e;
            if (i9 != 0) {
                bundle.putInt(f5648l, i9);
            }
            int i10 = this.f5657f;
            if (i10 != 0) {
                bundle.putInt(f5649m, i10);
            }
            String str3 = this.f5658g;
            if (str3 != null) {
                bundle.putString(f5650n, str3);
            }
            String str4 = this.f5659h;
            if (str4 != null) {
                bundle.putString(f5651o, str4);
            }
            return bundle;
        }

        public int hashCode() {
            int iHashCode = this.f5653a.hashCode() * 31;
            String str = this.f5654c;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f5655d;
            int iHashCode3 = (((((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f5656e) * 31) + this.f5657f) * 31;
            String str3 = this.f5658g;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.f5659h;
            return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
        }
    }

    public H0(String str, e eVar, h hVar, g gVar, R0 r02, i iVar) {
        this.f5527a = str;
        this.f5528c = hVar;
        this.f5529d = hVar;
        this.f5530e = gVar;
        this.f5531f = r02;
        this.f5532g = eVar;
        this.f5533h = eVar;
        this.f5534i = iVar;
    }

    public static H0 c(Bundle bundle) {
        String str = (String) AbstractC1684a.e(bundle.getString(f5520k, ""));
        Bundle bundle2 = bundle.getBundle(f5521l);
        g gVar = bundle2 == null ? g.f5600g : (g) g.f5606m.a(bundle2);
        Bundle bundle3 = bundle.getBundle(f5522m);
        R0 r02 = bundle3 == null ? R0.f5761J : (R0) R0.f5795v0.a(bundle3);
        Bundle bundle4 = bundle.getBundle(f5523n);
        e eVar = bundle4 == null ? e.f5571n : (e) d.f5560m.a(bundle4);
        Bundle bundle5 = bundle.getBundle(f5524o);
        i iVar = bundle5 == null ? i.f5634e : (i) i.f5638i.a(bundle5);
        Bundle bundle6 = bundle.getBundle(f5525p);
        return new H0(str, eVar, bundle6 == null ? null : (h) h.f5624r.a(bundle6), gVar, r02, iVar);
    }

    public static H0 d(Uri uri) {
        return new c().m(uri).a();
    }

    public static H0 e(String str) {
        return new c().n(str).a();
    }

    private Bundle f(boolean z9) {
        h hVar;
        Bundle bundle = new Bundle();
        if (!this.f5527a.equals("")) {
            bundle.putString(f5520k, this.f5527a);
        }
        if (!this.f5530e.equals(g.f5600g)) {
            bundle.putBundle(f5521l, this.f5530e.h());
        }
        if (!this.f5531f.equals(R0.f5761J)) {
            bundle.putBundle(f5522m, this.f5531f.h());
        }
        if (!this.f5532g.equals(d.f5554g)) {
            bundle.putBundle(f5523n, this.f5532g.h());
        }
        if (!this.f5534i.equals(i.f5634e)) {
            bundle.putBundle(f5524o, this.f5534i.h());
        }
        if (z9 && (hVar = this.f5528c) != null) {
            bundle.putBundle(f5525p, hVar.h());
        }
        return bundle;
    }

    public c b() {
        return new c();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof H0)) {
            return false;
        }
        H0 h02 = (H0) obj;
        return d4.k0.c(this.f5527a, h02.f5527a) && this.f5532g.equals(h02.f5532g) && d4.k0.c(this.f5528c, h02.f5528c) && d4.k0.c(this.f5530e, h02.f5530e) && d4.k0.c(this.f5531f, h02.f5531f) && d4.k0.c(this.f5534i, h02.f5534i);
    }

    @Override // O2.InterfaceC0901n
    public Bundle h() {
        return f(false);
    }

    public int hashCode() {
        int iHashCode = this.f5527a.hashCode() * 31;
        h hVar = this.f5528c;
        return ((((((((iHashCode + (hVar != null ? hVar.hashCode() : 0)) * 31) + this.f5530e.hashCode()) * 31) + this.f5532g.hashCode()) * 31) + this.f5531f.hashCode()) * 31) + this.f5534i.hashCode();
    }
}
