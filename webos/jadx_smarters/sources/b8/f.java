package B8;

/* JADX INFO: loaded from: classes4.dex */
public final class f extends d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f774f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final f f775g = new f(1, 0);

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public f(long j9, long j10) {
        super(j9, j10, 1L);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            if (!isEmpty() || !((f) obj).isEmpty()) {
                f fVar = (f) obj;
                if (d() != fVar.d() || f() != fVar.f()) {
                }
            }
            return true;
        }
        return false;
    }

    public boolean h(long j9) {
        return d() <= j9 && j9 <= f();
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (int) ((((long) 31) * (d() ^ (d() >>> 32))) + (f() ^ (f() >>> 32)));
    }

    public boolean isEmpty() {
        return d() > f();
    }

    public String toString() {
        return d() + ".." + f();
    }
}
