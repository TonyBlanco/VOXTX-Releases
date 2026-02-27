package m6;

import m6.C2230a;

/* JADX INFO: renamed from: m6.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2233d {

    /* JADX INFO: renamed from: m6.d$a */
    public static abstract class a {
        public abstract AbstractC2233d a();

        public abstract a b(AbstractC2235f abstractC2235f);

        public abstract a c(String str);

        public abstract a d(String str);

        public abstract a e(b bVar);

        public abstract a f(String str);
    }

    /* JADX INFO: renamed from: m6.d$b */
    public enum b {
        OK,
        BAD_CONFIG
    }

    public static a a() {
        return new C2230a.b();
    }

    public abstract AbstractC2235f b();

    public abstract String c();

    public abstract String d();

    public abstract b e();

    public abstract String f();
}
