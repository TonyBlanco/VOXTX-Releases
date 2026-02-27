package t4;

/* JADX INFO: renamed from: t4.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2787n implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ v f50728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2791s f50729b;

    public C2787n(C2791s c2791s, v vVar) {
        this.f50729b = c2791s;
        this.f50728a = vVar;
    }

    @Override // t4.v
    public final void a(long j9) {
        v vVar = this.f50728a;
        if (vVar != null) {
            vVar.a(j9);
        }
    }

    @Override // t4.v
    public final void b(long j9, int i9, Object obj) {
        this.f50729b.f50739g = null;
        v vVar = this.f50728a;
        if (vVar != null) {
            vVar.b(j9, i9, obj);
        }
    }
}
