package s4;

/* JADX INFO: renamed from: s4.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2711c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f49943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f49944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f49945c;

    public C2711c(int i9, int i10, boolean z9) {
        this.f49943a = i9;
        this.f49944b = i10;
        this.f49945c = z9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2711c) && this.f49943a == ((C2711c) obj).f49943a;
    }

    public final int hashCode() {
        return Integer.valueOf(this.f49943a).hashCode();
    }
}
