package Z2;

import B3.AbstractC0499g;
import B3.AbstractC0510s;
import B3.C;
import B3.InterfaceC0517z;
import C3.b;
import C3.m;
import C3.n;
import O2.AbstractC0926v1;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.H0;
import O2.InterfaceC0901n;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import V2.B;
import Z2.h;
import Z2.m;
import Z3.z;
import a4.C1087a;
import a4.InterfaceC1088b;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import b4.F;
import b4.G;
import b4.InterfaceC1211b;
import b4.S;
import com.google.ads.interactivemedia.v3.api.Ad;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdPodInfo;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.CuePoint;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.StreamDisplayContainer;
import com.google.ads.interactivemedia.v3.api.StreamManager;
import com.google.ads.interactivemedia.v3.api.StreamRequest;
import com.google.ads.interactivemedia.v3.api.player.VideoProgressUpdate;
import com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer;
import d4.AbstractC1681B;
import d4.AbstractC1684a;
import d4.C1691h;
import d4.k0;
import e4.C1737C;
import j$.util.Objects;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.http.message.TokenParser;
import q3.C2540a;
import s3.C2707a;
import s5.AbstractC2717A;
import s5.AbstractC2743y;
import s5.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends AbstractC0499g {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public StreamManager f10983A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public C3.m f10984B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public IOException f10985C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Q1 f10986D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public C3.b f10987E;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final H0 f10988l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC0920t1 f10989m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C.a f10990n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final c f10991o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AdsLoader f10992p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final AdEvent.AdEventListener f10993q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AdErrorEvent.AdErrorListener f10994r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final boolean f10995s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final String f10996t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final StreamRequest f10997u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final int f10998v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final j f10999w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Handler f11000x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final d f11001y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public G f11002z;

    public class a extends AbstractC0510s {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Q1 f11003h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Q1 q12, Q1 q13) {
            super(q12);
            this.f11003h = q13;
        }

        @Override // B3.AbstractC0510s, O2.Q1
        public Q1.d t(int i9, Q1.d dVar, long j9) {
            this.f11003h.t(i9, dVar, j9);
            dVar.f5746d = h.this.f10988l;
            return dVar;
        }
    }

    public static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11005a;

        static {
            int[] iArr = new int[AdEvent.AdEventType.values().length];
            f11005a = iArr;
            try {
                iArr[AdEvent.AdEventType.CUEPOINTS_CHANGED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f11005a[AdEvent.AdEventType.LOADED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f11005a[AdEvent.AdEventType.SKIPPED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final m.c f11006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Context f11007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Map f11008c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Map f11009d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public InterfaceC0920t1 f11010e;

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Context f11011a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final InterfaceC1088b f11012b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public ImaSdkSettings f11013c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public AdEvent.AdEventListener f11014d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public AdErrorEvent.AdErrorListener f11015e;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public AbstractC2743y f11017g = AbstractC2743y.z();

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public C0149c f11016f = new C0149c(AbstractC2717A.k());

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f11018h = true;

            public a(Context context, InterfaceC1088b interfaceC1088b) {
                this.f11011a = context;
                this.f11012b = interfaceC1088b;
            }

            public c a() {
                ImaSdkSettings imaSdkSettingsCreateImaSdkSettings = this.f11013c;
                if (imaSdkSettingsCreateImaSdkSettings == null) {
                    imaSdkSettingsCreateImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
                    imaSdkSettingsCreateImaSdkSettings.setLanguage(k0.n0()[0]);
                }
                ImaSdkSettings imaSdkSettings = imaSdkSettingsCreateImaSdkSettings;
                return new c(this.f11011a, new m.c(this.f11012b, imaSdkSettings, this.f11014d, this.f11015e, this.f11017g, this.f11018h, imaSdkSettings.isDebugMode()), this.f11016f, null);
            }

            public a b(C0149c c0149c) {
                this.f11016f = c0149c;
                return this;
            }
        }

        public static final class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final h f11019a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final j f11020b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final AdsLoader f11021c;

            public b(h hVar, j jVar, AdsLoader adsLoader) {
                this.f11019a = hVar;
                this.f11020b = jVar;
                this.f11021c = adsLoader;
            }

            public /* synthetic */ b(h hVar, j jVar, AdsLoader adsLoader, a aVar) {
                this(hVar, jVar, adsLoader);
            }
        }

        /* JADX INFO: renamed from: Z2.h$c$c, reason: collision with other inner class name */
        public static class C0149c implements InterfaceC0901n {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final String f11022c = k0.A0(1);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final InterfaceC0901n.a f11023d = new InterfaceC0901n.a() { // from class: Z2.i
                @Override // O2.InterfaceC0901n.a
                public final InterfaceC0901n a(Bundle bundle) {
                    return h.c.C0149c.c(bundle);
                }
            };

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final AbstractC2717A f11024a;

            public C0149c(AbstractC2717A abstractC2717A) {
                this.f11024a = abstractC2717A;
            }

            public static C0149c c(Bundle bundle) {
                AbstractC2717A.a aVar = new AbstractC2717A.a();
                Bundle bundle2 = (Bundle) AbstractC1684a.e(bundle.getBundle(f11022c));
                for (String str : bundle2.keySet()) {
                    aVar.f(str, C3.b.c(str, (C3.b) C3.b.f1042n.a((Bundle) AbstractC1684a.e(bundle2.getBundle(str)))));
                }
                return new C0149c(aVar.c());
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C0149c) {
                    return this.f11024a.equals(((C0149c) obj).f11024a);
                }
                return false;
            }

            @Override // O2.InterfaceC0901n
            public Bundle h() {
                Bundle bundle = new Bundle();
                Bundle bundle2 = new Bundle();
                c0 it = this.f11024a.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    bundle2.putBundle((String) entry.getKey(), ((C3.b) entry.getValue()).h());
                }
                bundle.putBundle(f11022c, bundle2);
                return bundle;
            }

            public int hashCode() {
                return this.f11024a.hashCode();
            }
        }

        public c(Context context, m.c cVar, C0149c c0149c) {
            this.f11007b = context.getApplicationContext();
            this.f11006a = cVar;
            this.f11008c = new HashMap();
            this.f11009d = new HashMap();
            c0 it = c0149c.f11024a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                this.f11009d.put((String) entry.getKey(), (C3.b) entry.getValue());
            }
        }

        public /* synthetic */ c(Context context, m.c cVar, C0149c c0149c, a aVar) {
            this(context, cVar, c0149c);
        }

        public final void g(h hVar, j jVar, AdsLoader adsLoader) {
            this.f11008c.put(hVar.f10996t, new b(hVar, jVar, adsLoader, null));
        }

        public final C3.b h(String str) {
            C3.b bVar = (C3.b) this.f11009d.get(str);
            return bVar != null ? bVar : C3.b.f1036h;
        }

        public C0149c i() {
            for (b bVar : this.f11008c.values()) {
                bVar.f11020b.release();
                bVar.f11021c.release();
                bVar.f11019a.g1(null);
            }
            C0149c c0149c = new C0149c(AbstractC2717A.d(this.f11009d));
            this.f11009d.clear();
            this.f11008c.clear();
            this.f11010e = null;
            return c0149c;
        }

        public final void j(String str, C3.b bVar) {
            this.f11009d.put(str, bVar);
        }

        public void k(InterfaceC0920t1 interfaceC0920t1) {
            this.f11010e = interfaceC0920t1;
        }
    }

    public final class d implements AdEvent.AdEventListener, InterfaceC0920t1.d, m.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdEvent.AdEventListener f11025a;

        public d(AdEvent.AdEventListener adEventListener) {
            this.f11025a = adEventListener;
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        public final /* synthetic */ void D(Q1 q12) {
            h.this.e1(q12);
        }

        @Override // O2.InterfaceC0920t1.d
        public void E(int i9) {
            if (i9 == 4 && h.X0(h.this.f10989m, h.this.f10988l, h.this.f10996t)) {
                h.this.f10999w.b();
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void J(boolean z9) {
            AbstractC0926v1.y(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void M(int i9, boolean z9) {
            AbstractC0926v1.f(this, i9, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void O(InterfaceC0920t1.b bVar) {
            AbstractC0926v1.b(this, bVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void P() {
            AbstractC0926v1.w(this);
        }

        @Override // O2.InterfaceC0920t1.d
        public void S(InterfaceC0920t1.e eVar, InterfaceC0920t1.e eVar2, int i9) {
            int iIntValue;
            if (i9 == 0 || (h.this.f10995s && i9 == 4)) {
                if (h.this.f10988l.equals(eVar.f6253e) && !h.this.f10988l.equals(eVar2.f6253e)) {
                    h.this.f10999w.b();
                }
                if (h.this.f10988l.equals(eVar.f6253e) && h.this.f10988l.equals(eVar2.f6253e) && h.this.f10996t.equals(h.this.f10989m.w().m(AbstractC1684a.e(eVar2.f6254f), new Q1.b()).m()) && (iIntValue = eVar.f6258j) != -1) {
                    int iIntValue2 = eVar.f6259k;
                    Q1 q1W = h.this.f10989m.w();
                    Q1.d dVarS = q1W.s(eVar.f6252d, new Q1.d());
                    if (dVarS.f5759q > dVarS.f5758p) {
                        if (i9 == 4) {
                            h hVar = h.this;
                            hVar.d1(m.m(hVar.f10989m.J(), q1W, h.this.f10987E));
                            return;
                        } else {
                            Pair pairC = dVarS.i() ? m.c(eVar.f6252d, eVar.f6255g - dVarS.f5758p, q1W, h.this.f10987E) : m.d(eVar.f6255g - dVarS.f5758p, h.this.f10987E, (Q1) AbstractC1684a.e(h.this.f10986D));
                            iIntValue = ((Integer) pairC.first).intValue();
                            iIntValue2 = ((Integer) pairC.second).intValue();
                        }
                    }
                    int i10 = h.this.f10987E.e(iIntValue).f1062f[iIntValue2];
                    if (i10 == 1 || i10 == 0) {
                        C3.b bVarA = h.this.f10987E.A(iIntValue, iIntValue2);
                        b.C0010b c0010bE = bVarA.e(iIntValue);
                        if (h.this.f10995s && eVar2.f6258j == -1) {
                            int[] iArr = c0010bE.f1062f;
                            if (iIntValue2 < iArr.length - 1) {
                                int i11 = iIntValue2 + 1;
                                if (iArr[i11] == 1) {
                                    AbstractC1681B.j("ImaSSAIMediaSource", "Detected late ad event. Regrouping trailing ads into separate ad group.");
                                    bVarA = m.s(c0010bE, iIntValue, i11, bVarA);
                                }
                            }
                        }
                        h.this.d1(bVarA);
                    }
                }
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void U(int i9, int i10) {
            AbstractC0926v1.A(this, i9, i10);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void V(Q1 q12, int i9) {
            AbstractC0926v1.B(this, q12, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void W(C0909p1 c0909p1) {
            AbstractC0926v1.s(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void Y(z zVar) {
            AbstractC0926v1.C(this, zVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a(boolean z9) {
            AbstractC0926v1.z(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void a0(C0921u c0921u) {
            AbstractC0926v1.e(this, c0921u);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void b0(int i9) {
            AbstractC0926v1.u(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void d0(boolean z9) {
            AbstractC0926v1.h(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public void e(C2540a c2540a) {
            if (h.X0(h.this.f10989m, h.this.f10988l, h.this.f10996t)) {
                for (int i9 = 0; i9 < c2540a.f(); i9++) {
                    C2540a.b bVarE = c2540a.e(i9);
                    if (bVarE instanceof v3.m) {
                        v3.m mVar = (v3.m) bVarE;
                        if ("TXXX".equals(mVar.f51316a)) {
                            h.this.f10999w.e((String) mVar.f51329e.get(0));
                        }
                    } else if (bVarE instanceof C2707a) {
                        h.this.f10999w.e(new String(((C2707a) bVarE).f49896f));
                    }
                }
            }
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void f0(V1 v12) {
            AbstractC0926v1.D(this, v12);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void g0(boolean z9, int i9) {
            AbstractC0926v1.t(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void h0(H0 h02, int i9) {
            AbstractC0926v1.k(this, h02, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void i0(R0 r02) {
            AbstractC0926v1.l(this, r02);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j(C1737C c1737c) {
            AbstractC0926v1.E(this, c1737c);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void j0(boolean z9, int i9) {
            AbstractC0926v1.n(this, z9, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void k(List list) {
            AbstractC0926v1.d(this, list);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void l0(C0909p1 c0909p1) {
            AbstractC0926v1.r(this, c0909p1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void m0(InterfaceC0920t1 interfaceC0920t1, InterfaceC0920t1.c cVar) {
            AbstractC0926v1.g(this, interfaceC0920t1, cVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void n0(boolean z9) {
            AbstractC0926v1.i(this, z9);
        }

        @Override // C3.m.a
        public boolean o(final Q1 q12) {
            h.this.f11000x.post(new Runnable() { // from class: Z2.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11054a.D(q12);
                }
            });
            return !h.this.f10995s || Objects.equals(h.this.f10997u.getFormat(), StreamRequest.StreamFormat.DASH);
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            AdEvent.AdEventListener adEventListener = this.f11025a;
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void onRepeatModeChanged(int i9) {
            AbstractC0926v1.x(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void t(C0917s1 c0917s1) {
            AbstractC0926v1.o(this, c0917s1);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void u(P3.f fVar) {
            AbstractC0926v1.c(this, fVar);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void z(int i9) {
            AbstractC0926v1.q(this, i9);
        }
    }

    public static final class e implements C.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f11027a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C.a f11028b;

        public e(c cVar, C.a aVar) {
            this.f11027a = cVar;
            this.f11028b = aVar;
        }

        @Override // B3.C.a
        public C.a a(F f9) {
            this.f11028b.a(f9);
            return this;
        }

        @Override // B3.C.a
        public C b(H0 h02) {
            AbstractC1684a.e(h02.f5528c);
            InterfaceC0920t1 interfaceC0920t1 = (InterfaceC0920t1) AbstractC1684a.e(this.f11027a.f11010e);
            StreamRequest streamRequestA = l.a(((H0.h) AbstractC1684a.e(h02.f5528c)).f5625a);
            j jVar = new j(interfaceC0920t1, h02, streamRequestA);
            ImaSdkFactory imaSdkFactory = ImaSdkFactory.getInstance();
            AdsLoader adsLoaderCreateAdsLoader = imaSdkFactory.createAdsLoader(this.f11027a.f11007b, this.f11027a.f11006a.f11073b, h.U0(imaSdkFactory, this.f11027a.f11006a, jVar));
            c cVar = this.f11027a;
            h hVar = new h(interfaceC0920t1, h02, streamRequestA, cVar, adsLoaderCreateAdsLoader, jVar, this.f11028b, cVar.f11006a.f11074c, this.f11027a.f11006a.f11075d, null);
            this.f11027a.g(hVar, jVar, adsLoaderCreateAdsLoader);
            return hVar;
        }

        @Override // B3.C.a
        public int[] c() {
            return this.f11028b.c();
        }

        @Override // B3.C.a
        public C.a d(B b9) {
            this.f11028b.d(b9);
            return this;
        }
    }

    public class f implements AdEvent.AdEventListener {
        public f() {
        }

        public /* synthetic */ f(h hVar, a aVar) {
            this();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            if (Objects.equals(adEvent.getType(), AdEvent.AdEventType.LOADED)) {
                AdPodInfo adPodInfo = adEvent.getAd().getAdPodInfo();
                Q1 q1W = h.this.f10989m.w();
                Q1.d dVar = new Q1.d();
                Q1.b bVar = new Q1.b();
                long jE = m.e(q1W, adPodInfo, h.this.f10989m.J(), dVar, bVar);
                long jL = m.l(dVar.f5749g, dVar.f5760r) + bVar.f5720f;
                long jR = bVar.f5719e;
                if (jR == -9223372036854775807L) {
                    jR = m.r(adEvent.getAd().getDuration());
                }
                h.this.d1(m.a(jL, jR, adPodInfo.getAdPosition(), jE, adPodInfo.getTotalAds(), h.this.f10987E));
            }
        }
    }

    public class g implements AdEvent.AdEventListener {
        public g() {
        }

        public /* synthetic */ g(h hVar, a aVar) {
            this();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            if (Objects.equals(adEvent.getType(), AdEvent.AdEventType.LOADED)) {
                C3.b bVar = h.this.f10987E;
                Q1 q1W = h.this.f10989m.w();
                Q1.b bVar2 = new Q1.b();
                long j9 = q1W.k(h.this.f10989m.J(), bVar2).f5720f;
                long j10 = h.this.f10989m.d() ? bVar2.j(h.this.f10989m.s()) : k0.P0(h.this.f10989m.R());
                Ad ad = adEvent.getAd();
                AdPodInfo adPodInfo = ad.getAdPodInfo();
                long j11 = j10 - j9;
                long jR = m.r(ad.getDuration());
                int adPosition = adPodInfo.getAdPosition();
                long jR2 = m.r(adPodInfo.getMaxDuration());
                int totalAds = adPodInfo.getTotalAds();
                if (bVar.equals(C3.b.f1036h)) {
                    bVar = new C3.b(h.this.f10996t, new long[0]);
                }
                h.this.d1(m.a(j11, jR, adPosition, jR2, totalAds, bVar));
            }
        }
    }

    /* JADX INFO: renamed from: Z2.h$h, reason: collision with other inner class name */
    public static class C0150h implements G.e, AdsLoader.AdsLoadedListener, AdErrorEvent.AdErrorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AdsLoader f11031a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h f11032c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final StreamRequest f11033d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final j f11034e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final AdErrorEvent.AdErrorListener f11035f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final C1691h f11036g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile Uri f11037h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public volatile boolean f11038i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f11039j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public volatile String f11040k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public volatile int f11041l;

        public C0150h(AdsLoader adsLoader, h hVar, StreamRequest streamRequest, j jVar, AdErrorEvent.AdErrorListener adErrorListener) {
            this.f11031a = adsLoader;
            this.f11032c = hVar;
            this.f11033d = streamRequest;
            this.f11034e = jVar;
            this.f11035f = adErrorListener;
            this.f11036g = new C1691h();
            this.f11041l = -1;
        }

        public /* synthetic */ C0150h(AdsLoader adsLoader, h hVar, StreamRequest streamRequest, j jVar, AdErrorEvent.AdErrorListener adErrorListener, a aVar) {
            this(adsLoader, hVar, streamRequest, jVar, adErrorListener);
        }

        @Override // b4.G.e
        public void a() {
            try {
                this.f11034e.d(new j.a() { // from class: Z2.k
                    @Override // Z2.h.j.a
                    public final void a(String str, List list) {
                        this.f11056a.e(str, list);
                    }
                });
                AdErrorEvent.AdErrorListener adErrorListener = this.f11035f;
                if (adErrorListener != null) {
                    this.f11031a.addAdErrorListener(adErrorListener);
                }
                AdsLoader adsLoader = this.f11031a;
                this.f11031a.addAdErrorListener(this);
                this.f11031a.requestStream(this.f11033d);
                while (this.f11037h == null && !this.f11038i && !this.f11039j) {
                    try {
                        this.f11036g.a();
                    } catch (InterruptedException unused) {
                    }
                }
                if (this.f11039j && this.f11037h == null) {
                    throw new IOException(this.f11040k + " [errorCode: " + this.f11041l + "]");
                }
            } finally {
                this.f11031a.removeAdsLoadedListener(this);
                this.f11031a.removeAdErrorListener(this);
                AdErrorEvent.AdErrorListener adErrorListener2 = this.f11035f;
                if (adErrorListener2 != null) {
                    this.f11031a.removeAdErrorListener(adErrorListener2);
                }
            }
        }

        @Override // b4.G.e
        public void c() {
            this.f11038i = true;
        }

        public Uri d() {
            return this.f11037h;
        }

        public final /* synthetic */ void e(String str, List list) {
            this.f11037h = Uri.parse(str);
            this.f11036g.f();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent.AdErrorListener
        public void onAdError(AdErrorEvent adErrorEvent) {
            this.f11039j = true;
            if (adErrorEvent.getError() != null) {
                String message = adErrorEvent.getError().getMessage();
                if (message != null) {
                    this.f11040k = message.replace('\n', TokenParser.SP);
                }
                this.f11041l = adErrorEvent.getError().getErrorCodeNumber();
            }
            this.f11036g.f();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdsLoader.AdsLoadedListener
        public void onAdsManagerLoaded(AdsManagerLoadedEvent adsManagerLoadedEvent) {
            StreamManager streamManager = adsManagerLoadedEvent.getStreamManager();
            if (streamManager != null) {
                this.f11032c.g1(streamManager);
                return;
            }
            this.f11039j = true;
            this.f11040k = "streamManager is null after ads manager has been loaded";
            this.f11036g.f();
        }
    }

    public final class i implements G.b {
        public i() {
        }

        public /* synthetic */ i(h hVar, a aVar) {
            this();
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void t(C0150h c0150h, long j9, long j10, boolean z9) {
            AbstractC1684a.g(z9);
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void W(C0150h c0150h, long j9, long j10) {
            h.this.f1((Uri) AbstractC1684a.e(c0150h.d()));
        }

        @Override // b4.G.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public G.c j(C0150h c0150h, long j9, long j10, IOException iOException, int i9) {
            h.this.f10985C = iOException;
            return G.f17500f;
        }
    }

    public static final class j implements VideoStreamPlayer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f11043a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC0920t1 f11044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final H0 f11045d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Q1.d f11046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Q1.b f11047f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f11048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public AbstractC2717A f11049h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Q1 f11050i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public Object f11051j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public a f11052k;

        public interface a {
            void a(String str, List list);
        }

        public j(InterfaceC0920t1 interfaceC0920t1, H0 h02, StreamRequest streamRequest) {
            this.f11044c = interfaceC0920t1;
            this.f11045d = h02;
            this.f11048g = streamRequest.getFormat() == StreamRequest.StreamFormat.DASH;
            this.f11043a = new ArrayList(1);
            this.f11049h = AbstractC2717A.k();
            this.f11046e = new Q1.d();
            this.f11047f = new Q1.b();
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void addCallback(VideoStreamPlayer.VideoStreamPlayerCallback videoStreamPlayerCallback) {
            this.f11043a.add(videoStreamPlayerCallback);
        }

        public void b() {
            Iterator it = this.f11043a.iterator();
            while (it.hasNext()) {
                ((VideoStreamPlayer.VideoStreamPlayerCallback) it.next()).onContentComplete();
            }
        }

        public void c(Object obj, AbstractC2717A abstractC2717A, Q1 q12) {
            this.f11051j = obj;
            this.f11049h = abstractC2717A;
            this.f11050i = q12;
        }

        public void d(a aVar) {
            this.f11052k = (a) AbstractC1684a.e(aVar);
        }

        public final void e(String str) {
            Iterator it = this.f11043a.iterator();
            while (it.hasNext()) {
                ((VideoStreamPlayer.VideoStreamPlayerCallback) it.next()).onUserTextReceived(str);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.ContentProgressProvider
        public VideoProgressUpdate getContentProgress() {
            long jX1;
            long jX12;
            long jR;
            if (!h.X0(this.f11044c, this.f11045d, this.f11051j)) {
                return VideoProgressUpdate.VIDEO_TIME_NOT_READY;
            }
            if (this.f11049h.isEmpty()) {
                return new VideoProgressUpdate(0L, -9223372036854775807L);
            }
            Q1 q1W = this.f11044c.w();
            int iJ = this.f11044c.J();
            q1W.l(iJ, this.f11047f, true);
            q1W.s(this.f11044c.X(), this.f11046e);
            if (this.f11048g && this.f11046e.i()) {
                if (this.f11044c.d()) {
                    jX12 = this.f11046e.f5749g + k0.x1(this.f11047f.f5720f);
                    jR = this.f11044c.getCurrentPosition();
                } else {
                    jX12 = this.f11046e.f5749g;
                    jR = this.f11044c.R();
                }
                jX1 = jX12 + jR;
            } else {
                Q1.b bVarL = ((Q1) AbstractC1684a.e(this.f11050i)).l(iJ - this.f11046e.f5758p, new Q1.b(), true);
                long jX13 = k0.x1(n.h(this.f11044c, (C3.b) AbstractC1684a.e((C3.b) this.f11049h.get(bVarL.f5717c))));
                Q1.d dVar = this.f11046e;
                long j9 = dVar.f5749g;
                if (j9 != -9223372036854775807L) {
                    jX1 = jX13 + j9 + this.f11047f.s();
                } else if (iJ > dVar.f5758p) {
                    ((Q1) AbstractC1684a.e(this.f11050i)).l((iJ - this.f11046e.f5758p) - 1, bVarL, true);
                    jX1 = k0.x1(bVarL.f5720f + bVarL.f5719e) + jX13;
                } else {
                    jX1 = jX13;
                }
            }
            return new VideoProgressUpdate(jX1, ((Q1) AbstractC1684a.e(this.f11050i)).s(0, this.f11046e).f());
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VolumeProvider
        public int getVolume() {
            return (int) Math.floor(this.f11044c.getVolume() * 100.0f);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void loadUrl(String str, List list) {
            a aVar = this.f11052k;
            if (aVar != null) {
                aVar.a(str, list);
            }
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void onAdBreakEnded() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void onAdBreakStarted() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void onAdPeriodEnded() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void onAdPeriodStarted() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void pause() {
        }

        public void release() {
            this.f11043a.clear();
            this.f11051j = null;
            this.f11049h = AbstractC2717A.k();
            this.f11050i = null;
            this.f11052k = null;
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void removeCallback(VideoStreamPlayer.VideoStreamPlayerCallback videoStreamPlayerCallback) {
            this.f11043a.remove(videoStreamPlayerCallback);
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void resume() {
        }

        @Override // com.google.ads.interactivemedia.v3.api.player.VideoStreamPlayer
        public void seek(long j9) {
        }
    }

    public class k implements AdEvent.AdEventListener {
        public k() {
        }

        public /* synthetic */ k(h hVar, a aVar) {
            this();
        }

        @Override // com.google.ads.interactivemedia.v3.api.AdEvent.AdEventListener
        public void onAdEvent(AdEvent adEvent) {
            C3.b bVarH1 = h.this.f10987E;
            int i9 = b.f11005a[adEvent.getType().ordinal()];
            if (i9 != 1) {
                if (i9 == 2) {
                    bVarH1 = h.i1(adEvent.getAd(), bVarH1);
                } else if (i9 == 3) {
                    bVarH1 = h.j1(adEvent.getAd(), bVarH1);
                }
            } else if (bVarH1.equals(C3.b.f1036h)) {
                bVarH1 = h.h1(((StreamManager) AbstractC1684a.e(h.this.f10983A)).getCuePoints(), new C3.b(h.this.f10996t, new long[0]));
            }
            h.this.d1(bVarH1);
        }
    }

    public h(InterfaceC0920t1 interfaceC0920t1, H0 h02, StreamRequest streamRequest, c cVar, AdsLoader adsLoader, j jVar, C.a aVar, AdEvent.AdEventListener adEventListener, AdErrorEvent.AdErrorListener adErrorListener) {
        this.f10989m = interfaceC0920t1;
        this.f10988l = h02;
        this.f10997u = streamRequest;
        this.f10991o = cVar;
        this.f10992p = adsLoader;
        this.f10999w = jVar;
        this.f10990n = aVar;
        this.f10993q = adEventListener;
        this.f10994r = adErrorListener;
        AbstractC1684a.a(interfaceC0920t1.x() == Looper.getMainLooper());
        this.f11000x = new Handler(Looper.getMainLooper());
        Uri uri = ((H0.h) AbstractC1684a.e(h02.f5528c)).f5625a;
        boolean zD = l.d(uri);
        this.f10995s = zD;
        String strB = l.b(uri);
        this.f10996t = strB;
        this.f10998v = l.c(uri);
        a aVar2 = null;
        this.f11001y = new d(zD ? Objects.equals(l.a(uri).getFormat(), StreamRequest.StreamFormat.DASH) ? new f(this, aVar2) : new g(this, aVar2) : new k(this, aVar2));
        this.f10987E = cVar.h(strB);
    }

    public /* synthetic */ h(InterfaceC0920t1 interfaceC0920t1, H0 h02, StreamRequest streamRequest, c cVar, AdsLoader adsLoader, j jVar, C.a aVar, AdEvent.AdEventListener adEventListener, AdErrorEvent.AdErrorListener adErrorListener, a aVar2) {
        this(interfaceC0920t1, h02, streamRequest, cVar, adsLoader, jVar, aVar, adEventListener, adErrorListener);
    }

    public static void T0(InterfaceC0920t1 interfaceC0920t1) {
        int i9 = 0;
        for (int i10 = 0; i10 < interfaceC0920t1.k(); i10++) {
            H0 h0G = interfaceC0920t1.G(i10);
            H0.h hVar = h0G.f5528c;
            if (hVar != null && "ssai".equals(hVar.f5625a.getScheme()) && "dai.google.com".equals(h0G.f5528c.f5625a.getAuthority()) && (i9 = i9 + 1) > 1) {
                throw new IllegalStateException("Multiple IMA server side ad insertion sources not supported.");
            }
        }
    }

    public static StreamDisplayContainer U0(ImaSdkFactory imaSdkFactory, m.c cVar, j jVar) {
        StreamDisplayContainer streamDisplayContainerCreateStreamDisplayContainer = ImaSdkFactory.createStreamDisplayContainer((ViewGroup) AbstractC1684a.e(cVar.f11072a.getAdViewGroup()), jVar);
        streamDisplayContainerCreateStreamDisplayContainer.setCompanionSlots(cVar.f11076e);
        c1(imaSdkFactory, streamDisplayContainerCreateStreamDisplayContainer, cVar.f11072a);
        return streamDisplayContainerCreateStreamDisplayContainer;
    }

    public static long V0(double d9, double d10) {
        return k0.P0(m.q(d10 - d9));
    }

    public static boolean X0(InterfaceC0920t1 interfaceC0920t1, H0 h02, Object obj) {
        if (interfaceC0920t1.getPlaybackState() == 1) {
            return false;
        }
        Q1.b bVar = new Q1.b();
        interfaceC0920t1.w().k(interfaceC0920t1.J(), bVar);
        return (bVar.f5721g && h02.equals(interfaceC0920t1.f())) || (obj != null && obj.equals(bVar.m()));
    }

    public static void c1(ImaSdkFactory imaSdkFactory, StreamDisplayContainer streamDisplayContainer, InterfaceC1088b interfaceC1088b) {
        for (int i9 = 0; i9 < interfaceC1088b.getAdOverlayInfos().size(); i9++) {
            C1087a c1087a = (C1087a) interfaceC1088b.getAdOverlayInfos().get(i9);
            View view = c1087a.f11608a;
            FriendlyObstructionPurpose friendlyObstructionPurposeH = m.h(c1087a.f11609b);
            String str = c1087a.f11610c;
            if (str == null) {
                str = "Unknown reason";
            }
            streamDisplayContainer.registerFriendlyObstruction(imaSdkFactory.createFriendlyObstruction(view, friendlyObstructionPurposeH, str));
        }
    }

    public static C3.b h1(List list, C3.b bVar) {
        C3.b bVarA = bVar;
        for (int i9 = 0; i9 < list.size(); i9++) {
            CuePoint cuePoint = (CuePoint) list.get(i9);
            bVarA = n.a(bVarA, k0.P0(m.q(cuePoint.getStartTime())), 0L, V0(cuePoint.getStartTime(), cuePoint.getEndTime()));
        }
        return bVarA;
    }

    public static C3.b i1(Ad ad, C3.b bVar) {
        AdPodInfo adPodInfo = ad.getAdPodInfo();
        int podIndex = adPodInfo.getPodIndex() == -1 ? bVar.f1044c - 1 : adPodInfo.getPodIndex();
        b.C0010b c0010bE = bVar.e(podIndex);
        int adPosition = adPodInfo.getAdPosition() - 1;
        return c0010bE.f1059c < adPodInfo.getTotalAds() ? m.b(podIndex, k0.P0(m.q(adPodInfo.getMaxDuration())), adPosition, k0.P0(m.q(ad.getDuration())), adPodInfo.getTotalAds(), bVar) : adPosition < c0010bE.f1059c + (-1) ? m.w(podIndex, adPosition, k0.P0(m.q(ad.getDuration())), bVar) : bVar;
    }

    public static C3.b j1(Ad ad, C3.b bVar) {
        return bVar.B(ad.getAdPodInfo().getPodIndex(), r1.getAdPosition() - 1);
    }

    @Override // B3.C
    public InterfaceC0517z E(C.b bVar, InterfaceC1211b interfaceC1211b, long j9) {
        return ((C3.m) AbstractC1684a.e(this.f10984B)).E(bVar, interfaceC1211b, j9);
    }

    @Override // B3.AbstractC0499g, B3.C
    public void P() throws IOException {
        super.P();
        IOException iOException = this.f10985C;
        if (iOException == null) {
            return;
        }
        this.f10985C = null;
        throw iOException;
    }

    public final void W0() {
        Q1 q12;
        if (this.f10987E.equals(C3.b.f1036h) || (q12 = this.f10986D) == null) {
            return;
        }
        Q1 q13 = (Q1) AbstractC1684a.e(q12);
        AbstractC2717A abstractC2717AU = Objects.equals(this.f10997u.getFormat(), StreamRequest.StreamFormat.DASH) ? m.u(this.f10987E, q13) : AbstractC2717A.m(AbstractC1684a.e(q13.l(q13.s(0, new Q1.d()).f5758p, new Q1.b(), true).f5717c), this.f10987E);
        this.f10999w.c(this.f10996t, abstractC2717AU, q13);
        ((C3.m) AbstractC1684a.e(this.f10984B)).x0(abstractC2717AU, q13);
        if (this.f10995s) {
            return;
        }
        this.f10991o.j(this.f10996t, this.f10987E);
    }

    @Override // B3.C
    public void Y(InterfaceC0517z interfaceC0517z) {
        ((C3.m) AbstractC1684a.e(this.f10984B)).Y(interfaceC0517z);
    }

    public final /* synthetic */ void Y0() {
        T0((InterfaceC0920t1) AbstractC1684a.e(this.f10989m));
    }

    public final /* synthetic */ void Z0() {
        this.f10989m.l(this.f11001y);
        g1(null);
    }

    public final /* synthetic */ void a1() {
        d1(new C3.b(this.f10996t, new long[0]).x());
    }

    @Override // B3.AbstractC0499g
    /* JADX INFO: renamed from: b1, reason: merged with bridge method [inline-methods] */
    public void s0(Void r12, C c9, Q1 q12) {
        m0(new a(q12, q12));
    }

    public final void d1(C3.b bVar) {
        if (bVar.equals(this.f10987E)) {
            return;
        }
        this.f10987E = bVar;
        W0();
    }

    @Override // B3.C
    public H0 e() {
        return this.f10988l;
    }

    public final void e1(Q1 q12) {
        if (q12.equals(this.f10986D)) {
            return;
        }
        if (this.f10995s && Objects.equals(this.f10997u.getFormat(), StreamRequest.StreamFormat.DASH)) {
            this.f10987E = m.p(q12, this.f10987E);
        }
        this.f10986D = q12;
        W0();
    }

    public final void f1(Uri uri) {
        if (this.f10984B == null) {
            C3.m mVar = new C3.m(this.f10990n.b(new H0.c().m(uri).e(((H0.h) AbstractC1684a.e(this.f10988l.f5528c)).f5627d).f(this.f10988l.f5530e).d(this.f10988l.f5528c.f5630g).j(this.f10988l.f5528c.f5629f).a()), this.f11001y);
            this.f10984B = mVar;
            if (this.f10995s) {
                this.f11000x.post(new Runnable() { // from class: Z2.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10982a.a1();
                    }
                });
            }
            u0(null, mVar);
        }
    }

    public final void g1(StreamManager streamManager) {
        StreamManager streamManager2 = this.f10983A;
        if (streamManager2 == streamManager) {
            return;
        }
        if (streamManager2 != null) {
            AdEvent.AdEventListener adEventListener = this.f10993q;
            if (adEventListener != null) {
                streamManager2.removeAdEventListener(adEventListener);
            }
            AdErrorEvent.AdErrorListener adErrorListener = this.f10994r;
            if (adErrorListener != null) {
                this.f10983A.removeAdErrorListener(adErrorListener);
            }
            this.f10983A.removeAdEventListener(this.f11001y);
            this.f10983A.destroy();
        }
        this.f10983A = streamManager;
        if (streamManager != null) {
            d dVar = this.f11001y;
            if (this.f10993q != null) {
            }
            AdErrorEvent.AdErrorListener adErrorListener2 = this.f10994r;
            if (adErrorListener2 != null) {
                streamManager.addAdErrorListener(adErrorListener2);
            }
            AdsRenderingSettings adsRenderingSettingsCreateAdsRenderingSettings = ImaSdkFactory.getInstance().createAdsRenderingSettings();
            int i9 = this.f10998v;
            adsRenderingSettingsCreateAdsRenderingSettings.setFocusSkipButtonWhenAvailable(this.f10991o.f11006a.f11077f);
            streamManager.init(adsRenderingSettingsCreateAdsRenderingSettings);
        }
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void l0(S s9) {
        this.f11000x.post(new Runnable() { // from class: Z2.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f10980a.Y0();
            }
        });
        super.l0(s9);
        if (this.f11002z == null) {
            G g9 = new G("ImaServerSideAdInsertionMediaSource");
            this.f10989m.B(this.f11001y);
            g9.n(new C0150h(this.f10992p, this, this.f10997u, this.f10999w, this.f10994r, null), new i(this, null), 0);
            this.f11002z = g9;
        }
    }

    @Override // B3.AbstractC0499g, B3.AbstractC0493a
    public void n0() {
        super.n0();
        G g9 = this.f11002z;
        if (g9 != null) {
            g9.l();
            this.f11000x.post(new Runnable() { // from class: Z2.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10981a.Z0();
                }
            });
            this.f11002z = null;
        }
        this.f10986D = null;
        this.f10984B = null;
    }
}
