package com.google.android.exoplayer2.source.smoothstreaming;

import B3.InterfaceC0501i;
import B3.InterfaceC0517z;
import B3.J;
import B3.Y;
import B3.Z;
import B3.g0;
import B3.i0;
import D3.i;
import N3.a;
import O2.C0936z0;
import O2.H1;
import V2.InterfaceC1065w;
import V2.y;
import Z3.s;
import b4.AbstractC1217h;
import b4.F;
import b4.H;
import b4.InterfaceC1211b;
import b4.S;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import java.util.ArrayList;
import java.util.List;
import z3.C3028H;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements InterfaceC0517z, Z.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b.a f25783a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S f25784c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f25785d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y f25786e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC1065w.a f25787f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final F f25788g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final J.a f25789h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final InterfaceC1211b f25790i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final i0 f25791j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final InterfaceC0501i f25792k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public InterfaceC0517z.a f25793l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public N3.a f25794m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public i[] f25795n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Z f25796o;

    public c(N3.a aVar, b.a aVar2, S s9, InterfaceC0501i interfaceC0501i, AbstractC1217h abstractC1217h, y yVar, InterfaceC1065w.a aVar3, F f9, J.a aVar4, H h9, InterfaceC1211b interfaceC1211b) {
        this.f25794m = aVar;
        this.f25783a = aVar2;
        this.f25784c = s9;
        this.f25785d = h9;
        this.f25786e = yVar;
        this.f25787f = aVar3;
        this.f25788g = f9;
        this.f25789h = aVar4;
        this.f25790i = interfaceC1211b;
        this.f25792k = interfaceC0501i;
        this.f25791j = o(aVar, yVar);
        i[] iVarArrQ = q(0);
        this.f25795n = iVarArrQ;
        this.f25796o = interfaceC0501i.a(iVarArrQ);
    }

    public static i0 o(N3.a aVar, y yVar) {
        g0[] g0VarArr = new g0[aVar.f5296f.length];
        int i9 = 0;
        while (true) {
            a.b[] bVarArr = aVar.f5296f;
            if (i9 >= bVarArr.length) {
                return new i0(g0VarArr);
            }
            C0936z0[] c0936z0Arr = bVarArr[i9].f5311j;
            C0936z0[] c0936z0Arr2 = new C0936z0[c0936z0Arr.length];
            for (int i10 = 0; i10 < c0936z0Arr.length; i10++) {
                C0936z0 c0936z0 = c0936z0Arr[i10];
                c0936z0Arr2[i10] = c0936z0.c(yVar.a(c0936z0));
            }
            g0VarArr[i9] = new g0(Integer.toString(i9), c0936z0Arr2);
            i9++;
        }
    }

    private static i[] q(int i9) {
        return new i[i9];
    }

    public final i a(s sVar, long j9) {
        int iC = this.f25791j.c(sVar.k());
        return new i(this.f25794m.f5296f[iC].f5302a, null, null, this.f25783a.a(this.f25785d, this.f25794m, iC, sVar, this.f25784c, null), this, this.f25790i, j9, this.f25786e, this.f25787f, this.f25788g, this.f25789h);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean b() {
        return this.f25796o.b();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long c() {
        return this.f25796o.c();
    }

    @Override // B3.InterfaceC0517z
    public long d(long j9, H1 h12) {
        for (i iVar : this.f25795n) {
            if (iVar.f1387a == 2) {
                return iVar.d(j9, h12);
            }
        }
        return j9;
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public boolean f(long j9) {
        return this.f25796o.f(j9);
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public long g() {
        return this.f25796o.g();
    }

    @Override // B3.InterfaceC0517z, B3.Z
    public void h(long j9) {
        this.f25796o.h(j9);
    }

    @Override // B3.InterfaceC0517z
    public long i(s[] sVarArr, boolean[] zArr, Y[] yArr, boolean[] zArr2, long j9) {
        s sVar;
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < sVarArr.length; i9++) {
            Y y9 = yArr[i9];
            if (y9 != null) {
                i iVar = (i) y9;
                if (sVarArr[i9] == null || !zArr[i9]) {
                    iVar.P();
                    yArr[i9] = null;
                } else {
                    ((b) iVar.E()).b(sVarArr[i9]);
                    arrayList.add(iVar);
                }
            }
            if (yArr[i9] == null && (sVar = sVarArr[i9]) != null) {
                i iVarA = a(sVar, j9);
                arrayList.add(iVarA);
                yArr[i9] = iVarA;
                zArr2[i9] = true;
            }
        }
        i[] iVarArrQ = q(arrayList.size());
        this.f25795n = iVarArrQ;
        arrayList.toArray(iVarArrQ);
        this.f25796o = this.f25792k.a(this.f25795n);
        return j9;
    }

    @Override // B3.InterfaceC0517z
    public List k(List list) {
        ArrayList arrayList = new ArrayList();
        for (int i9 = 0; i9 < list.size(); i9++) {
            s sVar = (s) list.get(i9);
            int iC = this.f25791j.c(sVar.k());
            for (int i10 = 0; i10 < sVar.length(); i10++) {
                arrayList.add(new C3028H(iC, sVar.d(i10)));
            }
        }
        return arrayList;
    }

    @Override // B3.InterfaceC0517z
    public long l(long j9) {
        for (i iVar : this.f25795n) {
            iVar.S(j9);
        }
        return j9;
    }

    @Override // B3.InterfaceC0517z
    public long m() {
        return -9223372036854775807L;
    }

    @Override // B3.InterfaceC0517z
    public void p() {
        this.f25785d.a();
    }

    @Override // B3.Z.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void j(i iVar) {
        this.f25793l.j(this);
    }

    @Override // B3.InterfaceC0517z
    public void s(InterfaceC0517z.a aVar, long j9) {
        this.f25793l = aVar;
        aVar.e(this);
    }

    public void t() {
        for (i iVar : this.f25795n) {
            iVar.P();
        }
        this.f25793l = null;
    }

    @Override // B3.InterfaceC0517z
    public i0 u() {
        return this.f25791j;
    }

    @Override // B3.InterfaceC0517z
    public void v(long j9, boolean z9) {
        for (i iVar : this.f25795n) {
            iVar.v(j9, z9);
        }
    }

    public void w(N3.a aVar) {
        this.f25794m = aVar;
        for (i iVar : this.f25795n) {
            ((b) iVar.E()).f(aVar);
        }
        this.f25793l.j(this);
    }
}
