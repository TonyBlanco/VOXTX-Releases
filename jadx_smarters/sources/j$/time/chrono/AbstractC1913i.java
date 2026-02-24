package j$.time.chrono;

import j$.time.ZoneOffset;
import j$.util.Objects;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: renamed from: j$.time.chrono.i, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC1913i {
    public static j$.time.temporal.m a(InterfaceC1906b interfaceC1906b, j$.time.temporal.m mVar) {
        return mVar.d(interfaceC1906b.r(), j$.time.temporal.a.EPOCH_DAY);
    }

    public static int b(InterfaceC1906b interfaceC1906b, InterfaceC1906b interfaceC1906b2) {
        int iCompare = Long.compare(interfaceC1906b.r(), interfaceC1906b2.r());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC1905a) interfaceC1906b.a()).getId().compareTo(interfaceC1906b2.a().getId());
    }

    public static int c(InterfaceC1909e interfaceC1909e, InterfaceC1909e interfaceC1909e2) {
        int iCompareTo = interfaceC1909e.c().compareTo(interfaceC1909e2.c());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        int iC = interfaceC1909e.b().compareTo(interfaceC1909e2.b());
        if (iC != 0) {
            return iC;
        }
        return ((AbstractC1905a) interfaceC1909e.a()).getId().compareTo(interfaceC1909e2.a().getId());
    }

    public static int d(InterfaceC1915k interfaceC1915k, InterfaceC1915k interfaceC1915k2) {
        int iCompare = Long.compare(interfaceC1915k.B(), interfaceC1915k2.B());
        if (iCompare != 0) {
            return iCompare;
        }
        int iH = interfaceC1915k.b().H() - interfaceC1915k2.b().H();
        if (iH != 0) {
            return iH;
        }
        int iV = interfaceC1915k.w().compareTo(interfaceC1915k2.w());
        if (iV != 0) {
            return iV;
        }
        int iCompareTo = interfaceC1915k.o().getId().compareTo(interfaceC1915k2.o().getId());
        if (iCompareTo != 0) {
            return iCompareTo;
        }
        return ((AbstractC1905a) interfaceC1915k.a()).getId().compareTo(interfaceC1915k2.a().getId());
    }

    public static int e(InterfaceC1915k interfaceC1915k, j$.time.temporal.r rVar) {
        if (!(rVar instanceof j$.time.temporal.a)) {
            return j$.time.temporal.n.a(interfaceC1915k, rVar);
        }
        int i9 = AbstractC1914j.f42006a[((j$.time.temporal.a) rVar).ordinal()];
        if (i9 != 1) {
            return i9 != 2 ? interfaceC1915k.w().i(rVar) : interfaceC1915k.g().I();
        }
        throw new j$.time.temporal.v("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    public static int f(o oVar, j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.ERA ? oVar.getValue() : j$.time.temporal.n.a(oVar, rVar);
    }

    public static long g(o oVar, j$.time.temporal.r rVar) {
        if (rVar == j$.time.temporal.a.ERA) {
            return oVar.getValue();
        }
        if (rVar instanceof j$.time.temporal.a) {
            throw new j$.time.temporal.v(j$.time.d.a("Unsupported field: ", rVar));
        }
        return rVar.k(oVar);
    }

    public static boolean h(InterfaceC1906b interfaceC1906b, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? ((j$.time.temporal.a) rVar).u() : rVar != null && rVar.l(interfaceC1906b);
    }

    public static boolean i(o oVar, j$.time.temporal.r rVar) {
        return rVar instanceof j$.time.temporal.a ? rVar == j$.time.temporal.a.ERA : rVar != null && rVar.l(oVar);
    }

    public static Object j(InterfaceC1906b interfaceC1906b, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h() || tVar == j$.time.temporal.n.g()) {
            return null;
        }
        return tVar == j$.time.temporal.n.e() ? interfaceC1906b.a() : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.DAYS : tVar.a(interfaceC1906b);
    }

    public static Object k(InterfaceC1909e interfaceC1909e, j$.time.temporal.t tVar) {
        if (tVar == j$.time.temporal.n.k() || tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.h()) {
            return null;
        }
        return tVar == j$.time.temporal.n.g() ? interfaceC1909e.b() : tVar == j$.time.temporal.n.e() ? interfaceC1909e.a() : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(interfaceC1909e);
    }

    public static Object l(InterfaceC1915k interfaceC1915k, j$.time.temporal.t tVar) {
        return (tVar == j$.time.temporal.n.j() || tVar == j$.time.temporal.n.k()) ? interfaceC1915k.o() : tVar == j$.time.temporal.n.h() ? interfaceC1915k.g() : tVar == j$.time.temporal.n.g() ? interfaceC1915k.b() : tVar == j$.time.temporal.n.e() ? interfaceC1915k.a() : tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.NANOS : tVar.a(interfaceC1915k);
    }

    public static Object m(o oVar, j$.time.temporal.t tVar) {
        return tVar == j$.time.temporal.n.i() ? j$.time.temporal.b.ERAS : j$.time.temporal.n.c(oVar, tVar);
    }

    public static long n(InterfaceC1909e interfaceC1909e, ZoneOffset zoneOffset) {
        Objects.a(zoneOffset, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        return ((interfaceC1909e.c().r() * 86400) + ((long) interfaceC1909e.b().T())) - ((long) zoneOffset.I());
    }

    public static long o(InterfaceC1915k interfaceC1915k) {
        return ((interfaceC1915k.c().r() * 86400) + ((long) interfaceC1915k.b().T())) - ((long) interfaceC1915k.g().I());
    }

    public static n p(j$.time.temporal.o oVar) {
        Objects.a(oVar, "temporal");
        n nVar = (n) oVar.t(j$.time.temporal.n.e());
        u uVar = u.f42030d;
        if (nVar != null) {
            return nVar;
        }
        Objects.a(uVar, "defaultObj");
        return uVar;
    }
}
