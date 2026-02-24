package p4;

/* JADX INFO: renamed from: p4.x, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2448x extends AbstractC2422J {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int[] f46566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C2434i f46567e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2448x(C2434i c2434i, boolean z9, int[] iArr) {
        super(c2434i, true);
        this.f46567e = c2434i;
        this.f46566d = iArr;
    }

    @Override // p4.AbstractC2422J
    public final void c() {
        this.f46567e.f46520c.P(d(), this.f46566d);
    }
}
