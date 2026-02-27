package G8;

/* JADX INFO: renamed from: G8.g0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0572g0 implements InterfaceC0595s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2334a;

    public C0572g0(boolean z9) {
        this.f2334a = z9;
    }

    @Override // G8.InterfaceC0595s0
    public J0 c() {
        return null;
    }

    @Override // G8.InterfaceC0595s0
    public boolean isActive() {
        return this.f2334a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empty{");
        sb.append(isActive() ? "Active" : "New");
        sb.append('}');
        return sb.toString();
    }
}
