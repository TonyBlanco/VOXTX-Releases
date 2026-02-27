package com.google.ads.interactivemedia.v3.internal;

import com.google.android.gms.common.api.a;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class bpi implements bsd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final bpg f21907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f21908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f21909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f21910d = 0;

    private bpi(bpg bpgVar) {
        bqu.j(bpgVar, "input");
        this.f21907a = bpgVar;
        bpgVar.f21904d = this;
    }

    private final Object S(bsi bsiVar, bqb bqbVar) throws IOException {
        Object objE = bsiVar.e();
        U(objE, bsiVar, bqbVar);
        bsiVar.f(objE);
        return objE;
    }

    private final Object T(bsi bsiVar, bqb bqbVar) throws IOException {
        Object objE = bsiVar.e();
        V(objE, bsiVar, bqbVar);
        bsiVar.f(objE);
        return objE;
    }

    private final void U(Object obj, bsi bsiVar, bqb bqbVar) throws IOException {
        int i9 = this.f21909c;
        this.f21909c = btm.c(btm.a(this.f21908b), 4);
        try {
            bsiVar.h(obj, this, bqbVar);
            if (this.f21908b == this.f21909c) {
            } else {
                throw bqw.g();
            }
        } finally {
            this.f21909c = i9;
        }
    }

    private final void V(Object obj, bsi bsiVar, bqb bqbVar) throws IOException {
        int iN = this.f21907a.n();
        bpg bpgVar = this.f21907a;
        if (bpgVar.f21901a >= bpgVar.f21902b) {
            throw new bqw("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iE = bpgVar.e(iN);
        this.f21907a.f21901a++;
        bsiVar.h(obj, this, bqbVar);
        this.f21907a.z(0);
        r5.f21901a--;
        this.f21907a.A(iE);
    }

    private final void W(int i9) throws IOException {
        if (this.f21907a.d() != i9) {
            throw bqw.i();
        }
    }

    private final void X(int i9) throws IOException {
        if (btm.b(this.f21908b) != i9) {
            throw bqw.a();
        }
    }

    private static final void Y(int i9) throws IOException {
        if ((i9 & 3) != 0) {
            throw bqw.g();
        }
    }

    private static final void Z(int i9) throws IOException {
        if ((i9 & 7) != 0) {
            throw bqw.g();
        }
    }

    public static bpi q(bpg bpgVar) {
        bpi bpiVar = bpgVar.f21904d;
        return bpiVar != null ? bpiVar : new bpi(bpgVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void A(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bqo)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21907a.f()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Integer.valueOf(this.f21907a.f()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bqo bqoVar = (bqo) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                bqoVar.g(this.f21907a.f());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            bqoVar.g(this.f21907a.f());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void B(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bqo)) {
            int iB = btm.b(this.f21908b);
            if (iB == 2) {
                int iN = this.f21907a.n();
                Y(iN);
                int iD = this.f21907a.d() + iN;
                do {
                    list.add(Integer.valueOf(this.f21907a.g()));
                } while (this.f21907a.d() < iD);
                return;
            }
            if (iB != 5) {
                throw bqw.a();
            }
            do {
                list.add(Integer.valueOf(this.f21907a.g()));
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM = this.f21907a.m();
                }
            } while (iM == this.f21908b);
            this.f21910d = iM;
            return;
        }
        bqo bqoVar = (bqo) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 2) {
            int iN2 = this.f21907a.n();
            Y(iN2);
            int iD2 = this.f21907a.d() + iN2;
            do {
                bqoVar.g(this.f21907a.g());
            } while (this.f21907a.d() < iD2);
            return;
        }
        if (iB2 != 5) {
            throw bqw.a();
        }
        do {
            bqoVar.g(this.f21907a.g());
            if (this.f21907a.C()) {
                return;
            } else {
                iM2 = this.f21907a.m();
            }
        } while (iM2 == this.f21908b);
        this.f21910d = iM2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void C(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bri)) {
            int iB = btm.b(this.f21908b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f21907a.o()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iN = this.f21907a.n();
            Z(iN);
            int iD = this.f21907a.d() + iN;
            do {
                list.add(Long.valueOf(this.f21907a.o()));
            } while (this.f21907a.d() < iD);
            return;
        }
        bri briVar = (bri) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 1) {
            do {
                briVar.f(this.f21907a.o());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iN2 = this.f21907a.n();
        Z(iN2);
        int iD2 = this.f21907a.d() + iN2;
        do {
            briVar.f(this.f21907a.o());
        } while (this.f21907a.d() < iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void D(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bqh)) {
            int iB = btm.b(this.f21908b);
            if (iB == 2) {
                int iN = this.f21907a.n();
                Y(iN);
                int iD = this.f21907a.d() + iN;
                do {
                    list.add(Float.valueOf(this.f21907a.c()));
                } while (this.f21907a.d() < iD);
                return;
            }
            if (iB != 5) {
                throw bqw.a();
            }
            do {
                list.add(Float.valueOf(this.f21907a.c()));
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM = this.f21907a.m();
                }
            } while (iM == this.f21908b);
            this.f21910d = iM;
            return;
        }
        bqh bqhVar = (bqh) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 2) {
            int iN2 = this.f21907a.n();
            Y(iN2);
            int iD2 = this.f21907a.d() + iN2;
            do {
                bqhVar.e(this.f21907a.c());
            } while (this.f21907a.d() < iD2);
            return;
        }
        if (iB2 != 5) {
            throw bqw.a();
        }
        do {
            bqhVar.e(this.f21907a.c());
            if (this.f21907a.C()) {
                return;
            } else {
                iM2 = this.f21907a.m();
            }
        } while (iM2 == this.f21908b);
        this.f21910d = iM2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    @Deprecated
    public final void E(List list, bsi bsiVar, bqb bqbVar) throws IOException {
        int iM;
        int i9 = this.f21908b;
        if (btm.b(i9) != 3) {
            throw bqw.a();
        }
        do {
            list.add(S(bsiVar, bqbVar));
            if (this.f21907a.C() || this.f21910d != 0) {
                return;
            } else {
                iM = this.f21907a.m();
            }
        } while (iM == i9);
        this.f21910d = iM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void F(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bqo)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21907a.h()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Integer.valueOf(this.f21907a.h()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bqo bqoVar = (bqo) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                bqoVar.g(this.f21907a.h());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            bqoVar.g(this.f21907a.h());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void G(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bri)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f21907a.p()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Long.valueOf(this.f21907a.p()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bri briVar = (bri) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                briVar.f(this.f21907a.p());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            briVar.f(this.f21907a.p());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void H(List list, bsi bsiVar, bqb bqbVar) throws IOException {
        int iM;
        int i9 = this.f21908b;
        if (btm.b(i9) != 2) {
            throw bqw.a();
        }
        do {
            list.add(T(bsiVar, bqbVar));
            if (this.f21907a.C() || this.f21910d != 0) {
                return;
            } else {
                iM = this.f21907a.m();
            }
        } while (iM == i9);
        this.f21910d = iM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void I(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bqo)) {
            int iB = btm.b(this.f21908b);
            if (iB == 2) {
                int iN = this.f21907a.n();
                Y(iN);
                int iD = this.f21907a.d() + iN;
                do {
                    list.add(Integer.valueOf(this.f21907a.k()));
                } while (this.f21907a.d() < iD);
                return;
            }
            if (iB != 5) {
                throw bqw.a();
            }
            do {
                list.add(Integer.valueOf(this.f21907a.k()));
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM = this.f21907a.m();
                }
            } while (iM == this.f21908b);
            this.f21910d = iM;
            return;
        }
        bqo bqoVar = (bqo) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 2) {
            int iN2 = this.f21907a.n();
            Y(iN2);
            int iD2 = this.f21907a.d() + iN2;
            do {
                bqoVar.g(this.f21907a.k());
            } while (this.f21907a.d() < iD2);
            return;
        }
        if (iB2 != 5) {
            throw bqw.a();
        }
        do {
            bqoVar.g(this.f21907a.k());
            if (this.f21907a.C()) {
                return;
            } else {
                iM2 = this.f21907a.m();
            }
        } while (iM2 == this.f21908b);
        this.f21910d = iM2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void J(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bri)) {
            int iB = btm.b(this.f21908b);
            if (iB == 1) {
                do {
                    list.add(Long.valueOf(this.f21907a.t()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iN = this.f21907a.n();
            Z(iN);
            int iD = this.f21907a.d() + iN;
            do {
                list.add(Long.valueOf(this.f21907a.t()));
            } while (this.f21907a.d() < iD);
            return;
        }
        bri briVar = (bri) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 1) {
            do {
                briVar.f(this.f21907a.t());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iN2 = this.f21907a.n();
        Z(iN2);
        int iD2 = this.f21907a.d() + iN2;
        do {
            briVar.f(this.f21907a.t());
        } while (this.f21907a.d() < iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void K(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bqo)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21907a.l()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Integer.valueOf(this.f21907a.l()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bqo bqoVar = (bqo) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                bqoVar.g(this.f21907a.l());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            bqoVar.g(this.f21907a.l());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void L(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bri)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f21907a.u()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Long.valueOf(this.f21907a.u()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bri briVar = (bri) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                briVar.f(this.f21907a.u());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            briVar.f(this.f21907a.u());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    public final void M(List list, boolean z9) throws IOException {
        int iM;
        int iM2;
        if (btm.b(this.f21908b) != 2) {
            throw bqw.a();
        }
        if (!(list instanceof bre) || z9) {
            do {
                list.add(z9 ? u() : t());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM = this.f21907a.m();
                }
            } while (iM == this.f21908b);
            this.f21910d = iM;
            return;
        }
        bre breVar = (bre) list;
        do {
            breVar.i(p());
            if (this.f21907a.C()) {
                return;
            } else {
                iM2 = this.f21907a.m();
            }
        } while (iM2 == this.f21908b);
        this.f21910d = iM2;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void N(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bqo)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Integer.valueOf(this.f21907a.n()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Integer.valueOf(this.f21907a.n()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bqo bqoVar = (bqo) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                bqoVar.g(this.f21907a.n());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            bqoVar.g(this.f21907a.n());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void O(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bri)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Long.valueOf(this.f21907a.v()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Long.valueOf(this.f21907a.v()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bri briVar = (bri) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                briVar.f(this.f21907a.v());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            briVar.f(this.f21907a.v());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final boolean P() throws IOException {
        X(0);
        return this.f21907a.D();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final boolean Q() throws IOException {
        int i9;
        if (this.f21907a.C() || (i9 = this.f21908b) == this.f21909c) {
            return false;
        }
        return this.f21907a.E(i9);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x004c, code lost:
    
        r6.put(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004f, code lost:
    
        r5.f21907a.A(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        return;
     */
    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void R(java.util.Map r6, com.google.ads.interactivemedia.v3.internal.brm r7) throws java.io.IOException {
        /*
            r5 = this;
            r0 = 2
            r5.X(r0)
            com.google.ads.interactivemedia.v3.internal.bpg r1 = r5.f21907a
            int r1 = r1.n()
            com.google.ads.interactivemedia.v3.internal.bpg r2 = r5.f21907a
            int r1 = r2.e(r1)
            java.lang.Object r7 = r7.f22164b
        L12:
            int r7 = r5.c()     // Catch: java.lang.Throwable -> L39
            r2 = 2147483647(0x7fffffff, float:NaN)
            r3 = 0
            if (r7 == r2) goto L4c
            com.google.ads.interactivemedia.v3.internal.bpg r2 = r5.f21907a     // Catch: java.lang.Throwable -> L39
            boolean r2 = r2.C()     // Catch: java.lang.Throwable -> L39
            if (r2 == 0) goto L25
            goto L4c
        L25:
            r2 = 1
            java.lang.String r4 = "Unable to parse map entry."
            if (r7 == r2) goto L3c
            if (r7 == r0) goto L3b
            boolean r7 = r5.Q()     // Catch: java.lang.Throwable -> L39 com.google.ads.interactivemedia.v3.internal.bqv -> L3f
            if (r7 == 0) goto L33
            goto L12
        L33:
            com.google.ads.interactivemedia.v3.internal.bqw r7 = new com.google.ads.interactivemedia.v3.internal.bqw     // Catch: java.lang.Throwable -> L39 com.google.ads.interactivemedia.v3.internal.bqv -> L3f
            r7.<init>(r4)     // Catch: java.lang.Throwable -> L39 com.google.ads.interactivemedia.v3.internal.bqv -> L3f
            throw r7     // Catch: java.lang.Throwable -> L39 com.google.ads.interactivemedia.v3.internal.bqv -> L3f
        L39:
            r6 = move-exception
            goto L55
        L3b:
            throw r3     // Catch: java.lang.Throwable -> L39 com.google.ads.interactivemedia.v3.internal.bqv -> L3f
        L3c:
            int r7 = com.google.ads.interactivemedia.v3.internal.bph.f21906b     // Catch: java.lang.Throwable -> L39 com.google.ads.interactivemedia.v3.internal.bqv -> L3f
            throw r3     // Catch: java.lang.Throwable -> L39 com.google.ads.interactivemedia.v3.internal.bqv -> L3f
        L3f:
            boolean r7 = r5.Q()     // Catch: java.lang.Throwable -> L39
            if (r7 == 0) goto L46
            goto L12
        L46:
            com.google.ads.interactivemedia.v3.internal.bqw r6 = new com.google.ads.interactivemedia.v3.internal.bqw     // Catch: java.lang.Throwable -> L39
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L39
            throw r6     // Catch: java.lang.Throwable -> L39
        L4c:
            r6.put(r3, r3)     // Catch: java.lang.Throwable -> L39
            com.google.ads.interactivemedia.v3.internal.bpg r6 = r5.f21907a
            r6.A(r1)
            return
        L55:
            com.google.ads.interactivemedia.v3.internal.bpg r7 = r5.f21907a
            r7.A(r1)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.v3.internal.bpi.R(java.util.Map, com.google.ads.interactivemedia.v3.internal.brm):void");
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final double a() throws IOException {
        X(1);
        return this.f21907a.b();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final float b() throws IOException {
        X(5);
        return this.f21907a.c();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int c() throws IOException {
        int iM = this.f21910d;
        if (iM != 0) {
            this.f21908b = iM;
            this.f21910d = 0;
        } else {
            iM = this.f21907a.m();
            this.f21908b = iM;
        }
        return (iM == 0 || iM == this.f21909c) ? a.e.API_PRIORITY_OTHER : btm.a(iM);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int d() {
        return this.f21908b;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int e() throws IOException {
        X(0);
        return this.f21907a.f();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int f() throws IOException {
        X(5);
        return this.f21907a.g();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int g() throws IOException {
        X(0);
        return this.f21907a.h();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int h() throws IOException {
        X(5);
        return this.f21907a.k();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int i() throws IOException {
        X(0);
        return this.f21907a.l();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final int j() throws IOException {
        X(0);
        return this.f21907a.n();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final long k() throws IOException {
        X(1);
        return this.f21907a.o();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final long l() throws IOException {
        X(0);
        return this.f21907a.p();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final long m() throws IOException {
        X(1);
        return this.f21907a.t();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final long n() throws IOException {
        X(0);
        return this.f21907a.u();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final long o() throws IOException {
        X(0);
        return this.f21907a.v();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final bpb p() throws IOException {
        X(2);
        return this.f21907a.w();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    @Deprecated
    public final Object r(Class cls, bqb bqbVar) throws IOException {
        X(3);
        return S(bsa.a().b(cls), bqbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final Object s(Class cls, bqb bqbVar) throws IOException {
        X(2);
        return T(bsa.a().b(cls), bqbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final String t() throws IOException {
        X(2);
        return this.f21907a.x();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final String u() throws IOException {
        X(2);
        return this.f21907a.y();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void v(Object obj, bsi bsiVar, bqb bqbVar) throws IOException {
        X(3);
        U(obj, bsiVar, bqbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void w(Object obj, bsi bsiVar, bqb bqbVar) throws IOException {
        X(2);
        V(obj, bsiVar, bqbVar);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void x(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bos)) {
            int iB = btm.b(this.f21908b);
            if (iB == 0) {
                do {
                    list.add(Boolean.valueOf(this.f21907a.D()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iD = this.f21907a.d() + this.f21907a.n();
            do {
                list.add(Boolean.valueOf(this.f21907a.D()));
            } while (this.f21907a.d() < iD);
            W(iD);
            return;
        }
        bos bosVar = (bos) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 0) {
            do {
                bosVar.e(this.f21907a.D());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iD2 = this.f21907a.d() + this.f21907a.n();
        do {
            bosVar.e(this.f21907a.D());
        } while (this.f21907a.d() < iD2);
        W(iD2);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void y(List list) throws IOException {
        int iM;
        if (btm.b(this.f21908b) != 2) {
            throw bqw.a();
        }
        do {
            list.add(p());
            if (this.f21907a.C()) {
                return;
            } else {
                iM = this.f21907a.m();
            }
        } while (iM == this.f21908b);
        this.f21910d = iM;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsd
    public final void z(List list) throws IOException {
        int iM;
        int iM2;
        if (!(list instanceof bpy)) {
            int iB = btm.b(this.f21908b);
            if (iB == 1) {
                do {
                    list.add(Double.valueOf(this.f21907a.b()));
                    if (this.f21907a.C()) {
                        return;
                    } else {
                        iM = this.f21907a.m();
                    }
                } while (iM == this.f21908b);
                this.f21910d = iM;
                return;
            }
            if (iB != 2) {
                throw bqw.a();
            }
            int iN = this.f21907a.n();
            Z(iN);
            int iD = this.f21907a.d() + iN;
            do {
                list.add(Double.valueOf(this.f21907a.b()));
            } while (this.f21907a.d() < iD);
            return;
        }
        bpy bpyVar = (bpy) list;
        int iB2 = btm.b(this.f21908b);
        if (iB2 == 1) {
            do {
                bpyVar.e(this.f21907a.b());
                if (this.f21907a.C()) {
                    return;
                } else {
                    iM2 = this.f21907a.m();
                }
            } while (iM2 == this.f21908b);
            this.f21910d = iM2;
            return;
        }
        if (iB2 != 2) {
            throw bqw.a();
        }
        int iN2 = this.f21907a.n();
        Z(iN2);
        int iD2 = this.f21907a.d() + iN2;
        do {
            bpyVar.e(this.f21907a.b());
        } while (this.f21907a.d() < iD2);
    }
}
