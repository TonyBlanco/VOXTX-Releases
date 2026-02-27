package x;

import java.util.ArrayList;
import x.e;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public e f51722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f51723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public e f51724c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public e f51725d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public e f51726e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public e f51727f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public e f51728g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ArrayList f51729h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f51730i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f51731j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f51732k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f51733l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f51734m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f51735n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f51736o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f51737p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f51738q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f51739r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f51740s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f51741t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f51742u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f51743v;

    public c(e eVar, int i9, boolean z9) {
        this.f51722a = eVar;
        this.f51737p = i9;
        this.f51738q = z9;
    }

    public static boolean c(e eVar, int i9) {
        int i10;
        return eVar.M() != 8 && eVar.f51765M[i9] == e.b.MATCH_CONSTRAINT && ((i10 = eVar.f51805n[i9]) == 0 || i10 == 3);
    }

    public void a() {
        if (!this.f51743v) {
            b();
        }
        this.f51743v = true;
    }

    public final void b() {
        int i9 = this.f51737p * 2;
        e eVar = this.f51722a;
        this.f51736o = true;
        e eVar2 = eVar;
        boolean z9 = false;
        while (!z9) {
            this.f51730i++;
            e[] eVarArr = eVar.f51816s0;
            int i10 = this.f51737p;
            e eVar3 = null;
            eVarArr[i10] = null;
            eVar.f51814r0[i10] = null;
            if (eVar.M() != 8) {
                this.f51733l++;
                e.b bVarQ = eVar.q(this.f51737p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarQ != bVar) {
                    this.f51734m += eVar.y(this.f51737p);
                }
                int iB = this.f51734m + eVar.f51762J[i9].b();
                this.f51734m = iB;
                int i11 = i9 + 1;
                this.f51734m = iB + eVar.f51762J[i11].b();
                int iB2 = this.f51735n + eVar.f51762J[i9].b();
                this.f51735n = iB2;
                this.f51735n = iB2 + eVar.f51762J[i11].b();
                if (this.f51723b == null) {
                    this.f51723b = eVar;
                }
                this.f51725d = eVar;
                e.b[] bVarArr = eVar.f51765M;
                int i12 = this.f51737p;
                if (bVarArr[i12] == bVar) {
                    int i13 = eVar.f51805n[i12];
                    if (i13 == 0 || i13 == 3 || i13 == 2) {
                        this.f51731j++;
                        float f9 = eVar.f51812q0[i12];
                        if (f9 > 0.0f) {
                            this.f51732k += f9;
                        }
                        if (c(eVar, i12)) {
                            if (f9 < 0.0f) {
                                this.f51739r = true;
                            } else {
                                this.f51740s = true;
                            }
                            if (this.f51729h == null) {
                                this.f51729h = new ArrayList();
                            }
                            this.f51729h.add(eVar);
                        }
                        if (this.f51727f == null) {
                            this.f51727f = eVar;
                        }
                        e eVar4 = this.f51728g;
                        if (eVar4 != null) {
                            eVar4.f51814r0[this.f51737p] = eVar;
                        }
                        this.f51728g = eVar;
                    }
                    if (this.f51737p != 0 ? !(eVar.f51803m == 0 && eVar.f51813r == 0 && eVar.f51815s == 0) : !(eVar.f51801l == 0 && eVar.f51807o == 0 && eVar.f51809p == 0)) {
                        this.f51736o = false;
                    }
                    if (eVar.f51769Q != 0.0f) {
                        this.f51736o = false;
                        this.f51742u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.f51816s0[this.f51737p] = eVar;
            }
            d dVar = eVar.f51762J[i9 + 1].f51747d;
            if (dVar != null) {
                e eVar5 = dVar.f51745b;
                d dVar2 = eVar5.f51762J[i9].f51747d;
                if (dVar2 != null && dVar2.f51745b == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z9 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f51723b;
        if (eVar6 != null) {
            this.f51734m -= eVar6.f51762J[i9].b();
        }
        e eVar7 = this.f51725d;
        if (eVar7 != null) {
            this.f51734m -= eVar7.f51762J[i9 + 1].b();
        }
        this.f51724c = eVar;
        if (this.f51737p == 0 && this.f51738q) {
            this.f51726e = eVar;
        } else {
            this.f51726e = this.f51722a;
        }
        this.f51741t = this.f51740s && this.f51739r;
    }
}
