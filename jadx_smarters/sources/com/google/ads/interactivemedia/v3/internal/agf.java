package com.google.ads.interactivemedia.v3.internal;

/* JADX INFO: loaded from: classes3.dex */
public final class agf extends bqn implements brt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final agf f19656a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19657d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bpb f19658e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private bpb f19659f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private bpb f19660g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private bpb f19661h;

    static {
        agf agfVar = new agf();
        f19656a = agfVar;
        bqn.aL(agf.class, agfVar);
    }

    private agf() {
        bpb bpbVar = bpb.f21870b;
        this.f19658e = bpbVar;
        this.f19659f = bpbVar;
        this.f19660g = bpbVar;
        this.f19661h = bpbVar;
    }

    public static agf b(byte[] bArr, bqb bqbVar) throws bqw {
        return (agf) bqn.aD(f19656a, bArr, bqbVar);
    }

    public static /* synthetic */ void g(agf agfVar, bpb bpbVar) {
        agfVar.f19657d |= 1;
        agfVar.f19658e = bpbVar;
    }

    public static /* synthetic */ void h(agf agfVar, bpb bpbVar) {
        agfVar.f19657d |= 2;
        agfVar.f19659f = bpbVar;
    }

    public static /* synthetic */ void j(agf agfVar, bpb bpbVar) {
        agfVar.f19657d |= 4;
        agfVar.f19660g = bpbVar;
    }

    public static /* synthetic */ void k(agf agfVar, bpb bpbVar) {
        agfVar.f19657d |= 8;
        agfVar.f19661h = bpbVar;
    }

    public static agl l() {
        return (agl) f19656a.ay();
    }

    public final bpb c() {
        return this.f19658e;
    }

    public final bpb d() {
        return this.f19659f;
    }

    public final bpb e() {
        return this.f19661h;
    }

    public final bpb f() {
        return this.f19660g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.ads.interactivemedia.v3.internal.bqn
    public final Object i(int i9, Object obj) {
        int i10 = i9 - 1;
        if (i10 == 0) {
            return (byte) 1;
        }
        if (i10 == 2) {
            return bqn.aI(f19656a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ည\u0002\u0004ည\u0003", new Object[]{"d", "e", "f", "g", "h"});
        }
        if (i10 == 3) {
            return new agf();
        }
        byte[] bArr = null;
        if (i10 == 4) {
            return new agl(bArr, (char[]) (null == true ? 1 : 0));
        }
        if (i10 != 5) {
            return null;
        }
        return f19656a;
    }
}
