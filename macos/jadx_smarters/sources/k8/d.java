package k8;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements Comparable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f43657f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final d f43658g = e.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f43659a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f43660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f43661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f43662e;

    public static final class a {
        public a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }
    }

    public d(int i9, int i10, int i11) {
        this.f43659a = i9;
        this.f43660c = i10;
        this.f43661d = i11;
        this.f43662e = b(i9, i10, i11);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(d other) {
        kotlin.jvm.internal.l.e(other, "other");
        return this.f43662e - other.f43662e;
    }

    public final int b(int i9, int i10, int i11) {
        if (new B8.c(0, 255).l(i9) && new B8.c(0, 255).l(i10) && new B8.c(0, 255).l(i11)) {
            return (i9 << 16) + (i10 << 8) + i11;
        }
        throw new IllegalArgumentException(("Version components are out of range: " + i9 + '.' + i10 + '.' + i11).toString());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        d dVar = obj instanceof d ? (d) obj : null;
        return dVar != null && this.f43662e == dVar.f43662e;
    }

    public int hashCode() {
        return this.f43662e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f43659a);
        sb.append('.');
        sb.append(this.f43660c);
        sb.append('.');
        sb.append(this.f43661d);
        return sb.toString();
    }
}
