package j$.util.stream;

import j$.util.Optional;

/* JADX INFO: loaded from: classes2.dex */
final class K extends L {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final G f42459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final G f42460d;

    static {
        EnumC1964f3 enumC1964f3 = EnumC1964f3.REFERENCE;
        f42459c = new G(true, enumC1964f3, Optional.a(), new C2024s(4), new C2015q(7));
        f42460d = new G(false, enumC1964f3, Optional.a(), new C2024s(4), new C2015q(7));
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        if (this.f42464a) {
            return Optional.d(this.f42465b);
        }
        return null;
    }
}
