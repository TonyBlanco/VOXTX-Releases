package com.google.ads.interactivemedia.v3.internal;

import android.os.Looper;
import android.util.SparseArray;
import com.facebook.ads.AdError;
import java.io.IOException;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;

/* JADX INFO: loaded from: classes3.dex */
public final class im implements hu {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bn f23262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final bc f23263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bd f23264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final il f23265d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SparseArray f23266e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ca f23267f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private az f23268g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bv f23269h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f23270i;

    public im(bn bnVar) {
        af.s(bnVar);
        this.f23262a = bnVar;
        this.f23267f = new ca(cq.D(), bnVar, new by() { // from class: com.google.ads.interactivemedia.v3.internal.hy
            @Override // com.google.ads.interactivemedia.v3.internal.by
            public final void a(Object obj, C1328q c1328q) {
            }
        });
        bc bcVar = new bc();
        this.f23263b = bcVar;
        this.f23264c = new bd();
        this.f23265d = new il(bcVar);
        this.f23266e = new SparseArray();
    }

    public static /* synthetic */ void V(im imVar) {
        hv hvVarT = imVar.T();
        imVar.Y(hvVarT, 1028, new fw(hvVarT, 7));
        imVar.f23267f.e();
    }

    private final hv Z(te teVar) {
        af.s(this.f23268g);
        be beVarA = teVar == null ? null : this.f23265d.a(teVar);
        if (teVar != null && beVarA != null) {
            return U(beVarA, beVarA.n(teVar.f20173a, this.f23263b).f21037c, teVar);
        }
        int iH = this.f23268g.h();
        be beVarO = this.f23268g.o();
        if (iH >= beVarO.c()) {
            beVarO = be.f21126a;
        }
        return U(beVarO, iH, null);
    }

    private final hv aa(int i9, te teVar) {
        af.s(this.f23268g);
        if (teVar != null) {
            return this.f23265d.a(teVar) != null ? Z(teVar) : U(be.f21126a, i9, teVar);
        }
        be beVarO = this.f23268g.o();
        if (i9 >= beVarO.c()) {
            beVarO = be.f21126a;
        }
        return U(beVarO, i9, null);
    }

    private final hv ab() {
        return Z(this.f23265d.d());
    }

    private final hv ac() {
        return Z(this.f23265d.e());
    }

    private final hv ad(at atVar) {
        am amVar;
        return (!(atVar instanceof ev) || (amVar = ((ev) atVar).f22865h) == null) ? T() : Z(new te(amVar));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void A(ep epVar) {
        hv hvVarAb = ab();
        Y(hvVarAb, 1013, new hx(hvVarAb, epVar, 15));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void B(ep epVar) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1007, new hx(hvVarAc, epVar, 12));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void C(C1333s c1333s, eq eqVar) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1009, new Cif(hvVarAc, c1333s, eqVar, 4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void D(final long j9) {
        final hv hvVarAc = ac();
        Y(hvVarAc, 1010, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.ii
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void E(Exception exc) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1014, new hx(hvVarAc, exc, 5));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void F(int i9, long j9, long j10) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1011, new hz(hvVarAc, i9, j9, j10, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void G(int i9, long j9) {
        hv hvVarAb = ab();
        Y(hvVarAb, 1018, new ie(hvVarAb, i9, j9, 0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void H(final Object obj, final long j9) {
        final hv hvVarAc = ac();
        Y(hvVarAc, 26, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.ij
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj2) {
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void I(Exception exc) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1030, new hx(hvVarAc, exc, 4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void J(String str, long j9, long j10) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1016, new ig(hvVarAc, str, j10, j9, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void K(String str) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1019, new hx(hvVarAc, str, 0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void L(ep epVar) {
        hv hvVarAb = ab();
        Y(hvVarAb, 1020, new hx(hvVarAb, epVar, 17));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void M(ep epVar) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1015, new hx(hvVarAc, epVar, 10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void N(long j9, int i9) {
        hv hvVarAb = ab();
        Y(hvVarAb, 1021, new ie(hvVarAb, j9, i9, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void O(C1333s c1333s, eq eqVar) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1017, new Cif(hvVarAc, c1333s, eqVar, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void P() {
        bv bvVar = this.f23269h;
        af.t(bvVar);
        bvVar.e(new ky(this, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void Q(hw hwVar) {
        this.f23267f.f(hwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void R(final az azVar, Looper looper) {
        boolean z9 = true;
        if (this.f23268g != null && !this.f23265d.f23257b.isEmpty()) {
            z9 = false;
        }
        af.w(z9);
        af.s(azVar);
        this.f23268g = azVar;
        this.f23269h = this.f23262a.b(looper, null);
        this.f23267f = this.f23267f.a(looper, new by() { // from class: com.google.ads.interactivemedia.v3.internal.ic
            @Override // com.google.ads.interactivemedia.v3.internal.by
            public final void a(Object obj, C1328q c1328q) {
                this.f23225a.W(azVar, (hw) obj, c1328q);
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void S(List list, te teVar) {
        il ilVar = this.f23265d;
        az azVar = this.f23268g;
        af.s(azVar);
        ilVar.h(list, teVar, azVar);
    }

    public final hv T() {
        return Z(this.f23265d.b());
    }

    public final hv U(be beVar, int i9, te teVar) {
        te teVar2 = true == beVar.p() ? null : teVar;
        long jA = this.f23262a.a();
        boolean z9 = beVar.equals(this.f23268g.o()) && i9 == this.f23268g.h();
        long jA2 = 0;
        if (teVar2 == null || !teVar2.b()) {
            if (z9) {
                jA2 = this.f23268g.l();
            } else if (!beVar.p()) {
                jA2 = beVar.o(i9, this.f23264c).a();
            }
        } else if (z9 && this.f23268g.f() == teVar2.f20174b && this.f23268g.g() == teVar2.f20175c) {
            jA2 = this.f23268g.m();
        }
        return new hv(jA, beVar, i9, teVar2, jA2, this.f23268g.o(), this.f23268g.h(), this.f23265d.b(), this.f23268g.m(), this.f23268g.n());
    }

    public final /* synthetic */ void W(az azVar, hw hwVar, C1328q c1328q) {
        hwVar.i(azVar, new aeq(c1328q, this.f23266e));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.wp
    public final void X(int i9, long j9, long j10) {
        hv hvVarZ = Z(this.f23265d.c());
        Y(hvVarZ, 1006, new hz(hvVarZ, i9, j9, j10, 0));
    }

    public final void Y(hv hvVar, int i9, bx bxVar) {
        this.f23266e.put(i9, hvVar);
        this.f23267f.g(i9, bxVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void a(aw awVar) {
        hv hvVarT = T();
        Y(hvVarT, 13, new hx(hvVarT, awVar, 6));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ae(int i9, te teVar, tb tbVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1004, new hx(hvVarAa, tbVar, 3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void af(int i9, te teVar, sw swVar, tb tbVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, AdError.LOAD_TOO_FREQUENTLY_ERROR_CODE, new Cif(hvVarAa, swVar, tbVar, 0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ag(int i9, te teVar, sw swVar, tb tbVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1001, new Cif(hvVarAa, swVar, tbVar, 3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ah(int i9, te teVar, final sw swVar, final tb tbVar, final IOException iOException, final boolean z9) {
        final hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1003, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.id
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj) {
                ((hw) obj).d(tbVar);
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void ai(int i9, te teVar, sw swVar, tb tbVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1000, new Cif(hvVarAa, swVar, tbVar, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.tk
    public final void aj(int i9, te teVar, tb tbVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, WebSocketProtocol.CLOSE_NO_STATUS_CODE, new hx(hvVarAa, tbVar, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void ak(int i9, te teVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1023, new fw(hvVarAa, 5));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void al(int i9, te teVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1025, new fw(hvVarAa, 3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void am(int i9, te teVar, int i10) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1022, new fb(hvVarAa, i10, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void an(int i9, te teVar, Exception exc) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1024, new hx(hvVarAa, exc, 18));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final void ao(int i9, te teVar) {
        hv hvVarAa = aa(i9, teVar);
        Y(hvVarAa, 1027, new fw(hvVarAa, 4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.no
    public final /* synthetic */ void ap() {
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void b(C1313l c1313l) {
        hv hvVarT = T();
        Y(hvVarT, 29, new hx(hvVarT, c1313l, 7));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void c(int i9, boolean z9) {
        hv hvVarT = T();
        Y(hvVarT, 30, new ib(hvVarT, i9, z9, 0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void d(boolean z9) {
        hv hvVarT = T();
        Y(hvVarT, 3, new ih(hvVarT, z9, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void e(boolean z9) {
        hv hvVarT = T();
        Y(hvVarT, 7, new ih(hvVarT, z9, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void f(ai aiVar, int i9) {
        hv hvVarT = T();
        Y(hvVarT, 1, new ft(hvVarT, aiVar, i9, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void g(al alVar) {
        hv hvVarT = T();
        Y(hvVarT, 14, new hx(hvVarT, alVar, 14));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void h(boolean z9, int i9) {
        hv hvVarT = T();
        Y(hvVarT, 5, new ib(hvVarT, z9, i9, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void i(au auVar) {
        hv hvVarT = T();
        Y(hvVarT, 12, new hx(hvVarT, auVar, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void j(int i9) {
        hv hvVarT = T();
        Y(hvVarT, 4, new fb(hvVarT, i9, 3));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void k(int i9) {
        hv hvVarT = T();
        Y(hvVarT, 6, new fb(hvVarT, i9, 4));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void l(at atVar) {
        hv hvVarAd = ad(atVar);
        Y(hvVarAd, 10, new hx(hvVarAd, atVar, 11));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void m(at atVar) {
        hv hvVarAd = ad(atVar);
        Y(hvVarAd, 10, new hx(hvVarAd, atVar, 13));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void n(boolean z9, int i9) {
        hv hvVarT = T();
        Y(hvVarT, -1, new ib(hvVarT, z9, i9, 1));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void o(final ay ayVar, final ay ayVar2, final int i9) {
        if (i9 == 1) {
            this.f23270i = false;
            i9 = 1;
        }
        il ilVar = this.f23265d;
        az azVar = this.f23268g;
        af.s(azVar);
        ilVar.g(azVar);
        final hv hvVarT = T();
        Y(hvVarT, 11, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.ia
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj) {
                ((hw) obj).f(i9);
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void p() {
        hv hvVarT = T();
        Y(hvVarT, -1, new fw(hvVarT, 6));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void q(boolean z9) {
        hv hvVarAc = ac();
        Y(hvVarAc, 23, new ih(hvVarAc, z9, 0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void r(final int i9, final int i10) {
        final hv hvVarAc = ac();
        Y(hvVarAc, 24, new bx() { // from class: com.google.ads.interactivemedia.v3.internal.ik
            @Override // com.google.ads.interactivemedia.v3.internal.bx
            public final void a(Object obj) {
            }
        });
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void s(bk bkVar) {
        hv hvVarT = T();
        Y(hvVarT, 2, new hx(hvVarT, bkVar, 8));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void t(bl blVar) {
        hv hvVarAc = ac();
        Y(hvVarAc, 25, new hx(hvVarAc, blVar, 16));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.ax
    public final void u(int i9) {
        il ilVar = this.f23265d;
        az azVar = this.f23268g;
        af.s(azVar);
        ilVar.i(azVar);
        hv hvVarT = T();
        Y(hvVarT, 0, new fb(hvVarT, i9, 2));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void v(hw hwVar) {
        af.s(hwVar);
        this.f23267f.b(hwVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void w() {
        if (this.f23270i) {
            return;
        }
        hv hvVarT = T();
        this.f23270i = true;
        Y(hvVarT, -1, new fw(hvVarT, 8));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void x(Exception exc) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1029, new hx(hvVarAc, exc, 9));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void y(String str, long j9, long j10) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1008, new ig(hvVarAc, str, j10, j9, 0));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.hu
    public final void z(String str) {
        hv hvVarAc = ac();
        Y(hvVarAc, 1012, new hx(hvVarAc, str, 19));
    }
}
