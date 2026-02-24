package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class bpl implements btn {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bpk f21917a;

    private bpl(bpk bpkVar) {
        bqu.j(bpkVar, "output");
        this.f21917a = bpkVar;
        bpkVar.f21913a = this;
    }

    public static bpl a(bpk bpkVar) {
        bpl bplVar = bpkVar.f21913a;
        return bplVar != null ? bplVar : new bpl(bpkVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void A(int i9, long j9) throws IOException {
        this.f21917a.an(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void B(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.an(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).longValue();
            i11 += 8;
        }
        this.f21917a.az(i11);
        while (i10 < list.size()) {
            this.f21917a.ao(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void C(int i9, int i10) throws IOException {
        this.f21917a.ad(i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void D(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.ad(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int iL = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iL += bpk.L(((Integer) list.get(i11)).intValue());
        }
        this.f21917a.az(iL);
        while (i10 < list.size()) {
            this.f21917a.az(bpk.V(((Integer) list.get(i10)).intValue()));
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void E(int i9, long j9) throws IOException {
        this.f21917a.ae(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void F(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.ae(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int iN = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iN += bpk.N(((Long) list.get(i11)).longValue());
        }
        this.f21917a.az(iN);
        while (i10 < list.size()) {
            this.f21917a.aB(bpk.W(((Long) list.get(i10)).longValue()));
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    @Deprecated
    public final void G(int i9) throws IOException {
        this.f21917a.ax(i9, 3);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void H(int i9, String str) throws IOException {
        this.f21917a.av(i9, str);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void I(int i9, List list) throws IOException {
        int i10 = 0;
        if (!(list instanceof bre)) {
            while (i10 < list.size()) {
                this.f21917a.av(i9, (String) list.get(i10));
                i10++;
            }
            return;
        }
        bre breVar = (bre) list;
        while (i10 < list.size()) {
            Object objF = breVar.f(i10);
            if (objF instanceof String) {
                this.f21917a.av(i9, (String) objF);
            } else {
                this.f21917a.ak(i9, (bpb) objF);
            }
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void J(int i9, int i10) throws IOException {
        this.f21917a.ay(i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void K(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.ay(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int iS = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iS += bpk.S(((Integer) list.get(i11)).intValue());
        }
        this.f21917a.az(iS);
        while (i10 < list.size()) {
            this.f21917a.az(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void L(int i9, long j9) throws IOException {
        this.f21917a.aA(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void M(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.aA(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int iU = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += bpk.U(((Long) list.get(i11)).longValue());
        }
        this.f21917a.az(iU);
        while (i10 < list.size()) {
            this.f21917a.aB(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void b(int i9, boolean z9) throws IOException {
        this.f21917a.aj(i9, z9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void c(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.aj(i9, ((Boolean) list.get(i10)).booleanValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Boolean) list.get(i12)).booleanValue();
            i11++;
        }
        this.f21917a.az(i11);
        while (i10 < list.size()) {
            this.f21917a.ah(((Boolean) list.get(i10)).booleanValue() ? (byte) 1 : (byte) 0);
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void d(int i9, bpb bpbVar) throws IOException {
        this.f21917a.ak(i9, bpbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void e(int i9, List list) throws IOException {
        for (int i10 = 0; i10 < list.size(); i10++) {
            this.f21917a.ak(i9, (bpb) list.get(i10));
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void f(int i9, double d9) throws IOException {
        this.f21917a.aa(i9, d9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void g(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.aa(i9, ((Double) list.get(i10)).doubleValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Double) list.get(i12)).doubleValue();
            i11 += 8;
        }
        this.f21917a.az(i11);
        while (i10 < list.size()) {
            this.f21917a.ao(Double.doubleToRawLongBits(((Double) list.get(i10)).doubleValue()));
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    @Deprecated
    public final void h(int i9) throws IOException {
        this.f21917a.ax(i9, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void i(int i9, int i10) throws IOException {
        this.f21917a.ap(i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void j(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.ap(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int iD = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iD += bpk.D(((Integer) list.get(i11)).intValue());
        }
        this.f21917a.az(iD);
        while (i10 < list.size()) {
            this.f21917a.aq(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void k(int i9, int i10) throws IOException {
        this.f21917a.al(i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void l(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.al(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).intValue();
            i11 += 4;
        }
        this.f21917a.az(i11);
        while (i10 < list.size()) {
            this.f21917a.am(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void m(int i9, long j9) throws IOException {
        this.f21917a.an(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void n(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.an(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Long) list.get(i12)).longValue();
            i11 += 8;
        }
        this.f21917a.az(i11);
        while (i10 < list.size()) {
            this.f21917a.ao(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void o(int i9, float f9) throws IOException {
        this.f21917a.ab(i9, f9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void p(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.ab(i9, ((Float) list.get(i10)).floatValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Float) list.get(i12)).floatValue();
            i11 += 4;
        }
        this.f21917a.az(i11);
        while (i10 < list.size()) {
            this.f21917a.am(Float.floatToRawIntBits(((Float) list.get(i10)).floatValue()));
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void q(int i9, Object obj, bsi bsiVar) throws IOException {
        bpk bpkVar = this.f21917a;
        bpkVar.ax(i9, 3);
        bsiVar.j((brs) obj, bpkVar.f21913a);
        bpkVar.ax(i9, 4);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void r(int i9, int i10) throws IOException {
        this.f21917a.ap(i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void s(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.ap(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int iD = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iD += bpk.D(((Integer) list.get(i11)).intValue());
        }
        this.f21917a.az(iD);
        while (i10 < list.size()) {
            this.f21917a.aq(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void t(int i9, long j9) throws IOException {
        this.f21917a.aA(i9, j9);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void u(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.aA(i9, ((Long) list.get(i10)).longValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int iU = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += bpk.U(((Long) list.get(i11)).longValue());
        }
        this.f21917a.az(iU);
        while (i10 < list.size()) {
            this.f21917a.aB(((Long) list.get(i10)).longValue());
            i10++;
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void v(int i9, brm brmVar, Map map) throws IOException {
        for (Map.Entry entry : map.entrySet()) {
            this.f21917a.ax(i9, 2);
            this.f21917a.az(bsr.j(brmVar, entry.getKey(), entry.getValue()));
            bsr.k(this.f21917a, brmVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void w(int i9, Object obj, bsi bsiVar) throws IOException {
        this.f21917a.as(i9, (brs) obj, bsiVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void x(int i9, Object obj) throws IOException {
        if (obj instanceof bpb) {
            this.f21917a.au(i9, (bpb) obj);
        } else {
            this.f21917a.at(i9, (brs) obj);
        }
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void y(int i9, int i10) throws IOException {
        this.f21917a.al(i9, i10);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.btn
    public final void z(int i9, List list, boolean z9) throws IOException {
        int i10 = 0;
        if (!z9) {
            while (i10 < list.size()) {
                this.f21917a.al(i9, ((Integer) list.get(i10)).intValue());
                i10++;
            }
            return;
        }
        this.f21917a.ax(i9, 2);
        int i11 = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            ((Integer) list.get(i12)).intValue();
            i11 += 4;
        }
        this.f21917a.az(i11);
        while (i10 < list.size()) {
            this.f21917a.am(((Integer) list.get(i10)).intValue());
            i10++;
        }
    }
}
