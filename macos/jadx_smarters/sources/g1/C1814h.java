package g1;

/* JADX INFO: renamed from: g1.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1814h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f41225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f41226b;

    /* JADX INFO: renamed from: g1.h$a */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f41227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f41228b;

        public a() {
        }

        public C1814h a() {
            if (!this.f41227a) {
                throw new IllegalArgumentException("Pending purchases for one-time products must be supported.");
            }
            return new C1814h(true, this.f41228b);
        }

        public a b() {
            this.f41227a = true;
            return this;
        }
    }

    public C1814h(boolean z9, boolean z10) {
        this.f41225a = z9;
        this.f41226b = z10;
    }

    public static a c() {
        return new a();
    }

    public boolean a() {
        return this.f41225a;
    }

    public boolean b() {
        return this.f41226b;
    }
}
