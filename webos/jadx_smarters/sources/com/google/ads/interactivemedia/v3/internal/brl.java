package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
final class brl implements bsj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final brq f22161a = new brj(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final brq f22162b;

    public brl() {
        brq brqVar;
        brj brjVarC = brj.c();
        try {
            brqVar = (brq) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            brqVar = f22161a;
        }
        brk brkVar = new brk(brjVarC, brqVar);
        bqu.j(brkVar, "messageInfoFactory");
        this.f22162b = brkVar;
    }

    private static boolean b(brp brpVar) {
        return brpVar.c() == 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.bsj
    public final bsi a(Class cls) {
        bsr bsrVarA;
        brh brhVarE;
        bto btoVarU;
        bsr bsrVarA2;
        bsr bsrVarA3;
        bto btoVarT;
        bsr bsrVarA4;
        bsk.p(cls);
        brp brpVarA = this.f22162b.a(cls);
        boolean zB = brpVarA.b();
        boolean zIsAssignableFrom = bqn.class.isAssignableFrom(cls);
        if (zB) {
            if (zIsAssignableFrom) {
                btoVarT = bsk.V();
                bsrVarA4 = bqc.b();
            } else {
                btoVarT = bsk.T();
                bsrVarA4 = bqc.a();
            }
            return brw.c(btoVarT, bsrVarA4, brpVarA.a());
        }
        if (zIsAssignableFrom) {
            boolean zB2 = b(brpVarA);
            bsrVarA = bry.b();
            brhVarE = brh.f();
            btoVarU = bsk.V();
            bsrVarA2 = zB2 ? bqc.b() : null;
            bsrVarA3 = bro.b();
        } else {
            boolean zB3 = b(brpVarA);
            bsrVarA = bry.a();
            brhVarE = brh.e();
            if (zB3) {
                btoVarU = bsk.T();
                bsrVarA2 = bqc.a();
            } else {
                btoVarU = bsk.U();
                bsrVarA2 = null;
            }
            bsrVarA3 = bro.a();
        }
        return brv.n(brpVarA, bsrVarA, brhVarE, btoVarU, bsrVarA2, bsrVarA3);
    }
}
