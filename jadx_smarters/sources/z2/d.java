package Z2;

import C3.e;
import O2.AbstractC0926v1;
import O2.AbstractC0928w0;
import O2.C0909p1;
import O2.C0917s1;
import O2.C0921u;
import O2.H0;
import O2.InterfaceC0920t1;
import O2.Q1;
import O2.R0;
import O2.V1;
import Q2.C1019e;
import Z2.m;
import Z3.z;
import a4.InterfaceC1088b;
import android.content.Context;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import b4.C1227s;
import com.google.ads.interactivemedia.v3.api.AdDisplayContainer;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;
import com.google.ads.interactivemedia.v3.api.AdEvent;
import com.google.ads.interactivemedia.v3.api.AdsLoader;
import com.google.ads.interactivemedia.v3.api.AdsRenderingSettings;
import com.google.ads.interactivemedia.v3.api.AdsRequest;
import com.google.ads.interactivemedia.v3.api.FriendlyObstruction;
import com.google.ads.interactivemedia.v3.api.FriendlyObstructionPurpose;
import com.google.ads.interactivemedia.v3.api.ImaSdkFactory;
import com.google.ads.interactivemedia.v3.api.ImaSdkSettings;
import com.google.ads.interactivemedia.v3.api.player.VideoAdPlayer;
import d4.AbstractC1684a;
import d4.k0;
import e4.C1737C;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import q3.C2540a;
import s5.AbstractC2743y;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements C3.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m.a f10949a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f10950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m.b f10951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C0148d f10952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final HashMap f10953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final HashMap f10954f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Q1.b f10955g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Q1.d f10956h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f10957i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public InterfaceC0920t1 f10958j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List f10959k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0920t1 f10960l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Z2.c f10961m;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Context f10962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ImaSdkSettings f10963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AdErrorEvent.AdErrorListener f10964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AdEvent.AdEventListener f10965d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public VideoAdPlayer.VideoAdPlayerCallback f10966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public List f10967f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Set f10968g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public Collection f10969h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public Boolean f10970i;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f10977p;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f10971j = 10000;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f10972k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f10973l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f10974m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f10975n = true;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f10976o = true;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public m.b f10978q = new c();

        public b(Context context) {
            this.f10962a = ((Context) AbstractC1684a.e(context)).getApplicationContext();
        }

        public d a() {
            return new d(this.f10962a, new m.a(this.f10971j, this.f10972k, this.f10973l, this.f10975n, this.f10976o, this.f10974m, this.f10970i, this.f10967f, this.f10968g, this.f10969h, this.f10964c, this.f10965d, this.f10966e, this.f10963b, this.f10977p), this.f10978q);
        }
    }

    public static final class c implements m.b {
        public c() {
        }

        @Override // Z2.m.b
        public AdsLoader a(Context context, ImaSdkSettings imaSdkSettings, AdDisplayContainer adDisplayContainer) {
            return ImaSdkFactory.getInstance().createAdsLoader(context, imaSdkSettings, adDisplayContainer);
        }

        @Override // Z2.m.b
        public AdDisplayContainer b(ViewGroup viewGroup, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAdDisplayContainer(viewGroup, videoAdPlayer);
        }

        @Override // Z2.m.b
        public ImaSdkSettings c() {
            ImaSdkSettings imaSdkSettingsCreateImaSdkSettings = ImaSdkFactory.getInstance().createImaSdkSettings();
            imaSdkSettingsCreateImaSdkSettings.setLanguage(k0.n0()[0]);
            return imaSdkSettingsCreateImaSdkSettings;
        }

        @Override // Z2.m.b
        public FriendlyObstruction d(View view, FriendlyObstructionPurpose friendlyObstructionPurpose, String str) {
            return ImaSdkFactory.getInstance().createFriendlyObstruction(view, friendlyObstructionPurpose, str);
        }

        @Override // Z2.m.b
        public AdsRenderingSettings e() {
            return ImaSdkFactory.getInstance().createAdsRenderingSettings();
        }

        @Override // Z2.m.b
        public AdsRequest f() {
            return ImaSdkFactory.getInstance().createAdsRequest();
        }

        @Override // Z2.m.b
        public AdDisplayContainer g(Context context, VideoAdPlayer videoAdPlayer) {
            return ImaSdkFactory.createAudioAdDisplayContainer(context, videoAdPlayer);
        }
    }

    /* JADX INFO: renamed from: Z2.d$d, reason: collision with other inner class name */
    public final class C0148d implements InterfaceC0920t1.d {
        public C0148d() {
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void A(C1019e c1019e) {
            AbstractC0926v1.a(this, c1019e);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void B(boolean z9) {
            AbstractC0926v1.j(this, z9);
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void E(int i9) {
            AbstractC0926v1.p(this, i9);
        }

        @Override // O2.InterfaceC0920t1.d
        public void J(boolean z9) {
            d.this.j();
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
            d.this.k();
            d.this.j();
        }

        @Override // O2.InterfaceC0920t1.d
        public /* synthetic */ void U(int i9, int i10) {
            AbstractC0926v1.A(this, i9, i10);
        }

        @Override // O2.InterfaceC0920t1.d
        public void V(Q1 q12, int i9) {
            if (q12.v()) {
                return;
            }
            d.this.k();
            d.this.j();
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
        public /* synthetic */ void e(C2540a c2540a) {
            AbstractC0926v1.m(this, c2540a);
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

        @Override // O2.InterfaceC0920t1.d
        public void onRepeatModeChanged(int i9) {
            d.this.j();
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

    static {
        AbstractC0928w0.a("goog.exo.ima");
    }

    public d(Context context, m.a aVar, m.b bVar) {
        this.f10950b = context.getApplicationContext();
        this.f10949a = aVar;
        this.f10951c = bVar;
        this.f10952d = new C0148d();
        this.f10959k = AbstractC2743y.z();
        this.f10953e = new HashMap();
        this.f10954f = new HashMap();
        this.f10955g = new Q1.b();
        this.f10956h = new Q1.d();
    }

    @Override // C3.e
    public void a(C3.h hVar, int i9, int i10) {
        if (this.f10960l == null) {
            return;
        }
        ((Z2.c) AbstractC1684a.e((Z2.c) this.f10954f.get(hVar))).U0(i9, i10);
    }

    @Override // C3.e
    public void b(C3.h hVar, int i9, int i10, IOException iOException) {
        if (this.f10960l == null) {
            return;
        }
        ((Z2.c) AbstractC1684a.e((Z2.c) this.f10954f.get(hVar))).V0(i9, i10, iOException);
    }

    @Override // C3.e
    public void c(int... iArr) {
        String str;
        ArrayList arrayList = new ArrayList();
        for (int i9 : iArr) {
            if (i9 == 0) {
                str = "application/dash+xml";
            } else if (i9 == 2) {
                str = "application/x-mpegURL";
            } else {
                if (i9 == 4) {
                    arrayList.addAll(Arrays.asList("video/mp4", "video/webm", "video/3gpp", "audio/mp4", "audio/mpeg"));
                }
            }
            arrayList.add(str);
        }
        this.f10959k = Collections.unmodifiableList(arrayList);
    }

    @Override // C3.e
    public void d(C3.h hVar, e.a aVar) {
        Z2.c cVar = (Z2.c) this.f10954f.remove(hVar);
        k();
        if (cVar != null) {
            cVar.j1(aVar);
        }
        if (this.f10960l == null || !this.f10954f.isEmpty()) {
            return;
        }
        this.f10960l.l(this.f10952d);
        this.f10960l = null;
    }

    @Override // C3.e
    public void e(C3.h hVar, C1227s c1227s, Object obj, InterfaceC1088b interfaceC1088b, e.a aVar) {
        AbstractC1684a.h(this.f10957i, "Set player using adsLoader.setPlayer before preparing the player.");
        if (this.f10954f.isEmpty()) {
            InterfaceC0920t1 interfaceC0920t1 = this.f10958j;
            this.f10960l = interfaceC0920t1;
            if (interfaceC0920t1 == null) {
                return;
            } else {
                interfaceC0920t1.B(this.f10952d);
            }
        }
        Z2.c cVar = (Z2.c) this.f10953e.get(obj);
        if (cVar == null) {
            l(c1227s, obj, interfaceC1088b.getAdViewGroup());
            cVar = (Z2.c) this.f10953e.get(obj);
        }
        this.f10954f.put(hVar, (Z2.c) AbstractC1684a.e(cVar));
        cVar.D0(aVar, interfaceC1088b);
        k();
    }

    @Override // C3.e
    public void f(InterfaceC0920t1 interfaceC0920t1) {
        AbstractC1684a.g(Looper.myLooper() == m.i());
        AbstractC1684a.g(interfaceC0920t1 == null || interfaceC0920t1.x() == m.i());
        this.f10958j = interfaceC0920t1;
        this.f10957i = true;
    }

    public final Z2.c i() {
        Object objM;
        Z2.c cVar;
        InterfaceC0920t1 interfaceC0920t1 = this.f10960l;
        if (interfaceC0920t1 == null) {
            return null;
        }
        Q1 q1W = interfaceC0920t1.w();
        if (q1W.v() || (objM = q1W.k(interfaceC0920t1.J(), this.f10955g).m()) == null || (cVar = (Z2.c) this.f10953e.get(objM)) == null || !this.f10954f.containsValue(cVar)) {
            return null;
        }
        return cVar;
    }

    public final void j() {
        int i9;
        Z2.c cVar;
        InterfaceC0920t1 interfaceC0920t1 = this.f10960l;
        if (interfaceC0920t1 == null) {
            return;
        }
        Q1 q1W = interfaceC0920t1.w();
        if (q1W.v() || (i9 = q1W.i(interfaceC0920t1.J(), this.f10955g, this.f10956h, interfaceC0920t1.getRepeatMode(), interfaceC0920t1.Z())) == -1) {
            return;
        }
        q1W.k(i9, this.f10955g);
        Object objM = this.f10955g.m();
        if (objM == null || (cVar = (Z2.c) this.f10953e.get(objM)) == null || cVar == this.f10961m) {
            return;
        }
        Q1.d dVar = this.f10956h;
        Q1.b bVar = this.f10955g;
        cVar.f1(k0.x1(((Long) q1W.o(dVar, bVar, bVar.f5718d, -9223372036854775807L).second).longValue()), k0.x1(this.f10955g.f5719e));
    }

    public final void k() {
        Z2.c cVar = this.f10961m;
        Z2.c cVarI = i();
        if (k0.c(cVar, cVarI)) {
            return;
        }
        if (cVar != null) {
            cVar.E0();
        }
        this.f10961m = cVarI;
        if (cVarI != null) {
            cVarI.C0((InterfaceC0920t1) AbstractC1684a.e(this.f10960l));
        }
    }

    public void l(C1227s c1227s, Object obj, ViewGroup viewGroup) {
        if (this.f10953e.containsKey(obj)) {
            return;
        }
        this.f10953e.put(obj, new Z2.c(this.f10950b, this.f10949a, this.f10951c, this.f10959k, c1227s, obj, viewGroup));
    }

    @Override // C3.e
    public void release() {
        InterfaceC0920t1 interfaceC0920t1 = this.f10960l;
        if (interfaceC0920t1 != null) {
            interfaceC0920t1.l(this.f10952d);
            this.f10960l = null;
            k();
        }
        this.f10958j = null;
        Iterator it = this.f10954f.values().iterator();
        while (it.hasNext()) {
            ((Z2.c) it.next()).release();
        }
        this.f10954f.clear();
        Iterator it2 = this.f10953e.values().iterator();
        while (it2.hasNext()) {
            ((Z2.c) it2.next()).release();
        }
        this.f10953e.clear();
    }
}
