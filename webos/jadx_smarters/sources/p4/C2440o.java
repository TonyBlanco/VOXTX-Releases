package p4;

/* JADX INFO: renamed from: p4.o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2440o extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long[] f46539d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2434i f46540e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2440o(C2434i c2434i, long[] jArr) {
        super(c2434i, false);
        this.f46540e = c2434i;
        this.f46539d = jArr;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46540e.f46520c.l(d(), this.f46539d);
    }
}
