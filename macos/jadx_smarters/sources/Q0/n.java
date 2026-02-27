package Q0;

/* JADX INFO: loaded from: classes.dex */
public interface n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b.c f7464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b.C0085b f7465b;

    public static abstract class b {

        public static final class a extends b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Throwable f7466a;

            public a(Throwable th) {
                this.f7466a = th;
            }

            public Throwable a() {
                return this.f7466a;
            }

            public String toString() {
                return String.format("FAILURE (%s)", this.f7466a.getMessage());
            }
        }

        /* JADX INFO: renamed from: Q0.n$b$b, reason: collision with other inner class name */
        public static final class C0085b extends b {
            public C0085b() {
            }

            public String toString() {
                return "IN_PROGRESS";
            }
        }

        public static final class c extends b {
            public c() {
            }

            public String toString() {
                return "SUCCESS";
            }
        }
    }

    static {
        f7464a = new b.c();
        f7465b = new b.C0085b();
    }
}
