package j$.time.chrono;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
public final class L implements o {
    public static final L BE;
    public static final L BEFORE_BE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ L[] f41993a;

    static {
        L l9 = new L("BEFORE_BE", 0);
        BEFORE_BE = l9;
        L l10 = new L("BE", 1);
        BE = l10;
        f41993a = new L[]{l9, l10};
    }

    public static L valueOf(String str) {
        return (L) Enum.valueOf(L.class, str);
    }

    public static L[] values() {
        return (L[]) f41993a.clone();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC1913i.i(this, rVar);
    }

    @Override // j$.time.chrono.o
    public final int getValue() {
        return ordinal();
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int i(j$.time.temporal.r rVar) {
        return AbstractC1913i.f(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w l(j$.time.temporal.r rVar) {
        return j$.time.temporal.n.d(this, rVar);
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
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
