package Y;

/* JADX INFO: loaded from: classes.dex */
public final class c extends n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f10486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f10487b;

    public c(Object obj, int i9) {
        super(null);
        this.f10486a = obj;
        this.f10487b = i9;
    }

    public final void a() {
        Object obj = this.f10486a;
        if (!((obj != null ? obj.hashCode() : 0) == this.f10487b)) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.".toString());
        }
    }

    public final Object b() {
        return this.f10486a;
    }
}
