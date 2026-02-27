package E3;

import D3.m;
import F3.j;
import O2.C0936z0;
import b4.C1227s;
import b4.InterfaceC1224o;
import d4.AbstractC1684a;
import j3.C2093e;
import l3.C2182g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g {
    public static C1227s a(j jVar, String str, F3.i iVar, int i9) {
        return new C1227s.b().i(iVar.b(str)).h(iVar.f1978a).g(iVar.f1979b).f(g(jVar, iVar)).b(i9).a();
    }

    public static com.google.android.exoplayer2.extractor.b b(InterfaceC1224o interfaceC1224o, int i9, j jVar) {
        return c(interfaceC1224o, i9, jVar, 0);
    }

    public static com.google.android.exoplayer2.extractor.b c(InterfaceC1224o interfaceC1224o, int i9, j jVar, int i10) {
        if (jVar.n() == null) {
            return null;
        }
        D3.g gVarF = f(i9, jVar.f1983b);
        try {
            d(gVarF, interfaceC1224o, jVar, i10, true);
            gVarF.release();
            return gVarF.b();
        } catch (Throwable th) {
            gVarF.release();
            throw th;
        }
    }

    public static void d(D3.g gVar, InterfaceC1224o interfaceC1224o, j jVar, int i9, boolean z9) {
        F3.i iVar = (F3.i) AbstractC1684a.e(jVar.n());
        if (z9) {
            F3.i iVarM = jVar.m();
            if (iVarM == null) {
                return;
            }
            F3.i iVarA = iVar.a(iVarM, ((F3.b) jVar.f1984c.get(i9)).f1929a);
            if (iVarA == null) {
                e(interfaceC1224o, jVar, i9, gVar, iVar);
                iVar = iVarM;
            } else {
                iVar = iVarA;
            }
        }
        e(interfaceC1224o, jVar, i9, gVar, iVar);
    }

    public static void e(InterfaceC1224o interfaceC1224o, j jVar, int i9, D3.g gVar, F3.i iVar) {
        new m(interfaceC1224o, a(jVar, ((F3.b) jVar.f1984c.get(i9)).f1929a, iVar, 0), jVar.f1983b, 0, null, gVar).a();
    }

    public static D3.g f(int i9, C0936z0 c0936z0) {
        String str = c0936z0.f6466l;
        return new D3.e((str == null || !(str.startsWith("video/webm") || str.startsWith("audio/webm"))) ? new C2182g() : new C2093e(), i9, c0936z0);
    }

    public static String g(j jVar, F3.i iVar) {
        String strA = jVar.a();
        return strA != null ? strA : iVar.b(((F3.b) jVar.f1984c.get(0)).f1929a).toString();
    }
}
