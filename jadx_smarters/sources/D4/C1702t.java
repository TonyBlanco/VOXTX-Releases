package d4;

/* JADX INFO: renamed from: d4.t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1702t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f39808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f39809b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f39810c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f39811d;

    /* JADX INFO: renamed from: d4.t$b */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f39812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f39813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f39814c = 1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f39815d;

        public b(int i9, int i10) {
            this.f39812a = i9;
            this.f39813b = i10;
        }

        public C1702t a() {
            return new C1702t(this.f39812a, this.f39813b, this.f39814c, this.f39815d);
        }

        public b b(float f9) {
            this.f39814c = f9;
            return this;
        }
    }

    public C1702t(int i9, int i10, float f9, long j9) {
        AbstractC1684a.b(i9 > 0, "width must be positive, but is: " + i9);
        AbstractC1684a.b(i10 > 0, "height must be positive, but is: " + i10);
        this.f39808a = i9;
        this.f39809b = i10;
        this.f39810c = f9;
        this.f39811d = j9;
    }
}
