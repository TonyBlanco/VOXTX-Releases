package m6;

import m6.C2231b;

/* JADX INFO: renamed from: m6.f, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2235f {

    /* JADX INFO: renamed from: m6.f$a */
    public static abstract class a {
        public abstract AbstractC2235f a();

        public abstract a b(b bVar);

        public abstract a c(String str);

        public abstract a d(long j9);
    }

    /* JADX INFO: renamed from: m6.f$b */
    public enum b {
        OK,
        BAD_CONFIG,
        AUTH_ERROR
    }

    public static a a() {
        return new C2231b.C0384b().d(0L);
    }

    public abstract b b();

    public abstract String c();

    public abstract long d();
}
