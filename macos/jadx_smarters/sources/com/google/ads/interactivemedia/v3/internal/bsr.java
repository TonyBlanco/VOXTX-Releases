package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.WebSocketProtocol;
import org.apache.http.util.LangUtils;
import org.chromium.net.UrlRequest;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bsr {
    public bsr() {
    }

    public bsr(byte[] bArr) {
        this();
    }

    public static final Object a(Object obj) {
        return ((bqn) obj).aA();
    }

    public static final Map b(Object obj) {
        return (brn) obj;
    }

    public static final brm c(Object obj) {
        throw null;
    }

    public static final Map d(Object obj) {
        return (brn) obj;
    }

    public static final int e(Object obj, Object obj2) {
        brn brnVar = (brn) obj;
        if (brnVar.isEmpty()) {
            return 0;
        }
        Iterator it = brnVar.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    public static final boolean f(Object obj) {
        return !((brn) obj).e();
    }

    public static final Object g(Object obj, Object obj2) {
        brn brnVarB = (brn) obj;
        brn brnVar = (brn) obj2;
        if (!brnVar.isEmpty()) {
            if (!brnVarB.e()) {
                brnVarB = brnVarB.b();
            }
            brnVarB.d(brnVar);
        }
        return brnVarB;
    }

    public static final Object h() {
        return brn.a().b();
    }

    public static final void i(Object obj) {
        ((brn) obj).c();
    }

    public static int j(brm brmVar, Object obj, Object obj2) {
        btk btkVar = brmVar.f22163a;
        return bqe.a(null, 1, obj) + bqe.a(null, 2, obj2);
    }

    public static void k(bpk bpkVar, brm brmVar, Object obj, Object obj2) throws IOException {
        btk btkVar = brmVar.f22163a;
        bqe.o(bpkVar, 1, obj);
        bqe.o(bpkVar, 2, obj2);
    }

    public static int m(Map.Entry entry) {
        return ((bqm) entry.getKey()).f22105b;
    }

    public static Object n(bqb bqbVar, brs brsVar, int i9) {
        return bqbVar.c(brsVar, i9);
    }

    public static bqe o(Object obj) {
        return ((bql) obj).f22103a;
    }

    public static bqe p(Object obj) {
        return ((bql) obj).f();
    }

    public static boolean q(brs brsVar) {
        return brsVar instanceof bql;
    }

    public static void r(bsd bsdVar, Object obj, bqb bqbVar, bqe bqeVar) throws IOException {
        bpz bpzVar = (bpz) obj;
        bqeVar.k(bpzVar.f22020b, bsdVar.s(bpzVar.f22019a.getClass(), bqbVar));
    }

    public static void s(bpb bpbVar, Object obj, bqb bqbVar, bqe bqeVar) throws IOException {
        bpz bpzVar = (bpz) obj;
        brr brrVarBp = bpzVar.f22019a.bp();
        bpg bpgVarL = bpbVar.l();
        brrVarBp.aT(bpgVarL, bqbVar);
        bqeVar.k(bpzVar.f22020b, brrVarBp.aZ());
        bpgVarL.z(0);
    }

    public static void t(btn btnVar, Map.Entry entry) throws IOException {
        bqm bqmVar = (bqm) entry.getKey();
        if (!bqmVar.f22107d) {
            btk btkVar = btk.f22265a;
            switch (bqmVar.f22106c.ordinal()) {
                case 0:
                    btnVar.f(bqmVar.f22105b, ((Double) entry.getValue()).doubleValue());
                    break;
                case 1:
                    btnVar.o(bqmVar.f22105b, ((Float) entry.getValue()).floatValue());
                    break;
                case 2:
                    btnVar.t(bqmVar.f22105b, ((Long) entry.getValue()).longValue());
                    break;
                case 3:
                    btnVar.L(bqmVar.f22105b, ((Long) entry.getValue()).longValue());
                    break;
                case 4:
                    btnVar.r(bqmVar.f22105b, ((Integer) entry.getValue()).intValue());
                    break;
                case 5:
                    btnVar.m(bqmVar.f22105b, ((Long) entry.getValue()).longValue());
                    break;
                case 6:
                    btnVar.k(bqmVar.f22105b, ((Integer) entry.getValue()).intValue());
                    break;
                case 7:
                    btnVar.b(bqmVar.f22105b, ((Boolean) entry.getValue()).booleanValue());
                    break;
                case 8:
                    btnVar.H(bqmVar.f22105b, (String) entry.getValue());
                    break;
                case 9:
                    btnVar.q(bqmVar.f22105b, entry.getValue(), bsa.a().b(entry.getValue().getClass()));
                    break;
                case 10:
                    btnVar.w(bqmVar.f22105b, entry.getValue(), bsa.a().b(entry.getValue().getClass()));
                    break;
                case 11:
                    btnVar.d(bqmVar.f22105b, (bpb) entry.getValue());
                    break;
                case 12:
                    btnVar.J(bqmVar.f22105b, ((Integer) entry.getValue()).intValue());
                    break;
                case 13:
                    btnVar.r(bqmVar.f22105b, ((Integer) entry.getValue()).intValue());
                    break;
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    btnVar.y(bqmVar.f22105b, ((Integer) entry.getValue()).intValue());
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    btnVar.A(bqmVar.f22105b, ((Long) entry.getValue()).longValue());
                    break;
                case 16:
                    btnVar.C(bqmVar.f22105b, ((Integer) entry.getValue()).intValue());
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    btnVar.E(bqmVar.f22105b, ((Long) entry.getValue()).longValue());
                    break;
            }
        }
        btk btkVar2 = btk.f22265a;
        switch (bqmVar.f22106c.ordinal()) {
            case 0:
                bsk.s(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 1:
                bsk.w(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 2:
                bsk.z(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 3:
                bsk.H(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 4:
                bsk.y(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 5:
                bsk.v(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 6:
                bsk.u(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 7:
                bsk.q(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 8:
                bsk.F(bqmVar.f22105b, (List) entry.getValue(), btnVar);
                break;
            case 9:
                List list = (List) entry.getValue();
                if (list != null && !list.isEmpty()) {
                    bsk.x(bqmVar.f22105b, (List) entry.getValue(), btnVar, bsa.a().b(list.get(0).getClass()));
                    break;
                }
                break;
            case 10:
                List list2 = (List) entry.getValue();
                if (list2 != null && !list2.isEmpty()) {
                    bsk.A(bqmVar.f22105b, (List) entry.getValue(), btnVar, bsa.a().b(list2.get(0).getClass()));
                    break;
                }
                break;
            case 11:
                bsk.r(bqmVar.f22105b, (List) entry.getValue(), btnVar);
                break;
            case 12:
                bsk.G(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 13:
                bsk.y(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case UrlRequest.Status.READING_RESPONSE /* 14 */:
                bsk.B(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                bsk.C(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case 16:
                bsk.D(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
            case LangUtils.HASH_SEED /* 17 */:
                bsk.E(bqmVar.f22105b, (List) entry.getValue(), btnVar, false);
                break;
        }
    }

    public static Object u(Object obj, bsd bsdVar, Object obj2, bqb bqbVar, bqe bqeVar, Object obj3, bto btoVar) throws IOException {
        Object objValueOf;
        long jL;
        int iG;
        Object objF;
        bpz bpzVar = (bpz) obj2;
        int i9 = bpzVar.f22020b.f22105b;
        if (bpzVar.a() != btk.f22278n) {
            switch (bpzVar.a().ordinal()) {
                case 0:
                    objValueOf = Double.valueOf(bsdVar.a());
                    break;
                case 1:
                    objValueOf = Float.valueOf(bsdVar.b());
                    break;
                case 2:
                    jL = bsdVar.l();
                    objValueOf = Long.valueOf(jL);
                    break;
                case 3:
                    jL = bsdVar.o();
                    objValueOf = Long.valueOf(jL);
                    break;
                case 4:
                    iG = bsdVar.g();
                    objValueOf = Integer.valueOf(iG);
                    break;
                case 5:
                    jL = bsdVar.k();
                    objValueOf = Long.valueOf(jL);
                    break;
                case 6:
                    iG = bsdVar.f();
                    objValueOf = Integer.valueOf(iG);
                    break;
                case 7:
                    objValueOf = Boolean.valueOf(bsdVar.P());
                    break;
                case 8:
                    objValueOf = bsdVar.t();
                    break;
                case 9:
                    if (!bpzVar.b()) {
                        Object objF2 = bqeVar.f(bpzVar.f22020b);
                        if (objF2 instanceof bqn) {
                            bsi bsiVarC = bsa.a().c(objF2);
                            if (!((bqn) objF2).aO()) {
                                Object objE = bsiVarC.e();
                                bsiVarC.g(objE, objF2);
                                bqeVar.k(bpzVar.f22020b, objE);
                                objF2 = objE;
                            }
                            bsdVar.v(objF2, bsiVarC, bqbVar);
                            return obj3;
                        }
                    }
                    objValueOf = bsdVar.r(bpzVar.f22019a.getClass(), bqbVar);
                    break;
                case 10:
                    if (!bpzVar.b()) {
                        Object objF3 = bqeVar.f(bpzVar.f22020b);
                        if (objF3 instanceof bqn) {
                            bsi bsiVarC2 = bsa.a().c(objF3);
                            if (!((bqn) objF3).aO()) {
                                Object objE2 = bsiVarC2.e();
                                bsiVarC2.g(objE2, objF3);
                                bqeVar.k(bpzVar.f22020b, objE2);
                                objF3 = objE2;
                            }
                            bsdVar.w(objF3, bsiVarC2, bqbVar);
                            return obj3;
                        }
                    }
                    objValueOf = bsdVar.s(bpzVar.f22019a.getClass(), bqbVar);
                    break;
                case 11:
                    objValueOf = bsdVar.p();
                    break;
                case 12:
                    iG = bsdVar.j();
                    objValueOf = Integer.valueOf(iG);
                    break;
                case 13:
                    throw new IllegalStateException("Shouldn't reach here.");
                case UrlRequest.Status.READING_RESPONSE /* 14 */:
                    iG = bsdVar.h();
                    objValueOf = Integer.valueOf(iG);
                    break;
                case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                    jL = bsdVar.m();
                    objValueOf = Long.valueOf(jL);
                    break;
                case 16:
                    iG = bsdVar.i();
                    objValueOf = Integer.valueOf(iG);
                    break;
                case LangUtils.HASH_SEED /* 17 */:
                    jL = bsdVar.n();
                    objValueOf = Long.valueOf(jL);
                    break;
                default:
                    objValueOf = null;
                    break;
            }
        } else {
            int iG2 = bsdVar.g();
            if (bpzVar.f22020b.f22104a.a(iG2) == null) {
                return bsk.X(obj, i9, iG2, obj3, btoVar);
            }
            objValueOf = Integer.valueOf(iG2);
        }
        if (bpzVar.b()) {
            bqeVar.h(bpzVar.f22020b, objValueOf);
        } else {
            int iOrdinal = bpzVar.a().ordinal();
            if ((iOrdinal == 9 || iOrdinal == 10) && (objF = bqeVar.f(bpzVar.f22020b)) != null) {
                objValueOf = bqu.e(objF, objValueOf);
            }
            bqeVar.k(bpzVar.f22020b, objValueOf);
        }
        return obj3;
    }

    public final void l(Object obj) {
        o(obj).i();
    }
}
