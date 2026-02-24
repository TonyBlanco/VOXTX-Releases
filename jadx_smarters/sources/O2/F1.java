package O2;

/* JADX INFO: loaded from: classes3.dex */
public final class F1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final F1 f5515b = new F1(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f5516a;

    public F1(boolean z9) {
        this.f5516a = z9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && F1.class == obj.getClass() && this.f5516a == ((F1) obj).f5516a;
    }

    public int hashCode() {
        return !this.f5516a ? 1 : 0;
    }
}
