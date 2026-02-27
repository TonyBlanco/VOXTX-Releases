package V5;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f10069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f10070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f10071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f10072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f10073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f10074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f10075g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f10076h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f10077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f10078b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f10079c;

        public a(boolean z9, boolean z10, boolean z11) {
            this.f10077a = z9;
            this.f10078b = z10;
            this.f10079c = z11;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f10081b;

        public b(int i9, int i10) {
            this.f10080a = i9;
            this.f10081b = i10;
        }
    }

    public d(long j9, b bVar, a aVar, int i9, int i10, double d9, double d10, int i11) {
        this.f10071c = j9;
        this.f10069a = bVar;
        this.f10070b = aVar;
        this.f10072d = i9;
        this.f10073e = i10;
        this.f10074f = d9;
        this.f10075g = d10;
        this.f10076h = i11;
    }

    public boolean a(long j9) {
        return this.f10071c < j9;
    }
}
