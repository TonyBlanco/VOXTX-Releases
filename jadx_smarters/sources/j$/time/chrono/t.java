package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class t implements o {
    public static final t AH;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ t[] f42029a;

    static {
        t tVar = new t("AH", 0);
        AH = tVar;
        f42029a = new t[]{tVar};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f42029a.clone();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC1913i.i(this, rVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return 1;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int i(j$.time.temporal.r rVar) {
        return AbstractC1913i.f(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return rVar == j$.time.temporal.a.ERA ? j$.time.temporal.w.j(1L, 1L) : j$.time.temporal.n.d(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long q(j$.time.temporal.r rVar) {
        return AbstractC1913i.g(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object t(j$.time.temporal.t tVar) {
        return AbstractC1913i.m(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m u(j$.time.temporal.m mVar) {
        return mVar.d(1, j$.time.temporal.a.ERA);
    }
}
